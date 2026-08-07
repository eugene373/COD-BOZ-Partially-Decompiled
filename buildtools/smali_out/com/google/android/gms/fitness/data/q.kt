package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 4 fields, 10 methods.

open class q: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    private val St: com.google.android.gms.fitness.data.Session
    private val Ts: com.google.android.gms.fitness.data.DataSet

    constructor(p0: Int, p1: com.google.android.gms.fitness.data.Session, p2: com.google.android.gms.fitness.data.DataSet)

    private fun a(p0: com.google.android.gms.fitness.data.q): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/q;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/q;->St:Lcom/google/android/gms/fitness/data/Session;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/q;->St:Lcom/google/android/gms/fitness/data/Session;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/q;->Ts:Lcom/google/android/gms/fitness/data/DataSet;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/q;->Ts:Lcom/google/android/gms/fitness/data/DataSet;
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
    //         if-eq p1, p0, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/q;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/q;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/q;->a(Lcom/google/android/gms/fitness/data/q;)Z
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

    public fun getSession(): com.google.android.gms.fitness.data.Session { return TODO("body: ()Lcom/google/android/gms/fitness/data/Session;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/q;->St:Lcom/google/android/gms/fitness/data/Session;
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/q;->St:Lcom/google/android/gms/fitness/data/Session;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/q;->Ts:Lcom/google/android/gms/fitness/data/DataSet;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun iW(): com.google.android.gms.fitness.data.DataSet { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataSet;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/q;->Ts:Lcom/google/android/gms/fitness/data/DataSet;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "session"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/q;->St:Lcom/google/android/gms/fitness/data/Session;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataSet"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/q;->Ts:Lcom/google/android/gms/fitness/data/DataSet;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/r;->a(Lcom/google/android/gms/fitness/data/q;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
