.class public Lcom/android/vending/licensing/ServerManagedPolicy;
.super Ljava/lang/Object;
.source "ServerManagedPolicy.java"

# interfaces
.implements Lcom/android/vending/licensing/Policy;


# static fields
.field private static final DEFAULT_MAX_RETRIES:Ljava/lang/String; = "0"

.field private static final DEFAULT_RETRY_COUNT:Ljava/lang/String; = "0"

.field private static final DEFAULT_RETRY_UNTIL:Ljava/lang/String; = "0"

.field private static final DEFAULT_VALIDITY_TIMESTAMP:Ljava/lang/String; = "0"

.field private static final MILLIS_PER_MINUTE:J = 0xea60L

.field private static final PREFS_FILE:Ljava/lang/String; = "com.android.vending.licensing.ServerManagedPolicy"

.field private static final PREF_LAST_RESPONSE:Ljava/lang/String; = "lastResponse"

.field private static final PREF_MAX_RETRIES:Ljava/lang/String; = "maxRetries"

.field private static final PREF_RETRY_COUNT:Ljava/lang/String; = "retryCount"

.field private static final PREF_RETRY_UNTIL:Ljava/lang/String; = "retryUntil"

.field private static final PREF_VALIDITY_TIMESTAMP:Ljava/lang/String; = "validityTimestamp"

.field private static final TAG:Ljava/lang/String; = "ServerManagedPolicy"


# instance fields
.field private mLastResponse:I

.field private mLastResponseTime:J

.field private mMaxRetries:J

.field private mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

.field private mRetryCount:J

.field private mRetryUntil:J

.field private mValidityTimestamp:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/android/vending/licensing/Obfuscator;)V
    .locals 3

    .prologue
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mLastResponseTime:J

    .line 77
    const-string v0, "com.android.vending.licensing.ServerManagedPolicy"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 78
    new-instance v1, Lcom/android/vending/licensing/PreferenceObfuscator;

    invoke-direct {v1, v0, p2}, Lcom/android/vending/licensing/PreferenceObfuscator;-><init>(Landroid/content/SharedPreferences;Lcom/android/vending/licensing/Obfuscator;)V

    iput-object v1, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    .line 79
    iget-object v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "lastResponse"

    const/16 v2, 0x123

    .line 80
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 79
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mLastResponse:I

    .line 81
    iget-object v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "validityTimestamp"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mValidityTimestamp:J

    .line 83
    iget-object v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "retryUntil"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mRetryUntil:J

    .line 84
    iget-object v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "maxRetries"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mMaxRetries:J

    .line 85
    iget-object v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "retryCount"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mRetryCount:J

    .line 86
    return-void
.end method

