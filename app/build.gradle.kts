plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "dev.kafumi.myapplication"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.21")

    // Debug utilities
    implementation("com.jakewharton.timber:timber:4.7.1")

    // Test
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.1")
}
