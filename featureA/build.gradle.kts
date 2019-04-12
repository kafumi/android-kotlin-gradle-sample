plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(28)
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
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.21")

    // AndroidX
    implementation("androidx.appcompat:appcompat:1.0.2")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("androidx.lifecycle:lifecycle-extensions:2.0.0")

    // Debug utilities
    implementation("com.jakewharton.timber:timber:4.7.1")
}
