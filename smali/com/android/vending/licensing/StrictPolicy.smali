.class public Lcom/android/vending/licensing/StrictPolicy;
.super Ljava/lang/Object;
.source "StrictPolicy.java"

# interfaces
.implements Lcom/android/vending/licensing/Policy;


# instance fields
.field private mLastResponse:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/16 v0, 0x123

    iput v0, p0, Lcom/android/vending/licensing/StrictPolicy;->mLastResponse:I

    .line 40
    return-void
.end method


# virtual methods
.method public allowAccess()Z
    .locals 2

    .prologue
    .line 61
    iget v0, p0, Lcom/android/vending/licensing/StrictPolicy;->mLastResponse:I

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public processServerResponse(ILcom/android/vending/licensing/ResponseData;)V
    .locals 0

    .prologue
    .line 51
    iput p1, p0, Lcom/android/vending/licensing/StrictPolicy;->mLastResponse:I

    .line 52
    return-void
.end method
