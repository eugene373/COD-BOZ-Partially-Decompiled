# BOZ Kotlin Port (`Main/`)

This is the Kotlin source tree for the Call of Duty: Black Ops Zombies
mobile project formerly hosted under `Master/`. The original tree was a
Groovy-flavored mix of Marmalade-era Java plus raw JAR blobs; this port
moves everything to Kotlin source while preserving the JVM ABI needed by
the native libs in `app/src/main/jniLibs/`.

For context, original-tree documentation (and the full Maven build that
this port inherits from) lives in `../Master/README.md`.

## Overview

Call Of Duty: Black Ops Zombies mobile was released in 2012, developed
using the now-discontinued "Marmalade" game engine. This port aims to
decompile every class the runtime needs and rewrite it as Kotlin source
so the project is editable end-to-end on modern Android Studio, without
relying on binary JARs.

## Layout

```
Main/
├── app/
│   ├── build.gradle.kts            # Kotlin DSL build script
│   ├── version.properties          # auto-incremented build version
│   └── src/main/
│       ├── AndroidManifest.xml     # copied from Master
│       ├── assets/                 # data.save + MakeLzma.py
│       ├── java/                   # all Kotlin sources (target tree)
│       ├── jniLibs/                # arm64-v8a / armeabi-v7a / armeabi *.so
│       └── res/                    # drawables, layouts, 120+ locale values
├── buildtools/                     # Python pipeline that produced java/
│   ├── check_*.py                  # audits Kotlin against .so / smali
│   ├── decompile_jar.py            # javap driver
│   ├── smali_to_kt.py              # converter
│   └── extract_7z.py               # handles the marmalade.7z archive
├── build.gradle.kts                # root build, plugins declared apply false
├── settings.gradle.kts             # repos + plugin versions
├── gradle.properties
├── gradle/wrapper/                 # Gradle 8.11.1 wrapper
├── gradlew, gradlew.bat
├── keystore.properties             # signing material
├── upload-keystore.jks             # signing keystore
├── local.properties                # sdk.dir, java.home (gitignored)
├── HOWTO_BUILD.md                  # build + re-decompile workflow
└── README.md                       # ← you are here
```

## How `app/src/main/java/` was produced

The original Marmalade SDK (`s3e_release.jar` + `s3e_debug.jar` +
`s3e_resources.jar`), the Bolts Task library, and the 5 root Marmalade
shell classes were decompiled with `javap -p -c` and rewritten to Kotlin
via the `buildtools/` pipeline. See [`HOWTO_BUILD.md`](HOWTO_BUILD.md)
for re-running the decompile step and verifying with the `check_*.py`
helpers.

A few conversions were done by hand because the bodies were small enough
to translate 1:1:

| Original                                       | → Kotlin |
|-----------------------------------------------|----------|
| `Java/com/activision/boz/Main.java`           | `java/com/activision/boz/Main.kt` |
| `Java/com/ideaworks3d/studio/IsDevice.java`   | `java/com/ideaworks3d/studio/IsDevice.kt` |
| `Java/com/ideaworks3d/studio/IsDeviceActivity.java` | `java/com/ideaworks3d/studio/IsDeviceActivity.kt` |
| `Java/com/savegame/SavesRestoring.java`       | `java/com/savegame/SavesRestoring.kt` |

## Building

```
./gradlew :app:assembleDebug
./gradlew :app:assembleRelease
```

The debug and release variants differ only in which Marmalade native libs
are linked; the Kotlin side is build-variant-agnostic.

## Game "OBB" data

The runtime still expects the `blackops_*.dz` OBB file alongside the APK,
copied to `Android/obb/com.activision.boz/`:

- [blackops_dxt.dz](http://cdn-boz-android.callofduty.com/PROD/CODBOZ/1_0_8/blackops_dxt.dz)
- [blackops_atitc.dz](http://cdn-boz-android.callofduty.com/PROD/CODBOZ/1_0_8/blackops_atitc.dz)
- [blackops_etc.dz](http://cdn-boz-android.callofduty.com/PROD/CODBOZ/1_0_8/blackops_etc.dz)

Most likely you'll want `blackops_atitc.dz`.
