.class Lcom/sec/android/iap/lib/helper/SamsungIapHelper$4;
.super Ljava/lang/Object;
.source "SamsungIapHelper.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


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


# direct methods
.method constructor <init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$4;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    iput-object p2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$4;->val$_activity:Landroid/app/Activity;

    .line 1832
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 1837
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$4;->val$_activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 1838
    return-void
.end method
