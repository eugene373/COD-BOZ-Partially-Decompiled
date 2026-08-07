package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 3 fields, 21 methods.

open class dh: Number(), Comparable {
    private var arR: Double
    private var arS: Long
    private var arT: Boolean

    private constructor(p0: Double)

    private constructor(p0: Long)

    public fun a(p0: com.google.android.gms.tagmanager.dh): Int { return TODO("body: (Lcom/google/android/gms/tagmanager/dh;)I") }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->pA()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/dh;->pA()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/Long;
    //         iget-wide v2, p0, Lcom/google/android/gms/tagmanager/dh;->arS:J
    //         invoke-direct {v0, v2, v3}, Ljava/lang/Long;-><init>(J)V
    //         iget-wide v2, p1, Lcom/google/android/gms/tagmanager/dh;->arS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->doubleValue()D
    //         move-result-wide v0
    //         invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/dh;->doubleValue()D
    //         move-result-wide v2
    //         invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I
    //         move-result v0
    //         goto :goto_0
    */

    public fun byteValue(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->longValue()J
    //         move-result-wide v0
    //         long-to-int v0, v0
    //         int-to-byte v0, v0
    //         return v0
    */

    public fun compareTo(x0: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p1, Lcom/google/android/gms/tagmanager/dh;
    //         .end local p1    # "x0":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/dh;->a(Lcom/google/android/gms/tagmanager/dh;)I
    //         move-result v0
    //         return v0
    */

    public fun doubleValue(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->pA()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/tagmanager/dh;->arS:J
    //         long-to-double v0, v0
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/tagmanager/dh;->arR:D
    //         goto :goto_0
    */

    public fun equals(other: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         instance-of v0, p1, Lcom/google/android/gms/tagmanager/dh;
    //         if-eqz v0, :cond_0
    //         check-cast p1, Lcom/google/android/gms/tagmanager/dh;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/dh;->a(Lcom/google/android/gms/tagmanager/dh;)I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun floatValue(): Float { return TODO("body: ()F") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->doubleValue()D
    //         move-result-wide v0
    //         double-to-float v0, v0
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/lang/Long;
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->longValue()J
    //         move-result-wide v2
    //         invoke-direct {v0, v2, v3}, Ljava/lang/Long;-><init>(J)V
    //         invoke-virtual {v0}, Ljava/lang/Long;->hashCode()I
    //         move-result v0
    //         return v0
    */

    public fun intValue(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->pC()I
    //         move-result v0
    //         return v0
    */

    public fun longValue(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->pB()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun pA(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/dh;->arT:Z
    //         return v0
    */

    public fun pB(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->pA()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/tagmanager/dh;->arS:J
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/tagmanager/dh;->arR:D
    //         double-to-long v0, v0
    //         goto :goto_0
    */

    public fun pC(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->longValue()J
    //         move-result-wide v0
    //         long-to-int v0, v0
    //         return v0
    */

    public fun pD(): Short { return TODO("body: ()S") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->longValue()J
    //         move-result-wide v0
    //         long-to-int v0, v0
    //         int-to-short v0, v0
    //         return v0
    */

    public fun pz(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->pA()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun shortValue(): Short { return TODO("body: ()S") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->pD()S
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/dh;->pA()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/tagmanager/dh;->arS:J
    //         invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/tagmanager/dh;->arR:D
    //         invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    companion object {
    public @JvmStatic fun a(p0: Double): com.google.android.gms.tagmanager.dh { return TODO("body: (Ljava/lang/Double;)Lcom/google/android/gms/tagmanager/dh;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/tagmanager/dh;
    //         invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D
    //         move-result-wide v2
    //         invoke-direct {v0, v2, v3}, Lcom/google/android/gms/tagmanager/dh;-><init>(D)V
    //         return-object v0
    */

    public @JvmStatic fun cW(p0: String): com.google.android.gms.tagmanager.dh { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/tagmanager/dh;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/NumberFormatException;
    //             }
    //         .end annotation
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/tagmanager/dh;
    //         invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    //         move-result-wide v2
    //         invoke-direct {v0, v2, v3}, Lcom/google/android/gms/tagmanager/dh;-><init>(J)V
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         :try_start_1
    //         new-instance v0, Lcom/google/android/gms/tagmanager/dh;
    //         invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    //         move-result-wide v2
    //         invoke-direct {v0, v2, v3}, Lcom/google/android/gms/tagmanager/dh;-><init>(D)V
    //         :try_end_1
    //         .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         new-instance v0, Ljava/lang/NumberFormatException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " is not a valid TypedNumber"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public @JvmStatic fun z(p0: Long): com.google.android.gms.tagmanager.dh { return TODO("body: (J)Lcom/google/android/gms/tagmanager/dh;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/tagmanager/dh;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/tagmanager/dh;-><init>(J)V
    //         return-object v0
    */

    }
}
