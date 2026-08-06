.class final enum Lcom/facebook/TestSession$Mode;
.super Ljava/lang/Enum;
.source "TestSession.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/TestSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "Mode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/TestSession$Mode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/TestSession$Mode;

.field public static final enum PRIVATE:Lcom/facebook/TestSession$Mode;

.field public static final enum SHARED:Lcom/facebook/TestSession$Mode;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 66
    new-instance v0, Lcom/facebook/TestSession$Mode;

    const-string v1, "PRIVATE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/TestSession$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/TestSession$Mode;->PRIVATE:Lcom/facebook/TestSession$Mode;

    new-instance v0, Lcom/facebook/TestSession$Mode;

    const-string v1, "SHARED"

    invoke-direct {v0, v1, v3}, Lcom/facebook/TestSession$Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/TestSession$Mode;->SHARED:Lcom/facebook/TestSession$Mode;

    .line 65
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/TestSession$Mode;

    sget-object v1, Lcom/facebook/TestSession$Mode;->PRIVATE:Lcom/facebook/TestSession$Mode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/TestSession$Mode;->SHARED:Lcom/facebook/TestSession$Mode;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/TestSession$Mode;->$VALUES:[Lcom/facebook/TestSession$Mode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 65
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/TestSession$Mode;
    .locals 1

    .prologue
    .line 65
    const-class v0, Lcom/facebook/TestSession$Mode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/TestSession$Mode;

    return-object v0
.end method

.method public static values()[Lcom/facebook/TestSession$Mode;
    .locals 1

    .prologue
    .line 65
    sget-object v0, Lcom/facebook/TestSession$Mode;->$VALUES:[Lcom/facebook/TestSession$Mode;

    invoke-virtual {v0}, [Lcom/facebook/TestSession$Mode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/TestSession$Mode;

    return-object v0
.end method
