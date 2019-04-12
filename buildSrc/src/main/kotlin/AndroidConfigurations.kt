import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.KotlinBuildScript

fun KotlinBuildScript.applyAndroidApp() {
    android {
        compileSdkVersion(Versions.compileSdk)
        buildToolsVersion(Versions.buildTools)
        defaultConfig {
            minSdkVersion(Versions.minSdk)
            targetSdkVersion(Versions.targetSdk)
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
}

fun KotlinBuildScript.applyAndroidLibrary() {
    androidLibrary {
        compileSdkVersion(Versions.compileSdk)
        buildToolsVersion(Versions.buildTools)
        defaultConfig {
            minSdkVersion(Versions.minSdk)
            targetSdkVersion(Versions.targetSdk)
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
        buildTypes {
            getByName("release") {
                isMinifyEnabled = false
                consumerProguardFile(file("proguard-rules.pro"))
            }
        }
        libraryVariants.all {
            generateBuildConfigProvider?.configure {
                isEnabled = false
            }
        }
    }

    kotlin {
        sourceSets.all {
            languageSettings.progressiveMode = true
        }
    }
}
