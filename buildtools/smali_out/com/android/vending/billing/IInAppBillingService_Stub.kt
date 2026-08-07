package com.android.vending.billing

// Auto-emitted from smali source: IInAppBillingService.java.
// 6 fields, 4 methods.

open class IInAppBillingService_Stub: android.os.Binder(), com.android.vending.billing.IInAppBillingService {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(p0: Int, p1: android.os.Parcel, p2: android.os.Parcel, p3: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v7, 0x0
    //         const/4 v6, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const-string v0, "com.android.vending.billing.IInAppBillingService"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         move v0, v6
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.android.vending.billing.IInAppBillingService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/android/vending/billing/IInAppBillingService$Stub;->isBillingSupported(ILjava/lang/String;Ljava/lang/String;)I
    //         move-result v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         move v0, v6
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "com.android.vending.billing.IInAppBillingService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         :goto_1
    //         invoke-virtual {p0, v1, v2, v3, v0}, Lcom/android/vending/billing/IInAppBillingService$Stub;->getSkuDetails(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p3, v6}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_2
    //         move v0, v6
    //         goto :goto_0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_1
    //         :cond_1
    //         invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_2
    //         :sswitch_3
    //         const-string v0, "com.android.vending.billing.IInAppBillingService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v5
    //         move-object v0, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/android/vending/billing/IInAppBillingService$Stub;->getBuyIntent(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p3, v6}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_3
    //         move v0, v6
    //         goto/16 :goto_0
    //         :cond_2
    //         invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_3
    //         :sswitch_4
    //         const-string v0, "com.android.vending.billing.IInAppBillingService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p0, v0, v1, v2, v3}, Lcom/android/vending/billing/IInAppBillingService$Stub;->getPurchases(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v0, :cond_3
    //         invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p3, v6}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_4
    //         move v0, v6
    //         goto/16 :goto_0
    //         :cond_3
    //         invoke-virtual {p3, v7}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_4
    //         :sswitch_5
    //         const-string v0, "com.android.vending.billing.IInAppBillingService"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/android/vending/billing/IInAppBillingService$Stub;->consumePurchase(ILjava/lang/String;Ljava/lang/String;)I
    //         move-result v0
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         move v0, v6
    //         goto/16 :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x4 -> :sswitch_4
    //             0x5 -> :sswitch_5
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    private val DESCRIPTOR: String = "com.android.vending.billing.IInAppBillingService"
    val TRANSACTION_consumePurchase: Int = 0x5
    val TRANSACTION_getBuyIntent: Int = 0x3
    val TRANSACTION_getPurchases: Int = 0x4
    val TRANSACTION_getSkuDetails: Int = 0x2
    val TRANSACTION_isBillingSupported: Int = 0x1

    public @JvmStatic fun asInterface(p0: android.os.IBinder): com.android.vending.billing.IInAppBillingService { return TODO("body: (Landroid/os/IBinder;)Lcom/android/vending/billing/IInAppBillingService;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.android.vending.billing.IInAppBillingService"
    //         invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/android/vending/billing/IInAppBillingService;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/android/vending/billing/IInAppBillingService;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/android/vending/billing/IInAppBillingService$Stub$Proxy;
    //         invoke-direct {v0, p0}, Lcom/android/vending/billing/IInAppBillingService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
