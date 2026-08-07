package com.android.vending.expansion.downloader

// Auto-emitted from smali source: DownloaderClientMarshaller.java.
// 1 fields, 3 methods.

open class DownloaderClientMarshaller_Stub_Anon2: android.content.ServiceConnection {
    val this$0: com.android.vending.expansion.downloader.DownloaderClientMarshaller.Stub

    constructor(p0: com.android.vending.expansion.downloader.DownloaderClientMarshaller.Stub)

    public fun onServiceConnected(p0: android.content.ComponentName, p1: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$2;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;
    //         new-instance v1, Landroid/os/Messenger;
    //         invoke-direct {v1, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V
    //         invoke-static {v0, v1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$202(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;Landroid/os/Messenger;)Landroid/os/Messenger;
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$2;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;
    //         invoke-static {v0}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$100(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;)Lcom/android/vending/expansion/downloader/IDownloaderClient;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$2;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;
    //         invoke-static {v1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$200(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;)Landroid/os/Messenger;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/android/vending/expansion/downloader/IDownloaderClient;->onServiceConnected(Landroid/os/Messenger;)V
    //         return-void
    */

    public fun onServiceDisconnected(p0: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub$2;->this$0:Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;->access$202(Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;Landroid/os/Messenger;)Landroid/os/Messenger;
    //         return-void
    */

}
