.class public final enum Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;
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
    name = "OpenGraphMessageDialogFeature"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;",
        ">;",
        "Lcom/facebook/widget/FacebookDialog$DialogFeature;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;

.field public static final enum OG_MESSAGE_DIALOG:Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;


# instance fields
.field private minVersion:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 255
    new-instance v0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;

    const-string v1, "OG_MESSAGE_DIALOG"

    const v2, 0x13350ac

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->OG_MESSAGE_DIALOG:Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;

    .line 250
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;

    sget-object v1, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->OG_MESSAGE_DIALOG:Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->$VALUES:[Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;

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
    .line 259
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 260
    iput p3, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->minVersion:I

    .line 261
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;
    .locals 1

    .prologue
    .line 250
    const-class v0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;
    .locals 1

    .prologue
    .line 250
    sget-object v0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->$VALUES:[Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;

    invoke-virtual {v0}, [Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;

    return-object v0
.end method


# virtual methods
.method public getAction()Ljava/lang/String;
    .locals 1

    .prologue
    .line 267
    const-string v0, "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"

    return-object v0
.end method

.method public getMinVersion()I
    .locals 1

    .prologue
    .line 274
    iget v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->minVersion:I

    return v0
.end method
