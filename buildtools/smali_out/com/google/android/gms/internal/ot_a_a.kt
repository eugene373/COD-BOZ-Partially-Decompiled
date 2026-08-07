package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 11 methods.

open class ot_a_a: com.google.android.gms.internal.ot {
    private var lb: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun a(p0: android.os.Bundle, p1: com.google.android.gms.internal.ow) { /* TODO(body): (Landroid/os/Bundle;Lcom/google/android/gms/internal/ow;)V */ }
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
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.wallet.internal.IOwService"
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p2, :cond_0
    //         invoke-interface {p2}, Lcom/google/android/gms/internal/ow;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ot$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v2, 0x5
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v2, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.internal.on, p1: android.os.Bundle, p2: com.google.android.gms.internal.ow) { /* TODO(body): (Lcom/google/android/gms/internal/on;Landroid/os/Bundle;Lcom/google/android/gms/internal/ow;)V */ }
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
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.wallet.internal.IOwService"
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/on;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p2, :cond_2
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         if-eqz p3, :cond_0
    //         invoke-interface {p3}, Lcom/google/android/gms/internal/ow;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ot$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v2, 0x8
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v2, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_2
    //         const/4 v2, 0x0
    //         :try_start_2
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.wallet.FullWalletRequest, p1: android.os.Bundle, p2: com.google.android.gms.internal.ow) { /* TODO(body): (Lcom/google/android/gms/wallet/FullWalletRequest;Landroid/os/Bundle;Lcom/google/android/gms/internal/ow;)V */ }
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
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.wallet.internal.IOwService"
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/wallet/FullWalletRequest;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p2, :cond_2
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         if-eqz p3, :cond_0
    //         invoke-interface {p3}, Lcom/google/android/gms/internal/ow;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ot$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v2, 0x2
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v2, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_2
    //         const/4 v2, 0x0
    //         :try_start_2
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.wallet.MaskedWalletRequest, p1: android.os.Bundle, p2: com.google.android.gms.internal.ov) { /* TODO(body): (Lcom/google/android/gms/wallet/MaskedWalletRequest;Landroid/os/Bundle;Lcom/google/android/gms/internal/ov;)V */ }
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
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.wallet.internal.IOwService"
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/wallet/MaskedWalletRequest;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p2, :cond_2
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         if-eqz p3, :cond_0
    //         invoke-interface {p3}, Lcom/google/android/gms/internal/ov;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ot$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v2, 0x7
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v2, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_2
    //         const/4 v2, 0x0
    //         :try_start_2
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.wallet.MaskedWalletRequest, p1: android.os.Bundle, p2: com.google.android.gms.internal.ow) { /* TODO(body): (Lcom/google/android/gms/wallet/MaskedWalletRequest;Landroid/os/Bundle;Lcom/google/android/gms/internal/ow;)V */ }
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
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.wallet.internal.IOwService"
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/wallet/MaskedWalletRequest;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p2, :cond_2
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         if-eqz p3, :cond_0
    //         invoke-interface {p3}, Lcom/google/android/gms/internal/ow;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ot$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v2, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_2
    //         const/4 v2, 0x0
    //         :try_start_2
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.wallet.NotifyTransactionStatusRequest, p1: android.os.Bundle) { /* TODO(body): (Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;Landroid/os/Bundle;)V */ }
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
    //         const-string v0, "com.google.android.gms.wallet.internal.IOwService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p2, :cond_1
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p2, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ot$a$a;->lb:Landroid/os/IBinder;
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
    //         :cond_1
    //         const/4 v0, 0x0
    //         :try_start_2
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.wallet.d, p1: android.os.Bundle, p2: com.google.android.gms.internal.ow) { /* TODO(body): (Lcom/google/android/gms/wallet/d;Landroid/os/Bundle;Lcom/google/android/gms/internal/ow;)V */ }
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
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.wallet.internal.IOwService"
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/wallet/d;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p2, :cond_2
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         if-eqz p3, :cond_0
    //         invoke-interface {p3}, Lcom/google/android/gms/internal/ow;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ot$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v2, 0x6
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v2, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_2
    //         const/4 v2, 0x0
    //         :try_start_2
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_1
    */

    public fun a(p0: String, p1: String, p2: android.os.Bundle, p3: com.google.android.gms.internal.ow) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/ow;)V */ }
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
    //         :try_start_0
    //         const-string v2, "com.google.android.gms.wallet.internal.IOwService"
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p3, :cond_1
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v2, 0x0
    //         invoke-virtual {p3, v1, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         if-eqz p4, :cond_0
    //         invoke-interface {p4}, Lcom/google/android/gms/internal/ow;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ot$a$a;->lb:Landroid/os/IBinder;
    //         const/4 v2, 0x3
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_1
    //         const/4 v2, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V
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
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ot$a$a;->lb:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun p(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
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
    //         const-string v0, "com.google.android.gms.wallet.internal.IOwService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ot$a$a;->lb:Landroid/os/IBinder;
    //         const/16 v2, 0x9
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
