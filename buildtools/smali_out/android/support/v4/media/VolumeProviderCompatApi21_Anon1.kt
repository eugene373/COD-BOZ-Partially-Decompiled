package android.support.v4.media

// Auto-emitted from smali source: VolumeProviderCompatApi21.java.
// 1 fields, 3 methods.

class VolumeProviderCompatApi21_Anon1: android.media.VolumeProvider() {
    val val$delegate: android.support.v4.media.VolumeProviderCompatApi21.Delegate

    constructor(x0: Int, x1: Int, x2: Int, p3: android.support.v4.media.VolumeProviderCompatApi21.Delegate)

    public fun onAdjustVolume(direction: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/VolumeProviderCompatApi21$1;->val$delegate:Landroid/support/v4/media/VolumeProviderCompatApi21$Delegate;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/VolumeProviderCompatApi21$Delegate;->onAdjustVolume(I)V
    //         return-void
    */

    public fun onSetVolumeTo(volume: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/VolumeProviderCompatApi21$1;->val$delegate:Landroid/support/v4/media/VolumeProviderCompatApi21$Delegate;
    //         invoke-interface {v0, p1}, Landroid/support/v4/media/VolumeProviderCompatApi21$Delegate;->onSetVolumeTo(I)V
    //         return-void
    */

}
