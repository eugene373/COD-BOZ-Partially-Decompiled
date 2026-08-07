package com.google.android.gms.drive.query.internal

// Auto-emitted from smali.
// 4 fields, 6 methods.

open class FieldWithSortOrder: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val PB: String
    val QN: Boolean

    constructor(versionCode: Int, fieldName: String, isSortAscending: Boolean)

    public constructor(fieldName: String, isSortAscending: Boolean)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         const-string v2, "FieldWithSortOrder[%s %s]"
    //         const/4 v0, 0x2
    //         new-array v3, v0, [Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         iget-object v4, p0, Lcom/google/android/gms/drive/query/internal/FieldWithSortOrder;->PB:Ljava/lang/String;
    //         aput-object v4, v3, v0
    //         const/4 v4, 0x1
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/query/internal/FieldWithSortOrder;->QN:Z
    //         if-eqz v0, :cond_0
    //         const-string v0, "ASC"
    //         :goto_0
    //         aput-object v0, v3, v4
    //         invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "DESC"
    //         goto :goto_0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/c;->a(Lcom/google/android/gms/drive/query/internal/FieldWithSortOrder;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.drive.query.internal.c = null!!
    }
}
