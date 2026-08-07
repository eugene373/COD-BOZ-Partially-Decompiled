package com.ideaworks3d.marmalade.s3eSamsungInAppPurchasing

// Auto-emitted from smali source: s3eSamsungInAppPurchasing.java.
// 15 fields, 21 methods.

open class s3eSamsungInAppPurchasing: com.sec.android.iap.lib.listener.OnPaymentListener, com.sec.android.iap.lib.listener.OnGetInboxListener, com.sec.android.iap.lib.listener.OnGetItemListener {
    constructor()

    public fun getActivity(): android.app.Activity { return TODO("body: ()Landroid/app/Activity;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         return-object v0
    */

    public fun getApplicationContext(): android.content.Context { return TODO("body: ()Landroid/content/Context;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onGetItem(p0: com.sec.android.iap.lib.vo.ErrorVo, p1: java.util.ArrayList) { /* TODO(body): (Lcom/sec/android/iap/lib/vo/ErrorVo;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/sec/android/iap/lib/vo/ErrorVo;",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/sec/android/iap/lib/vo/ItemVo;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         const-string v1, "onGetItem..."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->s3eGetStatus(I)I
    //         move-result v2
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         if-ge v1, v0, :cond_1
    //         invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/sec/android/iap/lib/vo/ItemVo;
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->printItemInfo(Lcom/sec/android/iap/lib/vo/BaseVo;)V
    //         invoke-static {v2, v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_itemDataCallback(ILcom/sec/android/iap/lib/vo/ItemVo;)V
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         const/4 v0, 0x0
    //         invoke-static {v2, v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_itemDataCallback(ILcom/sec/android/iap/lib/vo/ItemVo;)V
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         const-string v1, "Failed to retrieve the item list"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_1
    //         return-void
    */

    public fun onGetItemInbox(p0: com.sec.android.iap.lib.vo.ErrorVo, p1: java.util.ArrayList) { /* TODO(body): (Lcom/sec/android/iap/lib/vo/ErrorVo;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/sec/android/iap/lib/vo/ErrorVo;",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/sec/android/iap/lib/vo/InboxVo;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const/4 v3, 0x0
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         const-string v1, "onGetItemInbox..."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->s3eGetStatus(I)I
    //         move-result v2
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         if-ge v1, v0, :cond_0
    //         invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/sec/android/iap/lib/vo/InboxVo;
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->printPurchasedItemInfo(Lcom/sec/android/iap/lib/vo/InboxVo;)V
    //         invoke-static {v2, v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_entitlementCallback(ILcom/sec/android/iap/lib/vo/InboxVo;)V
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_FINISHED:I
    //         invoke-static {v0, v3}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_entitlementCallback(ILcom/sec/android/iap/lib/vo/InboxVo;)V
    //         :goto_1
    //         return-void
    //         :cond_1
    //         invoke-static {v2, v3}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_entitlementCallback(ILcom/sec/android/iap/lib/vo/InboxVo;)V
    //         goto :goto_1
    */

    public fun onPayment(p0: com.sec.android.iap.lib.vo.ErrorVo, p1: com.sec.android.iap.lib.vo.PurchaseVo) { /* TODO(body): (Lcom/sec/android/iap/lib/vo/ErrorVo;Lcom/sec/android/iap/lib/vo/PurchaseVo;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         const-string v1, "onPayment... "
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->s3eGetStatus(I)I
    //         move-result v0
    //         invoke-static {v0, p2}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->native_purchaseFinishedCallback(ILcom/sec/android/iap/lib/vo/PurchaseVo;)V
    //         return-void
    */

    public fun printItemInfo(p0: com.sec.android.iap.lib.vo.BaseVo) { /* TODO(body): (Lcom/sec/android/iap/lib/vo/BaseVo;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Item name: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Item Id: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Price: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemPriceString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun printPurchasedItemInfo(p0: com.sec.android.iap.lib.vo.InboxVo) { /* TODO(body): (Lcom/sec/android/iap/lib/vo/InboxVo;)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->printItemInfo(Lcom/sec/android/iap/lib/vo/BaseVo;)V
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Payment Id: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/InboxVo;->getPaymentId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Purchase Date: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/vo/InboxVo;->getPurchaseDate()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun s3eSamsungInAppPurchasingEnumerateEntitlements(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    /*
    //         .locals 7
    //         new-instance v0, Ljava/text/SimpleDateFormat;
    //         const-string v1, "yyyyMMdd"
    //         invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    //         new-instance v1, Ljava/util/Date;
    //         invoke-direct {v1}, Ljava/util/Date;-><init>()V
    //         invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         sget v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mMode:I
    //         invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getInstance(Landroid/content/Context;I)Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         move-result-object v0
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mGroupID:Ljava/lang/String;
    //         const-string v4, "20131031"
    //         move v2, p1
    //         move v3, p2
    //         move-object v6, p0
    //         invoke-virtual/range {v0 .. v6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getItemInboxList(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/sec/android/iap/lib/listener/OnGetInboxListener;)V
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun s3eSamsungInAppPurchasingGetItemData(p0: Int, p1: Int): Int { return TODO("body: (II)I") }
    /*
    //         .locals 7
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         sget v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mMode:I
    //         invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getInstance(Landroid/content/Context;I)Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         move-result-object v0
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mGroupID:Ljava/lang/String;
    //         const-string v4, "10"
    //         sget v5, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mMode:I
    //         move v2, p1
    //         move v3, p2
    //         move-object v6, p0
    //         invoke-virtual/range {v0 .. v6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getItemList(Ljava/lang/String;IILjava/lang/String;ILcom/sec/android/iap/lib/listener/OnGetItemListener;)V
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun s3eSamsungInAppPurchasingInit(p0: String, p1: Boolean): Int { return TODO("body: (Ljava/lang/String;Z)I") }
    /*
    //         .locals 2
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         const-string v1, "s3eSamsungInAppPurchasing... Initializing"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         sput-boolean p2, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mShowProgressDialog:Z
    //         sput-object p1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mGroupID:Ljava/lang/String;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         sput-object v0, Lcom/sec/android/iap/lib/ResourceUtility;->mContext:Landroid/app/Activity;
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         const-string v1, "s3eSamsungInAppPurchasing... Creating Plasma instance"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun s3eSamsungInAppPurchasingIsAvailable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun s3eSamsungInAppPurchasingPurchaseItem(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         sget v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mMode:I
    //         invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getInstance(Landroid/content/Context;I)Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         move-result-object v0
    //         sget-object v1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mGroupID:Ljava/lang/String;
    //         invoke-virtual {v0, v1, p1, v2, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->startPayment(Ljava/lang/String;Ljava/lang/String;ZLcom/sec/android/iap/lib/listener/OnPaymentListener;)V
    //         return v2
    */

    public fun s3eSamsungInAppPurchasingSetDeveloperState(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         sput p1, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->mMode:I
    //         return-void
    */

    public fun s3eSamsungInAppPurchasingTerminate() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "s3eSamsunInAppPurchasing"
    //         const-string v1, "s3eSamsungInAppPurchasingTerminate"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    companion object {
    private var S3E_SAMSUNGINAPPPURCHASING_RESULT_ERROR: Int
    private var S3E_SAMSUNGINAPPPURCHASING_RESULT_OK: Int
    private var S3E_SAMSUNGINAPPPURCHASING_STATUS_CANCELLED: Int
    private var S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORALREADYPURCHASED: Int
    private var S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORINITIALIZATION: Int
    private var S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORNEEDAPPUPGRADE: Int
    private var S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORWHILERUNNING: Int
    private var S3E_SAMSUNGINAPPPURCHASING_STATUS_FINISHED: Int
    private var S3E_SAMSUNGINAPPPURCHASING_STATUS_PROCESSERROR: Int
    private var S3E_SAMSUNGINAPPPURCHASING_STATUS_PRODUCTDOESNOTEXIST: Int
    private var S3E_SAMSUNGINAPPPURCHASING_STATUS_SUCCESSFUL: Int
    private var S3E_SAMSUNGINAPPPURCHASING_UNAVAILABLE: Int
    @JvmField public val TAG: String = "s3eSamsunInAppPurchasing"
    private var mGroupID: String
    private var mMode: Int

    private external @JvmStatic fun native_entitlementCallback(p0: Int, p1: com.sec.android.iap.lib.vo.InboxVo)

    private external @JvmStatic fun native_itemDataCallback(p0: Int, p1: com.sec.android.iap.lib.vo.ItemVo)

    private external @JvmStatic fun native_purchaseFinishedCallback(p0: Int, p1: com.sec.android.iap.lib.vo.PurchaseVo)

    private external @JvmStatic fun native_sdkAvailableCallback()

    private @JvmStatic fun s3eGetStatus(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         sparse-switch p0, :sswitch_data_0
    //         sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_PROCESSERROR:I
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_SUCCESSFUL:I
    //         goto :goto_0
    //         :sswitch_1
    //         sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_CANCELLED:I
    //         goto :goto_0
    //         :sswitch_2
    //         sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORINITIALIZATION:I
    //         goto :goto_0
    //         :sswitch_3
    //         sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORNEEDAPPUPGRADE:I
    //         goto :goto_0
    //         :sswitch_4
    //         sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_PROCESSERROR:I
    //         goto :goto_0
    //         :sswitch_5
    //         sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORALREADYPURCHASED:I
    //         goto :goto_0
    //         :sswitch_6
    //         sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_ERRORWHILERUNNING:I
    //         goto :goto_0
    //         :sswitch_7
    //         sget v0, Lcom/ideaworks3d/marmalade/s3eSamsungInAppPurchasing/s3eSamsungInAppPurchasing;->S3E_SAMSUNGINAPPPURCHASING_STATUS_PRODUCTDOESNOTEXIST:I
    //         goto :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             -0x3ed -> :sswitch_7
    //             -0x3ec -> :sswitch_6
    //             -0x3eb -> :sswitch_5
    //             -0x3ea -> :sswitch_4
    //             -0x3e9 -> :sswitch_3
    //             -0x3e8 -> :sswitch_2
    //             0x0 -> :sswitch_0
    //             0x1 -> :sswitch_1
    //         .end sparse-switch
    */

    }
}
