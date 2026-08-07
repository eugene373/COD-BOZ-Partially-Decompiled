package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 5 fields, 5 methods.

enum class AuthorizationClient_Result_Code {
    CANCEL,
    ERROR,
    SUCCESS,
    ;
    // real Java ctor (after implicit name,ordinal): (p0: String)
    // instance fields (declare as constructor params or properties):
    //   private val loggingValue: String

    fun getLoggingValue(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$Result$Code;->loggingValue:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.AuthorizationClient.Result.Code { return TODO("body: (Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result$Code;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/AuthorizationClient$Result$Code;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AuthorizationClient$Result$Code;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.AuthorizationClient.Result.Code> { return TODO("body: ()[Lcom/facebook/AuthorizationClient$Result$Code;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/AuthorizationClient$Result$Code;->$VALUES:[Lcom/facebook/AuthorizationClient$Result$Code;
    //         invoke-virtual {v0}, [Lcom/facebook/AuthorizationClient$Result$Code;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/AuthorizationClient$Result$Code;
    //         return-object v0
    */

    }
}
