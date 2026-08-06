.class public Lcom/facebook/UiLifecycleHelper;
.super Ljava/lang/Object;
.source "UiLifecycleHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/UiLifecycleHelper$1;,
        Lcom/facebook/UiLifecycleHelper$ActiveSessionBroadcastReceiver;
    }
.end annotation


# static fields
.field private static final ACTIVITY_NULL_MESSAGE:Ljava/lang/String; = "activity cannot be null"

.field private static final DIALOG_CALL_ID_SAVE_KEY:Ljava/lang/String; = "com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey"


# instance fields
.field private final activity:Landroid/app/Activity;

.field private appEventsLogger:Lcom/facebook/AppEventsLogger;

.field private final broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

.field private final callback:Lcom/facebook/Session$StatusCallback;

.field private pendingFacebookDialogCallId:Ljava/util/UUID;

.field private pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;

.field private final receiver:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/Session$StatusCallback;)V
    .locals 2

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    if-nez p1, :cond_0

    .line 72
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "activity cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_0
    iput-object p1, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;

    .line 76
    iput-object p2, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;

    .line 77
    new-instance v0, Lcom/facebook/UiLifecycleHelper$ActiveSessionBroadcastReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/UiLifecycleHelper$ActiveSessionBroadcastReceiver;-><init>(Lcom/facebook/UiLifecycleHelper;Lcom/facebook/UiLifecycleHelper$1;)V

    iput-object v0, p0, Lcom/facebook/UiLifecycleHelper;->receiver:Landroid/content/BroadcastReceiver;

    .line 78
    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/UiLifecycleHelper;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    .line 79
    invoke-static {}, Lcom/facebook/internal/PendingCallStore;->getInstance()Lcom/facebook/internal/PendingCallStore;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;

    .line 82
    invoke-static {p1}, Lcom/facebook/Settings;->sdkInitialize(Landroid/content/Context;)V

    .line 83
    return-void
.end method

.method static synthetic access$100(Lcom/facebook/UiLifecycleHelper;)Lcom/facebook/Session$StatusCallback;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;

    return-object v0
.end method

