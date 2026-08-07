package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 8 fields, 20 methods.

class PolylineOptions: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var ajL: Float
    private var ajM: Boolean
    private var ajQ: Float
    private val akl: java.util.List
    private var akn: Boolean
    private var mColor: Int

    public constructor()

    constructor(versionCode: Int, points: java.util.List, width: Float, color: Int, zIndex: Float, visible: Boolean, geodesic: Boolean)

    public fun add(point: com.google.android.gms.maps.model.LatLng): com.google.android.gms.maps.model.PolylineOptions { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->akl:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun add(points: Array<com.google.android.gms.maps.model.LatLng>): com.google.android.gms.maps.model.PolylineOptions { return TODO("body: ([Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->akl:Ljava/util/List;
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    //         return-object p0
    */

    public fun addAll(p0: Iterable): com.google.android.gms.maps.model.PolylineOptions { return TODO("body: (Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolylineOptions;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Iterable",
    //                 "<",
    //                 "Lcom/google/android/gms/maps/model/LatLng;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/maps/model/PolylineOptions;"
    //             }
    //         .end annotation
    //         .local p1, "points":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Lcom/google/android/gms/maps/model/LatLng;>;"
    //         invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/maps/model/LatLng;
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->akl:Ljava/util/List;
    //         invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object p0
    */

    public fun color(color: Int): com.google.android.gms.maps.model.PolylineOptions { return TODO("body: (I)Lcom/google/android/gms/maps/model/PolylineOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->mColor:I
    //         return-object p0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun geodesic(geodesic: Boolean): com.google.android.gms.maps.model.PolylineOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/model/PolylineOptions;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->akn:Z
    //         return-object p0
    */

    public fun getColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->mColor:I
    //         return v0
    */

    public fun getPoints(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/maps/model/LatLng;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->akl:Ljava/util/List;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->BR:I
    //         return v0
    */

    public fun getWidth(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->ajQ:F
    //         return v0
    */

    public fun getZIndex(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->ajL:F
    //         return v0
    */

    public fun isGeodesic(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->akn:Z
    //         return v0
    */

    public fun isVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->ajM:Z
    //         return v0
    */

    public fun visible(visible: Boolean): com.google.android.gms.maps.model.PolylineOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/model/PolylineOptions;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->ajM:Z
    //         return-object p0
    */

    public fun width(width: Float): com.google.android.gms.maps.model.PolylineOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/PolylineOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->ajQ:F
    //         return-object p0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/maps/internal/v;->mM()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/p;->a(Lcom/google/android/gms/maps/model/PolylineOptions;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/o;->a(Lcom/google/android/gms/maps/model/PolylineOptions;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    public fun zIndex(zIndex: Float): com.google.android.gms.maps.model.PolylineOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/PolylineOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/PolylineOptions;->ajL:F
    //         return-object p0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.o = null!!
    }
}
