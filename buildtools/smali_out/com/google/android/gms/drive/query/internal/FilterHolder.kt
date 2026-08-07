package com.google.android.gms.drive.query.internal

// Auto-emitted from smali.
// 10 fields, 7 methods.

open class FilterHolder: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val QO: com.google.android.gms.drive.query.internal.ComparisonFilter
    val QP: com.google.android.gms.drive.query.internal.FieldOnlyFilter
    val QQ: com.google.android.gms.drive.query.internal.LogicalFilter
    val QR: com.google.android.gms.drive.query.internal.NotFilter
    val QS: com.google.android.gms.drive.query.internal.InFilter
    val QT: com.google.android.gms.drive.query.internal.MatchAllFilter
    val QU: com.google.android.gms.drive.query.internal.HasFilter
    private val QV: com.google.android.gms.drive.query.Filter

    constructor(versionCode: Int, fieldOnlyFilter: com.google.android.gms.drive.query.internal.ComparisonFilter, logicalFilter: com.google.android.gms.drive.query.internal.FieldOnlyFilter, notFilter: com.google.android.gms.drive.query.internal.LogicalFilter, matchAllFilter: com.google.android.gms.drive.query.internal.NotFilter, p5: com.google.android.gms.drive.query.internal.InFilter, p6: com.google.android.gms.drive.query.internal.MatchAllFilter, p7: com.google.android.gms.drive.query.internal.HasFilter)

    public constructor(filter: com.google.android.gms.drive.query.Filter)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getFilter(): com.google.android.gms.drive.query.Filter { return TODO("body: ()Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->QV:Lcom/google/android/gms/drive/query/Filter;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "FilterHolder[%s]"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->QV:Lcom/google/android/gms/drive/query/Filter;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/d;->a(Lcom/google/android/gms/drive/query/internal/FilterHolder;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
