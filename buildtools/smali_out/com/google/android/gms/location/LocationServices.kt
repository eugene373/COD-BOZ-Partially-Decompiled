package com.google.android.gms.location

// Auto-emitted from smali.
// 5 fields, 4 methods.

open class LocationServices {
    private constructor()

    companion object {
    @JvmField public val API: com.google.android.gms.common.api.Api = null!!
    private val CU: com.google.android.gms.common.api.Api.c = null!!
    private val CV: com.google.android.gms.common.api.Api.b = null!!
    @JvmField public var FusedLocationApi: com.google.android.gms.location.FusedLocationProviderApi
    @JvmField public var GeofencingApi: com.google.android.gms.location.GeofencingApi

    public @JvmStatic fun e(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.internal.lz { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/internal/lz;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         if-eqz p0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "GoogleApiClient parameter is required."
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         sget-object v0, Lcom/google/android/gms/location/LocationServices;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lz;
    //         if-eqz v0, :cond_1
    //         :goto_1
    //         const-string v2, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature."
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         return-object v0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v1, v2
    //         goto :goto_1
    */

    @JvmStatic fun lU(): com.google.android.gms.common.api.Api.c { return TODO("body: ()Lcom/google/android/gms/common/api/Api$c;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/location/LocationServices;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         return-object v0
    */

    }
}
