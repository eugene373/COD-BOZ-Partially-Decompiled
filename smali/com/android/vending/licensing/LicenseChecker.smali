.class public Lcom/android/vending/licensing/LicenseChecker;
.super Ljava/lang/Object;
.source "LicenseChecker.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/vending/licensing/LicenseChecker$ResultListener;
    }
.end annotation


# static fields
.field private static final DEBUG_LICENSE_ERROR:Z = false

.field private static final KEY_FACTORY_ALGORITHM:Ljava/lang/String; = "RSA"

.field private static final RANDOM:Ljava/security/SecureRandom;

.field private static final TAG:Ljava/lang/String; = "LicenseChecker"

.field private static final TIMEOUT_MS:I = 0x2710


# instance fields
.field private final mChecksInProgress:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/android/vending/licensing/LicenseValidator;",
            ">;"
        }
    .end annotation
.end field

.field private final mContext:Landroid/content/Context;

.field private mHandler:Landroid/os/Handler;

.field private final mPackageName:Ljava/lang/String;

.field private final mPendingChecks:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/android/vending/licensing/LicenseValidator;",
            ">;"
        }
    .end annotation
.end field

.field private final mPolicy:Lcom/android/vending/licensing/Policy;

.field private mPublicKey:Ljava/security/PublicKey;

.field private mService:Lcom/android/vending/licensing/ILicensingService;

