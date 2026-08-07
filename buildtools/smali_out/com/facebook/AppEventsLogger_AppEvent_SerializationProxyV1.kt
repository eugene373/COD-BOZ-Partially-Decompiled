package com.facebook

// Auto-emitted from smali source: AppEventsLogger.java.
// 3 fields, 3 methods.

open class AppEventsLogger_AppEvent_SerializationProxyV1: java.io.Serializable {
    private val isImplicit: Boolean
    private val jsonString: String

    private constructor(p0: String, p1: Boolean)

    constructor(p0: String, p1: Boolean, p2: com.facebook.AppEventsLogger.1)

    private fun readResolve(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/AppEventsLogger$AppEvent;
    //         iget-object v1, p0, Lcom/facebook/AppEventsLogger$AppEvent$SerializationProxyV1;->jsonString:Ljava/lang/String;
    //         iget-boolean v2, p0, Lcom/facebook/AppEventsLogger$AppEvent$SerializationProxyV1;->isImplicit:Z
    //         const/4 v3, 0x0
    //         invoke-direct {v0, v1, v2, v3}, Lcom/facebook/AppEventsLogger$AppEvent;-><init>(Ljava/lang/String;ZLcom/facebook/AppEventsLogger$1;)V
    //         return-object v0
    */

    companion object {
    private val serialVersionUID: Long = 0L
    }
}
