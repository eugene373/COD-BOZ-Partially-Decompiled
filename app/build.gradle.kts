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
}
