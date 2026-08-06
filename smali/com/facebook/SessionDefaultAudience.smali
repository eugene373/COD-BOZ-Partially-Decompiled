.class public final enum Lcom/facebook/SessionDefaultAudience;
.super Ljava/lang/Enum;
.source "SessionDefaultAudience.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/SessionDefaultAudience;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/SessionDefaultAudience;

.field public static final enum EVERYONE:Lcom/facebook/SessionDefaultAudience;

.field public static final enum FRIENDS:Lcom/facebook/SessionDefaultAudience;

.field public static final enum NONE:Lcom/facebook/SessionDefaultAudience;

.field public static final enum ONLY_ME:Lcom/facebook/SessionDefaultAudience;


# instance fields
.field private final nativeProtocolAudience:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 31
    new-instance v0, Lcom/facebook/SessionDefaultAudience;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/SessionDefaultAudience;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/SessionDefaultAudience;->NONE:Lcom/facebook/SessionDefaultAudience;

    .line 36
    new-instance v0, Lcom/facebook/SessionDefaultAudience;

    const-string v1, "ONLY_ME"

    const-string v2, "only_me"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/SessionDefaultAudience;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/SessionDefaultAudience;->ONLY_ME:Lcom/facebook/SessionDefaultAudience;

    .line 41
    new-instance v0, Lcom/facebook/SessionDefaultAudience;

    const-string v1, "FRIENDS"

    const-string v2, "friends"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/SessionDefaultAudience;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/SessionDefaultAudience;->FRIENDS:Lcom/facebook/SessionDefaultAudience;

    .line 46
    new-instance v0, Lcom/facebook/SessionDefaultAudience;

    const-string v1, "EVERYONE"

    const-string v2, "everyone"

    invoke-direct {v0, v1, v6, v2}, Lcom/facebook/SessionDefaultAudience;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/SessionDefaultAudience;->EVERYONE:Lcom/facebook/SessionDefaultAudience;

    .line 27
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/SessionDefaultAudience;

    sget-object v1, Lcom/facebook/SessionDefaultAudience;->NONE:Lcom/facebook/SessionDefaultAudience;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/SessionDefaultAudience;->ONLY_ME:Lcom/facebook/SessionDefaultAudience;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/SessionDefaultAudience;->FRIENDS:Lcom/facebook/SessionDefaultAudience;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/SessionDefaultAudience;->EVERYONE:Lcom/facebook/SessionDefaultAudience;

    aput-object v1, v0, v6

    sput-object v0, Lcom/facebook/SessionDefaultAudience;->$VALUES:[Lcom/facebook/SessionDefaultAudience;

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
    .line 50
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 51
    iput-object p3, p0, Lcom/facebook/SessionDefaultAudience;->nativeProtocolAudience:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/SessionDefaultAudience;
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/facebook/SessionDefaultAudience;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/SessionDefaultAudience;

    return-object v0
.end method

.method public static values()[Lcom/facebook/SessionDefaultAudience;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/facebook/SessionDefaultAudience;->$VALUES:[Lcom/facebook/SessionDefaultAudience;

    invoke-virtual {v0}, [Lcom/facebook/SessionDefaultAudience;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/SessionDefaultAudience;

    return-object v0
.end method


# virtual methods
.method public getNativeProtocolAudience()Ljava/lang/String;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/SessionDefaultAudience;->nativeProtocolAudience:Ljava/lang/String;

    return-object v0
.end method
