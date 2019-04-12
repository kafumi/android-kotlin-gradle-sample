plugins {
    `android-application`
}

android {
    defaultConfig {
        applicationId = "dev.kafumi.myapplication"
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    dataBinding {
        isEnabled = true
    }
}

dependencies {
    implementation(project(":featureA"))

    // Kotlin
    implementation(Deps.Kotlin.stdlibJdk)

    // Debug utilities
    implementation(Deps.Debug.timber)
}
