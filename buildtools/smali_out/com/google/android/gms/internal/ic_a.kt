package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 4 methods.

open class ic_a: android.os.Binder(), com.google.android.gms.internal.ic {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

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
    //         const-string v0, "com.google.android.gms.appstate.internal.IAppStateCallbacks"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v2, "com.google.android.gms.appstate.internal.IAppStateCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Lcom/google/android/gms/common/data/f;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/f;->z(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {p0, v2, v0}, Lcom/google/android/gms/internal/ic$a;->a(ILcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v2, "com.google.android.gms.appstate.internal.IAppStateCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         sget-object v0, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Lcom/google/android/gms/common/data/f;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/f;->z(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         :cond_1
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ic$a;->a(Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.appstate.internal.IAppStateCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/ic$a;->e(II)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "com.google.android.gms.appstate.internal.IAppStateCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ic$a;->fp()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v0, "com.google.android.gms.appstate.internal.IAppStateCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ic$a;->S(I)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1389 -> :sswitch_1
    //             0x138a -> :sswitch_2
    //             0x138b -> :sswitch_3
    //             0x138c -> :sswitch_4
    //             0x138d -> :sswitch_5
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun J(p0: android.os.IBinder): com.google.android.gms.internal.ic { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/ic;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.appstate.internal.IAppStateCallbacks"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/internal/ic;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/internal/ic;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/ic$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ic$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
