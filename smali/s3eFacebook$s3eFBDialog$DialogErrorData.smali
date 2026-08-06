.class Ls3eFacebook$s3eFBDialog$DialogErrorData;
.super Ljava/lang/Object;
.source "s3eFacebook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3eFacebook$s3eFBDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DialogErrorData"
.end annotation


# instance fields
.field public errorCode:I

.field public errorMessage:Ljava/lang/String;

.field public failingURL:Ljava/lang/String;

.field final synthetic this$1:Ls3eFacebook$s3eFBDialog;


# direct methods
.method private constructor <init>(Ls3eFacebook$s3eFBDialog;)V
    .locals 0

    .prologue
    .line 488
    iput-object p1, p0, Ls3eFacebook$s3eFBDialog$DialogErrorData;->this$1:Ls3eFacebook$s3eFBDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ls3eFacebook$s3eFBDialog;Ls3eFacebook$1;)V
    .locals 0

    .prologue
    .line 488
    invoke-direct {p0, p1}, Ls3eFacebook$s3eFBDialog$DialogErrorData;-><init>(Ls3eFacebook$s3eFBDialog;)V

    return-void
.end method
