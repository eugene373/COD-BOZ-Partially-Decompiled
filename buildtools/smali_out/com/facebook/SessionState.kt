package com.facebook

// Auto-emitted from smali source: SessionState.java.
// 9 fields, 6 methods.

enum class SessionState {
    CLOSED,
    CLOSED_LOGIN_FAILED,
    CREATED,
    CREATED_TOKEN_LOADED,
    OPENED,
    OPENED_TOKEN_UPDATED,
    OPENING,
    ;
    // real Java ctor (after implicit name,ordinal): (p0: com.facebook.SessionState.Category)
    // instance fields (declare as constructor params or properties):
    //   private val category: com.facebook.SessionState.Category

    public fun isClosed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/SessionState;->category:Lcom/facebook/SessionState$Category;
    //         sget-object v1, Lcom/facebook/SessionState$Category;->CLOSED_CATEGORY:Lcom/facebook/SessionState$Category;
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isOpened(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/SessionState;->category:Lcom/facebook/SessionState$Category;
    //         sget-object v1, Lcom/facebook/SessionState$Category;->OPENED_CATEGORY:Lcom/facebook/SessionState$Category;
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.SessionState { return TODO("body: (Ljava/lang/String;)Lcom/facebook/SessionState;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/SessionState;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/SessionState;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.SessionState> { return TODO("body: ()[Lcom/facebook/SessionState;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/SessionState;->$VALUES:[Lcom/facebook/SessionState;
    //         invoke-virtual {v0}, [Lcom/facebook/SessionState;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/SessionState;
    //         return-object v0
    */

    }
}
