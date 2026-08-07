package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class ou_a_a: com.google.android.gms.internal.ou {
    private var lb: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun a(p0: com.google.android.gms.dynamic.d, p1: com.google.android.gms.dynamic.c, p2: com.google.android.gms.wallet.fragment.WalletFragmentOptions, p3: com.google.android.gms.internal.os): com.google.android.gms.internal.or { return TODO("body: (Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/dynamic/c;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/internal/os;)Lcom/google/android/gms/internal/or;") }
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
    //         const-string v1, "com.google.android.gms.wallet.internal.IWalletDynamiteCreator"
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_0
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_2
    //         invoke-interface {p2}, Lcom/google/android/gms/dynamic/c;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :goto_1
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p3, :cond_3
    //         const/4 v1, 0x1
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v1, 0x0
    //         invoke-virtual {p3, v2, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_2
    //         if-eqz p4, :cond_0
    //         invoke-interface {p4}, Lcom/google/android/gms/internal/os;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {v2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ou$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v1, 0x1
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v1, v2, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v3}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/or$a;->bJ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/or;
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
    //         move-object v1, v0
    //         goto :goto_1
    //         :cond_3
    //         const/4 v1, 0x0
    //         :try_start_1
    //         invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ou$a$a;->lb:Landroid/os/IBinder;
    //         return-object v0
    */

}
