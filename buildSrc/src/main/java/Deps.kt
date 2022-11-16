object Deps {
    object AndroidX {
        const val core = "androidx.core:core-ktx:${Versions.CORE_KTX}"
        const val activityKTX = "androidx.activity:activity-ktx:${Versions.ACTIVITY_KTX}"
        const val lifecycleKTX =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_KTX}"
        const val saveState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.LIFECYCLE_KTX}"
        const val fragmentKTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
        const val material = "com.google.android.material:material:${Versions.MATERIAL}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
        const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.RECYCLERVIEW}"
        const val inject = "javax.inject:javax.inject:1"
        const val dataStore = "androidx.datastore:datastore-preferences:${Versions.DATASTORE}"
        const val security = "androidx.security:security-crypto-ktx:1.1.0-alpha03"
        const val paging = "androidx.paging:paging-runtime-ktx:${Versions.PAGING}"
        const val pagingWithoutAndroid = "androidx.paging:paging-common-ktx:3.1.1"

        object Navigation {
            const val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
            const val navigationFragment =
                "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
        }

        object Room {
            const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
            const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
            const val ROOM_COMPILER_KAPT = "androidx.room:room-compiler:${Versions.ROOM}"
            const val ROOM_PAGING = "androidx.room:room-paging:${Versions.ROOM}"
        }

        object Compose {
            const val activity = "androidx.activity:activity-compose:1.5.1"
            const val material = "androidx.compose.material:material:1.2.1"
            const val animations = "androidx.compose.animation:animation:1.2.1"
            const val tool = "androidx.compose.ui:ui-tooling:1.2.1"
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1"
            const val mdcTheme = "com.google.android.material:compose-theme-adapter:1.1.16"
            const val appCompatTheme = "com.google.accompanist:accompanist-appcompat-theme:0.25.1"
        }
    }

    object DI {
        const val hilt = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val hiltKapt = "com.google.dagger:hilt-compiler:${Versions.HILT}"
        const val hilt_navigation =
            "androidx.hilt:hilt-navigation-fragment:${Versions.HILT_EXTENSION}"
    }

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE}"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE}"
    }

    object Network {
        const val interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
        const val gson = "com.google.code.gson:gson:${Versions.GSON}"
        const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val retrofit2Converter = "com.squareup.retrofit2:converter-gson:${Versions.GSON}"
        const val kotlinSerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2"
    }

    object ThirdParty {
        const val timber = "com.jakewharton.timber:timber:${Versions.TIMBER}"
        const val coilCompose = "io.coil-kt:coil-compose:${Versions.COIL}"
        const val coil = "io.coil-kt:coil:${Versions.COIL}"
    }

    object Google {
        const val googleServices = "com.google.gms:google-services:4.3.13"
        const val firebaseBom = "com.google.firebase:firebase-bom:30.4.1"
        const val firebaseMessaging = "com.google.firebase:firebase-messaging-ktx"
    }
}
