package com.facebook

// Auto-emitted from smali source: AppEventsLogger.java.
// 7 fields, 4 methods.

enum class AppEventsLogger_FlushReason {
    EAGER_FLUSHING_EVENT,
    EVENT_THRESHOLD,
    EXPLICIT,
    PERSISTED_EVENTS,
    SESSION_CHANGE,
    TIMER,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.AppEventsLogger.FlushReason { return TODO("body: (Ljava/lang/String;)Lcom/facebook/AppEventsLogger$FlushReason;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/AppEventsLogger$FlushReason;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AppEventsLogger$FlushReason;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.AppEventsLogger.FlushReason> { return TODO("body: ()[Lcom/facebook/AppEventsLogger$FlushReason;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->$VALUES:[Lcom/facebook/AppEventsLogger$FlushReason;
    //         invoke-virtual {v0}, [Lcom/facebook/AppEventsLogger$FlushReason;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/AppEventsLogger$FlushReason;
    //         return-object v0
    */

    }
}
