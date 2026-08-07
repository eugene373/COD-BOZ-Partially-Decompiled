package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 0 fields, 2 methods.

open class IStreetViewPanoramaFragmentDelegate_a: android.os.Binder(), com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate {
    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 5
    //         const/4 v2, 0x0
    //         const/4 v1, 0x0
    //         const/4 v3, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v3
    //         :goto_0
    //         return v3
    //         :sswitch_0
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a;->getStreetViewPanorama()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :goto_1
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         goto :goto_0
    //         :cond_0
    //         move-object v0, v1
    //         goto :goto_1
    //         :sswitch_2
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/d$a;->am(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->CREATOR:Lcom/google/android/gms/maps/c;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/maps/c;->cH(Landroid/os/Parcel;)Lcom/google/android/gms/maps/StreetViewPanoramaOptions;
    //         move-result-object v0
    //         move-object v2, v0
    //         :goto_2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_3
    //         invoke-virtual {p0, v4, v2, v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a;->onInflate(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;Landroid/os/Bundle;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :cond_1
    //         move-object v2, v1
    //         goto :goto_2
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_3
    //         :sswitch_3
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_4
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a;->onCreate(Landroid/os/Bundle;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto :goto_0
    //         :cond_3
    //         move-object v0, v1
    //         goto :goto_4
    //         :sswitch_4
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/d$a;->am(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/d$a;->am(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_5
    //         invoke-virtual {p0, v2, v4, v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a;->onCreateView(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/dynamic/d;Landroid/os/Bundle;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_4
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v1
    //         :cond_4
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         goto/16 :goto_0
    //         :cond_5
    //         move-object v0, v1
    //         goto :goto_5
    //         :sswitch_5
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a;->onResume()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_6
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a;->onPause()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_7
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a;->onDestroyView()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_8
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a;->onDestroy()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_9
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a;->onLowMemory()V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         goto/16 :goto_0
    //         :sswitch_a
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_6
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_7
    //         invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p3, v3}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         goto/16 :goto_0
    //         :cond_6
    //         move-object v0, v1
    //         goto :goto_6
    //         :cond_7
    //         invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         goto/16 :goto_0
    //         :sswitch_b
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a;->isReady()Z
    //         move-result v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_8
    //         move v0, v3
    //         :goto_7
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         goto/16 :goto_0
    //         :cond_8
    //         move v0, v2
    //         goto :goto_7
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
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    public @JvmStatic fun bm(p0: android.os.IBinder): com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a$a;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate$a$a;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
