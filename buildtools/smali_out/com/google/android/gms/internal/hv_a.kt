package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 2 methods.

open class hv_a: android.os.Binder(), com.google.android.gms.internal.hv {
    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v1
    //         :goto_0
    //         return v1
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/hw$a;->G(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hw;
    //         move-result-object v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         sget-object v0, Lcom/google/android/gms/internal/hs;->CREATOR:Lcom/google/android/gms/internal/ht;
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/google/android/gms/internal/hs;
    //         invoke-virtual {p0, v2, v3, v0}, Lcom/google/android/gms/internal/hv$a;->a(Lcom/google/android/gms/internal/hw;Ljava/lang/String;[Lcom/google/android/gms/internal/hs;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/hw$a;->G(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hw;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/hv$a;->a(Lcom/google/android/gms/internal/hw;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/hw$a;->G(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hw;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/hv$a;->b(Lcom/google/android/gms/internal/hw;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/hw$a;->G(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hw;
    //         move-result-object v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         move v0, v1
    //         :goto_1
    //         invoke-virtual {p0, v2, v0}, Lcom/google/android/gms/internal/hv$a;->a(Lcom/google/android/gms/internal/hw;Z)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_1
    //         :sswitch_5
    //         const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/google/android/gms/internal/hm$a;->CREATOR:Lcom/google/android/gms/internal/hn;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/hn;->p(Landroid/os/Parcel;)Lcom/google/android/gms/internal/hm$a;
    //         move-result-object v0
    //         :goto_2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/internal/hw$a;->G(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hw;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/hv$a;->a(Lcom/google/android/gms/internal/hm$a;Lcom/google/android/gms/internal/hw;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_2
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
    public @JvmStatic fun F(p0: android.os.IBinder): com.google.android.gms.internal.hv { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/hv;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/internal/hv;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/internal/hv;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/hv$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/hv$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
