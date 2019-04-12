plugins {
    id("com.android.library")
    id("kotlin-android")
}

applyAndroidLibrary()

dependencies {
    implementation(project(":model"))

    // Kotlin
    implementation(Deps.Kotlin.stdlibJdk)

    // Debug utilities
    implementation(Deps.Debug.timber)
}
