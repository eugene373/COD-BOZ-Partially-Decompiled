package com.amazon.device.iap.internal.util

// Auto-emitted from smali source: MetricsHelper.java.
// 9 fields, 6 methods.

open class MetricsHelper {
    public constructor()

    companion object {
    private val DESCRIPTION: String = "description"
    private val EXCEPTION_MESSAGE: String = "exceptionMessage"
    private val EXCEPTION_METRIC: String = "GenericException"
    private val JSON_PARSING_EXCEPTION_METRIC: String = "JsonParsingFailed"
    private val JSON_STRING: String = "jsonString"
    private val RECEIPT_VERIFICATION_FAILED_METRIC: String = "IapReceiptVerificationFailed"
    private val SIGNATURE: String = "signature"
    private val STRING_TO_SIGN: String = "stringToSign"
    private val TAG: String = null!!

    public @JvmStatic fun submitExceptionMetrics(p0: String, p1: String, p2: Exception) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         const-string v1, "exceptionMessage"
    //         invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "description"
    //         invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "GenericException"
    //         invoke-static {p0, v1, v0}, Lcom/amazon/device/iap/internal/util/MetricsHelper;->submitMetric(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/amazon/device/iap/internal/util/MetricsHelper;->TAG:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "error calling submitMetric: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    public @JvmStatic fun submitJsonParsingExceptionMetrics(p0: String, p1: String, p2: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         const-string v1, "jsonString"
    //         invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "description"
    //         invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "JsonParsingFailed"
    //         invoke-static {p0, v1, v0}, Lcom/amazon/device/iap/internal/util/MetricsHelper;->submitMetric(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/amazon/device/iap/internal/util/MetricsHelper;->TAG:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "error calling submitMetric: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    protected @JvmStatic fun submitMetric(p0: String, p1: String, p2: org.json.JSONObject) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/amazon/device/iap/internal/b/h/a;
    //         new-instance v1, Lcom/amazon/device/iap/internal/b/e;
    //         invoke-static {p0}, Lcom/amazon/device/iap/model/RequestId;->fromString(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Lcom/amazon/device/iap/internal/b/e;-><init>(Lcom/amazon/device/iap/model/RequestId;)V
    //         invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v0, v1, p1, v2}, Lcom/amazon/device/iap/internal/b/h/a;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/h/a;->a_()V
    //         return-void
    */

    public @JvmStatic fun submitReceiptVerificationFailureMetrics(p0: String, p1: String, p2: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         const-string v1, "stringToSign"
    //         invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "signature"
    //         invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "IapReceiptVerificationFailed"
    //         invoke-static {p0, v1, v0}, Lcom/amazon/device/iap/internal/util/MetricsHelper;->submitMetric(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/amazon/device/iap/internal/util/MetricsHelper;->TAG:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "error calling submitMetric: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    }
}
