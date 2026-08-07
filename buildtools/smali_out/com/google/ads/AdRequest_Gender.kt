package com.google.ads

// Auto-emitted from smali.
// 4 fields, 4 methods.

enum class AdRequest_Gender {
    FEMALE,
    MALE,
    UNKNOWN,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(name: String): com.google.ads.AdRequest.Gender { return TODO("body: (Ljava/lang/String;)Lcom/google/ads/AdRequest$Gender;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/google/ads/AdRequest$Gender;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/ads/AdRequest$Gender;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.google.ads.AdRequest.Gender> { return TODO("body: ()[Lcom/google/ads/AdRequest$Gender;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/ads/AdRequest$Gender;->b:[Lcom/google/ads/AdRequest$Gender;
    //         invoke-virtual {v0}, [Lcom/google/ads/AdRequest$Gender;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/google/ads/AdRequest$Gender;
    //         return-object v0
    */

    }
}
