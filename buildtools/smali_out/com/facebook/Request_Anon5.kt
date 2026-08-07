package com.facebook

// Auto-emitted from smali source: Request.java.
// 2 fields, 2 methods.

open class Request_Anon5: com.facebook.Request.KeyValueSerializer {
    val this$0: com.facebook.Request
    val val$keysAndValues: java.util.ArrayList

    constructor(p0: com.facebook.Request, p1: java.util.ArrayList)

    public fun writeString(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/Request$5;->val$keysAndValues:Ljava/util/ArrayList;
    //         const-string v1, "%s=%s"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         aput-object p1, v2, v3
    //         const/4 v3, 0x1
    //         const-string v4, "UTF-8"
    //         invoke-static {p2, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-void
    */

}
