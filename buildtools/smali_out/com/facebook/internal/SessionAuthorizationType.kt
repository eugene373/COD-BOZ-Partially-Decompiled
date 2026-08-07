package com.facebook.internal

// Auto-emitted from smali source: SessionAuthorizationType.java.
// 3 fields, 4 methods.

enum class SessionAuthorizationType {
    PUBLISH,
    READ,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.internal.SessionAuthorizationType { return TODO("body: (Ljava/lang/String;)Lcom/facebook/internal/SessionAuthorizationType;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/SessionAuthorizationType;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.internal.SessionAuthorizationType> { return TODO("body: ()[Lcom/facebook/internal/SessionAuthorizationType;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/internal/SessionAuthorizationType;->$VALUES:[Lcom/facebook/internal/SessionAuthorizationType;
    //         invoke-virtual {v0}, [Lcom/facebook/internal/SessionAuthorizationType;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/internal/SessionAuthorizationType;
    //         return-object v0
    */

    }
}
