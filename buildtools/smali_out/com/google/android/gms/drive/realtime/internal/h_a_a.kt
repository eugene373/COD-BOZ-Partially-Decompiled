package com.google.android.gms.drive.realtime.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class h_a_a: com.google.android.gms.drive.realtime.internal.h {
    private var lb: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/realtime/internal/h$a$a;->lb:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun c(p0: Boolean, p1: Boolean) { /* TODO(body): (ZZ)V */ }
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
    //         const-string v2, "com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         move v2, v0
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         if-eqz p2, :cond_1
    //         :goto_1
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/realtime/internal/h$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         move v2, v1
    //         goto :goto_0
    //         :cond_1
    //         move v0, v1
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

}
