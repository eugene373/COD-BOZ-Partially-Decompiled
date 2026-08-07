package android.support.v4.media

// Auto-emitted from smali source: VolumeProviderCompat.java.
// 8 fields, 9 methods.

open class VolumeProviderCompat {
    private var mCallback: android.support.v4.media.VolumeProviderCompat.Callback
    private val mControlType: Int
    private var mCurrentVolume: Int
    private val mMaxVolume: Int
    private var mVolumeProviderObj: Object

    public constructor(volumeControl: Int, maxVolume: Int, currentVolume: Int)

    public fun getCurrentVolume(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/media/VolumeProviderCompat;->mCurrentVolume:I
    //         return v0
    */

    public fun getMaxVolume(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/media/VolumeProviderCompat;->mMaxVolume:I
    //         return v0
    */

    public fun getVolumeControl(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/media/VolumeProviderCompat;->mControlType:I
    //         return v0
    */

    public fun getVolumeProvider(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Landroid/support/v4/media/VolumeProviderCompat;->mVolumeProviderObj:Ljava/lang/Object;
    //         if-nez v0, :cond_0
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x15
    //         if-ge v0, v1, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/VolumeProviderCompat;->mVolumeProviderObj:Ljava/lang/Object;
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget v0, p0, Landroid/support/v4/media/VolumeProviderCompat;->mControlType:I
    //         iget v1, p0, Landroid/support/v4/media/VolumeProviderCompat;->mMaxVolume:I
    //         iget v2, p0, Landroid/support/v4/media/VolumeProviderCompat;->mCurrentVolume:I
    //         new-instance v3, Landroid/support/v4/media/VolumeProviderCompat$1;
    //         invoke-direct {v3, p0}, Landroid/support/v4/media/VolumeProviderCompat$1;-><init>(Landroid/support/v4/media/VolumeProviderCompat;)V
    //         invoke-static {v0, v1, v2, v3}, Landroid/support/v4/media/VolumeProviderCompatApi21;->createVolumeProvider(IIILandroid/support/v4/media/VolumeProviderCompatApi21$Delegate;)Ljava/lang/Object;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/media/VolumeProviderCompat;->mVolumeProviderObj:Ljava/lang/Object;
    //         iget-object v0, p0, Landroid/support/v4/media/VolumeProviderCompat;->mVolumeProviderObj:Ljava/lang/Object;
    //         goto :goto_0
    */

    public fun onAdjustVolume(direction: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onSetVolumeTo(volume: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setCallback(callback: android.support.v4.media.VolumeProviderCompat.Callback) { /* TODO(body): (Landroid/support/v4/media/VolumeProviderCompat$Callback;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/media/VolumeProviderCompat;->mCallback:Landroid/support/v4/media/VolumeProviderCompat$Callback;
    //         return-void
    */

    public fun setCurrentVolume(currentVolume: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/VolumeProviderCompat;->mCallback:Landroid/support/v4/media/VolumeProviderCompat$Callback;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/VolumeProviderCompat;->mCallback:Landroid/support/v4/media/VolumeProviderCompat$Callback;
    //         invoke-virtual {v0, p0}, Landroid/support/v4/media/VolumeProviderCompat$Callback;->onVolumeChanged(Landroid/support/v4/media/VolumeProviderCompat;)V
    //         :cond_0
    //         return-void
    */

    companion object {
    @JvmField public val VOLUME_CONTROL_ABSOLUTE: Int = 0x2
    @JvmField public val VOLUME_CONTROL_FIXED: Int = 0x0
    @JvmField public val VOLUME_CONTROL_RELATIVE: Int = 0x1
    }
}
