package bolts

// Auto-emitted from smali source: WebViewAppLinkResolver.java.
// 2 fields, 3 methods.

open class WebViewAppLinkResolver_Anon1: bolts.Continuation {
    val this$0: bolts.WebViewAppLinkResolver
    val val$url: android.net.Uri

    constructor(p0: bolts.WebViewAppLinkResolver, p1: android.net.Uri)

    public fun then(p0: bolts.Task): bolts.AppLink { return TODO("body: (Lbolts/Task;)Lbolts/AppLink;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Lorg/json/JSONArray;",
    //                 ">;)",
    //                 "Lbolts/AppLink;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Exception;
    //             }
    //         .end annotation
    //         .local p1, "task":Lbolts/Task;, "Lbolts/Task<Lorg/json/JSONArray;>;"
    //         invoke-virtual {p1}, Lbolts/Task;->getResult()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Lorg/json/JSONArray;
    //         invoke-static {v2}, Lbolts/WebViewAppLinkResolver;->access$000(Lorg/json/JSONArray;)Ljava/util/Map;
    //         move-result-object v0
    //         .local v0, "alData":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         iget-object v2, p0, Lbolts/WebViewAppLinkResolver$1;->val$url:Landroid/net/Uri;
    //         invoke-static {v0, v2}, Lbolts/WebViewAppLinkResolver;->access$100(Ljava/util/Map;Landroid/net/Uri;)Lbolts/AppLink;
    //         move-result-object v1
    //         .local v1, "appLink":Lbolts/AppLink;
    //         return-object v1
    */

    public fun then(x0: bolts.Task): Object { return TODO("body: (Lbolts/Task;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lbolts/WebViewAppLinkResolver$1;->then(Lbolts/Task;)Lbolts/AppLink;
    //         move-result-object v0
    //         return-object v0
    */

}
