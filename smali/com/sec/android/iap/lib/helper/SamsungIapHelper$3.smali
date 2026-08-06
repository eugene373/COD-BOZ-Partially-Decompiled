.class Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;
.super Ljava/lang/Object;
.source "SamsungIapHelper.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

.field private final synthetic val$_activity:Landroid/app/Activity;

.field private final synthetic val$_finishActivity:Z

.field private final synthetic val$_onClickRunable:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Ljava/lang/Runnable;ZLandroid/app/Activity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    iput-object p2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;->val$_onClickRunable:Ljava/lang/Runnable;

    iput-boolean p3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;->val$_finishActivity:Z

    iput-object p4, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;->val$_activity:Landroid/app/Activity;

    .line 1811
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "_dialog"    # Landroid/content/DialogInterface;
    .param p2, "_which"    # I

    .prologue
    .line 1816
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;->val$_onClickRunable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 1818
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;->val$_onClickRunable:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1821
    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 1823
    iget-boolean v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;->val$_finishActivity:Z

    if-eqz v0, :cond_1

    .line 1825
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;->val$_activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 1827
    :cond_1
    return-void
.end method
