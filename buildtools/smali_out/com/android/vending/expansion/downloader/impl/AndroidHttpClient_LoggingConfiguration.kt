package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: AndroidHttpClient.java.
// 2 fields, 6 methods.

open class AndroidHttpClient_LoggingConfiguration {
    private val level: Int
    private val tag: String

    private constructor(p0: String, p1: Int)

    constructor(p0: String, p1: Int, p2: com.android.vending.expansion.downloader.impl.AndroidHttpClient.1)

    private fun isLoggable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->tag:Ljava/lang/String;
    //         iget v1, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->level:I
    //         invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
    //         move-result v0
    //         return v0
    */

    private fun println(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->level:I
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/impl/AndroidHttpClient$LoggingConfiguration;->tag:Ljava/lang/String;
    //         invoke-static {v0, v1, p1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

}
