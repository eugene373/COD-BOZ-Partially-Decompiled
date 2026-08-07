package com.google.android.gms.fitness.result

// Auto-emitted from smali.
// 4 fields, 13 methods.

open class DataTypeResult: com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val CM: com.google.android.gms.common.api.Status
    private val Sp: com.google.android.gms.fitness.data.DataType

    constructor(versionCode: Int, status: com.google.android.gms.common.api.Status, dataType: com.google.android.gms.fitness.data.DataType)

    public constructor(status: com.google.android.gms.common.api.Status, dataType: com.google.android.gms.fitness.data.DataType)

    private fun b(p0: com.google.android.gms.fitness.result.DataTypeResult): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/result/DataTypeResult;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataTypeResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/result/DataTypeResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/Status;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataTypeResult;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/result/DataTypeResult;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
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
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/result/DataTypeResult;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/result/DataTypeResult;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/result/DataTypeResult;->b(Lcom/google/android/gms/fitness/result/DataTypeResult;)Z
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

    public fun getDataType(): com.google.android.gms.fitness.data.DataType { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataTypeResult;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataTypeResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/result/DataTypeResult;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/DataTypeResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/DataTypeResult;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "status"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/DataTypeResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataType"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/DataTypeResult;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/result/d;->a(Lcom/google/android/gms/fitness/result/DataTypeResult;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun F(p0: com.google.android.gms.common.api.Status): com.google.android.gms.fitness.result.DataTypeResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DataTypeResult;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         new-instance v1, Lcom/google/android/gms/fitness/result/DataTypeResult;
    //         invoke-direct {v1, p0, v0}, Lcom/google/android/gms/fitness/result/DataTypeResult;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/fitness/data/DataType;)V
    //         return-object v1
    */

    }
}
