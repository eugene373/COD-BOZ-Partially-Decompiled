.class public Lcom/facebook/android/FacebookError;
.super Ljava/lang/RuntimeException;
.source "FacebookError.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private mErrorCode:I

.field private mErrorType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/android/FacebookError;->mErrorCode:I

    .line 45
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 49
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/android/FacebookError;->mErrorCode:I

    .line 50
    iput-object p2, p0, Lcom/facebook/android/FacebookError;->mErrorType:Ljava/lang/String;

    .line 51
    iput p3, p0, Lcom/facebook/android/FacebookError;->mErrorCode:I

    .line 52
    return-void
.end method


# virtual methods
.method public getErrorCode()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 56
    iget v0, p0, Lcom/facebook/android/FacebookError;->mErrorCode:I

    return v0
.end method

.method public getErrorType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/android/FacebookError;->mErrorType:Ljava/lang/String;

    return-object v0
.end method
