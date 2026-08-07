package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 2 methods.

open class be_a: android.os.Binder(), com.google.android.gms.internal.be {
    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 7
    //         const/4 v6, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManagerCreator"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v6
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManagerCreator"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/d$a;->am(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/ay;->CREATOR:Lcom/google/android/gms/internal/az;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/az;->c(Landroid/os/Parcel;)Lcom/google/android/gms/internal/ay;
    //         move-result-object v2
    //         :goto_1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ct$a;->l(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ct;
    //         move-result-object v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v5
    //         move-object v0, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/be$a;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Lcom/google/android/gms/internal/ct;I)Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         move v0, v6
    //         goto :goto_0
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_1
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun g(p0: android.os.IBinder): com.google.android.gms.internal.be { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/be;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManagerCreator"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/internal/be;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/internal/be;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/be$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/be$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
