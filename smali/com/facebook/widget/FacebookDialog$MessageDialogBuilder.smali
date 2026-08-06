.class public Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;
.super Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;
.source "FacebookDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FacebookDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MessageDialogBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase",
        "<",
        "Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 1383
    invoke-direct {p0, p1}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;-><init>(Landroid/app/Activity;)V

    .line 1384
    return-void
.end method


# virtual methods
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
    .line 1388
    sget-object v0, Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;->MESSAGE_DIALOG:Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method public setFriends(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;"
        }
    .end annotation

    .prologue
    .line 1410
    return-object p0
.end method

.method public bridge synthetic setFriends(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;
    .locals 1

    .prologue
    .line 1375
    invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;->setFriends(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;
    .locals 0

    .prologue
    .line 1399
    return-object p0
.end method

.method public bridge synthetic setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;
    .locals 1

    .prologue
    .line 1375
    invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;->setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;

    move-result-object v0

    return-object v0
.end method
