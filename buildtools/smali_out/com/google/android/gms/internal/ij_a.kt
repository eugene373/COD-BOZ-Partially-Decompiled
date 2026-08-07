package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 7 methods.

class ij_a: com.google.android.gms.cast.Cast.ApplicationConnectionResult {
    private val CM: com.google.android.gms.common.api.Status
    private val GN: com.google.android.gms.cast.ApplicationMetadata
    private val GO: String
    private val GP: Boolean
    private val vL: String

    public constructor(p0: com.google.android.gms.common.api.Status)

    public constructor(p0: com.google.android.gms.common.api.Status, p1: com.google.android.gms.cast.ApplicationMetadata, p2: String, p3: String, p4: Boolean)

    public fun getApplicationMetadata(): com.google.android.gms.cast.ApplicationMetadata { return TODO("body: ()Lcom/google/android/gms/cast/ApplicationMetadata;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$a;->GN:Lcom/google/android/gms/cast/ApplicationMetadata;
    //         return-object v0
    */

    public fun getApplicationStatus(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$a;->GO:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSessionId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$a;->vL:Ljava/lang/String;
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ij$a;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun getWasLaunched(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/ij$a;->GP:Z
    //         return v0
    */

}
