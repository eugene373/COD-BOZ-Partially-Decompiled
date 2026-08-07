package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 9 methods.

open class ml: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    private val afz: String
    private val mTag: String

    constructor(p0: Int, p1: String, p2: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/ml;->CREATOR:Lcom/google/android/gms/internal/mm;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(that: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         instance-of v1, p1, Lcom/google/android/gms/internal/ml;
    //         if-nez v1, :cond_1
    //         .end local p1    # "that":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "that":Ljava/lang/Object;
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/internal/ml;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ml;->afz:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/ml;->afz:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ml;->mTag:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/ml;->mTag:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun getTag(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ml;->mTag:Ljava/lang/String;
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ml;->afz:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ml;->mTag:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun mk(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ml;->afz:Ljava/lang/String;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "mPlaceId"
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ml;->afz:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "mTag"
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ml;->mTag:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/ml;->CREATOR:Lcom/google/android/gms/internal/mm;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/mm;->a(Lcom/google/android/gms/internal/ml;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.mm = null!!
    }
}
