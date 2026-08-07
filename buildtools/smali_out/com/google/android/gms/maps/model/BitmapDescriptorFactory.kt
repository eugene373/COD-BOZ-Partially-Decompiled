package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 11 fields, 10 methods.

class BitmapDescriptorFactory {
    private constructor()

    companion object {
    @JvmField public val HUE_AZURE: Float = 0.0f
    @JvmField public val HUE_BLUE: Float = 0.0f
    @JvmField public val HUE_CYAN: Float = 0.0f
    @JvmField public val HUE_GREEN: Float = 0.0f
    @JvmField public val HUE_MAGENTA: Float = 0.0f
    @JvmField public val HUE_ORANGE: Float = 0.0f
    @JvmField public val HUE_RED: Float = 0.0f
    @JvmField public val HUE_ROSE: Float = 0.0f
    @JvmField public val HUE_VIOLET: Float = 0.0f
    @JvmField public val HUE_YELLOW: Float = 0.0f
    private var ajA: com.google.android.gms.maps.model.internal.a

    public @JvmStatic fun a(p0: com.google.android.gms.maps.model.internal.a) { /* TODO(body): (Lcom/google/android/gms/maps/model/internal/a;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->ajA:Lcom/google/android/gms/maps/model/internal/a;
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/maps/model/internal/a;
    //         sput-object v0, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->ajA:Lcom/google/android/gms/maps/model/internal/a;
    //         goto :goto_0
    */

    public @JvmStatic fun defaultMarker(): com.google.android.gms.maps.model.BitmapDescriptor { return TODO("body: ()Lcom/google/android/gms/maps/model/BitmapDescriptor;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         invoke-static {}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->mN()Lcom/google/android/gms/maps/model/internal/a;
    //         move-result-object v1
    //         invoke-interface {v1}, Lcom/google/android/gms/maps/model/internal/a;->mS()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/BitmapDescriptor;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun defaultMarker(hue: Float): com.google.android.gms.maps.model.BitmapDescriptor { return TODO("body: (F)Lcom/google/android/gms/maps/model/BitmapDescriptor;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         invoke-static {}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->mN()Lcom/google/android/gms/maps/model/internal/a;
    //         move-result-object v1
    //         invoke-interface {v1, p0}, Lcom/google/android/gms/maps/model/internal/a;->c(F)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/BitmapDescriptor;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun fromAsset(assetName: String): com.google.android.gms.maps.model.BitmapDescriptor { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/maps/model/BitmapDescriptor;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         invoke-static {}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->mN()Lcom/google/android/gms/maps/model/internal/a;
    //         move-result-object v1
    //         invoke-interface {v1, p0}, Lcom/google/android/gms/maps/model/internal/a;->ca(Ljava/lang/String;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/BitmapDescriptor;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun fromBitmap(image: android.graphics.Bitmap): com.google.android.gms.maps.model.BitmapDescriptor { return TODO("body: (Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/BitmapDescriptor;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         invoke-static {}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->mN()Lcom/google/android/gms/maps/model/internal/a;
    //         move-result-object v1
    //         invoke-interface {v1, p0}, Lcom/google/android/gms/maps/model/internal/a;->b(Landroid/graphics/Bitmap;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/BitmapDescriptor;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun fromFile(fileName: String): com.google.android.gms.maps.model.BitmapDescriptor { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/maps/model/BitmapDescriptor;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         invoke-static {}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->mN()Lcom/google/android/gms/maps/model/internal/a;
    //         move-result-object v1
    //         invoke-interface {v1, p0}, Lcom/google/android/gms/maps/model/internal/a;->cb(Ljava/lang/String;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/BitmapDescriptor;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun fromPath(absolutePath: String): com.google.android.gms.maps.model.BitmapDescriptor { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/maps/model/BitmapDescriptor;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         invoke-static {}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->mN()Lcom/google/android/gms/maps/model/internal/a;
    //         move-result-object v1
    //         invoke-interface {v1, p0}, Lcom/google/android/gms/maps/model/internal/a;->cc(Ljava/lang/String;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/BitmapDescriptor;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    public @JvmStatic fun fromResource(resourceId: Int): com.google.android.gms.maps.model.BitmapDescriptor { return TODO("body: (I)Lcom/google/android/gms/maps/model/BitmapDescriptor;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         invoke-static {}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->mN()Lcom/google/android/gms/maps/model/internal/a;
    //         move-result-object v1
    //         invoke-interface {v1, p0}, Lcom/google/android/gms/maps/model/internal/a;->eN(I)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/maps/model/BitmapDescriptor;-><init>(Lcom/google/android/gms/dynamic/d;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    */

    private @JvmStatic fun mN(): com.google.android.gms.maps.model.internal.a { return TODO("body: ()Lcom/google/android/gms/maps/model/internal/a;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->ajA:Lcom/google/android/gms/maps/model/internal/a;
    //         const-string v1, "IBitmapDescriptorFactory is not initialized"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/maps/model/internal/a;
    //         return-object v0
    */

    }
}
