.class public Lcom/sec/android/iap/lib/vo/InboxVo;
.super Lcom/sec/android/iap/lib/vo/BaseVo;
.source "InboxVo.java"


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mJsonString:Ljava/lang/String;

.field private mPaymentId:Ljava/lang/String;

.field private mPurchaseDate:Ljava/lang/String;

.field private mSubscriptionEndDate:Ljava/lang/String;

.field private mType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/sec/android/iap/lib/vo/InboxVo;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sec/android/iap/lib/vo/InboxVo;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .param p1, "_jsonString"    # Ljava/lang/String;

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/sec/android/iap/lib/vo/BaseVo;-><init>(Ljava/lang/String;)V

    .line 21
    const-string v2, ""

    iput-object v2, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mJsonString:Ljava/lang/String;

    .line 27
    invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/vo/InboxVo;->setJsonString(Ljava/lang/String;)V

    .line 28
    sget-object v2, Lcom/sec/android/iap/lib/vo/InboxVo;->TAG:Ljava/lang/String;

    iget-object v3, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mJsonString:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 34
    .local v1, "jObject":Lorg/json/JSONObject;
    const-string v2, "mType"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/InboxVo;->setType(Ljava/lang/String;)V

    .line 35
    const-string v2, "mPaymentId"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/InboxVo;->setPaymentId(Ljava/lang/String;)V

    .line 37
    const-string v2, "mPurchaseDate"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/sec/android/iap/lib/vo/InboxVo;->getDateString(J)Ljava/lang/String;

    move-result-object v2

    .line 36
    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/InboxVo;->setPurchaseDate(Ljava/lang/String;)V

    .line 39
    const-string v2, "mSubscriptionEndDate"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/sec/android/iap/lib/vo/InboxVo;->getDateString(J)Ljava/lang/String;

    move-result-object v2

    .line 38
    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/InboxVo;->setSubscriptionEndDate(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .end local v1    # "jObject":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 41
    :catch_0
    move-exception v0

    .line 43
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public dump()Ljava/lang/String;
    .locals 3

    .prologue
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->dump()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 102
    .local v0, "dump":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "Type                : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/InboxVo;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 103
    const-string v2, "PurchaseDate        : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/InboxVo;->getPurchaseDate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 104
    const-string v2, "SubscriptionEndDate : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/InboxVo;->getSubscriptionEndDate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 105
    const-string v2, "PaymentID           : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/InboxVo;->getPaymentId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 107
    return-object v0
.end method

.method public getJsonString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mJsonString:Ljava/lang/String;

    return-object v0
.end method

.method public getPaymentId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mPaymentId:Ljava/lang/String;

    return-object v0
.end method

.method public getPurchaseDate()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mPurchaseDate:Ljava/lang/String;

    return-object v0
.end method

.method public getSubscriptionEndDate()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mSubscriptionEndDate:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mType:Ljava/lang/String;

    return-object v0
.end method

.method public setJsonString(Ljava/lang/String;)V
    .locals 0
    .param p1, "_jsonString"    # Ljava/lang/String;

    .prologue
    .line 95
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mJsonString:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public setPaymentId(Ljava/lang/String;)V
    .locals 0
    .param p1, "_paymentId"    # Ljava/lang/String;

    .prologue
    .line 54
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mPaymentId:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setPurchaseDate(Ljava/lang/String;)V
    .locals 0
    .param p1, "_purchaseDate"    # Ljava/lang/String;

    .prologue
    .line 64
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mPurchaseDate:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setSubscriptionEndDate(Ljava/lang/String;)V
    .locals 0
    .param p1, "_subscriptionEndDate"    # Ljava/lang/String;

    .prologue
    .line 75
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mSubscriptionEndDate:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0
    .param p1, "_type"    # Ljava/lang/String;

    .prologue
    .line 85
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/InboxVo;->mType:Ljava/lang/String;

    .line 86
    return-void
.end method
