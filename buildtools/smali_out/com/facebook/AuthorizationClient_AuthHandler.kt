package com.facebook

// Auto-emitted from smali source: AuthorizationClient.java.
// 3 fields, 8 methods.

open class AuthorizationClient_AuthHandler: java.io.Serializable {
    var methodLoggingExtras: java.util.Map
    val this$0: com.facebook.AuthorizationClient

    constructor(p0: com.facebook.AuthorizationClient)

    protected fun addLoggingExtra(p0: String, p1: Object) { /* TODO(body): (Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/AuthorizationClient$AuthHandler;->methodLoggingExtras:Ljava/util/Map;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         iput-object v0, p0, Lcom/facebook/AuthorizationClient$AuthHandler;->methodLoggingExtras:Ljava/util/Map;
    //         :cond_0
    //         iget-object v1, p0, Lcom/facebook/AuthorizationClient$AuthHandler;->methodLoggingExtras:Ljava/util/Map;
    //         if-nez p2, :cond_1
    //         const/4 v0, 0x0
    //         :goto_0
    //         invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    //         :cond_1
    //         invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    fun getNameForLogging(): String

    fun needsInternetPermission(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun needsRestart(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent): Boolean { return TODO("body: (IILandroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun tryAuthorize(p0: com.facebook.AuthorizationClient.AuthorizationRequest): Boolean

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
