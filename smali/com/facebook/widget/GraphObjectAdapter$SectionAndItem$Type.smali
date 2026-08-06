.class public final enum Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
.super Ljava/lang/Enum;
.source "GraphObjectAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

.field public static final enum ACTIVITY_CIRCLE:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

.field public static final enum GRAPH_OBJECT:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

.field public static final enum SECTION_HEADER:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 81
    new-instance v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    const-string v1, "GRAPH_OBJECT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->GRAPH_OBJECT:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    .line 82
    new-instance v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    const-string v1, "SECTION_HEADER"

    invoke-direct {v0, v1, v3}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->SECTION_HEADER:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    .line 83
    new-instance v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    const-string v1, "ACTIVITY_CIRCLE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->ACTIVITY_CIRCLE:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    .line 80
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    sget-object v1, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->GRAPH_OBJECT:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->SECTION_HEADER:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->ACTIVITY_CIRCLE:Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->$VALUES:[Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

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
    .line 80
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    .locals 1

    .prologue
    .line 80
    const-class v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;
    .locals 1

    .prologue
    .line 80
    sget-object v0, Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->$VALUES:[Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    invoke-virtual {v0}, [Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/widget/GraphObjectAdapter$SectionAndItem$Type;

    return-object v0
.end method
