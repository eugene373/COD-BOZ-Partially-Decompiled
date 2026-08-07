package com.facebook

// Auto-emitted from smali source: FacebookTimeSpentData.java.
// 15 fields, 14 methods.

open class FacebookTimeSpentData: java.io.Serializable {
    private var firstOpenSourceApplication: String
    private var interruptionCount: Int
    private var isAppActive: Boolean
    private var isWarmLaunch: Boolean
    private var lastActivateEventLoggedTime: Long
    private var lastResumeTime: Long
    private var lastSuspendTime: Long
    private var millisecondsSpentInSession: Long

    constructor()

    private constructor(p0: Long, p1: Long, p2: Long, p3: Int)

    constructor(p0: Long, p1: Long, p2: Long, p3: Int, p4: com.facebook.FacebookTimeSpentData.1)

    private constructor(p0: Long, p1: Long, p2: Long, p3: Int, p4: String)

    constructor(p0: Long, p1: Long, p2: Long, p3: Int, p4: String, p5: com.facebook.FacebookTimeSpentData.1)

    private fun isColdLaunch(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v1, 0x1
    //         iget-boolean v0, p0, Lcom/facebook/FacebookTimeSpentData;->isWarmLaunch:Z
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         iput-boolean v1, p0, Lcom/facebook/FacebookTimeSpentData;->isWarmLaunch:Z
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun logAppDeactivatedEvent(p0: com.facebook.AppEventsLogger, p1: Long) { /* TODO(body): (Lcom/facebook/AppEventsLogger;J)V */ }
    /*
    //         .locals 6
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "fb_mobile_app_interruptions"
    //         iget v2, p0, Lcom/facebook/FacebookTimeSpentData;->interruptionCount:I
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v1, "fb_mobile_time_between_sessions"
    //         const-string v2, "session_quanta_%d"
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         invoke-static {p2, p3}, Lcom/facebook/FacebookTimeSpentData;->getQuantaIndex(J)I
    //         move-result v5
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v3, v4
    //         invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "fb_mobile_launch_source"
    //         iget-object v2, p0, Lcom/facebook/FacebookTimeSpentData;->firstOpenSourceApplication:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "fb_mobile_deactivate_app"
    //         iget-wide v2, p0, Lcom/facebook/FacebookTimeSpentData;->millisecondsSpentInSession:J
    //         const-wide/16 v4, 0x3e8
    //         div-long/2addr v2, v4
    //         long-to-double v2, v2
    //         invoke-virtual {p1, v1, v2, v3, v0}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;DLandroid/os/Bundle;)V
    //         invoke-direct {p0}, Lcom/facebook/FacebookTimeSpentData;->resetSession()V
    //         return-void
    */

    private fun resetSession() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const-wide/16 v2, -0x1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/facebook/FacebookTimeSpentData;->isAppActive:Z
    //         iput-wide v2, p0, Lcom/facebook/FacebookTimeSpentData;->lastResumeTime:J
    //         iput-wide v2, p0, Lcom/facebook/FacebookTimeSpentData;->lastSuspendTime:J
    //         iput v0, p0, Lcom/facebook/FacebookTimeSpentData;->interruptionCount:I
    //         const-wide/16 v0, 0x0
    //         iput-wide v0, p0, Lcom/facebook/FacebookTimeSpentData;->millisecondsSpentInSession:J
    //         return-void
    */

    private fun wasSuspendedEver(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/facebook/FacebookTimeSpentData;->lastSuspendTime:J
    //         const-wide/16 v2, -0x1
    //         cmp-long v0, v0, v2
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun writeReplace(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 10
    //         new-instance v1, Lcom/facebook/FacebookTimeSpentData$SerializationProxyV2;
    //         iget-wide v2, p0, Lcom/facebook/FacebookTimeSpentData;->lastResumeTime:J
    //         iget-wide v4, p0, Lcom/facebook/FacebookTimeSpentData;->lastSuspendTime:J
    //         iget-wide v6, p0, Lcom/facebook/FacebookTimeSpentData;->millisecondsSpentInSession:J
    //         iget v8, p0, Lcom/facebook/FacebookTimeSpentData;->interruptionCount:I
    //         iget-object v9, p0, Lcom/facebook/FacebookTimeSpentData;->firstOpenSourceApplication:Ljava/lang/String;
    //         invoke-direct/range {v1 .. v9}, Lcom/facebook/FacebookTimeSpentData$SerializationProxyV2;-><init>(JJJILjava/lang/String;)V
    //         return-object v1
    */

    fun onResume(p0: com.facebook.AppEventsLogger, p1: Long, p2: String) { /* TODO(body): (Lcom/facebook/AppEventsLogger;JLjava/lang/String;)V */ }
    /*
    //         .locals 6
    //         const-wide/16 v0, 0x0
    //         invoke-direct {p0}, Lcom/facebook/FacebookTimeSpentData;->isColdLaunch()Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         iget-wide v2, p0, Lcom/facebook/FacebookTimeSpentData;->lastActivateEventLoggedTime:J
    //         sub-long v2, p2, v2
    //         const-wide/32 v4, 0x493e0
    //         cmp-long v2, v2, v4
    //         if-lez v2, :cond_1
    //         :cond_0
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         const-string v3, "fb_mobile_launch_source"
    //         invoke-virtual {v2, v3, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v3, "fb_mobile_activate_app"
    //         invoke-virtual {p1, v3, v2}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    //         iput-wide p2, p0, Lcom/facebook/FacebookTimeSpentData;->lastActivateEventLoggedTime:J
    //         :cond_1
    //         iget-boolean v2, p0, Lcom/facebook/FacebookTimeSpentData;->isAppActive:Z
    //         if-eqz v2, :cond_2
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;
    //         sget-object v1, Lcom/facebook/FacebookTimeSpentData;->TAG:Ljava/lang/String;
    //         const-string v2, "Resume for active app"
    //         invoke-static {v0, v1, v2}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_2
    //         invoke-direct {p0}, Lcom/facebook/FacebookTimeSpentData;->wasSuspendedEver()Z
    //         move-result v2
    //         if-eqz v2, :cond_5
    //         iget-wide v2, p0, Lcom/facebook/FacebookTimeSpentData;->lastSuspendTime:J
    //         sub-long v2, p2, v2
    //         :goto_1
    //         cmp-long v4, v2, v0
    //         if-gez v4, :cond_7
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;
    //         sget-object v3, Lcom/facebook/FacebookTimeSpentData;->TAG:Ljava/lang/String;
    //         const-string v4, "Clock skew detected"
    //         invoke-static {v2, v3, v4}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_2
    //         const-wide/32 v2, 0xea60
    //         cmp-long v2, v0, v2
    //         if-lez v2, :cond_6
    //         invoke-direct {p0, p1, v0, v1}, Lcom/facebook/FacebookTimeSpentData;->logAppDeactivatedEvent(Lcom/facebook/AppEventsLogger;J)V
    //         :cond_3
    //         :goto_3
    //         iget v0, p0, Lcom/facebook/FacebookTimeSpentData;->interruptionCount:I
    //         if-nez v0, :cond_4
    //         iput-object p4, p0, Lcom/facebook/FacebookTimeSpentData;->firstOpenSourceApplication:Ljava/lang/String;
    //         :cond_4
    //         iput-wide p2, p0, Lcom/facebook/FacebookTimeSpentData;->lastResumeTime:J
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/FacebookTimeSpentData;->isAppActive:Z
    //         goto :goto_0
    //         :cond_5
    //         move-wide v2, v0
    //         goto :goto_1
    //         :cond_6
    //         const-wide/16 v2, 0x3e8
    //         cmp-long v0, v0, v2
    //         if-lez v0, :cond_3
    //         iget v0, p0, Lcom/facebook/FacebookTimeSpentData;->interruptionCount:I
    //         add-int/lit8 v0, v0, 0x1
    //         iput v0, p0, Lcom/facebook/FacebookTimeSpentData;->interruptionCount:I
    //         goto :goto_3
    //         :cond_7
    //         move-wide v0, v2
    //         goto :goto_2
    */

    fun onSuspend(p0: com.facebook.AppEventsLogger, p1: Long) { /* TODO(body): (Lcom/facebook/AppEventsLogger;J)V */ }
    /*
    //         .locals 6
    //         const-wide/16 v0, 0x0
    //         iget-boolean v2, p0, Lcom/facebook/FacebookTimeSpentData;->isAppActive:Z
    //         if-nez v2, :cond_0
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;
    //         sget-object v1, Lcom/facebook/FacebookTimeSpentData;->TAG:Ljava/lang/String;
    //         const-string v2, "Suspend for inactive app"
    //         invoke-static {v0, v1, v2}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-wide v2, p0, Lcom/facebook/FacebookTimeSpentData;->lastResumeTime:J
    //         sub-long v2, p2, v2
    //         cmp-long v4, v2, v0
    //         if-gez v4, :cond_1
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;
    //         sget-object v3, Lcom/facebook/FacebookTimeSpentData;->TAG:Ljava/lang/String;
    //         const-string v4, "Clock skew detected"
    //         invoke-static {v2, v3, v4}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_1
    //         iget-wide v2, p0, Lcom/facebook/FacebookTimeSpentData;->millisecondsSpentInSession:J
    //         add-long/2addr v0, v2
    //         iput-wide v0, p0, Lcom/facebook/FacebookTimeSpentData;->millisecondsSpentInSession:J
    //         iput-wide p2, p0, Lcom/facebook/FacebookTimeSpentData;->lastSuspendTime:J
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/facebook/FacebookTimeSpentData;->isAppActive:Z
    //         goto :goto_0
    //         :cond_1
    //         move-wide v0, v2
    //         goto :goto_1
    */

    companion object {
    private val APP_ACTIVATE_SUPPRESSION_PERIOD_IN_MILLISECONDS: Long = 0x493e0L
    private val FIRST_TIME_LOAD_RESUME_TIME: Long = 0L
    private val INACTIVE_SECONDS_QUANTA: LongArray = null!!
    private val INTERRUPTION_THRESHOLD_MILLISECONDS: Long = 0x3e8L
    private val NUM_MILLISECONDS_IDLE_TO_BE_NEW_SESSION: Long = 0xea60L
    private val TAG: String = null!!
    private val serialVersionUID: Long = 0x1L

    private @JvmStatic fun getQuantaIndex(p0: Long): Int { return TODO("body: (J)I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         :goto_0
    //         sget-object v1, Lcom/facebook/FacebookTimeSpentData;->INACTIVE_SECONDS_QUANTA:[J
    //         array-length v1, v1
    //         if-ge v0, v1, :cond_0
    //         sget-object v1, Lcom/facebook/FacebookTimeSpentData;->INACTIVE_SECONDS_QUANTA:[J
    //         aget-wide v2, v1, v0
    //         cmp-long v1, v2, p0
    //         if-gez v1, :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return v0
    */

    }
}
