package android.support.v4.media.session

// Auto-emitted from smali source: MediaSessionCompat.java.
// 2 fields, 5 methods.

class MediaSessionCompat_Token: android.os.Parcelable {
    private val mInner: android.os.Parcelable

    constructor(inner: android.os.Parcelable)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->mInner:Landroid/os/Parcelable;
    //         invoke-interface {v0}, Landroid/os/Parcelable;->describeContents()I
    //         move-result v0
    //         return v0
    */

    public fun getToken(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->mInner:Landroid/os/Parcelable;
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/MediaSessionCompat$Token;->mInner:Landroid/os/Parcelable;
    //         invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
