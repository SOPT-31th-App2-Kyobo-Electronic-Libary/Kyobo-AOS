import org.jetbrains.kotlin.konan.properties.Properties

plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KAPT)
    id(Plugins.SECRETS_GRADLE_PLUGIN)
    id(Plugins.SAFEARGS)
    id(Plugins.PARCELIZE)
    id(Plugins.HILT_PLUGIN)
    id(Plugins.KOTLIN_SERIALIZATION)
}

val properties = Properties()
properties.load(project.rootProject.file("local.properties").inputStream())

android {
    compileSdk = AppConfig.compileSdkVersion

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = AppConfig.minSdkVersion
        targetSdk = AppConfig.targetSdkVersion
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        buildConfigField(
            "String",
            "BASE_URL",
            properties.getProperty("BASE_URL")
        )
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    Deps.AndroidX.run {
        implementation("androidx.legacy:legacy-support-v4:1.0.0")
        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.0")
        implementation(saveState)
        implementation(activityKTX)
        implementation(fragmentKTX)
        implementation(lifecycleKTX)
        implementation(recyclerview)
        implementation(material)
        implementation(core)
        implementation(constraintLayout)
        implementation(appcompat)
        implementation(security)
        implementation(paging)
        implementation(pagingWithoutAndroid)
        implementation(dataStore)
    }
    Deps.AndroidX.Navigation.run {
        implementation(navigation)
        implementation(navigationFragment)
    }
    Deps.AndroidX.Room.run {
        implementation(ROOM_KTX)
        implementation(ROOM_RUNTIME)
        annotationProcessor(ROOM_COMPILER_KAPT)
        kapt(ROOM_COMPILER_KAPT)
        kapt(ROOM_PAGING)
    }
    Deps.AndroidX.Compose.run {
        implementation(activity)
        implementation(material)
        implementation(animations)
        implementation(tool)
        implementation(viewModel)
        implementation(mdcTheme)
        implementation(appCompatTheme)
    }
    Deps.DI.run {
        implementation(hilt_navigation)
        implementation(hilt)
        kapt(hiltKapt)
    }

    Testing.run {
        implementation(JUNIT4)
        implementation(ANDROID_JUNIT)
        implementation(ESPRESSO_CORE)
        implementation(COMPOSE)
    }
    Deps.Coroutines.run {
        implementation(core)
        implementation(android)
    }
    Deps.Network.run {
        implementation(gson)
        implementation(retrofit2Converter)
        implementation(interceptor)
        implementation(retrofit2)
        // kotlinx-serialization-json
        implementation(kotlinSerializationJson)
    }
    Deps.ThirdParty.run {
        implementation(timber)
        implementation(coil)
        implementation(coilCompose)
    }
}
