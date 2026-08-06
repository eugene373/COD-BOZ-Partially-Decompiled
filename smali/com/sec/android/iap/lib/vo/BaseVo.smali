.class public Lcom/sec/android/iap/lib/vo/BaseVo;
.super Ljava/lang/Object;
.source "BaseVo.java"


# instance fields
.field private mCurrencyUnit:Ljava/lang/String;

.field private mItemDesc:Ljava/lang/String;

.field private mItemDownloadUrl:Ljava/lang/String;

.field private mItemId:Ljava/lang/String;

.field private mItemImageUrl:Ljava/lang/String;

.field private mItemName:Ljava/lang/String;

.field private mItemPrice:Ljava/lang/Double;

.field private mItemPriceString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .param p1, "_jsonString"    # Ljava/lang/String;

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 27
    .local v1, "jObject":Lorg/json/JSONObject;
    const-string v2, "mItemId"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/BaseVo;->setItemId(Ljava/lang/String;)V

    .line 28
    const-string v2, "mItemName"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/BaseVo;->setItemName(Ljava/lang/String;)V

    .line 29
    const-string v2, "mItemPrice"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/BaseVo;->setItemPrice(Ljava/lang/Double;)V

    .line 30
    const-string v2, "mCurrencyUnit"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/BaseVo;->setCurrencyUnit(Ljava/lang/String;)V

    .line 31
    const-string v2, "mItemDesc"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/BaseVo;->setItemDesc(Ljava/lang/String;)V

    .line 32
    const-string v2, "mItemImageUrl"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/BaseVo;->setItemImageUrl(Ljava/lang/String;)V

    .line 33
    const-string v2, "mItemDownloadUrl"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/BaseVo;->setItemDownloadUrl(Ljava/lang/String;)V

    .line 34
    const-string v2, "mItemPriceString"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/BaseVo;->setItemPriceString(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .end local v1    # "jObject":Lorg/json/JSONObject;
    :goto_0
    return-void

    .line 36
    :catch_0
    move-exception v0

    .line 38
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public dump()Ljava/lang/String;
    .locals 4

    .prologue
    .line 124
    const/4 v0, 0x0

    .line 126
    .local v0, "dump":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ItemId          : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 127
    const-string v2, "ItemName        : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 128
    const-string v2, "ItemPrice       : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemPrice()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 129
    const-string v2, "ItemPriceString : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemPriceString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 130
    const-string v2, "CurrencyUnit    : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getCurrencyUnit()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 131
    const-string v2, "ItemDesc        : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemDesc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 132
    const-string v2, "ItemImageUrl    : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 133
    const-string v2, "ItemDownloadUrl : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;->getItemDownloadUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 126
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 135
    return-object v0
.end method

.method public getCurrencyUnit()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mCurrencyUnit:Ljava/lang/String;

    return-object v0
.end method

.method protected getDateString(J)Ljava/lang/String;
    .locals 5
    .param p1, "_timeMills"    # J

    .prologue
    .line 140
    const-string v2, ""

    .line 141
    .local v2, "result":Ljava/lang/String;
    const-string v0, "yyyy.MM.dd hh:mm:ss"

    .line 145
    .local v0, "dateFormat":Ljava/lang/String;
    :try_start_0
    invoke-static {v0, p1, p2}, Landroid/text/format/DateFormat;->format(Ljava/lang/CharSequence;J)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 153
    :goto_0
    return-object v2

    .line 147
    :catch_0
    move-exception v1

    .line 149
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 150
    const-string v2, ""

    goto :goto_0
.end method

.method public getItemDesc()Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getItemDownloadUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 114
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemDownloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getItemId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemId:Ljava/lang/String;

    return-object v0
.end method

.method public getItemImageUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getItemName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemName:Ljava/lang/String;

    return-object v0
.end method

.method public getItemPrice()D
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemPrice:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getItemPriceString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemPriceString:Ljava/lang/String;

    return-object v0
.end method

.method public setCurrencyUnit(Ljava/lang/String;)V
    .locals 0
    .param p1, "_currencyUnit"    # Ljava/lang/String;

    .prologue
    .line 89
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mCurrencyUnit:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public setItemDesc(Ljava/lang/String;)V
    .locals 0
    .param p1, "_itemDesc"    # Ljava/lang/String;

    .prologue
    .line 99
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemDesc:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public setItemDownloadUrl(Ljava/lang/String;)V
    .locals 0
    .param p1, "_itemDownloadUrl"    # Ljava/lang/String;

    .prologue
    .line 119
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemDownloadUrl:Ljava/lang/String;

    .line 120
    return-void
.end method

.method public setItemId(Ljava/lang/String;)V
    .locals 0
    .param p1, "_itemId"    # Ljava/lang/String;

    .prologue
    .line 49
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemId:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public setItemImageUrl(Ljava/lang/String;)V
    .locals 0
    .param p1, "_itemImageUrl"    # Ljava/lang/String;

    .prologue
    .line 109
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemImageUrl:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public setItemName(Ljava/lang/String;)V
    .locals 0
    .param p1, "_itemName"    # Ljava/lang/String;

    .prologue
    .line 59
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemName:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setItemPrice(Ljava/lang/Double;)V
    .locals 0
    .param p1, "_itemPrice"    # Ljava/lang/Double;

    .prologue
    .line 69
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemPrice:Ljava/lang/Double;

    .line 70
    return-void
.end method

.method public setItemPriceString(Ljava/lang/String;)V
    .locals 0
    .param p1, "_itemPriceString"    # Ljava/lang/String;

    .prologue
    .line 79
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/BaseVo;->mItemPriceString:Ljava/lang/String;

    .line 80
    return-void
.end method
