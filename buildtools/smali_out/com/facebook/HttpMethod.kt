package com.facebook

// Auto-emitted from smali source: HttpMethod.java.
// 4 fields, 4 methods.

enum class HttpMethod {
    DELETE,
    GET,
    POST,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.HttpMethod { return TODO("body: (Ljava/lang/String;)Lcom/facebook/HttpMethod;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/HttpMethod;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/HttpMethod;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.HttpMethod> { return TODO("body: ()[Lcom/facebook/HttpMethod;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/HttpMethod;->$VALUES:[Lcom/facebook/HttpMethod;
    //         invoke-virtual {v0}, [Lcom/facebook/HttpMethod;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/HttpMethod;
    //         return-object v0
    */

    }
}
