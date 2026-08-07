package com.facebook

// Auto-emitted from smali source: AccessTokenSource.java.
// 9 fields, 5 methods.

enum class AccessTokenSource {
    CLIENT_TOKEN,
    FACEBOOK_APPLICATION_NATIVE,
    FACEBOOK_APPLICATION_SERVICE,
    FACEBOOK_APPLICATION_WEB,
    NONE,
    TEST_USER,
    WEB_VIEW,
    ;
    // real Java ctor (after implicit name,ordinal): (p0: Boolean)
    // instance fields (declare as constructor params or properties):
    //   private val canExtendToken: Boolean

    fun canExtendToken(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/AccessTokenSource;->canExtendToken:Z
    //         return v0
    */

    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.AccessTokenSource { return TODO("body: (Ljava/lang/String;)Lcom/facebook/AccessTokenSource;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/AccessTokenSource;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AccessTokenSource;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.AccessTokenSource> { return TODO("body: ()[Lcom/facebook/AccessTokenSource;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/AccessTokenSource;->$VALUES:[Lcom/facebook/AccessTokenSource;
    //         invoke-virtual {v0}, [Lcom/facebook/AccessTokenSource;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/AccessTokenSource;
    //         return-object v0
    */

    }
}
