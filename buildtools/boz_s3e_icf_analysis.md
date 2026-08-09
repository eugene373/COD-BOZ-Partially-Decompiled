# BOZ.s3e Container Analysis — s3e.icf Documentation

## Container Format Overview

The `boz.s3e` file is a **Marmalade engine** archive using the **XE3U container format**.

### Compression Layer (Outer)
- **Format**: LZMA1-RAW
- **Header**: 13 bytes (1-byte properties byte + 12 reserved bytes)
  - Byte 0: `0x5D` → LZMA properties: `lc=3, lp=0, pb=2`
  - Bytes 1–12: Reserved/zeroed
- **Decompression**: Skip 13-byte header, decompress remaining stream with `lzma.FORMAT_RAW` and filter derived from props byte.

### XE3U Container (Inner, after decompression)
- **Magic**: `58 45 33 55` (`XE3U`)
- **Version**: `0x00042800` (Marmalade 7.x SDK)
- **Version string**: `10.0.12.1` (bytes 8–11: `0A 00 0C 01`)
- **Total decompressed size**: 4,550,599 bytes (0x456F93)

### High-Level Layout

| Offset | Size | Content |
|--------|------|---------|
| 0x0000 | 40 bytes | XE3U header (magic, version, section offsets) |
| 0x004C | ~4,478 bytes | **Config Section 1** — Main `s3e.icf` (global config) |
| 0x11CA | ~12,342 bytes | **Config Section 2** — Game config (Demonware, GAME, NETWORK, ICF platform blocks) |
| 0x4200 | 499 bytes | **Config Section 3** — Resource download config (RSA key, CDN links, Android extensions) |
| 0x43F3 | 10 bytes | File table entry (flags + offset + symbol count) |
| 0x43FD | ~6,485 bytes | **Symbol table** — 391 null-terminated JNI/native function names |
| 0x5D52 | ~4,526,669 bytes | **Binary section** — ARM code + texture index tables + asset data |

---

## Config Section 1: Main `s3e.icf`

**Offset**: 0x004C  
**Size**: 4,478 bytes  
**Purpose**: Global engine configuration for all build targets. Loaded first by the Marmalade S3E loader.

### Structure

The file uses an INI-style format with sections `[SECTION]` and conditional blocks `{OS=...}` / `{ID=...}` / `{CLASS=...}`.

#### Top-Level Settings (Before Any Conditional Block)

```ini
[S3E]
SysFastLockDisable=1
SysStackSwitchFastDisable=1
```

| Setting | Value | Description |
|---------|-------|-------------|
| `SysFastLockDisable` | `1` | Disables fast spinlock; uses OS-level synchronization instead. Safer for mobile platforms. |
| `SysStackSwitchFastDisable` | `1` | Disables fast stack switching in the Marmalade threading layer. Prevents stack-related crashes on Android. |

```ini
#Always have heap 6 waiting as a "direct to OS" heap
MemSize6=0
MemFlags6=OS_DIRECT
```

| Setting | Value | Description |
|---------|-------|-------------|
| `MemSize6` | `0` | Heap #6 size. Set to 0 (auto-size). |
| `MemFlags6` | `OS_DIRECT` | Heap #6 uses `OS_DIRECT` flag — bypasses Marmalade's memory manager, allocates directly from OS. Used for large allocations that need physical contiguity. |

#### Conditional Blocks — Platform-Specific Overrides

The file contains nested blocks like `{OS=WINDOWS}`, `{ID=ANDROID "Nexus One"}`, etc. These set platform-specific or device-specific overrides that only apply when running on matching hardware.

##### `{OS=WINDOWS}` Block

```ini
[GL]
PreCompileShaderBinariesToolPath="angle_dx11/compiletool.exe"
PreCompileShaderBinariesOutputDir="shader_bin_wp8"
PreCompileShaderBinariesFormat=0x93B0
```

| Setting | Value | Description |
|---------|-------|-------------|
| `PreCompileShaderBinariesToolPath` | `"angle_dx11/compiletool.exe"` | Path to ANGLE shader compiler for DirectX 11 backend. |
| `PreCompileShaderBinariesOutputDir` | `"shader_bin_wp8"` | Directory to store pre-compiled shader binaries. |
| `PreCompileShaderBinariesFormat` | `0x93B0` | GLenum `GL_SHADER_BINARY_ANGLE_DX11` — binary format for ANGLE DX11. |

