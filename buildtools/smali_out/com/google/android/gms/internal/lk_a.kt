package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 3 methods.

open class lk_a: android.os.Binder(), com.google.android.gms.internal.lk {
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
    //         const-string v0, "com.google.android.gms.fitness.internal.service.IFitnessSensorService"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v2, "com.google.android.gms.fitness.internal.service.IFitnessSensorService"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/lg;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lg;
    //         :cond_0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/internal/kn$a;->aq(Landroid/os/IBinder;)Lcom/google/android/gms/internal/kn;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/lk$a;->a(Lcom/google/android/gms/internal/lg;Lcom/google/android/gms/internal/kn;)V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v2, "com.google.android.gms.fitness.internal.service.IFitnessSensorService"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         sget-object v0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;
    //         :cond_1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/internal/kt$a;->aw(Landroid/os/IBinder;)Lcom/google/android/gms/internal/kt;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/lk$a;->a(Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;Lcom/google/android/gms/internal/kt;)V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v2, "com.google.android.gms.fitness.internal.service.IFitnessSensorService"
    //         invoke-virtual {p2, v2}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         sget-object v0, Lcom/google/android/gms/internal/li;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/li;
    //         :cond_2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/internal/kt$a;->aw(Landroid/os/IBinder;)Lcom/google/android/gms/internal/kt;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/lk$a;->a(Lcom/google/android/gms/internal/li;Lcom/google/android/gms/internal/kt;)V
    //         move v0, v1
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

}
