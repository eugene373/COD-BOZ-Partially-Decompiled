package com.google.android.gms.maps

// Auto-emitted from smali.
// 1 fields, 14 methods.

class CameraUpdateFactory {
    private constructor()

    companion object {
    private var aim: com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate

    @JvmStatic fun a(p0: com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) { /* TODO(body): (Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/maps/CameraUpdateFactory;->aim:Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         sput-object v0, Lcom/google/android/gms/maps/CameraUpdateFactory;->aim:Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         goto :goto_0
    */

    private @JvmStatic fun mp(): com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate { return TODO("body: ()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/maps/CameraUpdateFactory;->aim:Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         const-string v1, "CameraUpdateFactory is not initialized"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         return-object v0
    */

    public @JvmStatic fun newCameraPosition(cameraPosition: com.google.android.gms.maps.model.CameraPosition): com.google.android.gms.maps.CameraUpdate { return TODO("body: (Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/maps/CameraUpdate;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/CameraUpdate;
    //         invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->mp()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v1
    //         invoke-interface {v1, p0}, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;->newCameraPosition(Lcom/google/android/gms/maps/model/CameraPosition;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/CameraUpdate;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun newLatLng(latLng: com.google.android.gms.maps.model.LatLng): com.google.android.gms.maps.CameraUpdate { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/CameraUpdate;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/CameraUpdate;
    //         invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->mp()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v1
    //         invoke-interface {v1, p0}, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;->newLatLng(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/CameraUpdate;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun newLatLngBounds(bounds: com.google.android.gms.maps.model.LatLngBounds, padding: Int): com.google.android.gms.maps.CameraUpdate { return TODO("body: (Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/CameraUpdate;
    //         invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->mp()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v1
    //         invoke-interface {v1, p0, p1}, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/CameraUpdate;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun newLatLngBounds(bounds: com.google.android.gms.maps.model.LatLngBounds, width: Int, height: Int, padding: Int): com.google.android.gms.maps.CameraUpdate { return TODO("body: (Lcom/google/android/gms/maps/model/LatLngBounds;III)Lcom/google/android/gms/maps/CameraUpdate;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/CameraUpdate;
    //         invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->mp()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v1
    //         invoke-interface {v1, p0, p1, p2, p3}, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;->newLatLngBoundsWithSize(Lcom/google/android/gms/maps/model/LatLngBounds;III)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/CameraUpdate;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun newLatLngZoom(latLng: com.google.android.gms.maps.model.LatLng, zoom: Float): com.google.android.gms.maps.CameraUpdate { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/CameraUpdate;
    //         invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->mp()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v1
    //         invoke-interface {v1, p0, p1}, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/CameraUpdate;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun scrollBy(xPixel: Float, yPixel: Float): com.google.android.gms.maps.CameraUpdate { return TODO("body: (FF)Lcom/google/android/gms/maps/CameraUpdate;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/CameraUpdate;
    //         invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->mp()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v1
    //         invoke-interface {v1, p0, p1}, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;->scrollBy(FF)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/CameraUpdate;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun zoomBy(amount: Float): com.google.android.gms.maps.CameraUpdate { return TODO("body: (F)Lcom/google/android/gms/maps/CameraUpdate;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/CameraUpdate;
    //         invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->mp()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v1
    //         invoke-interface {v1, p0}, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;->zoomBy(F)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/CameraUpdate;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun zoomBy(amount: Float, focus: android.graphics.Point): com.google.android.gms.maps.CameraUpdate { return TODO("body: (FLandroid/graphics/Point;)Lcom/google/android/gms/maps/CameraUpdate;") }
    /*
    //         .locals 4
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/CameraUpdate;
    //         invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->mp()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v1
    //         iget v2, p1, Landroid/graphics/Point;->x:I
    //         iget v3, p1, Landroid/graphics/Point;->y:I
    //         invoke-interface {v1, p0, v2, v3}, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;->zoomByWithFocus(FII)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/CameraUpdate;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun zoomIn(): com.google.android.gms.maps.CameraUpdate { return TODO("body: ()Lcom/google/android/gms/maps/CameraUpdate;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/CameraUpdate;
    //         invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->mp()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v1
    //         invoke-interface {v1}, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;->zoomIn()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/CameraUpdate;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun zoomOut(): com.google.android.gms.maps.CameraUpdate { return TODO("body: ()Lcom/google/android/gms/maps/CameraUpdate;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/CameraUpdate;
    //         invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->mp()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v1
    //         invoke-interface {v1}, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;->zoomOut()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/CameraUpdate;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun zoomTo(zoom: Float): com.google.android.gms.maps.CameraUpdate { return TODO("body: (F)Lcom/google/android/gms/maps/CameraUpdate;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/CameraUpdate;
    //         invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->mp()Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;
    //         move-result-object v1
    //         invoke-interface {v1, p0}, Lcom/google/android/gms/maps/internal/ICameraUpdateFactoryDelegate;->zoomTo(F)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/CameraUpdate;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    }
}
