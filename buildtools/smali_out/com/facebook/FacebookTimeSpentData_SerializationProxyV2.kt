package com.facebook

// Auto-emitted from smali source: FacebookTimeSpentData.java.
// 6 fields, 2 methods.

open class FacebookTimeSpentData_SerializationProxyV2: java.io.Serializable {
    private val firstOpenSourceApplication: String
    private val interruptionCount: Int
    private val lastResumeTime: Long
    private val lastSuspendTime: Long
    private val millisecondsSpentInSession: Long

    constructor(p0: Long, p1: Long, p2: Long, p3: Int, p4: String)

    private fun readResolve(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 11
    //         new-instance v1, Lcom/facebook/FacebookTimeSpentData;
    //         iget-wide v2, p0, Lcom/facebook/FacebookTimeSpentData$SerializationProxyV2;->lastResumeTime:J
    //         iget-wide v4, p0, Lcom/facebook/FacebookTimeSpentData$SerializationProxyV2;->lastSuspendTime:J
    //         iget-wide v6, p0, Lcom/facebook/FacebookTimeSpentData$SerializationProxyV2;->millisecondsSpentInSession:J
    //         iget v8, p0, Lcom/facebook/FacebookTimeSpentData$SerializationProxyV2;->interruptionCount:I
    //         iget-object v9, p0, Lcom/facebook/FacebookTimeSpentData$SerializationProxyV2;->firstOpenSourceApplication:Ljava/lang/String;
    //         const/4 v10, 0x0
    //         invoke-direct/range {v1 .. v10}, Lcom/facebook/FacebookTimeSpentData;-><init>(JJJILjava/lang/String;Lcom/facebook/FacebookTimeSpentData$1;)V
    //         return-object v1
    */

    companion object {
    private val serialVersionUID: Long = 0x6L
    }
}
