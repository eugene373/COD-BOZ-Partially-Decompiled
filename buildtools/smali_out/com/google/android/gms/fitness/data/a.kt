package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 6 fields, 14 methods.

class a: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val BZ: String
    private val Sx: String
    private val Sy: String

    constructor(p0: Int, p1: String, p2: String, p3: String)

    public constructor(p0: String, p1: String, p2: String)

    private fun a(p0: com.google.android.gms.fitness.data.a): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/a;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/a;->BZ:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/a;->BZ:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/a;->Sx:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/a;->Sx:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/a;->Sy:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/a;->Sy:Ljava/lang/String;
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
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/a;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/a;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/a;->a(Lcom/google/android/gms/fitness/data/a;)Z
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

    public fun getPackageName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/a;->BZ:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/a;->Sx:Ljava/lang/String;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/a;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/a;->BZ:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/a;->Sx:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/a;->Sy:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    fun iA(): com.google.android.gms.fitness.data.a { return TODO("body: ()Lcom/google/android/gms/fitness/data/a;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/fitness/data/a;
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/a;->BZ:Ljava/lang/String;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/kw;->bt(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/a;->Sx:Ljava/lang/String;
    //         invoke-static {v2}, Lcom/google/android/gms/internal/kw;->bt(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/a;->Sy:Ljava/lang/String;
    //         invoke-static {v3}, Lcom/google/android/gms/internal/kw;->bt(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/fitness/data/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    public fun iz(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/a;->Sy:Ljava/lang/String;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "Application{%s:%s:%s}"
    //         const/4 v1, 0x3
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/a;->BZ:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/a;->Sx:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/a;->Sy:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/b;->a(Lcom/google/android/gms/fitness/data/a;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val Sw: com.google.android.gms.fitness.data.a = null!!
    }
}
