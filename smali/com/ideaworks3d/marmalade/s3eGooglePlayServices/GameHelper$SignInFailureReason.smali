.class public Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
.super Ljava/lang/Object;
.source "GameHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SignInFailureReason"
.end annotation


# static fields
.field public static final NO_ACTIVITY_RESULT_CODE:I = -0x64


# instance fields
.field mActivityResultCode:I

.field mServiceErrorCode:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .prologue
    .line 1084
    const/16 v0, -0x64

    invoke-direct {p0, p1, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;-><init>(II)V

    .line 1085
    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .prologue
    .line 1078
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1067
    const/4 v0, 0x0

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mServiceErrorCode:I

    .line 1068
    const/16 v0, -0x64

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mActivityResultCode:I

    .line 1079
    iput p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mServiceErrorCode:I

    .line 1080
    iput p2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mActivityResultCode:I

    .line 1081
    return-void
.end method


# virtual methods
.method public getActivityResultCode()I
    .locals 1

    .prologue
    .line 1075
    iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mActivityResultCode:I

    return v0
.end method

.method public getServiceErrorCode()I
    .locals 1

    .prologue
    .line 1071
    iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mServiceErrorCode:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 1089
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SignInFailureReason(serviceErrorCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mServiceErrorCode:I

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->errorCodeToString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mActivityResultCode:I

    const/16 v2, -0x64

    if-ne v0, v2, :cond_0

    const-string v0, ")"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ",activityResultCode:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mActivityResultCode:I

    invoke-static {v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->activityResponseCodeToString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
