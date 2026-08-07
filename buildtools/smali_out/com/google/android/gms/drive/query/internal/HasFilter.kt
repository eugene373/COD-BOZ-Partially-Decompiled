package com.google.android.gms.drive.query.internal

// Auto-emitted from smali.
// 4 fields, 6 methods.

open class HasFilter: com.google.android.gms.drive.query.internal.AbstractFilter() {
    val BR: Int
    val QL: com.google.android.gms.drive.metadata.internal.MetadataBundle
    val QM: com.google.android.gms.drive.metadata.MetadataField

    constructor(versionCode: Int, value: com.google.android.gms.drive.metadata.internal.MetadataBundle)

    public fun a(p0: com.google.android.gms.drive.query.internal.f): Object { return TODO("body: (Lcom/google/android/gms/drive/query/internal/f;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<F:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/query/internal/f",
    //                 "<TF;>;)TF;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/HasFilter;->QM:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/query/internal/HasFilter;->getValue()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-interface {p1, v0, v1}, Lcom/google/android/gms/drive/query/internal/f;->d(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getValue(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TT;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/HasFilter;->QL:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/query/internal/HasFilter;->QM:Lcom/google/android/gms/drive/metadata/MetadataField;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->a(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Lcom/google/android/gms/drive/query/internal/HasFilter;, "Lcom/google/android/gms/drive/query/internal/HasFilter<TT;>;"
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/g;->a(Lcom/google/android/gms/drive/query/internal/HasFilter;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.drive.query.internal.g = null!!
    }
}
