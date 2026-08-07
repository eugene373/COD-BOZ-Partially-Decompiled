package com.amazon.device.iap.internal.c

// Auto-emitted from smali source: PendingReceipt.java.
// 4 fields, 6 methods.

open class d {
    private val a: String
    private val b: String
    private val c: Long
    private val d: String

    public constructor(p0: String, p1: String, p2: String, p3: Long)

    public fun a(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/c/d;->d:Ljava/lang/String;
    //         return-object v0
    */

    public fun b(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/c/d;->b:Ljava/lang/String;
    //         return-object v0
    */

    public fun c(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/amazon/device/iap/internal/c/d;->c:J
    //         return-wide v0
    */

    public fun d(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         const-string v1, "KEY_USER_ID"
    //         iget-object v2, p0, Lcom/amazon/device/iap/internal/c/d;->a:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "KEY_RECEIPT_STRING"
    //         iget-object v2, p0, Lcom/amazon/device/iap/internal/c/d;->b:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "KEY_REQUEST_ID"
    //         iget-object v2, p0, Lcom/amazon/device/iap/internal/c/d;->d:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "KEY_TIMESTAMP"
    //         iget-wide v2, p0, Lcom/amazon/device/iap/internal/c/d;->c:J
    //         invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    public @JvmStatic fun a(p0: String): com.amazon.device.iap.internal.c.d { return TODO("body: (Ljava/lang/String;)Lcom/amazon/device/iap/internal/c/d;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/amazon/device/iap/internal/c/e;
    //             }
    //         .end annotation
    //         :try_start_0
    //         new-instance v4, Lorg/json/JSONObject;
    //         invoke-direct {v4, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         new-instance v0, Lcom/amazon/device/iap/internal/c/d;
    //         const-string v1, "KEY_USER_ID"
    //         invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "KEY_RECEIPT_STRING"
    //         invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v3, "KEY_REQUEST_ID"
    //         invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v5, "KEY_TIMESTAMP"
    //         invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
    //         move-result-wide v4
    //         invoke-direct/range {v0 .. v5}, Lcom/amazon/device/iap/internal/c/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/amazon/device/iap/internal/c/e;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Input invalid for PendingReceipt Object:"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2, v0}, Lcom/amazon/device/iap/internal/c/e;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    }
}
