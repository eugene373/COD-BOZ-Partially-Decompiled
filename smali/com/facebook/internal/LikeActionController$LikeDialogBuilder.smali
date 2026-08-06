.class Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;
.super Lcom/facebook/widget/FacebookDialog$Builder;
.source "LikeActionController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/LikeActionController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LikeDialogBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/widget/FacebookDialog$Builder",
        "<",
        "Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;",
        ">;"
    }
.end annotation


# instance fields
.field private objectId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1371
    invoke-direct {p0, p1}, Lcom/facebook/widget/FacebookDialog$Builder;-><init>(Landroid/app/Activity;)V

    .line 1373
    iput-object p2, p0, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->objectId:Ljava/lang/String;

    .line 1374
    return-void
.end method


# virtual methods
.method public getAppCall()Lcom/facebook/widget/FacebookDialog$PendingCall;
    .locals 1

    .prologue
    .line 1391
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;

    return-object v0
.end method

.method public getApplicationId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1395
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->applicationId:Ljava/lang/String;

    return-object v0
.end method

.method protected getDialogFeatures()Ljava/util/EnumSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet",
            "<+",
            "Lcom/facebook/widget/FacebookDialog$DialogFeature;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1378
    sget-object v0, Lcom/facebook/internal/LikeActionController$LikeDialogFeature;->LIKE_DIALOG:Lcom/facebook/internal/LikeActionController$LikeDialogFeature;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method protected getMethodArguments()Landroid/os/Bundle;
    .locals 3

    .prologue
    .line 1383
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1385
    const-string v1, "object_id"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->objectId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1387
    return-object v0
.end method

.method public getWebFallbackUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1399
    invoke-virtual {p0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->getWebFallbackUrlInternal()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
