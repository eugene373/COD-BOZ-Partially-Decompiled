.class public Lcom/facebook/android/Facebook;
.super Ljava/lang/Object;
.source "Facebook.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/android/Facebook$ServiceListener;,
        Lcom/facebook/android/Facebook$DialogListener;,
        Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;,
        Lcom/facebook/android/Facebook$TokenRefreshConnectionHandler;,
        Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;
    }
.end annotation


# static fields
.field public static final ATTRIBUTION_ID_COLUMN_NAME:Ljava/lang/String; = "aid"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CANCEL_URI:Ljava/lang/String; = "fbconnect://cancel"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final DEFAULT_AUTH_ACTIVITY_CODE:I = 0x7f99

.field protected static DIALOG_BASE_URL:Ljava/lang/String; = null
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final EXPIRES:Ljava/lang/String; = "expires_in"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final FB_APP_SIGNATURE:Ljava/lang/String; = "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final FORCE_DIALOG_AUTH:I = -0x1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field protected static GRAPH_BASE_URL:Ljava/lang/String; = null
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final LOGIN:Ljava/lang/String; = "oauth"

.field public static final REDIRECT_URI:Ljava/lang/String; = "fbconnect://success"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final REFRESH_TOKEN_BARRIER:J = 0x5265c00L

.field protected static RESTSERVER_URL:Ljava/lang/String; = null
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final SINGLE_SIGN_ON_DISABLED:Ljava/lang/String; = "service_disabled"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final TOKEN:Ljava/lang/String; = "access_token"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private accessExpiresMillisecondsAfterEpoch:J

.field private accessToken:Ljava/lang/String;

.field private lastAccessUpdateMillisecondsAfterEpoch:J

.field private final lock:Ljava/lang/Object;

.field private mAppId:Ljava/lang/String;

.field private pendingAuthorizationActivity:Landroid/app/Activity;

