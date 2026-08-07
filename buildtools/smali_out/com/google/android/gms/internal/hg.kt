package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 6 methods.

open class hg: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val BZ: String
    val Ca: String
    val Cb: String

    constructor(p0: Int, p1: String, p2: String, p3: String)

    public constructor(p0: String, p1: String, p2: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hg;->CREATOR:Lcom/google/android/gms/internal/hh;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "DocumentId[packageName=%s, corpusName=%s, uri=%s]"
    //         const/4 v1, 0x3
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/internal/hg;->BZ:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/hg;->Ca:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget-object v3, p0, Lcom/google/android/gms/internal/hg;->Cb:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hg;->CREATOR:Lcom/google/android/gms/internal/hh;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hh;->a(Lcom/google/android/gms/internal/hg;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.hh = null!!
    }
}
