.class public abstract Lcom/sec/android/iap/lib/activity/BaseActivity;
.super Landroid/app/Activity;
.source "BaseActivity.java"


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field protected mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

.field private mIapMode:I

.field protected mInbox:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/sec/android/iap/lib/vo/InboxVo;",
            ">;"
        }
    .end annotation
.end field

.field protected mItemList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/sec/android/iap/lib/vo/ItemVo;",
            ">;"
        }
    .end annotation
.end field

.field private mProgressDialog:Landroid/app/Dialog;

.field protected mPurchaseVo:Lcom/sec/android/iap/lib/vo/PurchaseVo;

.field mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

.field protected mShowProgressDialog:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/sec/android/iap/lib/activity/BaseActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sec/android/iap/lib/activity/BaseActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 24
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 32
    iput v2, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mIapMode:I

    .line 34
    new-instance v0, Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-direct {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;-><init>()V

    iput-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    .line 35
    iput-object v1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mPurchaseVo:Lcom/sec/android/iap/lib/vo/PurchaseVo;

    .line 36
    iput-object v1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mItemList:Ljava/util/ArrayList;

    .line 37
    iput-object v1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mInbox:Ljava/util/ArrayList;

    .line 38
    iput-object v1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;

    .line 39
    iput-boolean v2, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mShowProgressDialog:Z

    .line 44
    iput-object v1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 24
    return-void
.end method

.method static synthetic access$0()Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/sec/android/iap/lib/activity/BaseActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public bindIapService()V
    .locals 2

    .prologue
    .line 168
    sget-object v0, Lcom/sec/android/iap/lib/activity/BaseActivity;->TAG:Ljava/lang/String;

    const-string v1, "start Bind... "

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    new-instance v1, Lcom/sec/android/iap/lib/activity/BaseActivity$1;

    invoke-direct {v1, p0}, Lcom/sec/android/iap/lib/activity/BaseActivity$1;-><init>(Lcom/sec/android/iap/lib/activity/BaseActivity;)V

    invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->bindIapService(Lcom/sec/android/iap/lib/listener/OnIapBindListener;)V

    .line 210
    return-void
.end method

.method public checkIapPackage()Z
    .locals 6

    .prologue
    const/4 v4, 0x1

    .line 121
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v0, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->isInstalledIapPackage(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 125
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v0, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->isValidIapPackage(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    :goto_0
    return v4

    .line 136
    :cond_0
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    const/16 v1, -0x3ea

    .line 137
    const-string v2, "string"

    const-string v3, "IDS_SAPPS_POP_YOUR_PURCHASE_VIA_SAMSUNG_IN_APP_PURCHASE_IS_INVALID_A_FAKE_APPLICATION_HAS_BEEN_DETECTED_CHECK_THE_APP_MSG"

    invoke-static {v2, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 136
    invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 141
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 142
    const-string v1, "string"

    const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 143
    const-string v1, "string"

    const-string v3, "IDS_SAPPS_POP_YOUR_PURCHASE_VIA_SAMSUNG_IN_APP_PURCHASE_IS_INVALID_A_FAKE_APPLICATION_HAS_BEEN_DETECTED_CHECK_THE_APP_MSG"

    invoke-static {v1, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 145
    const/4 v5, 0x0

    move-object v1, p0

    .line 141
    invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 159
    :goto_1
    const/4 v4, 0x0

    goto :goto_0

    .line 155
    :cond_1
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v0, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->installIapPackage(Lcom/sec/android/iap/lib/activity/BaseActivity;)V

    goto :goto_1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 58
    .local v2, "intent":Landroid/content/Intent;
    if-eqz v2, :cond_0

    .line 59
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 60
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "IapMode"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 62
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 63
    .local v1, "extras":Landroid/os/Bundle;
    const-string v3, "IapMode"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    iput v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mIapMode:I

    .line 72
    .end local v1    # "extras":Landroid/os/Bundle;
    :cond_0
    iget v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mIapMode:I

    invoke-static {p0, v3}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getInstance(Landroid/content/Context;I)Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    move-result-object v3

    iput-object v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 73
    sget-boolean v3, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mShowProgressDialog:Z

    iput-boolean v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mShowProgressDialog:Z

    .line 78
    iget-boolean v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mShowProgressDialog:Z

    if-eqz v3, :cond_1

    .line 82
    :try_start_0
    new-instance v3, Landroid/app/Dialog;

    const-string v4, "style"

    const-string v5, "Theme_Empty"

    invoke-static {v4, v5}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    invoke-direct {v3, p0, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;

    .line 83
    iget-object v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;

    const-string v4, "layout"

    const-string v5, "progress_dialog"

    invoke-static {v4, v5}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/app/Dialog;->setContentView(I)V

    .line 84
    iget-object v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 85
    iget-object v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;

    invoke-virtual {v3}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 95
    return-void

    .line 87
    :catch_0
    move-exception v0

    .line 89
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method protected onDestroy()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 217
    iget-boolean v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mShowProgressDialog:Z

    if-eqz v4, :cond_0

    .line 221
    :try_start_0
    iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;

    if-eqz v4, :cond_0

    .line 223
    iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;

    invoke-virtual {v4}, Landroid/app/Dialog;->dismiss()V

    .line 224
    const/4 v4, 0x0

    iput-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 237
    :cond_0
    :goto_0
    iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    if-eqz v4, :cond_4

    .line 240
    iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getOnGetInboxListener()Lcom/sec/android/iap/lib/listener/OnGetInboxListener;

    move-result-object v1

    .line 242
    .local v1, "onGetInboxListener":Lcom/sec/android/iap/lib/listener/OnGetInboxListener;
    if-eqz v1, :cond_1

    .line 244
    iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    iget-object v5, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mInbox:Ljava/util/ArrayList;

    invoke-interface {v1, v4, v5}, Lcom/sec/android/iap/lib/listener/OnGetInboxListener;->onGetItemInbox(Lcom/sec/android/iap/lib/vo/ErrorVo;Ljava/util/ArrayList;)V

    .line 248
    :cond_1
    iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getOnGetItemListener()Lcom/sec/android/iap/lib/listener/OnGetItemListener;

    move-result-object v2

    .line 250
    .local v2, "onItemListener":Lcom/sec/android/iap/lib/listener/OnGetItemListener;
    if-eqz v2, :cond_2

    .line 252
    iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    iget-object v5, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mItemList:Ljava/util/ArrayList;

    invoke-interface {v2, v4, v5}, Lcom/sec/android/iap/lib/listener/OnGetItemListener;->onGetItem(Lcom/sec/android/iap/lib/vo/ErrorVo;Ljava/util/ArrayList;)V

    .line 256
    :cond_2
    iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getOnPaymentListener()Lcom/sec/android/iap/lib/listener/OnPaymentListener;

    move-result-object v3

    .line 258
    .local v3, "onPaymentListener":Lcom/sec/android/iap/lib/listener/OnPaymentListener;
    if-eqz v3, :cond_3

    .line 260
    iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    iget-object v5, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mPurchaseVo:Lcom/sec/android/iap/lib/vo/PurchaseVo;

    invoke-interface {v3, v4, v5}, Lcom/sec/android/iap/lib/listener/OnPaymentListener;->onPayment(Lcom/sec/android/iap/lib/vo/ErrorVo;Lcom/sec/android/iap/lib/vo/PurchaseVo;)V

    .line 265
    :cond_3
    iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->removeAllListener()V

    .line 266
    iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->dispose()V

    .line 267
    iput-object v6, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 272
    .end local v1    # "onGetInboxListener":Lcom/sec/android/iap/lib/listener/OnGetInboxListener;
    .end local v2    # "onItemListener":Lcom/sec/android/iap/lib/listener/OnGetItemListener;
    .end local v3    # "onPaymentListener":Lcom/sec/android/iap/lib/listener/OnPaymentListener;
    :cond_4
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 273
    return-void

    .line 227
    :catch_0
    move-exception v0

    .line 229
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public setErrorVo(Lcom/sec/android/iap/lib/vo/ErrorVo;)V
    .locals 0
    .param p1, "_errorVo"    # Lcom/sec/android/iap/lib/vo/ErrorVo;

    .prologue
    .line 114
    iput-object p1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    .line 115
    return-void
.end method

.method public setInbox(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/sec/android/iap/lib/vo/InboxVo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 109
    .local p1, "_inbox":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/sec/android/iap/lib/vo/InboxVo;>;"
    iput-object p1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mInbox:Ljava/util/ArrayList;

    .line 110
    return-void
.end method

.method public setItemList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/sec/android/iap/lib/vo/ItemVo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 99
    .local p1, "_itemList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/sec/android/iap/lib/vo/ItemVo;>;"
    iput-object p1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mItemList:Ljava/util/ArrayList;

    .line 100
    return-void
.end method

.method public setPurchaseVo(Lcom/sec/android/iap/lib/vo/PurchaseVo;)V
    .locals 0
    .param p1, "_purchaseVo"    # Lcom/sec/android/iap/lib/vo/PurchaseVo;

    .prologue
    .line 104
    iput-object p1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mPurchaseVo:Lcom/sec/android/iap/lib/vo/PurchaseVo;

    .line 105
    return-void
.end method

.method public setShowProgressDialog(Z)V
    .locals 0
    .param p1, "enable"    # Z

    .prologue
    .line 48
    iput-boolean p1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mShowProgressDialog:Z

    .line 49
    return-void
.end method

.method abstract succeedBind()V
.end method
