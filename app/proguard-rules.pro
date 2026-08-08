# The native .so libraries (libs3e_android.so, libIsDevice.so,
# libs3eGooglePlayServices.so, and per-extension .so files) bind to Java/Kotlin
# members by their exact names at runtime via JNI FindClass / GetMethodID /
# RegisterNatives. R8 obfuscation/shrinking renames or removes those members and
# the native loader then fails with NoSuchMethodError / RegisterNatives failures
# (e.g. LoaderView.videoStoppedNotify, s3eTouchpad.s3eTouchpadInit). Keep the
# entire Marmalade package, the app entry point, the savegame helper, and ALL
# native/external methods everywhere unobfuscated and unstripped.

-keep class com.ideaworks3d.** { *; }
-keepclassmembers class com.ideaworks3d.** { *; }

-keep class com.activision.boz.** { *; }
-keepclassmembers class com.activision.boz.** { *; }

-keep class com.savegame.** { *; }
-keepclassmembers class com.savegame.** { *; }

# IsDevice and the s3e* extension classes live under com.ideaworks3d.* (already
# covered above) but some extensions also live under their own packages — keep
# any class with native methods anywhere in the app.
-keepclasseswithmembernames class * {
    native <methods>;
}
-keepclassmembers class * {
    public <init>();
}

# The native loader resolves some symbols by lowercase-spelling static methods
# (e.g. getInstance) — keep all statics on the IDEAWORKS classes too (redundant
# with the broad rule above but explicit for clarity).
-keepclassmembers class com.ideaworks3d.** {
    public static *;
}
