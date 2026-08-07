package com.google.android.gms.dynamic

// Auto-emitted from smali.
// 0 fields, 4 methods.

open class d_a: android.os.Binder(), com.google.android.gms.dynamic.d {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 1
    //         packed-switch p1, :pswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         const-string v0, "com.google.android.gms.dynamic.IObjectWrapper"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x5f4e5446
    //             :pswitch_0
    //         .end packed-switch
    */

    companion object {
    public @JvmStatic fun am(p0: android.os.IBinder): com.google.android.gms.dynamic.d { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.dynamic.IObjectWrapper"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/dynamic/d;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/dynamic/d;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/dynamic/d$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/dynamic/d$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
