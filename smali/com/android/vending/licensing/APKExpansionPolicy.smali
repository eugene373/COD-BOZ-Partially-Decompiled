.class public Lcom/android/vending/licensing/APKExpansionPolicy;
.super Ljava/lang/Object;
.source "APKExpansionPolicy.java"

# interfaces
.implements Lcom/android/vending/licensing/Policy;


# static fields
.field private static final DEFAULT_MAX_RETRIES:Ljava/lang/String; = "0"

.field private static final DEFAULT_RETRY_COUNT:Ljava/lang/String; = "0"

.field private static final DEFAULT_RETRY_UNTIL:Ljava/lang/String; = "0"

.field private static final DEFAULT_VALIDITY_TIMESTAMP:Ljava/lang/String; = "0"

.field private static final DURATION:J = 0x6ddd00L

.field public static final MAIN_FILE_URL_INDEX:I = 0x0

.field private static final MILLIS_PER_MINUTE:J = 0xea60L

.field public static final PATCH_FILE_URL_INDEX:I = 0x1

.field private static final PREFS_FILE:Ljava/lang/String; = "com.android.vending.licensing.APKExpansionPolicy"

.field private static final PREF_LAST_RESPONSE:Ljava/lang/String; = "lastResponse"

.field private static final PREF_MAX_RETRIES:Ljava/lang/String; = "maxRetries"

.field private static final PREF_RETRY_COUNT:Ljava/lang/String; = "retryCount"

.field private static final PREF_RETRY_UNTIL:Ljava/lang/String; = "retryUntil"

.field private static final PREF_VALIDITY_TIMESTAMP:Ljava/lang/String; = "validityTimestamp"

.field private static final TAG:Ljava/lang/String; = "APKExpansionPolicy"


# instance fields
.field private mExpansionFileNames:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mExpansionFileSizes:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private mExpansionURLs:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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
    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mLastResponseTime:J

    .line 75
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionURLs:Ljava/util/Vector;

    .line 76
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileNames:Ljava/util/Vector;

    .line 77
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileSizes:Ljava/util/Vector;

    .line 93
    const-string v0, "com.android.vending.licensing.APKExpansionPolicy"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 94
    new-instance v1, Lcom/android/vending/licensing/PreferenceObfuscator;

    invoke-direct {v1, v0, p2}, Lcom/android/vending/licensing/PreferenceObfuscator;-><init>(Landroid/content/SharedPreferences;Lcom/android/vending/licensing/Obfuscator;)V

    iput-object v1, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    .line 95
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "lastResponse"

    const/16 v2, 0x123

    .line 96
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mLastResponse:I

    .line 97
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "validityTimestamp"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mValidityTimestamp:J

    .line 99
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "retryUntil"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mRetryUntil:J

    .line 100
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "maxRetries"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mMaxRetries:J

    .line 101
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "retryCount"

    const-string v2, "0"

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mRetryCount:J

    .line 102
    return-void
.end method

