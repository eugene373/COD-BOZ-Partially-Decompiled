package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 1 fields, 192 methods.

open class IGamesService_Stub_Proxy: com.google.android.gms.games.internal.IGamesService {
    private var lb: android.os.IBinder

    constructor(remote: android.os.IBinder)

    public fun N(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13cc
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun O(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2efa
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun P(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x32c9
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: ByteArray, p2: String, p3: String): Int { return TODO("body: (Lcom/google/android/gms/games/internal/IGamesCallbacks;[BLjava/lang/String;Ljava/lang/String;)I") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeByteArray([B)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13a9
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: Int, p1: Int, p2: Boolean): android.content.Intent { return TODO("body: (IIZ)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p3, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2330
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: Int, p1: ByteArray, p2: Int, p3: String): android.content.Intent { return TODO("body: (I[BILjava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeByteArray([B)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x271c
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.achievement.AchievementEntity): android.content.Intent { return TODO("body: (Lcom/google/android/gms/games/achievement/AchievementEntity;)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x32cd
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_1
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.games.internal.multiplayer.ZInvitationCluster, p1: String, p2: String): android.content.Intent { return TODO("body: (Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2725
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_1
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.games.internal.request.GameRequestCluster, p1: String): android.content.Intent { return TODO("body: (Lcom/google/android/gms/games/internal/request/GameRequestCluster;Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2726
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_1
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.games.multiplayer.realtime.RoomEntity, p1: Int): android.content.Intent { return TODO("body: (Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;I)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2333
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_1
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun a(p0: String, p1: Boolean, p2: Boolean, p3: Int): android.content.Intent { return TODO("body: (Ljava/lang/String;ZZI)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p2, :cond_0
    //         move v2, v0
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p3, :cond_1
    //         :goto_1
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v3, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2ee1
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_2
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         move v2, v1
    //         goto :goto_0
    //         :cond_1
    //         move v0, v1
    //         goto :goto_1
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: Array<com.google.android.gms.games.multiplayer.ParticipantEntity>, p1: String, p2: String, p3: android.net.Uri, p4: android.net.Uri): android.content.Intent { return TODO("body: ([Lcom/google/android/gms/games/multiplayer/ParticipantEntity;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         invoke-virtual {v1, p1, v0}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p4, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p4, v1, v0}, Landroid/net/Uri;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p5, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p5, v1, v0}, Landroid/net/Uri;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2347
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_2
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_2
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_1
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_2
    */

    public fun a(p0: Long, p1: String) { /* TODO(body): (JLjava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f53
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: android.os.IBinder, p1: android.os.Bundle) { /* TODO(body): (Landroid/os/IBinder;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x138d
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.drive.Contents) { /* TODO(body): (Lcom/google/android/gms/drive/Contents;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/drive/Contents;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2ef3
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x138a
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2720
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Int, p3: Int) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;III)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2719
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Int, p3: Boolean, p4: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;IIZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p5, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x13b4
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Int, p3: Array<String>, p4: android.os.Bundle) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;II[Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         if-eqz p5, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p5, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f44
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Boolean, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p3, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1397
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: IntArray) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;I[I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeIntArray([I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2722
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;J)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2, p3}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13c2
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long, p2: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;JLjava/lang/String;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2, p3}, Landroid/os/Parcel;->writeLong(J)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f52
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: android.os.Bundle, p2: Int, p3: Int) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Landroid/os/Bundle;II)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x139d
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: android.os.IBinder, p2: Int, p3: Array<String>, p4: android.os.Bundle, p5: Boolean, p6: Long) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Landroid/os/IBinder;I[Ljava/lang/String;Landroid/os/Bundle;ZJ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v3, p4}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         if-eqz p5, :cond_1
    //         const/4 v2, 0x1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p5, v3, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         if-eqz p6, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v3, p7, p8}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x13a6
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v2, 0x0
    //         :try_start_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: android.os.IBinder, p2: String, p3: Boolean, p4: Long) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Landroid/os/IBinder;Ljava/lang/String;ZJ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p4, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v2, p5, p6}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x13a7
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1396
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x271b
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Int, p4: Int, p5: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IIIZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v2, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v2, p5}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p6, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x139b
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: android.os.IBinder, p4: android.os.Bundle) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;ILandroid/os/IBinder;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p5, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p5, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13a1
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1f57
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p5, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x13b5
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean, p5: Boolean, p6: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p5, :cond_2
    //         move v2, v0
    //         :goto_2
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p6, :cond_3
    //         move v2, v0
    //         :goto_3
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p7, :cond_4
    //         :goto_4
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1965
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v2, v1
    //         goto :goto_2
    //         :cond_3
    //         move v2, v1
    //         goto :goto_3
    //         :cond_4
    //         move v0, v1
    //         goto :goto_4
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: IntArray) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;I[I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeIntArray([I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2723
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Long) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;J)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3, p4}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1398
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Long, p3: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;JLjava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3, p4}, Landroid/os/Parcel;->writeLong(J)V
    //         invoke-virtual {v1, p5}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1b5a
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: android.os.IBinder, p3: android.os.Bundle) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p4, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p4, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x139f
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: com.google.android.gms.games.snapshot.SnapshotMetadataChange, p3: com.google.android.gms.drive.Contents) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;Lcom/google/android/gms/drive/Contents;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p3, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p3, v1, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         if-eqz p4, :cond_2
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p4, v1, v0}, Lcom/google/android/gms/drive/Contents;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2ee7
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_2
    //         const/4 v0, 0x0
    //         :try_start_2
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_2
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13ae
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Int) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;II)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p5}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f41
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Int, p5: Int) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;III)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p5}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p6}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x271a
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;IIIZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v2, p5}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v2, p6}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p7, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x13af
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Boolean, p5: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v3, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p5, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p6, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2344
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: com.google.android.gms.games.snapshot.SnapshotMetadataChange, p4: com.google.android.gms.drive.Contents) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;Lcom/google/android/gms/drive/Contents;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p4, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p4, v1, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         if-eqz p5, :cond_2
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p5, v1, v0}, Lcom/google/android/gms/drive/Contents;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2f01
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_2
    //         const/4 v0, 0x0
    //         :try_start_2
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_2
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p4, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1772
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: IntArray, p4: Int, p5: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;[IIZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p4}, Landroid/os/Parcel;->writeIntArray([I)V
    //         invoke-virtual {v2, p5}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p6, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2eef
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Array<String>) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2718
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Array<String>, p4: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p4}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         if-eqz p5, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2efc
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p3, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x13be
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: ByteArray, p3: String, p4: Array<com.google.android.gms.games.multiplayer.ParticipantResult>) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;[BLjava/lang/String;[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeByteArray([B)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         invoke-virtual {v1, p5, v0}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f47
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: ByteArray, p3: Array<com.google.android.gms.games.multiplayer.ParticipantResult>) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;[B[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeByteArray([B)V
    //         const/4 v0, 0x0
    //         invoke-virtual {v1, p4, v0}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f48
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: IntArray) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;[I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeIntArray([I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f51
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Array<String>, p3: Int, p4: ByteArray, p5: Int) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;[Ljava/lang/String;I[BI)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p5}, Landroid/os/Parcel;->writeByteArray([B)V
    //         invoke-virtual {v1, p6}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2715
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1771
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean, p2: android.os.Bundle) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;ZLandroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_1
    //         :goto_1
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p3, :cond_2
    //         const/4 v0, 0x1
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p3, v3, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x13c7
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v0, v1
    //         goto :goto_1
    //         :cond_2
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean, p2: Array<String>) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Z[Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2eff
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: IntArray) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;[I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeIntArray([I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f43
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: IntArray, p2: Int, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;[IIZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeIntArray([I)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2eea
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Array<String>) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;[Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2716
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Array<String>, p2: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;[Ljava/lang/String;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         if-eqz p3, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2efd
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: String, p1: android.os.IBinder, p2: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p3, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p3, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x32ca
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun b(p0: ByteArray, p1: String, p2: Array<String>): Int { return TODO("body: ([BLjava/lang/String;[Ljava/lang/String;)I") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeByteArray([B)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13aa
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: Int, p1: Int, p2: Boolean): android.content.Intent { return TODO("body: (IIZ)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p3, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2331
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: IntArray): android.content.Intent { return TODO("body: ([I)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeIntArray([I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2efe
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: Long, p1: String) { /* TODO(body): (JLjava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f55
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1399
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Boolean, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p3, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x13b6
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;J)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2, p3}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f4c
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long, p2: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;JLjava/lang/String;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2, p3}, Landroid/os/Parcel;->writeLong(J)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f54
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x139a
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2ef7
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Int, p4: Int, p5: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IIIZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v2, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v2, p5}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p6, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x139c
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: android.os.IBinder, p4: android.os.Bundle) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;ILandroid/os/IBinder;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p5, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p5, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1b5b
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2721
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p5, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x157d
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: android.os.IBinder, p3: android.os.Bundle) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p4, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p4, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13a0
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13b1
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;IIIZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v2, p5}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v2, p6}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p7, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x13b0
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Int, p4: Boolean, p5: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v3, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p5, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p6, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2ef2
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p4, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x196a
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p3, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1966
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1967
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Array<String>) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;[Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2717
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun b(p0: String, p1: String, p2: Int) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13bb
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun bC(p0: String): android.content.Intent { return TODO("body: (Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2f02
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun bE(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13c8
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun bF(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13ab
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun bG(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13ba
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun bH(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13c4
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun bI(p0: String): android.net.Uri { return TODO("body: (Ljava/lang/String;)Landroid/net/Uri;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13ca
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/Uri;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun bJ(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f42
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun bK(p0: String): android.os.ParcelFileDescriptor { return TODO("body: (Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2346
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/os/ParcelFileDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/ParcelFileDescriptor;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun bx(p0: String): android.content.Intent { return TODO("body: (Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x232c
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: Long, p1: String) { /* TODO(body): (JLjava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2714
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x139e
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Boolean, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p3, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x13b8
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;J)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2, p3}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2711
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long, p2: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;JLjava/lang/String;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2, p3}, Landroid/os/Parcel;->writeLong(J)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2713
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13a8
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2ef8
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p5, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2329
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f4b
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v2, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p4, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2ee3
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p3, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1968
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1f5b
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Array<String>) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;[Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2724
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun c(p0: String, p1: String, p2: Int) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f5a
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun d(p0: Long, p1: String) { /* TODO(body): (JLjava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2eee
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13a2
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Boolean, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p3, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1773
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;J)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2, p3}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2eeb
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Long, p2: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;JLjava/lang/String;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2, p3}, Landroid/os/Parcel;->writeLong(J)V
    //         invoke-virtual {v1, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2eed
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13ad
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p5, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x233c
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f4f
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p3, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1969
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun d(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2ee2
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun dC(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13ac
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13a3
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Int, p2: Boolean, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p3, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x1774
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13b2
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p5, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2ef5
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f50
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p3, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2ee6
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun e(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2f00
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun f(p0: com.google.android.gms.games.internal.IGamesCallbacks) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13b7
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun f(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13b3
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun f(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: Int, p3: Boolean, p4: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v4
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p4, :cond_1
    //         move v2, v0
    //         :goto_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p5, :cond_2
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2ef6
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :cond_1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_2
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun f(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String, p2: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2ee9
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun f(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x2ef0
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun fC(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x138c
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun g(p0: com.google.android.gms.games.internal.IGamesCallbacks) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13b9
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun g(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13bc
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun g(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x32cb
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun h(p0: android.net.Uri): android.os.ParcelFileDescriptor { return TODO("body: (Landroid/net/Uri;)Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Landroid/net/Uri;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x196b
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Landroid/os/ParcelFileDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/ParcelFileDescriptor;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_1
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun h(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String): com.google.android.gms.games.multiplayer.realtime.RoomEntity { return TODO("body: (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v2, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v4, 0x13bd
    //         const/4 v5, 0x0
    //         invoke-interface {v1, v4, v2, v3, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v3}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_1
    //         move-object v1, v0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun h(p0: com.google.android.gms.games.internal.IGamesCallbacks) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13c0
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun h(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v1, 0x32cc
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun i(p0: com.google.android.gms.games.internal.IGamesCallbacks) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13c6
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun i(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13c5
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun j(p0: com.google.android.gms.games.internal.IGamesCallbacks) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2af9
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun j(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13c1
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun k(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1b59
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kA(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v4, 0x13cb
    //         const/4 v5, 0x0
    //         invoke-interface {v3, v4, v1, v2, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kB(): com.google.android.gms.common.data.DataHolder { return TODO("body: ()Lcom/google/android/gms/common/data/DataHolder;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x157e
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Lcom/google/android/gms/common/data/f;
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/common/data/f;->z(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/DataHolder;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kC() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f56
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kD(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2335
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kE() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2afa
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kF(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v4, 0x2ef9
    //         const/4 v5, 0x0
    //         invoke-interface {v3, v4, v1, v2, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun ka(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x138f
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kb(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1394
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun ke(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x232b
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kf(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x232d
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kg(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x232e
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kh(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x232f
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun km(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2332
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kn(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2334
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun ko(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x233b
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kp(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x138b
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kq(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f58
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kr(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x271f
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun ks(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x271d
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kt(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2727
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun ku(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2f03
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kv(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2f04
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kx() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x138e
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun kz(): com.google.android.gms.common.data.DataHolder { return TODO("body: ()Lcom/google/android/gms/common/data/DataHolder;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1395
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Lcom/google/android/gms/common/data/f;
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/common/data/f;->z(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/DataHolder;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun l(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f45
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun m(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f46
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun n(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f49
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun n(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2ef1
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun o(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f4a
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun o(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13a5
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun p(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f4e
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun p(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13a4
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun q(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1389
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun q(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x232a
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun r(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13c3
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun r(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2ef4
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun r(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13bf
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun s(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f4d
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun s(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2ee5
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun s(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x271e
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun t(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2712
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun t(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2efb
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun u(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2eec
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun u(p0: com.google.android.gms.games.internal.IGamesCallbacks, p1: String) { /* TODO(body): (Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/internal/IGamesCallbacks;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x2ee8
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun u(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x13c9
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun v(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/IGamesService$Stub$Proxy;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x1f59
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

}
