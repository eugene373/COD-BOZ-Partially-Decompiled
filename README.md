# BOZ Kotlin Port (`Master/`)

Dogecoin Wallet: DLXroiTaabPubUayDqhsHKsU7yTuegMDen

This is the Kotlin source tree for the Call of Duty: Black Ops Zombies
mobile project hosted under `Main/`. The original tree was a
Groovy-flavored mix of Marmalade-era Java plus raw JAR blobs; this port
moves everything to Kotlin source while preserving the JVM ABI needed by
the native libs in `app/src/main/jniLibs/`.

Big thanks to [12brendon34] https://github.com/12brendon34  for laying the
ground work with the decompiled java source! I'm sure I'd still be 
converting to Kotlin if not for the Github Repo.

For context, original-tree documentation (and the full Maven build that
this port inherits from) lives in `../Master/README.md`.

## Overview

Call of Duty: Black Ops Zombies mobile was released in 2012, developed
using the now-discontinued "Marmalade" game engine. This port aims to
decompile every class the runtime needs and rewrite it as Kotlin source
so the project is editable end-to-end on modern Android Studio, without
relying on binary JARs.

**Build status:** `./gradlew assembleDebug` → `BUILD SUCCESSFUL`,
`app/build/outputs/apk/debug/app-debug.apk` (~53 MB). `compileDebugKotlin`
is at **0 errors** after the rebuild pass documented below.

## Layout

Call of Duty: Black Ops Zombies mobile was released in 2012, developed
using the now-discontinued "Marmalade" game engine. This port aims to
decompile every class the runtime needs and rewrite it as Kotlin source
so the project is editable end-to-end on modern Android Studio, without
relying on binary JARs.

**Build status:** `./gradlew assembleDebug` → `BUILD SUCCESSFUL`,
`app/build/outputs/apk/debug/app-debug.apk` (~53 MB). `compileDebugKotlin`
is at **0 errors** after the rebuild pass documented below.

## Layout

```
Main/
├── app/
│   ├── build.gradle.kts            # Kotlin DSL build script
│   ├── version.properties          # auto-incremented (gitignored)
│   └── src/main/
│       ├── AndroidManifest.xml     # copied from Master
│       ├── assets/                 # boz.s3e + blackops_loader.dz (+ music dirs)
│       ├── java/                   # all Kotlin sources (target tree)
│       ├── jniLibs/                # arm64-v8a / armeabi-v7a / armeabi *.so
│       └── res/                    # drawables, layouts, 120+ locale values
├── buildtools/                     # Python pipeline that produced java/
│   ├── check_*.py                  # audits Kotlin against .so / smali
│   ├── decompile_jar.py            # javap driver (JAR -> text dumps)
│   ├── smali_to_kt.py              # javap-text -> Kotlin skeleton converter
│   ├── syntex_to_kt.py             # REAL-smali -> Kotlin skeleton converter (new)
│   ├── extract_7z.py               # handles the marmalade.7z archive
│   ├── decoded/                    # javap -p -c text dumps from the JARs
│   ├── generated/                  # prior skeleton output staging
│   └── smali_out/                  # output of syntex_to_kt.py (4967 skeletons)
├── build.gradle.kts                # root build, plugins declared apply false
├── settings.gradle.kts             # repos + plugin versions
├── gradle.properties               # (gitignored — machine-local)
├── gradle/wrapper/                 # Gradle 8.11.1 wrapper
├── gradlew, gradlew.bat
├── keystore.properties             # signing material (gitignored)
├── upload-keystore.jks             # signing keystore (gitignored)
├── local.properties                # sdk.dir, java.home (gitignored)
├── HOWTO_BUILD.md                  # build + re-decompile workflow
└── README.md                       # ← you are here
```

## How `app/src/main/java/` was produced

The port used **two** decompilation passes, both feeding the same
`buildtools/` pipeline:

