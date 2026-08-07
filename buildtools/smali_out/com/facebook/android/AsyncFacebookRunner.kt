package com.facebook.android

// Auto-emitted from smali source: AsyncFacebookRunner.java.
// 1 fields, 10 methods.

open class AsyncFacebookRunner {
    var fb: com.facebook.android.Facebook

    public constructor(p0: com.facebook.android.Facebook)

    public fun logout(p0: android.content.Context, p1: com.facebook.android.AsyncFacebookRunner.RequestListener) { /* TODO(body): (Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V */ }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/android/AsyncFacebookRunner;->logout(Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    //         return-void
    */

    public fun logout(p0: android.content.Context, p1: com.facebook.android.AsyncFacebookRunner.RequestListener, p2: Object) { /* TODO(body): (Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         new-instance v0, Lcom/facebook/android/AsyncFacebookRunner$1;
    //         invoke-direct {v0, p0, p1, p2, p3}, Lcom/facebook/android/AsyncFacebookRunner$1;-><init>(Lcom/facebook/android/AsyncFacebookRunner;Landroid/content/Context;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    //         invoke-virtual {v0}, Lcom/facebook/android/AsyncFacebookRunner$1;->start()V
    //         return-void
    */

    public fun request(p0: android.os.Bundle, p1: com.facebook.android.AsyncFacebookRunner.RequestListener) { /* TODO(body): (Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V */ }
    /*
    //         .locals 6
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const/4 v1, 0x0
    //         const-string v3, "GET"
    //         move-object v0, p0
    //         move-object v2, p1
    //         move-object v4, p2
    //         move-object v5, v1
    //         invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    //         return-void
    */

    public fun request(p0: android.os.Bundle, p1: com.facebook.android.AsyncFacebookRunner.RequestListener, p2: Object) { /* TODO(body): (Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */ }
    /*
    //         .locals 6
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const/4 v1, 0x0
    //         const-string v3, "GET"
    //         move-object v0, p0
    //         move-object v2, p1
    //         move-object v4, p2
    //         move-object v5, p3
    //         invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    //         return-void
    */

    public fun request(p0: String, p1: android.os.Bundle, p2: com.facebook.android.AsyncFacebookRunner.RequestListener) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V */ }
    /*
    //         .locals 6
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v3, "GET"
    //         const/4 v5, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v4, p3
    //         invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    //         return-void
    */

    public fun request(p0: String, p1: android.os.Bundle, p2: com.facebook.android.AsyncFacebookRunner.RequestListener, p3: Object) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */ }
    /*
    //         .locals 6
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v3, "GET"
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v4, p3
    //         move-object v5, p4
    //         invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    //         return-void
    */

    public fun request(p0: String, p1: android.os.Bundle, p2: String, p3: com.facebook.android.AsyncFacebookRunner.RequestListener, p4: Object) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */ }
    /*
    //         .locals 7
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         new-instance v0, Lcom/facebook/android/AsyncFacebookRunner$2;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-object v4, p3
    //         move-object v5, p4
    //         move-object v6, p5
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/android/AsyncFacebookRunner$2;-><init>(Lcom/facebook/android/AsyncFacebookRunner;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    //         invoke-virtual {v0}, Lcom/facebook/android/AsyncFacebookRunner$2;->start()V
    //         return-void
    */

    public fun request(p0: String, p1: com.facebook.android.AsyncFacebookRunner.RequestListener) { /* TODO(body): (Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;)V */ }
    /*
    //         .locals 6
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         const-string v3, "GET"
    //         const/4 v5, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v4, p2
    //         invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    //         return-void
    */

    public fun request(p0: String, p1: com.facebook.android.AsyncFacebookRunner.RequestListener, p2: Object) { /* TODO(body): (Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V */ }
    /*
    //         .locals 6
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         const-string v3, "GET"
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v4, p2
    //         move-object v5, p3
    //         invoke-virtual/range {v0 .. v5}, Lcom/facebook/android/AsyncFacebookRunner;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/facebook/android/AsyncFacebookRunner$RequestListener;Ljava/lang/Object;)V
    //         return-void
    */

}
