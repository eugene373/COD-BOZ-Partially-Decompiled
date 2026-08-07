package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 10 fields, 25 methods.

class PolygonOptions: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var ajI: Float
    private var ajJ: Int
    private var ajK: Int
    private var ajL: Float
    private var ajM: Boolean
    private val akl: java.util.List
    private val akm: java.util.List
    private var akn: Boolean

    public constructor()

    constructor(versionCode: Int, holes: java.util.List, strokeWidth: java.util.List, strokeColor: Float, fillColor: Int, zIndex: Int, visible: Float, geodesic: Boolean, p8: Boolean)

    public fun add(point: com.google.android.gms.maps.model.LatLng): com.google.android.gms.maps.model.PolygonOptions { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolygonOptions;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->akl:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun add(points: Array<com.google.android.gms.maps.model.LatLng>): com.google.android.gms.maps.model.PolygonOptions { return TODO("body: ([Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolygonOptions;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->akl:Ljava/util/List;
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    //         return-object p0
    */

    public fun addAll(p0: Iterable): com.google.android.gms.maps.model.PolygonOptions { return TODO("body: (Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolygonOptions;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Iterable",
    //                 "<",
    //                 "Lcom/google/android/gms/maps/model/LatLng;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/maps/model/PolygonOptions;"
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
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->akl:Ljava/util/List;
    //         invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object p0
    */

    public fun addHole(p0: Iterable): com.google.android.gms.maps.model.PolygonOptions { return TODO("body: (Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolygonOptions;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Iterable",
    //                 "<",
    //                 "Lcom/google/android/gms/maps/model/LatLng;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/maps/model/PolygonOptions;"
    //             }
    //         .end annotation
    //         .local p1, "points":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Lcom/google/android/gms/maps/model/LatLng;>;"
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->akm:Ljava/util/List;
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun fillColor(color: Int): com.google.android.gms.maps.model.PolygonOptions { return TODO("body: (I)Lcom/google/android/gms/maps/model/PolygonOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->ajK:I
    //         return-object p0
    */

    public fun geodesic(geodesic: Boolean): com.google.android.gms.maps.model.PolygonOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/model/PolygonOptions;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->akn:Z
    //         return-object p0
    */

    public fun getFillColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->ajK:I
    //         return v0
    */

    public fun getHoles(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/maps/model/LatLng;",
    //                 ">;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->akm:Ljava/util/List;
    //         return-object v0
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
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->akl:Ljava/util/List;
    //         return-object v0
    */

    public fun getStrokeColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->ajJ:I
    //         return v0
    */

    public fun getStrokeWidth(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->ajI:F
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->BR:I
    //         return v0
    */

    public fun getZIndex(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->ajL:F
    //         return v0
    */

    public fun isGeodesic(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->akn:Z
    //         return v0
    */

    public fun isVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->ajM:Z
    //         return v0
    */

    fun mQ(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->akm:Ljava/util/List;
    //         return-object v0
    */

    public fun strokeColor(color: Int): com.google.android.gms.maps.model.PolygonOptions { return TODO("body: (I)Lcom/google/android/gms/maps/model/PolygonOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->ajJ:I
    //         return-object p0
    */

    public fun strokeWidth(width: Float): com.google.android.gms.maps.model.PolygonOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/PolygonOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->ajI:F
    //         return-object p0
    */

    public fun visible(visible: Boolean): com.google.android.gms.maps.model.PolygonOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/model/PolygonOptions;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->ajM:Z
    //         return-object p0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/maps/internal/v;->mM()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/n;->a(Lcom/google/android/gms/maps/model/PolygonOptions;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/m;->a(Lcom/google/android/gms/maps/model/PolygonOptions;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    public fun zIndex(zIndex: Float): com.google.android.gms.maps.model.PolygonOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/PolygonOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/PolygonOptions;->ajL:F
    //         return-object p0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.m = null!!
    }
}