.method private decodeExtras(Ljava/lang/String;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 264
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 266
    :try_start_0
    new-instance v0, Ljava/net/URI;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "?"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 267
    const-string v2, "UTF-8"

    invoke-static {v0, v2}, Lorg/apache/http/client/utils/URLEncodedUtils;->parse(Ljava/net/URI;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 268
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/NameValuePair;

    .line 269
    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 271
    :catch_0
    move-exception v0

    .line 272
    const-string v0, "ServerManagedPolicy"

    const-string v2, "Invalid syntax error while decoding extras data from server."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    :cond_0
    return-object v1
.end method

.method private setLastResponse(I)V
    .locals 3

    .prologue
    .line 138
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mLastResponseTime:J

    .line 139
    iput p1, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mLastResponse:I

    .line 140
    iget-object v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "lastResponse"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    return-void
.end method

.method private setMaxRetries(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 220
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 228
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mMaxRetries:J

    .line 229
    iget-object v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "maxRetries"

    invoke-virtual {v0, v1, p1}, Lcom/android/vending/licensing/PreferenceObfuscator;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    return-void

    .line 221
    :catch_0
    move-exception v0

    .line 223
    const-string v0, "ServerManagedPolicy"

    const-string v1, "Licence retry count (GR) missing, grace period disabled"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    const-string p1, "0"

    .line 225
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0
.end method

.method private setRetryCount(J)V
    .locals 3

    .prologue
    .line 150
    iput-wide p1, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mRetryCount:J

    .line 151
    iget-object v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "retryCount"

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    return-void
.end method

.method private setRetryUntil(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 194
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 202
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mRetryUntil:J

    .line 203
    iget-object v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "retryUntil"

    invoke-virtual {v0, v1, p1}, Lcom/android/vending/licensing/PreferenceObfuscator;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    return-void

    .line 195
    :catch_0
    move-exception v0

    .line 197
    const-string v0, "ServerManagedPolicy"

    const-string v1, "License retry timestamp (GT) missing, grace period disabled"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    const-string p1, "0"

    .line 199
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0
.end method

.method private setValidityTimestamp(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 168
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 176
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mValidityTimestamp:J

    .line 177
    iget-object v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "validityTimestamp"

    invoke-virtual {v0, v1, p1}, Lcom/android/vending/licensing/PreferenceObfuscator;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    return-void

    .line 169
    :catch_0
    move-exception v0

    .line 171
    const-string v0, "ServerManagedPolicy"

    const-string v1, "License validity timestamp (VT) missing, caching for a minute"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 173
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method


# virtual methods
.method public allowAccess()Z
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 247
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 248
    iget v4, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mLastResponse:I

    const/16 v5, 0x100

    if-ne v4, v5, :cond_1

    .line 250
    iget-wide v4, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mValidityTimestamp:J

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    move v0, v1

    .line 260
    :cond_0
    :goto_0
    return v0

    .line 254
    :cond_1
    iget v4, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mLastResponse:I

    const/16 v5, 0x123

    if-ne v4, v5, :cond_0

    iget-wide v4, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mLastResponseTime:J

    const-wide/32 v6, 0xea60

    add-long/2addr v4, v6

    cmp-long v4, v2, v4

    if-gez v4, :cond_0

    .line 258
    iget-wide v4, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mRetryUntil:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_2

    iget-wide v2, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mRetryCount:J

    iget-wide v4, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mMaxRetries:J

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public getMaxRetries()J
    .locals 2

    .prologue
    .line 233
    iget-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mMaxRetries:J

    return-wide v0
.end method

.method public getRetryCount()J
    .locals 2

    .prologue
    .line 155
    iget-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mRetryCount:J

    return-wide v0
.end method

.method public getRetryUntil()J
    .locals 2

    .prologue
    .line 207
    iget-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mRetryUntil:J

    return-wide v0
.end method

.method public getValidityTimestamp()J
    .locals 2

    .prologue
    .line 181
    iget-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mValidityTimestamp:J

    return-wide v0
.end method

.method public processServerResponse(ILcom/android/vending/licensing/ResponseData;)V
    .locals 4

    .prologue
    .line 106
    const/16 v0, 0x123

    if-eq p1, v0, :cond_1

    .line 107
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/android/vending/licensing/ServerManagedPolicy;->setRetryCount(J)V

    .line 112
    :goto_0
    const/16 v0, 0x100

    if-ne p1, v0, :cond_2

    .line 114
    iget-object v0, p2, Lcom/android/vending/licensing/ResponseData;->extra:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/ServerManagedPolicy;->decodeExtras(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 115
    iput p1, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mLastResponse:I

    .line 116
    const-string v0, "VT"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/ServerManagedPolicy;->setValidityTimestamp(Ljava/lang/String;)V

    .line 117
    const-string v0, "GT"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/ServerManagedPolicy;->setRetryUntil(Ljava/lang/String;)V

    .line 118
    const-string v0, "GR"

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/ServerManagedPolicy;->setMaxRetries(Ljava/lang/String;)V

    .line 126
    :cond_0
    :goto_1
    invoke-direct {p0, p1}, Lcom/android/vending/licensing/ServerManagedPolicy;->setLastResponse(I)V

    .line 127
    iget-object v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    invoke-virtual {v0}, Lcom/android/vending/licensing/PreferenceObfuscator;->commit()V

    .line 128
    return-void

    .line 109
    :cond_1
    iget-wide v0, p0, Lcom/android/vending/licensing/ServerManagedPolicy;->mRetryCount:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lcom/android/vending/licensing/ServerManagedPolicy;->setRetryCount(J)V

    goto :goto_0

    .line 119
    :cond_2
    const/16 v0, 0x231

    if-ne p1, v0, :cond_0

    .line 121
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/ServerManagedPolicy;->setValidityTimestamp(Ljava/lang/String;)V

    .line 122
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/ServerManagedPolicy;->setRetryUntil(Ljava/lang/String;)V

    .line 123
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/ServerManagedPolicy;->setMaxRetries(Ljava/lang/String;)V

    goto :goto_1
.end method
