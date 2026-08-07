package com.google.android.gms.drive.query.internal

// Auto-emitted from smali.
// 3 fields, 6 methods.

open class NotFilter: com.google.android.gms.drive.query.internal.AbstractFilter() {
    val BR: Int
    val QY: com.google.android.gms.drive.query.internal.FilterHolder

    constructor(versionCode: Int, toNegate: com.google.android.gms.drive.query.internal.FilterHolder)

    public constructor(toNegate: com.google.android.gms.drive.query.Filter)

    public fun a(p0: com.google.android.gms.drive.query.internal.f): Object { return TODO("body: (Lcom/google/android/gms/drive/query/internal/f;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/query/internal/f",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/NotFilter;->QY:Lcom/google/android/gms/drive/query/internal/FilterHolder;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/query/internal/FilterHolder;->getFilter()Lcom/google/android/gms/drive/query/Filter;
    //         move-result-object v0
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/drive/query/Filter;->a(Lcom/google/android/gms/drive/query/internal/f;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/drive/query/internal/f;->j(Ljava/lang/Object;)Ljava/lang/Object;
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
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/k;->a(Lcom/google/android/gms/drive/query/internal/NotFilter;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