##### `{OS=WP8}` / `{OS=WS8}` / `{OS=WS81}` / `{OS=WP81}` / `{OS=WIN10}` Blocks

```ini
[GL]
LoadPreCompiledShaderBinaries=1
EGLTerminateOnSuspend=1
[S3E]
SysGlesSuspendWithApp=1
```

| Setting | Value | Description |
|---------|-------|-------------|
| `LoadPreCompiledShaderBinaries` | `1` | Enables loading pre-compiled GL shader binaries instead of compiling at runtime. Critical for platforms where runtime compilation is unsupported or slow. |
| `EGLTerminateOnSuspend` | `1` | Terminates the EGL context when the app is suspended. Prevents context loss crashes on mobile Windows. |
| `SysGlesSuspendWithApp` | `1` | Suspends the OpenGL ES context when the app is suspended. |

##### `{OS=WS81}` / `{OS=WP81}` / `{OS=WIN10}` Blocks

```ini
WindowsDispScaleFactor="native"
```

| Setting | Value | Description |
|---------|-------|-------------|
| `WindowsDispScaleFactor` | `"native"` | Uses native display scaling factor on Windows 8.1+/10. |

##### `{OS=QNX}` Block

```ini
[GL]
EGL_RED_SIZE=8
EGL_BLUE_SIZE=8
EGL_GREEN_SIZE=8
EGL_ALPHA_SIZE=8
AlphaInFrameBuffer=1
```

| Setting | Value | Description |
|---------|-------|-------------|
| `EGL_*_SIZE` | `8` | All RGBA color buffer channels set to 8 bits each (32-bit RGBA framebuffer). |
| `AlphaInFrameBuffer` | `1` | Requests alpha channel in the default framebuffer. |

##### `{OS=LINUX}` Block

```ini
[GL]
EGL_DEPTH_SIZE=24
```

| Setting | Value | Description |
|---------|-------|-------------|
| `EGL_DEPTH_SIZE` | `24` | 24-bit depth buffer for OpenGL ES on Linux. |

##### Android Emulator Block (`{ID=ANDROID "Emulator"}`)

```ini
DisableSound=1
```

| Setting | Value | Description |
|---------|-------|-------------|
| `DisableSound` | `1` | Disables audio on the Android emulator (known to be buggy/slow). |

##### Device-Specific Android Blocks

###### `{ID=ANDROID "HTC Dream", "T-Mobile G1", "HTC Magic", ...}`

```ini
AndroidPointEventWaitTime=16
```

| Setting | Value | Description |
|---------|-------|-------------|
| `AndroidPointEventWaitTime` | `16` | Maximum wait time (ms) for Android touch event processing on early HTC devices. |

###### `{ID=ANDROID "SHW-M290K"}`

```ini
KeyHasDirnKeys=0
```

| Setting | Value | Description |
|---------|-------|-------------|
| `KeyHasDirnKeys` | `0` | Indicates this device has no D-pad direction keys (LG Optimus). |

###### `{ID=ANDROID "HTC Hero", "T-Mobile G2 Touch"}`

```ini
AndroidPointMultiEnable=1
```

Enable multi-touch on these devices.

###### `{ID=ANDROID "Eris"}`

```ini
AndroidPointMultiEnable=1
```

Enable multi-touch on HTC Eris.

###### `{ID=ANDROID "Nexus One"}`

```ini
WinMobAudioSupportAAC=0
WinMobAudioSupportAACPLUS=0
WinMobAudioSupportMP4=1
AndroidKeyHasBackLeft=1
PointCapTouchArea=1
```

| Setting | Value | Description |
|---------|-------|-------------|
| `WinMobAudioSupportAAC` | `0` | Disable AAC audio support on Windows Mobile. |
| `WinMobAudioSupportAACPLUS` | `0` | Disable AAC+ audio support on Windows Mobile. |
| `WinMobAudioSupportMP4` | `1` | Enable MP4 audio support on Windows Mobile. |
| `AndroidKeyHasBackLeft` | `1` | Device has a physical BACK key on the left. |
| `PointCapTouchArea` | `1` | Caps the touch area to screen bounds. |

###### `{ID=ANDROID "Nexus S"}`

```ini
AndroidKeyHasBackLeft=1
```

Nexus S has a physical BACK key on the left.

###### `{ID=ANDROID "Galaxy I7500"}`

```ini
KeyHasDirnKeys=1
```

Samsung Galaxy I7500 has D-pad keys.

###### `{ID=ANDROID "Droid", "Milestone"}`

