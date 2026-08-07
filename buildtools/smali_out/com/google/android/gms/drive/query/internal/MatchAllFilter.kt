package com.google.android.gms.drive.query.internal

// Auto-emitted from smali.
// 2 fields, 6 methods.

open class MatchAllFilter: com.google.android.gms.drive.query.internal.AbstractFilter() {
    val BR: Int

    public constructor()

    constructor(versionCode: Int)

    public fun a(p0: com.google.android.gms.drive.query.internal.f): Object { return TODO("body: (Lcom/google/android/gms/drive/query/internal/f;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<F:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/query/internal/f",
    //                 "<TF;>;)TF;"
    //             }
    //         .end annotation
    //         invoke-interface {p1}, Lcom/google/android/gms/drive/query/internal/f;->is()Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/j;->a(Lcom/google/android/gms/drive/query/internal/MatchAllFilter;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.drive.query.internal.j = null!!
    }
}
