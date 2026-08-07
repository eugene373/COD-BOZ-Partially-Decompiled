package com.google.android.gms.location

// Auto-emitted from smali.
// 13 fields, 10 methods.

open class DetectedActivity: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var aef: Int
    var aeg: Int

    public constructor(activityType: Int, confidence: Int)

    public constructor(versionCode: Int, activityType: Int, confidence: Int)

    private fun ea(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         const/16 v0, 0x9
    //         if-le p1, v0, :cond_0
    //         const/4 p1, 0x4
    //         :cond_0
    //         return p1
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getConfidence(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/location/DetectedActivity;->aeg:I
    //         return v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/location/DetectedActivity;->aef:I
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/location/DetectedActivity;->ea(I)I
    //         move-result v0
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/location/DetectedActivity;->BR:I
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "DetectedActivity [type="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/location/DetectedActivity;->getType()I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", confidence="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/google/android/gms/location/DetectedActivity;->aeg:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "]"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/DetectedActivityCreator;->a(Lcom/google/android/gms/location/DetectedActivity;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.location.DetectedActivityCreator = null!!
    @JvmField public val IN_VEHICLE: Int = 0x0
    @JvmField public val ON_BICYCLE: Int = 0x1
    @JvmField public val ON_FOOT: Int = 0x2
    @JvmField public val RUNNING: Int = 0x8
    @JvmField public val STILL: Int = 0x3
    @JvmField public val TILTING: Int = 0x5
    @JvmField public val UNKNOWN: Int = 0x4
    @JvmField public val WALKING: Int = 0x7
    @JvmField public val aee: java.util.Comparator = null!!
    }
}