```ini
[GX]
GlesDepthBuffFixedPoint=1
[S3E]
AndroidIgnoreResizeWhilePaused=1
AndroidKeyHasBackLeft=1
```

| Setting | Value | Description |
|---------|-------|-------------|
| `GlesDepthBuffFixedPoint` | `1` | Uses fixed-point depth buffer on GLES for Motorola Droid/Milestone (workaround for driver bugs). |
| `AndroidIgnoreResizeWhilePaused` | `1` | Ignores surface resize events while app is paused (prevents crash on Droid). |
| `AndroidKeyHasBackLeft` | `1` | Physical BACK key on left side. |

###### `{ID=ANDROID "DROID2"}`

```ini
[GX]
GlesDepthBuffFixedPoint=1
[S3E]
```

Same fixed-point depth buffer workaround for Droid 2.

##### `{OS=ANDROID}` Block (Generic Android)

```ini
[GL]
EGL_DEPTH_SIZE=16
EGLTerminateOnSuspend=1
[S3E]
SysGlesSuspendWithApp=0
MemUseMMapForCode=1
```

| Setting | Value | Description |
|---------|-------|-------------|
| `EGL_DEPTH_SIZE` | `16` | 16-bit depth buffer for Android (performance optimization). |
| `EGLTerminateOnSuspend` | `1` | Terminates EGL context on app suspend. |
| `SysGlesSuspendWithApp` | `0` | Does NOT suspend GLES context with app — keeps it alive to reduce context switch overhead. |
| `MemUseMMapForCode` | `1` | Uses memory-mapped files for code execution — essential for Android to load the ARM binary from the `.s3e` package. |

##### `{OS=TIZEN}` Block

```ini
[S3E]
TizenUseEGLPixmapRender=1
```

Uses EGL pixmaps for rendering on Tizen (avoids texture upload overhead).

##### `{OS=TIZEN_X86}` Block

```ini
[GL]
AlphaInFrameBuffer=1
[GX]
MaxTextureStages=32
UploadStreams=0
[S3E]
TizenUseEGLPixmapRender=0
```

| Setting | Value | Description |
|---------|-------|-------------|
| `AlphaInFrameBuffer` | `1` | Request alpha in framebuffer. |
| `MaxTextureStages` | `32` | Workaround for Tizen simulator's GL_MAX_TEXTURE_UNITS limit. |
| `UploadStreams` | `0` | Disable streaming vertex data uploads (software renderer). |
| `TizenUseEGLPixmapRender` | `0` | Disable pixmap rendering on X86 (use regular textures). |

##### LGTV Blocks (`{ID=LINUX "LG TV", ...}`)

```ini
[S3E]
AccelScaleFactor=7
AccelFlipX=1
WinWidth=1280
WinHeight=720
WinFullScreen=1
DevVolNumSteps=100
```

| Setting | Value | Description |
|---------|-------|-------------|
| `AccelScaleFactor` | `7` | Accelerometer scale factor for LG TV. |
| `AccelFlipX` | `1` | Flip X axis of accelerometer data. |
| `WinWidth`/`WinHeight` | `1280`/`720` | Window dimensions in fullscreen mode. |
| `WinFullScreen` | `1` | Start in fullscreen. |
| `DevVolNumSteps` | `100` | Volume control steps. |

LGTV GL block enables 8-bit RGBA framebuffer with alpha, hardware rasterisation.

##### OSX Block (`{OS=OSX}`)

```ini
Transform=HW
```

Use hardware transforms on macOS.

##### `{OS=ROKU}` Block

```ini
[S3E]
SurfUseGles=1
PointCapTouchArea=1
[GL]
MergeShaderStringArrays=1
AlphaInFrameBuffer=1
```

| Setting | Value | Description |
|---------|-------|-------------|
| `SurfUseGles` | `1` | Use OpenGL ES rendering surface on Roku. |
| `MergeShaderStringArrays` | `1` | Merges shader string arrays — Roku GLES2 driver workaround. |
| `AlphaInFrameBuffer` | `1` | Alpha channel in framebuffer. |

##### `{OS=NACL}` Block

```ini
[GX]
GLErrorChecking=0
```

Disables GL error checking on Native Client (performance).

##### `{OS=LGTV_NC40}` Block

Same as LGTV block but for NC40 models.

##### `{ID=ANY}` / `{CLASS=ANY}` Reset Blocks

```ini
{ID=ANY}
{CLASS=ANY}
```

