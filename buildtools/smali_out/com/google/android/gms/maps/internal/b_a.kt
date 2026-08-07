package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 0 fields, 4 methods.

open class b_a: android.os.Binder(), com.google.android.gms.maps.internal.b {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v1, "com.google.android.gms.maps.internal.ICancelableCallback"
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v1, "com.google.android.gms.maps.internal.ICancelableCallback"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/internal/b$a;->onFinish()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v1, "com.google.android.gms.maps.internal.ICancelableCallback"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/internal/b$a;->onCancel()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_2
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun aO(p0: android.os.IBinder): com.google.android.gms.maps.internal.b { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/maps/internal/b;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.maps.internal.ICancelableCallback"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/maps/internal/b;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/maps/internal/b;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/maps/internal/b$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/maps/internal/b$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
