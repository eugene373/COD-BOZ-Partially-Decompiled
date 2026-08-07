package com.google.android.gms.maps.model.internal

// Auto-emitted from smali.
// 0 fields, 2 methods.

open class a_a: android.os.Binder(), com.google.android.gms.maps.model.internal.a {
    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         const/4 v2, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v2
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/model/internal/a$a;->eN(I)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_1
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         move v0, v2
    //         goto :goto_0
    //         :cond_0
    //         move-object v0, v1
    //         goto :goto_1
    //         :sswitch_2
    //         const-string v0, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/model/internal/a$a;->ca(Ljava/lang/String;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_1
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :cond_1
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         move v0, v2
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/model/internal/a$a;->cb(Ljava/lang/String;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_2
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :cond_2
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         move v0, v2
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/model/internal/a$a;->mS()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_3
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :cond_3
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         move v0, v2
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v0, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readFloat()F
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/model/internal/a$a;->c(F)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_4
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :cond_4
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         move v0, v2
    //         goto/16 :goto_0
    //         :sswitch_6
    //         const-string v0, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         sget-object v0, Landroid/graphics/Bitmap;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/graphics/Bitmap;
    //         :goto_2
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/model/internal/a$a;->b(Landroid/graphics/Bitmap;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_5
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :cond_5
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         move v0, v2
    //         goto/16 :goto_0
    //         :cond_6
    //         move-object v0, v1
    //         goto :goto_2
    //         :sswitch_7
    //         const-string v0, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/model/internal/a$a;->cc(Ljava/lang/String;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_7
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :cond_7
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         move v0, v2
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
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun bp(p0: android.os.IBinder): com.google.android.gms.maps.model.internal.a { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/maps/model/internal/a;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/maps/model/internal/a;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/maps/model/internal/a;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/maps/model/internal/a$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/maps/model/internal/a$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
