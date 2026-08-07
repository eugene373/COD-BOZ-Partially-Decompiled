package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 8 methods.

open class ls: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    public val packageName: String
    public val uid: Int

    constructor(p0: Int, p1: Int, p2: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         instance-of v1, p1, Lcom/google/android/gms/internal/ls;
    //         if-nez v1, :cond_1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/internal/ls;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget v1, p1, Lcom/google/android/gms/internal/ls;->uid:I
    //         iget v2, p0, Lcom/google/android/gms/internal/ls;->uid:I
    //         if-ne v1, v2, :cond_0
    //         iget-object v1, p1, Lcom/google/android/gms/internal/ls;->packageName:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ls;->packageName:Ljava/lang/String;
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/ls;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/ls;->uid:I
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "%d:%s"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget v3, p0, Lcom/google/android/gms/internal/ls;->uid:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ls;->packageName:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/lt;->a(Lcom/google/android/gms/internal/ls;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.lt = null!!
    }
}
