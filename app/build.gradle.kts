plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(Versions.compileSdk)
    defaultConfig {
        applicationId = "dev.kafumi.myapplication"
        minSdkVersion(Versions.minSdk)
        targetSdkVersion(Versions.targetSdk)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    dataBinding {
        isEnabled = true
    }
}

kotlin {
    sourceSets.all {
        languageSettings.progressiveMode = true
    }
}

dependencies {
    implementation(project(":featureA"))

    // Kotlin
    implementation(Deps.Kotlin.stdlibJdk)

    // Debug utilities
    implementation(Deps.Debug.timber)
}
