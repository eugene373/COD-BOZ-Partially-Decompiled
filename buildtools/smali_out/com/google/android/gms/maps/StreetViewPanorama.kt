package com.google.android.gms.maps

// Auto-emitted from smali.
// 1 fields, 21 methods.

open class StreetViewPanorama {
    private val ajb: com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate

    protected constructor(sv: com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate)

    public fun animateTo(camera: com.google.android.gms.maps.model.StreetViewPanoramaCamera, duration: Long) { /* TODO(body): (Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;J)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->animateTo(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;J)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun getLocation(): com.google.android.gms.maps.model.StreetViewPanoramaLocation { return TODO("body: ()Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->getStreetViewPanoramaLocation()Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun getPanoramaCamera(): com.google.android.gms.maps.model.StreetViewPanoramaCamera { return TODO("body: ()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->getPanoramaCamera()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun isPanningGesturesEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->isPanningGesturesEnabled()Z
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun isStreetNamesEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->isStreetNamesEnabled()Z
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun isUserNavigationEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->isUserNavigationEnabled()Z
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun isZoomGesturesEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->isZoomGesturesEnabled()Z
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    fun mC(): com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate { return TODO("body: ()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         return-object v0
    */

    public fun orientationToPoint(orientation: com.google.android.gms.maps.model.StreetViewPanoramaOrientation): android.graphics.Point { return TODO("body: (Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)Landroid/graphics/Point;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->orientationToPoint(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/graphics/Point;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun pointToOrientation(point: android.graphics.Point): com.google.android.gms.maps.model.StreetViewPanoramaOrientation { return TODO("body: (Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->pointToOrientation(Lcom/google/android/gms/dynamic/d;)Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnStreetViewPanoramaCameraChangeListener(listener: com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) { /* TODO(body): (Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->setOnStreetViewPanoramaCameraChangeListener(Lcom/google/android/gms/maps/internal/p;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/StreetViewPanorama$2;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/StreetViewPanorama$2;-><init>(Lcom/google/android/gms/maps/StreetViewPanorama;Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->setOnStreetViewPanoramaCameraChangeListener(Lcom/google/android/gms/maps/internal/p;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnStreetViewPanoramaChangeListener(listener: com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) { /* TODO(body): (Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaChangeListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->setOnStreetViewPanoramaChangeListener(Lcom/google/android/gms/maps/internal/q;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/StreetViewPanorama$1;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/StreetViewPanorama$1;-><init>(Lcom/google/android/gms/maps/StreetViewPanorama;Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaChangeListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->setOnStreetViewPanoramaChangeListener(Lcom/google/android/gms/maps/internal/q;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnStreetViewPanoramaClickListener(listener: com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) { /* TODO(body): (Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaClickListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->setOnStreetViewPanoramaClickListener(Lcom/google/android/gms/maps/internal/r;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/StreetViewPanorama$3;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/StreetViewPanorama$3;-><init>(Lcom/google/android/gms/maps/StreetViewPanorama;Lcom/google/android/gms/maps/StreetViewPanorama$OnStreetViewPanoramaClickListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->setOnStreetViewPanoramaClickListener(Lcom/google/android/gms/maps/internal/r;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setPanningGesturesEnabled(enablePanning: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->enablePanning(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setPosition(position: com.google.android.gms.maps.model.LatLng) { /* TODO(body): (Lcom/google/android/gms/maps/model/LatLng;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setPosition(position: com.google.android.gms.maps.model.LatLng, radius: Int) { /* TODO(body): (Lcom/google/android/gms/maps/model/LatLng;I)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->setPositionWithRadius(Lcom/google/android/gms/maps/model/LatLng;I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setPosition(panoId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->setPositionWithID(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setStreetNamesEnabled(enableStreetNames: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->enableStreetNames(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setUserNavigationEnabled(enableUserNavigation: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->enableUserNavigation(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setZoomGesturesEnabled(enableZoom: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanorama;->ajb:Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->enableZoom(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

}
