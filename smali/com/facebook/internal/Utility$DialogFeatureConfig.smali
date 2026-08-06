.class public Lcom/facebook/internal/Utility$DialogFeatureConfig;
.super Ljava/lang/Object;
.source "Utility.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/Utility;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DialogFeatureConfig"
.end annotation


# instance fields
.field private dialogName:Ljava/lang/String;

.field private fallbackUrl:Landroid/net/Uri;

.field private featureName:Ljava/lang/String;

.field private featureVersionSpec:[I


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;[I)V
    .locals 0

    .prologue
    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    iput-object p1, p0, Lcom/facebook/internal/Utility$DialogFeatureConfig;->dialogName:Ljava/lang/String;

    .line 204
    iput-object p2, p0, Lcom/facebook/internal/Utility$DialogFeatureConfig;->featureName:Ljava/lang/String;

    .line 205
    iput-object p3, p0, Lcom/facebook/internal/Utility$DialogFeatureConfig;->fallbackUrl:Landroid/net/Uri;

    .line 206
    iput-object p4, p0, Lcom/facebook/internal/Utility$DialogFeatureConfig;->featureVersionSpec:[I

    .line 207
    return-void
.end method

.method static synthetic access$400(Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$DialogFeatureConfig;
    .locals 1

    .prologue
    .line 134
    invoke-static {p0}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->parseDialogConfig(Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$DialogFeatureConfig;

    move-result-object v0

    return-object v0
.end method

.method private static parseDialogConfig(Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$DialogFeatureConfig;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 136
    const-string v1, "name"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 137
    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 163
    :cond_0
    :goto_0
    return-object v0

    .line 141
    :cond_1
    const-string v2, "\\|"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 142
    array-length v2, v1

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    .line 147
    const/4 v2, 0x0

    aget-object v2, v1, v2

    .line 148
    const/4 v3, 0x1

    aget-object v3, v1, v3

    .line 149
    invoke-static {v2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v3}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 153
    const-string v1, "url"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 156
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 159
    :cond_2
    const-string v1, "versions"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 161
    invoke-static {v1}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->parseVersionSpec(Lorg/json/JSONArray;)[I

    move-result-object v4

    .line 163
    new-instance v1, Lcom/facebook/internal/Utility$DialogFeatureConfig;

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/facebook/internal/Utility$DialogFeatureConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;[I)V

    move-object v0, v1

    goto :goto_0
.end method

.method private static parseVersionSpec(Lorg/json/JSONArray;)[I
    .locals 7

    .prologue
    const/4 v1, -0x1

    .line 169
    const/4 v0, 0x0

    .line 170
    if-eqz p0, :cond_2

    .line 171
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v4

    .line 172
    new-array v2, v4, [I

    .line 173
    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v4, :cond_1

    .line 175
    invoke-virtual {p0, v3, v1}, Lorg/json/JSONArray;->optInt(II)I

    move-result v0

    .line 176
    if-ne v0, v1, :cond_0

    .line 179
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v5

    .line 180
    invoke-static {v5}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 182
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 190
    :cond_0
    :goto_1
    aput v0, v2, v3

    .line 173
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 183
    :catch_0
    move-exception v0

    .line 184
    const-string v5, "FacebookSDK"

    invoke-static {v5, v0}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V

    move v0, v1

    .line 185
    goto :goto_1

    :cond_1
    move-object v0, v2

    .line 194
    :cond_2
    return-object v0
.end method


# virtual methods
.method public getDialogName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lcom/facebook/internal/Utility$DialogFeatureConfig;->dialogName:Ljava/lang/String;

    return-object v0
.end method

.method public getFallbackUrl()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/facebook/internal/Utility$DialogFeatureConfig;->fallbackUrl:Landroid/net/Uri;

    return-object v0
.end method

.method public getFeatureName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Lcom/facebook/internal/Utility$DialogFeatureConfig;->featureName:Ljava/lang/String;

    return-object v0
.end method

.method public getVersionSpec()[I
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/facebook/internal/Utility$DialogFeatureConfig;->featureVersionSpec:[I

    return-object v0
.end method
