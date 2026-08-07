package com.facebook

// Auto-emitted from smali source: AppEventsLogger.java.
// 3 fields, 4 methods.

enum class AppEventsLogger_FlushBehavior {
    AUTO,
    EXPLICIT_ONLY,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.AppEventsLogger.FlushBehavior { return TODO("body: (Ljava/lang/String;)Lcom/facebook/AppEventsLogger$FlushBehavior;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/AppEventsLogger$FlushBehavior;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AppEventsLogger$FlushBehavior;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.AppEventsLogger.FlushBehavior> { return TODO("body: ()[Lcom/facebook/AppEventsLogger$FlushBehavior;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/AppEventsLogger$FlushBehavior;->$VALUES:[Lcom/facebook/AppEventsLogger$FlushBehavior;
    //         invoke-virtual {v0}, [Lcom/facebook/AppEventsLogger$FlushBehavior;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/AppEventsLogger$FlushBehavior;
    //         return-object v0
    */

    }
}
