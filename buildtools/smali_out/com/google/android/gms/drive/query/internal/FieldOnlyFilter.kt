package com.google.android.gms.drive.query.internal

// Auto-emitted from smali.
// 4 fields, 6 methods.

open class FieldOnlyFilter: com.google.android.gms.drive.query.internal.AbstractFilter() {
    val BR: Int
    val QL: com.google.android.gms.drive.metadata.internal.MetadataBundle
    private val QM: com.google.android.gms.drive.metadata.MetadataField

    constructor(versionCode: Int, value: com.google.android.gms.drive.metadata.internal.MetadataBundle)

    public constructor(p0: com.google.android.gms.drive.metadata.SearchableMetadataField)

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
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;->QM:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/drive/query/internal/f;->d(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
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
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/b;->a(Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
