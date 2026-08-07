package com.facebook

// Auto-emitted from smali source: AppEventsLogger.java.
// 10 fields, 4 methods.

open class AppEventsLogger_SessionEventsState {
    private val MAX_ACCUMULATED_LOG_EVENTS: Int
    private var accumulatedEvents: java.util.List
    private var attributionIdentifiers: com.facebook.internal.AttributionIdentifiers
    private var hashedDeviceAndAppId: String
    private var inFlightEvents: java.util.List
    private var numSkippedEventsDueToFullBuffer: Int
    private var packageName: String

    public constructor(p0: com.facebook.internal.AttributionIdentifiers, p1: String, p2: String)

    private fun getStringAsByteArray(p0: String): ByteArray { return TODO("body: (Ljava/lang/String;)[B") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         :try_start_0
    //         const-string v1, "UTF-8"
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    //         :try_end_0
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         const-string v2, "Encoding exception: "
    //         invoke-static {v2, v1}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V
    //         goto :goto_0
    */

    private fun populateRequest(p0: com.facebook.Request, p1: Int, p2: org.json.JSONArray, p3: Boolean, p4: Boolean) { /* TODO(body): (Lcom/facebook/Request;ILorg/json/JSONArray;ZZ)V */ }
    /*
    //         .locals 4
    //         invoke-static {}, Lcom/facebook/model/GraphObject$Factory;->create()Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         const-string v1, "event"
    //         const-string v2, "CUSTOM_APP_EVENTS"
    //         invoke-interface {v0, v1, v2}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         iget v1, p0, Lcom/facebook/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I
    //         if-lez v1, :cond_0
    //         const-string v1, "num_skipped_events"
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v0, v1, v2}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         :cond_0
    //         if-eqz p4, :cond_1
    //         iget-object v1, p0, Lcom/facebook/AppEventsLogger$SessionEventsState;->attributionIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;
    //         iget-object v2, p0, Lcom/facebook/AppEventsLogger$SessionEventsState;->hashedDeviceAndAppId:Ljava/lang/String;
    //         invoke-static {v0, v1, v2, p5}, Lcom/facebook/internal/Utility;->setAppEventAttributionParameters(Lcom/facebook/model/GraphObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Z)V
    //         :cond_1
    //         :try_start_0
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->access$1000()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->setAppEventExtendedDeviceInfoParameters(Lcom/facebook/model/GraphObject;Landroid/content/Context;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         const-string v1, "application_package_name"
    //         iget-object v2, p0, Lcom/facebook/AppEventsLogger$SessionEventsState;->packageName:Ljava/lang/String;
    //         invoke-interface {v0, v1, v2}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         invoke-virtual {p1, v0}, Lcom/facebook/Request;->setGraphObject(Lcom/facebook/model/GraphObject;)V
    //         invoke-virtual {p1}, Lcom/facebook/Request;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         if-nez v0, :cond_2
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         :cond_2
    //         invoke-virtual {p3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_3
    //         const-string v2, "custom_events_file"
    //         invoke-direct {p0, v1}, Lcom/facebook/AppEventsLogger$SessionEventsState;->getStringAsByteArray(Ljava/lang/String;)[B
    //         move-result-object v3
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
    //         invoke-virtual {p1, v1}, Lcom/facebook/Request;->setTag(Ljava/lang/Object;)V
    //         :cond_3
    //         invoke-virtual {p1, v0}, Lcom/facebook/Request;->setParameters(Landroid/os/Bundle;)V
    //         return-void
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun populateRequest(p0: com.facebook.Request, p1: Boolean, p2: Boolean, p3: Boolean): Int { return TODO("body: (Lcom/facebook/Request;ZZZ)I") }
    /*
    //         .locals 6
    //         monitor-enter p0
    //         :try_start_0
    //         iget v2, p0, Lcom/facebook/AppEventsLogger$SessionEventsState;->numSkippedEventsDueToFullBuffer:I
    //         iget-object v0, p0, Lcom/facebook/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;
    //         iget-object v1, p0, Lcom/facebook/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;
    //         invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    //         iget-object v0, p0, Lcom/facebook/AppEventsLogger$SessionEventsState;->accumulatedEvents:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->clear()V
    //         new-instance v3, Lorg/json/JSONArray;
    //         invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V
    //         iget-object v0, p0, Lcom/facebook/AppEventsLogger$SessionEventsState;->inFlightEvents:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AppEventsLogger$AppEvent;
    //         if-nez p2, :cond_1
    //         invoke-virtual {v0}, Lcom/facebook/AppEventsLogger$AppEvent;->getIsImplicit()Z
    //         move-result v4
    //         if-nez v4, :cond_0
    //         :cond_1
    //         invoke-virtual {v0}, Lcom/facebook/AppEventsLogger$AppEvent;->getJSONObject()Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_2
    //         :try_start_1
    //         invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
    //         move-result v0
    //         if-nez v0, :cond_3
    //         const/4 v0, 0x0
    //         monitor-exit p0
    //         :goto_1
    //         return v0
    //         :cond_3
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move v4, p3
    //         move v5, p4
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/AppEventsLogger$SessionEventsState;->populateRequest(Lcom/facebook/Request;ILorg/json/JSONArray;ZZ)V
    //         invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
    //         move-result v0
    //         goto :goto_1
    */

    companion object {
    @JvmField public val ENCODED_EVENTS_KEY: String = "encoded_events"
    @JvmField public val EVENT_COUNT_KEY: String = "event_count"
    @JvmField public val NUM_SKIPPED_KEY: String = "num_skipped"
    }
}
