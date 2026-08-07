package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 7 methods.

class cw: com.google.android.gms.ads.mediation.MediationAdRequest {
    private val d: java.util.Date
    private val f: java.util.Set
    private val g: Boolean
    private val h: android.location.Location
    private val om: Int
    private val qD: Int

    public constructor(p0: java.util.Date, p1: Int, p2: java.util.Set, p3: android.location.Location, p4: Boolean, p5: Int)

    public fun getBirthday(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cw;->d:Ljava/util/Date;
    //         return-object v0
    */

    public fun getGender(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/cw;->om:I
    //         return v0
    */

    public fun getKeywords(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cw;->f:Ljava/util/Set;
    //         return-object v0
    */

    public fun getLocation(): android.location.Location { return TODO("body: ()Landroid/location/Location;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/cw;->h:Landroid/location/Location;
    //         return-object v0
    */

    public fun isTesting(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/cw;->g:Z
    //         return v0
    */

    public fun taggedForChildDirectedTreatment(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/cw;->qD:I
    //         return v0
    */

}
