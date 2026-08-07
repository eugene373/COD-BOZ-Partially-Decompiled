package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 0 fields, 2 methods.

open class m_a: android.os.Binder(), com.google.android.gms.common.internal.m {
    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.common.internal.ISignInButtonCreator"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.common.internal.ISignInButtonCreator"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/d$a;->am(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         invoke-virtual {p0, v0, v2, v3}, Lcom/google/android/gms/common/internal/m$a;->a(Lcom/google/android/gms/dynamic/d;II)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_1
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         move v0, v1
    //         goto :goto_0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_1
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun R(p0: android.os.IBinder): com.google.android.gms.common.internal.m { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/m;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.common.internal.ISignInButtonCreator"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/common/internal/m;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/common/internal/m;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/internal/m$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/common/internal/m$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
