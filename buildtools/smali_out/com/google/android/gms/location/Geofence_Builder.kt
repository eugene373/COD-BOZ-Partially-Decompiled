package com.google.android.gms.location

// Auto-emitted from smali.
// 9 fields, 8 methods.

class Geofence_Builder {
    private var XC: String
    private var aeh: Int
    private var aei: Long
    private var aej: Short
    private var aek: Double
    private var ael: Double
    private var aem: Float
    private var aen: Int
    private var aeo: Int

    public constructor()

    public fun build(): com.google.android.gms.location.Geofence { return TODO("body: ()Lcom/google/android/gms/location/Geofence;") }
    /*
    //         .locals 13
    //         iget-object v0, p0, Lcom/google/android/gms/location/Geofence$Builder;->XC:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Request ID not set."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/location/Geofence$Builder;->aeh:I
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Transitions types not set."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget v0, p0, Lcom/google/android/gms/location/Geofence$Builder;->aeh:I
    //         and-int/lit8 v0, v0, 0x4
    //         if-eqz v0, :cond_2
    //         iget v0, p0, Lcom/google/android/gms/location/Geofence$Builder;->aeo:I
    //         if-gez v0, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         iget-wide v0, p0, Lcom/google/android/gms/location/Geofence$Builder;->aei:J
    //         const-wide/high16 v2, -0x8000000000000000L
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_3
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Expiration not set."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_3
    //         iget-short v0, p0, Lcom/google/android/gms/location/Geofence$Builder;->aej:S
    //         const/4 v1, -0x1
    //         if-ne v0, v1, :cond_4
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Geofence region not set."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_4
    //         iget v0, p0, Lcom/google/android/gms/location/Geofence$Builder;->aen:I
    //         if-gez v0, :cond_5
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Notification responsiveness should be nonnegative."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_5
    //         new-instance v0, Lcom/google/android/gms/internal/mc;
    //         iget-object v1, p0, Lcom/google/android/gms/location/Geofence$Builder;->XC:Ljava/lang/String;
    //         iget v2, p0, Lcom/google/android/gms/location/Geofence$Builder;->aeh:I
    //         const/4 v3, 0x1
    //         iget-wide v4, p0, Lcom/google/android/gms/location/Geofence$Builder;->aek:D
    //         iget-wide v6, p0, Lcom/google/android/gms/location/Geofence$Builder;->ael:D
    //         iget v8, p0, Lcom/google/android/gms/location/Geofence$Builder;->aem:F
    //         iget-wide v9, p0, Lcom/google/android/gms/location/Geofence$Builder;->aei:J
    //         iget v11, p0, Lcom/google/android/gms/location/Geofence$Builder;->aen:I
    //         iget v12, p0, Lcom/google/android/gms/location/Geofence$Builder;->aeo:I
    //         invoke-direct/range {v0 .. v12}, Lcom/google/android/gms/internal/mc;-><init>(Ljava/lang/String;ISDDFJII)V
    //         return-object v0
    */

    public fun setCircularRegion(latitude: Double, longitude: Double, radius: Float): com.google.android.gms.location.Geofence.Builder { return TODO("body: (DDF)Lcom/google/android/gms/location/Geofence$Builder;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-short v0, p0, Lcom/google/android/gms/location/Geofence$Builder;->aej:S
    //         iput-wide p1, p0, Lcom/google/android/gms/location/Geofence$Builder;->aek:D
    //         iput-wide p3, p0, Lcom/google/android/gms/location/Geofence$Builder;->ael:D
    //         iput p5, p0, Lcom/google/android/gms/location/Geofence$Builder;->aem:F
    //         return-object p0
    */

    public fun setExpirationDuration(durationMillis: Long): com.google.android.gms.location.Geofence.Builder { return TODO("body: (J)Lcom/google/android/gms/location/Geofence$Builder;") }
    /*
    //         .locals 3
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, p1, v0
    //         if-gez v0, :cond_0
    //         const-wide/16 v0, -0x1
    //         iput-wide v0, p0, Lcom/google/android/gms/location/Geofence$Builder;->aei:J
    //         :goto_0
    //         return-object p0
    //         :cond_0
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v0
    //         add-long/2addr v0, p1
    //         iput-wide v0, p0, Lcom/google/android/gms/location/Geofence$Builder;->aei:J
    //         goto :goto_0
    */

    public fun setLoiteringDelay(loiteringDelayMs: Int): com.google.android.gms.location.Geofence.Builder { return TODO("body: (I)Lcom/google/android/gms/location/Geofence$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/location/Geofence$Builder;->aeo:I
    //         return-object p0
    */

    public fun setNotificationResponsiveness(notificationResponsivenessMs: Int): com.google.android.gms.location.Geofence.Builder { return TODO("body: (I)Lcom/google/android/gms/location/Geofence$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/location/Geofence$Builder;->aen:I
    //         return-object p0
    */

    public fun setRequestId(requestId: String): com.google.android.gms.location.Geofence.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/location/Geofence$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/location/Geofence$Builder;->XC:Ljava/lang/String;
    //         return-object p0
    */

    public fun setTransitionTypes(transitionTypes: Int): com.google.android.gms.location.Geofence.Builder { return TODO("body: (I)Lcom/google/android/gms/location/Geofence$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/location/Geofence$Builder;->aeh:I
    //         return-object p0
    */

}
