package com.facebook.android

// Auto-emitted from smali source: Facebook.java.
// 2 fields, 2 methods.

open class Facebook_TokenRefreshConnectionHandler: android.os.Handler() {
    var connectionWeakReference: java.lang.ref.WeakReference
    var facebookWeakReference: java.lang.ref.WeakReference

    constructor(p0: com.facebook.android.Facebook, p1: com.facebook.android.Facebook.TokenRefreshServiceConnection)

    public fun handleMessage(p0: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 8
    //         iget-object v0, p0, Lcom/facebook/android/Facebook$TokenRefreshConnectionHandler;->facebookWeakReference:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/android/Facebook;
    //         iget-object v1, p0, Lcom/facebook/android/Facebook$TokenRefreshConnectionHandler;->connectionWeakReference:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;
    //         if-eqz v0, :cond_0
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "access_token"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
    //         move-result-object v3
    //         const-string v4, "expires_in"
    //         invoke-virtual {v3, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
    //         move-result-wide v4
    //         const-wide/16 v6, 0x3e8
    //         mul-long/2addr v4, v6
    //         if-eqz v2, :cond_4
    //         invoke-virtual {v0, v2}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
    //         invoke-virtual {v0, v4, v5}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V
    //         invoke-static {v0}, Lcom/facebook/android/Facebook;->access$200(Lcom/facebook/android/Facebook;)Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Lcom/facebook/LegacyHelper;->extendTokenCompleted(Lcom/facebook/Session;Landroid/os/Bundle;)V
    //         :cond_2
    //         iget-object v0, v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;
    //         if-eqz v0, :cond_3
    //         invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         const-string v2, "expires_in"
    //         invoke-virtual {v0, v2, v4, v5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         iget-object v2, v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;
    //         invoke-interface {v2, v0}, Lcom/facebook/android/Facebook$ServiceListener;->onComplete(Landroid/os/Bundle;)V
    //         :cond_3
    //         :goto_1
    //         iget-object v0, v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->applicationsContext:Landroid/content/Context;
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         goto :goto_0
    //         :cond_4
    //         iget-object v0, v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;
    //         if-eqz v0, :cond_3
    //         invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v2, "error"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "error_code"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_5
    //         invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "error_code"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v2
    //         iget-object v3, v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;
    //         new-instance v4, Lcom/facebook/android/FacebookError;
    //         const/4 v5, 0x0
    //         invoke-direct {v4, v0, v5, v2}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-interface {v3, v4}, Lcom/facebook/android/Facebook$ServiceListener;->onFacebookError(Lcom/facebook/android/FacebookError;)V
    //         goto :goto_1
    //         :cond_5
    //         iget-object v2, v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;->serviceListener:Lcom/facebook/android/Facebook$ServiceListener;
    //         new-instance v3, Ljava/lang/Error;
    //         if-eqz v0, :cond_6
    //         :goto_2
    //         invoke-direct {v3, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V
    //         invoke-interface {v2, v3}, Lcom/facebook/android/Facebook$ServiceListener;->onError(Ljava/lang/Error;)V
    //         goto :goto_1
    //         :cond_6
    //         const-string v0, "Unknown service error"
    //         goto :goto_2
    */

}
