package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 1 fields, 13 methods.

open class IMapFragmentDelegate_a_a: com.google.android.gms.maps.internal.IMapFragmentDelegate {
    private var lb: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun getMap(): com.google.android.gms.maps.internal.IGoogleMapDelegate { return TODO("body: ()Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;") }
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
    //         const-string v0, "com.google.android.gms.maps.internal.IMapFragmentDelegate"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v3, 0x1
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/IGoogleMapDelegate$a;->aQ(Landroid/os/IBinder;)Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
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

    public fun isReady(): Boolean { return TODO("body: ()Z") }
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
    //         const-string v3, "com.google.android.gms.maps.internal.IMapFragmentDelegate"
    //         invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
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

    public fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.maps.internal.IMapFragmentDelegate"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v3, 0x3
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

    public fun onCreateView(inflaterWrapper: com.google.android.gms.dynamic.d, containerWrapper: com.google.android.gms.dynamic.d, savedInstanceState: android.os.Bundle): com.google.android.gms.dynamic.d { return TODO("body: (Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/dynamic/d;Landroid/os/Bundle;)Lcom/google/android/gms/dynamic/d;") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v1, "com.google.android.gms.maps.internal.IMapFragmentDelegate"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_0
    //         invoke-interface {p2}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p3, :cond_2
    //         const/4 v0, 0x1
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p3, v2, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v1, 0x4
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/d$a;->am(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_1
    //         move-object v1, v0
    //         goto :goto_0
    //         :cond_2
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
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
    //         const-string v0, "com.google.android.gms.maps.internal.IMapFragmentDelegate"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
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

    public fun onDestroyView() { /* TODO(body): ()V */ }
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
    //         const-string v0, "com.google.android.gms.maps.internal.IMapFragmentDelegate"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
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

    public fun onInflate(activityWrapper: com.google.android.gms.dynamic.d, options: com.google.android.gms.maps.GoogleMapOptions, savedInstanceState: android.os.Bundle) { /* TODO(body): (Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/maps/GoogleMapOptions;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.maps.internal.IMapFragmentDelegate"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p2, v1, v0}, Lcom/google/android/gms/maps/GoogleMapOptions;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         if-eqz p3, :cond_2
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p3, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_2
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v3, 0x2
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

    public fun onLowMemory() { /* TODO(body): ()V */ }
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
    //         const-string v0, "com.google.android.gms.maps.internal.IMapFragmentDelegate"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0x9
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

    public fun onPause() { /* TODO(body): ()V */ }
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
    //         const-string v0, "com.google.android.gms.maps.internal.IMapFragmentDelegate"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
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

    public fun onResume() { /* TODO(body): ()V */ }
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
    //         const-string v0, "com.google.android.gms.maps.internal.IMapFragmentDelegate"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
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

    public fun onSaveInstanceState(outState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.maps.internal.IMapFragmentDelegate"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/IMapFragmentDelegate$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v3, 0xa
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1, v2}, Landroid/os/Bundle;->readFromParcel(Landroid/os/Parcel;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
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

}
