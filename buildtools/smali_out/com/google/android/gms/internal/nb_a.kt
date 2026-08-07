package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 2 methods.

open class nb_a: android.os.Binder(), com.google.android.gms.internal.nb {
    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 5
    //         const/4 v2, 0x0
    //         const/4 v3, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v3
    //         :goto_0
    //         return v3
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.panorama.internal.IPanoramaService"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.panorama.internal.IPanoramaService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/na$a;->bz(Landroid/os/IBinder;)Lcom/google/android/gms/internal/na;
    //         move-result-object v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/Uri;
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
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         move v2, v3
    //         :goto_3
    //         invoke-virtual {p0, v4, v1, v0, v2}, Lcom/google/android/gms/internal/nb$a;->a(Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;Z)V
    //         goto :goto_0
    //         :cond_0
    //         move-object v1, v2
    //         goto :goto_1
    //         :cond_1
    //         move-object v0, v2
    //         goto :goto_2
    //         :cond_2
    //         const/4 v2, 0x0
    //         goto :goto_3
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun bA(p0: android.os.IBinder): com.google.android.gms.internal.nb { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/nb;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.panorama.internal.IPanoramaService"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/internal/nb;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/internal/nb;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/nb$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/nb$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
