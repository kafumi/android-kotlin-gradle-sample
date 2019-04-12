plugins {
    id("com.android.library")
    id("kotlin-android")
}

applyAndroidLibrary()

dependencies {
    // Kotlin
    implementation(Deps.Kotlin.stdlibJdk)
}
