package com.google.android.gms.internal

// Auto-emitted from smali.
// 11 fields, 24 methods.

open class mc: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.location.Geofence {
    private val BR: Int
    private val XC: String
    private val aeh: Int
    private val aej: Short
    private val aek: Double
    private val ael: Double
    private val aem: Float
    private val aen: Int
    private val aeo: Int
    private val afm: Long

    public constructor(p0: Int, p1: String, p2: Int, p3: Short, p4: Double, p5: Double, p6: Float, p7: Long, p8: Int, p9: Int)

    public constructor(p0: String, p1: Int, p2: Short, p3: Double, p4: Double, p5: Float, p6: Long, p7: Int, p8: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/mc;->CREATOR:Lcom/google/android/gms/internal/md;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         if-nez p1, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         instance-of v2, p1, Lcom/google/android/gms/internal/mc;
    //         if-nez v2, :cond_3
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         check-cast p1, Lcom/google/android/gms/internal/mc;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget v2, p0, Lcom/google/android/gms/internal/mc;->aem:F
    //         iget v3, p1, Lcom/google/android/gms/internal/mc;->aem:F
    //         cmpl-float v2, v2, v3
    //         if-eqz v2, :cond_4
    //         move v0, v1
    //         goto :goto_0
    //         :cond_4
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/mc;->aek:D
    //         iget-wide v4, p1, Lcom/google/android/gms/internal/mc;->aek:D
    //         cmpl-double v2, v2, v4
    //         if-eqz v2, :cond_5
    //         move v0, v1
    //         goto :goto_0
    //         :cond_5
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/mc;->ael:D
    //         iget-wide v4, p1, Lcom/google/android/gms/internal/mc;->ael:D
    //         cmpl-double v2, v2, v4
    //         if-eqz v2, :cond_6
    //         move v0, v1
    //         goto :goto_0
    //         :cond_6
    //         iget-short v2, p0, Lcom/google/android/gms/internal/mc;->aej:S
    //         iget-short v3, p1, Lcom/google/android/gms/internal/mc;->aej:S
    //         if-eq v2, v3, :cond_0
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getExpirationTime(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/mc;->afm:J
    //         return-wide v0
    */

    public fun getLatitude(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/mc;->aek:D
    //         return-wide v0
    */

    public fun getLongitude(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/mc;->ael:D
    //         return-wide v0
    */

    public fun getNotificationResponsiveness(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/mc;->aen:I
    //         return v0
    */

    public fun getRequestId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/mc;->XC:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/mc;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 6
    //         const/16 v4, 0x20
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/mc;->aek:D
    //         invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J
    //         move-result-wide v0
    //         ushr-long v2, v0, v4
    //         xor-long/2addr v0, v2
    //         long-to-int v0, v0
    //         add-int/lit8 v0, v0, 0x1f
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/mc;->ael:D
    //         invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J
    //         move-result-wide v2
    //         mul-int/lit8 v0, v0, 0x1f
    //         ushr-long v4, v2, v4
    //         xor-long/2addr v2, v4
    //         long-to-int v1, v2
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget v1, p0, Lcom/google/android/gms/internal/mc;->aem:F
    //         invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v1
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget-short v1, p0, Lcom/google/android/gms/internal/mc;->aej:S
    //         add-int/2addr v0, v1
    //         mul-int/lit8 v0, v0, 0x1f
    //         iget v1, p0, Lcom/google/android/gms/internal/mc;->aeh:I
    //         add-int/2addr v0, v1
    //         return v0
    */

    public fun ma(): Short { return TODO("body: ()S") }
    /*
    //         .locals 1
    //         iget-short v0, p0, Lcom/google/android/gms/internal/mc;->aej:S
    //         return v0
    */

    public fun mb(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/mc;->aem:F
    //         return v0
    */

    public fun mc(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/mc;->aeh:I
    //         return v0
    */

    public fun md(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/mc;->aeo:I
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         const-string v1, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]"
    //         const/16 v2, 0x9
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         iget-short v4, p0, Lcom/google/android/gms/internal/mc;->aej:S
    //         invoke-static {v4}, Lcom/google/android/gms/internal/mc;->el(I)Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x1
    //         iget-object v4, p0, Lcom/google/android/gms/internal/mc;->XC:Ljava/lang/String;
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x2
    //         iget v4, p0, Lcom/google/android/gms/internal/mc;->aeh:I
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x3
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/mc;->aek:D
    //         invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x4
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/mc;->ael:D
    //         invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x5
    //         iget v4, p0, Lcom/google/android/gms/internal/mc;->aem:F
    //         invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x6
    //         iget v4, p0, Lcom/google/android/gms/internal/mc;->aen:I
    //         div-int/lit16 v4, v4, 0x3e8
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x7
    //         iget v4, p0, Lcom/google/android/gms/internal/mc;->aeo:I
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/16 v3, 0x8
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/mc;->afm:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/mc;->CREATOR:Lcom/google/android/gms/internal/md;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/md;->a(Lcom/google/android/gms/internal/mc;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.md = null!!

    private @JvmStatic fun a(p0: Double, p1: Double) { /* TODO(body): (DD)V */ }
    /*
    //         .locals 4
    //         const-wide v0, 0x4056800000000000L    # 90.0
    //         cmpl-double v0, p0, v0
    //         if-gtz v0, :cond_0
    //         const-wide v0, -0x3fa9800000000000L    # -90.0
    //         cmpg-double v0, p0, v0
    //         if-gez v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "invalid latitude: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         const-wide v0, 0x4066800000000000L    # 180.0
    //         cmpl-double v0, p2, v0
    //         if-gtz v0, :cond_2
    //         const-wide v0, -0x3f99800000000000L    # -180.0
    //         cmpg-double v0, p2, v0
    //         if-gez v0, :cond_3
    //         :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "invalid longitude: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_3
    //         return-void
    */

    private @JvmStatic fun b(p0: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         cmpg-float v0, p0, v0
    //         if-gtz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "invalid radius: "
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

    private @JvmStatic fun bY(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         if-eqz p0, :cond_0
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         const/16 v1, 0x64
    //         if-le v0, v1, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "requestId is null or too long: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         return-void
    */

    private @JvmStatic fun ek(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 3
    //         and-int/lit8 v0, p0, 0x7
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "No supported transition specified: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return v0
    */

    private @JvmStatic fun el(p0: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         packed-switch p0, :pswitch_data_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :pswitch_0
    //         const-string v0, "CIRCLE"
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //         .end packed-switch
    */

    public @JvmStatic fun h(p0: ByteArray): com.google.android.gms.internal.mc { return TODO("body: ([B)Lcom/google/android/gms/internal/mc;") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;
    //         move-result-object v0
    //         array-length v1, p0
    //         invoke-virtual {v0, p0, v2, v1}, Landroid/os/Parcel;->unmarshall([BII)V
    //         invoke-virtual {v0, v2}, Landroid/os/Parcel;->setDataPosition(I)V
    //         sget-object v1, Lcom/google/android/gms/internal/mc;->CREATOR:Lcom/google/android/gms/internal/md;
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/md;->cw(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mc;
    //         move-result-object v1
    //         invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    //         return-object v1
    */

    }
}
