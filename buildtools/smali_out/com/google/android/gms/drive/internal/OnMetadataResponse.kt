package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 3 fields, 5 methods.

open class OnMetadataResponse: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Ol: com.google.android.gms.drive.metadata.internal.MetadataBundle

    constructor(versionCode: Int, metadata: com.google.android.gms.drive.metadata.internal.MetadataBundle)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun il(): com.google.android.gms.drive.metadata.internal.MetadataBundle { return TODO("body: ()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnMetadataResponse;->Ol:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/ap;->a(Lcom/google/android/gms/drive/internal/OnMetadataResponse;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
