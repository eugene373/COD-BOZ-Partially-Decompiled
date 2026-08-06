.class Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask$1;
.super Ljava/lang/Object;
.source "SamsungIapHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->onPostExecute(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;


# direct methods
.method constructor <init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask$1;->this$1:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    .line 807
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 813
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask$1;->this$1:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    iget-object v2, v2, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getExtraString()Ljava/lang/String;

    move-result-object v2

    .line 812
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    .line 813
    if-eqz v2, :cond_0

    .line 833
    :goto_0
    return-void

    .line 818
    :cond_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 821
    .local v1, "intent":Landroid/content/Intent;
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask$1;->this$1:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    iget-object v2, v2, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getExtraString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 820
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 823
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 827
    :try_start_0
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask$1;->this$1:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;

    invoke-static {v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->access$2(Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;)Lcom/sec/android/iap/lib/activity/BaseActivity;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 829
    :catch_0
    move-exception v0

    .line 831
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto :goto_0
.end method
