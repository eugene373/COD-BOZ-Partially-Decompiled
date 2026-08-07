package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 4 fields, 9 methods.

class LatLng: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    public val latitude: Double
    public val longitude: Double

    public constructor(latitude: Double, longitude: Double)

    constructor(versionCode: Int, latitude: Double, longitude: Double)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/maps/model/LatLng;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/maps/model/LatLng;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-wide v2, p0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J
    //         move-result-wide v2
    //         iget-wide v4, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J
    //         move-result-wide v4
    //         cmp-long v2, v2, v4
    //         if-nez v2, :cond_3
    //         iget-wide v2, p0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J
    //         move-result-wide v2
    //         iget-wide v4, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J
    //         move-result-wide v4
    //         cmp-long v2, v2, v4
    //         if-eqz v2, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/LatLng;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 6
    //         const/16 v4, 0x20
    //         iget-wide v0, p0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J
    //         move-result-wide v0
    //         ushr-long v2, v0, v4
    //         xor-long/2addr v0, v2
    //         long-to-int v0, v0
    //         add-int/lit8 v0, v0, 0x1f
    //         iget-wide v2, p0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J
    //         move-result-wide v2
    //         mul-int/lit8 v0, v0, 0x1f
    //         ushr-long v4, v2, v4
    //         xor-long/2addr v2, v4
    //         long-to-int v1, v2
    //         add-int/2addr v0, v1
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "lat/lng: ("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-wide v2, p0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ","
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-wide v2, p0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/maps/internal/v;->mM()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/j;->a(Lcom/google/android/gms/maps/model/LatLng;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/i;->a(Lcom/google/android/gms/maps/model/LatLng;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.i = null!!
    }
}