Resets all device-class conditionals to defaults.

##### `[TRACE]` Section

```ini
IWCRT_VERBOSE=0
```

| Setting | Value | Description |
|---------|-------|-------------|
| `IWCRT_VERBOSE` | `0` | Crash Ruptor trace verbosity (0 = off). |

---

## Config Section 2: Game Configuration

**Offset**: 0x11CA  
**Size**: 12,342 bytes  
**Purpose**: Game-specific configuration, including network, memory, rendering, and platform-specific overrides.

### Structure

#### Comment Header

```text
# comments and whitespace stripped by deployment tool
```

Indicates this section was processed by the Marmalade deployment tool which strips comments before packaging.

### [Demonware] Section

```ini
TitleID = 18436
LSGServer = codboh-iphone-lobby.dev.demonware.net:3074
AuthServer = codboh-iphone-auth.dev.demonware.net:3074
```

| Setting | Value | Description |
|---------|-------|-------------|
| `TitleID` | `18436` | Demonware Title ID for authentication. |
| `LSGServer` | `codboh-iphone-lobby.dev.demonware.net:3074` | Lobby server address (dev environment). |
| `AuthServer` | `codboh-iphone-auth.dev.demonware.net:3074` | Authentication server address (dev environment). |

> **Note**: Section 2 ends with a production override:
> ```ini
> {[GAME] iAndroidReleaseBuild == 1}
> [Demonware]
> LSGServer=codboh-iphone-lobby.prod.demonware.net:3074
> AuthServer=codboh-iphone-auth.prod.demonware.net:3074
> ```
> Production servers are used when `iAndroidReleaseBuild=1`.

### [STUN] Section

```ini
STUNServer = codboh-iphone.stun.demonware.net
STUNServerPort = 3478
```

| Setting | Value | Description |
|---------|-------|-------------|
| `STUNServer` | `codboh-iphone.stun.demonware.net` | STUN server for NAT traversal. |
| `STUNServerPort` | `3478` | Standard STUN port (RFC 3489). |

### [S3E] Section (Game-Specific)

| Setting | Value | Description |
|---------|-------|-------------|
| `SockNoDelay` | `1` | Disables Nagle's algorithm (TCP_NODELAY) for low-latency networking. |
| `SysGlesVersion` | `1` (dev) / `2` (production Android) | GLES version: 1=ES1.1, 2=ES2.0. Production Android forces GLES2. |
| `DispFixRot` | `"Landscape"` / `"FixedLandscape"` | Screen orientation. Android uses "FixedLandscape" to prevent rotation. |
| `IOSDispScaleFactor` | `200` | iOS Retina display scale factor. |
| `AccelDampingFactor` | `0` | Accelerometer damping (0=off). |
| `iPhoneErrorOnMemoryWarning` | (string) | Custom out-of-memory error message for iOS. |

### [GX] Section

```ini
Rasterisation=HW
Transform=HW
Lighting=HW
DataCacheSizeHW=1000000
VertCacheSizeHW=120000
FreeStreamData=1
```

| Setting | Value | Description |
|---------|-------|-------------|
| `Rasterisation` | `HW` | Use hardware rasteriser. |
| `Transform` | `HW` | Use hardware vertex processing. |
| `Lighting` | `HW` | Use hardware lighting. |
| `DataCacheSizeHW` | `1000000` | Hardware data cache size (bytes). |
| `VertCacheSizeHW` | `120000` | Hardware vertex cache size. |
| `FreeStreamData` | `1` | Free streaming vertex data after upload. |

### [UTIL] Section

| Setting | Value | Description |
|---------|-------|-------------|
| `NumMemBuckets` | `14` (default) / `NumMemBuckets + 1` (heap analyser) | Number of memory buckets. |
| `IsVolatileAllocatorSize` | `2000000` | Size of volatile allocator (bytes). |
| `MemMgrMaxAllocWarning` | `0` | Suppress max allocation warnings. |

### [SYSTEM] Section

| Setting | Value | Description |
|---------|-------|-------------|
| `ConsoleHeapSize` | `150000` | Console output heap size. |
| `MaxConsoleBindings` | `32` | Maximum console key bindings. |
| `MaxConsoleBindingSets` | `24` | Maximum console binding sets. |

### [SOUND] Section

| Setting | Value | Description |
|---------|-------|-------------|
| `MaxChannels` | `24` | Maximum simultaneous audio channels. |

### [GAME] Section

This section contains the most extensive game settings:

