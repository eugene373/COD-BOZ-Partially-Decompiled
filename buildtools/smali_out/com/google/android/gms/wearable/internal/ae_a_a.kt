package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class ae_a_a: com.google.android.gms.wearable.internal.ae {
    private var lb: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun Z(p0: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.wearable.internal.IWearableListener"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/common/data/DataHolder;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ae$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
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
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.wearable.internal.ah) { /* TODO(body): (Lcom/google/android/gms/wearable/internal/ah;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.wearable.internal.IWearableListener"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/wearable/internal/ah;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ae$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v2, 0x2
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
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
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.wearable.internal.ak) { /* TODO(body): (Lcom/google/android/gms/wearable/internal/ak;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.wearable.internal.IWearableListener"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/wearable/internal/ak;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ae$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v2, 0x3
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
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
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ae$a$a;->lb:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun b(p0: com.google.android.gms.wearable.internal.ak) { /* TODO(body): (Lcom/google/android/gms/wearable/internal/ak;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         :try_start_0
    //         const-string v0, "com.google.android.gms.wearable.internal.IWearableListener"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/wearable/internal/ak;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ae$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v2, 0x4
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
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
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

}
