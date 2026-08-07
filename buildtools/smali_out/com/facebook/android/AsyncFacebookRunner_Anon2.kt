package com.facebook.android

// Auto-emitted from smali source: AsyncFacebookRunner.java.
// 6 fields, 2 methods.

open class AsyncFacebookRunner_Anon2: Thread() {
    val this$0: com.facebook.android.AsyncFacebookRunner
    val val$graphPath: String
    val val$httpMethod: String
    val val$listener: com.facebook.android.AsyncFacebookRunner.RequestListener
    val val$parameters: android.os.Bundle
    val val$state: Object

    constructor(p0: com.facebook.android.AsyncFacebookRunner, p1: String, p2: android.os.Bundle, p3: String, p4: com.facebook.android.AsyncFacebookRunner.RequestListener, p5: Object)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->this$0:Lcom/facebook/android/AsyncFacebookRunner;
    //         iget-object v0, v0, Lcom/facebook/android/AsyncFacebookRunner;->fb:Lcom/facebook/android/Facebook;
    //         iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$graphPath:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$parameters:Landroid/os/Bundle;
    //         iget-object v3, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$httpMethod:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/android/Facebook;->requestImpl(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
    //         iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$state:Ljava/lang/Object;
    //         invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onComplete(Ljava/lang/String;Ljava/lang/Object;)V
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
    //         iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$state:Ljava/lang/Object;
    //         invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onFileNotFoundException(Ljava/io/FileNotFoundException;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
    //         iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$state:Ljava/lang/Object;
    //         invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onMalformedURLException(Ljava/net/MalformedURLException;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         iget-object v1, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$listener:Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
    //         iget-object v2, p0, Lcom/facebook/android/AsyncFacebookRunner$2;->val$state:Ljava/lang/Object;
    //         invoke-interface {v1, v0, v2}, Lcom/facebook/android/AsyncFacebookRunner$RequestListener;->onIOException(Ljava/io/IOException;Ljava/lang/Object;)V
    //         goto :goto_0
    */

}