#### Memory Buckets

| Setting | Value | Description |
|---------|-------|-------------|
| `StatsBucketSize` | `10000` | Memory for stats system. |
| `GameSaveBucketSize` | `100000` | Memory for save game system. |
| `GuiBucketSize` | `2500000` | Memory for IwUI GUI system. |
| `DebugBucketSize` | `50000` | Memory for debug output. |
| `MetricsBucketSize` | `6144` | Memory for metrics tracking. |
| `ExtraMemorySize` | `0` / varies by platform | Extra memory allocation. |
| `ExtraDebugBucketSize` | `0` | Extra debug memory. |
| `BinariserCfg` | `binariser.console` | Binariser configuration name. |
| `BinariserTaskList` | `BinAll` | Binariser task list name. |
| `FrontendMemoryWarningLevel` | `33000000` (Android) / `2000000` (low-end iPhone) | Free memory threshold (bytes) below which front-end warns. |
| `EnableAILoadBalancing` | `1` | Enable AI load balancing. |
| `OnlineAccount` | `GC` | Online account provider: "GC" = Game Center. |

#### Platform-Specific Game Settings

##### Android (`{OS=ANDROID}`)

```ini
VoiceChatEnabled = 0
EnableAndroidMarketBilling=1
UseAnyAssetType=1
MatchmakingSearchAndPublishMode=1
DisableAchievementDB=1
```

| Setting | Value | Description |
|---------|-------|-------------|
| `VoiceChatEnabled` | `0` | Voice chat disabled on Android. |
| `EnableAndroidMarketBilling` | `1` | Enable in-app billing. |
| `UseAnyAssetType` | `1` | Allow loading non-standard asset formats. |
| `MatchmakingSearchAndPublishMode` | `1` | Matchmaking mode (1=search and publish). |
| `DisableAchievementDB` | `1` | Disable achievements database. |

##### iPhone Device Classes

```ini
{ID=IPHONE "iPhone2,1", "iPod3,1", "iPad1,1"}
LowEndDevice=1
```

Marks these devices (iPhone 3GS, iPod Touch 3rd gen, iPad 1st gen) as low-end.

### [NETWORK] Section

```ini
ProtocolVersion=1.2.0
TimeoutMs=15000
LoadingGameTimeoutMs=60000
Receive_TimeoutMs=500
Handshake_TimeoutMs=8000
StunSockets_HandshakeRequestTimeout=500
RxEventBucketSize=80000
```

| Setting | Value | Description |
|---------|-------|-------------|
| `ProtocolVersion` | `1.2.0` | Network protocol version. |
| `TimeoutMs` | `15000` | Default network timeout (15 seconds). |
| `LoadingGameTimeoutMs` | `60000` | Timeout while loading game (60 seconds). |
| `Receive_TimeoutMs` | `500` | Socket receive timeout (500ms). |
| `Handshake_TimeoutMs` | `8000` | Connection handshake timeout (8 seconds). |
| `StunSockets_HandshakeRequestTimeout` | `500` | STUN socket handshake timeout. |
| `RxEventBucketSize` | `80000` | Memory for receiving network events. |

### [ONLINE] Section

```ini
hostname = "https://10.79.1.233"
port = 44443
bucketSize = 200000
appID = 1
appSecret = 8f66fd4306c217bfb27a1ae1f34c34dd
dispatcher = "/isonline/dispatcher.php"
TmpFileUpdateInterval = 31000
```

| Setting | Value | Description |
|---------|-------|-------------|
| `hostname` | `https://10.79.1.233` | Internal dev server (IP address). |
| `port` | `44443` | HTTPS port. |
| `bucketSize` | `200000` | Memory for online subsystem. |
| `appID` | `1` | Application ID for online services. |
| `appSecret` | `8f66fd4306c217bfb27a1ae1f34c34dd` | Secret key for online API auth. |
| `dispatcher` | `/isonline/dispatcher.php` | API endpoint path. |
| `TmpFileUpdateInterval` | `31000` | Temp file update interval (ms). |

### [FLASH] Section

```ini
UseGxRenderer=1
UseGxFont=1
BitmapQueueSize=100
FlashBucketSize=8500000
```

| Setting | Value | Description |
|---------|-------|-------------|
| `UseGxRenderer` | `1` | Use IwGx for Flash rendering. |
| `UseGxFont` | `1` | Use IwGxFont for Flash font rendering. |
| `BitmapQueueSize` | `100` | Max queued bitmaps for Flash. |
| `FlashBucketSize` | `8500000` | Memory for Flash subsystem (~8.1MB). |

