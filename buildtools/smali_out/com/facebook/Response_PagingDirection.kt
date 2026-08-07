package com.facebook

// Auto-emitted from smali source: Response.java.
// 3 fields, 4 methods.

enum class Response_PagingDirection {
    NEXT,
    PREVIOUS,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.Response.PagingDirection { return TODO("body: (Ljava/lang/String;)Lcom/facebook/Response$PagingDirection;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/Response$PagingDirection;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Response$PagingDirection;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.Response.PagingDirection> { return TODO("body: ()[Lcom/facebook/Response$PagingDirection;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/Response$PagingDirection;->$VALUES:[Lcom/facebook/Response$PagingDirection;
    //         invoke-virtual {v0}, [Lcom/facebook/Response$PagingDirection;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/Response$PagingDirection;
    //         return-object v0
    */

    }
}
