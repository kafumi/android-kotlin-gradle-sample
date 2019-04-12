plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(Versions.compileSdk)
    defaultConfig {
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            consumerProguardFile(file("proguard-rules.pro"))
        }
    }
    dataBinding {
        isEnabled = true
    }
    libraryVariants.all {
        generateBuildConfigProvider?.configure {
            isEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

kotlin {
    sourceSets.all {
        languageSettings.progressiveMode = true
    }
}

dependencies {
    implementation(project(":data"))
    implementation(project(":model"))

    // Kotlin
    implementation(Deps.Kotlin.stdlibJdk)

    // AndroidX
    implementation(Deps.AndroidX.appCompat)
    implementation(Deps.AndroidX.constraintLayout)
    implementation(Deps.AndroidX.lifecycle)

    // Debug utilities
    implementation(Deps.Debug.timber)
}
