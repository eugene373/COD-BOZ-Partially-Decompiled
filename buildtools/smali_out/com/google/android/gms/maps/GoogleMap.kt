package com.google.android.gms.maps

// Auto-emitted from smali.
// 7 fields, 46 methods.

class GoogleMap {
    private val ain: com.google.android.gms.maps.internal.IGoogleMapDelegate
    private var aio: com.google.android.gms.maps.UiSettings

    protected constructor(map: com.google.android.gms.maps.internal.IGoogleMapDelegate)

    public fun addCircle(options: com.google.android.gms.maps.model.CircleOptions): com.google.android.gms.maps.model.Circle { return TODO("body: (Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/Circle;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/Circle;
    //         iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v1, p1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->addCircle(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/internal/b;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/Circle;-><init>(Lcom/google/android/gms/maps/model/internal/b;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun addGroundOverlay(options: com.google.android.gms.maps.model.GroundOverlayOptions): com.google.android.gms.maps.model.GroundOverlay { return TODO("body: (Lcom/google/android/gms/maps/model/GroundOverlayOptions;)Lcom/google/android/gms/maps/model/GroundOverlay;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->addGroundOverlay(Lcom/google/android/gms/maps/model/GroundOverlayOptions;)Lcom/google/android/gms/maps/model/internal/c;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/GroundOverlay;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/GroundOverlay;-><init>(Lcom/google/android/gms/maps/model/internal/c;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun addMarker(options: com.google.android.gms.maps.model.MarkerOptions): com.google.android.gms.maps.model.Marker { return TODO("body: (Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/internal/f;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/Marker;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/Marker;-><init>(Lcom/google/android/gms/maps/model/internal/f;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun addPolygon(options: com.google.android.gms.maps.model.PolygonOptions): com.google.android.gms.maps.model.Polygon { return TODO("body: (Lcom/google/android/gms/maps/model/PolygonOptions;)Lcom/google/android/gms/maps/model/Polygon;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/Polygon;
    //         iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v1, p1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->addPolygon(Lcom/google/android/gms/maps/model/PolygonOptions;)Lcom/google/android/gms/maps/model/internal/g;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/Polygon;-><init>(Lcom/google/android/gms/maps/model/internal/g;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun addPolyline(options: com.google.android.gms.maps.model.PolylineOptions): com.google.android.gms.maps.model.Polyline { return TODO("body: (Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/Polyline;
    //         iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v1, p1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/internal/IPolylineDelegate;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/Polyline;-><init>(Lcom/google/android/gms/maps/model/internal/IPolylineDelegate;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun addTileOverlay(options: com.google.android.gms.maps.model.TileOverlayOptions): com.google.android.gms.maps.model.TileOverlay { return TODO("body: (Lcom/google/android/gms/maps/model/TileOverlayOptions;)Lcom/google/android/gms/maps/model/TileOverlay;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->addTileOverlay(Lcom/google/android/gms/maps/model/TileOverlayOptions;)Lcom/google/android/gms/maps/model/internal/h;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/TileOverlay;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/TileOverlay;-><init>(Lcom/google/android/gms/maps/model/internal/h;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun animateCamera(update: com.google.android.gms.maps.CameraUpdate) { /* TODO(body): (Lcom/google/android/gms/maps/CameraUpdate;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-virtual {p1}, Lcom/google/android/gms/maps/CameraUpdate;->mo()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->animateCamera(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun animateCamera(update: com.google.android.gms.maps.CameraUpdate, durationMs: Int, callback: com.google.android.gms.maps.GoogleMap.CancelableCallback) { /* TODO(body): (Lcom/google/android/gms/maps/CameraUpdate;ILcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-virtual {p1}, Lcom/google/android/gms/maps/CameraUpdate;->mo()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v2
    //         if-nez p3, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         invoke-interface {v1, v2, p2, v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->animateCameraWithDurationAndCallback(Lcom/google/android/gms/dynamic/d;ILcom/google/android/gms/maps/internal/b;)V
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/maps/GoogleMap$a;
    //         invoke-direct {v0, p3}, Lcom/google/android/gms/maps/GoogleMap$a;-><init>(Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun animateCamera(update: com.google.android.gms.maps.CameraUpdate, callback: com.google.android.gms.maps.GoogleMap.CancelableCallback) { /* TODO(body): (Lcom/google/android/gms/maps/CameraUpdate;Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-virtual {p1}, Lcom/google/android/gms/maps/CameraUpdate;->mo()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v2
    //         if-nez p2, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         invoke-interface {v1, v2, v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->animateCameraWithCallback(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/maps/internal/b;)V
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/maps/GoogleMap$a;
    //         invoke-direct {v0, p2}, Lcom/google/android/gms/maps/GoogleMap$a;-><init>(Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->clear()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun getCameraPosition(): com.google.android.gms.maps.model.CameraPosition { return TODO("body: ()Lcom/google/android/gms/maps/model/CameraPosition;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->getCameraPosition()Lcom/google/android/gms/maps/model/CameraPosition;
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

    public fun getFocusedBuilding(): com.google.android.gms.maps.model.IndoorBuilding { return TODO("body: ()Lcom/google/android/gms/maps/model/IndoorBuilding;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->getFocusedBuilding()Lcom/google/android/gms/maps/model/internal/d;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/IndoorBuilding;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/IndoorBuilding;-><init>(Lcom/google/android/gms/maps/model/internal/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun getMapType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->getMapType()I
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

    public fun getMaxZoomLevel(): Float { return TODO("body: ()F") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->getMaxZoomLevel()F
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

    public fun getMinZoomLevel(): Float { return TODO("body: ()F") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->getMinZoomLevel()F
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

    public fun getMyLocation(): android.location.Location { return TODO("body: ()Landroid/location/Location;") }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->getMyLocation()Landroid/location/Location;
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

    public fun getProjection(): com.google.android.gms.maps.Projection { return TODO("body: ()Lcom/google/android/gms/maps/Projection;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/Projection;
    //         iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->getProjection()Lcom/google/android/gms/maps/internal/IProjectionDelegate;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/Projection;-><init>(Lcom/google/android/gms/maps/internal/IProjectionDelegate;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun getUiSettings(): com.google.android.gms.maps.UiSettings { return TODO("body: ()Lcom/google/android/gms/maps/UiSettings;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->aio:Lcom/google/android/gms/maps/UiSettings;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/maps/UiSettings;
    //         iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->getUiSettings()Lcom/google/android/gms/maps/internal/IUiSettingsDelegate;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/UiSettings;-><init>(Lcom/google/android/gms/maps/internal/IUiSettingsDelegate;)V
    //         iput-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->aio:Lcom/google/android/gms/maps/UiSettings;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->aio:Lcom/google/android/gms/maps/UiSettings;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun isBuildingsEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->isBuildingsEnabled()Z
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

    public fun isIndoorEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->isIndoorEnabled()Z
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

    public fun isMyLocationEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->isMyLocationEnabled()Z
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

    public fun isTrafficEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->isTrafficEnabled()Z
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

    public fun moveCamera(update: com.google.android.gms.maps.CameraUpdate) { /* TODO(body): (Lcom/google/android/gms/maps/CameraUpdate;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-virtual {p1}, Lcom/google/android/gms/maps/CameraUpdate;->mo()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->moveCamera(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    fun mq(): com.google.android.gms.maps.internal.IGoogleMapDelegate { return TODO("body: ()Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         return-object v0
    */

    public fun setBuildingsEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setBuildingsEnabled(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setIndoorEnabled(enabled: Boolean): Boolean { return TODO("body: (Z)Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setIndoorEnabled(Z)Z
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

    public fun setInfoWindowAdapter(adapter: com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setInfoWindowAdapter(Lcom/google/android/gms/maps/internal/d;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$13;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$13;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setInfoWindowAdapter(Lcom/google/android/gms/maps/internal/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setLocationSource(source: com.google.android.gms.maps.LocationSource) { /* TODO(body): (Lcom/google/android/gms/maps/LocationSource;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setLocationSource(Lcom/google/android/gms/maps/internal/ILocationSourceDelegate;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$6;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$6;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/LocationSource;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setLocationSource(Lcom/google/android/gms/maps/internal/ILocationSourceDelegate;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setMapType(type: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setMapType(I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setMyLocationEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setMyLocationEnabled(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnCameraChangeListener(listener: com.google.android.gms.maps.GoogleMap.OnCameraChangeListener) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnCameraChangeListener(Lcom/google/android/gms/maps/internal/e;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$7;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$7;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnCameraChangeListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnCameraChangeListener(Lcom/google/android/gms/maps/internal/e;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnIndoorStateChangeListener(listener: com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnIndoorStateChangeListener(Lcom/google/android/gms/maps/internal/f;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$1;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$1;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnIndoorStateChangeListener(Lcom/google/android/gms/maps/internal/f;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnInfoWindowClickListener(listener: com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnInfoWindowClickListener(Lcom/google/android/gms/maps/internal/g;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$12;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$12;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnInfoWindowClickListener(Lcom/google/android/gms/maps/internal/g;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnMapClickListener(listener: com.google.android.gms.maps.GoogleMap.OnMapClickListener) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMapClickListener(Lcom/google/android/gms/maps/internal/i;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$8;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$8;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnMapClickListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMapClickListener(Lcom/google/android/gms/maps/internal/i;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnMapLoadedCallback(callback: com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$OnMapLoadedCallback;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMapLoadedCallback(Lcom/google/android/gms/maps/internal/j;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$4;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$4;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnMapLoadedCallback;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMapLoadedCallback(Lcom/google/android/gms/maps/internal/j;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnMapLongClickListener(listener: com.google.android.gms.maps.GoogleMap.OnMapLongClickListener) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMapLongClickListener(Lcom/google/android/gms/maps/internal/k;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$9;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$9;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnMapLongClickListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMapLongClickListener(Lcom/google/android/gms/maps/internal/k;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnMarkerClickListener(listener: com.google.android.gms.maps.GoogleMap.OnMarkerClickListener) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMarkerClickListener(Lcom/google/android/gms/maps/internal/l;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$10;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$10;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMarkerClickListener(Lcom/google/android/gms/maps/internal/l;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnMarkerDragListener(listener: com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMarkerDragListener(Lcom/google/android/gms/maps/internal/m;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$11;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$11;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMarkerDragListener(Lcom/google/android/gms/maps/internal/m;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnMyLocationButtonClickListener(listener: com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMyLocationButtonClickListener(Lcom/google/android/gms/maps/internal/n;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$3;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$3;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnMyLocationButtonClickListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMyLocationButtonClickListener(Lcom/google/android/gms/maps/internal/n;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setOnMyLocationChangeListener(listener: com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$OnMyLocationChangeListener;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMyLocationChangeListener(Lcom/google/android/gms/maps/internal/o;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v1, Lcom/google/android/gms/maps/GoogleMap$2;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$2;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$OnMyLocationChangeListener;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setOnMyLocationChangeListener(Lcom/google/android/gms/maps/internal/o;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setPadding(left: Int, top: Int, right: Int, bottom: Int) { /* TODO(body): (IIII)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setPadding(IIII)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setTrafficEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->setTrafficEnabled(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun snapshot(callback: com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/maps/GoogleMap;->snapshot(Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;Landroid/graphics/Bitmap;)V
    //         return-void
    */

    public fun snapshot(callback: com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback, bitmap: android.graphics.Bitmap) { /* TODO(body): (Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;Landroid/graphics/Bitmap;)V */ }
    /*
    //         .locals 3
    //         if-eqz p2, :cond_0
    //         invoke-static {p2}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         :goto_0
    //         check-cast v0, Lcom/google/android/gms/dynamic/e;
    //         check-cast v0, Lcom/google/android/gms/dynamic/e;
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         new-instance v2, Lcom/google/android/gms/maps/GoogleMap$5;
    //         invoke-direct {v2, p0, p1}, Lcom/google/android/gms/maps/GoogleMap$5;-><init>(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V
    //         invoke-interface {v1, v2, v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->snapshot(Lcom/google/android/gms/maps/internal/s;Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun stopAnimation() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap;->ain:Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;->stopAnimation()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    companion object {
    @JvmField public val MAP_TYPE_HYBRID: Int = 0x4
    @JvmField public val MAP_TYPE_NONE: Int = 0x0
    @JvmField public val MAP_TYPE_NORMAL: Int = 0x1
    @JvmField public val MAP_TYPE_SATELLITE: Int = 0x2
    @JvmField public val MAP_TYPE_TERRAIN: Int = 0x3
    }
}
