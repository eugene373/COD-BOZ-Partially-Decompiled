package android.support.v4.app

// Auto-emitted from smali source: INotificationSideChannel.java.
// 4 fields, 4 methods.

open class INotificationSideChannel_Stub: android.os.Binder(), android.support.v4.app.INotificationSideChannel {
    public constructor()

    public fun asBinder(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun onTransact(code: Int, data: android.os.Parcel, reply: android.os.Parcel, flags: Int): Boolean { return TODO("body: (ILandroid/os/Parcel;Landroid/os/Parcel;I)Z") }
    /*
    //         .locals 6
    //         const/4 v4, 0x1
    //         sparse-switch p1, :sswitch_data_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    //         move-result v4
    //         :goto_0
    //         return v4
    //         :sswitch_0
    //         const-string v5, "android.support.v4.app.INotificationSideChannel"
    //         invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v5, "android.support.v4.app.INotificationSideChannel"
    //         invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "_arg0":Ljava/lang/String;
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         .local v1, "_arg1":I
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         .local v2, "_arg2":Ljava/lang/String;
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v5
    //         if-eqz v5, :cond_0
    //         sget-object v5, Landroid/app/Notification;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-interface {v5, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Landroid/app/Notification;
    //         .local v3, "_arg3":Landroid/app/Notification;
    //         :goto_1
    //         invoke-virtual {p0, v0, v1, v2, v3}, Landroid/support/v4/app/INotificationSideChannel$Stub;->notify(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
    //         goto :goto_0
    //         .end local v3    # "_arg3":Landroid/app/Notification;
    //         :cond_0
    //         const/4 v3, 0x0
    //         .restart local v3    # "_arg3":Landroid/app/Notification;
    //         goto :goto_1
    //         .end local v0    # "_arg0":Ljava/lang/String;
    //         .end local v1    # "_arg1":I
    //         .end local v2    # "_arg2":Ljava/lang/String;
    //         .end local v3    # "_arg3":Landroid/app/Notification;
    //         :sswitch_2
    //         const-string v5, "android.support.v4.app.INotificationSideChannel"
    //         invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         .restart local v0    # "_arg0":Ljava/lang/String;
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I
    //         move-result v1
    //         .restart local v1    # "_arg1":I
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v2
    //         .restart local v2    # "_arg2":Ljava/lang/String;
    //         invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/app/INotificationSideChannel$Stub;->cancel(Ljava/lang/String;ILjava/lang/String;)V
    //         goto :goto_0
    //         .end local v0    # "_arg0":Ljava/lang/String;
    //         .end local v1    # "_arg1":I
    //         .end local v2    # "_arg2":Ljava/lang/String;
    //         :sswitch_3
    //         const-string v5, "android.support.v4.app.INotificationSideChannel"
    //         invoke-virtual {p2, v5}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V
    //         invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         .restart local v0    # "_arg0":Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/app/INotificationSideChannel$Stub;->cancelAll(Ljava/lang/String;)V
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x5f4e5446 -> :sswitch_0
    //         .end sparse-switch
    */

    companion object {
    private val DESCRIPTOR: String = "android.support.v4.app.INotificationSideChannel"
    val TRANSACTION_cancel: Int = 0x2
    val TRANSACTION_cancelAll: Int = 0x3
    val TRANSACTION_notify: Int = 0x1

    public @JvmStatic fun asInterface(obj: android.os.IBinder): android.support.v4.app.INotificationSideChannel { return TODO("body: (Landroid/os/IBinder;)Landroid/support/v4/app/INotificationSideChannel;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v1, "android.support.v4.app.INotificationSideChannel"
    //         invoke-interface {p0, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;
    //         move-result-object v0
    //         .local v0, "iin":Landroid/os/IInterface;
    //         if-eqz v0, :cond_1
    //         instance-of v1, v0, Landroid/support/v4/app/INotificationSideChannel;
    //         if-eqz v1, :cond_1
    //         check-cast v0, Landroid/support/v4/app/INotificationSideChannel;
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;
    //         .end local v0    # "iin":Landroid/os/IInterface;
    //         invoke-direct {v0, p0}, Landroid/support/v4/app/INotificationSideChannel$Stub$Proxy;-><init>(Landroid/os/IBinder;)V
    //         goto :goto_0
    */

    }
}
