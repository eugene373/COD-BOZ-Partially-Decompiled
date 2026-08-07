package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 9 methods.

open class lu: com.google.android.gms.location.FusedLocationProviderApi {
    public constructor()

    public fun getLastLocation(client: com.google.android.gms.common.api.GoogleApiClient): android.location.Location { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/location/Location;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/location/LocationServices;->e(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/internal/lz;
    //         move-result-object v0
    //         :try_start_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/lz;->getLastLocation()Landroid/location/Location;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun removeLocationUpdates(client: com.google.android.gms.common.api.GoogleApiClient, callbackIntent: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/lu$6;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/lu$6;-><init>(Lcom/google/android/gms/internal/lu;Landroid/app/PendingIntent;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeLocationUpdates(client: com.google.android.gms.common.api.GoogleApiClient, listener: com.google.android.gms.location.LocationListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/lu$5;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/lu$5;-><init>(Lcom/google/android/gms/internal/lu;Lcom/google/android/gms/location/LocationListener;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun requestLocationUpdates(client: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.location.LocationRequest, callbackIntent: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/lu$4;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/internal/lu$4;-><init>(Lcom/google/android/gms/internal/lu;Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun requestLocationUpdates(client: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.location.LocationRequest, listener: com.google.android.gms.location.LocationListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/lu$1;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/internal/lu$1;-><init>(Lcom/google/android/gms/internal/lu;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun requestLocationUpdates(client: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.location.LocationRequest, listener: com.google.android.gms.location.LocationListener, looper: android.os.Looper): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/lu$3;
    //         invoke-direct {v0, p0, p2, p3, p4}, Lcom/google/android/gms/internal/lu$3;-><init>(Lcom/google/android/gms/internal/lu;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setMockLocation(client: com.google.android.gms.common.api.GoogleApiClient, mockLocation: android.location.Location): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/location/Location;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/lu$2;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/lu$2;-><init>(Lcom/google/android/gms/internal/lu;Landroid/location/Location;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setMockMode(client: com.google.android.gms.common.api.GoogleApiClient, isMockMode: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/lu$7;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/lu$7;-><init>(Lcom/google/android/gms/internal/lu;Z)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
