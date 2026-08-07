package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class h_a_a: com.google.android.gms.maps.internal.h {
    private var lb: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/h$a$a;->lb:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun l(p0: com.google.android.gms.dynamic.d) { /* TODO(body): (Lcom/google/android/gms/dynamic/d;)V */ }
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
    //         const-string v0, "com.google.android.gms.maps.internal.IOnLocationChangeListener"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/h$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v3, 0x1
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

}