1. **Javap pass (signatures only).** The original Marmalade SDK
   (`s3e_release.jar` + `s3e_debug.jar` + `s3e_resources.jar`), the
   Bolts Task library, and the 5 root Marmalade shell classes were
   decompiled with `javap -p -c` and rewritten to Kotlin skeleton
   sources via `buildtools/smali_to_kt.py`. These skeletons have real
   signatures but only `TODO("body")` stubs — no method bodies.

2. **Real-smali pass (signatures + bodies).** A full real-smali
   decompilation of the Master APK lives at `../Main/smali/`
   (≈4,967 `.smali` files with complete bytecode bodies — `invoke-*`,
   branches, `iget`/`iput`, `:cond_N`/`:goto_N`). This was converted
   to Kotlin skeletons via the new
   [`buildtools/syntex_to_kt.py`](buildtools/syntex_to_kt.py), which
   parses the actual smali grammar (`.class`, `.field name:type`,
   `.method/.end method`, `.param`, `.throws`, `.annotation`) — unlike
   `smali_to_kt.py`, which only understands javap text. Output landed
   in [`buildtools/smali_out/`](buildtools/smali_out/) mirroring the
   `main/smali` package tree.

   The smali-derived skeletons carry the raw smali body as a `/* */`
   comment block under each `TODO("body")`, which is what made it
   possible to fix the Java→Kotlin ABI mismatches below — the real
   bytecode comments are the authoritative truth source when a
   hand-written stub disagrees with the smali.

See [`HOWTO_BUILD.md`](HOWTO_BUILD.md) for re-running the decompile
steps and the `check_*.py` verification helpers.

A few conversions were done by hand because the bodies were small
enough to translate 1:1:

| Original                                       | → Kotlin |
|-----------------------------------------------|----------|
| `Java/com/activision/boz/Main.java`           | `java/com/activision/boz/Main.kt` |
| `Java/com/ideaworks3d/studio/IsDevice.java`   | `java/com/ideaworks3d/studio/IsDevice.kt` |
| `Java/com/ideaworks3d/studio/IsDeviceActivity.java` | `java/com/ideaworks3d/studio/IsDeviceActivity.kt` |
| `Java/com/savegame/SavesRestoring.java`       | `java/com/savegame/SavesRestoring.kt` |

## The rebuild pass: 283 → 0 Kotlin compile errors

Once the skeletons were in place the port did not actually compile.
A systematic pass reduced `compileDebugKotlin` errors from 283 down
to 0, with `buildtools/smali_out/` (the real-smali skeletons) used as
the ground truth for every member name, type signature, and ABI
detail. The reduction stages:

| Stage | Errors | What landed |
|------:|------:|-------------|
| 1 | 283 → 214 | Fixed `s3ePermissions` family: `onRequestPermissionsResult` grantResults are `IntArray` (`[I`), not `Array<Int>` — primitive-array JNI ABI hazard. |
| 2 | 214 → 144 | Nullable `!!` wave across `LoaderActivity.m_Activity` / `m_View` / `m_TopLevel` / `m_FrameLayout` chains; `IsDevice` field renamed to smali-true `m_IsActivated`; `s3eTest` `Object` monitor methods via `(lock as java.lang.Object).wait()/.notifyAll()`. |
| 3 | 144 → 79 | `bolts.Continuation` → `fun interface` (SAM lambdas compile) + `then` return type relaxed to `TContinuationResult?` (Void continuations can `return null` as Java did); `AndroidExecutors`/`BoltsExecutors` dropped bogus `INSTANCE = Self()` self-constructors; `s3eImagePicker.CopyStream` restructured so the infinite loop is finite; many `String?`/`Context` `!!` fixes. |
| 4 | 79 → 30 | Added missing `ListenerManager` import; fixed Kotlin-property-vs-method calls (`getCurrentOrientation()`/`getOrientation()`/`size()` need parens — Kotlin-defined methods do not auto-convert to property syntax); boxed-`Integer` ABI for `LoaderThread.m_OnTouchWait` (smali shows `Ljava/lang/Integer;`); `LoaderView` local-`val` bind for mutable-bitmap smart-cast; dropped inner-class `companion object` (Kotlin forbids inside inner classes). |
| 5 | 30 → 1 | `AppLink.Target` dropped redundant getters that collided at JVM level with the public `val` accessors; `s3ePermissions_PermissionRequestResult` `@JvmField` on `result` to avoid a synthetic `setResult(I)V` clash. |
| 6 | 1 → 0 | `LoaderThread.m_OnTouchWait` init reworded to `valueOf(0) as java.lang.Integer`. |

