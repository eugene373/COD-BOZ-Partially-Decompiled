package com.google.android.gms.drive.query.internal

// Auto-emitted from smali.
// 5 fields, 7 methods.

open class LogicalFilter: com.google.android.gms.drive.query.internal.AbstractFilter() {
    val BR: Int
    private var QF: java.util.List
    val QK: com.google.android.gms.drive.query.internal.Operator
    val QX: java.util.List

    constructor(versionCode: Int, operator: com.google.android.gms.drive.query.internal.Operator, p2: java.util.List)

    public constructor(operator: com.google.android.gms.drive.query.internal.Operator, filter: com.google.android.gms.drive.query.Filter, additionalFilters: Array<com.google.android.gms.drive.query.Filter>)

    public constructor(operator: com.google.android.gms.drive.query.internal.Operator, p1: Iterable)

    public fun a(p0: com.google.android.gms.drive.query.internal.f): Object { return TODO("body: (Lcom/google/android/gms/drive/query/internal/f;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/query/internal/f",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/LogicalFilter;->QX:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/query/internal/FilterHolder;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/query/internal/FilterHolder;->getFilter()Lcom/google/android/gms/drive/query/Filter;
    //         move-result-object v0
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/drive/query/Filter;->a(Lcom/google/android/gms/drive/query/internal/f;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/LogicalFilter;->QK:Lcom/google/android/gms/drive/query/internal/Operator;
    //         invoke-interface {p1, v0, v1}, Lcom/google/android/gms/drive/query/internal/f;->b(Lcom/google/android/gms/drive/query/internal/Operator;Ljava/util/List;)Ljava/lang/Object;
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
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/i;->a(Lcom/google/android/gms/drive/query/internal/LogicalFilter;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