.method private decodeExtras(Ljava/lang/String;)Ljava/util/Map;
    .locals 6
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
    .line 395
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 397
    :try_start_0
    new-instance v0, Ljava/net/URI;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "?"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 398
    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Lorg/apache/http/client/utils/URLEncodedUtils;->parse(Ljava/net/URI;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 399
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/http/NameValuePair;

    .line 400
    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v2

    .line 401
    const/4 v1, 0x0

    .line 402
    :goto_1
    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 403
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 405
    :cond_0
    invoke-interface {v0}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 407
    :catch_0
    move-exception v0

    .line 408
    const-string v0, "APKExpansionPolicy"

    const-string v1, "Invalid syntax error while decoding extras data from server."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 410
    :cond_1
    return-object v3
.end method

.method private setLastResponse(I)V
    .locals 3

    .prologue
    .line 198
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mLastResponseTime:J

    .line 199
    iput p1, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mLastResponse:I

    .line 200
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "lastResponse"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    return-void
.end method

.method private setMaxRetries(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 280
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 288
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mMaxRetries:J

    .line 289
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "maxRetries"

    invoke-virtual {v0, v1, p1}, Lcom/android/vending/licensing/PreferenceObfuscator;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    return-void

    .line 281
    :catch_0
    move-exception v0

    .line 283
    const-string v0, "APKExpansionPolicy"

    const-string v1, "Licence retry count (GR) missing, grace period disabled"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 284
    const-string p1, "0"

    .line 285
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0
.end method

.method private setRetryCount(J)V
    .locals 3

    .prologue
    .line 210
    iput-wide p1, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mRetryCount:J

    .line 211
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "retryCount"

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    return-void
.end method

.method private setRetryUntil(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 254
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 262
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mRetryUntil:J

    .line 263
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "retryUntil"

    invoke-virtual {v0, v1, p1}, Lcom/android/vending/licensing/PreferenceObfuscator;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    return-void

    .line 255
    :catch_0
    move-exception v0

    .line 257
    const-string v0, "APKExpansionPolicy"

    const-string v1, "License retry timestamp (GT) missing, grace period disabled"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 258
    const-string p1, "0"

    .line 259
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0
.end method

.method private setValidityTimestamp(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 228
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 236
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mValidityTimestamp:J

    .line 237
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "validityTimestamp"

    invoke-virtual {v0, v1, p1}, Lcom/android/vending/licensing/PreferenceObfuscator;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    return-void

    .line 229
    :catch_0
    move-exception v0

    .line 231
    const-string v0, "APKExpansionPolicy"

    const-string v1, "License validity timestamp (VT) missing, caching for a minute"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 233
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

    .line 376
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 377
    iget v4, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mLastResponse:I

    const/16 v5, 0x100

    if-ne v4, v5, :cond_1

    .line 380
    iget-wide v4, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mValidityTimestamp:J

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    move v0, v1

    .line 391
    :cond_0
    :goto_0
    return v0

    .line 384
    :cond_1
    iget v4, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mLastResponse:I

    const/16 v5, 0x123

    if-ne v4, v5, :cond_0

    iget-wide v4, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mLastResponseTime:J

    const-wide/32 v6, 0xea60

    add-long/2addr v4, v6

    cmp-long v4, v2, v4

    if-gez v4, :cond_0

    .line 389
    iget-wide v4, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mRetryUntil:J

    cmp-long v2, v2, v4

    if-lez v2, :cond_2

    iget-wide v2, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mRetryCount:J

    iget-wide v4, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mMaxRetries:J

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public getExpansionFileName(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 340
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileNames:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 341
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileNames:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 343
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getExpansionFileSize(I)J
    .locals 2

    .prologue
    .line 354
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileSizes:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 355
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileSizes:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 357
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public getExpansionURL(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 317
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionURLs:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 318
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionURLs:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 320
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getExpansionURLCount()I
    .locals 1

    .prologue
    .line 304
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionURLs:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    return v0
.end method

.method public getMaxRetries()J
    .locals 2

    .prologue
    .line 293
    iget-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mMaxRetries:J

    return-wide v0
.end method

.method public getRetryCount()J
    .locals 2

    .prologue
    .line 215
    iget-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mRetryCount:J

    return-wide v0
.end method

.method public getRetryUntil()J
    .locals 2

    .prologue
    .line 267
    iget-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mRetryUntil:J

    return-wide v0
.end method

.method public getValidityTimestamp()J
    .locals 2

    .prologue
    .line 241
    iget-wide v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mValidityTimestamp:J

    return-wide v0
.end method

.method public processServerResponse(ILcom/android/vending/licensing/ResponseData;)V
    .locals 7

    .prologue
    const/16 v1, 0x231

    const/16 v6, 0x123

    const/16 v0, 0x100

    .line 136
    if-eq p1, v6, :cond_1

    .line 137
    const-wide/16 v2, 0x0

    invoke-direct {p0, v2, v3}, Lcom/android/vending/licensing/APKExpansionPolicy;->setRetryCount(J)V

    .line 142
    :goto_0
    if-ne p1, v0, :cond_6

    .line 144
    iget-object v0, p2, Lcom/android/vending/licensing/ResponseData;->extra:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->decodeExtras(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 145
    iput p1, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mLastResponse:I

    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/32 v4, 0x6ddd00

    add-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->setValidityTimestamp(Ljava/lang/String;)V

    .line 147
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 148
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 149
    const-string v3, "VT"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 151
    const-string v3, "GT"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 152
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->setRetryUntil(Ljava/lang/String;)V

    goto :goto_1

    .line 139
    :cond_1
    iget-wide v2, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mRetryCount:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    invoke-direct {p0, v2, v3}, Lcom/android/vending/licensing/APKExpansionPolicy;->setRetryCount(J)V

    goto :goto_0

    .line 153
    :cond_2
    const-string v3, "GR"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 154
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->setMaxRetries(Ljava/lang/String;)V

    goto :goto_1

    .line 155
    :cond_3
    const-string v3, "FILE_URL"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 156
    const-string v3, "FILE_URL"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    .line 157
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v3, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->setExpansionURL(ILjava/lang/String;)V

    goto :goto_1

    .line 158
    :cond_4
    const-string v3, "FILE_NAME"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 159
    const-string v3, "FILE_NAME"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    .line 160
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v3, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->setExpansionFileName(ILjava/lang/String;)V

    goto/16 :goto_1

    .line 161
    :cond_5
    const-string v3, "FILE_SIZE"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 162
    const-string v3, "FILE_SIZE"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    .line 163
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-virtual {p0, v3, v4, v5}, Lcom/android/vending/licensing/APKExpansionPolicy;->setExpansionFileSize(IJ)V

    goto/16 :goto_1

    .line 166
    :cond_6
    if-ne p1, v1, :cond_8

    .line 168
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->setValidityTimestamp(Ljava/lang/String;)V

    .line 169
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->setRetryUntil(Ljava/lang/String;)V

    .line 170
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->setMaxRetries(Ljava/lang/String;)V

    .line 186
    :cond_7
    :goto_2
    invoke-direct {p0, p1}, Lcom/android/vending/licensing/APKExpansionPolicy;->setLastResponse(I)V

    .line 187
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    invoke-virtual {v0}, Lcom/android/vending/licensing/PreferenceObfuscator;->commit()V

    .line 188
    return-void

    .line 172
    :cond_8
    if-ne p1, v6, :cond_7

    .line 176
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 177
    iget-wide v4, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mValidityTimestamp:J

    cmp-long v2, v2, v4

    if-gtz v2, :cond_9

    move p1, v0

    .line 178
    goto :goto_2

    .line 182
    :cond_9
    invoke-virtual {p0}, Lcom/android/vending/licensing/APKExpansionPolicy;->resetPolicy()V

    move p1, v1

    goto :goto_2
.end method

.method public resetPolicy()V
    .locals 3

    .prologue
    .line 109
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    const-string v1, "lastResponse"

    const/16 v2, 0x123

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/android/vending/licensing/PreferenceObfuscator;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->setRetryUntil(Ljava/lang/String;)V

    .line 111
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->setMaxRetries(Ljava/lang/String;)V

    .line 112
    const-string v0, "0"

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/android/vending/licensing/APKExpansionPolicy;->setRetryCount(J)V

    .line 113
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/android/vending/licensing/APKExpansionPolicy;->setValidityTimestamp(Ljava/lang/String;)V

    .line 114
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mPreferences:Lcom/android/vending/licensing/PreferenceObfuscator;

    invoke-virtual {v0}, Lcom/android/vending/licensing/PreferenceObfuscator;->commit()V

    .line 115
    return-void
.end method

.method public setExpansionFileName(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 347
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileNames:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 348
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileNames:Ljava/util/Vector;

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Vector;->setSize(I)V

    .line 350
    :cond_0
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileNames:Ljava/util/Vector;

    invoke-virtual {v0, p1, p2}, Ljava/util/Vector;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 351
    return-void
.end method

.method public setExpansionFileSize(IJ)V
    .locals 2

    .prologue
    .line 361
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileSizes:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 362
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileSizes:Ljava/util/Vector;

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Vector;->setSize(I)V

    .line 364
    :cond_0
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionFileSizes:Ljava/util/Vector;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/Vector;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 365
    return-void
.end method

.method public setExpansionURL(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 333
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionURLs:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 334
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionURLs:Ljava/util/Vector;

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Vector;->setSize(I)V

    .line 336
    :cond_0
    iget-object v0, p0, Lcom/android/vending/licensing/APKExpansionPolicy;->mExpansionURLs:Ljava/util/Vector;

    invoke-virtual {v0, p1, p2}, Ljava/util/Vector;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 337
    return-void
.end method
