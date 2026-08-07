package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 4 fields, 10 methods.

open class af: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val US: com.google.android.gms.fitness.data.Subscription
    private val UT: Boolean

    constructor(p0: Int, p1: com.google.android.gms.fitness.data.Subscription, p2: Boolean)

    private constructor(p0: com.google.android.gms.fitness.request.af.a)

    constructor(p0: com.google.android.gms.fitness.request.af.a, p1: com.google.android.gms.fitness.request.af.1)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/af;->BR:I
    //         return v0
    */

    public fun jD(): com.google.android.gms.fitness.data.Subscription { return TODO("body: ()Lcom/google/android/gms/fitness/data/Subscription;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/af;->US:Lcom/google/android/gms/fitness/data/Subscription;
    //         return-object v0
    */

    public fun jE(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/af;->UT:Z
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "subscription"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/af;->US:Lcom/google/android/gms/fitness/data/Subscription;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/ag;->a(Lcom/google/android/gms/fitness/request/af;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
