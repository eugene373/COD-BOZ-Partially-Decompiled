.class public Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
.super Ljava/lang/Object;
.source "PurchaseResponseBuilder.java"


# instance fields
.field private receipt:Lcom/amazon/device/iap/model/Receipt;

.field private requestId:Lcom/amazon/device/iap/model/RequestId;

.field private requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

.field private userData:Lcom/amazon/device/iap/model/UserData;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/amazon/device/iap/model/PurchaseResponse;
    .locals 1

    .prologue
    .line 16
    new-instance v0, Lcom/amazon/device/iap/model/PurchaseResponse;

    invoke-direct {v0, p0}, Lcom/amazon/device/iap/model/PurchaseResponse;-><init>(Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;)V

    return-object v0
.end method

.method public getReceipt()Lcom/amazon/device/iap/model/Receipt;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->receipt:Lcom/amazon/device/iap/model/Receipt;

    return-object v0
.end method

.method public getRequestId()Lcom/amazon/device/iap/model/RequestId;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;

    return-object v0
.end method

.method public getRequestStatus()Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    return-object v0
.end method

.method public getUserData()Lcom/amazon/device/iap/model/UserData;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;

    return-object v0
.end method

.method public setReceipt(Lcom/amazon/device/iap/model/Receipt;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->receipt:Lcom/amazon/device/iap/model/Receipt;

    .line 52
    return-object p0
.end method

.method public setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 37
    return-object p0
.end method

.method public setRequestStatus(Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->requestStatus:Lcom/amazon/device/iap/model/PurchaseResponse$RequestStatus;

    .line 42
    return-object p0
.end method

.method public setUserData(Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/amazon/device/iap/internal/model/PurchaseResponseBuilder;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 47
    return-object p0
.end method
