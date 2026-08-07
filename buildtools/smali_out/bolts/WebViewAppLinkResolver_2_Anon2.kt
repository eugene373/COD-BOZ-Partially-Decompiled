package bolts

// Auto-emitted from smali source: WebViewAppLinkResolver.java.
// 2 fields, 2 methods.

open class WebViewAppLinkResolver_2_Anon2 {
    val this$1: bolts.WebViewAppLinkResolver.2
    val val$tcs: bolts.Task.TaskCompletionSource

    constructor(p0: bolts.WebViewAppLinkResolver.2, p1: bolts.Task.TaskCompletionSource)

    public fun setValue(value: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v1, p0, Lbolts/WebViewAppLinkResolver$2$2;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         new-instance v2, Lorg/json/JSONArray;
    //         invoke-direct {v2, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v1, v2}, Lbolts/Task$TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Lorg/json/JSONException;
    //         iget-object v1, p0, Lbolts/WebViewAppLinkResolver$2$2;->val$tcs:Lbolts/Task$TaskCompletionSource;
    //         invoke-virtual {v1, v0}, Lbolts/Task$TaskCompletionSource;->trySetError(Ljava/lang/Exception;)Z
    //         goto :goto_0
    */

}
