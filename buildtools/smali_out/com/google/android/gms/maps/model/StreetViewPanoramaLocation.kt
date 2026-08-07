package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 5 fields, 9 methods.

open class StreetViewPanoramaLocation: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    public val links: Array<com.google.android.gms.maps.model.StreetViewPanoramaLink>
    public val panoId: String
    public val position: com.google.android.gms.maps.model.LatLng

    constructor(versionCode: Int, links: Array<com.google.android.gms.maps.model.StreetViewPanoramaLink>, position: com.google.android.gms.maps.model.LatLng, panoId: String)

    public constructor(links: Array<com.google.android.gms.maps.model.StreetViewPanoramaLink>, position: com.google.android.gms.maps.model.LatLng, panoId: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;->panoId:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;->panoId:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;->position:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-object v3, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;->position:Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;->position:Lcom/google/android/gms/maps/model/LatLng;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;->panoId:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "panoId"
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;->panoId:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "position"
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;->position:Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-virtual {v2}, Lcom/google/android/gms/maps/model/LatLng;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/s;->a(Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.s = null!!
    }
}
