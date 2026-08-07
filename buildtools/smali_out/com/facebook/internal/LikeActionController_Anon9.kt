package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 1 fields, 2 methods.

open class LikeActionController_Anon9: com.facebook.internal.PlatformServiceClient.CompletedListener {
    val this$0: com.facebook.internal.LikeActionController

    constructor(p0: com.facebook.internal.LikeActionController)

    public fun completed(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 7
    //         if-eqz p1, :cond_0
    //         const-string v0, "com.facebook.platform.extra.OBJECT_IS_LIKED"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const-string v0, "com.facebook.platform.extra.OBJECT_IS_LIKED"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v1
    //         const-string v0, "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const-string v0, "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         :goto_1
    //         const-string v0, "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         const-string v0, "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         :goto_2
    //         const-string v0, "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         const-string v0, "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         :goto_3
    //         const-string v0, "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         const-string v0, "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v5
    //         :goto_4
    //         const-string v0, "com.facebook.platform.extra.UNLIKE_TOKEN"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         const-string v0, "com.facebook.platform.extra.UNLIKE_TOKEN"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         :goto_5
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$9;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static/range {v0 .. v6}, Lcom/facebook/internal/LikeActionController;->access$1400(Lcom/facebook/internal/LikeActionController;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$9;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$800(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v2
    //         goto :goto_1
    //         :cond_3
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$9;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v3
    //         goto :goto_2
    //         :cond_4
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$9;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1000(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v4
    //         goto :goto_3
    //         :cond_5
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$9;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1100(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v5
    //         goto :goto_4
    //         :cond_6
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$9;->this$0:Lcom/facebook/internal/LikeActionController;
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1200(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v6
    //         goto :goto_5
    */

}
