package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 9 methods.

open class hb: android.os.Parcelable {
    private var BL: String
    private var BM: String
    private var mValue: String

    public constructor()

    constructor(p0: android.os.Parcel)

    public constructor(p0: String, p1: String, p2: String)

    private fun readFromParcel(in: android.os.Parcel) { /* TODO(body): (Landroid/os/Parcel;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/hb;->BL:Ljava/lang/String;
    //         invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/hb;->BM:Ljava/lang/String;
    //         invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/hb;->mValue:Ljava/lang/String;
    //         return-void
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hb;->BL:Ljava/lang/String;
    //         return-object v0
    */

    public fun getValue(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mValue:Ljava/lang/String;
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hb;->BL:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hb;->BM:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hb;->mValue:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
