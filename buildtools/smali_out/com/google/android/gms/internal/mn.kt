package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 10 methods.

class mn: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    private val aes: Long
    private val afB: com.google.android.gms.internal.mj
    private val mPriority: Int

    public constructor(p0: Int, p1: com.google.android.gms.internal.mj, p2: Long, p3: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/mn;->CREATOR:Lcom/google/android/gms/internal/mo;
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
    //         instance-of v2, p1, Lcom/google/android/gms/internal/mn;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/internal/mn;
    //         .end local p1    # "object":Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mn;->afB:Lcom/google/android/gms/internal/mj;
    //         iget-object v3, p1, Lcom/google/android/gms/internal/mn;->afB:Lcom/google/android/gms/internal/mj;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/mn;->aes:J
    //         iget-wide v4, p1, Lcom/google/android/gms/internal/mn;->aes:J
    //         cmp-long v2, v2, v4
    //         if-nez v2, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/internal/mn;->mPriority:I
    //         iget v3, p1, Lcom/google/android/gms/internal/mn;->mPriority:I
    //         if-eq v2, v3, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getInterval(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/mn;->aes:J
    //         return-wide v0
    */

    public fun getPriority(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/mn;->mPriority:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mn;->afB:Lcom/google/android/gms/internal/mj;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/mn;->aes:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/internal/mn;->mPriority:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun mh(): com.google.android.gms.internal.mj { return TODO("body: ()Lcom/google/android/gms/internal/mj;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/mn;->afB:Lcom/google/android/gms/internal/mj;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "filter"
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mn;->afB:Lcom/google/android/gms/internal/mj;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "interval"
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/mn;->aes:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "priority"
    //         iget v2, p0, Lcom/google/android/gms/internal/mn;->mPriority:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/mn;->CREATOR:Lcom/google/android/gms/internal/mo;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/mo;->a(Lcom/google/android/gms/internal/mn;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.mo = null!!
    val afA: Long = 0L
    }
}
