plugins {
    `android-library`
}

dependencies {
    implementation(project(":model"))

    // Kotlin
    implementation(Deps.Kotlin.stdlibJdk)

    // Debug utilities
    implementation(Deps.Debug.timber)
}
