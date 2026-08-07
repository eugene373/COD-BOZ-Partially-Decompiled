package android.support.v4.widget

// Auto-emitted from smali source: DrawerLayout.java.
// 4 fields, 4 methods.

open class DrawerLayout_SavedState: android.view.View.BaseSavedState() {
    var lockModeLeft: Int
    var lockModeRight: Int
    var openDrawerGravity: Int

    public constructor(in: android.os.Parcel)

    public constructor(superState: android.os.Parcelable)

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V
    //         iget v0, p0, Landroid/support/v4/widget/DrawerLayout$SavedState;->openDrawerGravity:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
