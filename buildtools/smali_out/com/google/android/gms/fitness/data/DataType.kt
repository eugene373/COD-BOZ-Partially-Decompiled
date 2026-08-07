package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 38 fields, 16 methods.

class DataType: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val SY: java.util.List
    private val mName: String

    constructor(versionCode: Int, name: String, p2: java.util.List)

    public constructor(name: String, fields: Array<com.google.android.gms.fitness.data.Field>)

    private fun a(p0: com.google.android.gms.fitness.data.DataType): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataType;->mName:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataType;->mName:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataType;->SY:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataType;->SY:Ljava/util/List;
    //         invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(that: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/DataType;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/DataType;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/DataType;->a(Lcom/google/android/gms/fitness/data/DataType;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getFields(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/Field;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataType;->SY:Ljava/util/List;
    //         return-object v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataType;->mName:Ljava/lang/String;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/DataType;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataType;->mName:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         return v0
    */

    public fun iQ(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataType;->mName:Ljava/lang/String;
    //         const-string v1, "com.google."
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataType;->mName:Ljava/lang/String;
    //         const/16 v1, 0xb
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataType;->mName:Ljava/lang/String;
    //         goto :goto_0
    */

    public fun indexOf(field: com.google.android.gms.fitness.data.Field): Int { return TODO("body: (Lcom/google/android/gms/fitness/data/Field;)I") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataType;->SY:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataType;->SY:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "%s not a field of %s"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         aput-object p1, v2, v3
    //         const/4 v3, 0x1
    //         aput-object p0, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "DataType{%s%s}"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/DataType;->mName:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/DataType;->SY:Ljava/util/List;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/h;->a(Lcom/google/android/gms/fitness/data/DataType;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val AGGREGATE_ACTIVITY_SUMMARY: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val AGGREGATE_DISTANCE_DELTA: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val AGGREGATE_HEART_RATE_SUMMARY: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val AGGREGATE_INPUT_TYPES: java.util.Set = null!!
    @JvmField public val AGGREGATE_LOCATION_BOUNDING_BOX: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val AGGREGATE_POWER_SUMMARY: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val AGGREGATE_SPEED_SUMMARY: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val AGGREGATE_STEP_COUNT_DELTA: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val AGGREGATE_WEIGHT_SUMMARY: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val MIME_TYPE_PREFIX: String = "vnd.google.fitness.data_type/"
    @JvmField public val ST: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val SU: com.google.android.gms.fitness.data.DataType = null!!
    private val SV: java.util.Map = null!!
    @JvmField public val SW: Array<com.google.android.gms.fitness.data.DataType> = null!!
    @JvmField public val SX: Array<String> = null!!
    @JvmField public val TYPE_ACTIVITY_SAMPLE: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_ACTIVITY_SEGMENT: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_CALORIES_CONSUMED: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_CALORIES_EXPENDED: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_CYCLING_PEDALING_CADENCE: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_CYCLING_PEDALING_CUMULATIVE: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_CYCLING_WHEEL_REVOLUTION: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_CYCLING_WHEEL_RPM: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_DISTANCE_CUMULATIVE: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_DISTANCE_DELTA: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_HEART_RATE_BPM: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_HEIGHT: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_LOCATION_SAMPLE: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_POWER_SAMPLE: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_SPEED: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_STEP_COUNT_CADENCE: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_STEP_COUNT_CUMULATIVE: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_STEP_COUNT_DELTA: com.google.android.gms.fitness.data.DataType = null!!
    @JvmField public val TYPE_WEIGHT: com.google.android.gms.fitness.data.DataType = null!!

    public @JvmStatic fun getAggregatesForInput(inputDataType: com.google.android.gms.fitness.data.DataType): java.util.List { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/fitness/data/DataType;->SV:Ljava/util/Map;
    //         invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/List;
    //         if-nez v0, :cond_0
    //         invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun getMimeType(dataType: com.google.android.gms.fitness.data.DataType): String { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "vnd.google.fitness.data_type/"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/DataType;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
