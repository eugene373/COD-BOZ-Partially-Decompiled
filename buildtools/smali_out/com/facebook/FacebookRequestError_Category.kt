package com.facebook

// Auto-emitted from smali source: FacebookRequestError.java.
// 9 fields, 4 methods.

enum class FacebookRequestError_Category {
    AUTHENTICATION_REOPEN_SESSION,
    AUTHENTICATION_RETRY,
    BAD_REQUEST,
    CLIENT,
    OTHER,
    PERMISSION,
    SERVER,
    THROTTLING,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.FacebookRequestError.Category { return TODO("body: (Ljava/lang/String;)Lcom/facebook/FacebookRequestError$Category;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/FacebookRequestError$Category;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/FacebookRequestError$Category;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.FacebookRequestError.Category> { return TODO("body: ()[Lcom/facebook/FacebookRequestError$Category;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/FacebookRequestError$Category;->$VALUES:[Lcom/facebook/FacebookRequestError$Category;
    //         invoke-virtual {v0}, [Lcom/facebook/FacebookRequestError$Category;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/FacebookRequestError$Category;
    //         return-object v0
    */

    }
}
