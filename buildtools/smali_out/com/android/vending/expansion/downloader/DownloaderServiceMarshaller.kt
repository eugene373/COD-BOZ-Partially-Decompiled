package com.android.vending.expansion.downloader

// Auto-emitted from smali source: DownloaderServiceMarshaller.java.
// 8 fields, 3 methods.

open class DownloaderServiceMarshaller {
    public constructor()

    companion object {
    @JvmField public val MSG_REQUEST_ABORT_DOWNLOAD: Int = 0x1
    @JvmField public val MSG_REQUEST_CLIENT_UPDATE: Int = 0x6
    @JvmField public val MSG_REQUEST_CONTINUE_DOWNLOAD: Int = 0x4
    @JvmField public val MSG_REQUEST_DOWNLOAD_STATE: Int = 0x5
    @JvmField public val MSG_REQUEST_PAUSE_DOWNLOAD: Int = 0x2
    @JvmField public val MSG_SET_DOWNLOAD_FLAGS: Int = 0x3
    @JvmField public val PARAMS_FLAGS: String = "flags"
    @JvmField public val PARAM_MESSENGER: String = "EMH"

    public @JvmStatic fun CreateProxy(p0: android.os.Messenger): com.android.vending.expansion.downloader.IDownloaderService { return TODO("body: (Landroid/os/Messenger;)Lcom/android/vending/expansion/downloader/IDownloaderService;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Proxy;
    //         invoke-direct {v0, p0}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Proxy;-><init>(Landroid/os/Messenger;)V
    //         return-object v0
    */

    public @JvmStatic fun CreateStub(p0: com.android.vending.expansion.downloader.IDownloaderService): com.android.vending.expansion.downloader.IStub { return TODO("body: (Lcom/android/vending/expansion/downloader/IDownloaderService;)Lcom/android/vending/expansion/downloader/IStub;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;
    //         invoke-direct {v0, p0}, Lcom/android/vending/expansion/downloader/DownloaderServiceMarshaller$Stub;-><init>(Lcom/android/vending/expansion/downloader/IDownloaderService;)V
    //         return-object v0
    */

    }
}
