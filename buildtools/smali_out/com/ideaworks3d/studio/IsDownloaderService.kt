package com.ideaworks3d.studio

// Auto-emitted from smali source: IsDownloaderService.java.
// 2 fields, 5 methods.

open class IsDownloaderService: com.android.vending.expansion.downloader.impl.DownloaderService() {
    public constructor()

    public fun getAlarmReceiverClassName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/ideaworks3d/studio/IsAlarmReciever;
    //         invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPublicKey(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "REPLACE THIS WITH YOUR PUBLIC KEY"
    //         return-object v0
    */

    public fun getSALT(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/ideaworks3d/studio/IsDownloaderService;->SALT:[B
    //         return-object v0
    */

    companion object {
    private val BASE64_PUBLIC_KEY: String = "REPLACE THIS WITH YOUR PUBLIC KEY"
    private val SALT: ByteArray = null!!
    }
}
