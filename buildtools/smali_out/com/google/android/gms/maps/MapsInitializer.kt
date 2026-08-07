package com.google.android.gms.maps

// Auto-emitted from smali.
// 0 fields, 3 methods.

class MapsInitializer {
    private constructor()

    companion object {
    public @JvmStatic fun a(p0: com.google.android.gms.maps.internal.c) { /* TODO(body): (Lcom/google/android/gms/maps/internal/c;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         invoke-interface {p0}, Lcom/google/android/gms/maps/internal/c;->mI()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/maps/CameraUpdateFactory;->a(Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;)V
    //         invoke-interface {p0}, Lcom/google/android/gms/maps/internal/c;->mJ()Lcom/google/android/gms/maps/model/internal/a;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->a(Lcom/google/android/gms/maps/model/internal/a;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun initialize(context: android.content.Context): Int { return TODO("body: (Landroid/content/Context;)I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_start_0
    //         invoke-static {p0}, Lcom/google/android/gms/maps/internal/u;->S(Landroid/content/Context;)Lcom/google/android/gms/maps/internal/c;
    //         :try_end_0
    //         .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/maps/MapsInitializer;->a(Lcom/google/android/gms/maps/internal/c;)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         iget v0, v0, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;->errorCode:I
    //         goto :goto_0
    */

    }
}
