.class public Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;
.super Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;
.source "FacebookDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FacebookDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PhotoMessageDialogBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase",
        "<",
        "Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 1202
    invoke-direct {p0, p1}, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;-><init>(Landroid/app/Activity;)V

    .line 1203
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
    .line 1207
    sget-object v0, Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;->MESSAGE_DIALOG:Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;

    sget-object v1, Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;->PHOTOS:Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method getMaximumNumberOfPhotos()I
    .locals 1

    .prologue
    .line 1212
    sget v0, Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;->MAXIMUM_PHOTO_COUNT:I

    return v0
.end method

.method public bridge synthetic setFriends(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;
    .locals 1

    .prologue
    .line 1195
    invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;->setFriends(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setFriends(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;"
        }
    .end annotation

    .prologue
    .line 1234
    return-object p0
.end method

.method public bridge synthetic setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;
    .locals 1

    .prologue
    .line 1195
    invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;->setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;
    .locals 0

    .prologue
    .line 1223
    return-object p0
.end method
