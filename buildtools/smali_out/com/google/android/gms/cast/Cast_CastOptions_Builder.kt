package com.google.android.gms.cast

// Auto-emitted from smali.
// 3 fields, 5 methods.

class Cast_CastOptions_Builder {
    var EN: com.google.android.gms.cast.CastDevice
    var EO: com.google.android.gms.cast.Cast.Listener
    private var EP: Int

    private constructor(castDevice: com.google.android.gms.cast.CastDevice, castListener: com.google.android.gms.cast.Cast.Listener)

    constructor(x0: com.google.android.gms.cast.CastDevice, x1: com.google.android.gms.cast.Cast.Listener, x2: com.google.android.gms.cast.Cast.1)

    public fun build(): com.google.android.gms.cast.Cast.CastOptions { return TODO("body: ()Lcom/google/android/gms/cast/Cast$CastOptions;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/cast/Cast$CastOptions;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/cast/Cast$CastOptions;-><init>(Lcom/google/android/gms/cast/Cast$CastOptions$Builder;Lcom/google/android/gms/cast/Cast$1;)V
    //         return-object v0
    */

    public fun setVerboseLoggingEnabled(enabled: Boolean): com.google.android.gms.cast.Cast.CastOptions.Builder { return TODO("body: (Z)Lcom/google/android/gms/cast/Cast$CastOptions$Builder;") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/cast/Cast$CastOptions$Builder;->EP:I
    //         or-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/google/android/gms/cast/Cast$CastOptions$Builder;->EP:I
    //         :goto_0
    //         return-object p0
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/cast/Cast$CastOptions$Builder;->EP:I
    //         and-int/lit8 v0, v0, -0x2
    //         iput v0, p0, Lcom/google/android/gms/cast/Cast$CastOptions$Builder;->EP:I
    //         goto :goto_0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.cast.Cast.CastOptions.Builder): Int { return TODO("body: (Lcom/google/android/gms/cast/Cast$CastOptions$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/Cast$CastOptions$Builder;->EP:I
    //         return v0
    */

    }
}
