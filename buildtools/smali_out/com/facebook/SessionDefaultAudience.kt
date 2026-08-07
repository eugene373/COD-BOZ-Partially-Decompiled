package com.facebook

// Auto-emitted from smali source: SessionDefaultAudience.java.
// 6 fields, 5 methods.

enum class SessionDefaultAudience {
    EVERYONE,
    FRIENDS,
    NONE,
    ONLY_ME,
    ;
    // real Java ctor (after implicit name,ordinal): (p0: String)
    // instance fields (declare as constructor params or properties):
    //   private val nativeProtocolAudience: String

    public fun getNativeProtocolAudience(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/SessionDefaultAudience;->nativeProtocolAudience:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.SessionDefaultAudience { return TODO("body: (Ljava/lang/String;)Lcom/facebook/SessionDefaultAudience;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/SessionDefaultAudience;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/SessionDefaultAudience;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.SessionDefaultAudience> { return TODO("body: ()[Lcom/facebook/SessionDefaultAudience;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/SessionDefaultAudience;->$VALUES:[Lcom/facebook/SessionDefaultAudience;
    //         invoke-virtual {v0}, [Lcom/facebook/SessionDefaultAudience;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/SessionDefaultAudience;
    //         return-object v0
    */

    }
}
