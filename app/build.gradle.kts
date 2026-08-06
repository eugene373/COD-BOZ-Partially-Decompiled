plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 33

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    defaultConfig {
        applicationId = "com.activision.boz"
        minSdk = 23
        targetSdk = 33
        versionCode = 11
        versionName = "1.0.11"

        ndk {
            abiFilters += listOf("armeabi")
        }
    }

    sourceSets {
        getByName("main") {
            manifest.srcFile("src/main/AndroidManifest.xml")
            java.srcDir("src/main/java")
            assets.srcDir("src/main/assets")
            res.srcDir("src/main/res")
            jniLibs.srcDir("src/main/jniLibs")
        }
    }

    lint {
        abortOnError = false
    }

    namespace = "com.activision.boz"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:2.0.21")

    // Android Support Library (v4) - for Fragment, ActivityCompat, etc.
    implementation("com.android.support:support-v4:28.0.0")

    // Google Play Services - Ads, Games, Auth
    implementation("com.google.android.gms:play-services-ads:11.0.4")
    implementation("com.google.android.gms:play-services-games:11.0.4")
    implementation("com.google.android.gms:play-services-auth:11.0.4")

    // Facebook SDK
    implementation("com.facebook.android:facebook-android-sdk:4.28.0")

    // Bolts (for Facebook SDK)
    implementation("com.parse.bolts:bolts-android:1.4.0")

    // Samsung IAP (local AAR or jar)
    // implementation("com.samsung.android:samsung-inapp-purchase:1.0.0")

    // Amazon IAP (local JAR)
    // implementation(files("libs/amazon-inapp-purchasing-2.0.1.jar"))
}
