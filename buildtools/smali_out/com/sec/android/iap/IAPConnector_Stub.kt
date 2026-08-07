package com.sec.android.iap

// Auto-emitted from smali source: IAPConnector.java.
// 6 fields, 4 methods.

open class IAPConnector_Stub: android.os.Binder(), com.sec.android.iap.IAPConnector {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 10
    //         const/4 v9, 0x0
    //         const/4 v8, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v8
    //         :goto_0
    //         return v8
    //         :sswitch_0
    //         const-string v0, "com.sec.android.iap.IAPConnector"
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "com.sec.android.iap.IAPConnector"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/sec/android/iap/IAPServiceCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/sec/android/iap/IAPServiceCallback;
    //         move-result-object v1
    //         .local v1, "_arg0":Lcom/sec/android/iap/IAPServiceCallback;
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/os/Bundle;
    //         .local v2, "_arg1":Landroid/os/Bundle;
    //         :goto_1
    //         invoke-virtual {p0, v1, v2}, Lcom/sec/android/iap/IAPConnector$Stub;->requestCmd(Lcom/sec/android/iap/IAPServiceCallback;Landroid/os/Bundle;)Z
    //         move-result v7
    //         .local v7, "_result":Z
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v7, :cond_1
    //         move v0, v8
    //         :goto_2
    //         invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_0
    //         .end local v2    # "_arg1":Landroid/os/Bundle;
    //         .end local v7    # "_result":Z
    //         :cond_0
    //         const/4 v2, 0x0
    //         .restart local v2    # "_arg1":Landroid/os/Bundle;
    //         goto :goto_1
    //         .restart local v7    # "_result":Z
    //         :cond_1
    //         move v0, v9
    //         goto :goto_2
    //         .end local v1    # "_arg0":Lcom/sec/android/iap/IAPServiceCallback;
    //         .end local v2    # "_arg1":Landroid/os/Bundle;
    //         .end local v7    # "_result":Z
    //         :sswitch_2
    //         const-string v0, "com.sec.android.iap.IAPConnector"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/sec/android/iap/IAPServiceCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/sec/android/iap/IAPServiceCallback;
    //         move-result-object v1
    //         .restart local v1    # "_arg0":Lcom/sec/android/iap/IAPServiceCallback;
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/IAPConnector$Stub;->unregisterCallback(Lcom/sec/android/iap/IAPServiceCallback;)Z
    //         move-result v7
    //         .restart local v7    # "_result":Z
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v7, :cond_2
    //         move v9, v8
    //         :cond_2
    //         invoke-virtual {p3, v9}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_0
    //         .end local v1    # "_arg0":Lcom/sec/android/iap/IAPServiceCallback;
    //         .end local v7    # "_result":Z
    //         :sswitch_3
    //         const-string v0, "com.sec.android.iap.IAPConnector"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         .local v1, "_arg0":I
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/IAPConnector$Stub;->init(I)Landroid/os/Bundle;
    //         move-result-object v7
    //         .local v7, "_result":Landroid/os/Bundle;
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v7, :cond_3
    //         invoke-virtual {p3, v8}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v7, p3, v8}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :cond_3
    //         invoke-virtual {p3, v9}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_0
    //         .end local v1    # "_arg0":I
    //         .end local v7    # "_result":Landroid/os/Bundle;
    //         :sswitch_4
    //         const-string v0, "com.sec.android.iap.IAPConnector"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         .restart local v1    # "_arg0":I
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         .local v2, "_arg1":Ljava/lang/String;
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v3
    //         .local v3, "_arg2":Ljava/lang/String;
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v4
    //         .local v4, "_arg3":I
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v5
    //         .local v5, "_arg4":I
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v6
    //         .local v6, "_arg5":Ljava/lang/String;
    //         move-object v0, p0
    //         invoke-virtual/range {v0 .. v6}, Lcom/sec/android/iap/IAPConnector$Stub;->getItemList(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v7
    //         .restart local v7    # "_result":Landroid/os/Bundle;
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v7, :cond_4
    //         invoke-virtual {p3, v8}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v7, p3, v8}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         goto/16 :goto_0
    //         :cond_4
    //         invoke-virtual {p3, v9}, Landroid/os/Parcel;->writeInt(I)V
    //         goto/16 :goto_0
    //         .end local v1    # "_arg0":I
    //         .end local v2    # "_arg1":Ljava/lang/String;
    //         .end local v3    # "_arg2":Ljava/lang/String;
    //         .end local v4    # "_arg3":I
    //         .end local v5    # "_arg4":I
    //         .end local v6    # "_arg5":Ljava/lang/String;
    //         .end local v7    # "_result":Landroid/os/Bundle;
    //         :sswitch_5
    //         const-string v0, "com.sec.android.iap.IAPConnector"
    //         invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v1
    //         .local v1, "_arg0":Ljava/lang/String;
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         .restart local v2    # "_arg1":Ljava/lang/String;
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         .local v3, "_arg2":I
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v4
    //         .restart local v4    # "_arg3":I
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v5
    //         .local v5, "_arg4":Ljava/lang/String;
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v6
    //         .restart local v6    # "_arg5":Ljava/lang/String;
    //         move-object v0, p0
    //         invoke-virtual/range {v0 .. v6}, Lcom/sec/android/iap/IAPConnector$Stub;->getItemsInbox(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v7
    //         .restart local v7    # "_result":Landroid/os/Bundle;
    //         invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V
    //         if-eqz v7, :cond_5
    //         invoke-virtual {p3, v8}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v7, p3, v8}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         goto/16 :goto_0
    //         :cond_5
    //         invoke-virtual {p3, v9}, Landroid/os/Parcel;->writeInt(I)V
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
    private val DESCRIPTOR: String = "com.sec.android.iap.IAPConnector"
    val TRANSACTION_getItemList: Int = 0x4
    val TRANSACTION_getItemsInbox: Int = 0x5
    val TRANSACTION_init: Int = 0x3
    val TRANSACTION_requestCmd: Int = 0x1
    val TRANSACTION_unregisterCallback: Int = 0x2

    public @JvmStatic fun asInterface(obj: android.os.IBinder): com.sec.android.iap.IAPConnector { return TODO("body: (Landroid/os/IBinder;)Lcom/sec/android/iap/IAPConnector;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v1, "com.sec.android.iap.IAPConnector"
    //         invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         .local v0, "iin":Landroid/os/IInterface;
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Lcom/sec/android/iap/IAPConnector;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Lcom/sec/android/iap/IAPConnector;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Lcom/sec/android/iap/IAPConnector$Stub$Proxy;
    //         .end local v0    # "iin":Landroid/os/IInterface;
    //         invoke-direct {v0, p0}, Lcom/sec/android/iap/IAPConnector$Stub$Proxy;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
