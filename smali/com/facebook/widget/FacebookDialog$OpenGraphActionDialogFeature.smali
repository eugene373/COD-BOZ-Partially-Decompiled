.class public final enum Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;
.super Ljava/lang/Enum;
.source "FacebookDialog.java"

# interfaces
.implements Lcom/facebook/widget/FacebookDialog$DialogFeature;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FacebookDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "OpenGraphActionDialogFeature"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;",
        ">;",
        "Lcom/facebook/widget/FacebookDialog$DialogFeature;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;

.field public static final enum OG_ACTION_DIALOG:Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;


# instance fields
.field private minVersion:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 218
    new-instance v0, Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;

    const-string v1, "OG_ACTION_DIALOG"

    const v2, 0x1332b3a

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;->OG_ACTION_DIALOG:Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;

    .line 213
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;

    sget-object v1, Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;->OG_ACTION_DIALOG:Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;->$VALUES:[Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 222
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 223
    iput p3, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;->minVersion:I

    .line 224
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;
    .locals 1

    .prologue
    .line 213
    const-class v0, Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;
    .locals 1

    .prologue
    .line 213
    sget-object v0, Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;->$VALUES:[Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;

    invoke-virtual {v0}, [Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;

    return-object v0
.end method


# virtual methods
.method public getAction()Ljava/lang/String;
    .locals 1

    .prologue
    .line 230
    const-string v0, "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"

    return-object v0
.end method

.method public getMinVersion()I
    .locals 1

    .prologue
    .line 237
    iget v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature;->minVersion:I

    return v0
.end method
