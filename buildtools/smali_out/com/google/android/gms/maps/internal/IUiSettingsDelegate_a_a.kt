package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 1 fields, 19 methods.

open class IUiSettingsDelegate_a_a: com.google.android.gms.maps.internal.IUiSettingsDelegate {
    private var lb: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun isCompassEnabled(): Boolean { return TODO("body: ()Z") }
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
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v4, 0xa
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

    public fun isIndoorLevelPickerEnabled(): Boolean { return TODO("body: ()Z") }
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
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v4, 0x11
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

    public fun isMyLocationButtonEnabled(): Boolean { return TODO("body: ()Z") }
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
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v4, 0xb
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

    public fun isRotateGesturesEnabled(): Boolean { return TODO("body: ()Z") }
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
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v4, 0xf
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

    public fun isScrollGesturesEnabled(): Boolean { return TODO("body: ()Z") }
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
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v4, 0xc
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

    public fun isTiltGesturesEnabled(): Boolean { return TODO("body: ()Z") }
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
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v4, 0xe
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

    public fun isZoomControlsEnabled(): Boolean { return TODO("body: ()Z") }
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
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v4, 0x9
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

    public fun isZoomGesturesEnabled(): Boolean { return TODO("body: ()Z") }
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
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v4, 0xd
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

    public fun setAllGesturesEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x8
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

    public fun setCompassEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v3, 0x2
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

    public fun setIndoorLevelPickerEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x10
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

    public fun setMyLocationButtonEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v3, 0x3
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

    public fun setRotateGesturesEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v3, 0x7
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

    public fun setScrollGesturesEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v3, 0x4
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

    public fun setTiltGesturesEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v3, 0x6
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

    public fun setZoomControlsEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v4, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v2, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         :goto_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v1, 0x1
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun setZoomGesturesEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.maps.internal.IUiSettingsDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IUiSettingsDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v3, 0x5
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
