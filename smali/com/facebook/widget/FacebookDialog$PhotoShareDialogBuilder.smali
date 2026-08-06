.class public Lcom/facebook/widget/FacebookDialog$PhotoShareDialogBuilder;
.super Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;
.source "FacebookDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FacebookDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PhotoShareDialogBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase",
        "<",
        "Lcom/facebook/widget/FacebookDialog$PhotoShareDialogBuilder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 1175
    invoke-direct {p0, p1}, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;-><init>(Landroid/app/Activity;)V

    .line 1176
    return-void
.end method


# virtual methods
.method protected getDialogFeatures()Ljava/util/EnumSet;
    .locals 2
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
    .line 1180
    sget-object v0, Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;->SHARE_DIALOG:Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;

    sget-object v1, Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;->PHOTOS:Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method getMaximumNumberOfPhotos()I
    .locals 1

    .prologue
    .line 1185
    sget v0, Lcom/facebook/widget/FacebookDialog$PhotoShareDialogBuilder;->MAXIMUM_PHOTO_COUNT:I

    return v0
.end method
