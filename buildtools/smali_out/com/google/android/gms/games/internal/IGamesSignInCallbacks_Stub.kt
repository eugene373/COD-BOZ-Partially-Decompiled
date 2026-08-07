package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 0 fields, 3 methods.

open class IGamesSignInCallbacks_Stub: android.os.Binder(), com.google.android.gms.games.internal.IGamesSignInCallbacks {
    public constructor()

    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         const/4 v1, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesSignInCallbacks"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v2, "com.google.android.gms.games.internal.IGamesSignInCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         sget-object v0, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         :cond_0
    //         invoke-virtual {p0, v2, v0}, Lcom/google/android/gms/games/internal/IGamesSignInCallbacks$Stub;->b(ILandroid/content/Intent;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v2, "com.google.android.gms.games.internal.IGamesSignInCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         sget-object v0, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Lcom/google/android/gms/common/data/f;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/f;->z(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         :cond_1
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/IGamesSignInCallbacks$Stub;->T(Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v2, "com.google.android.gms.games.internal.IGamesSignInCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         sget-object v0, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Lcom/google/android/gms/common/data/f;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/f;->z(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         :cond_2
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/IGamesSignInCallbacks$Stub;->U(Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "com.google.android.gms.games.internal.IGamesSignInCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/IGamesSignInCallbacks$Stub;->dD(I)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v2, "com.google.android.gms.games.internal.IGamesSignInCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         sget-object v0, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Lcom/google/android/gms/common/data/f;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/f;->z(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         :cond_3
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/IGamesSignInCallbacks$Stub;->g(Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto/16 :goto_0
    //         :sswitch_6
    //         const-string v0, "com.google.android.gms.games.internal.IGamesSignInCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/IGamesSignInCallbacks$Stub;->dE(I)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto/16 :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1389 -> :sswitch_1
    //             0x138a -> :sswitch_2
    //             0x138b -> :sswitch_3
    //             0x138c -> :sswitch_4
    //             0x138d -> :sswitch_5
    //             0x138e -> :sswitch_6
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun aC(p0: android.os.IBinder): com.google.android.gms.games.internal.IGamesSignInCallbacks { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/games/internal/IGamesSignInCallbacks;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.games.internal.IGamesSignInCallbacks"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/games/internal/IGamesSignInCallbacks;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/games/internal/IGamesSignInCallbacks;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/games/internal/IGamesSignInCallbacks$Stub$Proxy;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/internal/IGamesSignInCallbacks$Stub$Proxy;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
