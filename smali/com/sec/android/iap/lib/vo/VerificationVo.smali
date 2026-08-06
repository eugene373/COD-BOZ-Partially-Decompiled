.class public Lcom/sec/android/iap/lib/vo/VerificationVo;
.super Ljava/lang/Object;
.source "VerificationVo.java"


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mItemDesc:Ljava/lang/String;

.field private mItemId:Ljava/lang/String;

.field private mItemName:Ljava/lang/String;

.field private mPaymentAmount:Ljava/lang/String;

.field private mPaymentId:Ljava/lang/String;

.field private mPurchaseDate:Ljava/lang/String;

.field private mStatus:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/sec/android/iap/lib/vo/VerificationVo;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sec/android/iap/lib/vo/VerificationVo;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .param p1, "_jsonString"    # Ljava/lang/String;

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 26
    .local v1, "jObject":Lorg/json/JSONObject;
    sget-object v2, Lcom/sec/android/iap/lib/vo/VerificationVo;->TAG:Ljava/lang/String;

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    const-string v2, "itemId"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/VerificationVo;->setItemId(Ljava/lang/String;)V

    .line 29
    const-string v2, "itemName"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/VerificationVo;->setItemName(Ljava/lang/String;)V

    .line 30
    const-string v2, "itemDesc"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/VerificationVo;->setItemDesc(Ljava/lang/String;)V

    .line 31
    const-string v2, "purchaseDate"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/VerificationVo;->setPurchaseDate(Ljava/lang/String;)V

    .line 32
    const-string v2, "paymentId"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/VerificationVo;->setPaymentId(Ljava/lang/String;)V

    .line 33
    const-string v2, "paymentAmount"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/VerificationVo;->setPaymentAmount(Ljava/lang/String;)V

    .line 34
    const-string v2, "status"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/VerificationVo;->setStatus(Ljava/lang/String;)V

    .line 36
    sget-object v2, Lcom/sec/android/iap/lib/vo/VerificationVo;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->dump()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 46
    .end local v1    # "jObject":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 38
    :catch_0
    move-exception v0

    .line 40
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0

    .line 42
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_1
    move-exception v0

    .line 44
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public dump()Ljava/lang/String;
    .locals 3

    .prologue
    .line 120
    const/4 v0, 0x0

    .line 122
    .local v0, "dump":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ItemId        : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getItemId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 123
    const-string v2, "ItemName      : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getItemName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 124
    const-string v2, "ItemDesc      : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getItemDesc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 125
    const-string v2, "PurchaseDate  : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getPurchaseDate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 126
    const-string v2, "PaymentId     : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getPaymentId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 127
    const-string v2, "PaymentAmount : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getPaymentAmount()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 128
    const-string v2, "Status        : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getStatus()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 130
    return-object v0
.end method

.method public getItemDesc()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getItemId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemId:Ljava/lang/String;

    return-object v0
.end method

.method public getItemName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemName:Ljava/lang/String;

    return-object v0
.end method

.method public getPaymentAmount()Ljava/lang/String;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPaymentAmount:Ljava/lang/String;

    return-object v0
.end method

.method public getPaymentId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPaymentId:Ljava/lang/String;

    return-object v0
.end method

.method public getPurchaseDate()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPurchaseDate:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mStatus:Ljava/lang/String;

    return-object v0
.end method

.method public setItemDesc(Ljava/lang/String;)V
    .locals 0
    .param p1, "_itemDesc"    # Ljava/lang/String;

    .prologue
    .line 75
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemDesc:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setItemId(Ljava/lang/String;)V
    .locals 0
    .param p1, "_itemId"    # Ljava/lang/String;

    .prologue
    .line 55
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemId:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setItemName(Ljava/lang/String;)V
    .locals 0
    .param p1, "_itemName"    # Ljava/lang/String;

    .prologue
    .line 65
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mItemName:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public setPaymentAmount(Ljava/lang/String;)V
    .locals 0
    .param p1, "_paymentAmount"    # Ljava/lang/String;

    .prologue
    .line 105
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPaymentAmount:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public setPaymentId(Ljava/lang/String;)V
    .locals 0
    .param p1, "_paymentId"    # Ljava/lang/String;

    .prologue
    .line 95
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPaymentId:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public setPurchaseDate(Ljava/lang/String;)V
    .locals 0
    .param p1, "_purchaseDate"    # Ljava/lang/String;

    .prologue
    .line 85
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mPurchaseDate:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0
    .param p1, "_status"    # Ljava/lang/String;

    .prologue
    .line 115
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/VerificationVo;->mStatus:Ljava/lang/String;

    .line 116
    return-void
.end method
