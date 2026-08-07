package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 4 fields, 9 methods.

open class q: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val UA: com.google.android.gms.fitness.data.k
    private val mPendingIntent: android.app.PendingIntent

    constructor(p0: Int, p1: android.os.IBinder, p2: android.app.PendingIntent)

    public constructor(p0: com.google.android.gms.fitness.data.k, p1: android.app.PendingIntent)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/q;->BR:I
    //         return v0
    */

    public fun jr(): android.app.PendingIntent { return TODO("body: ()Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/q;->mPendingIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

    fun jw(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/q;->UA:Lcom/google/android/gms/fitness/data/k;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/q;->UA:Lcom/google/android/gms/fitness/data/k;
    //         invoke-interface {v0}, Lcom/google/android/gms/fitness/data/k;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "SensorUnregistrationRequest{%s}"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/request/q;->UA:Lcom/google/android/gms/fitness/data/k;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/r;->a(Lcom/google/android/gms/fitness/request/q;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
