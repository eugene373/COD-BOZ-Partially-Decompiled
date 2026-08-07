package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 1 fields, 19 methods.

class Circle {
    private val ajF: com.google.android.gms.maps.model.internal.b

    public constructor(delegate: com.google.android.gms.maps.model.internal.b)

    public fun equals(other: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         instance-of v0, p1, Lcom/google/android/gms/maps/model/Circle;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         .end local p1    # "other":Ljava/lang/Object;
    //         :goto_0
    //         return v0
    //         .restart local p1    # "other":Ljava/lang/Object;
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         check-cast p1, Lcom/google/android/gms/maps/model/Circle;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         iget-object v1, p1, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/model/internal/b;->a(Lcom/google/android/gms/maps/model/internal/b;)Z
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

    public fun getCenter(): com.google.android.gms.maps.model.LatLng { return TODO("body: ()Lcom/google/android/gms/maps/model/LatLng;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/b;->getCenter()Lcom/google/android/gms/maps/model/LatLng;
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

    public fun getFillColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/b;->getFillColor()I
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
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/b;->getId()Ljava/lang/String;
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

    public fun getRadius(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/b;->getRadius()D
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-wide v0
    //         return-wide v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun getStrokeColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/b;->getStrokeColor()I
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

    public fun getStrokeWidth(): Float { return TODO("body: ()F") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/b;->getStrokeWidth()F
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

    public fun getZIndex(): Float { return TODO("body: ()F") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/b;->getZIndex()F
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

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/b;->hashCodeRemote()I
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
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/b;->isVisible()Z
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
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/b;->remove()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setCenter(center: com.google.android.gms.maps.model.LatLng) { /* TODO(body): (Lcom/google/android/gms/maps/model/LatLng;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/b;->setCenter(Lcom/google/android/gms/maps/model/LatLng;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setFillColor(color: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/b;->setFillColor(I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setRadius(radius: Double) { /* TODO(body): (D)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/maps/model/internal/b;->setRadius(D)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setStrokeColor(color: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/b;->setStrokeColor(I)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setStrokeWidth(width: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/b;->setStrokeWidth(F)V
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
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/b;->setVisible(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public fun setZIndex(zIndex: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/Circle;->ajF:Lcom/google/android/gms/maps/model/internal/b;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/internal/b;->setZIndex(F)V
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
