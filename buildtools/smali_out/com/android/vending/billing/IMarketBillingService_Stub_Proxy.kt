package com.android.vending.billing

// Auto-emitted from smali source: IMarketBillingService.java.
// 1 fields, 4 methods.

open class IMarketBillingService_Stub_Proxy: com.android.vending.billing.IMarketBillingService {
    private var mRemote: android.os.IBinder

    constructor(p0: android.os.IBinder)

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun getInterfaceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.android.vending.billing.IMarketBillingService"
    //         return-object v0
    */

    public fun sendBillingRequest(p0: android.os.Bundle): android.os.Bundle { return TODO("body: (Landroid/os/Bundle;)Landroid/os/Bundle;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v2
    //         :try_start_0
    //         const-string v0, "com.android.vending.billing.IMarketBillingService"
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         const/4 v3, 0x1
    //         const/4 v4, 0x0
    //         invoke-interface {v0, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, v2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :goto_1
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         throw v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

}
