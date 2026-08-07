package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 52 fields, 75 methods.

open class LikeActionController {
    private var appEventsLogger: com.facebook.AppEventsLogger
    private var context: android.content.Context
    private var isObjectLiked: Boolean
    private var isObjectLikedOnServer: Boolean
    private var isPendingLikeOrUnlike: Boolean
    private var likeCountStringWithLike: String
    private var likeCountStringWithoutLike: String
    private var objectId: String
    private var objectIsPage: Boolean
    private var pendingCallAnalyticsBundle: android.os.Bundle
    private var pendingCallId: java.util.UUID
    private var session: com.facebook.Session
    private var socialSentenceWithLike: String
    private var socialSentenceWithoutLike: String
    private var unlikeToken: String
    private var verifiedObjectId: String

    private constructor(p0: android.content.Context, p1: com.facebook.Session, p2: String)

    private fun canUseOGPublish(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->objectIsPage:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         const-string v1, "publish_actions"
    //         invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun fallbackToDialog(p0: android.app.Activity, p1: android.os.Bundle, p2: Boolean) { /* TODO(body): (Landroid/app/Activity;Landroid/os/Bundle;Z)V */ }
    /*
    //         .locals 7
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;
    //         iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;
    //         iget-object v5, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;
    //         iget-object v6, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    //         move-object v0, p0
    //         move v1, p3
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/internal/LikeActionController;->updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-direct {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->presentLikeDialog(Landroid/app/Activity;Landroid/os/Bundle;)V
    //         return-void
    */

    private fun fetchVerifiedObjectId(p0: com.facebook.internal.LikeActionController.RequestCompletionCallback) { /* TODO(body): (Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;->onComplete()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         new-instance v0, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;
    //         invoke-direct {v0, p0, v1}, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    //         new-instance v1, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;
    //         invoke-direct {v1, p0, v2}, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    //         new-instance v2, Lcom/facebook/RequestBatch;
    //         invoke-direct {v2}, Lcom/facebook/RequestBatch;-><init>()V
    //         invoke-virtual {v0, v2}, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V
    //         invoke-virtual {v1, v2}, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V
    //         new-instance v3, Lcom/facebook/internal/LikeActionController$10;
    //         invoke-direct {v3, p0, v0, v1, p1}, Lcom/facebook/internal/LikeActionController$10;-><init>(Lcom/facebook/internal/LikeActionController;Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V
    //         invoke-virtual {v2, v3}, Lcom/facebook/RequestBatch;->addCallback(Lcom/facebook/RequestBatch$Callback;)V
    //         invoke-virtual {v2}, Lcom/facebook/RequestBatch;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         goto :goto_0
    */

    private fun getFacebookDialogCallback(p0: android.os.Bundle): com.facebook.widget.FacebookDialog.Callback { return TODO("body: (Landroid/os/Bundle;)Lcom/facebook/widget/FacebookDialog$Callback;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/facebook/internal/LikeActionController$5;
    //         invoke-direct {v0, p0, p1}, Lcom/facebook/internal/LikeActionController$5;-><init>(Lcom/facebook/internal/LikeActionController;Landroid/os/Bundle;)V
    //         return-object v0
    */

    private fun logAppEventForError(p0: String, p1: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
    //         const-string v1, "object_id"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "current_action"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         const-string v2, "fb_like_control_error"
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v2, v3, v0}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         return-void
    */

    private fun logAppEventForError(p0: String, p1: com.facebook.FacebookRequestError) { /* TODO(body): (Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         if-eqz p2, :cond_0
    //         invoke-virtual {p2}, Lcom/facebook/FacebookRequestError;->getRequestResult()Lorg/json/JSONObject;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         const-string v2, "error"
    //         invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         invoke-direct {p0, p1, v0}, Lcom/facebook/internal/LikeActionController;->logAppEventForError(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    private fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent, p3: java.util.UUID): Boolean { return TODO("body: (IILandroid/content/Intent;Ljava/util/UUID;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;
    //         invoke-virtual {v1, p4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-static {}, Lcom/facebook/internal/PendingCallStore;->getInstance()Lcom/facebook/internal/PendingCallStore;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;
    //         invoke-virtual {v1, v2}, Lcom/facebook/internal/PendingCallStore;->getPendingCallById(Ljava/util/UUID;)Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;
    //         invoke-direct {p0, v2}, Lcom/facebook/internal/LikeActionController;->getFacebookDialogCallback(Landroid/os/Bundle;)Lcom/facebook/widget/FacebookDialog$Callback;
    //         move-result-object v2
    //         invoke-static {v0, v1, p1, p3, v2}, Lcom/facebook/widget/FacebookDialog;->handleActivityResult(Landroid/content/Context;Lcom/facebook/widget/FacebookDialog$PendingCall;ILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z
    //         invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->stopTrackingPendingCall()V
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    private fun performLikeOrUnlike(p0: android.app.Activity, p1: Boolean, p2: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;ZLandroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->canUseOGPublish()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         if-eqz p2, :cond_0
    //         invoke-direct {p0, p1, p3}, Lcom/facebook/internal/LikeActionController;->publishLikeAsync(Landroid/app/Activity;Landroid/os/Bundle;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         invoke-direct {p0, p1, p3}, Lcom/facebook/internal/LikeActionController;->publishUnlikeAsync(Landroid/app/Activity;Landroid/os/Bundle;)V
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x1
    //         invoke-direct {p0, p1, p3, v0}, Lcom/facebook/internal/LikeActionController;->fallbackToDialog(Landroid/app/Activity;Landroid/os/Bundle;Z)V
    //         goto :goto_0
    //         :cond_2
    //         invoke-direct {p0, p1, p3}, Lcom/facebook/internal/LikeActionController;->presentLikeDialog(Landroid/app/Activity;Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    private fun presentLikeDialog(p0: android.app.Activity, p1: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         new-instance v0, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;
    //         invoke-direct {v0, p1, v1}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;-><init>(Landroid/app/Activity;Ljava/lang/String;)V
    //         invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->canPresent()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->build()Lcom/facebook/widget/FacebookDialog;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog;->present()Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         move-result-object v0
    //         invoke-direct {p0, v0, p2}, Lcom/facebook/internal/LikeActionController;->trackPendingCall(Lcom/facebook/widget/FacebookDialog$PendingCall;Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         const-string v1, "fb_like_control_did_present_dialog"
    //         invoke-virtual {v0, v1, v4, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->getWebFallbackUrl()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->getApplicationId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->getAppCall()Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         move-result-object v0
    //         invoke-direct {p0, p2}, Lcom/facebook/internal/LikeActionController;->getFacebookDialogCallback(Landroid/os/Bundle;)Lcom/facebook/widget/FacebookDialog$Callback;
    //         move-result-object v3
    //         invoke-static {p1, v1, v2, v0, v3}, Lcom/facebook/internal/FacebookWebFallbackDialog;->presentWebFallback(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/widget/FacebookDialog$PendingCall;Lcom/facebook/widget/FacebookDialog$Callback;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         const-string v1, "fb_like_control_did_present_fallback_dialog"
    //         invoke-virtual {v0, v1, v4, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    private fun publishLikeAsync(p0: android.app.Activity, p1: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z
    //         new-instance v0, Lcom/facebook/internal/LikeActionController$6;
    //         invoke-direct {v0, p0, p1, p2}, Lcom/facebook/internal/LikeActionController$6;-><init>(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V
    //         invoke-direct {p0, v0}, Lcom/facebook/internal/LikeActionController;->fetchVerifiedObjectId(Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V
    //         return-void
    */

    private fun publishUnlikeAsync(p0: android.app.Activity, p1: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z
    //         new-instance v0, Lcom/facebook/RequestBatch;
    //         invoke-direct {v0}, Lcom/facebook/RequestBatch;-><init>()V
    //         new-instance v1, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    //         invoke-direct {v1, p0, v2}, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    //         invoke-virtual {v1, v0}, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V
    //         new-instance v2, Lcom/facebook/internal/LikeActionController$7;
    //         invoke-direct {v2, p0, v1, p1, p2}, Lcom/facebook/internal/LikeActionController$7;-><init>(Lcom/facebook/internal/LikeActionController;Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;Landroid/app/Activity;Landroid/os/Bundle;)V
    //         invoke-virtual {v0, v2}, Lcom/facebook/RequestBatch;->addCallback(Lcom/facebook/RequestBatch$Callback;)V
    //         invoke-virtual {v0}, Lcom/facebook/RequestBatch;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         return-void
    */

    private fun refreshStatusAsync() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->isClosed()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/facebook/SessionState;->CREATED:Lcom/facebook/SessionState;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;
    //         invoke-virtual {v1}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/SessionState;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         :cond_0
    //         invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->refreshStatusViaService()V
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         new-instance v0, Lcom/facebook/internal/LikeActionController$8;
    //         invoke-direct {v0, p0}, Lcom/facebook/internal/LikeActionController$8;-><init>(Lcom/facebook/internal/LikeActionController;)V
    //         invoke-direct {p0, v0}, Lcom/facebook/internal/LikeActionController;->fetchVerifiedObjectId(Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V
    //         goto :goto_0
    */

    private fun refreshStatusViaService() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/facebook/internal/LikeStatusClient;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;
    //         invoke-static {}, Lcom/facebook/Settings;->getApplicationId()Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;
    //         invoke-direct {v0, v1, v2, v3}, Lcom/facebook/internal/LikeStatusClient;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0}, Lcom/facebook/internal/LikeStatusClient;->start()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v1, Lcom/facebook/internal/LikeActionController$9;
    //         invoke-direct {v1, p0}, Lcom/facebook/internal/LikeActionController$9;-><init>(Lcom/facebook/internal/LikeActionController;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/LikeStatusClient;->setCompletedListener(Lcom/facebook/internal/PlatformServiceClient$CompletedListener;)V
    //         goto :goto_0
    */

    private fun stopTrackingPendingCall() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         invoke-static {}, Lcom/facebook/internal/PendingCallStore;->getInstance()Lcom/facebook/internal/PendingCallStore;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/PendingCallStore;->stopTrackingPendingCall(Ljava/util/UUID;)V
    //         iput-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;
    //         iput-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;
    //         invoke-direct {p0, v2}, Lcom/facebook/internal/LikeActionController;->storeObjectIdForPendingController(Ljava/lang/String;)V
    //         return-void
    */

    private fun storeObjectIdForPendingController(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         sput-object p1, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;
    //         const-string v1, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         const-string v1, "PENDING_CONTROLLER_KEY"
    //         sget-object v2, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;
    //         invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    //         return-void
    */

    private fun toggleAgainIfNeeded(p0: android.app.Activity, p1: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z
    //         iget-boolean v1, p0, Lcom/facebook/internal/LikeActionController;->isObjectLikedOnServer:Z
    //         if-eq v0, v1, :cond_0
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z
    //         invoke-direct {p0, p1, v0, p2}, Lcom/facebook/internal/LikeActionController;->performLikeOrUnlike(Landroid/app/Activity;ZLandroid/os/Bundle;)V
    //         :cond_0
    //         return-void
    */

    private fun trackPendingCall(p0: com.facebook.widget.FacebookDialog.PendingCall, p1: android.os.Bundle) { /* TODO(body): (Lcom/facebook/widget/FacebookDialog$PendingCall;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/facebook/internal/PendingCallStore;->getInstance()Lcom/facebook/internal/PendingCallStore;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/facebook/internal/PendingCallStore;->trackPendingCall(Lcom/facebook/widget/FacebookDialog$PendingCall;)V
    //         invoke-virtual {p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;
    //         invoke-direct {p0, v0}, Lcom/facebook/internal/LikeActionController;->storeObjectIdForPendingController(Ljava/lang/String;)V
    //         iput-object p2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;
    //         invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->serializeToDiskAsync(Lcom/facebook/internal/LikeActionController;)V
    //         return-void
    */

    private fun updateState(p0: Boolean, p1: String, p2: String, p3: String, p4: String, p5: String) { /* TODO(body): (ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         invoke-static {p2, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {p3, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p4, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {p5, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {p6, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v5
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z
    //         if-ne p1, v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;
    //         invoke-static {v1, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;
    //         invoke-static {v2, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;
    //         invoke-static {v3, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;
    //         invoke-static {v4, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    //         invoke-static {v5, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         if-nez v0, :cond_2
    //         :goto_1
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_2
    //         iput-boolean p1, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z
    //         iput-object v1, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;
    //         iput-object v2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;
    //         iput-object v3, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;
    //         iput-object v4, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;
    //         iput-object v5, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    //         invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->serializeToDiskAsync(Lcom/facebook/internal/LikeActionController;)V
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;
    //         const-string v1, "com.facebook.sdk.LikeActionController.UPDATED"
    //         invoke-static {v0, p0, v1}, Lcom/facebook/internal/LikeActionController;->broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    //         goto :goto_1
    */

    public fun getLikeCountString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;
    //         goto :goto_0
    */

    public fun getObjectId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSocialSentence(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;
    //         goto :goto_0
    */

    public fun isObjectLiked(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z
    //         return v0
    */

    public fun toggleLike(p0: android.app.Activity, p1: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         const-string v1, "fb_like_control_did_tap"
    //         invoke-virtual {v0, v1, v7, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z
    //         if-nez v0, :cond_0
    //         const/4 v1, 0x1
    //         :goto_0
    //         invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->canUseOGPublish()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;
    //         iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;
    //         iget-object v5, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;
    //         iget-object v6, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    //         move-object v0, p0
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/internal/LikeActionController;->updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         const-string v1, "fb_like_control_did_undo_quickly"
    //         invoke-virtual {v0, v1, v7, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V
    //         :goto_1
    //         return-void
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         :cond_1
    //         invoke-direct {p0, p1, v1, p2}, Lcom/facebook/internal/LikeActionController;->performLikeOrUnlike(Landroid/app/Activity;ZLandroid/os/Bundle;)V
    //         goto :goto_1
    */

    companion object {
    @JvmField public val ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR: String = "com.facebook.sdk.LikeActionController.DID_ERROR"
    @JvmField public val ACTION_LIKE_ACTION_CONTROLLER_DID_RESET: String = "com.facebook.sdk.LikeActionController.DID_RESET"
    @JvmField public val ACTION_LIKE_ACTION_CONTROLLER_UPDATED: String = "com.facebook.sdk.LikeActionController.UPDATED"
    @JvmField public val ACTION_OBJECT_ID_KEY: String = "com.facebook.sdk.LikeActionController.OBJECT_ID"
    private val ERROR_CODE_OBJECT_ALREADY_LIKED: Int = 0xdad
    @JvmField public val ERROR_INVALID_OBJECT_ID: String = "Invalid Object Id"
    private val JSON_BOOL_IS_OBJECT_LIKED_KEY: String = "is_object_liked"
    private val JSON_BUNDLE_PENDING_CALL_ANALYTICS_BUNDLE: String = "pending_call_analytics_bundle"
    private val JSON_INT_VERSION_KEY: String = "com.facebook.internal.LikeActionController.version"
    private val JSON_STRING_LIKE_COUNT_WITHOUT_LIKE_KEY: String = "like_count_string_without_like"
    private val JSON_STRING_LIKE_COUNT_WITH_LIKE_KEY: String = "like_count_string_with_like"
    private val JSON_STRING_OBJECT_ID_KEY: String = "object_id"
    private val JSON_STRING_PENDING_CALL_ID_KEY: String = "pending_call_id"
    private val JSON_STRING_SOCIAL_SENTENCE_WITHOUT_LIKE_KEY: String = "social_sentence_without_like"
    private val JSON_STRING_SOCIAL_SENTENCE_WITH_LIKE_KEY: String = "social_sentence_with_like"
    private val JSON_STRING_UNLIKE_TOKEN_KEY: String = "unlike_token"
    private val LIKE_ACTION_CONTROLLER_STORE: String = "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"
    private val LIKE_ACTION_CONTROLLER_STORE_OBJECT_SUFFIX_KEY: String = "OBJECT_SUFFIX"
    private val LIKE_ACTION_CONTROLLER_STORE_PENDING_OBJECT_ID_KEY: String = "PENDING_CONTROLLER_KEY"
    private val LIKE_ACTION_CONTROLLER_VERSION: Int = 0x2
    private val LIKE_DIALOG_RESPONSE_LIKE_COUNT_STRING_KEY: String = "like_count_string"
    private val LIKE_DIALOG_RESPONSE_OBJECT_IS_LIKED_KEY: String = "object_is_liked"
    private val LIKE_DIALOG_RESPONSE_SOCIAL_SENTENCE_KEY: String = "social_sentence"
    private val LIKE_DIALOG_RESPONSE_UNLIKE_TOKEN_KEY: String = "unlike_token"
    private val MAX_CACHE_SIZE: Int = 0x80
    private val MAX_OBJECT_SUFFIX: Int = 0x3e8
    private val TAG: String = null!!
    private val cache: java.util.concurrent.ConcurrentHashMap = null!!
    private var controllerDiskCache: com.facebook.internal.FileLruCache
    private var diskIOWorkQueue: com.facebook.internal.WorkQueue
    private var handler: android.os.Handler
    private var isInitialized: Boolean
    private var isPendingBroadcastReset: Boolean
    private var mruCacheWorkQueue: com.facebook.internal.WorkQueue
    private var objectIdForPendingController: String
    private var objectSuffix: Int

    private @JvmStatic fun broadcastAction(p0: android.content.Context, p1: com.facebook.internal.LikeActionController, p2: String) { /* TODO(body): (Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, p1, p2, v0}, Lcom/facebook/internal/LikeActionController;->broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    private @JvmStatic fun broadcastAction(p0: android.content.Context, p1: com.facebook.internal.LikeActionController, p2: String, p3: android.os.Bundle) { /* TODO(body): (Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         if-nez p3, :cond_0
    //         new-instance p3, Landroid/os/Bundle;
    //         invoke-direct {p3}, Landroid/os/Bundle;-><init>()V
    //         :cond_0
    //         const-string v1, "com.facebook.sdk.LikeActionController.OBJECT_ID"
    //         invoke-virtual {p1}, Lcom/facebook/internal/LikeActionController;->getObjectId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p3, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_1
    //         if-eqz p3, :cond_2
    //         invoke-virtual {v0, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         :cond_2
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-static {v1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z
    //         return-void
    */

    private @JvmStatic fun createControllerForObjectId(p0: android.content.Context, p1: String, p2: com.facebook.internal.LikeActionController.CreationCallback) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V */ }
    /*
    //         .locals 3
    //         invoke-static {p1}, Lcom/facebook/internal/LikeActionController;->getControllerFromInMemoryCache(Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p2, v0}, Lcom/facebook/internal/LikeActionController;->invokeCallbackWithController(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1}, Lcom/facebook/internal/LikeActionController;->deserializeFromDiskSynchronously(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/facebook/internal/LikeActionController;
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         invoke-direct {v0, p0, v1, p1}, Lcom/facebook/internal/LikeActionController;-><init>(Landroid/content/Context;Lcom/facebook/Session;Ljava/lang/String;)V
    //         invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->serializeToDiskAsync(Lcom/facebook/internal/LikeActionController;)V
    //         :cond_1
    //         invoke-static {p1, v0}, Lcom/facebook/internal/LikeActionController;->putControllerInMemoryCache(Ljava/lang/String;Lcom/facebook/internal/LikeActionController;)V
    //         sget-object v1, Lcom/facebook/internal/LikeActionController;->handler:Landroid/os/Handler;
    //         new-instance v2, Lcom/facebook/internal/LikeActionController$2;
    //         invoke-direct {v2, v0}, Lcom/facebook/internal/LikeActionController$2;-><init>(Lcom/facebook/internal/LikeActionController;)V
    //         invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         invoke-static {p2, v0}, Lcom/facebook/internal/LikeActionController;->invokeCallbackWithController(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V
    //         goto :goto_0
    */

    private @JvmStatic fun deserializeFromDiskSynchronously(p0: android.content.Context, p1: String): com.facebook.internal.LikeActionController { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-static {p1}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         sget-object v2, Lcom/facebook/internal/LikeActionController;->controllerDiskCache:Lcom/facebook/internal/FileLruCache;
    //         invoke-virtual {v2, v1}, Lcom/facebook/internal/FileLruCache;->get(Ljava/lang/String;)Ljava/io/InputStream;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         :try_start_1
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->readStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v3
    //         if-nez v3, :cond_0
    //         invoke-static {p0, v1}, Lcom/facebook/internal/LikeActionController;->deserializeFromJson(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         move-result-object v0
    //         :cond_0
    //         if-eqz v2, :cond_1
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         :cond_1
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         move-object v2, v0
    //         :goto_1
    //         :try_start_2
    //         sget-object v3, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;
    //         const-string v4, "Unable to deserialize controller from disk"
    //         invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         if-eqz v2, :cond_1
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v1
    //         move-object v2, v0
    //         move-object v0, v1
    //         :goto_2
    //         if-eqz v2, :cond_2
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         :cond_2
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         goto :goto_2
    //         :catch_1
    //         move-exception v1
    //         goto :goto_1
    */

    private @JvmStatic fun deserializeFromJson(p0: android.content.Context, p1: String): com.facebook.internal.LikeActionController { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;") }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         :try_start_0
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v0, "com.facebook.internal.LikeActionController.version"
    //         const/4 v3, -0x1
    //         invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
    //         move-result v0
    //         const/4 v3, 0x2
    //         if-eq v0, v3, :cond_0
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         new-instance v0, Lcom/facebook/internal/LikeActionController;
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v3
    //         const-string v4, "object_id"
    //         invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-direct {v0, p0, v3, v4}, Lcom/facebook/internal/LikeActionController;-><init>(Landroid/content/Context;Lcom/facebook/Session;Ljava/lang/String;)V
    //         const-string v3, "like_count_string_with_like"
    //         const/4 v4, 0x0
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;
    //         const-string v3, "like_count_string_without_like"
    //         const/4 v4, 0x0
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;
    //         const-string v3, "social_sentence_with_like"
    //         const/4 v4, 0x0
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;
    //         const-string v3, "social_sentence_without_like"
    //         const/4 v4, 0x0
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;
    //         const-string v3, "is_object_liked"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z
    //         move-result v3
    //         iput-boolean v3, v0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z
    //         const-string v3, "unlike_token"
    //         const/4 v4, 0x0
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    //         const-string v3, "pending_call_id"
    //         const/4 v4, 0x0
    //         invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v3}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v4
    //         if-nez v4, :cond_1
    //         invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;
    //         move-result-object v3
    //         iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;
    //         :cond_1
    //         const-string v3, "pending_call_analytics_bundle"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v2
    //         if-eqz v2, :cond_2
    //         invoke-static {v2}, Lcom/facebook/internal/BundleJSONConverter;->convertToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;
    //         move-result-object v2
    //         iput-object v2, v0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_2
    //         :goto_1
    //         move-object v1, v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         sget-object v2, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;
    //         const-string v3, "Unable to deserialize controller from JSON"
    //         invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         move-object v0, v1
    //         goto :goto_1
    */

    private @JvmStatic fun getCacheKeyForObjectId(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v1}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         if-eqz v0, :cond_1
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->md5hash(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_1
    //         const-string v1, "%s|%s|com.fb.sdk.like|%d"
    //         const/4 v2, 0x3
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         aput-object p0, v2, v3
    //         const/4 v3, 0x1
    //         const-string v4, ""
    //         invoke-static {v0, v4}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         aput-object v0, v2, v3
    //         const/4 v0, 0x2
    //         sget v3, Lcom/facebook/internal/LikeActionController;->objectSuffix:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v2, v0
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getControllerForObjectId(p0: android.content.Context, p1: String, p2: com.facebook.internal.LikeActionController.CreationCallback) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V */ }
    /*
    //         .locals 2
    //         sget-boolean v0, Lcom/facebook/internal/LikeActionController;->isInitialized:Z
    //         if-nez v0, :cond_0
    //         invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->performFirstInitialize(Landroid/content/Context;)V
    //         :cond_0
    //         invoke-static {p1}, Lcom/facebook/internal/LikeActionController;->getControllerFromInMemoryCache(Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-static {p2, v0}, Lcom/facebook/internal/LikeActionController;->invokeCallbackWithController(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         sget-object v0, Lcom/facebook/internal/LikeActionController;->diskIOWorkQueue:Lcom/facebook/internal/WorkQueue;
    //         new-instance v1, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;
    //         invoke-direct {v1, p0, p1, p2}, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;
    //         goto :goto_0
    */

    private @JvmStatic fun getControllerFromInMemoryCache(p0: String): com.facebook.internal.LikeActionController { return TODO("body: (Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;") }
    /*
    //         .locals 5
    //         invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         sget-object v0, Lcom/facebook/internal/LikeActionController;->cache:Ljava/util/concurrent/ConcurrentHashMap;
    //         invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/LikeActionController;
    //         if-eqz v0, :cond_0
    //         sget-object v2, Lcom/facebook/internal/LikeActionController;->mruCacheWorkQueue:Lcom/facebook/internal/WorkQueue;
    //         new-instance v3, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;
    //         const/4 v4, 0x0
    //         invoke-direct {v3, v1, v4}, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;-><init>(Ljava/lang/String;Z)V
    //         invoke-virtual {v2, v3}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;
    //         :cond_0
    //         return-object v0
    */

    public @JvmStatic fun handleOnActivityResult(p0: android.content.Context, p1: Int, p2: Int, p3: android.content.Intent): Boolean { return TODO("body: (Landroid/content/Context;IILandroid/content/Intent;)Z") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         invoke-static {p3}, Lcom/facebook/internal/NativeProtocol;->getCallIdFromIntent(Landroid/content/Intent;)Ljava/util/UUID;
    //         move-result-object v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         sget-object v2, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         const-string v2, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"
    //         invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v2
    //         const-string v3, "PENDING_CONTROLLER_KEY"
    //         const/4 v4, 0x0
    //         invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         sput-object v2, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;
    //         :cond_2
    //         sget-object v2, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         sget-object v0, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;
    //         new-instance v2, Lcom/facebook/internal/LikeActionController$1;
    //         invoke-direct {v2, p1, p2, p3, v1}, Lcom/facebook/internal/LikeActionController$1;-><init>(IILandroid/content/Intent;Ljava/util/UUID;)V
    //         invoke-static {p0, v0, v2}, Lcom/facebook/internal/LikeActionController;->getControllerForObjectId(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    private @JvmStatic fun invokeCallbackWithController(p0: com.facebook.internal.LikeActionController.CreationCallback, p1: com.facebook.internal.LikeActionController) { /* TODO(body): (Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V */ }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         sget-object v0, Lcom/facebook/internal/LikeActionController;->handler:Landroid/os/Handler;
    //         new-instance v1, Lcom/facebook/internal/LikeActionController$3;
    //         invoke-direct {v1, p0, p1}, Lcom/facebook/internal/LikeActionController$3;-><init>(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         goto :goto_0
    */

    private @JvmStatic fun putControllerInMemoryCache(p0: String, p1: com.facebook.internal.LikeActionController) { /* TODO(body): (Ljava/lang/String;Lcom/facebook/internal/LikeActionController;)V */ }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/internal/LikeActionController;->mruCacheWorkQueue:Lcom/facebook/internal/WorkQueue;
    //         new-instance v2, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;
    //         const/4 v3, 0x1
    //         invoke-direct {v2, v0, v3}, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;-><init>(Ljava/lang/String;Z)V
    //         invoke-virtual {v1, v2}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;
    //         sget-object v1, Lcom/facebook/internal/LikeActionController;->cache:Ljava/util/concurrent/ConcurrentHashMap;
    //         invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    private @JvmStatic fun registerSessionBroadcastReceivers(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 3
    //         invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;
    //         move-result-object v0
    //         new-instance v1, Landroid/content/IntentFilter;
    //         invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V
    //         const-string v2, "com.facebook.sdk.ACTIVE_SESSION_UNSET"
    //         invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         const-string v2, "com.facebook.sdk.ACTIVE_SESSION_CLOSED"
    //         invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         const-string v2, "com.facebook.sdk.ACTIVE_SESSION_OPENED"
    //         invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         new-instance v2, Lcom/facebook/internal/LikeActionController$4;
    //         invoke-direct {v2}, Lcom/facebook/internal/LikeActionController$4;-><init>()V
    //         invoke-virtual {v0, v2, v1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    //         return-void
    */

    private @JvmStatic fun serializeToDiskAsync(p0: com.facebook.internal.LikeActionController) { /* TODO(body): (Lcom/facebook/internal/LikeActionController;)V */ }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->serializeToJson(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;
    //         invoke-static {v1}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         sget-object v2, Lcom/facebook/internal/LikeActionController;->diskIOWorkQueue:Lcom/facebook/internal/WorkQueue;
    //         new-instance v3, Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;
    //         invoke-direct {v3, v1, v0}, Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v2, v3}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;
    //         :cond_0
    //         return-void
    */

    private @JvmStatic fun serializeToDiskSynchronously(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/internal/LikeActionController;->controllerDiskCache:Lcom/facebook/internal/FileLruCache;
    //         invoke-virtual {v0, p0}, Lcom/facebook/internal/FileLruCache;->openPutStream(Ljava/lang/String;)Ljava/io/OutputStream;
    //         move-result-object v1
    //         invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v1, :cond_0
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         :try_start_1
    //         sget-object v2, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;
    //         const-string v3, "Unable to serialize controller to disk"
    //         invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         if-eqz v1, :cond_0
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         if-eqz v1, :cond_1
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         :cond_1
    //         throw v0
    */

    private @JvmStatic fun serializeToJson(p0: com.facebook.internal.LikeActionController): String { return TODO("body: (Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         :try_start_0
    //         const-string v1, "com.facebook.internal.LikeActionController.version"
    //         const/4 v2, 0x2
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         const-string v1, "object_id"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "like_count_string_with_like"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "like_count_string_without_like"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "social_sentence_with_like"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "social_sentence_without_like"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "is_object_liked"
    //         iget-boolean v2, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         const-string v1, "unlike_token"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;
    //         if-eqz v1, :cond_0
    //         const-string v1, "pending_call_id"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;
    //         invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_0
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;
    //         invoke-static {v1}, Lcom/facebook/internal/BundleJSONConverter;->convertToJSON(Landroid/os/Bundle;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         const-string v2, "pending_call_analytics_bundle"
    //         invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_1
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;
    //         const-string v2, "Unable to serialize controller to JSON"
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
