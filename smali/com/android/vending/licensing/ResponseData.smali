.class public Lcom/android/vending/licensing/ResponseData;
.super Ljava/lang/Object;
.source "ResponseData.java"


# instance fields
.field public extra:Ljava/lang/String;

.field public nonce:I

.field public packageName:Ljava/lang/String;

.field public responseCode:I

.field public timestamp:J

.field public userId:Ljava/lang/String;

.field public versionCode:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static parse(Ljava/lang/String;)Lcom/android/vending/licensing/ResponseData;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 46
    const/16 v0, 0x3a

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 48
    const/4 v1, -0x1

    if-ne v1, v0, :cond_0

    .line 50
    const-string v0, ""

    .line 56
    :goto_0
    const-string v1, "|"

    invoke-static {v1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 57
    array-length v2, v1

    const/4 v3, 0x6

    if-ge v2, v3, :cond_2

    .line 58
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Wrong number of fields."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_0
    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 53
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-lt v0, v2, :cond_1

    const-string v0, ""

    :goto_1
    move-object p0, v1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 61
    :cond_2
    new-instance v2, Lcom/android/vending/licensing/ResponseData;

    invoke-direct {v2}, Lcom/android/vending/licensing/ResponseData;-><init>()V

    .line 62
    iput-object v0, v2, Lcom/android/vending/licensing/ResponseData;->extra:Ljava/lang/String;

    .line 63
    aget-object v0, v1, v4

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/android/vending/licensing/ResponseData;->responseCode:I

    .line 64
    const/4 v0, 0x1

    aget-object v0, v1, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v2, Lcom/android/vending/licensing/ResponseData;->nonce:I

    .line 65
    const/4 v0, 0x2

    aget-object v0, v1, v0

    iput-object v0, v2, Lcom/android/vending/licensing/ResponseData;->packageName:Ljava/lang/String;

    .line 66
    const/4 v0, 0x3

    aget-object v0, v1, v0

    iput-object v0, v2, Lcom/android/vending/licensing/ResponseData;->versionCode:Ljava/lang/String;

    .line 68
    const/4 v0, 0x4

    aget-object v0, v1, v0

    iput-object v0, v2, Lcom/android/vending/licensing/ResponseData;->userId:Ljava/lang/String;

    .line 69
    const/4 v0, 0x5

    aget-object v0, v1, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, v2, Lcom/android/vending/licensing/ResponseData;->timestamp:J

    .line 71
    return-object v2
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    .line 76
    const-string v0, "|"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget v3, p0, Lcom/android/vending/licensing/ResponseData;->responseCode:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget v3, p0, Lcom/android/vending/licensing/ResponseData;->nonce:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/android/vending/licensing/ResponseData;->packageName:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/android/vending/licensing/ResponseData;->versionCode:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/android/vending/licensing/ResponseData;->userId:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget-wide v4, p0, Lcom/android/vending/licensing/ResponseData;->timestamp:J

    .line 77
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    .line 76
    invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
