.class Lcom/android/vending/licensing/LicenseChecker$ResultListener;
.super Lcom/android/vending/licensing/ILicenseResultListener$Stub;
.source "LicenseChecker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/licensing/LicenseChecker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ResultListener"
.end annotation


# static fields
.field private static final ERROR_CONTACTING_SERVER:I = 0x101

.field private static final ERROR_INVALID_PACKAGE_NAME:I = 0x102

.field private static final ERROR_NON_MATCHING_UID:I = 0x103


# instance fields
.field private mOnTimeout:Ljava/lang/Runnable;

.field private final mValidator:Lcom/android/vending/licensing/LicenseValidator;

.field final synthetic this$0:Lcom/android/vending/licensing/LicenseChecker;


# direct methods
.method public constructor <init>(Lcom/android/vending/licensing/LicenseChecker;Lcom/android/vending/licensing/LicenseValidator;)V
    .locals 1

    .prologue
    .line 208
    iput-object p1, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;

    invoke-direct {p0}, Lcom/android/vending/licensing/ILicenseResultListener$Stub;-><init>()V

    .line 209
    iput-object p2, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->mValidator:Lcom/android/vending/licensing/LicenseValidator;

    .line 210
    new-instance v0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$1;

    invoke-direct {v0, p0, p1}, Lcom/android/vending/licensing/LicenseChecker$ResultListener$1;-><init>(Lcom/android/vending/licensing/LicenseChecker$ResultListener;Lcom/android/vending/licensing/LicenseChecker;)V

    iput-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->mOnTimeout:Ljava/lang/Runnable;

    .line 217
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->startTimeout()V

    .line 218
    return-void
.end method

.method static synthetic access$000(Lcom/android/vending/licensing/LicenseChecker$ResultListener;)Lcom/android/vending/licensing/LicenseValidator;
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->mValidator:Lcom/android/vending/licensing/LicenseValidator;

    return-object v0
.end method

.method static synthetic access$400(Lcom/android/vending/licensing/LicenseChecker$ResultListener;)V
    .locals 0

    .prologue
    .line 204
    invoke-direct {p0}, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->clearTimeout()V

    return-void
.end method

.method private clearTimeout()V
    .locals 2

    .prologue
    .line 277
    const-string v0, "LicenseChecker"

    const-string v1, "Clearing timeout."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 278
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;

    invoke-static {v0}, Lcom/android/vending/licensing/LicenseChecker;->access$600(Lcom/android/vending/licensing/LicenseChecker;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->mOnTimeout:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 279
    return-void
.end method

.method private startTimeout()V
    .locals 4

    .prologue
    .line 272
    const-string v0, "LicenseChecker"

    const-string v1, "Start monitoring timeout."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 273
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;

    invoke-static {v0}, Lcom/android/vending/licensing/LicenseChecker;->access$600(Lcom/android/vending/licensing/LicenseChecker;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->mOnTimeout:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 274
    return-void
.end method


# virtual methods
.method public verifyLicense(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 228
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;

    invoke-static {v0}, Lcom/android/vending/licensing/LicenseChecker;->access$600(Lcom/android/vending/licensing/LicenseChecker;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;-><init>(Lcom/android/vending/licensing/LicenseChecker$ResultListener;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 269
    return-void
.end method
