# BOZ Kotlin Port — build & verification notes

## Building

```
./gradlew :app:assembleDebug    # produces app/build/outputs/apk/debug/app-debug.apk
./gradlew :app:assembleRelease  # signed with upload-keystore.jks
```

Requirements:
- JDK 11+ (validated on Temurin 21)
- Android SDK with build-tools 36
- Gradle wrapper auto-downloads Gradle 8.11.1

## Re-running the decompile pipeline

If you ever need to refresh `app/src/main/java/` after the source JARs in
`../Master/app/src/main/lib/` change:

```
# 1. Decompile every class in every relevant JAR to javap text
python buildtools/decompile_jar.py ../Master/app/src/main/lib/s3e_release.jar     buildtools/decoded/s3e_release
python buildtools/decompile_jar.py ../Master/app/src/main/lib/s3e_debug.jar       buildtools/decoded/s3e_debug
python buildtools/decompile_jar.py ../Master/app/src/main/lib/s3e_resources.jar   buildtools/decoded/s3e_resources
python buildtools/decompile_jar.py ../Master/app/src/main/lib/bolts-android-1.1.2.jar buildtools/decoded/bolts

# 2. Convert javap text dumps to Kotlin skeleton sources
python buildtools/smali_to_kt.py buildtools/decoded/s3e_release   app/src/main/java
python buildtools/smali_to_kt.py buildtools/decoded/s3e_debug     app/src/main/java
python buildtools/smali_to_kt.py buildtools/decoded/s3e_resources app/src/main/java
python buildtools/smali_to_kt.py buildtools/decoded/bolts         app/src/main/java

# 3. Audit Kotlin sources against the .so JNI tables and the smali
python buildtools/check_class_fqn.py
python buildtools/check_methods.py
python buildtools/check_natives.py
python buildtools/check_sig.py
python buildtools/check_void.py
```

The `check_*.py` scripts emit diagnostics for:
- Classes BOZ accesses via JNI but which aren't in the Kotlin tree.
- Native methods whose JVM descriptor differs between smali and Kotlin.
- Kotlin expression-body methods whose compiled JVM signature would not
  match the smali signature the native lib links against.

## JNI call-out hot spots

Five classes are wired into the native libs in `jniLibs/` and receive
JNI callbacks by Java-style symbol lookup. **Do not rename methods or
fields** in these classes:

- `com.ideaworks3d.marmalade.LoaderActivity` — callback hub from `libs3e_android.so`
- `com.ideaworks3d.marmalade.LoaderThread` — OS-tick + surface lifecycle
- `com.ideaworks3d.marmalade.LoaderView` — GLSurface host
- `com.ideaworks3d.marmalade.LoaderActivitySlave` — paired back-buffer activity
- `com.ideaworks3d.marmalade.S3EVideoView`
- `com.ideaworks3d.studio.IsDevice` — `libIsDevice.so` callbacks
  (notably `IsDeviceKeyCallback`)
- `com.ideaworks3d.studio.IsDeviceActivity.getInstance()` — looked up by
  `libIsDevice.so` via the `m_Activity` pattern.

If you must rename, also rebuild the native libs OR update the relevant
`RegisterNatives` table if present.

## Out of scope for this tree

- The `blackops_*.dz` OBB s3e container (separate pipeline).
- Reverse-engineering gameplay/renderer.
- Auto-binding a non-Marmalade game engine.
