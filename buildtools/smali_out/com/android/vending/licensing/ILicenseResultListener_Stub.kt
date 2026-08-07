package com.android.vending.licensing

// Auto-emitted from smali source: ILicenseResultListener.java.
// 2 fields, 4 methods.

open class ILicenseResultListener_Stub: android.os.Binder(), com.android.vending.licensing.ILicenseResultListener {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(p0: Int, p1: android.os.Parcel, p2: android.os.Parcel, p3: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v1, "com.android.vending.licensing.ILicenseResultListener"
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v1, "com.android.vending.licensing.ILicenseResultListener"
    //         invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p0, v1, v2, v3}, Lcom/android/vending/licensing/ILicenseResultListener$Stub;->verifyLicense(ILjava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    private val DESCRIPTOR: String = "com.android.vending.licensing.ILicenseResultListener"
    val TRANSACTION_verifyLicense: Int = 0x1

    public @JvmStatic fun asInterface(p0: android.os.IBinder): com.android.vending.licensing.ILicenseResultListener { return TODO("body: (Landroid/os/IBinder;)Lcom/android/vending/licensing/ILicenseResultListener;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.android.vending.licensing.ILicenseResultListener"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/android/vending/licensing/ILicenseResultListener;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/android/vending/licensing/ILicenseResultListener;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/android/vending/licensing/ILicenseResultListener$Stub$Proxy;
    //         invoke-direct {v0, p0}, Lcom/android/vending/licensing/ILicenseResultListener$Stub$Proxy;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