### Key ABI / idioms learned (likely to recur if more bodies get filled in)

- **Primitive arrays for JNI.** Java `int[]`/`short[]`/`byte[]` (smali
  `[I`/`[S`/`[B`) **must** map to Kotlin `IntArray`/`ShortArray`/
  `ByteArray`, **not** `Array<Int>`/`Short`/`Byte`. When a stub says
  the latter, it's the skeleton emitter being wrong — fix at the
  source. Confirmed against
  `LoaderActivity.onRequestPermissionsResult(I[Ljava/lang/String;[I)V`
  and `LoaderAPI.s3eConfigGetInt(...[I)I` in smali.

- **Kotlin property access vs `getX()` methods.** `x.f` only works on
  declared `val`/`var` properties. A Kotlin-defined method named
  `getF()` (or `getCurrentOrientation()`, `isSucceeded()`) is **not**
  auto-promoted to property syntax — you must call it as `x.f()`. Java
  `Collection.size()` likewise needs `x.size()`, not `x.size`.

- **`Object` monitor methods from Kotlin.** `wait()` / `notify()` /
  `notifyAll()` don't exist on Kotlin `Any`. Use
  `(obj as java.lang.Object).wait()` etc. — see memory of the prior
  `IllegalMonitorStateException` touch-wait bug.

- **Lifecycle visibility.** `LoaderActivity`'s `onResume`/`onStop`
  overrides are `protected` in smali (inherited from `Activity`).
  Java allowed same-package callers (`s3eTest`) to invoke them
  through a reference; Kotlin does not, so they were widened to
  `public override` to keep the same callsite working.

- **Inner classes.** Kotlin forbids `companion object` inside a
  non-`inner`-only nested class; compile-time-constant `const val`
  members that the Java source put on a non-static inner class have
  to move to the outer class's companion or be dropped.

- **Same-package protected access is gone in Kotlin.** Any cross-class
  call to a `protected` member needs either widening visibility (as
  above) or a reflective workaround.

- **Boxed-integer fields the native code reads.** Where smali shows a
  field as `Ljava/lang/Integer;` (boxed), keep that type — Kotlin `Int`
  would change the field's bytecode shape and can break JNI/reflection
  symmetry with the original `.so`s. Initialize with
  `java.lang.Integer.valueOf(x) as java.lang.Integer`.

## Disabling the s3e signature check

The Marmalade engine's native library `libs3e_android.so` verifies digital
signatures on `.s3e` container files at load time. The game archive
`app/src/main/assets/boz.s3e` is an LZMA1-RAW-compressed s3e container
with an embedded `icf` header and ARM executable payload. When signature
checking is active, the engine refuses to load any `.s3e` whose signature
doesn't match — which means you cannot edit the embedded `s3e.cfg`
configuration or map data without breaking the file.

**Why we disable it:** The signature check on `libs3e_android.so` is patched
out so that `boz.s3e` can be freely edited for configuration tweaks
(`s3e.cfg`) and map/data modifications. Without this patch, any edit to the
s3e archive causes the engine to reject it at startup, halting development
on the Kotlin port's runtime behavior.

**The patch** replaces a conditional branch (`BLE` on ARM32, `B.LE` on
ARM64) in the signature-verification function with an instruction that
always takes the success path:

