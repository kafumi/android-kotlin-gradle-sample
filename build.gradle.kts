buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Deps.GradlePlugin.android)
        classpath(Deps.GradlePlugin.kotlin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
