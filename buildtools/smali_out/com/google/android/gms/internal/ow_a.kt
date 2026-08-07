package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 4 methods.

open class ow_a: android.os.Binder(), com.google.android.gms.internal.ow {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 5
    //         const/4 v3, 0x1
    //         const/4 v2, 0x0
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v3
    //         :goto_0
    //         return v3
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/wallet/MaskedWallet;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wallet/MaskedWallet;
    //         move-object v1, v0
    //         :goto_1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_2
    //         invoke-virtual {p0, v4, v1, v0}, Lcom/google/android/gms/internal/ow$a;->a(ILcom/google/android/gms/wallet/MaskedWallet;Landroid/os/Bundle;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :cond_0
    //         move-object v1, v2
    //         goto :goto_1
    //         :cond_1
    //         move-object v0, v2
    //         goto :goto_2
    //         :sswitch_2
    //         const-string v0, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         sget-object v0, Lcom/google/android/gms/wallet/FullWallet;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wallet/FullWallet;
    //         move-object v1, v0
    //         :goto_3
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_4
    //         invoke-virtual {p0, v4, v1, v0}, Lcom/google/android/gms/internal/ow$a;->a(ILcom/google/android/gms/wallet/FullWallet;Landroid/os/Bundle;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :cond_2
    //         move-object v1, v2
    //         goto :goto_3
    //         :cond_3
    //         move-object v0, v2
    //         goto :goto_4
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         move v1, v3
    //         :goto_5
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_6
    //         invoke-virtual {p0, v4, v1, v0}, Lcom/google/android/gms/internal/ow$a;->a(IZLandroid/os/Bundle;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_4
    //         const/4 v0, 0x0
    //         move v1, v0
    //         goto :goto_5
    //         :cond_5
    //         move-object v0, v2
    //         goto :goto_6
    //         :sswitch_4
    //         const-string v0, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_7
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ow$a;->i(ILandroid/os/Bundle;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_6
    //         move-object v0, v2
    //         goto :goto_7
    //         :sswitch_5
    //         const-string v0, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_7
    //         sget-object v0, Lcom/google/android/gms/common/api/Status;->CREATOR:Lcom/google/android/gms/common/api/StatusCreator;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/api/StatusCreator;->createFromParcel(Landroid/os/Parcel;)Lcom/google/android/gms/common/api/Status;
    //         move-result-object v0
    //         move-object v1, v0
    //         :goto_8
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_8
    //         sget-object v0, Lcom/google/android/gms/internal/op;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/op;
    //         move-object v4, v0
    //         :goto_9
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_9
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_a
    //         invoke-virtual {p0, v1, v4, v0}, Lcom/google/android/gms/internal/ow$a;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/op;Landroid/os/Bundle;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_7
    //         move-object v1, v2
    //         goto :goto_8
    //         :cond_8
    //         move-object v4, v2
    //         goto :goto_9
    //         :cond_9
    //         move-object v0, v2
    //         goto :goto_a
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x4 -> :sswitch_4
    //             0x5 -> :sswitch_5
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun bO(p0: android.os.IBinder): com.google.android.gms.internal.ow { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/ow;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/internal/ow;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/internal/ow;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/ow$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ow$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
