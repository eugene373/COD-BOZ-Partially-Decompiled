package com.facebook

// Auto-emitted from smali source: UiLifecycleHelper.java.
// 9 fields, 15 methods.

open class UiLifecycleHelper {
    private val activity: android.app.Activity
    private var appEventsLogger: com.facebook.AppEventsLogger
    private val broadcastManager: android.support.v4.content.LocalBroadcastManager
    private val callback: com.facebook.Session.StatusCallback
    private var pendingFacebookDialogCallId: java.util.UUID
    private var pendingFacebookDialogCallStore: com.facebook.internal.PendingCallStore
    private val receiver: android.content.BroadcastReceiver

    public constructor(p0: android.app.Activity, p1: com.facebook.Session.StatusCallback)

    private fun cancelPendingAppCall(p0: com.facebook.widget.FacebookDialog.Callback) { /* TODO(body): (Lcom/facebook/widget/FacebookDialog$Callback;)V */ }
    /*
    //         .locals 6
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/PendingCallStore;->getPendingCallById(Ljava/util/UUID;)Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         if-eqz p1, :cond_2
    //         invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestIntent()Landroid/content/Intent;
    //         move-result-object v1
    //         new-instance v2, Landroid/content/Intent;
    //         invoke-direct {v2}, Landroid/content/Intent;-><init>()V
    //         const-string v3, "com.facebook.platform.protocol.CALL_ID"
    //         const-string v4, "com.facebook.platform.protocol.CALL_ID"
    //         invoke-virtual {v1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v3, "com.facebook.platform.protocol.PROTOCOL_ACTION"
    //         const-string v4, "com.facebook.platform.protocol.PROTOCOL_ACTION"
    //         invoke-virtual {v1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v3, "com.facebook.platform.protocol.PROTOCOL_VERSION"
    //         const-string v4, "com.facebook.platform.protocol.PROTOCOL_VERSION"
    //         const/4 v5, 0x0
    //         invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    //         move-result v1
    //         invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const-string v1, "com.facebook.platform.status.ERROR_TYPE"
    //         const-string v3, "UnknownError"
    //         invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;
    //         invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestCode()I
    //         move-result v3
    //         invoke-static {v1, v0, v3, v2, p1}, Lcom/facebook/widget/FacebookDialog;->handleActivityResult(Landroid/content/Context;Lcom/facebook/widget/FacebookDialog$PendingCall;ILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z
    //         :cond_2
    //         invoke-direct {p0}, Lcom/facebook/UiLifecycleHelper;->stopTrackingPendingAppCall()V
    //         goto :goto_0
    */

