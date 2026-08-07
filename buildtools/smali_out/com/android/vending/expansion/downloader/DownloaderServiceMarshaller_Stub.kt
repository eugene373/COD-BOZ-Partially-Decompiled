package com.android.vending.expansion.downloader

// Auto-emitted from smali source: DownloaderServiceMarshaller.java.
// 2 fields, 5 methods.

open class DownloaderServiceMarshaller_Stub: com.android.vending.expansion.downloader.IStub {
    private var mItf: com.android.vending.expansion.downloader.IDownloaderService
    val mMessenger: android.os.Messenger

    public constructor(p0: com.android.vending.expansion.downloader.IDownloaderService)

    public fun connect(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun disconnect(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun getMessenger(): android.os.Messenger { return TODO("body: ()Landroid/os/Messenger;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;->mMessenger:Landroid/os/Messenger;
    //         return-object v0
    */

}
