package com.sec.android.iap

// Auto-emitted from smali source: IAPServiceCallback.java.
// 1 fields, 4 methods.

open class IAPServiceCallback_Stub_Proxy: com.sec.android.iap.IAPServiceCallback {
    private var mRemote: android.os.IBinder

    constructor(remote: android.os.IBinder)

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/IAPServiceCallback$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun getInterfaceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.sec.android.iap.IAPServiceCallback"
    //         return-object v0
    */

    public fun responseCallback(bundle: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         .local v0, "_data":Landroid/os/Parcel;
    //         :try_start_0
    //         const-string v1, "com.sec.android.iap.IAPServiceCallback"
    //         invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v1, 0x0
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v1, p0, Lcom/sec/android/iap/IAPServiceCallback$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v1, v2, v0, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :cond_0
    //         const/4 v1, 0x0
    //         :try_start_1
    //         invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v1
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         throw v1
    */

}
