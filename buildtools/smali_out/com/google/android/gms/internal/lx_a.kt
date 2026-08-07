package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 2 methods.

open class lx_a: android.os.Binder(), com.google.android.gms.internal.lx {
    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 8
    //         const/4 v0, 0x0
    //         const/4 v7, 0x1
    //         const/4 v5, 0x0
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v7
    //         :goto_0
    //         return v7
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/internal/mc;->CREATOR:Lcom/google/android/gms/internal/md;
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/internal/lw$a;->aJ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/lw;
    //         move-result-object v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p0, v1, v0, v2, v3}, Lcom/google/android/gms/internal/lx$a;->a(Ljava/util/List;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/lw;Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :cond_0
    //         move-object v0, v5
    //         goto :goto_1
    //         :sswitch_2
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/lw$a;->aJ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/lw;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/internal/lx$a;->a(Landroid/app/PendingIntent;Lcom/google/android/gms/internal/lw;Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :cond_1
    //         move-object v0, v5
    //         goto :goto_2
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/lw$a;->aJ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/lw;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/internal/lx$a;->a([Ljava/lang/String;Lcom/google/android/gms/internal/lw;Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/lw$a;->aJ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/lw;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/internal/lw;Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_5
    //         const-string v1, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J
    //         move-result-wide v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         move v1, v7
    //         :goto_3
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_4
    //         invoke-virtual {p0, v2, v3, v1, v0}, Lcom/google/android/gms/internal/lx$a;->a(JZLandroid/app/PendingIntent;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_2
    //         move v1, v0
    //         goto :goto_3
    //         :cond_3
    //         move-object v0, v5
    //         goto :goto_4
    //         :sswitch_6
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_5
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/lx$a;->removeActivityUpdates(Landroid/app/PendingIntent;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_4
    //         move-object v0, v5
    //         goto :goto_5
    //         :sswitch_7
    //         const-string v1, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lx$a;->lV()Landroid/location/Location;
    //         move-result-object v1
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v1, :cond_5
    //         invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p3, v7}, Landroid/location/Location;->writeToParcel(Landroid/os/Parcel;I)V
    //         goto/16 :goto_0
    //         :cond_5
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         goto/16 :goto_0
    //         :sswitch_8
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         sget-object v0, Lcom/google/android/gms/location/LocationRequest;->CREATOR:Lcom/google/android/gms/location/b;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/location/b;->cs(Landroid/os/Parcel;)Lcom/google/android/gms/location/LocationRequest;
    //         move-result-object v5
    //         :cond_6
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/location/a$a;->aI(Landroid/os/IBinder;)Lcom/google/android/gms/location/a;
    //         move-result-object v0
    //         invoke-virtual {p0, v5, v0}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/a;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_9
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_7
    //         sget-object v0, Lcom/google/android/gms/location/LocationRequest;->CREATOR:Lcom/google/android/gms/location/b;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/location/b;->cs(Landroid/os/Parcel;)Lcom/google/android/gms/location/LocationRequest;
    //         move-result-object v5
    //         :cond_7
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/location/a$a;->aI(Landroid/os/IBinder;)Lcom/google/android/gms/location/a;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v5, v0, v1}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/a;Ljava/lang/String;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_a
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_8
    //         sget-object v0, Lcom/google/android/gms/location/LocationRequest;->CREATOR:Lcom/google/android/gms/location/b;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/location/b;->cs(Landroid/os/Parcel;)Lcom/google/android/gms/location/LocationRequest;
    //         move-result-object v0
    //         move-object v1, v0
    //         :goto_6
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_9
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_7
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_8
    //         move-object v1, v5
    //         goto :goto_6
    //         :cond_9
    //         move-object v0, v5
    //         goto :goto_7
    //         :sswitch_b
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_a
    //         sget-object v0, Lcom/google/android/gms/internal/ma;->CREATOR:Lcom/google/android/gms/internal/mb;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mb;->cv(Landroid/os/Parcel;)Lcom/google/android/gms/internal/ma;
    //         move-result-object v5
    //         :cond_a
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/location/a$a;->aI(Landroid/os/IBinder;)Lcom/google/android/gms/location/a;
    //         move-result-object v0
    //         invoke-virtual {p0, v5, v0}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/a;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_c
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_b
    //         sget-object v0, Lcom/google/android/gms/internal/ma;->CREATOR:Lcom/google/android/gms/internal/mb;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mb;->cv(Landroid/os/Parcel;)Lcom/google/android/gms/internal/ma;
    //         move-result-object v0
    //         move-object v1, v0
    //         :goto_8
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_c
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_9
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/internal/ma;Landroid/app/PendingIntent;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_b
    //         move-object v1, v5
    //         goto :goto_8
    //         :cond_c
    //         move-object v0, v5
    //         goto :goto_9
    //         :sswitch_d
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/location/a$a;->aI(Landroid/os/IBinder;)Lcom/google/android/gms/location/a;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/location/a;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_e
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_d
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_a
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/lx$a;->a(Landroid/app/PendingIntent;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_d
    //         move-object v0, v5
    //         goto :goto_a
    //         :sswitch_f
    //         const-string v1, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_e
    //         move v0, v7
    //         :cond_e
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/lx$a;->setMockMode(Z)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_10
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_f
    //         sget-object v0, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/location/Location;
    //         :goto_b
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/lx$a;->setMockLocation(Landroid/location/Location;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_f
    //         move-object v0, v5
    //         goto :goto_b
    //         :sswitch_11
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_10
    //         sget-object v0, Lcom/google/android/gms/maps/model/LatLngBounds;->CREATOR:Lcom/google/android/gms/maps/model/g;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/maps/model/g;->cL(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/LatLngBounds;
    //         move-result-object v1
    //         :goto_c
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_11
    //         sget-object v0, Lcom/google/android/gms/internal/mj;->CREATOR:Lcom/google/android/gms/internal/mk;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mk;->cz(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mj;
    //         move-result-object v3
    //         :goto_d
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_12
    //         sget-object v0, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v4
    //         :goto_e
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/mv$a;->aM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mv;
    //         move-result-object v5
    //         move-object v0, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/maps/model/LatLngBounds;ILcom/google/android/gms/internal/mj;Lcom/google/android/gms/internal/mx;Lcom/google/android/gms/internal/mv;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_10
    //         move-object v1, v5
    //         goto :goto_c
    //         :cond_11
    //         move-object v3, v5
    //         goto :goto_d
    //         :cond_12
    //         move-object v4, v5
    //         goto :goto_e
    //         :sswitch_12
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_14
    //         sget-object v0, Lcom/google/android/gms/maps/model/LatLngBounds;->CREATOR:Lcom/google/android/gms/maps/model/g;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/maps/model/g;->cL(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/LatLngBounds;
    //         move-result-object v1
    //         :goto_f
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_15
    //         sget-object v0, Lcom/google/android/gms/internal/mj;->CREATOR:Lcom/google/android/gms/internal/mk;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mk;->cz(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mj;
    //         move-result-object v4
    //         :goto_10
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_13
    //         sget-object v0, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v5
    //         :cond_13
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/mv$a;->aM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mv;
    //         move-result-object v6
    //         move-object v0, p0
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/maps/model/LatLngBounds;ILjava/lang/String;Lcom/google/android/gms/internal/mj;Lcom/google/android/gms/internal/mx;Lcom/google/android/gms/internal/mv;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_14
    //         move-object v1, v5
    //         goto :goto_f
    //         :cond_15
    //         move-object v4, v5
    //         goto :goto_10
    //         :sswitch_13
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_16
    //         sget-object v1, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v5
    //         :cond_16
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/mv$a;->aM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mv;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v5, v1}, Lcom/google/android/gms/internal/lx$a;->a(Ljava/lang/String;Lcom/google/android/gms/internal/mx;Lcom/google/android/gms/internal/mv;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_14
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_18
    //         sget-object v0, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Lcom/google/android/gms/maps/model/i;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/maps/model/i;->cM(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/LatLng;
    //         move-result-object v0
    //         :goto_11
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_19
    //         sget-object v1, Lcom/google/android/gms/internal/mj;->CREATOR:Lcom/google/android/gms/internal/mk;
    //         invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/mk;->cz(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mj;
    //         move-result-object v1
    //         :goto_12
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_17
    //         sget-object v2, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v5
    //         :cond_17
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/internal/mv$a;->aM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mv;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v1, v5, v2}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/internal/mj;Lcom/google/android/gms/internal/mx;Lcom/google/android/gms/internal/mv;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_18
    //         move-object v0, v5
    //         goto :goto_11
    //         :cond_19
    //         move-object v1, v5
    //         goto :goto_12
    //         :sswitch_15
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1b
    //         sget-object v0, Lcom/google/android/gms/internal/mj;->CREATOR:Lcom/google/android/gms/internal/mk;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mk;->cz(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mj;
    //         move-result-object v0
    //         :goto_13
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_1a
    //         sget-object v1, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v5
    //         :cond_1a
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/mv$a;->aM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mv;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v5, v1}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/internal/mj;Lcom/google/android/gms/internal/mx;Lcom/google/android/gms/internal/mv;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_1b
    //         move-object v0, v5
    //         goto :goto_13
    //         :sswitch_16
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_1c
    //         sget-object v1, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v5
    //         :cond_1c
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/mv$a;->aM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mv;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v5, v1}, Lcom/google/android/gms/internal/lx$a;->b(Ljava/lang/String;Lcom/google/android/gms/internal/mx;Lcom/google/android/gms/internal/mv;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_17
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1d
    //         sget-object v0, Lcom/google/android/gms/internal/mt;->CREATOR:Lcom/google/android/gms/internal/mu;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mu;->cE(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mt;
    //         move-result-object v1
    //         :goto_14
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1e
    //         sget-object v0, Lcom/google/android/gms/maps/model/LatLngBounds;->CREATOR:Lcom/google/android/gms/maps/model/g;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/maps/model/g;->cL(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/LatLngBounds;
    //         move-result-object v2
    //         :goto_15
    //         invoke-virtual {p2}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;
    //         move-result-object v3
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1f
    //         sget-object v0, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v4
    //         :goto_16
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/mv$a;->aM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mv;
    //         move-result-object v5
    //         move-object v0, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/internal/mt;Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/List;Lcom/google/android/gms/internal/mx;Lcom/google/android/gms/internal/mv;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_1d
    //         move-object v1, v5
    //         goto :goto_14
    //         :cond_1e
    //         move-object v2, v5
    //         goto :goto_15
    //         :cond_1f
    //         move-object v4, v5
    //         goto :goto_16
    //         :sswitch_18
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_20
    //         sget-object v0, Lcom/google/android/gms/internal/mn;->CREATOR:Lcom/google/android/gms/internal/mo;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mo;->cB(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mn;
    //         move-result-object v0
    //         move-object v1, v0
    //         :goto_17
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_21
    //         sget-object v0, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v0
    //         move-object v2, v0
    //         :goto_18
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_22
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_19
    //         invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/internal/mn;Lcom/google/android/gms/internal/mx;Landroid/app/PendingIntent;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_20
    //         move-object v1, v5
    //         goto :goto_17
    //         :cond_21
    //         move-object v2, v5
    //         goto :goto_18
    //         :cond_22
    //         move-object v0, v5
    //         goto :goto_19
    //         :sswitch_19
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_23
    //         sget-object v0, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v0
    //         move-object v1, v0
    //         :goto_1a
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_24
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_1b
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/internal/mx;Landroid/app/PendingIntent;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_23
    //         move-object v1, v5
    //         goto :goto_1a
    //         :cond_24
    //         move-object v0, v5
    //         goto :goto_1b
    //         :sswitch_1a
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_25
    //         sget-object v0, Lcom/google/android/gms/internal/mh;->CREATOR:Lcom/google/android/gms/internal/mi;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mi;->cy(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mh;
    //         move-result-object v0
    //         move-object v1, v0
    //         :goto_1c
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_26
    //         sget-object v0, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v0
    //         move-object v2, v0
    //         :goto_1d
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_27
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_1e
    //         invoke-virtual {p0, v1, v2, v0}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/internal/mh;Lcom/google/android/gms/internal/mx;Landroid/app/PendingIntent;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_25
    //         move-object v1, v5
    //         goto :goto_1c
    //         :cond_26
    //         move-object v2, v5
    //         goto :goto_1d
    //         :cond_27
    //         move-object v0, v5
    //         goto :goto_1e
    //         :sswitch_1b
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_28
    //         sget-object v0, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v0
    //         move-object v1, v0
    //         :goto_1f
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_29
    //         sget-object v0, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_20
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/lx$a;->b(Lcom/google/android/gms/internal/mx;Landroid/app/PendingIntent;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_28
    //         move-object v1, v5
    //         goto :goto_1f
    //         :cond_29
    //         move-object v0, v5
    //         goto :goto_20
    //         :sswitch_1c
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_2a
    //         sget-object v0, Lcom/google/android/gms/maps/model/LatLngBounds;->CREATOR:Lcom/google/android/gms/maps/model/g;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/maps/model/g;->cL(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/LatLngBounds;
    //         move-result-object v2
    //         :goto_21
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_2b
    //         sget-object v0, Lcom/google/android/gms/internal/mf;->CREATOR:Lcom/google/android/gms/internal/mg;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mg;->cx(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mf;
    //         move-result-object v3
    //         :goto_22
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_2c
    //         sget-object v0, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v4
    //         :goto_23
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/mv$a;->aM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mv;
    //         move-result-object v5
    //         move-object v0, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/lx$a;->a(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/internal/mf;Lcom/google/android/gms/internal/mx;Lcom/google/android/gms/internal/mv;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_2a
    //         move-object v2, v5
    //         goto :goto_21
    //         :cond_2b
    //         move-object v3, v5
    //         goto :goto_22
    //         :cond_2c
    //         move-object v4, v5
    //         goto :goto_23
    //         :sswitch_1d
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_2e
    //         sget-object v0, Lcom/google/android/gms/internal/mr;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/mr;
    //         :goto_24
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_2d
    //         sget-object v1, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v5
    //         :cond_2d
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/mv$a;->aM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mv;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v5, v1}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/internal/mr;Lcom/google/android/gms/internal/mx;Lcom/google/android/gms/internal/mv;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_2e
    //         move-object v0, v5
    //         goto :goto_24
    //         :sswitch_1e
    //         const-string v1, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/lx$a;->bW(Ljava/lang/String;)Landroid/location/Location;
    //         move-result-object v1
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v1, :cond_2f
    //         invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p3, v7}, Landroid/location/Location;->writeToParcel(Landroid/os/Parcel;I)V
    //         goto/16 :goto_0
    //         :cond_2f
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         goto/16 :goto_0
    //         :sswitch_1f
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_31
    //         sget-object v0, Lcom/google/android/gms/internal/ml;->CREATOR:Lcom/google/android/gms/internal/mm;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mm;->cA(Landroid/os/Parcel;)Lcom/google/android/gms/internal/ml;
    //         move-result-object v0
    //         :goto_25
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         if-eqz v1, :cond_30
    //         sget-object v1, Lcom/google/android/gms/internal/mx;->CREATOR:Lcom/google/android/gms/internal/my;
    //         invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/my;->cF(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mx;
    //         move-result-object v5
    //         :cond_30
    //         invoke-virtual {p0, v0, v5}, Lcom/google/android/gms/internal/lx$a;->a(Lcom/google/android/gms/internal/ml;Lcom/google/android/gms/internal/mx;)V
    //         goto/16 :goto_0
    //         :cond_31
    //         move-object v0, v5
    //         goto :goto_25
    //         :sswitch_20
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_32
    //         sget-object v0, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/location/Location;
    //         :goto_26
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/lx$a;->a(Landroid/location/Location;I)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :cond_32
    //         move-object v0, v5
    //         goto :goto_26
    //         :sswitch_21
    //         const-string v1, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/lx$a;->bX(Ljava/lang/String;)Lcom/google/android/gms/location/c;
    //         move-result-object v1
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v1, :cond_33
    //         invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v1, p3, v7}, Lcom/google/android/gms/location/c;->writeToParcel(Landroid/os/Parcel;I)V
    //         goto/16 :goto_0
    //         :cond_33
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         goto/16 :goto_0
    //         :sswitch_22
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lx$a;->lW()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         goto/16 :goto_0
    //         :sswitch_23
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lx$a;->lX()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
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
    //             0x9 -> :sswitch_a
    //             0xa -> :sswitch_d
    //             0xb -> :sswitch_e
    //             0xc -> :sswitch_f
    //             0xd -> :sswitch_10
    //             0xe -> :sswitch_11
    //             0xf -> :sswitch_13
    //             0x10 -> :sswitch_14
    //             0x11 -> :sswitch_15
    //             0x12 -> :sswitch_18
    //             0x13 -> :sswitch_19
    //             0x14 -> :sswitch_9
    //             0x15 -> :sswitch_1e
    //             0x19 -> :sswitch_1f
    //             0x1a -> :sswitch_20
    //             0x22 -> :sswitch_21
    //             0x2a -> :sswitch_16
    //             0x2e -> :sswitch_1d
    //             0x2f -> :sswitch_12
    //             0x30 -> :sswitch_1a
    //             0x31 -> :sswitch_1b
    //             0x32 -> :sswitch_17
    //             0x33 -> :sswitch_22
    //             0x34 -> :sswitch_b
    //             0x35 -> :sswitch_c
    //             0x36 -> :sswitch_23
    //             0x37 -> :sswitch_1c
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun aK(p0: android.os.IBinder): com.google.android.gms.internal.lx { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/lx;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/internal/lx;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/internal/lx;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/lx$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/lx$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