.field private final mVersionCode:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 69
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Lcom/android/vending/licensing/LicenseChecker;->RANDOM:Ljava/security/SecureRandom;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/android/vending/licensing/Policy;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mChecksInProgress:Ljava/util/Set;

    .line 86
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mPendingChecks:Ljava/util/Queue;

    .line 95
    iput-object p1, p0, Lcom/android/vending/licensing/LicenseChecker;->mContext:Landroid/content/Context;

    .line 96
    iput-object p2, p0, Lcom/android/vending/licensing/LicenseChecker;->mPolicy:Lcom/android/vending/licensing/Policy;

    .line 97
    invoke-static {p3}, Lcom/android/vending/licensing/LicenseChecker;->generatePublicKey(Ljava/lang/String;)Ljava/security/PublicKey;

    move-result-object v0

    iput-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mPublicKey:Ljava/security/PublicKey;

    .line 98
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mPackageName:Ljava/lang/String;

    .line 99
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mPackageName:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/android/vending/licensing/LicenseChecker;->getVersionCode(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mVersionCode:Ljava/lang/String;

    .line 100
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "background thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 101
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 102
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/android/vending/licensing/LicenseChecker;->mHandler:Landroid/os/Handler;

    .line 103
    return-void
.end method

.method static synthetic access$100(Lcom/android/vending/licensing/LicenseChecker;Lcom/android/vending/licensing/LicenseValidator;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/android/vending/licensing/LicenseChecker;->handleServiceConnectionError(Lcom/android/vending/licensing/LicenseValidator;)V

    return-void
.end method

.method static synthetic access$200(Lcom/android/vending/licensing/LicenseChecker;Lcom/android/vending/licensing/LicenseValidator;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0, p1}, Lcom/android/vending/licensing/LicenseChecker;->finishCheck(Lcom/android/vending/licensing/LicenseValidator;)V

    return-void
.end method

.method static synthetic access$300(Lcom/android/vending/licensing/LicenseChecker;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mChecksInProgress:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic access$500(Lcom/android/vending/licensing/LicenseChecker;)Ljava/security/PublicKey;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mPublicKey:Ljava/security/PublicKey;

    return-object v0
.end method

.method static synthetic access$600(Lcom/android/vending/licensing/LicenseChecker;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method private cleanupService()V
    .locals 2

    .prologue
    .line 311
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mService:Lcom/android/vending/licensing/ILicensingService;

    if-eqz v0, :cond_0

    .line 313
    :try_start_0
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mService:Lcom/android/vending/licensing/ILicensingService;

    .line 321
    :cond_0
    return-void

    .line 314
    :catch_0
    move-exception v0

    .line 317
    const-string v0, "LicenseChecker"

    const-string v1, "Unable to unbind from licensing service (already unbound)"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private declared-synchronized finishCheck(Lcom/android/vending/licensing/LicenseValidator;)V
    .locals 1

    .prologue
    .line 198
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mChecksInProgress:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 199
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mChecksInProgress:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseChecker;->cleanupService()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    :cond_0
    monitor-exit p0

    return-void

    .line 198
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private generateNonce()I
    .locals 1

    .prologue
    .line 338
    sget-object v0, Lcom/android/vending/licensing/LicenseChecker;->RANDOM:Ljava/security/SecureRandom;

    invoke-virtual {v0}, Ljava/security/SecureRandom;->nextInt()I

    move-result v0

    return v0
.end method

.method private static generatePublicKey(Ljava/lang/String;)Ljava/security/PublicKey;
    .locals 3

    .prologue
    .line 114
    :try_start_0
    invoke-static {p0}, Lcom/android/vending/licensing/util/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v0

    .line 115
    const-string v1, "RSA"

    invoke-static {v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    .line 117
    new-instance v2, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v2, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    invoke-virtual {v1, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/android/vending/licensing/util/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    return-object v0

    .line 118
    :catch_0
    move-exception v0

    .line 120
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 121
    :catch_1
    move-exception v0

    .line 122
    const-string v1, "LicenseChecker"

    const-string v2, "Could not decode from Base64."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 124
    :catch_2
    move-exception v0

    .line 125
    const-string v1, "LicenseChecker"

    const-string v2, "Invalid key specification."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static getVersionCode(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 350
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 354
    :goto_0
    return-object v0

    .line 352
    :catch_0
    move-exception v0

    .line 353
    const-string v0, "LicenseChecker"

    const-string v1, "Package not found. could not get version code."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 354
    const-string v0, ""

    goto :goto_0
.end method

.method private declared-synchronized handleServiceConnectionError(Lcom/android/vending/licensing/LicenseValidator;)V
    .locals 3

    .prologue
    .line 300
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mPolicy:Lcom/android/vending/licensing/Policy;

    const/16 v1, 0x123

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/android/vending/licensing/Policy;->processServerResponse(ILcom/android/vending/licensing/ResponseData;)V

    .line 302
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mPolicy:Lcom/android/vending/licensing/Policy;

    invoke-interface {v0}, Lcom/android/vending/licensing/Policy;->allowAccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    invoke-virtual {p1}, Lcom/android/vending/licensing/LicenseValidator;->getCallback()Lcom/android/vending/licensing/LicenseCheckerCallback;

    move-result-object v0

    const/16 v1, 0x123

    invoke-interface {v0, v1}, Lcom/android/vending/licensing/LicenseCheckerCallback;->allow(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 307
    :goto_0
    monitor-exit p0

    return-void

    .line 305
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/android/vending/licensing/LicenseValidator;->getCallback()Lcom/android/vending/licensing/LicenseCheckerCallback;

    move-result-object v0

    const/16 v1, 0x123

    invoke-interface {v0, v1}, Lcom/android/vending/licensing/LicenseCheckerCallback;->dontAllow(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 300
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private runChecks()V
    .locals 6

    .prologue
    .line 183
    :goto_0
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mPendingChecks:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/vending/licensing/LicenseValidator;

    if-eqz v0, :cond_0

    .line 185
    :try_start_0
    const-string v1, "LicenseChecker"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Calling checkLicense on service for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/android/vending/licensing/LicenseValidator;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 186
    iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker;->mService:Lcom/android/vending/licensing/ILicensingService;

    .line 187
    invoke-virtual {v0}, Lcom/android/vending/licensing/LicenseValidator;->getNonce()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0}, Lcom/android/vending/licensing/LicenseValidator;->getPackageName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/android/vending/licensing/LicenseChecker$ResultListener;

    invoke-direct {v5, p0, v0}, Lcom/android/vending/licensing/LicenseChecker$ResultListener;-><init>(Lcom/android/vending/licensing/LicenseChecker;Lcom/android/vending/licensing/LicenseValidator;)V

    .line 186
    invoke-interface {v1, v2, v3, v4, v5}, Lcom/android/vending/licensing/ILicensingService;->checkLicense(JLjava/lang/String;Lcom/android/vending/licensing/ILicenseResultListener;)V

    .line 189
    iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker;->mChecksInProgress:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 190
    :catch_0
    move-exception v1

    .line 191
    const-string v2, "LicenseChecker"

    const-string v3, "RemoteException in checkLicense call."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 192
    invoke-direct {p0, v0}, Lcom/android/vending/licensing/LicenseChecker;->handleServiceConnectionError(Lcom/android/vending/licensing/LicenseValidator;)V

    goto :goto_0

    .line 195
    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized checkAccess(Lcom/android/vending/licensing/LicenseCheckerCallback;)V
    .locals 7

    .prologue
    .line 145
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mPolicy:Lcom/android/vending/licensing/Policy;

    invoke-interface {v0}, Lcom/android/vending/licensing/Policy;->allowAccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    const-string v0, "LicenseChecker"

    const-string v1, "Using cached license response"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    const/16 v0, 0x100

    invoke-interface {p1, v0}, Lcom/android/vending/licensing/LicenseCheckerCallback;->allow(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    :goto_0
    monitor-exit p0

    return-void

    .line 149
    :cond_0
    :try_start_1
    new-instance v0, Lcom/android/vending/licensing/LicenseValidator;

    iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker;->mPolicy:Lcom/android/vending/licensing/Policy;

    new-instance v2, Lcom/android/vending/licensing/NullDeviceLimiter;

    invoke-direct {v2}, Lcom/android/vending/licensing/NullDeviceLimiter;-><init>()V

    .line 150
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseChecker;->generateNonce()I

    move-result v4

    iget-object v5, p0, Lcom/android/vending/licensing/LicenseChecker;->mPackageName:Ljava/lang/String;

    iget-object v6, p0, Lcom/android/vending/licensing/LicenseChecker;->mVersionCode:Ljava/lang/String;

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lcom/android/vending/licensing/LicenseValidator;-><init>(Lcom/android/vending/licensing/Policy;Lcom/android/vending/licensing/DeviceLimiter;Lcom/android/vending/licensing/LicenseCheckerCallback;ILjava/lang/String;Ljava/lang/String;)V

    .line 152
    iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker;->mService:Lcom/android/vending/licensing/ILicensingService;

    if-nez v1, :cond_2

    .line 153
    const-string v1, "LicenseChecker"

    const-string v2, "Binding to licensing service."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    :try_start_2
    iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker;->mContext:Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    new-instance v3, Ljava/lang/String;

    const-string v4, "Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U="

    .line 159
    invoke-static {v4}, Lcom/android/vending/licensing/util/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    .line 156
    invoke-virtual {v1, v2, p0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    .line 163
    if-eqz v1, :cond_1

    .line 164
    iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker;->mPendingChecks:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lcom/android/vending/licensing/util/Base64DecoderException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 169
    :catch_0
    move-exception v0

    .line 170
    const/4 v0, 0x6

    :try_start_3
    invoke-interface {p1, v0}, Lcom/android/vending/licensing/LicenseCheckerCallback;->applicationError(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 145
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 166
    :cond_1
    :try_start_4
    const-string v1, "LicenseChecker"

    const-string v2, "Could not bind to service."

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    invoke-direct {p0, v0}, Lcom/android/vending/licensing/LicenseChecker;->handleServiceConnectionError(Lcom/android/vending/licensing/LicenseValidator;)V
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Lcom/android/vending/licensing/util/Base64DecoderException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    .line 171
    :catch_1
    move-exception v0

    .line 172
    :try_start_5
    invoke-virtual {v0}, Lcom/android/vending/licensing/util/Base64DecoderException;->printStackTrace()V

    goto :goto_0

    .line 175
    :cond_2
    iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker;->mPendingChecks:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 176
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseChecker;->runChecks()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0
.end method

.method public declared-synchronized onDestroy()V
    .locals 1

    .prologue
    .line 332
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseChecker;->cleanupService()V

    .line 333
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 334
    monitor-exit p0

    return-void

    .line 332
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .prologue
    .line 283
    monitor-enter p0

    :try_start_0
    invoke-static {p2}, Lcom/android/vending/licensing/ILicensingService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/android/vending/licensing/ILicensingService;

    move-result-object v0

    iput-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mService:Lcom/android/vending/licensing/ILicensingService;

    .line 284
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseChecker;->runChecks()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 285
    monitor-exit p0

    return-void

    .line 283
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 291
    monitor-enter p0

    :try_start_0
    const-string v0, "LicenseChecker"

    const-string v1, "Service unexpectedly disconnected."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 292
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mService:Lcom/android/vending/licensing/ILicensingService;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 293
    monitor-exit p0

    return-void

    .line 291
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