### [GXFONT] Section

```ini
TextureMaxSize=1024
CacheTextureMaxSize=1024
```

| Setting | Value | Description |
|---------|-------|-------------|
| `TextureMaxSize` | `1024` | Maximum texture size for fonts. |
| `CacheTextureMaxSize` | `1024` | Maximum cache texture size for fonts. |

### Device-Specific Overrides

#### Low-End iPhone Devices

```ini
{ID=IPHONE "iPhone2,1", "iPod3,1", "iPad1,1", "iPod4,1"}
LowEndDevice=1
```

#### Front-End Settings

```ini
WorldAtWarLink="http://itunes.apple.com/app/id338057689"
WorldAtWarLinkHD="http://itunes.apple.com/app/id364159440"
CodEliteLink="https://play.google.com/store/apps/details?id=com.activision.elite"
AnthLink="https://play.google.com/store/apps/details?id=com.activision.anthology"
MoreInfoLink="http://callofduty.com/blackops/faq/androidzombies"
RateMeLink="http://itunes.apple.com/app/id471063940"
```

App store / webpage links for cross-promotion and support.

#### Battery Management

| Setting | Value | Description |
|---------|-------|-------------|
| `LowBatteryEventValue` | `5` | Battery % that triggers low-battery event. |
| `BatteryPollRate` | `10000` | Poll battery level when above low threshold (ms). |
| `LowBatteryPollRate` | `5000` | Poll battery level when below low threshold (ms). |
| `NumLowBatteryPolls` | `3` | Number of consecutive polls before saving game. |

### Deploy Config Blocks

Conditional blocks based on `DeployConfig` value:

#### `{[GAME] DeployConfig==1}` / `{[GAME] DeployConfig==artbuild}`

Debug build settings with increased memory and tracing:

| Setting | Value | Description |
|---------|-------|-------------|
| `SysErrorDontStop` | `1` | Don't stop on errors. |
| `MemSizeDebug` | `900000000` | Debug heap size (~858MB). |
| `tracetofile` | `1` | Enable trace to file. |
| `DataCacheSizeHW` | `5000000` | Debug data cache size. |
| `ExtraMemorySize` | `14000000` | Extra memory for art builds. |

#### `{[GAME] DeployConfig==profiling}` / `{[GAME] DeployConfig==profilingdevice}`

Profiling build with debug FPS display.

#### `{[GAME] DeployConfig==heapanalyser}`

Heap analyzer build with massive memory allocation:
- `MemSizeDebug=280000000` (267MB)
- `ExtraMemorySize=120000000` (114MB)

### Production Android Settings

```ini
BuildNum=456612
{[GAME] iAndroidReleaseBuild == 1}
[S3E]
SysGlesVersion=2
[GAME]
ResourceDownloader=1
AndroidPublicKey="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A..."
```

| Setting | Value | Description |
|---------|-------|-------------|
| `BuildNum` | `456612` | Production build number. |
| `SysGlesVersion` | `2` | Force OpenGL ES 2.0 in release builds. |
| `ResourceDownloader` | `1` | Enable external resource downloader. |
| `AndroidPublicKey` | (long base64) | Google Play Billing public key (base64-encoded RSA key). |

---

## Config Section 3: Resource Download Config

**Offset**: 0x4200  
**Size**: 499 bytes  
**Purpose**: External resource download configuration with CDN links and Android extension library list.

```ini
ResDownloadLink="http://10.80.0.199:8080/"
ResourcePath = "com.marm.blackops/"
[RESMANAGER]
ResBuild=0              # Uncomment to disable resource building
[GAME]
Binarise=0                  # Uncomment to binarise
[GAME]
GameVersion="1. 0. 9"
{}
[GAME]
AndroidPublicKey="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgeOpwfwM4alZrD3un6xi8bszw2auW7ARE8y8KzNSEUkJXW0eL7bmKlf3O49hhUHavYhzdhnvyVRR9c9jfS45BivJ3A7hUWxxGguwEcsa7lQz7MmcG5DtlK0OokAyvmzkgv/3XAOnGovwH11D2zEwN9dN7CqQdnjF1C+2Z7+nyzQaLeY12oB7vFEAndBIkO37mOMgoOytWz3QQOi7iajVTlJXAiforAWoBetiDh+KkLyqEWiPUMHMgbEufRTp2/E5FRQCza4KXFn1+a5o/sXGdJRVDhgwjcyEr1SnT4lXNSl6SBKshDc29axH6RBMf2sKFZhSOc0xJAPGcQvs/fx5fwIDAQAB"
ResDownloadLink="http://cdn-boz-android.callofduty.com/PROD/CODBOZ/1_0_9/"
ResourcePath = "com.activision.boz/"
[s3e]
SysAppVersion=1.0.11
SysAppCaption="COD:BOZ"
AndroidExtSo="libs3eFacebook.so;libs3eAmazonInAppPurchasing.so;libs3eAndroidMarketBilling.so;libs3eAndroidGooglePlayBilling.so;libs3eSamsungInAppPurchasing.so;libIsDevice.so;libIsIOSUtils.so;libs3eGooglePlayServices.so"
{}
[S3E]
SysGlesDirectory=pvr
```

