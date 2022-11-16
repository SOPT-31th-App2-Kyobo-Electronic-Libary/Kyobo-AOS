buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}")
        classpath("org.jlleitschuh.gradle:ktlint-gradle:${Versions.KT_LINT}")
    }
}

plugins {
    id(Plugins.ANDROID_APPLICATION) version Versions.AGP apply false
    id(Plugins.ANDROID_LIBRARY) version Versions.AGP apply false
    id(Plugins.KOTLIN_ANDROID) version Versions.KOTLIN apply false
    id(Plugins.KOTLIN_JVM) version Versions.KOTLIN apply false
    id(Plugins.KOTLIN_SERIALIZATION) version Versions.KOTLIN apply false
    id(Plugins.SECRETS_GRADLE_PLUGIN) version Versions.SECRETS_GRADLE apply false
    id(Plugins.SAFEARGS) version Versions.NAVIGATION apply false
}

apply(plugin = "org.jlleitschuh.gradle.ktlint")

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
