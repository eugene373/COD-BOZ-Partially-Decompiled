package com.android.vending.expansion.downloader

// Auto-emitted from smali source: DownloaderClientMarshaller.java.
// 7 fields, 8 methods.

open class DownloaderClientMarshaller_Stub: com.android.vending.expansion.downloader.IStub {
    private var mBound: Boolean
    private var mConnection: android.content.ServiceConnection
    private var mContext: android.content.Context
    private var mDownloaderServiceClass: Class
    private var mItf: com.android.vending.expansion.downloader.IDownloaderClient
    val mMessenger: android.os.Messenger
    private var mServiceMessenger: android.os.Messenger

    public constructor(p0: com.android.vending.expansion.downloader.IDownloaderClient, p1: Class)

    public fun connect(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 3
    //         iput-object p1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->mContext:Landroid/content/Context;
    //         new-instance v0, Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->mDownloaderServiceClass:Ljava/lang/Class;
    //         invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         const-string v1, "EMH"
    //         iget-object v2, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->mMessenger:Landroid/os/Messenger;
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->mConnection:Landroid/content/ServiceConnection;
    //         const/4 v2, 0x2
    //         invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->mBound:Z
    //         goto :goto_0
    */

    public fun disconnect(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->mBound:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->mConnection:Landroid/content/ServiceConnection;
    //         invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->mBound:Z
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->mContext:Landroid/content/Context;
    //         return-void
    */

    public fun getMessenger(): android.os.Messenger { return TODO("body: ()Landroid/os/Messenger;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->mMessenger:Landroid/os/Messenger;
    //         return-object v0
    */

}
