.class Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;
.super Landroid/os/AsyncTask;
.source "SamsungIapHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GetInboxListTask"
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

.field private mEndDate:Ljava/lang/String;

.field private mEndNum:I

.field private mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

.field private mInbox:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/sec/android/iap/lib/vo/InboxVo;",
            ">;"
        }
    .end annotation
.end field

.field private mItemGroupId:Ljava/lang/String;

.field private mStartDate:Ljava/lang/String;

.field private mStartNum:I

.field final synthetic this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;


# direct methods
.method public constructor <init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p2, "_activity"    # Lcom/sec/android/iap/lib/activity/BaseActivity;
    .param p3, "_itemGroupId"    # Ljava/lang/String;
    .param p4, "_startNum"    # I
    .param p5, "_endNum"    # I
    .param p6, "_startDate"    # Ljava/lang/String;
    .param p7, "_endDate"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 1168
    iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    .line 1159
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 1149
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    .line 1150
    const-string v0, ""

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mItemGroupId:Ljava/lang/String;

    .line 1151
    iput v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mStartNum:I

    .line 1152
    iput v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mEndNum:I

    .line 1153
    const-string v0, ""

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mStartDate:Ljava/lang/String;

    .line 1154
    const-string v0, ""

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mEndDate:Ljava/lang/String;

    .line 1156
    new-instance v0, Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-direct {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;-><init>()V

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    .line 1157
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mInbox:Ljava/util/ArrayList;

    .line 1169
    iput-object p2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    .line 1170
    iput-object p3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mItemGroupId:Ljava/lang/String;

    .line 1171
    iput p4, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mStartNum:I

    .line 1172
    iput p5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mEndNum:I

    .line 1173
    iput-object p6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mStartDate:Ljava/lang/String;

    .line 1174
    iput-object p7, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mEndDate:Ljava/lang/String;

    .line 1176
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->setErrorVo(Lcom/sec/android/iap/lib/vo/ErrorVo;)V

    .line 1177
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mInbox:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->setInbox(Ljava/util/ArrayList;)V

    .line 1178
    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 11
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 1187
    :try_start_0
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mItemGroupId:Ljava/lang/String;

    .line 1188
    iget v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mStartNum:I

    .line 1189
    iget v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mEndNum:I

    .line 1190
    iget-object v4, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mStartDate:Ljava/lang/String;

    .line 1191
    iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mEndDate:Ljava/lang/String;

    .line 1187
    invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getItemsInbox(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    .line 1196
    .local v6, "bundle":Landroid/os/Bundle;
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    const-string v1, "STATUS_CODE"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 1197
    const-string v2, "ERROR_STRING"

    invoke-virtual {v6, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1196
    invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 1203
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I

    move-result v0

    if-nez v0, :cond_2

    .line 1206
    const-string v0, "RESULT_LIST"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v10

    .line 1208
    .local v10, "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    if-eqz v10, :cond_1

    .line 1210
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-nez v1, :cond_0

    .line 1241
    .end local v10    # "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :goto_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .end local v6    # "bundle":Landroid/os/Bundle;
    :goto_2
    return-object v0

    .line 1210
    .restart local v6    # "bundle":Landroid/os/Bundle;
    .restart local v10    # "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_0
    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 1212
    .local v9, "itemString":Ljava/lang/String;
    new-instance v8, Lcom/sec/android/iap/lib/vo/InboxVo;

    invoke-direct {v8, v9}, Lcom/sec/android/iap/lib/vo/InboxVo;-><init>(Ljava/lang/String;)V

    .line 1213
    .local v8, "inboxVo":Lcom/sec/android/iap/lib/vo/InboxVo;
    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mInbox:Ljava/util/ArrayList;

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 1230
    .end local v6    # "bundle":Landroid/os/Bundle;
    .end local v8    # "inboxVo":Lcom/sec/android/iap/lib/vo/InboxVo;
    .end local v9    # "itemString":Ljava/lang/String;
    .end local v10    # "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :catch_0
    move-exception v7

    .line 1232
    .local v7, "e":Ljava/lang/Exception;
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    .line 1233
    const/16 v1, -0x3ea

    .line 1234
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    .line 1235
    const-string v3, "string"

    const-string v4, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"

    invoke-static {v3, v4}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 1234
    invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1232
    invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V

    .line 1237
    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V

    .line 1238
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_2

    .line 1218
    .end local v7    # "e":Ljava/lang/Exception;
    .restart local v6    # "bundle":Landroid/os/Bundle;
    .restart local v10    # "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_1
    :try_start_2
    invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Bundle Value \'RESULT_LIST\' is null."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 1226
    .end local v10    # "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_2
    invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1
.end method

.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 9
    .param p1, "_result"    # Ljava/lang/Boolean;

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 1249
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1253
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I

    move-result v0

    if-nez v0, :cond_1

    .line 1258
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    if-eqz v0, :cond_0

    .line 1260
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    invoke-virtual {v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V

    .line 1295
    :cond_0
    :goto_0
    return-void

    .line 1271
    :cond_1
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    .line 1272
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    const-string v3, "string"

    const-string v6, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v3, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1273
    iget-object v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;

    invoke-virtual {v3}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;

    move-result-object v3

    .line 1271
    invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    goto :goto_0

    .line 1286
    :cond_2
    iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;

    iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    .line 1287
    iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    const-string v3, "string"

    const-string v6, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"

    invoke-static {v3, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 1288
    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;

    const-string v7, "string"

    const-string v8, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"

    invoke-static {v7, v8}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v6, v7}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1289
    const-string v6, "[Lib_InboxList]"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 1288
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1286
    invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method
