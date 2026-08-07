package android.support.v4.app

// Auto-emitted from smali source: INotificationSideChannel.java.
// 1 fields, 6 methods.

open class INotificationSideChannel_Stub_Proxy: android.support.v4.app.INotificationSideChannel {
    private var mRemote: android.os.IBinder

    constructor(remote: android.os.IBinder)

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun cancel(packageName: String, id: Int, tag: String) { /* TODO(body): (Ljava/lang/String;ILjava/lang/String;)V */ }
    /*
    //         .locals 5
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         .local v0, "_data":Landroid/os/Parcel;
    //         :try_start_0
    //         const-string v1, "android.support.v4.app.INotificationSideChannel"
    //         invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v1, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         const/4 v2, 0x2
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v1, v2, v0, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v1
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         throw v1
    */

    public fun cancelAll(packageName: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         .local v0, "_data":Landroid/os/Parcel;
    //         :try_start_0
    //         const-string v1, "android.support.v4.app.INotificationSideChannel"
    //         invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v1, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;
    //         const/4 v2, 0x3
    //         const/4 v3, 0x0
    //         const/4 v4, 0x1
    //         invoke-interface {v1, v2, v0, v3, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         return-void
    //         :catchall_0
    //         move-exception v1
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         throw v1
    */

    public fun getInterfaceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "android.support.v4.app.INotificationSideChannel"
    //         return-object v0
    */

    public fun notify(packageName: String, id: Int, tag: String, notification: android.app.Notification) { /* TODO(body): (Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V */ }
    /*
    //         .locals 5
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         .local v0, "_data":Landroid/os/Parcel;
    //         :try_start_0
    //         const-string v1, "android.support.v4.app.INotificationSideChannel"
    //         invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V
    //         invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeInt(I)V
    //         invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         if-eqz p4, :cond_0
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v1, 0x0
    //         invoke-virtual {p4, v0, v1}, Landroid/app/Notification;->writeToParcel(Landroid/os/Parcel;I)V
    //         :goto_0
    //         iget-object v1, p0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;->mRemote:Landroid/os/IBinder;
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
