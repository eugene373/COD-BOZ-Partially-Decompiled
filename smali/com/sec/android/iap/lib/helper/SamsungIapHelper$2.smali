.class Lcom/sec/android/iap/lib/helper/SamsungIapHelper$2;
.super Ljava/lang/Object;
.source "SamsungIapHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->installIapPackage(Lcom/sec/android/iap/lib/activity/BaseActivity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;


# direct methods
.method constructor <init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$2;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 1690
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 1698
    const-string v2, "samsungapps://ProductDetail/com.sec.android.iap"

    .line 1697
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 1701
    .local v0, "iapDeepLink":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1702
    .local v1, "intent":Landroid/content/Intent;
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1704
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xc

    if-lt v2, v3, :cond_0

    .line 1706
    const v2, 0x14000020

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1716
    :goto_0
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$2;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-static {v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$7(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1717
    return-void

    .line 1712
    :cond_0
    const/high16 v2, 0x14000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_0
.end method
