package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class nb_a_a: com.google.android.gms.internal.nb {
    private var lb: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun a(p0: com.google.android.gms.internal.na, p1: android.net.Uri, p2: android.os.Bundle, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;Z)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v3
    //         :try_start_0
    //         const-string v4, "com.google.android.gms.panorama.internal.IPanoramaService"
    //         invoke-virtual {v3, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/internal/na;->asBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         :cond_0
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_1
    //         const/4 v2, 0x1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p2, v3, v2}, Landroid/net/Uri;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p3, :cond_2
    //         const/4 v2, 0x1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p3, v3, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         if-eqz p4, :cond_3
    //         :goto_2
    //         invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nb$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v1, v3, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v2, 0x0
    //         :try_start_1
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_2
    //         const/4 v2, 0x0
    //         :try_start_2
    //         invoke-virtual {v3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_1
    //         :cond_3
    //         move v0, v1
    //         goto :goto_2
    */

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nb$a$a;->lb:Landroid/os/IBinder;
    //         return-object v0
    */

}
