import java.util.Properties

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    signingConfigs {
        create("release") {
            storeFile = file(properties["RELEASE_STORE_FILE"] as String)
            storePassword = properties["RELEASE_STORE_PASSWORD"] as String
            keyPassword = properties["RELEASE_KEY_PASSWORD"] as String
            keyAlias = properties["RELEASE_KEY_ALIAS"] as String
        }
    }

    namespace = "com.activision.boz"

    compileSdk = 36
    ndkVersion = "25.1.8937393"

    val versionPropsFile = file("version.properties")
    require(versionPropsFile.canRead()) { "Could not read version.properties!" }

    val versionProps = Properties().apply {
        load(versionPropsFile.inputStream())
        val currentCode = getProperty("VERSION_CODE").toInt()
        val newCode = currentCode + 1
        setProperty("VERSION_CODE", newCode.toString())
        store(versionPropsFile.writer(), null)
    }

    defaultConfig {
        applicationId = "com.activision.boz"
        minSdk = 19
        targetSdk = 36
        versionCode = versionProps.getProperty("VERSION_CODE").toInt()
        versionName = "1.0.8.1"
        versionNameSuffix = "kotlin"
        multiDexEnabled = false
    }

    buildTypes {
        getByName("debug") {
            //noinspection ChromeOsAbiSupport
            ndk {
                abiFilters += listOf("armeabi-v7a") //, "arm64-v8a")
                //abiFilters += listOf("arm64-v8a")
            }
        }
        getByName("release") {
            //noinspection ChromeOsAbiSupport
            ndk {
                abiFilters += listOf("armeabi-v7a") //, "arm64-v8a")
            }
            //not worth enabling
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
        }
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/java")
        }
    }

    buildFeatures {
        buildConfig = true
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11

        tasks.withType<JavaCompile>().configureEach {
            options.compilerArgs.add("-Xlint:deprecation")
        }
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }

    lint {
        abortOnError = false
    }

    packaging {
        resources {
            excludes += setOf(
                "/META-INF/{AL2.0,LGPL2.1}",
                "/META-INF/LICENSE*",
                "/META-INF/NOTICE*",
            )
        }
    }
}

dependencies {
    // All native SDK sources are decompiled and inlined under src/main/java/.
    // No file-based JAR dependencies remain — see buildtools/ for the
    // decompile + Kotlin-skeleton pipeline that produced them.

    // Compose for any new Kotlin-side UI work alongside the decompiled
    // Marmalade SurfaceView.
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.activity:activity-ktx:1.9.3")
    implementation(platform("androidx.compose:compose-bom:2024.10.01"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.material3:material3")
}
