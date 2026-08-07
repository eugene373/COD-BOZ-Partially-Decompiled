package com.amazon.device.iap.internal.b.e

// Auto-emitted from smali source: GetUserIdCommandV2.java.
// 1 fields, 3 methods.

class c: com.amazon.device.iap.internal.b.e.b() {
    public constructor(p0: com.amazon.device.iap.internal.b.e)

    protected fun a(p0: com.amazon.venezia.command.SuccessResult): Boolean { return TODO("body: (Lcom/amazon/venezia/command/SuccessResult;)Z") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;,
    //                 Lcom/amazon/android/framework/exception/KiwiException;
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/e/c;->b:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onResult: result = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-interface {p1}, Lcom/amazon/venezia/command/SuccessResult;->getData()Ljava/util/Map;
    //         move-result-object v1
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/e/c;->b:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "data: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "userId"
    //         invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v2, "marketplace"
    //         invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/e/c;->b()Lcom/amazon/device/iap/internal/b/e;
    //         move-result-object v2
    //         invoke-static {v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z
    //         move-result v3
    //         if-nez v3, :cond_0
    //         invoke-static {v1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         :cond_0
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         new-instance v1, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    //         invoke-direct {v1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;-><init>()V
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/internal/b/e;->c()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    //         move-result-object v1
    //         sget-object v2, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->FAILED:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    //         invoke-virtual {v1, v2}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->build()Lcom/amazon/device/iap/model/UserDataResponse;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/Object;)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         new-instance v3, Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         invoke-direct {v3}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;-><init>()V
    //         invoke-virtual {v3, v0}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setUserId(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->setMarketplace(Ljava/lang/String;)Lcom/amazon/device/iap/internal/model/UserDataBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/model/UserDataBuilder;->build()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v0
    //         new-instance v1, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    //         invoke-direct {v1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;-><init>()V
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/internal/b/e;->c()Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v3
    //         invoke-virtual {v1, v3}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->setRequestId(Lcom/amazon/device/iap/model/RequestId;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    //         move-result-object v1
    //         sget-object v3, Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;->SUCCESSFUL:Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;
    //         invoke-virtual {v1, v3}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->setRequestStatus(Lcom/amazon/device/iap/model/UserDataResponse$RequestStatus;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->setUserData(Lcom/amazon/device/iap/model/UserData;)Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/model/UserDataResponseBuilder;->build()Lcom/amazon/device/iap/model/UserDataResponse;
    //         move-result-object v1
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v3
    //         const-string v4, "userId"
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v3, v4, v0}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/String;Ljava/lang/Object;)V
    //         invoke-virtual {v2}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/Object;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    companion object {
    private val b: String = null!!
    }
}
