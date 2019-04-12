import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

internal fun Project.`android`(configure: BaseAppModuleExtension.() -> Unit): Unit =
    (this as ExtensionAware).extensions.configure("android", configure)

internal fun Project.`androidLibrary`(configure: LibraryExtension.() -> Unit): Unit =
    (this as ExtensionAware).extensions.configure("android", configure)

internal fun Project.`kotlin`(configure: KotlinProjectExtension.() -> Unit): Unit =
    (this as ExtensionAware).extensions.configure("kotlin", configure)