### Key Settings

| Setting | Value | Description |
|---------|-------|-------------|
| `ResDownloadLink` (dev) | `http://10.80.0.199:8080/` | Development CDN URL for testing. |
| `ResourcePath` (dev) | `com.marm.blackops/` | Dev resource path under `Android/obb/`. |
| `GameVersion` | `1. 0. 9` | Game version string. |
| `AndroidPublicKey` | (long base64) | Google Play Billing RSA public key. |
| `ResDownloadLink` (prod) | `http://cdn-boz-android.callofduty.com/PROD/CODBOZ/1_0_9/` | Production CDN URL for expansion resources. |
| `ResourcePath` (prod) | `com.activision.boz/` | Production resource path under `Android/obb/`. |
| `SysAppVersion` | `1.0.11` | App version string (matches `version.properties`). |
| `SysAppCaption` | `COD:BOZ` | Window/title caption. |
| `AndroidExtSo` | (7 .so files) | List of external shared libraries loaded by the Marmalade S3E loader via `System.loadLibrary`. |
| `SysGlesDirectory` | `pvr` | Uses PowerVR-compatible GL ES shader directory. |

### Android External Libraries

1. `libs3eFacebook.so` — Facebook SDK integration
2. `libs3eAmazonInAppPurchasing.so` — Amazon IAP
3. `libs3eAndroidMarketBilling.so` — Legacy Android Market billing
4. `libs3eAndroidGooglePlayBilling.so` — Google Play Billing v2/v3
5. `libs3eSamsungInAppPurchasing.so` — Samsung Apps IAP
6. `libIsDevice.so` — Device detection utility
7. `libIsIOSUtils.so` — iOS utilities (cross-platform build artifact)
8. `libs3eGooglePlayServices.so` — Google Play Services integration

---

## Symbol Table

**Offset**: 0x43FD (immediately after file table entry at 0x43F3)  
**Entry count**: 391 (stored as 16-bit value at offset 0x43FB)  
**Format**: Null-terminated ASCII strings, sorted alphabetically by category

### Categories

| Category | Count | Examples |
|----------|-------|---------|
| `s3e*` | 144 | `s3eMallocBase`, `s3eDeviceGetInt`, `s3eFileOpen` |
| `gl*` | 224 | `glTexImage2D`, `glDrawArrays`, `glUniformMatrix4fv` |
| `egl*` | 23 | `eglSwapBuffers`, `eglCreateContext`, `eglGetDisplay` |

### File Table Entry (at 0x43F3)

```
Offset 0x43F3: 00 00 00 00 60 19 00 00 87 01
```

| Offset | Size | Value | Meaning |
|--------|------|-------|---------|
| 0x43F3 | 4 bytes | `00 00 00 00` | Flags (0 = symbol table) |
| 0x43F7 | 4 bytes | `60 19 00 00` | Offset of config section 2 (`0x1960`) |
| 0x43FB | 2 bytes | `87 01` | Symbol count (`0x0187` = 391) |
| 0x43FD | N bytes | strings | Null-terminated symbol names |

### Symbol List (All 391)

See `buildtools/symbol_table_detailed.txt` for the complete list.

The symbols are the JNI function names that `libs3e_android.so` registers via `JNIEnv.RegisterNatives()` at runtime. Each name must exactly match a Kotlin/Java method in the `com.ideaworks3d.marmalade` package.

---

## Binary Section

**Offset**: 0x5D52  
**Size**: ~4,526,669 bytes (4.3 MB)  
**Purpose**: Contains ARM executable code and embedded game assets.

### Structure

