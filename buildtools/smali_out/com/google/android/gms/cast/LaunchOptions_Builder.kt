package com.google.android.gms.cast

// Auto-emitted from smali.
// 1 fields, 4 methods.

class LaunchOptions_Builder {
    private var Fd: com.google.android.gms.cast.LaunchOptions

    public constructor()

    public fun build(): com.google.android.gms.cast.LaunchOptions { return TODO("body: ()Lcom/google/android/gms/cast/LaunchOptions;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/LaunchOptions$Builder;->Fd:Lcom/google/android/gms/cast/LaunchOptions;
    //         return-object v0
    */

    public fun setLocale(locale: java.util.Locale): com.google.android.gms.cast.LaunchOptions.Builder { return TODO("body: (Ljava/util/Locale;)Lcom/google/android/gms/cast/LaunchOptions$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/cast/LaunchOptions$Builder;->Fd:Lcom/google/android/gms/cast/LaunchOptions;
    //         invoke-static {p1}, Lcom/google/android/gms/internal/ik;->b(Ljava/util/Locale;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/LaunchOptions;->setLanguage(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setRelaunchIfRunning(relaunchIfRunning: Boolean): com.google.android.gms.cast.LaunchOptions.Builder { return TODO("body: (Z)Lcom/google/android/gms/cast/LaunchOptions$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/LaunchOptions$Builder;->Fd:Lcom/google/android/gms/cast/LaunchOptions;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/LaunchOptions;->setRelaunchIfRunning(Z)V
    //         return-object p0
    */

}
