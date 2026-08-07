package android.support.v4.media.session

// Auto-emitted from smali source: MediaControllerCompat.java.
// 7 fields, 6 methods.

class MediaControllerCompat_PlaybackInfo {
    private val mAudioStream: Int
    private val mCurrentVolume: Int
    private val mMaxVolume: Int
    private val mPlaybackType: Int
    private val mVolumeControl: Int

    constructor(type: Int, stream: Int, control: Int, max: Int, current: Int)

    public fun getAudioStream(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;->mAudioStream:I
    //         return v0
    */

    public fun getCurrentVolume(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;->mCurrentVolume:I
    //         return v0
    */

    public fun getMaxVolume(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;->mMaxVolume:I
    //         return v0
    */

    public fun getPlaybackType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;->mPlaybackType:I
    //         return v0
    */

    public fun getVolumeControl(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/media/session/MediaControllerCompat$PlaybackInfo;->mVolumeControl:I
    //         return v0
    */

    companion object {
    @JvmField public val PLAYBACK_TYPE_LOCAL: Int = 0x1
    @JvmField public val PLAYBACK_TYPE_REMOTE: Int = 0x2
    }
}
