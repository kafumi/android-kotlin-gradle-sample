import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.KotlinBuildScript

fun KotlinBuildScript.applyAndroidApp() {
    android {
        applyAndroidBase()
    }

    enableKotlinProgressiveMode()
}

fun KotlinBuildScript.applyAndroidLibrary() {
    androidLibrary {
        applyAndroidBase()
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

    enableKotlinProgressiveMode()
}

private fun BaseExtension.applyAndroidBase() {
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

private fun KotlinBuildScript.enableKotlinProgressiveMode() {
    kotlin {
        sourceSets.all {
            languageSettings.progressiveMode = true
        }
    }
}
