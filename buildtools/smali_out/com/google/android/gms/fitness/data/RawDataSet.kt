package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 6 fields, 9 methods.

class RawDataSet: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val SF: Boolean
    val Tm: Int
    val To: Int
    val Tp: java.util.List

    constructor(versionCode: Int, dataSourceIndex: Int, dataTypeIndex: Int, serverHasMoreData: java.util.List, p4: Boolean)

    public constructor(dataSet: com.google.android.gms.fitness.data.DataSet, p1: java.util.List, p2: java.util.List)

    private fun a(p0: com.google.android.gms.fitness.data.RawDataSet): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/RawDataSet;)Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->Tm:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/RawDataSet;->Tm:I
    //         if-ne v0, v1, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->To:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/RawDataSet;->To:I
    //         if-ne v0, v1, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->SF:Z
    //         iget-boolean v1, p1, Lcom/google/android/gms/fitness/data/RawDataSet;->SF:Z
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->Tp:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/RawDataSet;->Tp:Ljava/util/List;
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

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/RawDataSet;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/RawDataSet;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/RawDataSet;->a(Lcom/google/android/gms/fitness/data/RawDataSet;)Z
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

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->Tm:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->To:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "RawDataSet{%s@[%s, %s]}"
    //         const/4 v1, 0x3
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget v3, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->Tm:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget v3, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->To:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->Tp:Ljava/util/List;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/o;->a(Lcom/google/android/gms/fitness/data/RawDataSet;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
