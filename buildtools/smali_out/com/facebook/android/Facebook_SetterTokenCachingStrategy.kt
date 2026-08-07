package com.facebook.android

// Auto-emitted from smali source: Facebook.java.
// 1 fields, 5 methods.

open class Facebook_SetterTokenCachingStrategy: com.facebook.TokenCachingStrategy() {
    val this$0: com.facebook.android.Facebook

    private constructor(p0: com.facebook.android.Facebook)

    constructor(p0: com.facebook.android.Facebook, p1: com.facebook.android.Facebook.1)

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;->this$0:Lcom/facebook/android/Facebook;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/facebook/android/Facebook;->access$102(Lcom/facebook/android/Facebook;Ljava/lang/String;)Ljava/lang/String;
    //         return-void
    */

    public fun load(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         iget-object v1, p0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;->this$0:Lcom/facebook/android/Facebook;
    //         invoke-static {v1}, Lcom/facebook/android/Facebook;->access$100(Lcom/facebook/android/Facebook;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;->this$0:Lcom/facebook/android/Facebook;
    //         invoke-static {v1}, Lcom/facebook/android/Facebook;->access$100(Lcom/facebook/android/Facebook;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/TokenCachingStrategy;->putToken(Landroid/os/Bundle;Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;->this$0:Lcom/facebook/android/Facebook;
    //         invoke-static {v1}, Lcom/facebook/android/Facebook;->access$400(Lcom/facebook/android/Facebook;)J
    //         move-result-wide v2
    //         invoke-static {v0, v2, v3}, Lcom/facebook/TokenCachingStrategy;->putExpirationMilliseconds(Landroid/os/Bundle;J)V
    //         iget-object v1, p0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;->this$0:Lcom/facebook/android/Facebook;
    //         invoke-static {v1}, Lcom/facebook/android/Facebook;->access$500(Lcom/facebook/android/Facebook;)[Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/facebook/android/Facebook;->access$600([Ljava/lang/String;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/TokenCachingStrategy;->putPermissions(Landroid/os/Bundle;Ljava/util/List;)V
    //         sget-object v1, Lcom/facebook/AccessTokenSource;->WEB_VIEW:Lcom/facebook/AccessTokenSource;
    //         invoke-static {v0, v1}, Lcom/facebook/TokenCachingStrategy;->putSource(Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;)V
    //         iget-object v1, p0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;->this$0:Lcom/facebook/android/Facebook;
    //         invoke-static {v1}, Lcom/facebook/android/Facebook;->access$700(Lcom/facebook/android/Facebook;)J
    //         move-result-wide v2
    //         invoke-static {v0, v2, v3}, Lcom/facebook/TokenCachingStrategy;->putLastRefreshMilliseconds(Landroid/os/Bundle;J)V
    //         :cond_0
    //         return-object v0
    */

    public fun save(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;->this$0:Lcom/facebook/android/Facebook;
    //         invoke-static {p1}, Lcom/facebook/TokenCachingStrategy;->getToken(Landroid/os/Bundle;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/android/Facebook;->access$102(Lcom/facebook/android/Facebook;Ljava/lang/String;)Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;->this$0:Lcom/facebook/android/Facebook;
    //         invoke-static {p1}, Lcom/facebook/TokenCachingStrategy;->getExpirationMilliseconds(Landroid/os/Bundle;)J
    //         move-result-wide v2
    //         invoke-static {v0, v2, v3}, Lcom/facebook/android/Facebook;->access$402(Lcom/facebook/android/Facebook;J)J
    //         iget-object v0, p0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;->this$0:Lcom/facebook/android/Facebook;
    //         invoke-static {p1}, Lcom/facebook/TokenCachingStrategy;->getPermissions(Landroid/os/Bundle;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/facebook/android/Facebook;->access$800(Ljava/util/List;)[Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/android/Facebook;->access$502(Lcom/facebook/android/Facebook;[Ljava/lang/String;)[Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;->this$0:Lcom/facebook/android/Facebook;
    //         invoke-static {p1}, Lcom/facebook/TokenCachingStrategy;->getLastRefreshMilliseconds(Landroid/os/Bundle;)J
    //         move-result-wide v2
    //         invoke-static {v0, v2, v3}, Lcom/facebook/android/Facebook;->access$702(Lcom/facebook/android/Facebook;J)J
    //         return-void
    */

}
