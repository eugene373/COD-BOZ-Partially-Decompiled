.class public final enum Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
.super Ljava/lang/Enum;
.source "UserDataResponse.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amazon/device/iap/model/UserDataResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RequestStatus"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

.field public static final enum FAILED:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

.field public static final enum NOT_SUPPORTED:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

.field public static final enum SUCCESSFUL:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 23
    new-instance v0, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    const-string v1, "SUCCESSFUL"

    invoke-direct {v0, v1, v2}, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    .line 28
    new-instance v0, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v3}, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    .line 33
    new-instance v0, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    const-string v1, "NOT_SUPPORTED"

    invoke-direct {v0, v1, v4}, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->NOT_SUPPORTED:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    .line 19
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    sget-object v1, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->NOT_SUPPORTED:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    aput-object v1, v0, v4

    sput-object v0, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->$VALUES:[Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    .locals 1

    .prologue
    .line 19
    const-class v0, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    return-object v0
.end method

.method public static values()[Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->$VALUES:[Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    invoke-virtual {v0}, [Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;

    return-object v0
.end method