    private fun handleFacebookDialogActivityResult(p0: Int, p1: Int, p2: android.content.Intent, p3: com.facebook.widget.FacebookDialog.Callback): Boolean { return TODO("body: (IILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v0, 0x0
    //         iget-object v2, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         if-nez v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v2, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;
    //         iget-object v3, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         invoke-virtual {v2, v3}, Lcom/facebook/internal/PendingCallStore;->getPendingCallById(Ljava/util/UUID;)Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v2}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestCode()I
    //         move-result v3
    //         if-ne v3, p1, :cond_0
    //         if-nez p3, :cond_2
    //         invoke-direct {p0, p4}, Lcom/facebook/UiLifecycleHelper;->cancelPendingAppCall(Lcom/facebook/widget/FacebookDialog$Callback;)V
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         invoke-static {p3}, Lcom/facebook/internal/NativeProtocol;->getCallIdFromIntent(Landroid/content/Intent;)Ljava/util/UUID;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         iget-object v3, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         invoke-virtual {v3, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;
    //         invoke-static {v0, v2, p1, p3, p4}, Lcom/facebook/widget/FacebookDialog;->handleActivityResult(Landroid/content/Context;Lcom/facebook/widget/FacebookDialog$PendingCall;ILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z
    //         :goto_1
    //         invoke-direct {p0}, Lcom/facebook/UiLifecycleHelper;->stopTrackingPendingAppCall()V
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         invoke-direct {p0, p4}, Lcom/facebook/UiLifecycleHelper;->cancelPendingAppCall(Lcom/facebook/widget/FacebookDialog$Callback;)V
    //         goto :goto_1
    */

    private fun stopTrackingPendingAppCall() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/PendingCallStore;->stopTrackingPendingCall(Ljava/util/UUID;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         return-void
    */

    public fun getAppEventsLogger(): com.facebook.AppEventsLogger { return TODO("body: ()Lcom/facebook/AppEventsLogger;") }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         invoke-virtual {v1, v0}, Lcom/facebook/AppEventsLogger;->isValidForSession(Lcom/facebook/Session;)Z
    //         move-result v1
    //         if-nez v1, :cond_3
    //         :cond_1
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         if-eqz v1, :cond_2
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->onContextStop()V
    //         :cond_2
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;
    //         invoke-static {v1, v0}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;Lcom/facebook/Session;)Lcom/facebook/AppEventsLogger;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/UiLifecycleHelper;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         :cond_3
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         goto :goto_0
    */

    public fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, p3, v0}, Lcom/facebook/UiLifecycleHelper;->onActivityResult(IILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)V
    //         return-void
    */

    public fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent, p3: com.facebook.widget.FacebookDialog.Callback) { /* TODO(body): (IILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;
    //         invoke-virtual {v0, v1, p1, p2, p3}, Lcom/facebook/Session;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;
    //         invoke-static {v0, p1, p2, p3}, Lcom/facebook/internal/LikeActionController;->handleOnActivityResult(Landroid/content/Context;IILandroid/content/Intent;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/UiLifecycleHelper;->handleFacebookDialogActivityResult(IILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z
    //         goto :goto_0
    */

    public fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-nez v0, :cond_2
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;
    //         invoke-static {v0, v1, v2, p1}, Lcom/facebook/Session;->restoreSession(Landroid/content/Context;Lcom/facebook/TokenCachingStrategy;Lcom/facebook/Session$StatusCallback;Landroid/os/Bundle;)Lcom/facebook/Session;
    //         move-result-object v0
    //         :cond_0
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/facebook/Session;
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;
    //         invoke-direct {v0, v1}, Lcom/facebook/Session;-><init>(Landroid/content/Context;)V
    //         :cond_1
    //         invoke-static {v0}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V
    //         :cond_2
    //         if-eqz p1, :cond_4
    //         const-string v0, "com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         :cond_3
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;
    //         invoke-virtual {v0, p1}, Lcom/facebook/internal/PendingCallStore;->restoreFromSavedInstanceState(Landroid/os/Bundle;)V
    //         :cond_4
    //         return-void
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->receiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_0
    //         return-void
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V
    //         :cond_0
    //         sget-object v1, Lcom/facebook/SessionState;->CREATED_TOKEN_LOADED:Lcom/facebook/SessionState;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Lcom/facebook/SessionState;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V
    //         :cond_1
    //         new-instance v0, Landroid/content/IntentFilter;
    //         invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
    //         const-string v1, "com.facebook.sdk.ACTIVE_SESSION_SET"
    //         invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         const-string v1, "com.facebook.sdk.ACTIVE_SESSION_UNSET"
    //         invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;
    //         iget-object v2, p0, Lcom/facebook/UiLifecycleHelper;->receiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v1, v2, v0}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    //         return-void
    */

    public fun onSaveInstanceState(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         invoke-static {v0, p1}, Lcom/facebook/Session;->saveSession(Lcom/facebook/Session;Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         if-eqz v0, :cond_0
    //         const-string v0, "com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey"
    //         iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;
    //         invoke-virtual {v0, p1}, Lcom/facebook/internal/PendingCallStore;->saveInstanceState(Landroid/os/Bundle;)V
    //         return-void
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->onContextStop()V
    //         return-void
    */

    public fun trackPendingDialogCall(p0: com.facebook.widget.FacebookDialog.PendingCall) { /* TODO(body): (Lcom/facebook/widget/FacebookDialog$PendingCall;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         if-eqz v0, :cond_0
    //         const-string v0, "Facebook"
    //         const-string v1, "Tracking new app call while one is still pending; canceling pending call."
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/facebook/UiLifecycleHelper;->cancelPendingAppCall(Lcom/facebook/widget/FacebookDialog$Callback;)V
    //         :cond_0
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;
    //         iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;
    //         invoke-virtual {v0, p1}, Lcom/facebook/internal/PendingCallStore;->trackPendingCall(Lcom/facebook/widget/FacebookDialog$PendingCall;)V
    //         :cond_1
    //         return-void
    */

    companion object {
    private val ACTIVITY_NULL_MESSAGE: String = "activity cannot be null"
    private val DIALOG_CALL_ID_SAVE_KEY: String = "com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey"
    }
}
