package com.facebook.android

// Auto-emitted from smali source: AsyncFacebookRunner.java.
// 4 fields, 2 methods.

open class AsyncFacebookRunner_Anon1: Thread() {
    val this$0: com.facebook.android.AsyncFacebookRunner
    val val$context: android.content.Context
    val val$listener: com.facebook.android.AsyncFacebookRunner.RequestListener
    val val$state: Object

    constructor(p0: com.facebook.android.AsyncFacebookRunner, p1: android.content.Context, p2: com.facebook.android.AsyncFacebookRunner.RequestListener, p3: Object)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->this$0:Lcom/facebook/android/AsyncFacebookRunner;
    //         iget-object v0, v0, Lcom/facebook/android/AsyncFacebookRunner;->fb:Lcom/facebook/android/Facebook;
    //         iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$context:Landroid/content/Context;
    //         invoke-virtual {v0, v1}, Lcom/facebook/android/Facebook;->logoutImpl(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const-string v1, "false"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
    //         new-instance v1, Lcom/facebook/android/FacebookError;
    //         const-string v2, "auth.expireSession failed"
    //         invoke-direct {v1, v2}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V
    //         iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;
    //         invoke-interface {v0, v1, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onFacebookError(Lcom/facebook/android/FacebookError;Ljava/lang/Object;)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
    //         iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;
    //         invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onComplete(Ljava/lang/String;Ljava/lang/Object;)V
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
    //         iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;
    //         invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onFileNotFoundException(Ljava/io/FileNotFoundException;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
    //         iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;
    //         invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onMalformedURLException(Ljava/net/MalformedURLException;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
    //         iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$1;->val$state:Ljava/lang/Object;
    //         invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onIOException(Ljava/io/IOException;Ljava/lang/Object;)V
    //         goto :goto_0
    */

}
