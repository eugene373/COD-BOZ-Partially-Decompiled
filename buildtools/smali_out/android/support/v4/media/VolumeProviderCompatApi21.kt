package android.support.v4.media

// Auto-emitted from smali source: VolumeProviderCompatApi21.java.
// 0 fields, 3 methods.

open class VolumeProviderCompatApi21 {
    constructor()

    companion object {
    public @JvmStatic fun createVolumeProvider(volumeControl: Int, maxVolume: Int, currentVolume: Int, delegate: android.support.v4.media.VolumeProviderCompatApi21.Delegate): Object { return TODO("body: (IIILandroid/support/v4/media/VolumeProviderCompatApi21$Delegate;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/media/VolumeProviderCompatApi21$1;
    //         invoke-direct {v0, p0, p1, p2, p3}, Landroid/support/v4/media/VolumeProviderCompatApi21$1;-><init>(IIILandroid/support/v4/media/VolumeProviderCompatApi21$Delegate;)V
    //         return-object v0
    */

    public @JvmStatic fun setCurrentVolume(volumeProviderObj: Object, currentVolume: Int) { /* TODO(body): (Ljava/lang/Object;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/VolumeProvider;
    //         .end local p0    # "volumeProviderObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/VolumeProvider;->setCurrentVolume(I)V
    //         return-void
    */

    }
}
