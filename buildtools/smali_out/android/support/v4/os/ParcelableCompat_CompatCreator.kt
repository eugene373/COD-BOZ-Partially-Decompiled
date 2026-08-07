package android.support.v4.os

// Auto-emitted from smali source: ParcelableCompat.java.
// 1 fields, 3 methods.

open class ParcelableCompat_CompatCreator: android.os.Parcelable.Creator {
    val mCallbacks: android.support.v4.os.ParcelableCompatCreatorCallbacks

    public constructor(p0: android.support.v4.os.ParcelableCompatCreatorCallbacks)

    public fun createFromParcel(source: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/os/ParcelableCompat$CompatCreator;, "Landroid/support/v4/os/ParcelableCompat$CompatCreator<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/os/ParcelableCompat$CompatCreator;->mCallbacks:Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, p1, v1}, Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;->createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newArray(size: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/os/ParcelableCompat$CompatCreator;, "Landroid/support/v4/os/ParcelableCompat$CompatCreator<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/os/ParcelableCompat$CompatCreator;->mCallbacks:Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;
    //         invoke-interface {v0, p1}, Landroid/support/v4/os/ParcelableCompatCreatorCallbacks;->newArray(I)[Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

}
