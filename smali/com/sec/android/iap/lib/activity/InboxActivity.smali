.class public Lcom/sec/android/iap/lib/activity/InboxActivity;
.super Lcom/sec/android/iap/lib/activity/BaseActivity;
.source "InboxActivity.java"


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mEndDate:Ljava/lang/String;

.field private mEndNum:I

.field private mItemGroupId:Ljava/lang/String;

.field private mStartDate:Ljava/lang/String;

.field private mStartNum:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/sec/android/iap/lib/activity/InboxActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sec/android/iap/lib/activity/InboxActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 11
    invoke-direct {p0}, Lcom/sec/android/iap/lib/activity/BaseActivity;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mItemGroupId:Ljava/lang/String;

    .line 19
    iput v1, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mStartNum:I

    .line 20
    iput v1, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mEndNum:I

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mStartDate:Ljava/lang/String;

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mEndDate:Ljava/lang/String;

    .line 11
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 6
    .param p1, "_requestCode"    # I
    .param p2, "_resultCode"    # I
    .param p3, "_intent"    # Landroid/content/Intent;

    .prologue
    const/4 v4, 0x1

    .line 87
    packed-switch p1, :pswitch_data_0

    .line 123
    :cond_0
    :goto_0
    return-void

    .line 95
    :pswitch_0
    const/4 v0, -0x1

    if-ne v0, p2, :cond_1

    .line 101
    invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/InboxActivity;->bindIapService()V

    goto :goto_0

    .line 107
    :cond_1
    if-nez p2, :cond_0

    .line 109
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    .line 110
    const-string v1, "string"

    const-string v2, "IDS_SAPPS_POP_PAYMENT_CANCELLED"

    invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/InboxActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 109
    invoke-virtual {v0, v4, v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 112
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 113
    const-string v1, "string"

    const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/InboxActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 114
    const-string v1, "string"

    const-string v3, "IDS_SAPPS_POP_PAYMENT_CANCELLED"

    invoke-static {v1, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/InboxActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 116
    const/4 v5, 0x0

    move-object v1, p0

    .line 112
    invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    goto :goto_0

    .line 87
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 27
    invoke-super {p0, p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 32
    invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/InboxActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 34
    .local v1, "intent":Landroid/content/Intent;
    if-eqz v1, :cond_1

    .line 35
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 36
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "ItemGroupId"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 37
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "StartNum"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 38
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "EndNum"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 39
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "StartDate"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 40
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "EndDate"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 42
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 44
    .local v0, "extras":Landroid/os/Bundle;
    const-string v2, "ItemGroupId"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mItemGroupId:Ljava/lang/String;

    .line 45
    const-string v2, "StartNum"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mStartNum:I

    .line 46
    const-string v2, "EndNum"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mEndNum:I

    .line 47
    const-string v2, "StartDate"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mStartDate:Ljava/lang/String;

    .line 48
    const-string v2, "EndDate"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mEndDate:Ljava/lang/String;

    .line 69
    .end local v0    # "extras":Landroid/os/Bundle;
    :goto_0
    invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/InboxActivity;->checkIapPackage()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 71
    iget-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    invoke-virtual {v2, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->startAccountActivity(Landroid/app/Activity;)V

    .line 74
    :cond_0
    return-void

    .line 58
    :cond_1
    iget-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    const/16 v3, -0x3ea

    .line 59
    const-string v4, "string"

    const-string v5, "IDS_SAPPS_POP_AN_INVALID_VALUE_HAS_BEEN_PROVIDED_FOR_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v4, v5}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p0, v4}, Lcom/sec/android/iap/lib/activity/InboxActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 58
    invoke-virtual {v2, v3, v4}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 62
    invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/InboxActivity;->finish()V

    goto :goto_0
.end method

.method protected succeedBind()V
    .locals 7

    .prologue
    .line 131
    iget-object v0, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 132
    iget-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mItemGroupId:Ljava/lang/String;

    .line 133
    iget v3, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mStartNum:I

    .line 134
    iget v4, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mEndNum:I

    .line 135
    iget-object v5, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mStartDate:Ljava/lang/String;

    .line 136
    iget-object v6, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mEndDate:Ljava/lang/String;

    move-object v1, p0

    .line 131
    invoke-virtual/range {v0 .. v6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->safeGetItemInboxTask(Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 137
    return-void
.end method
