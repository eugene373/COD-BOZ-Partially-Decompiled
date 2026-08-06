.class final enum Lcom/facebook/AuthorizationClient$Result$Code;
.super Ljava/lang/Enum;
.source "AuthorizationClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/AuthorizationClient$Result;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "Code"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/AuthorizationClient$Result$Code;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/AuthorizationClient$Result$Code;

.field public static final enum CANCEL:Lcom/facebook/AuthorizationClient$Result$Code;

.field public static final enum ERROR:Lcom/facebook/AuthorizationClient$Result$Code;

.field public static final enum SUCCESS:Lcom/facebook/AuthorizationClient$Result$Code;


# instance fields
.field private final loggingValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 1026
    new-instance v0, Lcom/facebook/AuthorizationClient$Result$Code;

    const-string v1, "SUCCESS"

    const-string v2, "success"

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/AuthorizationClient$Result$Code;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/AuthorizationClient$Result$Code;->SUCCESS:Lcom/facebook/AuthorizationClient$Result$Code;

    .line 1027
    new-instance v0, Lcom/facebook/AuthorizationClient$Result$Code;

    const-string v1, "CANCEL"

    const-string v2, "cancel"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/AuthorizationClient$Result$Code;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/AuthorizationClient$Result$Code;->CANCEL:Lcom/facebook/AuthorizationClient$Result$Code;

    .line 1028
    new-instance v0, Lcom/facebook/AuthorizationClient$Result$Code;

    const-string v1, "ERROR"

    const-string v2, "error"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/AuthorizationClient$Result$Code;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/AuthorizationClient$Result$Code;->ERROR:Lcom/facebook/AuthorizationClient$Result$Code;

    .line 1025
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/AuthorizationClient$Result$Code;

    sget-object v1, Lcom/facebook/AuthorizationClient$Result$Code;->SUCCESS:Lcom/facebook/AuthorizationClient$Result$Code;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/AuthorizationClient$Result$Code;->CANCEL:Lcom/facebook/AuthorizationClient$Result$Code;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/AuthorizationClient$Result$Code;->ERROR:Lcom/facebook/AuthorizationClient$Result$Code;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/AuthorizationClient$Result$Code;->$VALUES:[Lcom/facebook/AuthorizationClient$Result$Code;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 1032
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 1033
    iput-object p3, p0, Lcom/facebook/AuthorizationClient$Result$Code;->loggingValue:Ljava/lang/String;

    .line 1034
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/AuthorizationClient$Result$Code;
    .locals 1

    .prologue
    .line 1025
    const-class v0, Lcom/facebook/AuthorizationClient$Result$Code;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/AuthorizationClient$Result$Code;

    return-object v0
.end method

.method public static values()[Lcom/facebook/AuthorizationClient$Result$Code;
    .locals 1

    .prologue
    .line 1025
    sget-object v0, Lcom/facebook/AuthorizationClient$Result$Code;->$VALUES:[Lcom/facebook/AuthorizationClient$Result$Code;

    invoke-virtual {v0}, [Lcom/facebook/AuthorizationClient$Result$Code;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/AuthorizationClient$Result$Code;

    return-object v0
.end method


# virtual methods
.method getLoggingValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1038
    iget-object v0, p0, Lcom/facebook/AuthorizationClient$Result$Code;->loggingValue:Ljava/lang/String;

    return-object v0
.end method
