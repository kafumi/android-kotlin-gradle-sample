plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

applyAndroidLibrary()

android {
    dataBinding {
        isEnabled = true
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
