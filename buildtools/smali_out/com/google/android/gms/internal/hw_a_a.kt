package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class hw_a_a: com.google.android.gms.internal.hw {
    private var lb: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun a(p0: com.google.android.gms.common.api.Status) { /* TODO(body): (Lcom/google/android/gms/common/api/Status;)V */ }
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
    //         const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/common/api/Status;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hw$a$a;->lb:Landroid/os/IBinder;
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

    public fun a(p0: com.google.android.gms.common.api.Status, p1: android.os.ParcelFileDescriptor) { /* TODO(body): (Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;)V */ }
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
    //         const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/common/api/Status;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p2, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p2, v1, v0}, Landroid/os/ParcelFileDescriptor;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hw$a$a;->lb:Landroid/os/IBinder;
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
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_2
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.common.api.Status, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/common/api/Status;Z)V */ }
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
    //         move-result-object v2
    //         :try_start_0
    //         const-string v3, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks"
    //         invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v3, 0x1
    //         invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v3, 0x0
    //         invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/common/api/Status;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p2, :cond_1
    //         :goto_1
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hw$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v1, 0x3
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v3, 0x0
    //         :try_start_1
    //         invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_1
    //         move v0, v1
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.internal.hm.b) { /* TODO(body): (Lcom/google/android/gms/internal/hm$b;)V */ }
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
    //         const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/hm$b;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hw$a$a;->lb:Landroid/os/IBinder;
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

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hw$a$a;->lb:Landroid/os/IBinder;
    //         return-object v0
    */

}
