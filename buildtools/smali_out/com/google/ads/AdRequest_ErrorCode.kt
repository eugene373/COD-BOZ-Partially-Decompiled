package com.google.ads

// Auto-emitted from smali.
// 6 fields, 5 methods.

enum class AdRequest_ErrorCode {
    INTERNAL_ERROR,
    INVALID_REQUEST,
    NETWORK_ERROR,
    NO_FILL,
    ;
    // real Java ctor (after implicit name,ordinal): (description: String)
    // instance fields (declare as constructor params or properties):
    //   private val description: String

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/ads/AdRequest$ErrorCode;->description:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    public @JvmStatic fun valueOf(name: String): com.google.ads.AdRequest.ErrorCode { return TODO("body: (Ljava/lang/String;)Lcom/google/ads/AdRequest$ErrorCode;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/google/ads/AdRequest$ErrorCode;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/ads/AdRequest$ErrorCode;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.google.ads.AdRequest.ErrorCode> { return TODO("body: ()[Lcom/google/ads/AdRequest$ErrorCode;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/ads/AdRequest$ErrorCode;->a:[Lcom/google/ads/AdRequest$ErrorCode;
    //         invoke-virtual {v0}, [Lcom/google/ads/AdRequest$ErrorCode;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/google/ads/AdRequest$ErrorCode;
    //         return-object v0
    */

    }
}
