object Versions {
    // Android SDK
    const val compileSdk = 28
    const val buildTools = "28.0.3"
    const val minSdk = 21
    const val targetSdk = 28
    const val androidGradle = "3.4.0-rc03" // Need to be synchronized with `buildSrc/build.gradle.kts`

    // Kotlin
    const val kotlin = "1.3.21" // Need to be synchronized with `buildSrc/build.gradle.kts`

    // Google libraries
    const val appCompat = "1.0.2"
    const val constraintLayout = "1.1.3"
    const val lifecycle = "2.0.0"

    // 3rd-party libraries
    const val timber = "4.7.1"
}

@Suppress("Reformat")
object Deps {
    object GradlePlugin {
        val android = "com.android.tools.build:gradle:${Versions.androidGradle}"
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }

    object Kotlin {
        const val stdlibJdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    }

    object Debug {
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    }
}
