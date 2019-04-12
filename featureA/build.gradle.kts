plugins {
    `android-library`
    id("kotlin-kapt")
}

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
