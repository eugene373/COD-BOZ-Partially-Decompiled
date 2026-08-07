package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 5 fields, 11 methods.

open class DataSourcesRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val SB: java.util.List
    private val Uw: java.util.List
    private val Ux: Boolean

    constructor(versionCode: Int, includeDbOnlySources: java.util.List, p2: java.util.List, p3: Boolean)

    private constructor(builder: com.google.android.gms.fitness.request.DataSourcesRequest.Builder)

    constructor(x0: com.google.android.gms.fitness.request.DataSourcesRequest.Builder, x1: com.google.android.gms.fitness.request.DataSourcesRequest.1)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getDataTypes(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataType;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->SB:Ljava/util/List;
    //         invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->BR:I
    //         return v0
    */

    public fun jo(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->Ux:Z
    //         return v0
    */

    fun jp(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/Integer;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->Uw:Ljava/util/List;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataTypes"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->SB:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "sourceTypes"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->Uw:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         iget-boolean v1, p0, Lcom/google/android/gms/fitness/request/DataSourcesRequest;->Ux:Z
    //         if-eqz v1, :cond_0
    //         const-string v1, "includeDbOnlySources"
    //         const-string v2, "true"
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/h;->a(Lcom/google/android/gms/fitness/request/DataSourcesRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
