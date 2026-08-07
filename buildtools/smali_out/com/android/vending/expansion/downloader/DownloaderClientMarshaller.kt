package com.android.vending.expansion.downloader

// Auto-emitted from smali source: DownloaderClientMarshaller.java.
// 9 fields, 5 methods.

open class DownloaderClientMarshaller {
    public constructor()

    companion object {
    @JvmField public val DOWNLOAD_REQUIRED: Int = 0x2
    @JvmField public val LVL_CHECK_REQUIRED: Int = 0x1
    @JvmField public val MSG_ONDOWNLOADPROGRESS: Int = 0xb
    @JvmField public val MSG_ONDOWNLOADSTATE_CHANGED: Int = 0xa
    @JvmField public val MSG_ONSERVICECONNECTED: Int = 0xc
    @JvmField public val NO_DOWNLOAD_REQUIRED: Int = 0x0
    @JvmField public val PARAM_MESSENGER: String = "EMH"
    @JvmField public val PARAM_NEW_STATE: String = "newState"
    @JvmField public val PARAM_PROGRESS: String = "progress"

    public @JvmStatic fun CreateProxy(p0: android.os.Messenger): com.android.vending.expansion.downloader.IDownloaderClient { return TODO("body: (Landroid/os/Messenger;)Lcom/android/vending/expansion/downloader/IDownloaderClient;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Proxy;
    //         invoke-direct {v0, p0}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Proxy;-><init>(Landroid/os/Messenger;)V
    //         return-object v0
    */

    public @JvmStatic fun CreateStub(p0: com.android.vending.expansion.downloader.IDownloaderClient, p1: Class): com.android.vending.expansion.downloader.IStub { return TODO("body: (Lcom/android/vending/expansion/downloader/IDownloaderClient;Ljava/lang/Class;)Lcom/android/vending/expansion/downloader/IStub;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/android/vending/expansion/downloader/IDownloaderClient;",
    //                 "Ljava/lang/Class",
    //                 "<*>;)",
    //                 "Lcom/android/vending/expansion/downloader/IStub;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;
    //         invoke-direct {v0, p0, p1}, Lcom/android/vending/expansion/downloader/DownloaderClientMarshaller$Stub;-><init>(Lcom/android/vending/expansion/downloader/IDownloaderClient;Ljava/lang/Class;)V
    //         return-object v0
    */

    public @JvmStatic fun startDownloadServiceIfRequired(p0: android.content.Context, p1: android.app.PendingIntent, p2: Class): Int { return TODO("body: (Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/Class;)I") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Landroid/app/PendingIntent;",
    //                 "Ljava/lang/Class",
    //                 "<*>;)I"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/content/pm/PackageManager$NameNotFoundException;
    //             }
    //         .end annotation
    //         invoke-static {p0, p1, p2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->startDownloadServiceIfRequired(Landroid/content/Context;Landroid/app/PendingIntent;Ljava/lang/Class;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun startDownloadServiceIfRequired(p0: android.content.Context, p1: android.content.Intent, p2: Class): Int { return TODO("body: (Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Class;)I") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Landroid/content/Intent;",
    //                 "Ljava/lang/Class",
    //                 "<*>;)I"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/content/pm/PackageManager$NameNotFoundException;
    //             }
    //         .end annotation
    //         invoke-static {p0, p1, p2}, Lcom/android/vending/expansion/downloader/impl/DownloaderService;->startDownloadServiceIfRequired(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Class;)I
    //         move-result v0
    //         return v0
    */

    }
}
