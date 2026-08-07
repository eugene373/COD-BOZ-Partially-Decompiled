package com.google.android.gms.drive.metadata.internal

// Auto-emitted from smali.
// 4 fields, 7 methods.

class AppVisibleCustomProperties: com.google.android.gms.common.internal.safeparcel.SafeParcelable, Iterable {
    val BR: Int
    val PH: java.util.List

    constructor(versionCode: Int, p1: java.util.Collection)

    private constructor(p0: java.util.Collection)

    constructor(x0: java.util.Collection, x1: com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.1)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun iterator(): java.util.Iterator { return TODO("body: ()Ljava/util/Iterator;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Iterator",
    //                 "<",
    //                 "Lcom/google/android/gms/drive/metadata/internal/CustomProperty;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;->PH:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/metadata/internal/a;->a(Lcom/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val PG: com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties = null!!
    }
}
