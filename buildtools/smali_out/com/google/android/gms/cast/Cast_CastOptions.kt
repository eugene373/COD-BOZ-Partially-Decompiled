package com.google.android.gms.cast

// Auto-emitted from smali.
// 3 fields, 4 methods.

class Cast_CastOptions: com.google.android.gms.common.api.Api.ApiOptions.HasOptions {
    val EK: com.google.android.gms.cast.CastDevice
    val EL: com.google.android.gms.cast.Cast.Listener
    private val EM: Int

    private constructor(builder: com.google.android.gms.cast.Cast.CastOptions.Builder)

    constructor(x0: com.google.android.gms.cast.Cast.CastOptions.Builder, x1: com.google.android.gms.cast.Cast.1)

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.cast.Cast.CastOptions): Int { return TODO("body: (Lcom/google/android/gms/cast/Cast$CastOptions;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/Cast$CastOptions;->EM:I
    //         return v0
    */

    public @JvmStatic fun builder(castDevice: com.google.android.gms.cast.CastDevice, castListener: com.google.android.gms.cast.Cast.Listener): com.google.android.gms.cast.Cast.CastOptions.Builder { return TODO("body: (Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/Cast$Listener;)Lcom/google/android/gms/cast/Cast$CastOptions$Builder;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/cast/Cast$CastOptions$Builder;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/cast/Cast$CastOptions$Builder;-><init>(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/Cast$Listener;Lcom/google/android/gms/cast/Cast$1;)V
    //         return-object v0
    */

    }
}
