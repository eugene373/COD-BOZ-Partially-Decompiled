package com.facebook

// Auto-emitted from smali source: AppEventsLogger.java.
// 5 fields, 4 methods.

enum class AppEventsLogger_FlushResult {
    NO_CONNECTIVITY,
    SERVER_ERROR,
    SUCCESS,
    UNKNOWN_ERROR,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.AppEventsLogger.FlushResult { return TODO("body: (Ljava/lang/String;)Lcom/facebook/AppEventsLogger$FlushResult;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/AppEventsLogger$FlushResult;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AppEventsLogger$FlushResult;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.AppEventsLogger.FlushResult> { return TODO("body: ()[Lcom/facebook/AppEventsLogger$FlushResult;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/AppEventsLogger$FlushResult;->$VALUES:[Lcom/facebook/AppEventsLogger$FlushResult;
    //         invoke-virtual {v0}, [Lcom/facebook/AppEventsLogger$FlushResult;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/AppEventsLogger$FlushResult;
    //         return-object v0
    */

    }
}
