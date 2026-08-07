package com.google.android.gms.location

// Auto-emitted from smali.
// 14 fields, 27 methods.

class LocationRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var UK: Boolean
    var aei: Long
    var aes: Long
    var aet: Long
    var aeu: Int
    var aev: Float
    var aew: Long
    var mPriority: Int

    public constructor()

    constructor(versionCode: Int, priority: Int, interval: Long, fastestInterval: Long, explicitFastestInterval: Boolean, expireAt: Long, numUpdates: Int, smallestDisplacement: Float, maxWaitTime: Long)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(object: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         .end local p1    # "object":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "object":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/location/LocationRequest;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/location/LocationRequest;
    //         .end local p1    # "object":Ljava/lang/Object;
    //         iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->mPriority:I
    //         iget v3, p1, Lcom/google/android/gms/location/LocationRequest;->mPriority:I
    //         if-ne v2, v3, :cond_3
    //         iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->aes:J
    //         iget-wide v4, p1, Lcom/google/android/gms/location/LocationRequest;->aes:J
    //         cmp-long v2, v2, v4
    //         if-nez v2, :cond_3
    //         iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->aet:J
    //         iget-wide v4, p1, Lcom/google/android/gms/location/LocationRequest;->aet:J
    //         cmp-long v2, v2, v4
    //         if-nez v2, :cond_3
    //         iget-boolean v2, p0, Lcom/google/android/gms/location/LocationRequest;->UK:Z
    //         iget-boolean v3, p1, Lcom/google/android/gms/location/LocationRequest;->UK:Z
    //         if-ne v2, v3, :cond_3
    //         iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         iget-wide v4, p1, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         cmp-long v2, v2, v4
    //         if-nez v2, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->aeu:I
    //         iget v3, p1, Lcom/google/android/gms/location/LocationRequest;->aeu:I
    //         if-ne v2, v3, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->aev:F
    //         iget v3, p1, Lcom/google/android/gms/location/LocationRequest;->aev:F
    //         cmpl-float v2, v2, v3
    //         if-eqz v2, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getExpirationTime(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         return-wide v0
    */

    public fun getFastestInterval(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->aet:J
    //         return-wide v0
    */

    public fun getInterval(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->aes:J
    //         return-wide v0
    */

    public fun getNumUpdates(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->aeu:I
    //         return v0
    */

    public fun getPriority(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->mPriority:I
    //         return v0
    */

    public fun getSmallestDisplacement(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->aev:F
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/location/LocationRequest;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x7
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->mPriority:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->aes:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->aet:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-boolean v2, p0, Lcom/google/android/gms/location/LocationRequest;->UK:Z
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->aeu:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x6
    //         iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->aev:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun setExpirationDuration(millis: Long): com.google.android.gms.location.LocationRequest { return TODO("body: (J)Lcom/google/android/gms/location/LocationRequest;") }
    /*
    //         .locals 9
    //         const-wide v6, 0x7fffffffffffffffL
    //         const-wide/16 v4, 0x0
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v0
    //         sub-long v2, v6, v0
    //         cmp-long v2, p1, v2
    //         if-lez v2, :cond_1
    //         iput-wide v6, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         :goto_0
    //         iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         cmp-long v0, v0, v4
    //         if-gez v0, :cond_0
    //         iput-wide v4, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         :cond_0
    //         return-object p0
    //         :cond_1
    //         add-long/2addr v0, p1
    //         iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         goto :goto_0
    */

    public fun setExpirationTime(millis: Long): com.google.android.gms.location.LocationRequest { return TODO("body: (J)Lcom/google/android/gms/location/LocationRequest;") }
    /*
    //         .locals 5
    //         const-wide/16 v2, 0x0
    //         iput-wide p1, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         cmp-long v0, v0, v2
    //         if-gez v0, :cond_0
    //         iput-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         :cond_0
    //         return-object p0
    */

    public fun setFastestInterval(millis: Long): com.google.android.gms.location.LocationRequest { return TODO("body: (J)Lcom/google/android/gms/location/LocationRequest;") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Lcom/google/android/gms/location/LocationRequest;->v(J)V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->UK:Z
    //         iput-wide p1, p0, Lcom/google/android/gms/location/LocationRequest;->aet:J
    //         return-object p0
    */

    public fun setInterval(millis: Long): com.google.android.gms.location.LocationRequest { return TODO("body: (J)Lcom/google/android/gms/location/LocationRequest;") }
    /*
    //         .locals 5
    //         invoke-static {p1, p2}, Lcom/google/android/gms/location/LocationRequest;->v(J)V
    //         iput-wide p1, p0, Lcom/google/android/gms/location/LocationRequest;->aes:J
    //         iget-boolean v0, p0, Lcom/google/android/gms/location/LocationRequest;->UK:Z
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->aes:J
    //         long-to-double v0, v0
    //         const-wide/high16 v2, 0x4018000000000000L    # 6.0
    //         div-double/2addr v0, v2
    //         double-to-long v0, v0
    //         iput-wide v0, p0, Lcom/google/android/gms/location/LocationRequest;->aet:J
    //         :cond_0
    //         return-object p0
    */

    public fun setNumUpdates(numUpdates: Int): com.google.android.gms.location.LocationRequest { return TODO("body: (I)Lcom/google/android/gms/location/LocationRequest;") }
    /*
    //         .locals 3
    //         if-gtz p1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "invalid numUpdates: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iput p1, p0, Lcom/google/android/gms/location/LocationRequest;->aeu:I
    //         return-object p0
    */

    public fun setPriority(priority: Int): com.google.android.gms.location.LocationRequest { return TODO("body: (I)Lcom/google/android/gms/location/LocationRequest;") }
    /*
    //         .locals 0
    //         invoke-static {p1}, Lcom/google/android/gms/location/LocationRequest;->eb(I)V
    //         iput p1, p0, Lcom/google/android/gms/location/LocationRequest;->mPriority:I
    //         return-object p0
    */

    public fun setSmallestDisplacement(smallestDisplacementMeters: Float): com.google.android.gms.location.LocationRequest { return TODO("body: (F)Lcom/google/android/gms/location/LocationRequest;") }
    /*
    //         .locals 0
    //         invoke-static {p1}, Lcom/google/android/gms/location/LocationRequest;->a(F)V
    //         iput p1, p0, Lcom/google/android/gms/location/LocationRequest;->aev:F
    //         return-object p0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Request["
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->mPriority:I
    //         invoke-static {v2}, Lcom/google/android/gms/location/LocationRequest;->ec(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget v1, p0, Lcom/google/android/gms/location/LocationRequest;->mPriority:I
    //         const/16 v2, 0x69
    //         if-eq v1, v2, :cond_0
    //         const-string v1, " requested="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->aes:J
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ms"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_0
    //         const-string v1, " fastest="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->aet:J
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ms"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         const-wide v4, 0x7fffffffffffffffL
    //         cmp-long v1, v2, v4
    //         if-eqz v1, :cond_1
    //         iget-wide v2, p0, Lcom/google/android/gms/location/LocationRequest;->aei:J
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v4
    //         sub-long/2addr v2, v4
    //         const-string v1, " expireIn="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "ms"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         iget v1, p0, Lcom/google/android/gms/location/LocationRequest;->aeu:I
    //         const v2, 0x7fffffff
    //         if-eq v1, v2, :cond_2
    //         const-string v1, " num="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/location/LocationRequest;->aeu:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         :cond_2
    //         const/16 v1, 0x5d
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/b;->a(Lcom/google/android/gms/location/LocationRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.location.b = null!!
    @JvmField public val PRIORITY_BALANCED_POWER_ACCURACY: Int = 0x66
    @JvmField public val PRIORITY_HIGH_ACCURACY: Int = 0x64
    @JvmField public val PRIORITY_LOW_POWER: Int = 0x68
    @JvmField public val PRIORITY_NO_POWER: Int = 0x69

    private @JvmStatic fun a(p0: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         cmpg-float v0, p0, v0
    //         if-gez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "invalid displacement: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun create(): com.google.android.gms.location.LocationRequest { return TODO("body: ()Lcom/google/android/gms/location/LocationRequest;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/location/LocationRequest;
    //         invoke-direct {v0}, Lcom/google/android/gms/location/LocationRequest;-><init>()V
    //         return-object v0
    */

    private @JvmStatic fun eb(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         packed-switch p0, :pswitch_data_0
    //         :pswitch_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "invalid quality: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_1
    //         return-void
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x64
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_1
    //         .end packed-switch
    */

    public @JvmStatic fun ec(p0: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         packed-switch p0, :pswitch_data_0
    //         :pswitch_0
    //         const-string v0, "???"
    //         :goto_0
    //         return-object v0
    //         :pswitch_1
    //         const-string v0, "PRIORITY_HIGH_ACCURACY"
    //         goto :goto_0
    //         :pswitch_2
    //         const-string v0, "PRIORITY_BALANCED_POWER_ACCURACY"
    //         goto :goto_0
    //         :pswitch_3
    //         const-string v0, "PRIORITY_LOW_POWER"
    //         goto :goto_0
    //         :pswitch_4
    //         const-string v0, "PRIORITY_NO_POWER"
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x64
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_2
    //             :pswitch_0
    //             :pswitch_3
    //             :pswitch_4
    //         .end packed-switch
    */

    private @JvmStatic fun v(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 4
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, p0, v0
    //         if-gez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "invalid interval: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    }
}
