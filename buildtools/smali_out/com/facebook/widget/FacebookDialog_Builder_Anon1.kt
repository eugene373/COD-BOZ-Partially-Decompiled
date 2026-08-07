package com.facebook.widget

// Auto-emitted from smali source: FacebookDialog.java.
// 1 fields, 2 methods.

open class FacebookDialog_Builder_Anon1: com.facebook.widget.FacebookDialog.OnPresentCallback {
    val this$0: com.facebook.widget.FacebookDialog.Builder

    constructor(p0: com.facebook.widget.FacebookDialog.Builder)

    public fun onPresent(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Exception;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;
    //         iget-object v0, v0, Lcom/facebook/widget/FacebookDialog$Builder;->imageAttachments:Ljava/util/HashMap;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;
    //         iget-object v0, v0, Lcom/facebook/widget/FacebookDialog$Builder;->imageAttachments:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->size()I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         invoke-static {}, Lcom/facebook/widget/FacebookDialog;->access$900()Lcom/facebook/NativeAppCallAttachmentStore;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;
    //         iget-object v1, v1, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;
    //         iget-object v2, v2, Lcom/facebook/widget/FacebookDialog$Builder;->imageAttachments:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/facebook/NativeAppCallAttachmentStore;->addAttachmentsForCall(Landroid/content/Context;Ljava/util/UUID;Ljava/util/Map;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;
    //         iget-object v0, v0, Lcom/facebook/widget/FacebookDialog$Builder;->mediaAttachmentFiles:Ljava/util/HashMap;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;
    //         iget-object v0, v0, Lcom/facebook/widget/FacebookDialog$Builder;->mediaAttachmentFiles:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->size()I
    //         move-result v0
    //         if-lez v0, :cond_1
    //         invoke-static {}, Lcom/facebook/widget/FacebookDialog;->access$900()Lcom/facebook/NativeAppCallAttachmentStore;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;
    //         iget-object v1, v1, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$Builder$1;->this$0:Lcom/facebook/widget/FacebookDialog$Builder;
    //         iget-object v2, v2, Lcom/facebook/widget/FacebookDialog$Builder;->mediaAttachmentFiles:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/facebook/NativeAppCallAttachmentStore;->addAttachmentFilesForCall(Landroid/content/Context;Ljava/util/UUID;Ljava/util/Map;)V
    //         :cond_1
    //         return-void
    */

}
