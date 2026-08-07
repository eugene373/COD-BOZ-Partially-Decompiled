package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 11 methods.

class mh: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val aeh: Int
    private val afp: Int
    private val afq: com.google.android.gms.internal.mj

    constructor(p0: Int, p1: Int, p2: Int, p3: com.google.android.gms.internal.mj)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/mh;->CREATOR:Lcom/google/android/gms/internal/mi;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(object: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         .end local p1    # "object":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "object":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/internal/mh;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/internal/mh;
    //         .end local p1    # "object":Ljava/lang/Object;
    //         iget v2, p0, Lcom/google/android/gms/internal/mh;->aeh:I
    //         iget v3, p1, Lcom/google/android/gms/internal/mh;->aeh:I
    //         if-ne v2, v3, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/internal/mh;->afp:I
    //         iget v3, p1, Lcom/google/android/gms/internal/mh;->afp:I
    //         if-ne v2, v3, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mh;->afq:Lcom/google/android/gms/internal/mj;
    //         iget-object v3, p1, Lcom/google/android/gms/internal/mh;->afq:Lcom/google/android/gms/internal/mj;
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/mj;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/mh;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/internal/mh;->aeh:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/internal/mh;->afp:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun mc(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/mh;->aeh:I
    //         return v0
    */

    public fun mg(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/mh;->afp:I
    //         return v0
    */

    public fun mh(): com.google.android.gms.internal.mj { return TODO("body: ()Lcom/google/android/gms/internal/mj;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/mh;->afq:Lcom/google/android/gms/internal/mj;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "transitionTypes"
    //         iget v2, p0, Lcom/google/android/gms/internal/mh;->aeh:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "loiteringTimeMillis"
    //         iget v2, p0, Lcom/google/android/gms/internal/mh;->afp:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "placeFilter"
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mh;->afq:Lcom/google/android/gms/internal/mj;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/mh;->CREATOR:Lcom/google/android/gms/internal/mi;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/mi;->a(Lcom/google/android/gms/internal/mh;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.mi = null!!
    }
}
