.class public Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
.super Ljava/lang/Object;
.source "UserDataResponseBuilder.java"


# instance fields
.field private requestId:Lcom/amazon/device/iap/model/RequestId;

.field private requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

.field private userData:Lcom/amazon/device/iap/model/UserData;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/amazon/device/iap/model/UserDataResponse;
    .locals 1

    .prologue
    .line 26
    new-instance v0, Lcom/amazon/device/iap/model/UserDataResponse;

    invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/UserDataResponse;-><init>(Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;)V

    return-object v0
.end method

.method public getRequestId()Lcom/amazon/device/iap/model/RequestId;
    .locals 1

    .prologue
    .line 10
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;

    return-object v0
.end method

.method public getRequestStatus()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    return-object v0
.end method

.method public getUserData()Lcom/amazon/device/iap/model/UserData;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;

    return-object v0
.end method

.method public setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 31
    return-object p0
.end method

.method public setRequestStatus(Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    .line 36
    return-object p0
.end method

.method public setUserData(Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 41
    return-object p0
.end method
