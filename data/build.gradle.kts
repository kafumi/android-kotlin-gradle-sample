plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(28)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            consumerProguardFile(file("proguard-rules.pro"))
        }
    }
}

dependencies {
    implementation(project(":model"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.21")
    implementation("androidx.core:core-ktx:1.0.1")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.1")
}
