package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 35 fields, 14 methods.

class Field: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Th: Int
    private val mName: String

    constructor(versionCode: Int, name: String, format: Int)

    public constructor(name: String, format: Int)

    private fun a(p0: com.google.android.gms.fitness.data.Field): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/Field;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Field;->mName:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Field;->mName:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Field;->Th:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/Field;->Th:I
    //         if-ne v0, v1, :cond_0
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
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/Field;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/Field;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Field;->a(Lcom/google/android/gms/fitness/data/Field;)Z
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

    public fun getFormat(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Field;->Th:I
    //         return v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Field;->mName:Ljava/lang/String;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Field;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Field;->mName:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         const/4 v4, 0x1
    //         const-string v1, "%s(%s)"
    //         const/4 v0, 0x2
    //         new-array v2, v0, [Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/Field;->mName:Ljava/lang/String;
    //         aput-object v3, v2, v0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Field;->Th:I
    //         if-ne v0, v4, :cond_0
    //         const-string v0, "i"
    //         :goto_0
    //         aput-object v0, v2, v4
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "f"
    //         goto :goto_0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/j;->a(Lcom/google/android/gms/fitness/data/Field;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val FIELD_ACCURACY: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_ACTIVITY: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_ALTITUDE: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_AVERAGE: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_BPM: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_CALORIES: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_CONFIDENCE: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_DISTANCE: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_DURATION: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_HEIGHT: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_HIGH_LATITUDE: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_HIGH_LONGITUDE: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_LATITUDE: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_LONGITUDE: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_LOW_LATITUDE: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_LOW_LONGITUDE: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_MAX: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_MIN: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_NUM_SEGMENTS: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_REVOLUTIONS: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_RPM: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_SPEED: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_STEPS: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_WATTS: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FIELD_WEIGHT: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val FORMAT_FLOAT: Int = 0x2
    @JvmField public val FORMAT_INT32: Int = 0x1
    @JvmField public val Td: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val Te: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val Tf: com.google.android.gms.fitness.data.Field = null!!
    @JvmField public val Tg: com.google.android.gms.fitness.data.Field = null!!

    private @JvmStatic fun br(p0: String): com.google.android.gms.fitness.data.Field { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Field;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/fitness/data/Field;
    //         const/4 v1, 0x1
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/data/Field;-><init>(Ljava/lang/String;I)V
    //         return-object v0
    */

    private @JvmStatic fun bs(p0: String): com.google.android.gms.fitness.data.Field { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Field;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/fitness/data/Field;
    //         const/4 v1, 0x2
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/data/Field;-><init>(Ljava/lang/String;I)V
    //         return-object v0
    */

    }
}
