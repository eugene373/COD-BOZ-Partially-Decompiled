package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 1 fields, 7 methods.

class IndoorBuilding {
    private val ajW: com.google.android.gms.maps.model.internal.d

    public constructor(delegate: com.google.android.gms.maps.model.internal.d)

    public fun equals(other: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         instance-of v0, p1, Lcom/google/android/gms/maps/model/IndoorBuilding;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         .end local p1    # "other":Ljava/lang/Object;
    //         :goto_0
    //         return v0
    //         .restart local p1    # "other":Ljava/lang/Object;
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/IndoorBuilding;->ajW:Lcom/google/android/gms/maps/model/internal/d;
    //         check-cast p1, Lcom/google/android/gms/maps/model/IndoorBuilding;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         iget-object v1, p1, Lcom/google/android/gms/maps/model/IndoorBuilding;->ajW:Lcom/google/android/gms/maps/model/internal/d;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/maps/model/internal/d;->b(Lcom/google/android/gms/maps/model/internal/d;)Z
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

    public fun getActiveLevelIndex(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/IndoorBuilding;->ajW:Lcom/google/android/gms/maps/model/internal/d;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/d;->getActiveLevelIndex()I
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

    public fun getDefaultLevelIndex(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/IndoorBuilding;->ajW:Lcom/google/android/gms/maps/model/internal/d;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/d;->getActiveLevelIndex()I
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

    public fun getLevels(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/maps/model/IndoorLevel;",
    //                 ">;"
    //             }
    //         .end annotation
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/IndoorBuilding;->ajW:Lcom/google/android/gms/maps/model/internal/d;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/d;->getLevels()Ljava/util/List;
    //         move-result-object v0
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v2
    //         invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/IBinder;
    //         new-instance v3, Lcom/google/android/gms/maps/model/IndoorLevel;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/model/internal/e$a;->bt(Landroid/os/IBinder;)Lcom/google/android/gms/maps/model/internal/e;
    //         move-result-object v0
    //         invoke-direct {v3, v0}, Lcom/google/android/gms/maps/model/IndoorLevel;-><init>(Lcom/google/android/gms/maps/model/internal/e;)V
    //         invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V
    //         throw v1
    //         :cond_0
    //         return-object v1
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/IndoorBuilding;->ajW:Lcom/google/android/gms/maps/model/internal/d;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/d;->hashCodeRemote()I
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

    public fun isUnderground(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/IndoorBuilding;->ajW:Lcom/google/android/gms/maps/model/internal/d;
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/model/internal/d;->isUnderground()Z
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

}
