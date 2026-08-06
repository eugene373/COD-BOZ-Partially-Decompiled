.class public Lcom/sec/android/iap/lib/activity/PaymentActivity;
.super Lcom/sec/android/iap/lib/activity/BaseActivity;
.source "PaymentActivity.java"

# interfaces
.implements Lcom/sec/android/iap/lib/listener/OnInitIapListener;


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mItemGroupId:Ljava/lang/String;

.field private mItemId:Ljava/lang/String;

.field private mShowSuccessDialog:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-class v0, Lcom/sec/android/iap/lib/activity/PaymentActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 14
    invoke-direct {p0}, Lcom/sec/android/iap/lib/activity/BaseActivity;-><init>()V

    .line 19
    iput-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mItemGroupId:Ljava/lang/String;

    .line 22
    iput-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mItemId:Ljava/lang/String;

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mShowSuccessDialog:Z

    .line 14
    return-void
.end method

.method private finishPurchase(Landroid/content/Intent;)V
    .locals 8
    .param p1, "_intent"    # Landroid/content/Intent;

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 193
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 195
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    .line 197
    .local v6, "extras":Landroid/os/Bundle;
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    .line 198
    const-string v1, "STATUS_CODE"

    .line 197
    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 200
    const-string v2, "ERROR_STRING"

    .line 199
    invoke-virtual {v6, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 197
    invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 204
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I

    move-result v0

    if-nez v0, :cond_0

    .line 208
    new-instance v0, Lcom/sec/android/iap/lib/vo/PurchaseVo;

    .line 209
    const-string v1, "RESULT_OBJECT"

    .line 208
    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sec/android/iap/lib/vo/PurchaseVo;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mPurchaseVo:Lcom/sec/android/iap/lib/vo/PurchaseVo;

    .line 214
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 215
    iget-object v1, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mPurchaseVo:Lcom/sec/android/iap/lib/vo/PurchaseVo;

    .line 216
    iget-boolean v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mShowSuccessDialog:Z

    .line 214
    invoke-virtual {v0, p0, v1, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->verifyPurchaseResult(Lcom/sec/android/iap/lib/activity/BaseActivity;Lcom/sec/android/iap/lib/vo/PurchaseVo;Z)V

    .line 249
    .end local v6    # "extras":Landroid/os/Bundle;
    :goto_0
    return-void

    .line 224
    .restart local v6    # "extras":Landroid/os/Bundle;
    :cond_0
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 225
    const-string v1, "string"

    const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 226
    iget-object v1, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;

    move-result-object v3

    move-object v1, p0

    .line 224
    invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    goto :goto_0

    .line 237
    .end local v6    # "extras":Landroid/os/Bundle;
    :cond_1
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 238
    const-string v1, "string"

    const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 239
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "string"

    const-string v7, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"

    invoke-static {v3, v7}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    const-string v3, "[Lib_Payment]"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 239
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v1, p0

    .line 237
    invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 244
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    const/16 v1, -0x3ea

    .line 245
    const-string v2, "string"

    const-string v3, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"

    invoke-static {v2, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 244
    invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 6
    .param p1, "_requestCode"    # I
    .param p2, "_resultCode"    # I
    .param p3, "_intent"    # Landroid/content/Intent;

    .prologue
    const/4 v5, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x1

    .line 99
    packed-switch p1, :pswitch_data_0

    .line 169
    :cond_0
    :goto_0
    return-void

    .line 107
    :pswitch_0
    if-ne v3, p2, :cond_1

    .line 109
    invoke-direct {p0, p3}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->finishPurchase(Landroid/content/Intent;)V

    goto :goto_0

    .line 114
    :cond_1
    if-nez p2, :cond_0

    .line 116
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    .line 118
    const-string v1, "string"

    const-string v2, "IDS_SAPPS_POP_PAYMENT_CANCELLED"

    invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 116
    invoke-virtual {v0, v4, v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 120
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 121
    const-string v1, "string"

    const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 122
    iget-object v1, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;

    move-result-object v3

    move-object v1, p0

    .line 120
    invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    goto :goto_0

    .line 137
    :pswitch_1
    sget-object v0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Samsung Account Result : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    if-ne v3, p2, :cond_2

    .line 145
    invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->bindIapService()V

    goto :goto_0

    .line 153
    :cond_2
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    .line 155
    const-string v1, "string"

    const-string v2, "IDS_SAPPS_POP_PAYMENT_CANCELLED"

    invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 153
    invoke-virtual {v0, v4, v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 158
    const-string v1, "string"

    const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 159
    const-string v1, "string"

    const-string v3, "IDS_SAPPS_POP_PAYMENT_CANCELLED"

    invoke-static {v1, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object v1, p0

    .line 157
    invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    goto :goto_0

    .line 99
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 30
    invoke-super {p0, p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 34
    invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 36
    .local v1, "intent":Landroid/content/Intent;
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 37
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "ItemGroupId"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 38
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "ItemId"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 39
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "ShowSuccessDialog"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 41
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 43
    .local v0, "extras":Landroid/os/Bundle;
    const-string v2, "ItemGroupId"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mItemGroupId:Ljava/lang/String;

    .line 44
    const-string v2, "ItemId"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mItemId:Ljava/lang/String;

    .line 45
    const-string v2, "ShowSuccessDialog"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mShowSuccessDialog:Z

    .line 65
    .end local v0    # "extras":Landroid/os/Bundle;
    :goto_0
    iget-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v2, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->setOnInitIapListener(Lcom/sec/android/iap/lib/listener/OnInitIapListener;)V

    .line 71
    invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->checkIapPackage()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 73
    sget-object v2, Lcom/sec/android/iap/lib/activity/PaymentActivity;->TAG:Ljava/lang/String;

    const-string v3, "Samsung Account Login..."

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    iget-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v2, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->startAccountActivity(Landroid/app/Activity;)V

    .line 77
    :cond_0
    return-void

    .line 55
    :cond_1
    iget-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    const/16 v3, -0x3ea

    .line 56
    const-string v4, "string"

    const-string v5, "IDS_SAPPS_POP_AN_INVALID_VALUE_HAS_BEEN_PROVIDED_FOR_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v4, v5}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p0, v4}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 55
    invoke-virtual {v2, v3, v4}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 59
    invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->finish()V

    goto :goto_0
.end method

.method public onSucceedInitIap()V
    .locals 4

    .prologue
    .line 177
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 179
    const/4 v1, 0x1

    .line 180
    iget-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mItemGroupId:Ljava/lang/String;

    .line 181
    iget-object v3, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mItemId:Ljava/lang/String;

    .line 177
    invoke-virtual {v0, p0, v1, v2, v3}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->startPaymentActivity(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;)V

    .line 183
    return-void
.end method

.method protected succeedBind()V
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v0, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->safeInitIap(Lcom/sec/android/iap/lib/activity/BaseActivity;)V

    .line 86
    return-void
.end method
