.class public Lcom/facebook/FacebookDialogException;
.super Lcom/facebook/FacebookException;
.source "FacebookDialogException.java"


# static fields
.field static final serialVersionUID:J = 0x1L


# instance fields
.field private errorCode:I

.field private failingUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    .line 32
    iput p2, p0, Lcom/facebook/FacebookDialogException;->errorCode:I

    .line 33
    iput-object p3, p0, Lcom/facebook/FacebookDialogException;->failingUrl:Ljava/lang/String;

    .line 34
    return-void
.end method


# virtual methods
.method public getErrorCode()I
    .locals 1

    .prologue
    .line 43
    iget v0, p0, Lcom/facebook/FacebookDialogException;->errorCode:I

    return v0
.end method

.method public getFailingUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/FacebookDialogException;->failingUrl:Ljava/lang/String;

    return-object v0
.end method
