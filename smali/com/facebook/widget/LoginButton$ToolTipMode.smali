.class public final enum Lcom/facebook/widget/LoginButton$ToolTipMode;
.super Ljava/lang/Enum;
.source "LoginButton.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/LoginButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ToolTipMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/LoginButton$ToolTipMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/widget/LoginButton$ToolTipMode;

.field public static final enum DEFAULT:Lcom/facebook/widget/LoginButton$ToolTipMode;

.field public static final enum DISPLAY_ALWAYS:Lcom/facebook/widget/LoginButton$ToolTipMode;

.field public static final enum NEVER_DISPLAY:Lcom/facebook/widget/LoginButton$ToolTipMode;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 68
    new-instance v0, Lcom/facebook/widget/LoginButton$ToolTipMode;

    const-string v1, "DEFAULT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/LoginButton$ToolTipMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/LoginButton$ToolTipMode;->DEFAULT:Lcom/facebook/widget/LoginButton$ToolTipMode;

    .line 73
    new-instance v0, Lcom/facebook/widget/LoginButton$ToolTipMode;

    const-string v1, "DISPLAY_ALWAYS"

    invoke-direct {v0, v1, v3}, Lcom/facebook/widget/LoginButton$ToolTipMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/LoginButton$ToolTipMode;->DISPLAY_ALWAYS:Lcom/facebook/widget/LoginButton$ToolTipMode;

    .line 78
    new-instance v0, Lcom/facebook/widget/LoginButton$ToolTipMode;

    const-string v1, "NEVER_DISPLAY"

    invoke-direct {v0, v1, v4}, Lcom/facebook/widget/LoginButton$ToolTipMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/widget/LoginButton$ToolTipMode;->NEVER_DISPLAY:Lcom/facebook/widget/LoginButton$ToolTipMode;

    .line 63
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/widget/LoginButton$ToolTipMode;

    sget-object v1, Lcom/facebook/widget/LoginButton$ToolTipMode;->DEFAULT:Lcom/facebook/widget/LoginButton$ToolTipMode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/widget/LoginButton$ToolTipMode;->DISPLAY_ALWAYS:Lcom/facebook/widget/LoginButton$ToolTipMode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/widget/LoginButton$ToolTipMode;->NEVER_DISPLAY:Lcom/facebook/widget/LoginButton$ToolTipMode;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/widget/LoginButton$ToolTipMode;->$VALUES:[Lcom/facebook/widget/LoginButton$ToolTipMode;

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
    .line 63
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/LoginButton$ToolTipMode;
    .locals 1

    .prologue
    .line 63
    const-class v0, Lcom/facebook/widget/LoginButton$ToolTipMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/LoginButton$ToolTipMode;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/LoginButton$ToolTipMode;
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lcom/facebook/widget/LoginButton$ToolTipMode;->$VALUES:[Lcom/facebook/widget/LoginButton$ToolTipMode;

    invoke-virtual {v0}, [Lcom/facebook/widget/LoginButton$ToolTipMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/widget/LoginButton$ToolTipMode;

    return-object v0
.end method
