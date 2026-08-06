.class Lcom/android/vending/licensing/LicenseChecker$ResultListener$1;
.super Ljava/lang/Object;
.source "LicenseChecker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/vending/licensing/LicenseChecker$ResultListener;-><init>(Lcom/android/vending/licensing/LicenseChecker;Lcom/android/vending/licensing/LicenseValidator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;

.field final synthetic val$this$0:Lcom/android/vending/licensing/LicenseChecker;


# direct methods
.method constructor <init>(Lcom/android/vending/licensing/LicenseChecker$ResultListener;Lcom/android/vending/licensing/LicenseChecker;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$1;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;

    iput-object p2, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$1;->val$this$0:Lcom/android/vending/licensing/LicenseChecker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 212
    const-string v0, "LicenseChecker"

    const-string v1, "Check timed out."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$1;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;

    iget-object v0, v0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;

    iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$1;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;

    invoke-static {v1}, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->access$000(Lcom/android/vending/licensing/LicenseChecker$ResultListener;)Lcom/android/vending/licensing/LicenseValidator;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/android/vending/licensing/LicenseChecker;->access$100(Lcom/android/vending/licensing/LicenseChecker;Lcom/android/vending/licensing/LicenseValidator;)V

    .line 214
    iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$1;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;

    iget-object v0, v0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;

    iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$1;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;

    invoke-static {v1}, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->access$000(Lcom/android/vending/licensing/LicenseChecker$ResultListener;)Lcom/android/vending/licensing/LicenseValidator;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/android/vending/licensing/LicenseChecker;->access$200(Lcom/android/vending/licensing/LicenseChecker;Lcom/android/vending/licensing/LicenseValidator;)V

    .line 215
    return-void
.end method
