package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 4 methods.

open class bd_a: android.os.Binder(), com.google.android.gms.internal.bd {
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
    //         const/4 v2, 0x0
    //         const/4 v1, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v1
    //         :goto_0
    //         return v1
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v2, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/bd$a;->X()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v2
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v2, :cond_0
    //         invoke-interface {v2}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/bd$a;->destroy()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/bd$a;->isReady()Z
    //         move-result v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_1
    //         move v0, v1
    //         :goto_1
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    //         :sswitch_4
    //         const-string v3, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         sget-object v0, Lcom/google/android/gms/internal/av;->CREATOR:Lcom/google/android/gms/internal/aw;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/aw;->b(Landroid/os/Parcel;)Lcom/google/android/gms/internal/av;
    //         move-result-object v0
    //         :cond_2
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bd$a;->a(Lcom/google/android/gms/internal/av;)Z
    //         move-result v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_3
    //         move v2, v1
    //         :cond_3
    //         invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/bd$a;->pause()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :sswitch_6
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/bd$a;->resume()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :sswitch_7
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/bc$a;->e(Landroid/os/IBinder;)Lcom/google/android/gms/internal/bc;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bd$a;->a(Lcom/google/android/gms/internal/bc;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_8
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/bf$a;->h(Landroid/os/IBinder;)Lcom/google/android/gms/internal/bf;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bd$a;->a(Lcom/google/android/gms/internal/bf;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_9
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/bd$a;->showInterstitial()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_a
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/bd$a;->stopLoading()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_b
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/bd$a;->aj()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_c
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/bd$a;->Y()Lcom/google/android/gms/internal/ay;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_4
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p3, v1}, Lcom/google/android/gms/internal/ay;->writeToParcel(Landroid/os/Parcel;I)V
    //         goto/16 :goto_0
    //         :cond_4
    //         invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         goto/16 :goto_0
    //         :sswitch_d
    //         const-string v2, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_5
    //         sget-object v0, Lcom/google/android/gms/internal/ay;->CREATOR:Lcom/google/android/gms/internal/az;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/az;->c(Landroid/os/Parcel;)Lcom/google/android/gms/internal/ay;
    //         move-result-object v0
    //         :cond_5
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bd$a;->a(Lcom/google/android/gms/internal/ay;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_e
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/eh$a;->t(Landroid/os/IBinder;)Lcom/google/android/gms/internal/eh;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bd$a;->a(Lcom/google/android/gms/internal/eh;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_f
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/el$a;->x(Landroid/os/IBinder;)Lcom/google/android/gms/internal/el;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/bd$a;->a(Lcom/google/android/gms/internal/el;Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_10
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/et$a;->A(Landroid/os/IBinder;)Lcom/google/android/gms/internal/et;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bd$a;->a(Lcom/google/android/gms/internal/et;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_11
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/eu$a;->B(Landroid/os/IBinder;)Lcom/google/android/gms/internal/eu;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bd$a;->a(Lcom/google/android/gms/internal/eu;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_12
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/bd$a;->getMediationAdapterClassName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto/16 :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x4 -> :sswitch_4
    //             0x5 -> :sswitch_5
    //             0x6 -> :sswitch_6
    //             0x7 -> :sswitch_7
    //             0x8 -> :sswitch_8
    //             0x9 -> :sswitch_9
    //             0xa -> :sswitch_a
    //             0xb -> :sswitch_b
    //             0xc -> :sswitch_c
    //             0xd -> :sswitch_d
    //             0xe -> :sswitch_e
    //             0xf -> :sswitch_f
    //             0x10 -> :sswitch_10
    //             0x11 -> :sswitch_11
    //             0x12 -> :sswitch_12
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun f(p0: android.os.IBinder): com.google.android.gms.internal.bd { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/bd;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/internal/bd;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/internal/bd;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/bd$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/bd$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
