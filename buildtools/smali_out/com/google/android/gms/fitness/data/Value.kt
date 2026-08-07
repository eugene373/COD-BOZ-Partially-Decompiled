package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 5 fields, 17 methods.

class Value: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Th: Int
    private var Tv: Boolean
    private var Tw: Float

    constructor(format: Int)

    constructor(versionCode: Int, format: Int, isSet: Boolean, value: Float)

    private fun a(p0: com.google.android.gms.fitness.data.Value): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/Value;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Value;->Th:I
    //         iget v3, p1, Lcom/google/android/gms/fitness/data/Value;->Th:I
    //         if-ne v2, v3, :cond_2
    //         iget-boolean v2, p0, Lcom/google/android/gms/fitness/data/Value;->Tv:Z
    //         iget-boolean v3, p1, Lcom/google/android/gms/fitness/data/Value;->Tv:Z
    //         if-ne v2, v3, :cond_2
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Value;->Th:I
    //         packed-switch v2, :pswitch_data_0
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Value;->Tw:F
    //         iget v3, p1, Lcom/google/android/gms/fitness/data/Value;->Tw:F
    //         cmpl-float v2, v2, v3
    //         if-nez v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/Value;->asInt()I
    //         move-result v2
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/Value;->asInt()I
    //         move-result v3
    //         if-eq v2, v3, :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/Value;->asFloat()F
    //         move-result v2
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/Value;->asFloat()F
    //         move-result v3
    //         cmpl-float v2, v2, v3
    //         if-eqz v2, :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_1
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    public fun asFloat(): Float { return TODO("body: ()F") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Value;->Th:I
    //         const/4 v1, 0x2
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Value is not in float format"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Value;->Tw:F
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun asInt(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget v1, p0, Lcom/google/android/gms/fitness/data/Value;->Th:I
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         const-string v1, "Value is not in int format"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Value;->Tw:F
    //         invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I
    //         move-result v0
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

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/Value;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/Value;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Value;->a(Lcom/google/android/gms/fitness/data/Value;)Z
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
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Value;->Th:I
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Value;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Value;->Tw:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Value;->Th:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-boolean v2, p0, Lcom/google/android/gms/fitness/data/Value;->Tv:Z
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isSet(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/data/Value;->Tv:Z
    //         return v0
    */

    fun ja(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Value;->Tw:F
    //         return v0
    */

    public fun setFloat(value: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Value;->Th:I
    //         const/4 v2, 0x2
    //         if-ne v0, v2, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v2, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format."
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iput-boolean v1, p0, Lcom/google/android/gms/fitness/data/Value;->Tv:Z
    //         iput p1, p0, Lcom/google/android/gms/fitness/data/Value;->Tw:F
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setInt(value: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Value;->Th:I
    //         if-ne v0, v1, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v2, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format."
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iput-boolean v1, p0, Lcom/google/android/gms/fitness/data/Value;->Tv:Z
    //         invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/fitness/data/Value;->Tw:F
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/data/Value;->Tv:Z
    //         if-nez v0, :cond_0
    //         const-string v0, "unset"
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Value;->Th:I
    //         packed-switch v0, :pswitch_data_0
    //         const-string v0, "unknown"
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/Value;->asInt()I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/Value;->asFloat()F
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/u;->a(Lcom/google/android/gms/fitness/data/Value;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
