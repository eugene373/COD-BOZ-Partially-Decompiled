package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 1 fields, 27 methods.

class Marker {
    private val akc: com.google.android.gms.maps.model.internal.f

    public constructor(delegate: com.google.android.gms.maps.model.internal.f)

    public fun equals(other: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         instance-of v0, p1, Lcom/google/android/gms/maps/model/Marker;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         .end local p1    # "other":Ljava/lang/Object;
    //         :goto_0
    //         return v0
    //         .restart local p1    # "other":Ljava/lang/Object;
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         check-cast p1, Lcom/google/android/gms/maps/model/Marker;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         iget-object v1, p1, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/model/internal/f;->h(Lcom/google/android/gms/maps/model/internal/f;)Z
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun getAlpha(): Float { return TODO("body: ()F") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->getAlpha()F
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

    public fun getId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->getId()Ljava/lang/String;
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

    public fun getPosition(): com.google.android.gms.maps.model.LatLng { return TODO("body: ()Lcom/google/android/gms/maps/model/LatLng;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->getPosition()Lcom/google/android/gms/maps/model/LatLng;
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

    public fun getRotation(): Float { return TODO("body: ()F") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->getRotation()F
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

    public fun getSnippet(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->getSnippet()Ljava/lang/String;
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

    public fun getTitle(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->getTitle()Ljava/lang/String;
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

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->hashCodeRemote()I
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

    public fun hideInfoWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->hideInfoWindow()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun isDraggable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->isDraggable()Z
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

    public fun isFlat(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->isFlat()Z
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

    public fun isInfoWindowShown(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->isInfoWindowShown()Z
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

    public fun isVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->isVisible()Z
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

    public fun remove() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->remove()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setAlpha(alpha: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/f;->setAlpha(F)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setAnchor(anchorU: Float, anchorV: Float) { /* TODO(body): (FF)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/maps/model/internal/f;->setAnchor(FF)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setDraggable(draggable: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/f;->setDraggable(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setFlat(flat: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/f;->setFlat(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setIcon(icon: com.google.android.gms.maps.model.BitmapDescriptor) { /* TODO(body): (Lcom/google/android/gms/maps/model/BitmapDescriptor;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-virtual {p1}, Lcom/google/android/gms/maps/model/BitmapDescriptor;->mo()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/model/internal/f;->n(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setInfoWindowAnchor(anchorU: Float, anchorV: Float) { /* TODO(body): (FF)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/maps/model/internal/f;->setInfoWindowAnchor(FF)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setPosition(latlng: com.google.android.gms.maps.model.LatLng) { /* TODO(body): (Lcom/google/android/gms/maps/model/LatLng;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/f;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setRotation(rotation: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/f;->setRotation(F)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setSnippet(snippet: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/f;->setSnippet(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setTitle(title: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/f;->setTitle(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setVisible(visible: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/f;->setVisible(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun showInfoWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Marker;->akc:Lcom/google/android/gms/maps/model/internal/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/f;->showInfoWindow()V
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
