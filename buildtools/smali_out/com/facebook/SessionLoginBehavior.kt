package com.facebook

// Auto-emitted from smali source: SessionLoginBehavior.java.
// 6 fields, 6 methods.

enum class SessionLoginBehavior {
    SSO_ONLY,
    SSO_WITH_FALLBACK,
    SUPPRESS_SSO,
    ;
    // real Java ctor (after implicit name,ordinal): (p0: Boolean, p1: Boolean)
    // instance fields (declare as constructor params or properties):
    //   private val allowsKatanaAuth: Boolean
    //   private val allowsWebViewAuth: Boolean

    fun allowsKatanaAuth(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/SessionLoginBehavior;->allowsKatanaAuth:Z
    //         return v0
    */

    fun allowsWebViewAuth(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/SessionLoginBehavior;->allowsWebViewAuth:Z
    //         return v0
    */

    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.SessionLoginBehavior { return TODO("body: (Ljava/lang/String;)Lcom/facebook/SessionLoginBehavior;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/SessionLoginBehavior;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/SessionLoginBehavior;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.SessionLoginBehavior> { return TODO("body: ()[Lcom/facebook/SessionLoginBehavior;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/SessionLoginBehavior;->$VALUES:[Lcom/facebook/SessionLoginBehavior;
    //         invoke-virtual {v0}, [Lcom/facebook/SessionLoginBehavior;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/SessionLoginBehavior;
    //         return-object v0
    */

    }
}
