.class final enum Ls3eFacebook$s3eFacebookAudience;
.super Ljava/lang/Enum;
.source "s3eFacebook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3eFacebook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "s3eFacebookAudience"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Ls3eFacebook$s3eFacebookAudience;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ls3eFacebook$s3eFacebookAudience;

.field public static final enum EVERYONE:Ls3eFacebook$s3eFacebookAudience;

.field public static final enum FRIENDS:Ls3eFacebook$s3eFacebookAudience;

.field public static final enum NONE:Ls3eFacebook$s3eFacebookAudience;

.field public static final enum ONLY_ME:Ls3eFacebook$s3eFacebookAudience;


# instance fields
.field private _audience:I

.field private _fbAudience:Lcom/facebook/SessionDefaultAudience;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 86
    new-instance v0, Ls3eFacebook$s3eFacebookAudience;

    const-string v1, "NONE"

    sget-object v2, Lcom/facebook/SessionDefaultAudience;->NONE:Lcom/facebook/SessionDefaultAudience;

    invoke-direct {v0, v1, v4, v4, v2}, Ls3eFacebook$s3eFacebookAudience;-><init>(Ljava/lang/String;IILcom/facebook/SessionDefaultAudience;)V

    sput-object v0, Ls3eFacebook$s3eFacebookAudience;->NONE:Ls3eFacebook$s3eFacebookAudience;

    .line 87
    new-instance v0, Ls3eFacebook$s3eFacebookAudience;

    const-string v1, "ONLY_ME"

    const/16 v2, 0xa

    sget-object v3, Lcom/facebook/SessionDefaultAudience;->ONLY_ME:Lcom/facebook/SessionDefaultAudience;

    invoke-direct {v0, v1, v5, v2, v3}, Ls3eFacebook$s3eFacebookAudience;-><init>(Ljava/lang/String;IILcom/facebook/SessionDefaultAudience;)V

    sput-object v0, Ls3eFacebook$s3eFacebookAudience;->ONLY_ME:Ls3eFacebook$s3eFacebookAudience;

    .line 88
    new-instance v0, Ls3eFacebook$s3eFacebookAudience;

    const-string v1, "FRIENDS"

    const/16 v2, 0x14

    sget-object v3, Lcom/facebook/SessionDefaultAudience;->FRIENDS:Lcom/facebook/SessionDefaultAudience;

    invoke-direct {v0, v1, v6, v2, v3}, Ls3eFacebook$s3eFacebookAudience;-><init>(Ljava/lang/String;IILcom/facebook/SessionDefaultAudience;)V

    sput-object v0, Ls3eFacebook$s3eFacebookAudience;->FRIENDS:Ls3eFacebook$s3eFacebookAudience;

    .line 89
    new-instance v0, Ls3eFacebook$s3eFacebookAudience;

    const-string v1, "EVERYONE"

    const/16 v2, 0x1e

    sget-object v3, Lcom/facebook/SessionDefaultAudience;->EVERYONE:Lcom/facebook/SessionDefaultAudience;

    invoke-direct {v0, v1, v7, v2, v3}, Ls3eFacebook$s3eFacebookAudience;-><init>(Ljava/lang/String;IILcom/facebook/SessionDefaultAudience;)V

    sput-object v0, Ls3eFacebook$s3eFacebookAudience;->EVERYONE:Ls3eFacebook$s3eFacebookAudience;

    .line 84
    const/4 v0, 0x4

    new-array v0, v0, [Ls3eFacebook$s3eFacebookAudience;

    sget-object v1, Ls3eFacebook$s3eFacebookAudience;->NONE:Ls3eFacebook$s3eFacebookAudience;

    aput-object v1, v0, v4

    sget-object v1, Ls3eFacebook$s3eFacebookAudience;->ONLY_ME:Ls3eFacebook$s3eFacebookAudience;

    aput-object v1, v0, v5

    sget-object v1, Ls3eFacebook$s3eFacebookAudience;->FRIENDS:Ls3eFacebook$s3eFacebookAudience;

    aput-object v1, v0, v6

    sget-object v1, Ls3eFacebook$s3eFacebookAudience;->EVERYONE:Ls3eFacebook$s3eFacebookAudience;

    aput-object v1, v0, v7

    sput-object v0, Ls3eFacebook$s3eFacebookAudience;->$VALUES:[Ls3eFacebook$s3eFacebookAudience;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILcom/facebook/SessionDefaultAudience;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/facebook/SessionDefaultAudience;",
            ")V"
        }
    .end annotation

    .prologue
    .line 95
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 96
    iput p3, p0, Ls3eFacebook$s3eFacebookAudience;->_audience:I

    .line 97
    iput-object p4, p0, Ls3eFacebook$s3eFacebookAudience;->_fbAudience:Lcom/facebook/SessionDefaultAudience;

    .line 98
    return-void
.end method

.method public static fromInt(I)Lcom/facebook/SessionDefaultAudience;
    .locals 5

    .prologue
    .line 102
    invoke-static {}, Ls3eFacebook$s3eFacebookAudience;->values()[Ls3eFacebook$s3eFacebookAudience;

    move-result-object v1

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 104
    iget v4, v3, Ls3eFacebook$s3eFacebookAudience;->_audience:I

    if-ne v4, p0, :cond_0

    .line 105
    iget-object v0, v3, Ls3eFacebook$s3eFacebookAudience;->_fbAudience:Lcom/facebook/SessionDefaultAudience;

    .line 107
    :goto_1
    return-object v0

    .line 102
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 107
    :cond_1
    sget-object v0, Lcom/facebook/SessionDefaultAudience;->NONE:Lcom/facebook/SessionDefaultAudience;

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Ls3eFacebook$s3eFacebookAudience;
    .locals 1

    .prologue
    .line 84
    const-class v0, Ls3eFacebook$s3eFacebookAudience;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Ls3eFacebook$s3eFacebookAudience;

    return-object v0
.end method

.method public static values()[Ls3eFacebook$s3eFacebookAudience;
    .locals 1

    .prologue
    .line 84
    sget-object v0, Ls3eFacebook$s3eFacebookAudience;->$VALUES:[Ls3eFacebook$s3eFacebookAudience;

    invoke-virtual {v0}, [Ls3eFacebook$s3eFacebookAudience;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls3eFacebook$s3eFacebookAudience;

    return-object v0
.end method
