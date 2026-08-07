package com.google.android.gms.plus.internal

// Auto-emitted from smali.
// 0 fields, 4 methods.

open class b_a: android.os.Binder(), com.google.android.gms.plus.internal.b {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 5
    //         const/4 v2, 0x0
    //         const/4 v3, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v3
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
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
    //         invoke-virtual {p0, v4, v1, v0}, Lcom/google/android/gms/plus/internal/b$a;->a(ILandroid/os/Bundle;Landroid/os/Bundle;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v3
    //         goto :goto_0
    //         :cond_0
    //         move-object v1, v2
    //         goto :goto_1
    //         :cond_1
    //         move-object v0, v2
    //         goto :goto_2
    //         :sswitch_2
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         move-object v1, v0
    //         :goto_3
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         sget-object v0, Landroid/os/ParcelFileDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/ParcelFileDescriptor;
    //         :goto_4
    //         invoke-virtual {p0, v4, v1, v0}, Lcom/google/android/gms/plus/internal/b$a;->a(ILandroid/os/Bundle;Landroid/os/ParcelFileDescriptor;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v3
    //         goto :goto_0
    //         :cond_2
    //         move-object v1, v2
    //         goto :goto_3
    //         :cond_3
    //         move-object v0, v2
    //         goto :goto_4
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/b$a;->ce(Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v3
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         sget-object v0, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Lcom/google/android/gms/common/data/f;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/f;->z(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v2
    //         :cond_4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v2, v0}, Lcom/google/android/gms/plus/internal/b$a;->a(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v3
    //         goto/16 :goto_0
    //         :sswitch_5
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
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
    //         :goto_5
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v4
    //         if-eqz v4, :cond_5
    //         sget-object v2, Lcom/google/android/gms/internal/jp;->CREATOR:Lcom/google/android/gms/internal/jq;
    //         invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/jq;->M(Landroid/os/Parcel;)Lcom/google/android/gms/internal/jp;
    //         move-result-object v2
    //         :cond_5
    //         invoke-virtual {p0, v1, v0, v2}, Lcom/google/android/gms/plus/internal/b$a;->a(ILandroid/os/Bundle;Lcom/google/android/gms/internal/jp;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v3
    //         goto/16 :goto_0
    //         :cond_6
    //         move-object v0, v2
    //         goto :goto_5
    //         :sswitch_6
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_7
    //         sget-object v0, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Lcom/google/android/gms/common/data/f;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/f;->z(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v2
    //         :cond_7
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v2, v0, v1}, Lcom/google/android/gms/plus/internal/b$a;->a(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v3
    //         goto/16 :goto_0
    //         :sswitch_7
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_8
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_6
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/plus/internal/b$a;->h(ILandroid/os/Bundle;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v3
    //         goto/16 :goto_0
    //         :cond_8
    //         move-object v0, v2
    //         goto :goto_6
    //         :sswitch_8
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/internal/b$a;->cf(Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v3
    //         goto/16 :goto_0
    //         :sswitch_9
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_9
    //         sget-object v1, Lcom/google/android/gms/internal/nz;->CREATOR:Lcom/google/android/gms/internal/oa;
    //         invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/oa;->dd(Landroid/os/Parcel;)Lcom/google/android/gms/internal/nz;
    //         move-result-object v2
    //         :cond_9
    //         invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/plus/internal/b$a;->a(ILcom/google/android/gms/internal/nz;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v3
    //         goto/16 :goto_0
    //         :sswitch_a
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_a
    //         sget-object v0, Lcom/google/android/gms/common/api/Status;->CREATOR:Lcom/google/android/gms/common/api/StatusCreator;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/api/StatusCreator;->createFromParcel(Landroid/os/Parcel;)Lcom/google/android/gms/common/api/Status;
    //         move-result-object v2
    //         :cond_a
    //         invoke-virtual {p0, v2}, Lcom/google/android/gms/plus/internal/b$a;->aB(Lcom/google/android/gms/common/api/Status;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v3
    //         goto/16 :goto_0
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
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun bE(p0: android.os.IBinder): com.google.android.gms.plus.internal.b { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/plus/internal/b;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.plus.internal.IPlusCallbacks"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/plus/internal/b;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/plus/internal/b;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/plus/internal/b$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/plus/internal/b$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
