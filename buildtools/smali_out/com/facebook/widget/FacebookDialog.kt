package com.facebook.widget

// Auto-emitted from smali source: FacebookDialog.java.
// 12 fields, 27 methods.

open class FacebookDialog {
    private var activity: android.app.Activity
    private var appCall: com.facebook.widget.FacebookDialog.PendingCall
    private var fragment: android.support.v4.app.Fragment
    private var onPresentCallback: com.facebook.widget.FacebookDialog.OnPresentCallback

    private constructor(p0: android.app.Activity, p1: android.support.v4.app.Fragment, p2: com.facebook.widget.FacebookDialog.PendingCall, p3: com.facebook.widget.FacebookDialog.OnPresentCallback)

    constructor(p0: android.app.Activity, p1: android.support.v4.app.Fragment, p2: com.facebook.widget.FacebookDialog.PendingCall, p3: com.facebook.widget.FacebookDialog.OnPresentCallback, p4: com.facebook.widget.FacebookDialog.1)

    public fun present(): com.facebook.widget.FacebookDialog.PendingCall { return TODO("body: ()Lcom/facebook/widget/FacebookDialog$PendingCall;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog;->activity:Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog;->fragment:Landroid/support/v4/app/Fragment;
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v2}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestIntent()Landroid/content/Intent;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/facebook/widget/FacebookDialog;->getEventName(Landroid/content/Intent;)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v3, "Completed"
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/widget/FacebookDialog;->logDialogActivity(Landroid/app/Activity;Landroid/support/v4/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog;->onPresentCallback:Lcom/facebook/widget/FacebookDialog$OnPresentCallback;
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog;->onPresentCallback:Lcom/facebook/widget/FacebookDialog$OnPresentCallback;
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog;->activity:Landroid/app/Activity;
    //         invoke-interface {v0, v1}, Lcom/facebook/widget/FacebookDialog$OnPresentCallback;->onPresent(Landroid/content/Context;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog;->fragment:Landroid/support/v4/app/Fragment;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog;->fragment:Landroid/support/v4/app/Fragment;
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestIntent()Landroid/content/Intent;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v2}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestCode()I
    //         move-result v2
    //         invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/facebook/FacebookException;
    //         invoke-direct {v1, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog;->activity:Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestIntent()Landroid/content/Intent;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v2}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestCode()I
    //         move-result v2
    //         invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         goto :goto_0
    */

    companion object {
    @JvmField public val COMPLETION_GESTURE_CANCEL: String = "cancel"
    private val EXTRA_DIALOG_COMPLETE_KEY: String = "com.facebook.platform.extra.DID_COMPLETE"
    private val EXTRA_DIALOG_COMPLETION_GESTURE_KEY: String = "com.facebook.platform.extra.COMPLETION_GESTURE"
    private val EXTRA_DIALOG_COMPLETION_ID_KEY: String = "com.facebook.platform.extra.POST_ID"
    @JvmField public val RESULT_ARGS_DIALOG_COMPLETE_KEY: String = "didComplete"
    @JvmField public val RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY: String = "completionGesture"
    @JvmField public val RESULT_ARGS_DIALOG_COMPLETION_ID_KEY: String = "postId"
    private var attachmentStore: com.facebook.NativeAppCallAttachmentStore

    public @JvmStatic fun canPresentMessageDialog(p0: android.content.Context, p1: Array<com.facebook.widget.FacebookDialog.MessageDialogFeature>): Boolean { return TODO("body: (Landroid/content/Context;[Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;->MESSAGE_DIALOG:Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;
    //         invoke-static {v0, p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/facebook/widget/FacebookDialog;->handleCanPresent(Landroid/content/Context;Ljava/lang/Iterable;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun canPresentOpenGraphActionDialog(p0: android.content.Context, p1: Array<com.facebook.widget.FacebookDialog.OpenGraphActionDialogFeature>): Boolean { return TODO("body: (Landroid/content/Context;[Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;->OG_ACTION_DIALOG:Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;
    //         invoke-static {v0, p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/facebook/widget/FacebookDialog;->handleCanPresent(Landroid/content/Context;Ljava/lang/Iterable;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun canPresentOpenGraphMessageDialog(p0: android.content.Context, p1: Array<com.facebook.widget.FacebookDialog.OpenGraphMessageDialogFeature>): Boolean { return TODO("body: (Landroid/content/Context;[Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->OG_MESSAGE_DIALOG:Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;
    //         invoke-static {v0, p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/facebook/widget/FacebookDialog;->handleCanPresent(Landroid/content/Context;Ljava/lang/Iterable;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun canPresentShareDialog(p0: android.content.Context, p1: Array<com.facebook.widget.FacebookDialog.ShareDialogFeature>): Boolean { return TODO("body: (Landroid/content/Context;[Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;->SHARE_DIALOG:Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;
    //         invoke-static {v0, p1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/facebook/widget/FacebookDialog;->handleCanPresent(Landroid/content/Context;Ljava/lang/Iterable;)Z
    //         move-result v0
    //         return v0
    */

    private @JvmStatic fun getActionForFeatures(p0: Iterable): String { return TODO("body: (Ljava/lang/Iterable;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Iterable",
    //                 "<+",
    //                 "Lcom/facebook/widget/FacebookDialog$DialogFeature;",
    //                 ">;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/FacebookDialog$DialogFeature;
    //         invoke-interface {v0}, Lcom/facebook/widget/FacebookDialog$DialogFeature;->getAction()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         return-object v0
    */

    private @JvmStatic fun getAttachmentStore(): com.facebook.NativeAppCallAttachmentStore { return TODO("body: ()Lcom/facebook/NativeAppCallAttachmentStore;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/widget/FacebookDialog;->attachmentStore:Lcom/facebook/NativeAppCallAttachmentStore;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/facebook/NativeAppCallAttachmentStore;
    //         invoke-direct {v0}, Lcom/facebook/NativeAppCallAttachmentStore;-><init>()V
    //         sput-object v0, Lcom/facebook/widget/FacebookDialog;->attachmentStore:Lcom/facebook/NativeAppCallAttachmentStore;
    //         :cond_0
    //         sget-object v0, Lcom/facebook/widget/FacebookDialog;->attachmentStore:Lcom/facebook/NativeAppCallAttachmentStore;
    //         return-object v0
    */

    private @JvmStatic fun getEventName(p0: android.content.Intent): String { return TODO("body: (Landroid/content/Intent;)Ljava/lang/String;") }
    /*
    //         .locals 7
    //         const/4 v0, 0x1
    //         const-string v1, "com.facebook.platform.protocol.PROTOCOL_ACTION"
    //         invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v1, "com.facebook.platform.extra.PHOTOS"
    //         invoke-virtual {p0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v2
    //         const/4 v1, 0x0
    //         const-string v4, "com.facebook.platform.protocol.METHOD_ARGS"
    //         invoke-virtual {p0, v4}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v4
    //         if-eqz v4, :cond_2
    //         const-string v5, "PHOTOS"
    //         invoke-virtual {v4, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v5
    //         const-string v6, "VIDEO"
    //         invoke-virtual {v4, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         if-eqz v5, :cond_0
    //         invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v5
    //         if-nez v5, :cond_0
    //         move v2, v0
    //         :cond_0
    //         if-eqz v4, :cond_1
    //         invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z
    //         move-result v4
    //         if-nez v4, :cond_1
    //         move v1, v2
    //         :goto_0
    //         invoke-static {v3, v1, v0}, Lcom/facebook/widget/FacebookDialog;->getEventName(Ljava/lang/String;ZZ)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_1
    //         move v0, v1
    //         move v1, v2
    //         goto :goto_0
    //         :cond_2
    //         move v0, v1
    //         move v1, v2
    //         goto :goto_0
    */

    private @JvmStatic fun getEventName(p0: String, p1: Boolean, p2: Boolean): String { return TODO("body: (Ljava/lang/String;ZZ)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const-string v0, "com.facebook.platform.action.request.FEED_DIALOG"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         if-eqz p2, :cond_0
    //         const-string v0, "fb_dialogs_present_share_video"
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         if-eqz p1, :cond_1
    //         const-string v0, "fb_dialogs_present_share_photo"
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "fb_dialogs_present_share"
    //         goto :goto_0
    //         :cond_2
    //         const-string v0, "com.facebook.platform.action.request.MESSAGE_DIALOG"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         if-eqz p1, :cond_3
    //         const-string v0, "fb_dialogs_present_message_photo"
    //         goto :goto_0
    //         :cond_3
    //         const-string v0, "fb_dialogs_present_message"
    //         goto :goto_0
    //         :cond_4
    //         const-string v0, "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         const-string v0, "fb_dialogs_present_share_og"
    //         goto :goto_0
    //         :cond_5
    //         const-string v0, "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         const-string v0, "fb_dialogs_present_message_og"
    //         goto :goto_0
    //         :cond_6
    //         const-string v0, "com.facebook.platform.action.request.LIKE_DIALOG"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_7
    //         const-string v0, "fb_dialogs_present_like"
    //         goto :goto_0
    //         :cond_7
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "An unspecified action was presented"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public @JvmStatic fun getNativeDialogCompletionGesture(p0: android.os.Bundle): String { return TODO("body: (Landroid/os/Bundle;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "completionGesture"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "completionGesture"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.facebook.platform.extra.COMPLETION_GESTURE"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun getNativeDialogDidComplete(p0: android.os.Bundle): Boolean { return TODO("body: (Landroid/os/Bundle;)Z") }
    /*
    //         .locals 2
    //         const-string v0, "didComplete"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "didComplete"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "com.facebook.platform.extra.DID_COMPLETE"
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         goto :goto_0
    */

    public @JvmStatic fun getNativeDialogPostId(p0: android.os.Bundle): String { return TODO("body: (Landroid/os/Bundle;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "postId"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "postId"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.facebook.platform.extra.POST_ID"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    private @JvmStatic fun getProtocolVersionForNativeDialog(p0: android.content.Context, p1: String, p2: IntArray): Int { return TODO("body: (Landroid/content/Context;Ljava/lang/String;[I)I") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1, p2}, Lcom/facebook/internal/NativeProtocol;->getLatestAvailableProtocolVersionForAction(Landroid/content/Context;Ljava/lang/String;[I)I
    //         move-result v0
    //         return v0
    */

    private @JvmStatic fun getVersionSpecForFeature(p0: String, p1: String, p2: com.facebook.widget.FacebookDialog.DialogFeature): IntArray { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Lcom/facebook/widget/FacebookDialog$DialogFeature;)[I") }
    /*
    //         .locals 3
    //         invoke-interface {p2}, Lcom/facebook/widget/FacebookDialog$DialogFeature;->name()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, p1, v0}, Lcom/facebook/internal/Utility;->getDialogFeatureConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/internal/Utility$DialogFeatureConfig;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->getVersionSpec()[I
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         new-array v0, v0, [I
    //         const/4 v1, 0x0
    //         invoke-interface {p2}, Lcom/facebook/widget/FacebookDialog$DialogFeature;->getMinVersion()I
    //         move-result v2
    //         aput v2, v0, v1
    //         goto :goto_0
    */

    private @JvmStatic fun getVersionSpecForFeatures(p0: String, p1: String, p2: Iterable): IntArray { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Iterable;)[I") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Iterable",
    //                 "<+",
    //                 "Lcom/facebook/widget/FacebookDialog$DialogFeature;",
    //                 ">;)[I"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         move-object v1, v0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/FacebookDialog$DialogFeature;
    //         invoke-static {p0, p1, v0}, Lcom/facebook/widget/FacebookDialog;->getVersionSpecForFeature(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/widget/FacebookDialog$DialogFeature;)[I
    //         move-result-object v0
    //         invoke-static {v1, v0}, Lcom/facebook/internal/Utility;->intersectRanges([I[I)[I
    //         move-result-object v0
    //         move-object v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public @JvmStatic fun handleActivityResult(p0: android.content.Context, p1: com.facebook.widget.FacebookDialog.PendingCall, p2: Int, p3: android.content.Intent, p4: com.facebook.widget.FacebookDialog.Callback): Boolean { return TODO("body: (Landroid/content/Context;Lcom/facebook/widget/FacebookDialog$PendingCall;ILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestCode()I
    //         move-result v0
    //         if-eq p2, v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v0, Lcom/facebook/widget/FacebookDialog;->attachmentStore:Lcom/facebook/NativeAppCallAttachmentStore;
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/facebook/widget/FacebookDialog;->attachmentStore:Lcom/facebook/NativeAppCallAttachmentStore;
    //         invoke-virtual {p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v1
    //         invoke-virtual {v0, p0, v1}, Lcom/facebook/NativeAppCallAttachmentStore;->cleanupAttachmentsForCall(Landroid/content/Context;Ljava/util/UUID;)V
    //         :cond_1
    //         if-eqz p4, :cond_2
    //         invoke-static {p3}, Lcom/facebook/internal/NativeProtocol;->isErrorResult(Landroid/content/Intent;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-static {p3}, Lcom/facebook/internal/NativeProtocol;->getErrorDataFromResultIntent(Landroid/content/Intent;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/NativeProtocol;->getExceptionFromErrorData(Landroid/os/Bundle;)Ljava/lang/Exception;
    //         move-result-object v1
    //         invoke-interface {p4, p1, v1, v0}, Lcom/facebook/widget/FacebookDialog$Callback;->onError(Lcom/facebook/widget/FacebookDialog$PendingCall;Ljava/lang/Exception;Landroid/os/Bundle;)V
    //         :cond_2
    //         :goto_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_3
    //         invoke-static {p3}, Lcom/facebook/internal/NativeProtocol;->getSuccessResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-interface {p4, p1, v0}, Lcom/facebook/widget/FacebookDialog$Callback;->onComplete(Lcom/facebook/widget/FacebookDialog$PendingCall;Landroid/os/Bundle;)V
    //         goto :goto_1
    */

    private @JvmStatic fun handleCanPresent(p0: android.content.Context, p1: Iterable): Boolean { return TODO("body: (Landroid/content/Context;Ljava/lang/Iterable;)Z") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Ljava/lang/Iterable",
    //                 "<+",
    //                 "Lcom/facebook/widget/FacebookDialog$DialogFeature;",
    //                 ">;)Z"
    //             }
    //         .end annotation
    //         invoke-static {p1}, Lcom/facebook/widget/FacebookDialog;->getActionForFeatures(Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {}, Lcom/facebook/Settings;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->getMetadataApplicationId(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         invoke-static {v0, v1, p1}, Lcom/facebook/widget/FacebookDialog;->getVersionSpecForFeatures(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Iterable;)[I
    //         move-result-object v0
    //         invoke-static {p0, v1, v0}, Lcom/facebook/widget/FacebookDialog;->getProtocolVersionForNativeDialog(Landroid/content/Context;Ljava/lang/String;[I)I
    //         move-result v0
    //         const/4 v1, -0x1
    //         if-eq v0, v1, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private @JvmStatic fun logDialogActivity(p0: android.app.Activity, p1: android.support.v4.app.Fragment, p2: String, p3: String) { /* TODO(body): (Landroid/app/Activity;Landroid/support/v4/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object p0
    //         :cond_0
    //         invoke-static {p0}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;)Lcom/facebook/AppEventsLogger;
    //         move-result-object v0
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         const-string v2, "fb_dialog_outcome"
    //         invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, p2, v2, v1}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         return-void
    */

    }
}
