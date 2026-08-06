.class final enum Lcom/facebook/SessionState$Category;
.super Ljava/lang/Enum;
.source "SessionState.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/SessionState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "Category"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/SessionState$Category;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/SessionState$Category;

.field public static final enum CLOSED_CATEGORY:Lcom/facebook/SessionState$Category;

.field public static final enum CREATED_CATEGORY:Lcom/facebook/SessionState$Category;

.field public static final enum OPENED_CATEGORY:Lcom/facebook/SessionState$Category;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 115
    new-instance v0, Lcom/facebook/SessionState$Category;

    const-string v1, "CREATED_CATEGORY"

    invoke-direct {v0, v1, v2}, Lcom/facebook/SessionState$Category;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/SessionState$Category;->CREATED_CATEGORY:Lcom/facebook/SessionState$Category;

    new-instance v0, Lcom/facebook/SessionState$Category;

    const-string v1, "OPENED_CATEGORY"

    invoke-direct {v0, v1, v3}, Lcom/facebook/SessionState$Category;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/SessionState$Category;->OPENED_CATEGORY:Lcom/facebook/SessionState$Category;

    new-instance v0, Lcom/facebook/SessionState$Category;

    const-string v1, "CLOSED_CATEGORY"

    invoke-direct {v0, v1, v4}, Lcom/facebook/SessionState$Category;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/SessionState$Category;->CLOSED_CATEGORY:Lcom/facebook/SessionState$Category;

    .line 114
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/SessionState$Category;

    sget-object v1, Lcom/facebook/SessionState$Category;->CREATED_CATEGORY:Lcom/facebook/SessionState$Category;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/SessionState$Category;->OPENED_CATEGORY:Lcom/facebook/SessionState$Category;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/SessionState$Category;->CLOSED_CATEGORY:Lcom/facebook/SessionState$Category;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/SessionState$Category;->$VALUES:[Lcom/facebook/SessionState$Category;

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
    .line 114
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/SessionState$Category;
    .locals 1

    .prologue
    .line 114
    const-class v0, Lcom/facebook/SessionState$Category;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/SessionState$Category;

    return-object v0
.end method

.method public static values()[Lcom/facebook/SessionState$Category;
    .locals 1

    .prologue
    .line 114
    sget-object v0, Lcom/facebook/SessionState$Category;->$VALUES:[Lcom/facebook/SessionState$Category;

    invoke-virtual {v0}, [Lcom/facebook/SessionState$Category;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/SessionState$Category;

    return-object v0
.end method