| Architecture | Original instruction | Patch | Offset |
|---|---|---|---|
| armeabi (ARM 32-bit) | `BLE +0x13` | `MOVNE R0, #0` | 0x2496c |
| armeabi-v7a (Thumb 32-bit) | `BLE +0x13` | `MOVNE R0, #0` | 0x383b0 |
| arm64-v8a (AArch64) | `B.LE +0x45c` | `NOP` | 0x2aa08 |

The patch is applied via `buildtools/disable_sig_check.py`, which scans for
all `libs3e_android.so` files (jniLibs + build intermediates) and applies
the correct architecture-specific fix. It verifies each file contains the
`Incorrect signature` error string before patching, ensuring it only
modifies the correct Marmalade library.

To (re-)apply the patch:
```
python buildtools/disable_sig_check.py
```

## Building

```
./gradlew :app:assembleDebug     # produces app/build/outputs/apk/debug/app-debug.apk
./gradlew :app:assembleRelease   # signed with upload-keystore.jks
```

The debug and release variants differ only in which Marmalade native
libs are linked; the Kotlin side is build-variant-agnostic.

Requirements: JDK 11+ (validated on Temurin 21), Android SDK with
build-tools 36, Gradle 8.11.1 (auto-fetched by the wrapper).

## Game "OBB" data

The runtime downloads the `blackops_*.dz` texture blob on first launch
into `Android/obb/com.activision.boz/` (it writes a `.tmp` file first,
then renames).

## Storage / OBB write access (Android 11+)

The Marmalade engine writes its expansion data to the *raw* external
storage path `/sdcard/Android/obb/com.activision.boz/`, which modern
Android blocks under scoped storage. The fix that made downloads land
reliably on Android 12 and 15:

- **`targetSdk = 30`** in `app/build.gradle.kts` (compileSdk stays 36).
  At SDK 30 the legacy `WRITE_EXTERNAL_STORAGE` semantics the engine
  was written for return, and writes to the OBB path succeed again.
- **`AndroidManifest.xml`** declares `WRITE_EXTERNAL_STORAGE` (no
  `maxSdkVersion` cap) plus `MANAGE_EXTERNAL_STORAGE` as a belt-and-
  braces for API 30+.
- **`IsDeviceActivity.kt`** gates the native loader behind storage
  access before starting the engine: it requests the runtime
  `WRITE_EXTERNAL_STORAGE` grant on API 23-29 and the All-files-access
  (`MANAGE_EXTERNAL_STORAGE`) grant on API 30+, and pre-creates the
  `Android/obb/<pkg>/` dir (via `context.obbDir` *and* the raw sdcard
  path the engine constructs) so the engine's mkdir doesn't fail.

Without these the engine's write to the OBB path fails with `EACCES`,
which it surfaces as a misleading *"device does not have enough storage
to download the needed files"* error — not an actual disk-space
problem.

## Repo exclusions (`.gitignore` policy)

These are intentionally **not** committed and live only on the build
machine:

- `keystore.properties`, `upload-keystore.jks` — signing material,
  contains plaintext passwords; never pushed.
- `app/version.properties`, `gradle/gradle-daemon-jvm.properties` —
  re-touched by gradle on every invocation; not project state.
- `app/src/main/assets/blackops_atitc.dz`,
  `blackops_etc.dz`, `blackops_gles1.dz` —
  oversized game-data blobs (>100 MB, exceeds GitHub's limit).
- `app/src/main/assets/blackops-music/`,
  `app/src/main/assets/deadops-music/` — bulk music assets.
- `buildtools/smali_out/` — generated by `syntex_to_kt.py`, not
  hand-edited source. It is committed as a reference snapshot of the
  smali→Kotlin conversion (4,967 skeleton files); future regenerations
  are gitignored so re-running the converter doesn't churn the tree.
- `app/build/`, `.gradle`, `.kotlin`, `local.properties`,
  `gradle.properties`, etc. — standard IDE/build outputs.

If you want the big binaries in a clone, fetch them from the CDN links
above or copy from a working tree.
