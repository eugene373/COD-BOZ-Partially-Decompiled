package com.android.vending.expansion.downloader

// Auto-emitted from smali source: DownloaderClientMarshaller.java.
// 1 fields, 5 methods.

open class DownloaderClientMarshaller_Proxy: com.android.vending.expansion.downloader.IDownloaderClient {
    private var mServiceMessenger: android.os.Messenger

    public constructor(p0: android.os.Messenger)

    private fun send(p0: Int, p1: android.os.Bundle) { /* TODO(body): (ILandroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-static {v0, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
    //         :try_start_0
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Proxy;->mServiceMessenger:Landroid/os/Messenger;
    //         invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
    //         goto :goto_0
    */

    public fun onDownloadProgress(p0: com.android.vending.expansion.downloader.DownloadProgressInfo) { /* TODO(body): (Lcom/android/vending/expansion/downloader/DownloadProgressInfo;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/os/Bundle;
    //         const/4 v1, 0x1
    //         invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V
    //         const-string v1, "progress"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         const/16 v1, 0xb
    //         invoke-direct {p0, v1, v0}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Proxy;->send(ILandroid/os/Bundle;)V
    //         return-void
    */

    public fun onDownloadStateChanged(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/os/Bundle;
    //         const/4 v1, 0x1
    //         invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V
    //         const-string v1, "newState"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const/16 v1, 0xa
    //         invoke-direct {p0, v1, v0}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Proxy;->send(ILandroid/os/Bundle;)V
    //         return-void
    */

    public fun onServiceConnected(p0: android.os.Messenger) { /* TODO(body): (Landroid/os/Messenger;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
