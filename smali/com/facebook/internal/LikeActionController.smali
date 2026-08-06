.class public Lcom/facebook/internal/LikeActionController;
.super Ljava/lang/Object;
.source "LikeActionController.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;,
        Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;,
        Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;,
        Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;,
        Lcom/facebook/internal/LikeActionController$LikeDialogFeature;,
        Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;,
        Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;,
        Lcom/facebook/internal/LikeActionController$CreationCallback;
    }
.end annotation


# static fields
.field public static final ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR:Ljava/lang/String; = "com.facebook.sdk.LikeActionController.DID_ERROR"

.field public static final ACTION_LIKE_ACTION_CONTROLLER_DID_RESET:Ljava/lang/String; = "com.facebook.sdk.LikeActionController.DID_RESET"

.field public static final ACTION_LIKE_ACTION_CONTROLLER_UPDATED:Ljava/lang/String; = "com.facebook.sdk.LikeActionController.UPDATED"

.field public static final ACTION_OBJECT_ID_KEY:Ljava/lang/String; = "com.facebook.sdk.LikeActionController.OBJECT_ID"

.field private static final ERROR_CODE_OBJECT_ALREADY_LIKED:I = 0xdad

.field public static final ERROR_INVALID_OBJECT_ID:Ljava/lang/String; = "Invalid Object Id"

.field private static final JSON_BOOL_IS_OBJECT_LIKED_KEY:Ljava/lang/String; = "is_object_liked"

.field private static final JSON_BUNDLE_PENDING_CALL_ANALYTICS_BUNDLE:Ljava/lang/String; = "pending_call_analytics_bundle"

.field private static final JSON_INT_VERSION_KEY:Ljava/lang/String; = "com.facebook.internal.LikeActionController.version"

.field private static final JSON_STRING_LIKE_COUNT_WITHOUT_LIKE_KEY:Ljava/lang/String; = "like_count_string_without_like"

.field private static final JSON_STRING_LIKE_COUNT_WITH_LIKE_KEY:Ljava/lang/String; = "like_count_string_with_like"

.field private static final JSON_STRING_OBJECT_ID_KEY:Ljava/lang/String; = "object_id"

.field private static final JSON_STRING_PENDING_CALL_ID_KEY:Ljava/lang/String; = "pending_call_id"

.field private static final JSON_STRING_SOCIAL_SENTENCE_WITHOUT_LIKE_KEY:Ljava/lang/String; = "social_sentence_without_like"

.field private static final JSON_STRING_SOCIAL_SENTENCE_WITH_LIKE_KEY:Ljava/lang/String; = "social_sentence_with_like"

.field private static final JSON_STRING_UNLIKE_TOKEN_KEY:Ljava/lang/String; = "unlike_token"

.field private static final LIKE_ACTION_CONTROLLER_STORE:Ljava/lang/String; = "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

.field private static final LIKE_ACTION_CONTROLLER_STORE_OBJECT_SUFFIX_KEY:Ljava/lang/String; = "OBJECT_SUFFIX"

.field private static final LIKE_ACTION_CONTROLLER_STORE_PENDING_OBJECT_ID_KEY:Ljava/lang/String; = "PENDING_CONTROLLER_KEY"

.field private static final LIKE_ACTION_CONTROLLER_VERSION:I = 0x2

.field private static final LIKE_DIALOG_RESPONSE_LIKE_COUNT_STRING_KEY:Ljava/lang/String; = "like_count_string"

.field private static final LIKE_DIALOG_RESPONSE_OBJECT_IS_LIKED_KEY:Ljava/lang/String; = "object_is_liked"

.field private static final LIKE_DIALOG_RESPONSE_SOCIAL_SENTENCE_KEY:Ljava/lang/String; = "social_sentence"

.field private static final LIKE_DIALOG_RESPONSE_UNLIKE_TOKEN_KEY:Ljava/lang/String; = "unlike_token"

.field private static final MAX_CACHE_SIZE:I = 0x80

.field private static final MAX_OBJECT_SUFFIX:I = 0x3e8

.field private static final TAG:Ljava/lang/String;

.field private static final cache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/internal/LikeActionController;",
            ">;"
        }
    .end annotation
.end field

.field private static controllerDiskCache:Lcom/facebook/internal/FileLruCache;

.field private static diskIOWorkQueue:Lcom/facebook/internal/WorkQueue;

.field private static handler:Landroid/os/Handler;

.field private static isInitialized:Z

.field private static isPendingBroadcastReset:Z

.field private static mruCacheWorkQueue:Lcom/facebook/internal/WorkQueue;

.field private static objectIdForPendingController:Ljava/lang/String;

.field private static volatile objectSuffix:I


# instance fields
.field private appEventsLogger:Lcom/facebook/AppEventsLogger;

.field private context:Landroid/content/Context;

.field private isObjectLiked:Z

.field private isObjectLikedOnServer:Z

.field private isPendingLikeOrUnlike:Z

.field private likeCountStringWithLike:Ljava/lang/String;

