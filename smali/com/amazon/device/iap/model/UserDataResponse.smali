.class public final Lcom/amazon/device/iap/model/UserDataResponse;
.super Ljava/lang/Object;
.source "UserDataResponse.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    }
.end annotation


# static fields
.field private static final REQUEST_ID:Ljava/lang/String; = "REQUEST_ID"

.field private static final REQUEST_STATUS:Ljava/lang/String; = "REQUEST_STATUS"

.field private static final TO_STRING_FORMAT:Ljava/lang/String; = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")"

.field private static final USER_DATA:Ljava/lang/String; = "USER_DATA"


# instance fields
.field private final requestId:Lcom/amazon/device/iap/model/RequestId;

.field private final requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

.field private final userData:Lcom/amazon/device/iap/model/UserData;


# direct methods
.method public constructor <init>(Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;)V
    .locals 2

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->getRequestId()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v0

    const-string v1, "requestId"

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->getRequestStatus()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    move-result-object v0

    const-string v1, "requestStatus"

    invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->getRequestId()Lcom/amazon/device/iap/model/RequestId;

    move-result-object v0

    iput-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    .line 59
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->getRequestStatus()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    move-result-object v0

    iput-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    .line 60
    invoke-virtual {p1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->getUserData()Lcom/amazon/device/iap/model/UserData;

    move-result-object v0

    iput-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    .line 61
    return-void
.end method


# virtual methods
.method public getRequestId()Lcom/amazon/device/iap/model/RequestId;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    return-object v0
.end method

.method public getRequestStatus()Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    return-object v0
.end method

.method public getUserData()Lcom/amazon/device/iap/model/UserData;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    return-object v0
.end method

.method public toJSON()Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 115
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 116
    const-string v0, "REQUEST_ID"

    iget-object v2, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 117
    const-string v0, "REQUEST_STATUS"

    iget-object v2, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 118
    const-string v2, "USER_DATA"

    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserData;->toJSON()Lorg/json/JSONObject;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 120
    return-object v1

    .line 118
    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 100
    const-string v1, "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")"

    const/4 v0, 0x4

    new-array v2, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v0, 0x1

    iget-object v3, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestId:Lcom/amazon/device/iap/model/RequestId;

    aput-object v3, v2, v0

    const/4 v3, 0x2

    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->requestStatus:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    aput-object v0, v2, v3

    const/4 v3, 0x3

    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/amazon/device/iap/model/UserDataResponse;->userData:Lcom/amazon/device/iap/model/UserData;

    invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserData;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "null"

    goto :goto_0

    :cond_1
    const-string v0, "null"

    goto :goto_1
.end method
