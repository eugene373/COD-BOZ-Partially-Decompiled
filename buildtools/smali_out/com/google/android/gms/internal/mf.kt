package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 6 methods.

open class mf: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    private val afn: Boolean
    private val afo: java.util.List

    constructor(p0: Int, p1: Boolean, p2: java.util.List)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/mf;->CREATOR:Lcom/google/android/gms/internal/mg;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun me(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/mf;->afn:Z
    //         return v0
    */

    public fun mf(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/mp;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/mf;->afo:Ljava/util/List;
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/mf;->CREATOR:Lcom/google/android/gms/internal/mg;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/mg;->a(Lcom/google/android/gms/internal/mf;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.mg = null!!
    }
}
