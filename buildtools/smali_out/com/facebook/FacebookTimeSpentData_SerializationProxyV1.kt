package com.facebook

// Auto-emitted from smali source: FacebookTimeSpentData.java.
// 5 fields, 2 methods.

open class FacebookTimeSpentData_SerializationProxyV1: java.io.Serializable {
    private val interruptionCount: Int
    private val lastResumeTime: Long
    private val lastSuspendTime: Long
    private val millisecondsSpentInSession: Long

    constructor(p0: Long, p1: Long, p2: Long, p3: Int)

    private fun readResolve(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 10
    //         new-instance v1, Lcom/facebook/FacebookTimeSpentData;
    //         iget-wide v2, p0, Lcom/facebook/FacebookTimeSpentData$SerializationProxyV1;->lastResumeTime:J
    //         iget-wide v4, p0, Lcom/facebook/FacebookTimeSpentData$SerializationProxyV1;->lastSuspendTime:J
    //         iget-wide v6, p0, Lcom/facebook/FacebookTimeSpentData$SerializationProxyV1;->millisecondsSpentInSession:J
    //         iget v8, p0, Lcom/facebook/FacebookTimeSpentData$SerializationProxyV1;->interruptionCount:I
    //         const/4 v9, 0x0
    //         invoke-direct/range {v1 .. v9}, Lcom/facebook/FacebookTimeSpentData;-><init>(JJJILcom/facebook/FacebookTimeSpentData$1;)V
    //         return-object v1
    */

    companion object {
    private val serialVersionUID: Long = 0x6L
    }
}
