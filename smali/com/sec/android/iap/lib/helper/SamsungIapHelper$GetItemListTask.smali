.class Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;
.super Landroid/os/AsyncTask;
.source "SamsungIapHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GetItemListTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

.field private mEndNum:I

.field mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

.field private mItemGroupId:Ljava/lang/String;

.field mItemList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/sec/android/iap/lib/vo/ItemVo;",
            ">;"
        }
    .end annotation
.end field

.field private mItemType:Ljava/lang/String;

.field private mStartNum:I

.field final synthetic this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;


# direct methods
.method public constructor <init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;)V
    .locals 2
    .param p2, "_activity"    # Lcom/sec/android/iap/lib/activity/BaseActivity;
    .param p3, "_itemGroupId"    # Ljava/lang/String;
    .param p4, "_startNum"    # I
    .param p5, "_endNum"    # I
    .param p6, "_itemType"    # Ljava/lang/String;

    .prologue
    .line 702
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 694
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 684
    const-string v0, ""

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemGroupId:Ljava/lang/String;

    .line 685
    const/4 v0, 0x1

    iput v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mStartNum:I

    .line 686
    const/16 v0, 0xf

    iput v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mEndNum:I

    .line 687
    const-string v0, ""

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemType:Ljava/lang/String;

    .line 689
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    .line 691
    new-instance v0, Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-direct {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;-><init>()V

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    .line 692
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemList:Ljava/util/ArrayList;

    .line 703
    iput-object p2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    .line 704
    iput-object p3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemGroupId:Ljava/lang/String;

    .line 705
    iput p4, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mStartNum:I

    .line 706
    iput p5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mEndNum:I

    .line 707
    iput-object p6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemType:Ljava/lang/String;

    .line 709
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->setErrorVo(Lcom/sec/android/iap/lib/vo/ErrorVo;)V

    .line 710
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->setItemList(Ljava/util/ArrayList;)V

    .line 711
    return-void
.end method

.method static synthetic access$2(Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;)Lcom/sec/android/iap/lib/activity/BaseActivity;
    .locals 1

    .prologue
    .line 689
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    return-object v0
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 10
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 720
    :try_start_0
    iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemGroupId:Ljava/lang/String;

    .line 721
    iget v7, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mStartNum:I

    .line 722
    iget v8, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mEndNum:I

    .line 723
    iget-object v9, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemType:Ljava/lang/String;

    .line 720
    invoke-virtual {v5, v6, v7, v8, v9}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getItemList(Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 728
    .local v0, "bundle":Landroid/os/Bundle;
    iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    const-string v6, "STATUS_CODE"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 729
    const-string v7, "ERROR_STRING"

    invoke-virtual {v0, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 728
    invoke-virtual {v5, v6, v7}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 731
    iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    .line 732
    const-string v6, "IAP_UPGRADE_URL"

    .line 731
    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setExtraString(Ljava/lang/String;)V

    .line 738
    iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v5}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I

    move-result v5

    if-nez v5, :cond_2

    .line 741
    const-string v5, "RESULT_LIST"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 743
    .local v3, "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    if-eqz v3, :cond_1

    .line 745
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    if-nez v6, :cond_0

    .line 776
    .end local v3    # "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :goto_1
    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .end local v0    # "bundle":Landroid/os/Bundle;
    :goto_2
    return-object v5

    .line 745
    .restart local v0    # "bundle":Landroid/os/Bundle;
    .restart local v3    # "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_0
    :try_start_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 747
    .local v2, "itemString":Ljava/lang/String;
    new-instance v4, Lcom/sec/android/iap/lib/vo/ItemVo;

    invoke-direct {v4, v2}, Lcom/sec/android/iap/lib/vo/ItemVo;-><init>(Ljava/lang/String;)V

    .line 748
    .local v4, "itemVo":Lcom/sec/android/iap/lib/vo/ItemVo;
    iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemList:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 765
    .end local v0    # "bundle":Landroid/os/Bundle;
    .end local v2    # "itemString":Ljava/lang/String;
    .end local v3    # "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v4    # "itemVo":Lcom/sec/android/iap/lib/vo/ItemVo;
    :catch_0
    move-exception v1

    .line 767
    .local v1, "e":Ljava/lang/Exception;
    iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    .line 768
    const/16 v6, -0x3ea

    .line 769
    iget-object v7, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    .line 770
    const-string v8, "string"

    const-string v9, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"

    invoke-static {v8, v9}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    .line 769
    invoke-virtual {v7, v8}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 767
    invoke-virtual {v5, v6, v7}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 772
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 773
    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_2

    .line 753
    .end local v1    # "e":Ljava/lang/Exception;
    .restart local v0    # "bundle":Landroid/os/Bundle;
    .restart local v3    # "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_1
    :try_start_2
    invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Bundle Value \'RESULT_LIST\' is null."

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 761
    .end local v3    # "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_2
    invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v6}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1
.end method

.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 12
    .param p1, "_result"    # Ljava/lang/Boolean;

    .prologue
    const/4 v11, 0x0

    const/4 v4, 0x1

    .line 784
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 788
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I

    move-result v0

    if-nez v0, :cond_1

    .line 793
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    if-eqz v0, :cond_0

    .line 795
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V

    .line 876
    :cond_0
    :goto_0
    return-void

    .line 802
    :cond_1
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I

    move-result v0

    const/16 v1, -0x3e9

    if-ne v0, v1, :cond_2

    .line 807
    new-instance v5, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask$1;

    invoke-direct {v5, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask$1;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;)V

    .line 839
    .local v5, "OkBtnRunnable":Ljava/lang/Runnable;
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    .line 840
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    const-string v3, "string"

    const-string v6, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v3, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 841
    iget-object v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v3}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;

    move-result-object v3

    .line 839
    invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 846
    invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 853
    .end local v5    # "OkBtnRunnable":Ljava/lang/Runnable;
    :cond_2
    iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    iget-object v7, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    .line 854
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    const-string v1, "string"

    const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 855
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;

    move-result-object v9

    move v10, v4

    .line 853
    invoke-virtual/range {v6 .. v11}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    .line 859
    invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 868
    :cond_3
    iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    iget-object v7, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    .line 869
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    const-string v1, "string"

    const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 870
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    const-string v2, "string"

    const-string v3, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"

    invoke-static {v2, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 871
    const-string v1, "[Lib_ItemList]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 870
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    move v10, v4

    .line 868
    invoke-virtual/range {v6 .. v11}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    goto/16 :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method
