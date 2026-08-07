package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 2 methods.

open class hc_a: android.os.Binder(), com.google.android.gms.internal.hc {
    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 7
    //         const/4 v6, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.analytics.internal.IAnalyticsService"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v6
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.analytics.internal.IAnalyticsService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v0
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->readHashMap(Ljava/lang/ClassLoader;)Ljava/util/HashMap;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J
    //         move-result-wide v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v4
    //         sget-object v0, Lcom/google/android/gms/internal/hb;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v5
    //         move-object v0, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/hc$a;->a(Ljava/util/Map;JLjava/lang/String;Ljava/util/List;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v6
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "com.google.android.gms.analytics.internal.IAnalyticsService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/hc$a;->dH()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         move v0, v6
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.analytics.internal.IAnalyticsService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/hc$a;->getVersion()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v6
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun E(p0: android.os.IBinder): com.google.android.gms.internal.hc { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/hc;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.analytics.internal.IAnalyticsService"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/internal/hc;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/internal/hc;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/hc$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/hc$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
