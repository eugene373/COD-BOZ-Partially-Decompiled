package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 4 methods.

open class lw_a: android.os.Binder(), com.google.android.gms.internal.lw {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.location.internal.IGeofencerCallbacks"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.location.internal.IGeofencerCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/lw$a;->onAddGeofencesResult(I[Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "com.google.android.gms.location.internal.IGeofencerCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/lw$a;->onRemoveGeofencesByRequestIdsResult(I[Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.location.internal.IGeofencerCallbacks"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_1
    //         invoke-virtual {p0, v2, v0}, Lcom/google/android/gms/internal/lw$a;->onRemoveGeofencesByPendingIntentResult(ILandroid/app/PendingIntent;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v1
    //         goto :goto_0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_1
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun aJ(p0: android.os.IBinder): com.google.android.gms.internal.lw { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/lw;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.location.internal.IGeofencerCallbacks"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/internal/lw;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/internal/lw;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/lw$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/lw$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
