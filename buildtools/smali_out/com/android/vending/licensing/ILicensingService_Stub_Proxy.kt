package com.android.vending.licensing

// Auto-emitted from smali source: ILicensingService.java.
// 1 fields, 4 methods.

open class ILicensingService_Stub_Proxy: com.android.vending.licensing.ILicensingService {
    private var mRemote: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/licensing/ILicensingService$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun checkLicense(p0: Long, p1: String, p2: com.android.vending.licensing.ILicenseResultListener) { /* TODO(body): (JLjava/lang/String;Lcom/android/vending/licensing/ILicenseResultListener;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         :try_start_0
    //         const-string v2, "com.android.vending.licensing.ILicensingService"
    //         invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v1, p1, p2}, Landroid/os/Parcel;->writeLong(J)V
    //         invoke-virtual {v1, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p4, :cond_0
    //         invoke-interface {p4}, Lcom/android/vending/licensing/ILicenseResultListener;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v0, p0, Lcom/android/vending/licensing/ILicensingService$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v0, v2, v1, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    */

    public fun getInterfaceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.android.vending.licensing.ILicensingService"
    //         return-object v0
    */

}
