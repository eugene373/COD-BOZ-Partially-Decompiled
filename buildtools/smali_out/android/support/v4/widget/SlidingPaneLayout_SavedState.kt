package android.support.v4.widget

// Auto-emitted from smali source: SlidingPaneLayout.java.
// 2 fields, 5 methods.

open class SlidingPaneLayout_SavedState: android.view.View.BaseSavedState() {
    var isOpen: Boolean

    private constructor(in: android.os.Parcel)

    constructor(x0: android.os.Parcel, x1: android.support.v4.widget.SlidingPaneLayout.1)

    constructor(superState: android.os.Parcelable)

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V
    //         iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
