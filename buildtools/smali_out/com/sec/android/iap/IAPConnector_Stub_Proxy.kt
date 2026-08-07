package com.sec.android.iap

// Auto-emitted from smali source: IAPConnector.java.
// 1 fields, 8 methods.

open class IAPConnector_Stub_Proxy: com.sec.android.iap.IAPConnector {
    private var mRemote: android.os.IBinder

    constructor(remote: android.os.IBinder)

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/IAPConnector$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun getInterfaceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.sec.android.iap.IAPConnector"
    //         return-object v0
    */

    public fun getItemList(mode: Int, packageName: String, itemGroupId: String, startNum: Int, endNum: Int, itemType: String): android.os.Bundle { return TODO("body: (ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 6
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         .local v0, "_data":Landroid/os/Parcel;
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         .local v1, "_reply":Landroid/os/Parcel;
    //         :try_start_0
    //         const-string v3, "com.sec.android.iap.IAPConnector"
    //         invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p5}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p6}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/sec/android/iap/IAPConnector$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         const/4 v4, 0x4
    //         const/4 v5, 0x0
    //         invoke-interface {v3, v4, v0, v1, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/os/Bundle;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         .local v2, "_result":Landroid/os/Bundle;
    //         :goto_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         return-object v2
    //         .end local v2    # "_result":Landroid/os/Bundle;
    //         :cond_0
    //         const/4 v2, 0x0
    //         .restart local v2    # "_result":Landroid/os/Bundle;
    //         goto :goto_0
    //         .end local v2    # "_result":Landroid/os/Bundle;
    //         :catchall_0
    //         move-exception v3
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         throw v3
    */

    public fun getItemsInbox(packageName: String, itemGroupId: String, startNum: Int, endNum: Int, startDate: String, endDate: String): android.os.Bundle { return TODO("body: (Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 6
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         .local v0, "_data":Landroid/os/Parcel;
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         .local v1, "_reply":Landroid/os/Parcel;
    //         :try_start_0
    //         const-string v3, "com.sec.android.iap.IAPConnector"
    //         invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p4}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p5}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v0, p6}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/sec/android/iap/IAPConnector$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         const/4 v4, 0x5
    //         const/4 v5, 0x0
    //         invoke-interface {v3, v4, v0, v1, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/os/Bundle;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         .local v2, "_result":Landroid/os/Bundle;
    //         :goto_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         return-object v2
    //         .end local v2    # "_result":Landroid/os/Bundle;
    //         :cond_0
    //         const/4 v2, 0x0
    //         .restart local v2    # "_result":Landroid/os/Bundle;
    //         goto :goto_0
    //         .end local v2    # "_result":Landroid/os/Bundle;
    //         :catchall_0
    //         move-exception v3
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         throw v3
    */

    public fun init(mode: Int): android.os.Bundle { return TODO("body: (I)Landroid/os/Bundle;") }
    /*
    //         .locals 6
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         .local v0, "_data":Landroid/os/Parcel;
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         .local v1, "_reply":Landroid/os/Parcel;
    //         :try_start_0
    //         const-string v3, "com.sec.android.iap.IAPConnector"
    //         invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v3, p0, Lcom/sec/android/iap/IAPConnector$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         const/4 v4, 0x3
    //         const/4 v5, 0x0
    //         invoke-interface {v3, v4, v0, v1, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v3, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/os/Bundle;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         .local v2, "_result":Landroid/os/Bundle;
    //         :goto_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         return-object v2
    //         .end local v2    # "_result":Landroid/os/Bundle;
    //         :cond_0
    //         const/4 v2, 0x0
    //         .restart local v2    # "_result":Landroid/os/Bundle;
    //         goto :goto_0
    //         .end local v2    # "_result":Landroid/os/Bundle;
    //         :catchall_0
    //         move-exception v3
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         throw v3
    */

    public fun requestCmd(callback: com.sec.android.iap.IAPServiceCallback, bundle: android.os.Bundle): Boolean { return TODO("body: (Lcom/sec/android/iap/IAPServiceCallback;Landroid/os/Bundle;)Z") }
    /*
    //         .locals 7
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         .local v0, "_data":Landroid/os/Parcel;
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         .local v1, "_reply":Landroid/os/Parcel;
    //         :try_start_0
    //         const-string v4, "com.sec.android.iap.IAPConnector"
    //         invoke-virtual {v0, v4}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/sec/android/iap/IAPServiceCallback;->asBinder()Landroid/os/IBinder;
    //         move-result-object v4
    //         :goto_0
    //         invoke-virtual {v0, v4}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         if-eqz p2, :cond_1
    //         const/4 v4, 0x1
    //         invoke-virtual {v0, v4}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v4, 0x0
    //         invoke-virtual {p2, v0, v4}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_1
    //         iget-object v4, p0, Lcom/sec/android/iap/IAPConnector$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         const/4 v5, 0x1
    //         const/4 v6, 0x0
    //         invoke-interface {v4, v5, v0, v1, v6}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         .local v2, "_result":Z
    //         :goto_2
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         return v2
    //         .end local v2    # "_result":Z
    //         :cond_0
    //         const/4 v4, 0x0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v4, 0x0
    //         :try_start_1
    //         invoke-virtual {v0, v4}, Landroid/os/Parcel;->writeInt(I)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v3
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         throw v3
    //         :cond_2
    //         move v2, v3
    //         goto :goto_2
    */

    public fun unregisterCallback(callback: com.sec.android.iap.IAPServiceCallback): Boolean { return TODO("body: (Lcom/sec/android/iap/IAPServiceCallback;)Z") }
    /*
    //         .locals 6
    //         const/4 v2, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         .local v0, "_data":Landroid/os/Parcel;
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v1
    //         .local v1, "_reply":Landroid/os/Parcel;
    //         :try_start_0
    //         const-string v3, "com.sec.android.iap.IAPConnector"
    //         invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-interface {p1}, Lcom/sec/android/iap/IAPServiceCallback;->asBinder()Landroid/os/IBinder;
    //         move-result-object v3
    //         :goto_0
    //         invoke-virtual {v0, v3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    //         iget-object v3, p0, Lcom/sec/android/iap/IAPConnector$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         const/4 v4, 0x2
    //         const/4 v5, 0x0
    //         invoke-interface {v3, v4, v0, v1, v5}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         invoke-virtual {v1}, Landroid/os/Parcel;->readException()V
    //         invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         const/4 v2, 0x1
    //         .local v2, "_result":Z
    //         :cond_0
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         return v2
    //         .end local v2    # "_result":Z
    //         :cond_1
    //         const/4 v3, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v3
    //         invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         throw v3
    */

}
