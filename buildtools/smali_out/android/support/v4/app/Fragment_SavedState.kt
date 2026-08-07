package android.support.v4.app

// Auto-emitted from smali source: Fragment.java.
// 2 fields, 5 methods.

open class Fragment_SavedState: android.os.Parcelable {
    val mState: android.os.Bundle

    constructor(state: android.os.Bundle)

    constructor(in: android.os.Parcel, loader: ClassLoader)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/Fragment$SavedState;->mState:Landroid/os/Bundle;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
