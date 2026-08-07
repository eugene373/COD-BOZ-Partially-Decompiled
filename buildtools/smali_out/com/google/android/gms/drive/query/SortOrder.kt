package com.google.android.gms.drive.query

// Auto-emitted from smali.
// 4 fields, 7 methods.

open class SortOrder: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val QI: java.util.List
    val QJ: Boolean

    constructor(versionCode: Int, sortFolderFirst: java.util.List, p2: Boolean)

    private constructor(sortFolderFirst: java.util.List, p1: Boolean)

    constructor(x0: java.util.List, x1: Boolean, x2: com.google.android.gms.drive.query.SortOrder.1)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         const-string v1, "SortOrder[%s, %s]"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         const-string v4, ","
    //         iget-object v5, p0, Lcom/google/android/gms/drive/query/SortOrder;->QI:Ljava/util/List;
    //         invoke-static {v4, v5}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x1
    //         iget-boolean v4, p0, Lcom/google/android/gms/drive/query/SortOrder;->QJ:Z
    //         invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/b;->a(Lcom/google/android/gms/drive/query/SortOrder;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
