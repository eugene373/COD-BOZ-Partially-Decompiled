package com.google.android.gms.drive.query

// Auto-emitted from smali.
// 6 fields, 10 methods.

open class Query: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val QB: com.google.android.gms.drive.query.internal.LogicalFilter
    val QC: String
    val QD: com.google.android.gms.drive.query.SortOrder
    val QE: java.util.List

    constructor(versionCode: Int, clause: com.google.android.gms.drive.query.internal.LogicalFilter, pageToken: String, sortOrder: com.google.android.gms.drive.query.SortOrder, p4: java.util.List)

    constructor(clause: com.google.android.gms.drive.query.internal.LogicalFilter, pageToken: String, sortOrder: com.google.android.gms.drive.query.SortOrder, p3: java.util.List)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getFilter(): com.google.android.gms.drive.query.Filter { return TODO("body: ()Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->QB:Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    //         return-object v0
    */

    public fun getPageToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->QC:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSortOrder(): com.google.android.gms.drive.query.SortOrder { return TODO("body: ()Lcom/google/android/gms/drive/query/SortOrder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->QD:Lcom/google/android/gms/drive/query/SortOrder;
    //         return-object v0
    */

    public fun iq(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/Query;->QE:Ljava/util/List;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         const-string v1, "Query[%s,%s,PageToken=%s]"
    //         const/4 v2, 0x3
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         iget-object v4, p0, Lcom/google/android/gms/drive/query/Query;->QB:Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x1
    //         iget-object v4, p0, Lcom/google/android/gms/drive/query/Query;->QD:Lcom/google/android/gms/drive/query/SortOrder;
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x2
    //         iget-object v4, p0, Lcom/google/android/gms/drive/query/Query;->QC:Ljava/lang/String;
    //         aput-object v4, v2, v3
    //         invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/a;->a(Lcom/google/android/gms/drive/query/Query;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
