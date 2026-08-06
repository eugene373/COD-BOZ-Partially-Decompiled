.class public Lcom/sec/android/iap/lib/vo/ItemVo;
.super Lcom/sec/android/iap/lib/vo/BaseVo;
.source "ItemVo.java"


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mJsonString:Ljava/lang/String;

.field private mSubscriptionDurationMultiplier:Ljava/lang/String;

.field private mSubscriptionDurationUnit:Ljava/lang/String;

.field private mType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/sec/android/iap/lib/vo/ItemVo;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sec/android/iap/lib/vo/ItemVo;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/sec/android/iap/lib/vo/BaseVo;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .param p1, "_jsonString"    # Ljava/lang/String;

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/sec/android/iap/lib/vo/BaseVo;-><init>(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/vo/ItemVo;->setJsonString(Ljava/lang/String;)V

    .line 24
    sget-object v2, Lcom/sec/android/iap/lib/vo/ItemVo;->TAG:Ljava/lang/String;

    iget-object v3, p0, Lcom/sec/android/iap/lib/vo/ItemVo;->mJsonString:Ljava/lang/String;

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 30
    .local v1, "jObject":Lorg/json/JSONObject;
    const-string v2, "mType"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/ItemVo;->setType(Ljava/lang/String;)V

    .line 33
    const-string v2, "mSubscriptionDurationUnit"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 32
    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/ItemVo;->setSubscriptionDurationUnit(Ljava/lang/String;)V

    .line 36
    const-string v2, "mSubscriptionDurationMultiplier"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 35
    invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/vo/ItemVo;->setSubscriptionDurationMultiplier(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
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
.end method


# virtual methods
.method public dump()Ljava/lang/String;
    .locals 3

    .prologue
    .line 87
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

    .line 89
    .local v0, "dump":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "Type : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/ItemVo;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 90
    const-string v2, "SubscriptionDurationUnit : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 91
    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/ItemVo;->getSubscriptionDurationUnit()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 92
    const-string v2, "SubscriptionDurationMultiplier : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 93
    invoke-virtual {p0}, Lcom/sec/android/iap/lib/vo/ItemVo;->getSubscriptionDurationMultiplier()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 94
    return-object v0
.end method

.method public getJsonString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/ItemVo;->mJsonString:Ljava/lang/String;

    return-object v0
.end method

.method public getSubscriptionDurationMultiplier()Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/ItemVo;->mSubscriptionDurationMultiplier:Ljava/lang/String;

    return-object v0
.end method

.method public getSubscriptionDurationUnit()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/ItemVo;->mSubscriptionDurationUnit:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/sec/android/iap/lib/vo/ItemVo;->mType:Ljava/lang/String;

    return-object v0
.end method

.method public setJsonString(Ljava/lang/String;)V
    .locals 0
    .param p1, "_jsonString"    # Ljava/lang/String;

    .prologue
    .line 82
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/ItemVo;->mJsonString:Ljava/lang/String;

    .line 83
    return-void
.end method

.method public setSubscriptionDurationMultiplier(Ljava/lang/String;)V
    .locals 0
    .param p1, "_subscriptionDurationMultiplier"    # Ljava/lang/String;

    .prologue
    .line 72
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/ItemVo;->mSubscriptionDurationMultiplier:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public setSubscriptionDurationUnit(Ljava/lang/String;)V
    .locals 0
    .param p1, "_subscriptionDurationUnit"    # Ljava/lang/String;

    .prologue
    .line 61
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/ItemVo;->mSubscriptionDurationUnit:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0
    .param p1, "_type"    # Ljava/lang/String;

    .prologue
    .line 51
    iput-object p1, p0, Lcom/sec/android/iap/lib/vo/ItemVo;->mType:Ljava/lang/String;

    .line 52
    return-void
.end method