```
Offset 0x5D52: [Binary Header]
  0x5D52: 00 01 00 00  = 0x100 (format marker or entry count)
  0x5D56: 00 b8 2d 03  = 0x032DB800 (possibly data section size)
  0x5D5A: 00 6b cb 00  = 0x00CB6B00 (possibly texture section size)
  0x5D5E: [Offset Table 1] - 388 entries of 0x3DC0XXXX00, incrementing by 0x400

[Offset Tables 2..N] - Tables with base 0x3DC1XXXX00, 0x3DC2XXXX00, etc.
  Total ~612 tables with varying entry counts (2-388 entries each)
  
Followed by: ARM executable code + embedded textures
```

### Header Fields (XE3U container)

| Field | Offset | Value | Interpretation |
|-------|--------|-------|----------------|
| Version | 0x04 | `0x00042800` | XE3U format version |
| Version string | 0x08 | `0A 00 0C 01` | SDK version 10.0.12.1 |
| Symbol table offset | 0x0C | `0x000043F3` | Offset to file table entry |
| Data offset 1 | 0x10 | `0x00035090` | Offset to texture index data |
| Code entry offset | 0x14 | `0x00039483` | ARM code entry point |
| Data section 1 | 0x18 | `0x0041D970` | ARM data section (repeating constants) |
| Virtual address | 0x1C | `0x004A7DC8` | Entry point VA (beyond file) |
| Near-end offset | 0x20 | `0x00456DF3` | End-of-file metadata (hash/signature) |
| Hash size | 0x24 | `0x0000008C` | 140 bytes of end-of-file hash |

### ARM Code Entry Point (0x39483)

```
ARM instructions:
  e59f008c  ldr  r0, [r15, #0x8c]   ; Load constant from PC+0x8c
  e92d4010  push {r4, lr}            ; Standard function prologue
  e24dd008  sub  sp, sp, #8          ; Allocate stack space
  e08f0000  add  r0, pc, r0          ; Add PC to r0 (PIC trampoline)
  e60200eb  bl   #0x80b0             ; Call function
```

This is a standard ARM function prologue using Position Independent Code (PIC) pattern, typical of shared libraries loaded into a fixed process space.

### End-of-File Hash (0x456DF3, 140 bytes)

```
01 00 00 00  f3 6d 45 00  77 32 9b 94  f2 6c be bf
43 06 70 38  d1 a9 f3 56  66 35 87 ce  6c d1 8a a9
... (140 bytes total)
```

This is a cryptographic hash or signature appended to the container. The first 4 bytes (`0x00000001`) may indicate the hash type. The remaining 136 bytes contain a hash that could be used for integrity verification.

---

## Screen Resolution Settings for Newer Phones

To support newer phone screen resolutions, the following settings in the ICF configuration are relevant:

### Current Android Settings (from config section 2):

```ini
{OS=ANDROID}
[GL]
EGL_DEPTH_SIZE=16
[S3E]
SysGlesSuspendWithApp=0
MemUseMMapForCode=1
```

### For Modern Phone Screen Support:

1. **Add a new device-specific block** for modern displays:
   ```ini
   {ID=ANDROID "Pixel 5", "Pixel 6", "Galaxy S21", "Galaxy S22", "OnePlus 9", "OnePlus 10"}
   [S3E]
   WinWidth=2310
   WinHeight=1080
   AndroidPointMultiEnable=1
   ```

2. **Adjust EGL settings** for better framebuffer quality:
   ```ini
   {OS=ANDROID}
   [GL]
   EGL_DEPTH_SIZE=24
   EGL_STENCIL_SIZE=8
   ```

3. **Screen scaling** - add `DispFixRot` setting:
   ```ini
   {OS=ANDROID}
   [S3E]
   DispFixRot="FixedLandscape"
   ```

4. **High-DPI texture support**:
   ```ini
   [GX]
   MaxTextureSize=4096
   ```

---

## Container Summary

The `boz.s3e` file is a Marmalade XE3U archive with three logical sections:

1. **Configuration data** (0x004C–0x43F2): Three ICF config blocks containing global engine settings, game-specific settings, and production resource download configuration.

2. **Symbol table** (0x43FD–0x5D51): 391 JNI function names that the native `libs3e_android.so` registers at runtime via `RegisterNatives`.

3. **Binary payload** (0x5D52–0x456F9F): ARM executable code, texture offset tables, and embedded game assets. The file ends with a 140-byte cryptographic hash/signature.