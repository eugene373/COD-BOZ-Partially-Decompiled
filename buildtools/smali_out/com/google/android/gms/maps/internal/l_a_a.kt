package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class l_a_a: com.google.android.gms.maps.internal.l {
    private var lb: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun a(p0: com.google.android.gms.maps.model.internal.f): Boolean { return TODO("body: (Lcom/google/android/gms/maps/model/internal/f;)Z") }
    /*
    //         .locals 7
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
    //         const-string v2, "com.google.android.gms.maps.internal.IOnMarkerClickListener"
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/maps/model/internal/f;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :goto_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v2, p0, Lcom/google/android/gms/maps/internal/l$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v5, 0x1
    //         const/4 v6, 0x0
    //         invoke-interface {v2, v5, v3, v4, v6}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         :goto_1
    //         invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return v0
    //         :cond_0
    //         const/4 v2, 0x0
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

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/internal/l$a$a;->lb:Landroid/os/IBinder;
    //         return-object v0
    */

}
