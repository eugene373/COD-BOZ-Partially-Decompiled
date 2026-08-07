package android.support.v4.app

// Auto-emitted from smali source: FragmentManager.java.
// 4 fields, 5 methods.

class FragmentManagerState: android.os.Parcelable {
    var mActive: Array<android.support.v4.app.FragmentState>
    var mAdded: IntArray
    var mBackStack: Array<android.support.v4.app.BackStackState>

    public constructor()

    public constructor(in: android.os.Parcel)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentManagerState;->mActive:[Landroid/support/v4/app/FragmentState;
    //         invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentManagerState;->mAdded:[I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentManagerState;->mBackStack:[Landroid/support/v4/app/BackStackState;
    //         invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
