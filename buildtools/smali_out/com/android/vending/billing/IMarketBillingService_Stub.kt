package com.android.vending.billing

// Auto-emitted from smali source: IMarketBillingService.java.
// 2 fields, 4 methods.

open class IMarketBillingService_Stub: android.os.Binder(), com.android.vending.billing.IMarketBillingService {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(p0: Int, p1: android.os.Parcel, p2: android.os.Parcel, p3: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v1, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v0, "com.android.vending.billing.IMarketBillingService"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v1
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.android.vending.billing.IMarketBillingService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_1
    //         invoke-virtual {p0, v0}, Lcom/android/vending/billing/IMarketBillingService$Stub;->sendBillingRequest(Landroid/os/Bundle;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p3, v1}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_1
    //         :cond_1
    //         const/4 v0, 0x0
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_2
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    private val DESCRIPTOR: String = "com.android.vending.billing.IMarketBillingService"
    val TRANSACTION_sendBillingRequest: Int = 0x1

    public @JvmStatic fun asInterface(p0: android.os.IBinder): com.android.vending.billing.IMarketBillingService { return TODO("body: (Landroid/os/IBinder;)Lcom/android/vending/billing/IMarketBillingService;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.android.vending.billing.IMarketBillingService"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/android/vending/billing/IMarketBillingService;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/android/vending/billing/IMarketBillingService;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy;
    //         invoke-direct {v0, p0}, Lcom/android/vending/billing/IMarketBillingService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
