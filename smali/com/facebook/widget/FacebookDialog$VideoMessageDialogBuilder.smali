.class public Lcom/facebook/widget/FacebookDialog$VideoMessageDialogBuilder;
.super Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;
.source "FacebookDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FacebookDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "VideoMessageDialogBuilder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase",
        "<",
        "Lcom/facebook/widget/FacebookDialog$VideoMessageDialogBuilder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 1348
    invoke-direct {p0, p1}, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;-><init>(Landroid/app/Activity;)V

    .line 1349
    return-void
.end method


# virtual methods
.method protected getDialogFeatures()Ljava/util/EnumSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1353
    sget-object v0, Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;->MESSAGE_DIALOG:Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;

    sget-object v1, Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;->VIDEO:Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;
    .locals 1

    .prologue
    .line 1341
    invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$VideoMessageDialogBuilder;->setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$VideoMessageDialogBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$VideoMessageDialogBuilder;
    .locals 0

    .prologue
    .line 1364
    return-object p0
.end method
