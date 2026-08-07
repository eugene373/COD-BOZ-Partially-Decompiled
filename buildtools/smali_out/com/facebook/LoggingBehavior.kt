package com.facebook

// Auto-emitted from smali source: LoggingBehavior.java.
// 8 fields, 4 methods.

enum class LoggingBehavior {
    APP_EVENTS,
    CACHE,
    DEVELOPER_ERRORS,
    INCLUDE_ACCESS_TOKENS,
    INCLUDE_RAW_RESPONSES,
    REQUESTS,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.LoggingBehavior { return TODO("body: (Ljava/lang/String;)Lcom/facebook/LoggingBehavior;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/LoggingBehavior;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/LoggingBehavior;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.LoggingBehavior> { return TODO("body: ()[Lcom/facebook/LoggingBehavior;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->$VALUES:[Lcom/facebook/LoggingBehavior;
    //         invoke-virtual {v0}, [Lcom/facebook/LoggingBehavior;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/LoggingBehavior;
    //         return-object v0
    */

    }
}
