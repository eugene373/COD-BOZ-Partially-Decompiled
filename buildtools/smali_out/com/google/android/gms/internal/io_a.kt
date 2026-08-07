package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 3 methods.

open class io_a: android.os.Binder(), com.google.android.gms.internal.io {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         const/4 v0, 0x0
    //         const/4 v2, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v2
    //         :goto_0
    //         return v2
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/io$a;->ac(I)V
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v3, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v3}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         sget-object v0, Lcom/google/android/gms/cast/ApplicationMetadata;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/cast/ApplicationMetadata;
    //         :cond_0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v5
    //         if-eqz v5, :cond_1
    //         move v1, v2
    //         :cond_1
    //         invoke-virtual {p0, v0, v3, v4, v1}, Lcom/google/android/gms/internal/io$a;->a(Lcom/google/android/gms/cast/ApplicationMetadata;Ljava/lang/String;Ljava/lang/String;Z)V
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/io$a;->ad(I)V
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readDouble()D
    //         move-result-wide v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         move v1, v2
    //         :cond_2
    //         invoke-virtual {p0, v0, v4, v5, v1}, Lcom/google/android/gms/internal/io$a;->a(Ljava/lang/String;DZ)V
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/io$a;->k(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_6
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/io$a;->b(Ljava/lang/String;[B)V
    //         goto :goto_0
    //         :sswitch_7
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/io$a;->af(I)V
    //         goto/16 :goto_0
    //         :sswitch_8
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/io$a;->ae(I)V
    //         goto/16 :goto_0
    //         :sswitch_9
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/io$a;->onApplicationDisconnected(I)V
    //         goto/16 :goto_0
    //         :sswitch_a
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J
    //         move-result-wide v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         invoke-virtual {p0, v0, v4, v5, v1}, Lcom/google/android/gms/internal/io$a;->a(Ljava/lang/String;JI)V
    //         goto/16 :goto_0
    //         :sswitch_b
    //         const-string v0, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J
    //         move-result-wide v4
    //         invoke-virtual {p0, v0, v4, v5}, Lcom/google/android/gms/internal/io$a;->a(Ljava/lang/String;J)V
    //         goto/16 :goto_0
    //         :sswitch_c
    //         const-string v1, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         sget-object v0, Lcom/google/android/gms/internal/ig;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ig;
    //         :cond_3
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/io$a;->b(Lcom/google/android/gms/internal/ig;)V
    //         goto/16 :goto_0
    //         :sswitch_d
    //         const-string v1, "com.google.android.gms.cast.internal.ICastDeviceControllerListener"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         sget-object v0, Lcom/google/android/gms/internal/il;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/il;
    //         :cond_4
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/io$a;->b(Lcom/google/android/gms/internal/il;)V
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
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

}