.field private likeCountStringWithoutLike:Ljava/lang/String;

.field private objectId:Ljava/lang/String;

.field private objectIsPage:Z

.field private pendingCallAnalyticsBundle:Landroid/os/Bundle;

.field private pendingCallId:Ljava/util/UUID;

.field private session:Lcom/facebook/Session;

.field private socialSentenceWithLike:Ljava/lang/String;

.field private socialSentenceWithoutLike:Ljava/lang/String;

.field private unlikeToken:Ljava/lang/String;

.field private verifiedObjectId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 55
    const-class v0, Lcom/facebook/internal/LikeActionController;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    .line 86
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/facebook/internal/LikeActionController;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 88
    new-instance v0, Lcom/facebook/internal/WorkQueue;

    invoke-direct {v0, v1}, Lcom/facebook/internal/WorkQueue;-><init>(I)V

    sput-object v0, Lcom/facebook/internal/LikeActionController;->mruCacheWorkQueue:Lcom/facebook/internal/WorkQueue;

    .line 89
    new-instance v0, Lcom/facebook/internal/WorkQueue;

    invoke-direct {v0, v1}, Lcom/facebook/internal/WorkQueue;-><init>(I)V

    sput-object v0, Lcom/facebook/internal/LikeActionController;->diskIOWorkQueue:Lcom/facebook/internal/WorkQueue;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/facebook/Session;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 518
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 519
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    .line 520
    iput-object p2, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    .line 521
    iput-object p3, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    .line 523
    invoke-static {p1, p2}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;Lcom/facebook/Session;)Lcom/facebook/AppEventsLogger;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    .line 524
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/internal/LikeActionController;IILandroid/content/Intent;Ljava/util/UUID;)Z
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/internal/LikeActionController;->onActivityResult(IILandroid/content/Intent;Ljava/util/UUID;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/facebook/internal/LikeActionController;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->refreshStatusAsync()V

    return-void
.end method

.method static synthetic access$1000(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1202(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1300(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/AppEventsLogger;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/facebook/internal/LikeActionController;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct/range {p0 .. p6}, Lcom/facebook/internal/LikeActionController;->updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1500()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1600(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->logAppEventForError(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$1700(Lcom/facebook/internal/LikeActionController;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$1800(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 45
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/internal/LikeActionController;->broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1902(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$200()Z
    .locals 1

    .prologue
    .line 45
    sget-boolean v0, Lcom/facebook/internal/LikeActionController;->isPendingBroadcastReset:Z

    return v0
.end method

.method static synthetic access$2002(Lcom/facebook/internal/LikeActionController;Z)Z
    .locals 0

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z

    return p1
.end method

.method static synthetic access$202(Z)Z
    .locals 0

    .prologue
    .line 45
    sput-boolean p0, Lcom/facebook/internal/LikeActionController;->isPendingBroadcastReset:Z

    return p0
.end method

.method static synthetic access$2100(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;Z)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/internal/LikeActionController;->fallbackToDialog(Landroid/app/Activity;Landroid/os/Bundle;Z)V

    return-void
.end method

.method static synthetic access$2202(Lcom/facebook/internal/LikeActionController;Z)Z
    .locals 0

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/facebook/internal/LikeActionController;->isObjectLikedOnServer:Z

    return p1
.end method

.method static synthetic access$2300(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->toggleAgainIfNeeded(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$2400(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2502(Lcom/facebook/internal/LikeActionController;Z)Z
    .locals 0

    .prologue
    .line 45
    iput-boolean p1, p0, Lcom/facebook/internal/LikeActionController;->objectIsPage:Z

    return p1
.end method

.method static synthetic access$2600(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->logAppEventForError(Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V

    return-void
.end method

.method static synthetic access$2700(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/Session;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    return-object v0
.end method

.method static synthetic access$2800(Lcom/facebook/internal/LikeActionController;)Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    return v0
.end method

.method static synthetic access$2900(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 45
    invoke-static {p0, p1}, Lcom/facebook/internal/LikeActionController;->serializeToDiskSynchronously(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300()I
    .locals 1

    .prologue
    .line 45
    sget v0, Lcom/facebook/internal/LikeActionController;->objectSuffix:I

    return v0
.end method

.method static synthetic access$3000(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V
    .locals 0

    .prologue
    .line 45
    invoke-static {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->createControllerForObjectId(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V

    return-void
.end method

.method static synthetic access$302(I)I
    .locals 0

    .prologue
    .line 45
    sput p0, Lcom/facebook/internal/LikeActionController;->objectSuffix:I

    return p0
.end method

.method static synthetic access$400()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lcom/facebook/internal/LikeActionController;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method static synthetic access$500()Lcom/facebook/internal/FileLruCache;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lcom/facebook/internal/LikeActionController;->controllerDiskCache:Lcom/facebook/internal/FileLruCache;

    return-object v0
.end method

.method static synthetic access$600(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 45
    invoke-static {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$700()Landroid/os/Handler;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lcom/facebook/internal/LikeActionController;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$800(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    return-object v0
.end method

.method private static broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 496
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/facebook/internal/LikeActionController;->broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 497
    return-void
.end method

.method private static broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 500
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 501
    if-eqz p1, :cond_1

    .line 502
    if-nez p3, :cond_0

    .line 503
    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 506
    :cond_0
    const-string v1, "com.facebook.sdk.LikeActionController.OBJECT_ID"

    invoke-virtual {p1}, Lcom/facebook/internal/LikeActionController;->getObjectId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    :cond_1
    if-eqz p3, :cond_2

    .line 510
    invoke-virtual {v0, p3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 512
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 513
    return-void
.end method

.method private canUseOGPublish()Z
    .locals 2

    .prologue
    .line 798
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->objectIsPage:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;

    move-result-object v0

    const-string v1, "publish_actions"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static createControllerForObjectId(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V
    .locals 3

    .prologue
    .line 201
    invoke-static {p1}, Lcom/facebook/internal/LikeActionController;->getControllerFromInMemoryCache(Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;

    move-result-object v0

    .line 202
    if-eqz v0, :cond_0

    .line 204
    invoke-static {p2, v0}, Lcom/facebook/internal/LikeActionController;->invokeCallbackWithController(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V

    .line 229
    :goto_0
    return-void

    .line 209
    :cond_0
    invoke-static {p0, p1}, Lcom/facebook/internal/LikeActionController;->deserializeFromDiskSynchronously(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;

    move-result-object v0

    .line 211
    if-nez v0, :cond_1

    .line 212
    new-instance v0, Lcom/facebook/internal/LikeActionController;

    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/facebook/internal/LikeActionController;-><init>(Landroid/content/Context;Lcom/facebook/Session;Ljava/lang/String;)V

    .line 213
    invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->serializeToDiskAsync(Lcom/facebook/internal/LikeActionController;)V

    .line 217
    :cond_1
    invoke-static {p1, v0}, Lcom/facebook/internal/LikeActionController;->putControllerInMemoryCache(Ljava/lang/String;Lcom/facebook/internal/LikeActionController;)V

    .line 221
    sget-object v1, Lcom/facebook/internal/LikeActionController;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/facebook/internal/LikeActionController$2;

    invoke-direct {v2, v0}, Lcom/facebook/internal/LikeActionController$2;-><init>(Lcom/facebook/internal/LikeActionController;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 228
    invoke-static {p2, v0}, Lcom/facebook/internal/LikeActionController;->invokeCallbackWithController(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V

    goto :goto_0
.end method

.method private static deserializeFromDiskSynchronously(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 380
    .line 384
    :try_start_0
    invoke-static {p1}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 385
    sget-object v2, Lcom/facebook/internal/LikeActionController;->controllerDiskCache:Lcom/facebook/internal/FileLruCache;

    invoke-virtual {v2, v1}, Lcom/facebook/internal/FileLruCache;->get(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 386
    if-eqz v2, :cond_0

    .line 387
    :try_start_1
    invoke-static {v2}, Lcom/facebook/internal/Utility;->readStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    .line 388
    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 389
    invoke-static {p0, v1}, Lcom/facebook/internal/LikeActionController;->deserializeFromJson(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 396
    :cond_0
    if-eqz v2, :cond_1

    .line 397
    invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 401
    :cond_1
    :goto_0
    return-object v0

    .line 392
    :catch_0
    move-exception v1

    move-object v2, v0

    .line 393
    :goto_1
    :try_start_2
    sget-object v3, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    const-string v4, "Unable to deserialize controller from disk"

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 396
    if-eqz v2, :cond_1

    .line 397
    invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 396
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_2
    if-eqz v2, :cond_2

    .line 397
    invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    :cond_2
    throw v0

    .line 396
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 392
    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method private static deserializeFromJson(Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 408
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 409
    const-string v0, "com.facebook.internal.LikeActionController.version"

    const/4 v3, -0x1

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 410
    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    .line 441
    :goto_0
    return-object v1

    .line 415
    :cond_0
    new-instance v0, Lcom/facebook/internal/LikeActionController;

    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v3

    const-string v4, "object_id"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, p0, v3, v4}, Lcom/facebook/internal/LikeActionController;-><init>(Landroid/content/Context;Lcom/facebook/Session;Ljava/lang/String;)V

    .line 421
    const-string v3, "like_count_string_with_like"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    .line 422
    const-string v3, "like_count_string_without_like"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    .line 423
    const-string v3, "social_sentence_with_like"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    .line 424
    const-string v3, "social_sentence_without_like"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    .line 425
    const-string v3, "is_object_liked"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, v0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    .line 426
    const-string v3, "unlike_token"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    .line 427
    const-string v3, "pending_call_id"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 428
    invoke-static {v3}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 429
    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v3

    iput-object v3, v0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    .line 432
    :cond_1
    const-string v3, "pending_call_analytics_bundle"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 433
    if-eqz v2, :cond_2

    .line 434
    invoke-static {v2}, Lcom/facebook/internal/BundleJSONConverter;->convertToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v2

    iput-object v2, v0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    move-object v1, v0

    .line 441
    goto :goto_0

    .line 436
    :catch_0
    move-exception v0

    .line 437
    sget-object v2, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    const-string v3, "Unable to deserialize controller from JSON"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v1

    .line 438
    goto :goto_1
.end method

.method private fallbackToDialog(Landroid/app/Activity;Landroid/os/Bundle;Z)V
    .locals 7

    .prologue
    .line 610
    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    iget-object v5, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    iget-object v6, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    move-object v0, p0

    move v1, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/internal/LikeActionController;->updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 618
    invoke-direct {p0, p1, p2}, Lcom/facebook/internal/LikeActionController;->presentLikeDialog(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 619
    return-void
.end method

.method private fetchVerifiedObjectId(Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V
    .locals 4

    .prologue
    .line 1002
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->verifiedObjectId:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1003
    if-eqz p1, :cond_0

    .line 1004
    invoke-interface {p1}, Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;->onComplete()V

    .line 1041
    :cond_0
    :goto_0
    return-void

    .line 1010
    :cond_1
    new-instance v0, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-direct {v0, p0, v1}, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 1011
    new-instance v1, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-direct {v1, p0, v2}, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 1013
    new-instance v2, Lcom/facebook/RequestBatch;

    invoke-direct {v2}, Lcom/facebook/RequestBatch;-><init>()V

    .line 1014
    invoke-virtual {v0, v2}, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V

    .line 1015
    invoke-virtual {v1, v2}, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V

    .line 1017
    new-instance v3, Lcom/facebook/internal/LikeActionController$10;

    invoke-direct {v3, p0, v0, v1, p1}, Lcom/facebook/internal/LikeActionController$10;-><init>(Lcom/facebook/internal/LikeActionController;Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V

    invoke-virtual {v2, v3}, Lcom/facebook/RequestBatch;->addCallback(Lcom/facebook/RequestBatch$Callback;)V

    .line 1040
    invoke-virtual {v2}, Lcom/facebook/RequestBatch;->executeAsync()Lcom/facebook/RequestAsyncTask;

    goto :goto_0
.end method

.method private static getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 473
    const/4 v0, 0x0

    .line 474
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v1

    .line 475
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/facebook/Session;->isOpened()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 476
    invoke-virtual {v1}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    .line 478
    :cond_0
    if-eqz v0, :cond_1

    .line 482
    invoke-static {v0}, Lcom/facebook/internal/Utility;->md5hash(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 484
    :cond_1
    const-string v1, "%s|%s|com.fb.sdk.like|%d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 v3, 0x1

    const-string v4, ""

    invoke-static {v0, v4}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    const/4 v0, 0x2

    sget v3, Lcom/facebook/internal/LikeActionController;->objectSuffix:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getControllerForObjectId(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V
    .locals 2

    .prologue
    .line 176
    sget-boolean v0, Lcom/facebook/internal/LikeActionController;->isInitialized:Z

    if-nez v0, :cond_0

    .line 177
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->performFirstInitialize(Landroid/content/Context;)V

    .line 180
    :cond_0
    invoke-static {p1}, Lcom/facebook/internal/LikeActionController;->getControllerFromInMemoryCache(Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;

    move-result-object v0

    .line 181
    if-eqz v0, :cond_1

    .line 183
    invoke-static {p2, v0}, Lcom/facebook/internal/LikeActionController;->invokeCallbackWithController(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V

    .line 187
    :goto_0
    return-void

    .line 185
    :cond_1
    sget-object v0, Lcom/facebook/internal/LikeActionController;->diskIOWorkQueue:Lcom/facebook/internal/WorkQueue;

    new-instance v1, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/internal/LikeActionController$CreateLikeActionControllerWorkItem;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V

    invoke-virtual {v0, v1}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;

    goto :goto_0
.end method

.method private static getControllerFromInMemoryCache(Ljava/lang/String;)Lcom/facebook/internal/LikeActionController;
    .locals 5

    .prologue
    .line 331
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 333
    sget-object v0, Lcom/facebook/internal/LikeActionController;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/internal/LikeActionController;

    .line 334
    if-eqz v0, :cond_0

    .line 336
    sget-object v2, Lcom/facebook/internal/LikeActionController;->mruCacheWorkQueue:Lcom/facebook/internal/WorkQueue;

    new-instance v3, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v2, v3}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;

    .line 339
    :cond_0
    return-object v0
.end method

.method private getFacebookDialogCallback(Landroid/os/Bundle;)Lcom/facebook/widget/FacebookDialog$Callback;
    .locals 1

    .prologue
    .line 707
    new-instance v0, Lcom/facebook/internal/LikeActionController$5;

    invoke-direct {v0, p0, p1}, Lcom/facebook/internal/LikeActionController$5;-><init>(Lcom/facebook/internal/LikeActionController;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static handleOnActivityResult(Landroid/content/Context;IILandroid/content/Intent;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 132
    invoke-static {p3}, Lcom/facebook/internal/NativeProtocol;->getCallIdFromIntent(Landroid/content/Intent;)Ljava/util/UUID;

    move-result-object v1

    .line 133
    if-nez v1, :cond_1

    .line 163
    :cond_0
    :goto_0
    return v0

    .line 138
    :cond_1
    sget-object v2, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    invoke-static {v2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 139
    const-string v2, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 143
    const-string v3, "PENDING_CONTROLLER_KEY"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    .line 148
    :cond_2
    sget-object v2, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    invoke-static {v2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 153
    sget-object v0, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    new-instance v2, Lcom/facebook/internal/LikeActionController$1;

    invoke-direct {v2, p1, p2, p3, v1}, Lcom/facebook/internal/LikeActionController$1;-><init>(IILandroid/content/Intent;Ljava/util/UUID;)V

    invoke-static {p0, v0, v2}, Lcom/facebook/internal/LikeActionController;->getControllerForObjectId(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V

    .line 163
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static invokeCallbackWithController(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V
    .locals 2

    .prologue
    .line 251
    if-nez p0, :cond_0

    .line 261
    :goto_0
    return-void

    .line 255
    :cond_0
    sget-object v0, Lcom/facebook/internal/LikeActionController;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/internal/LikeActionController$3;

    invoke-direct {v1, p0, p1}, Lcom/facebook/internal/LikeActionController$3;-><init>(Lcom/facebook/internal/LikeActionController$CreationCallback;Lcom/facebook/internal/LikeActionController;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method private logAppEventForError(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 1044
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 1045
    const-string v1, "object_id"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1046
    const-string v1, "current_action"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1048
    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    const-string v2, "fb_like_control_error"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 1049
    return-void
.end method

.method private logAppEventForError(Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V
    .locals 3

    .prologue
    .line 1052
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1053
    if-eqz p2, :cond_0

    .line 1054
    invoke-virtual {p2}, Lcom/facebook/FacebookRequestError;->getRequestResult()Lorg/json/JSONObject;

    move-result-object v1

    .line 1055
    if-eqz v1, :cond_0

    .line 1056
    const-string v2, "error"

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1059
    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/facebook/internal/LikeActionController;->logAppEventForError(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1060
    return-void
.end method

.method private onActivityResult(IILandroid/content/Intent;Ljava/util/UUID;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 681
    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    invoke-virtual {v1, p4}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 703
    :cond_0
    :goto_0
    return v0

    .line 686
    :cond_1
    invoke-static {}, Lcom/facebook/internal/PendingCallStore;->getInstance()Lcom/facebook/internal/PendingCallStore;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Lcom/facebook/internal/PendingCallStore;->getPendingCallById(Ljava/util/UUID;)Lcom/facebook/widget/FacebookDialog$PendingCall;

    move-result-object v1

    .line 687
    if-eqz v1, :cond_0

    .line 692
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;

    invoke-direct {p0, v2}, Lcom/facebook/internal/LikeActionController;->getFacebookDialogCallback(Landroid/os/Bundle;)Lcom/facebook/widget/FacebookDialog$Callback;

    move-result-object v2

    invoke-static {v0, v1, p1, p3, v2}, Lcom/facebook/widget/FacebookDialog;->handleActivityResult(Landroid/content/Context;Lcom/facebook/widget/FacebookDialog$PendingCall;ILandroid/content/Intent;Lcom/facebook/widget/FacebookDialog$Callback;)Z

    .line 701
    invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->stopTrackingPendingCall()V

    .line 703
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static declared-synchronized performFirstInitialize(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 232
    const-class v1, Lcom/facebook/internal/LikeActionController;

    monitor-enter v1

    :try_start_0
    sget-boolean v0, Lcom/facebook/internal/LikeActionController;->isInitialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 248
    :goto_0
    monitor-exit v1

    return-void

    .line 236
    :cond_0
    :try_start_1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/facebook/internal/LikeActionController;->handler:Landroid/os/Handler;

    .line 238
    const-string v0, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 242
    const-string v2, "OBJECT_SUFFIX"

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/facebook/internal/LikeActionController;->objectSuffix:I

    .line 243
    new-instance v0, Lcom/facebook/internal/FileLruCache;

    sget-object v2, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    new-instance v3, Lcom/facebook/internal/FileLruCache$Limits;

    invoke-direct {v3}, Lcom/facebook/internal/FileLruCache$Limits;-><init>()V

    invoke-direct {v0, p0, v2, v3}, Lcom/facebook/internal/FileLruCache;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/FileLruCache$Limits;)V

    sput-object v0, Lcom/facebook/internal/LikeActionController;->controllerDiskCache:Lcom/facebook/internal/FileLruCache;

    .line 245
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->registerSessionBroadcastReceivers(Landroid/content/Context;)V

    .line 247
    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/internal/LikeActionController;->isInitialized:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 232
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private performLikeOrUnlike(Landroid/app/Activity;ZLandroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 586
    invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->canUseOGPublish()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 587
    if-eqz p2, :cond_0

    .line 588
    invoke-direct {p0, p1, p3}, Lcom/facebook/internal/LikeActionController;->publishLikeAsync(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 600
    :goto_0
    return-void

    .line 590
    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 591
    invoke-direct {p0, p1, p3}, Lcom/facebook/internal/LikeActionController;->publishUnlikeAsync(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0

    .line 594
    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, p1, p3, v0}, Lcom/facebook/internal/LikeActionController;->fallbackToDialog(Landroid/app/Activity;Landroid/os/Bundle;Z)V

    goto :goto_0

    .line 598
    :cond_2
    invoke-direct {p0, p1, p3}, Lcom/facebook/internal/LikeActionController;->presentLikeDialog(Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method private presentLikeDialog(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 658
    new-instance v0, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    .line 660
    invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->canPresent()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 661
    invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->build()Lcom/facebook/widget/FacebookDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog;->present()Lcom/facebook/widget/FacebookDialog$PendingCall;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/facebook/internal/LikeActionController;->trackPendingCall(Lcom/facebook/widget/FacebookDialog$PendingCall;Landroid/os/Bundle;)V

    .line 662
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    const-string v1, "fb_like_control_did_present_dialog"

    invoke-virtual {v0, v1, v4, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 678
    :cond_0
    :goto_0
    return-void

    .line 664
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->getWebFallbackUrl()Ljava/lang/String;

    move-result-object v1

    .line 665
    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 666
    invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->getApplicationId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->getAppCall()Lcom/facebook/widget/FacebookDialog$PendingCall;

    move-result-object v0

    invoke-direct {p0, p2}, Lcom/facebook/internal/LikeActionController;->getFacebookDialogCallback(Landroid/os/Bundle;)Lcom/facebook/widget/FacebookDialog$Callback;

    move-result-object v3

    invoke-static {p1, v1, v2, v0, v3}, Lcom/facebook/internal/FacebookWebFallbackDialog;->presentWebFallback(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/widget/FacebookDialog$PendingCall;Lcom/facebook/widget/FacebookDialog$Callback;)Z

    move-result v0

    .line 672
    if-eqz v0, :cond_0

    .line 673
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    const-string v1, "fb_like_control_did_present_fallback_dialog"

    invoke-virtual {v0, v1, v4, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method private publishLikeAsync(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 806
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z

    .line 808
    new-instance v0, Lcom/facebook/internal/LikeActionController$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/internal/LikeActionController$6;-><init>(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V

    invoke-direct {p0, v0}, Lcom/facebook/internal/LikeActionController;->fetchVerifiedObjectId(Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V

    .line 849
    return-void
.end method

.method private publishUnlikeAsync(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 852
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z

    .line 855
    new-instance v0, Lcom/facebook/RequestBatch;

    invoke-direct {v0}, Lcom/facebook/RequestBatch;-><init>()V

    .line 856
    new-instance v1, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    invoke-direct {v1, p0, v2}, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 857
    invoke-virtual {v1, v0}, Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V

    .line 858
    new-instance v2, Lcom/facebook/internal/LikeActionController$7;

    invoke-direct {v2, p0, v1, p1, p2}, Lcom/facebook/internal/LikeActionController$7;-><init>(Lcom/facebook/internal/LikeActionController;Lcom/facebook/internal/LikeActionController$PublishUnlikeRequestWrapper;Landroid/app/Activity;Landroid/os/Bundle;)V

    invoke-virtual {v0, v2}, Lcom/facebook/RequestBatch;->addCallback(Lcom/facebook/RequestBatch$Callback;)V

    .line 880
    invoke-virtual {v0}, Lcom/facebook/RequestBatch;->executeAsync()Lcom/facebook/RequestAsyncTask;

    .line 881
    return-void
.end method

.method private static putControllerInMemoryCache(Ljava/lang/String;Lcom/facebook/internal/LikeActionController;)V
    .locals 4

    .prologue
    .line 323
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 325
    sget-object v1, Lcom/facebook/internal/LikeActionController;->mruCacheWorkQueue:Lcom/facebook/internal/WorkQueue;

    new-instance v2, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lcom/facebook/internal/LikeActionController$MRUCacheWorkItem;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v1, v2}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;

    .line 327
    sget-object v1, Lcom/facebook/internal/LikeActionController;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    return-void
.end method

.method private refreshStatusAsync()V
    .locals 2

    .prologue
    .line 884
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    invoke-virtual {v0}, Lcom/facebook/Session;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/SessionState;->CREATED:Lcom/facebook/SessionState;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    invoke-virtual {v1}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/SessionState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 888
    :cond_0
    invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->refreshStatusViaService()V

    .line 936
    :cond_1
    :goto_0
    return-void

    .line 890
    :cond_2
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->session:Lcom/facebook/Session;

    invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 898
    new-instance v0, Lcom/facebook/internal/LikeActionController$8;

    invoke-direct {v0, p0}, Lcom/facebook/internal/LikeActionController$8;-><init>(Lcom/facebook/internal/LikeActionController;)V

    invoke-direct {p0, v0}, Lcom/facebook/internal/LikeActionController;->fetchVerifiedObjectId(Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V

    goto :goto_0
.end method

.method private refreshStatusViaService()V
    .locals 4

    .prologue
    .line 939
    new-instance v0, Lcom/facebook/internal/LikeStatusClient;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    invoke-static {}, Lcom/facebook/Settings;->getApplicationId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/internal/LikeStatusClient;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 943
    invoke-virtual {v0}, Lcom/facebook/internal/LikeStatusClient;->start()Z

    move-result v1

    if-nez v1, :cond_0

    .line 993
    :goto_0
    return-void

    .line 947
    :cond_0
    new-instance v1, Lcom/facebook/internal/LikeActionController$9;

    invoke-direct {v1, p0}, Lcom/facebook/internal/LikeActionController$9;-><init>(Lcom/facebook/internal/LikeActionController;)V

    .line 992
    invoke-virtual {v0, v1}, Lcom/facebook/internal/LikeStatusClient;->setCompletedListener(Lcom/facebook/internal/PlatformServiceClient$CompletedListener;)V

    goto :goto_0
.end method

.method private static registerSessionBroadcastReceivers(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 268
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    .line 270
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 271
    const-string v2, "com.facebook.sdk.ACTIVE_SESSION_UNSET"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 272
    const-string v2, "com.facebook.sdk.ACTIVE_SESSION_CLOSED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 273
    const-string v2, "com.facebook.sdk.ACTIVE_SESSION_OPENED"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 275
    new-instance v2, Lcom/facebook/internal/LikeActionController$4;

    invoke-direct {v2}, Lcom/facebook/internal/LikeActionController$4;-><init>()V

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 320
    return-void
.end method

.method private static serializeToDiskAsync(Lcom/facebook/internal/LikeActionController;)V
    .locals 4

    .prologue
    .line 347
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->serializeToJson(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v0

    .line 348
    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-static {v1}, Lcom/facebook/internal/LikeActionController;->getCacheKeyForObjectId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 350
    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 351
    sget-object v2, Lcom/facebook/internal/LikeActionController;->diskIOWorkQueue:Lcom/facebook/internal/WorkQueue;

    new-instance v3, Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;

    invoke-direct {v3, v1, v0}, Lcom/facebook/internal/LikeActionController$SerializeToDiskWorkItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/facebook/internal/WorkQueue;->addActiveWorkItem(Ljava/lang/Runnable;)Lcom/facebook/internal/WorkQueue$WorkItem;

    .line 353
    :cond_0
    return-void
.end method

.method private static serializeToDiskSynchronously(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 360
    const/4 v1, 0x0

    .line 362
    :try_start_0
    sget-object v0, Lcom/facebook/internal/LikeActionController;->controllerDiskCache:Lcom/facebook/internal/FileLruCache;

    invoke-virtual {v0, p0}, Lcom/facebook/internal/FileLruCache;->openPutStream(Ljava/lang/String;)Ljava/io/OutputStream;

    move-result-object v1

    .line 363
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 367
    if-eqz v1, :cond_0

    .line 368
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    .line 371
    :cond_0
    :goto_0
    return-void

    .line 364
    :catch_0
    move-exception v0

    .line 365
    :try_start_1
    sget-object v2, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    const-string v3, "Unable to serialize controller to disk"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 367
    if-eqz v1, :cond_0

    .line 368
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    goto :goto_0

    .line 367
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_1

    .line 368
    invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V

    :cond_1
    throw v0
.end method

.method private static serializeToJson(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 445
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 447
    :try_start_0
    const-string v1, "com.facebook.internal.LikeActionController.version"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 448
    const-string v1, "object_id"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 449
    const-string v1, "like_count_string_with_like"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 450
    const-string v1, "like_count_string_without_like"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 451
    const-string v1, "social_sentence_with_like"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 452
    const-string v1, "social_sentence_without_like"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 453
    const-string v1, "is_object_liked"

    iget-boolean v2, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 454
    const-string v1, "unlike_token"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 455
    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    if-eqz v1, :cond_0

    .line 456
    const-string v1, "pending_call_id"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 458
    :cond_0
    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;

    if-eqz v1, :cond_1

    .line 459
    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;

    invoke-static {v1}, Lcom/facebook/internal/BundleJSONConverter;->convertToJSON(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object v1

    .line 460
    if-eqz v1, :cond_1

    .line 461
    const-string v2, "pending_call_analytics_bundle"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 469
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 464
    :catch_0
    move-exception v0

    .line 465
    sget-object v1, Lcom/facebook/internal/LikeActionController;->TAG:Ljava/lang/String;

    const-string v2, "Unable to serialize controller to JSON"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 466
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private stopTrackingPendingCall()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 779
    invoke-static {}, Lcom/facebook/internal/PendingCallStore;->getInstance()Lcom/facebook/internal/PendingCallStore;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Lcom/facebook/internal/PendingCallStore;->stopTrackingPendingCall(Ljava/util/UUID;)V

    .line 781
    iput-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    .line 782
    iput-object v2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;

    .line 784
    invoke-direct {p0, v2}, Lcom/facebook/internal/LikeActionController;->storeObjectIdForPendingController(Ljava/lang/String;)V

    .line 785
    return-void
.end method

.method private storeObjectIdForPendingController(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 788
    sput-object p1, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    .line 789
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    const-string v1, "com.facebook.LikeActionController.CONTROLLER_STORE_KEY"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "PENDING_CONTROLLER_KEY"

    sget-object v2, Lcom/facebook/internal/LikeActionController;->objectIdForPendingController:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 793
    return-void
.end method

.method private toggleAgainIfNeeded(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 996
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    iget-boolean v1, p0, Lcom/facebook/internal/LikeActionController;->isObjectLikedOnServer:Z

    if-eq v0, v1, :cond_0

    .line 997
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/internal/LikeActionController;->performLikeOrUnlike(Landroid/app/Activity;ZLandroid/os/Bundle;)V

    .line 999
    :cond_0
    return-void
.end method

.method private trackPendingCall(Lcom/facebook/widget/FacebookDialog$PendingCall;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 765
    invoke-static {}, Lcom/facebook/internal/PendingCallStore;->getInstance()Lcom/facebook/internal/PendingCallStore;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/internal/PendingCallStore;->trackPendingCall(Lcom/facebook/widget/FacebookDialog$PendingCall;)V

    .line 768
    invoke-virtual {p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/internal/LikeActionController;->pendingCallId:Ljava/util/UUID;

    .line 769
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/facebook/internal/LikeActionController;->storeObjectIdForPendingController(Ljava/lang/String;)V

    .line 772
    iput-object p2, p0, Lcom/facebook/internal/LikeActionController;->pendingCallAnalyticsBundle:Landroid/os/Bundle;

    .line 775
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->serializeToDiskAsync(Lcom/facebook/internal/LikeActionController;)V

    .line 776
    return-void
.end method

.method private updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 628
    invoke-static {p2, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 629
    invoke-static {p3, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 630
    invoke-static {p4, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 631
    invoke-static {p5, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 632
    invoke-static {p6, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 634
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    invoke-static {v3, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    invoke-static {v5, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 641
    :goto_0
    if-nez v0, :cond_2

    .line 655
    :goto_1
    return-void

    .line 634
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 645
    :cond_2
    iput-boolean p1, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    .line 646
    iput-object v1, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    .line 647
    iput-object v2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    .line 648
    iput-object v3, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    .line 649
    iput-object v4, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    .line 650
    iput-object v5, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    .line 652
    invoke-static {p0}, Lcom/facebook/internal/LikeActionController;->serializeToDiskAsync(Lcom/facebook/internal/LikeActionController;)V

    .line 654
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->context:Landroid/content/Context;

    const-string v1, "com.facebook.sdk.LikeActionController.UPDATED"

    invoke-static {v0, p0, v1}, Lcom/facebook/internal/LikeActionController;->broadcastAction(Landroid/content/Context;Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public getLikeCountString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 539
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    goto :goto_0
.end method

.method public getObjectId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 531
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method public getSocialSentence()Ljava/lang/String;
    .locals 1

    .prologue
    .line 547
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    goto :goto_0
.end method

.method public isObjectLiked()Z
    .locals 1

    .prologue
    .line 555
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    return v0
.end method

.method public toggleLike(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 562
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    const-string v1, "fb_like_control_did_tap"

    invoke-virtual {v0, v1, v7, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 564
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isObjectLiked:Z

    if-nez v0, :cond_0

    const/4 v1, 0x1

    .line 565
    :goto_0
    invoke-direct {p0}, Lcom/facebook/internal/LikeActionController;->canUseOGPublish()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 567
    iget-object v2, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithLike:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController;->likeCountStringWithoutLike:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithLike:Ljava/lang/String;

    iget-object v5, p0, Lcom/facebook/internal/LikeActionController;->socialSentenceWithoutLike:Ljava/lang/String;

    iget-object v6, p0, Lcom/facebook/internal/LikeActionController;->unlikeToken:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/facebook/internal/LikeActionController;->updateState(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    iget-boolean v0, p0, Lcom/facebook/internal/LikeActionController;->isPendingLikeOrUnlike:Z

    if-eqz v0, :cond_1

    .line 577
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController;->appEventsLogger:Lcom/facebook/AppEventsLogger;

    const-string v1, "fb_like_control_did_undo_quickly"

    invoke-virtual {v0, v1, v7, p2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 583
    :goto_1
    return-void

    .line 564
    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 582
    :cond_1
    invoke-direct {p0, p1, v1, p2}, Lcom/facebook/internal/LikeActionController;->performLikeOrUnlike(Landroid/app/Activity;ZLandroid/os/Bundle;)V

    goto :goto_1
.end method
