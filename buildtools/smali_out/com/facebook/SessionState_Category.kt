package com.facebook

// Auto-emitted from smali source: SessionState.java.
// 4 fields, 4 methods.

enum class SessionState_Category {
    CLOSED_CATEGORY,
    CREATED_CATEGORY,
    OPENED_CATEGORY,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.SessionState.Category { return TODO("body: (Ljava/lang/String;)Lcom/facebook/SessionState$Category;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/SessionState$Category;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/SessionState$Category;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.SessionState.Category> { return TODO("body: ()[Lcom/facebook/SessionState$Category;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/SessionState$Category;->$VALUES:[Lcom/facebook/SessionState$Category;
    //         invoke-virtual {v0}, [Lcom/facebook/SessionState$Category;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/SessionState$Category;
    //         return-object v0
    */

    }
}
