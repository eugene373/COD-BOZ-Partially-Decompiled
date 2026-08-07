package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 0 fields, 4 methods.

open class ad_a: android.os.Binder(), com.google.android.gms.wearable.internal.ad {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         const/4 v1, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         sget-object v0, Lcom/google/android/gms/wearable/internal/r;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/r;
    //         :cond_0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->a(Lcom/google/android/gms/wearable/internal/r;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         sget-object v0, Lcom/google/android/gms/wearable/internal/t;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/t;
    //         :cond_1
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->a(Lcom/google/android/gms/wearable/internal/t;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         sget-object v0, Lcom/google/android/gms/wearable/internal/ao;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/ao;
    //         :cond_2
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->a(Lcom/google/android/gms/wearable/internal/ao;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         sget-object v0, Lcom/google/android/gms/wearable/internal/x;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/x;
    //         :cond_3
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->a(Lcom/google/android/gms/wearable/internal/x;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         sget-object v0, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Lcom/google/android/gms/common/data/f;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/data/f;->z(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         :cond_4
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->aa(Lcom/google/android/gms/common/data/DataHolder;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto/16 :goto_0
    //         :sswitch_6
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_5
    //         sget-object v0, Lcom/google/android/gms/wearable/internal/p;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/p;
    //         :cond_5
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->a(Lcom/google/android/gms/wearable/internal/p;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto/16 :goto_0
    //         :sswitch_7
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_6
    //         sget-object v0, Lcom/google/android/gms/wearable/internal/as;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/as;
    //         :cond_6
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->a(Lcom/google/android/gms/wearable/internal/as;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto/16 :goto_0
    //         :sswitch_8
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_7
    //         sget-object v0, Lcom/google/android/gms/wearable/internal/z;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/z;
    //         :cond_7
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->a(Lcom/google/android/gms/wearable/internal/z;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto/16 :goto_0
    //         :sswitch_9
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_8
    //         sget-object v0, Lcom/google/android/gms/wearable/internal/ab;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/ab;
    //         :cond_8
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->a(Lcom/google/android/gms/wearable/internal/ab;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto/16 :goto_0
    //         :sswitch_a
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_9
    //         sget-object v0, Lcom/google/android/gms/wearable/internal/v;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/v;
    //         :cond_9
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->a(Lcom/google/android/gms/wearable/internal/v;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto/16 :goto_0
    //         :sswitch_b
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_a
    //         sget-object v0, Lcom/google/android/gms/common/api/Status;->CREATOR:Lcom/google/android/gms/common/api/StatusCreator;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/api/StatusCreator;->createFromParcel(Landroid/os/Parcel;)Lcom/google/android/gms/common/api/Status;
    //         move-result-object v0
    //         :cond_a
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->a(Lcom/google/android/gms/common/api/Status;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto/16 :goto_0
    //         :sswitch_c
    //         const-string v2, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_b
    //         sget-object v0, Lcom/google/android/gms/wearable/internal/au;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/au;
    //         :cond_b
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/internal/ad$a;->a(Lcom/google/android/gms/wearable/internal/au;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto/16 :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x2 -> :sswitch_1
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
    //             0xd -> :sswitch_2
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun bR(p0: android.os.IBinder): com.google.android.gms.wearable.internal.ad { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/wearable/internal/ad;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.wearable.internal.IWearableCallbacks"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/wearable/internal/ad;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/ad;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/ad$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/ad$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