.method private cancelPendingAppCall(Lcom/facebook/widget/FacebookDialog$Callback;)V
    .locals 6

    .prologue
    .line 314
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    if-nez v0, :cond_1

    .line 341
    :cond_0
    :goto_0
    return-void

    .line 318
    :cond_1
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;

    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Lcom/facebook/internal/PendingCallStore;->getPendingCallById(Ljava/util/UUID;)Lcom/facebook/widget/FacebookDialog$PendingCall;

    move-result-object v0

    .line 320
    if-eqz v0, :cond_0

    .line 324
    if-eqz p1, :cond_2

    .line 325
    invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestIntent()Landroid/content/Intent;

    move-result-object v1

    .line 327
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 328
    const-string v3, "com.facebook.platform.protocol.CALL_ID"

    const-string v4, "com.facebook.platform.protocol.CALL_ID"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 330
    const-string v3, "com.facebook.platform.protocol.PROTOCOL_ACTION"

    const-string v4, "com.facebook.platform.protocol.PROTOCOL_ACTION"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 332
    const-string v3, "com.facebook.platform.protocol.PROTOCOL_VERSION"

    const-string v4, "com.facebook.platform.protocol.PROTOCOL_VERSION"

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 334
    const-string v1, "com.facebook.platform.status.ERROR_TYPE"

    const-string v3, "UnknownError"

    invoke-virtual {v2, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 336
    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestCode()I

    move-result v3

    invoke-static {v1, v0, v3, v2, p1}, Lcom/facebook/widget/FacebookDialog;->handleActivityResult(Landroid/content/Context;Lcom/facebook/widget/FacebookDialog$PendingCall;ILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z

    .line 340
    :cond_2
    invoke-direct {p0}, Lcom/facebook/UiLifecycleHelper;->stopTrackingPendingAppCall()V

    goto :goto_0
.end method

.method private handleFacebookDialogActivityResult(IILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 280
    iget-object v2, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    if-nez v2, :cond_1

    .line 310
    :cond_0
    :goto_0
    return v0

    .line 283
    :cond_1
    iget-object v2, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;

    iget-object v3, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    invoke-virtual {v2, v3}, Lcom/facebook/internal/PendingCallStore;->getPendingCallById(Ljava/util/UUID;)Lcom/facebook/widget/FacebookDialog$PendingCall;

    move-result-object v2

    .line 285
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getRequestCode()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 289
    if-nez p3, :cond_2

    .line 292
    invoke-direct {p0, p4}, Lcom/facebook/UiLifecycleHelper;->cancelPendingAppCall(Lcom/facebook/widget/FacebookDialog$Callback;)V

    move v0, v1

    .line 293
    goto :goto_0

    .line 296
    :cond_2
    invoke-static {p3}, Lcom/facebook/internal/NativeProtocol;->getCallIdFromIntent(Landroid/content/Intent;)Ljava/util/UUID;

    move-result-object v0

    .line 299
    if-eqz v0, :cond_3

    iget-object v3, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    invoke-virtual {v3, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 301
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;

    invoke-static {v0, v2, p1, p3, p4}, Lcom/facebook/widget/FacebookDialog;->handleActivityResult(Landroid/content/Context;Lcom/facebook/widget/FacebookDialog$PendingCall;ILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z

    .line 309
    :goto_1
    invoke-direct {p0}, Lcom/facebook/UiLifecycleHelper;->stopTrackingPendingAppCall()V

    move v0, v1

    .line 310
    goto :goto_0

    .line 306
    :cond_3
    invoke-direct {p0, p4}, Lcom/facebook/UiLifecycleHelper;->cancelPendingAppCall(Lcom/facebook/widget/FacebookDialog$Callback;)V

    goto :goto_1
.end method

.method private stopTrackingPendingAppCall()V
    .locals 2

    .prologue
    .line 344
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;

    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Lcom/facebook/internal/PendingCallStore;->stopTrackingPendingCall(Ljava/util/UUID;)V

    .line 345
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    .line 346
    return-void
.end method


# virtual methods
.method public getAppEventsLogger()Lcom/facebook/AppEventsLogger;
    .locals 2

    .prologue
    .line 240
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    .line 241
    if-nez v0, :cond_0

    .line 242
    const/4 v0, 0x0

    .line 254
    :goto_0
    return-object v0

    .line 245
    :cond_0
    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    invoke-virtual {v1, v0}, Lcom/facebook/AppEventsLogger;->isValidForSession(Lcom/facebook/Session;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 246
    :cond_1
    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    if-eqz v1, :cond_2

    .line 249
    invoke-static {}, Lcom/facebook/AppEventsLogger;->onContextStop()V

    .line 251
    :cond_2
    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;

    invoke-static {v1, v0}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;Lcom/facebook/Session;)Lcom/facebook/AppEventsLogger;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/UiLifecycleHelper;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    .line 254
    :cond_3
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 142
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/facebook/UiLifecycleHelper;->onActivityResult(IILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)V

    .line 143
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)V
    .locals 2

    .prologue
    .line 156
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    .line 157
    if-eqz v0, :cond_0

    .line 158
    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/facebook/Session;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;

    invoke-static {v0, p1, p2, p3}, Lcom/facebook/internal/LikeActionController;->handleOnActivityResult(Landroid/content/Context;IILandroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    :goto_0
    return-void

    .line 165
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/UiLifecycleHelper;->handleFacebookDialogActivityResult(IILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 91
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    .line 92
    if-nez v0, :cond_2

    .line 93
    if-eqz p1, :cond_0

    .line 94
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;

    invoke-static {v0, v1, v2, p1}, Lcom/facebook/Session;->restoreSession(Landroid/content/Context;Lcom/facebook/TokenCachingStrategy;Lcom/facebook/Session$StatusCallback;Landroid/os/Bundle;)Lcom/facebook/Session;

    move-result-object v0

    .line 96
    :cond_0
    if-nez v0, :cond_1

    .line 97
    new-instance v0, Lcom/facebook/Session;

    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/facebook/Session;-><init>(Landroid/content/Context;)V

    .line 99
    :cond_1
    invoke-static {v0}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V

    .line 101
    :cond_2
    if-eqz p1, :cond_4

    .line 102
    const-string v0, "com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    .line 106
    :cond_3
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;

    invoke-virtual {v0, p1}, Lcom/facebook/internal/PendingCallStore;->restoreFromSavedInstanceState(Landroid/os/Bundle;)V

    .line 108
    :cond_4
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 207
    return-void
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 186
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->receiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 188
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;

    if-eqz v0, :cond_0

    .line 189
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    .line 190
    if-eqz v0, :cond_0

    .line 191
    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->removeCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 194
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 3

    .prologue
    .line 114
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    .line 115
    if-eqz v0, :cond_1

    .line 116
    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;

    if-eqz v1, :cond_0

    .line 117
    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->callback:Lcom/facebook/Session$StatusCallback;

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->addCallback(Lcom/facebook/Session$StatusCallback;)V

    .line 119
    :cond_0
    sget-object v1, Lcom/facebook/SessionState;->CREATED_TOKEN_LOADED:Lcom/facebook/SessionState;

    invoke-virtual {v0}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/SessionState;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 120
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V

    .line 125
    :cond_1
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 126
    const-string v1, "com.facebook.sdk.ACTIVE_SESSION_SET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 127
    const-string v1, "com.facebook.sdk.ACTIVE_SESSION_UNSET"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 131
    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->broadcastManager:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v2, p0, Lcom/facebook/UiLifecycleHelper;->receiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 132
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 174
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/facebook/Session;->saveSession(Lcom/facebook/Session;Landroid/os/Bundle;)V

    .line 175
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    if-eqz v0, :cond_0

    .line 176
    const-string v0, "com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey"

    iget-object v1, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    :cond_0
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;

    invoke-virtual {v0, p1}, Lcom/facebook/internal/PendingCallStore;->saveInstanceState(Landroid/os/Bundle;)V

    .line 179
    return-void
.end method

.method public onStop()V
    .locals 0

    .prologue
    .line 200
    invoke-static {}, Lcom/facebook/AppEventsLogger;->onContextStop()V

    .line 201
    return-void
.end method

.method public trackPendingDialogCall(Lcom/facebook/widget/FacebookDialog$PendingCall;)V
    .locals 2

    .prologue
    .line 217
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    if-eqz v0, :cond_0

    .line 219
    const-string v0, "Facebook"

    const-string v1, "Tracking new app call while one is still pending; canceling pending call."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/UiLifecycleHelper;->cancelPendingAppCall(Lcom/facebook/widget/FacebookDialog$Callback;)V

    .line 222
    :cond_0
    if-eqz p1, :cond_1

    .line 223
    invoke-virtual {p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallId:Ljava/util/UUID;

    .line 224
    iget-object v0, p0, Lcom/facebook/UiLifecycleHelper;->pendingFacebookDialogCallStore:Lcom/facebook/internal/PendingCallStore;

    invoke-virtual {v0, p1}, Lcom/facebook/internal/PendingCallStore;->trackPendingCall(Lcom/facebook/widget/FacebookDialog$PendingCall;)V

    .line 226
    :cond_1
    return-void
.end method