.field private pendingAuthorizationPermissions:[Ljava/lang/String;

.field private pendingOpeningSession:Lcom/facebook/Session;

.field private volatile session:Lcom/facebook/Session;

.field private sessionInvalidated:Z

.field private tokenCache:Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;

.field private volatile userSetSession:Lcom/facebook/Session;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 70
    const-string v0, "content://com.facebook.katana.provider.AttributionIdProvider"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/android/Facebook;->ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;

    .line 85
    const-string v0, "https://m.facebook.com/dialog/"

    sput-object v0, Lcom/facebook/android/Facebook;->DIALOG_BASE_URL:Ljava/lang/String;

    .line 87
    const-string v0, "https://graph.facebook.com/"

    sput-object v0, Lcom/facebook/android/Facebook;->GRAPH_BASE_URL:Ljava/lang/String;

    .line 89
    const-string v0, "https://api.facebook.com/restserver.php"

    sput-object v0, Lcom/facebook/android/Facebook;->RESTSERVER_URL:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const-wide/16 v2, 0x0

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;

    .line 94
    iput-wide v2, p0, Lcom/facebook/android/Facebook;->accessExpiresMillisecondsAfterEpoch:J

    .line 95
    iput-wide v2, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J

    .line 120
    if-nez p1, :cond_0

    .line 121
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "You must specify your application ID when instantiating a Facebook object. See README for details."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 124
    :cond_0
    iput-object p1, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    .line 125
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/android/Facebook;Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/android/Facebook;->onSessionCallback(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;Lcom/facebook/android/Facebook$DialogListener;)V

    return-void
.end method

.method static synthetic access$100(Lcom/facebook/android/Facebook;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$102(Lcom/facebook/android/Facebook;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$200(Lcom/facebook/android/Facebook;)Lcom/facebook/Session;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    return-object v0
.end method

.method static synthetic access$400(Lcom/facebook/android/Facebook;)J
    .locals 2

    .prologue
    .line 55
    iget-wide v0, p0, Lcom/facebook/android/Facebook;->accessExpiresMillisecondsAfterEpoch:J

    return-wide v0
.end method

.method static synthetic access$402(Lcom/facebook/android/Facebook;J)J
    .locals 1

    .prologue
    .line 55
    iput-wide p1, p0, Lcom/facebook/android/Facebook;->accessExpiresMillisecondsAfterEpoch:J

    return-wide p1
.end method

.method static synthetic access$500(Lcom/facebook/android/Facebook;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$502(Lcom/facebook/android/Facebook;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$600([Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .prologue
    .line 55
    invoke-static {p0}, Lcom/facebook/android/Facebook;->stringList([Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$700(Lcom/facebook/android/Facebook;)J
    .locals 2

    .prologue
    .line 55
    iget-wide v0, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J

    return-wide v0
.end method

.method static synthetic access$702(Lcom/facebook/android/Facebook;J)J
    .locals 1

    .prologue
    .line 55
    iput-wide p1, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J

    return-wide p1
.end method

.method static synthetic access$800(Ljava/util/List;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    invoke-static {p0}, Lcom/facebook/android/Facebook;->stringArray(Ljava/util/List;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/SessionLoginBehavior;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 292
    const-string v1, "authorize"

    invoke-direct {p0, v1}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V

    .line 293
    new-instance v1, Lcom/facebook/Session$Builder;

    invoke-direct {v1, p1}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;

    move-result-object v1

    invoke-direct {p0}, Lcom/facebook/android/Facebook;->getTokenCache()Lcom/facebook/TokenCachingStrategy;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/Session$Builder;->setTokenCachingStrategy(Lcom/facebook/TokenCachingStrategy;)Lcom/facebook/Session$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/android/Facebook;->pendingOpeningSession:Lcom/facebook/Session;

    .line 297
    iput-object p1, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationActivity:Landroid/app/Activity;

    .line 298
    if-eqz p2, :cond_1

    :goto_0
    iput-object p2, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;

    .line 300
    new-instance v1, Lcom/facebook/android/Facebook$1;

    invoke-direct {v1, p0, p5}, Lcom/facebook/android/Facebook$1;-><init>(Lcom/facebook/android/Facebook;Lcom/facebook/android/Facebook$DialogListener;)V

    .line 308
    new-instance v2, Lcom/facebook/Session$OpenRequest;

    invoke-direct {v2, p1}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v2, v1}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;

    move-result-object v1

    invoke-virtual {v1, p4}, Lcom/facebook/Session$OpenRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$OpenRequest;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/facebook/Session$OpenRequest;->setRequestCode(I)Lcom/facebook/Session$OpenRequest;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;

    move-result-object v1

    .line 313
    iget-object v2, p0, Lcom/facebook/android/Facebook;->pendingOpeningSession:Lcom/facebook/Session;

    iget-object v3, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;

    array-length v3, v3

    if-lez v3, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-direct {p0, v2, v1, v0}, Lcom/facebook/android/Facebook;->openSession(Lcom/facebook/Session;Lcom/facebook/Session$OpenRequest;Z)V

    .line 314
    return-void

    .line 298
    :cond_1
    new-array p2, v0, [Ljava/lang/String;

    goto :goto_0
.end method

.method private checkUserSession(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 906
    iget-object v0, p0, Lcom/facebook/android/Facebook;->userSetSession:Lcom/facebook/Session;

    if-eqz v0, :cond_0

    .line 907
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Cannot call %s after setSession has been called."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 910
    :cond_0
    return-void
.end method

.method public static getAttributionId(Landroid/content/ContentResolver;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1201
    invoke-static {p0}, Lcom/facebook/Settings;->getAttributionId(Landroid/content/ContentResolver;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getTokenCache()Lcom/facebook/TokenCachingStrategy;
    .locals 2

    .prologue
    .line 1132
    iget-object v0, p0, Lcom/facebook/android/Facebook;->tokenCache:Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;

    if-nez v0, :cond_0

    .line 1133
    new-instance v0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;-><init>(Lcom/facebook/android/Facebook;Lcom/facebook/android/Facebook$1;)V

    iput-object v0, p0, Lcom/facebook/android/Facebook;->tokenCache:Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;

    .line 1135
    :cond_0
    iget-object v0, p0, Lcom/facebook/android/Facebook;->tokenCache:Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;

    return-object v0
.end method

.method private onSessionCallback(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 5

    .prologue
    .line 328
    invoke-virtual {p1}, Lcom/facebook/Session;->getAuthorizationBundle()Landroid/os/Bundle;

    move-result-object v1

    .line 330
    sget-object v0, Lcom/facebook/SessionState;->OPENED:Lcom/facebook/SessionState;

    if-ne p2, v0, :cond_3

    .line 331
    const/4 v0, 0x0

    .line 333
    iget-object v2, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;

    monitor-enter v2

    .line 334
    :try_start_0
    iget-object v3, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    if-eq p1, v3, :cond_0

    .line 335
    iget-object v0, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    .line 336
    iput-object p1, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    .line 337
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z

    .line 339
    :cond_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 341
    if-eqz v0, :cond_1

    .line 342
    invoke-virtual {v0}, Lcom/facebook/Session;->close()V

    .line 345
    :cond_1
    invoke-interface {p4, v1}, Lcom/facebook/android/Facebook$DialogListener;->onComplete(Landroid/os/Bundle;)V

    .line 361
    :cond_2
    :goto_0
    return-void

    .line 339
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 346
    :cond_3
    if-eqz p3, :cond_2

    .line 347
    instance-of v0, p3, Lcom/facebook/FacebookOperationCanceledException;

    if-eqz v0, :cond_4

    .line 348
    invoke-interface {p4}, Lcom/facebook/android/Facebook$DialogListener;->onCancel()V

    goto :goto_0

    .line 349
    :cond_4
    instance-of v0, p3, Lcom/facebook/FacebookAuthorizationException;

    if-eqz v0, :cond_5

    if-eqz v1, :cond_5

    const-string v0, "com.facebook.sdk.WebViewErrorCode"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "com.facebook.sdk.FailingUrl"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 352
    new-instance v0, Lcom/facebook/android/DialogError;

    invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.facebook.sdk.WebViewErrorCode"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v4, "com.facebook.sdk.FailingUrl"

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lcom/facebook/android/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 355
    invoke-interface {p4, v0}, Lcom/facebook/android/Facebook$DialogListener;->onError(Lcom/facebook/android/DialogError;)V

    goto :goto_0

    .line 357
    :cond_5
    new-instance v0, Lcom/facebook/android/FacebookError;

    invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V

    .line 358
    invoke-interface {p4, v0}, Lcom/facebook/android/Facebook$DialogListener;->onFacebookError(Lcom/facebook/android/FacebookError;)V

    goto :goto_0
.end method

.method private openSession(Lcom/facebook/Session;Lcom/facebook/Session$OpenRequest;Z)V
    .locals 1

    .prologue
    .line 317
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/facebook/Session$OpenRequest;->setIsLegacy(Z)V

    .line 318
    if-eqz p3, :cond_0

    .line 319
    invoke-virtual {p1, p2}, Lcom/facebook/Session;->openForPublish(Lcom/facebook/Session$OpenRequest;)V

    .line 323
    :goto_0
    return-void

    .line 321
    :cond_0
    invoke-virtual {p1, p2}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V

    goto :goto_0
.end method

.method private static stringArray(Ljava/util/List;)[Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 1139
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    .line 1140
    :goto_0
    new-array v2, v0, [Ljava/lang/String;

    .line 1142
    if-eqz p0, :cond_1

    .line 1143
    :goto_1
    array-length v0, v2

    if-ge v1, v0, :cond_1

    .line 1144
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v2, v1

    .line 1143
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    move v0, v1

    .line 1139
    goto :goto_0

    .line 1148
    :cond_1
    return-object v2
.end method

.method private static stringList([Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1152
    if-eqz p0, :cond_0

    .line 1153
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 1155
    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0
.end method

.method private validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 393
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v2, 0x40

    invoke-virtual {v1, p2, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 398
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    .line 399
    invoke-virtual {v4}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 400
    const/4 v0, 0x1

    .line 403
    :cond_0
    :goto_1
    return v0

    .line 398
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 394
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method private validateServiceIntent(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 373
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, p2, v0}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v1

    .line 374
    if-nez v1, :cond_0

    .line 378
    :goto_0
    return v0

    :cond_0
    iget-object v0, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v0, v0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/facebook/android/Facebook;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public authorize(Landroid/app/Activity;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 136
    const/4 v0, 0x0

    new-array v2, v0, [Ljava/lang/String;

    const/16 v3, 0x7f99

    sget-object v4, Lcom/facebook/SessionLoginBehavior;->SSO_WITH_FALLBACK:Lcom/facebook/SessionLoginBehavior;

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/SessionLoginBehavior;Lcom/facebook/android/Facebook$DialogListener;)V

    .line 138
    return-void
.end method

.method public authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 218
    if-ltz p3, :cond_0

    sget-object v4, Lcom/facebook/SessionLoginBehavior;->SSO_WITH_FALLBACK:Lcom/facebook/SessionLoginBehavior;

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p4

    .line 221
    invoke-direct/range {v0 .. v5}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/SessionLoginBehavior;Lcom/facebook/android/Facebook$DialogListener;)V

    .line 222
    return-void

    .line 218
    :cond_0
    sget-object v4, Lcom/facebook/SessionLoginBehavior;->SUPPRESS_SSO:Lcom/facebook/SessionLoginBehavior;

    goto :goto_0
.end method

.method public authorize(Landroid/app/Activity;[Ljava/lang/String;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 149
    const/16 v3, 0x7f99

    sget-object v4, Lcom/facebook/SessionLoginBehavior;->SSO_WITH_FALLBACK:Lcom/facebook/SessionLoginBehavior;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/SessionLoginBehavior;Lcom/facebook/android/Facebook$DialogListener;)V

    .line 150
    return-void
.end method

.method public authorizeCallback(IILandroid/content/Intent;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 424
    const-string v0, "authorizeCallback"

    invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V

    .line 425
    iget-object v0, p0, Lcom/facebook/android/Facebook;->pendingOpeningSession:Lcom/facebook/Session;

    .line 426
    if-eqz v0, :cond_0

    .line 427
    iget-object v1, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationActivity:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/facebook/Session;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    iput-object v2, p0, Lcom/facebook/android/Facebook;->pendingOpeningSession:Lcom/facebook/Session;

    .line 429
    iput-object v2, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationActivity:Landroid/app/Activity;

    .line 430
    iput-object v2, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;

    .line 433
    :cond_0
    return-void
.end method

.method public dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 854
    const-string v0, "display"

    const-string v1, "touch"

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 855
    const-string v0, "redirect_uri"

    const-string v1, "fbconnect://success"

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 857
    const-string v0, "oauth"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 858
    const-string v0, "type"

    const-string v1, "user_agent"

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 859
    const-string v0, "client_id"

    iget-object v1, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 868
    :cond_0
    :goto_0
    const-string v0, "android.permission.INTERNET"

    invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    .line 869
    const-string v0, "Error"

    const-string v1, "Application requires permission to access the Internet"

    invoke-static {p1, v0, v1}, Lcom/facebook/android/Util;->showAlert(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 873
    :goto_1
    return-void

    .line 861
    :cond_1
    const-string v0, "app_id"

    iget-object v1, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 863
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 864
    const-string v0, "access_token"

    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 871
    :cond_2
    new-instance v0, Lcom/facebook/android/FbDialog;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/facebook/android/FbDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V

    invoke-virtual {v0}, Lcom/facebook/android/FbDialog;->show()V

    goto :goto_1
.end method

.method public dialog(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/android/Facebook$DialogListener;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 830
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V

    .line 831
    return-void
.end method

.method public extendAccessToken(Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)Z
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 458
    const-string v0, "extendAccessToken"

    invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V

    .line 459
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 461
    const-string v1, "com.facebook.katana"

    const-string v2, "com.facebook.katana.platform.TokenRefreshService"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 466
    invoke-direct {p0, p1, v0}, Lcom/facebook/android/Facebook;->validateServiceIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 467
    const/4 v0, 0x0

    .line 470
    :goto_0
    return v0

    :cond_0
    new-instance v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;-><init>(Lcom/facebook/android/Facebook;Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)V

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    goto :goto_0
.end method

.method public extendAccessTokenIfNeeded(Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 484
    const-string v0, "extendAccessTokenIfNeeded"

    invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V

    .line 485
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->shouldExtendAccessToken()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    invoke-virtual {p0, p1, p2}, Lcom/facebook/android/Facebook;->extendAccessToken(Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)Z

    move-result v0

    .line 488
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getAccessExpires()J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1009
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getSession()Lcom/facebook/Session;

    move-result-object v0

    .line 1010
    if-eqz v0, :cond_0

    .line 1011
    invoke-virtual {v0}, Lcom/facebook/Session;->getExpirationDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    .line 1013
    :goto_0
    return-wide v0

    :cond_0
    iget-wide v0, p0, Lcom/facebook/android/Facebook;->accessExpiresMillisecondsAfterEpoch:J

    goto :goto_0
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 993
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getSession()Lcom/facebook/Session;

    move-result-object v0

    .line 994
    if-eqz v0, :cond_0

    .line 995
    invoke-virtual {v0}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    .line 997
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1112
    iget-object v0, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    return-object v0
.end method

.method public getLastAccessUpdate()J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1025
    iget-wide v0, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J

    return-wide v0
.end method

.method public final getSession()Lcom/facebook/Session;
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 920
    .line 923
    :cond_0
    iget-object v3, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;

    monitor-enter v3

    .line 924
    :try_start_0
    iget-object v0, p0, Lcom/facebook/android/Facebook;->userSetSession:Lcom/facebook/Session;

    if-eqz v0, :cond_1

    .line 925
    iget-object v0, p0, Lcom/facebook/android/Facebook;->userSetSession:Lcom/facebook/Session;

    monitor-exit v3

    .line 978
    :goto_0
    return-object v0

    .line 927
    :cond_1
    iget-object v0, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z

    if-nez v0, :cond_3

    .line 928
    :cond_2
    iget-object v0, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    monitor-exit v3

    goto :goto_0

    .line 933
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 931
    :cond_3
    :try_start_1
    iget-object v0, p0, Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;

    .line 932
    iget-object v4, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    .line 933
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 935
    if-nez v0, :cond_4

    move-object v0, v2

    .line 936
    goto :goto_0

    .line 943
    :cond_4
    if-eqz v4, :cond_5

    .line 944
    invoke-virtual {v4}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;

    move-result-object v0

    .line 951
    :goto_1
    new-instance v3, Lcom/facebook/Session$Builder;

    iget-object v4, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationActivity:Landroid/app/Activity;

    invoke-direct {v3, v4}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V

    iget-object v4, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;

    move-result-object v3

    invoke-direct {p0}, Lcom/facebook/android/Facebook;->getTokenCache()Lcom/facebook/TokenCachingStrategy;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/Session$Builder;->setTokenCachingStrategy(Lcom/facebook/TokenCachingStrategy;)Lcom/facebook/Session$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;

    move-result-object v3

    .line 955
    invoke-virtual {v3}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;

    move-result-object v4

    sget-object v5, Lcom/facebook/SessionState;->CREATED_TOKEN_LOADED:Lcom/facebook/SessionState;

    if-eq v4, v5, :cond_7

    move-object v0, v2

    .line 956
    goto :goto_0

    .line 945
    :cond_5
    iget-object v0, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 946
    iget-object v0, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 948
    :cond_6
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    .line 958
    :cond_7
    new-instance v4, Lcom/facebook/Session$OpenRequest;

    iget-object v5, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationActivity:Landroid/app/Activity;

    invoke-direct {v4, v5}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v4, v0}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;

    move-result-object v4

    .line 960
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    const/4 v0, 0x1

    :goto_2
    invoke-direct {p0, v3, v4, v0}, Lcom/facebook/android/Facebook;->openSession(Lcom/facebook/Session;Lcom/facebook/Session$OpenRequest;Z)V

    .line 965
    iget-object v4, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;

    monitor-enter v4

    .line 966
    :try_start_2
    iget-boolean v0, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    if-nez v0, :cond_b

    .line 967
    :cond_8
    iget-object v0, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    .line 968
    iput-object v3, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    .line 969
    const/4 v5, 0x0

    iput-boolean v5, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z

    move-object v6, v3

    move-object v3, v0

    move-object v0, v6

    .line 971
    :goto_3
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 973
    if-eqz v3, :cond_9

    .line 974
    invoke-virtual {v3}, Lcom/facebook/Session;->close()V

    .line 977
    :cond_9
    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_a
    move v0, v1

    .line 960
    goto :goto_2

    .line 971
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :cond_b
    move-object v0, v2

    move-object v3, v2

    goto :goto_3
.end method

.method public getShouldAutoPublishInstall()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1215
    invoke-static {}, Lcom/facebook/Settings;->getShouldAutoPublishInstall()Z

    move-result v0

    return v0
.end method

.method public isSessionValid()Z
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 882
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public logout(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 646
    invoke-virtual {p0, p1}, Lcom/facebook/android/Facebook;->logoutImpl(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method logoutImpl(Landroid/content/Context;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 650
    const-string v0, "logout"

    invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V

    .line 651
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 652
    const-string v1, "method"

    const-string v2, "auth.expireSession"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 653
    invoke-virtual {p0, v0}, Lcom/facebook/android/Facebook;->request(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    .line 655
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 658
    iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 659
    :try_start_0
    iget-object v4, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    .line 661
    const/4 v5, 0x0

    iput-object v5, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;

    .line 662
    const/4 v5, 0x0

    iput-object v5, p0, Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;

    .line 663
    const-wide/16 v6, 0x0

    iput-wide v6, p0, Lcom/facebook/android/Facebook;->accessExpiresMillisecondsAfterEpoch:J

    .line 664
    iput-wide v2, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J

    .line 665
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z

    .line 666
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 668
    if-eqz v4, :cond_0

    .line 669
    invoke-virtual {v4}, Lcom/facebook/Session;->closeAndClearTokenInformation()V

    .line 672
    :cond_0
    return-object v0

    .line 666
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public request(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 706
    const-string v0, "method"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 707
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "API method must be specified. (parameters must contain key \"method\" and value). See http://developers.facebook.com/docs/reference/rest/"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 711
    :cond_0
    const/4 v0, 0x0

    const-string v1, "GET"

    invoke-virtual {p0, v0, p1, v1}, Lcom/facebook/android/Facebook;->requestImpl(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public request(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 734
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "GET"

    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/android/Facebook;->requestImpl(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public request(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 763
    const-string v0, "GET"

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/android/Facebook;->requestImpl(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 796
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/android/Facebook;->requestImpl(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method requestImpl(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/net/MalformedURLException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 803
    const-string v0, "format"

    const-string v1, "json"

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 804
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 805
    const-string v0, "access_token"

    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 807
    :cond_0
    if-eqz p1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/facebook/android/Facebook;->GRAPH_BASE_URL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 808
    :goto_0
    invoke-static {v0, p3, p2}, Lcom/facebook/android/Util;->openUrl(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 807
    :cond_1
    sget-object v0, Lcom/facebook/android/Facebook;->RESTSERVER_URL:Ljava/lang/String;

    goto :goto_0
.end method

.method public setAccessExpires(J)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1078
    const-string v0, "setAccessExpires"

    invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V

    .line 1079
    iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 1080
    :try_start_0
    iput-wide p1, p0, Lcom/facebook/android/Facebook;->accessExpiresMillisecondsAfterEpoch:J

    .line 1081
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J

    .line 1082
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z

    .line 1083
    monitor-exit v1

    .line 1084
    return-void

    .line 1083
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setAccessExpiresIn(Ljava/lang/String;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1097
    const-string v0, "setAccessExpiresIn"

    invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V

    .line 1098
    if-eqz p1, :cond_0

    .line 1099
    const-string v0, "0"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x0

    .line 1101
    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V

    .line 1103
    :cond_0
    return-void

    .line 1099
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v0, v2

    goto :goto_0
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1059
    const-string v0, "setAccessToken"

    invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V

    .line 1060
    iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 1061
    :try_start_0
    iput-object p1, p0, Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;

    .line 1062
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J

    .line 1063
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z

    .line 1064
    monitor-exit v1

    .line 1065
    return-void

    .line 1064
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1122
    const-string v0, "setAppId"

    invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V

    .line 1123
    iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 1124
    :try_start_0
    iput-object p1, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;

    .line 1125
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z

    .line 1126
    monitor-exit v1

    .line 1127
    return-void

    .line 1126
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setSession(Lcom/facebook/Session;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 897
    if-nez p1, :cond_0

    .line 898
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "session cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 900
    :cond_0
    iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 901
    :try_start_0
    iput-object p1, p0, Lcom/facebook/android/Facebook;->userSetSession:Lcom/facebook/Session;

    .line 902
    monitor-exit v1

    .line 903
    return-void

    .line 902
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setShouldAutoPublishInstall(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1227
    invoke-static {p1}, Lcom/facebook/Settings;->setShouldAutoPublishInstall(Z)V

    .line 1228
    return-void
.end method

.method public setTokenFromCache(Ljava/lang/String;JJ)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1041
    const-string v0, "setTokenFromCache"

    invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V

    .line 1042
    iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;

    monitor-enter v1

    .line 1043
    :try_start_0
    iput-object p1, p0, Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;

    .line 1044
    iput-wide p2, p0, Lcom/facebook/android/Facebook;->accessExpiresMillisecondsAfterEpoch:J

    .line 1045
    iput-wide p4, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J

    .line 1046
    monitor-exit v1

    .line 1047
    return-void

    .line 1046
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public shouldExtendAccessToken()Z
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 501
    const-string v0, "shouldExtendAccessToken"

    invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V

    .line 502
    invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
