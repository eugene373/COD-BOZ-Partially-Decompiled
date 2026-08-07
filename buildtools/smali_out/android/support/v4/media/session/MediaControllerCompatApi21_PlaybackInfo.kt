package android.support.v4.media.session

// Auto-emitted from smali source: MediaControllerCompatApi21.java.
// 3 fields, 8 methods.

open class MediaControllerCompatApi21_PlaybackInfo {
    public constructor()

    companion object {
    private val FLAG_SCO: Int = 0x4
    private val STREAM_BLUETOOTH_SCO: Int = 0x6
    private val STREAM_SYSTEM_ENFORCED: Int = 0x7

    public @JvmStatic fun getAudioAttributes(volumeInfoObj: Object): android.media.AudioAttributes { return TODO("body: (Ljava/lang/Object;)Landroid/media/AudioAttributes;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaController$PlaybackInfo;
    //         .end local p0    # "volumeInfoObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaController$PlaybackInfo;->getAudioAttributes()Landroid/media/AudioAttributes;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getCurrentVolume(volumeInfoObj: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaController$PlaybackInfo;
    //         .end local p0    # "volumeInfoObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaController$PlaybackInfo;->getCurrentVolume()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getLegacyAudioStream(volumeInfoObj: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/support/v4/media/session/MediaControllerCompatApi21$PlaybackInfo;->getAudioAttributes(Ljava/lang/Object;)Landroid/media/AudioAttributes;
    //         move-result-object v0
    //         .local v0, "attrs":Landroid/media/AudioAttributes;
    //         invoke-static {v0}, Landroid/support/v4/media/session/MediaControllerCompatApi21$PlaybackInfo;->toLegacyStreamType(Landroid/media/AudioAttributes;)I
    //         move-result v1
    //         return v1
    */

    public @JvmStatic fun getMaxVolume(volumeInfoObj: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaController$PlaybackInfo;
    //         .end local p0    # "volumeInfoObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaController$PlaybackInfo;->getMaxVolume()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getPlaybackType(volumeInfoObj: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaController$PlaybackInfo;
    //         .end local p0    # "volumeInfoObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaController$PlaybackInfo;->getPlaybackType()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getVolumeControl(volumeInfoObj: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/MediaController$PlaybackInfo;
    //         .end local p0    # "volumeInfoObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/MediaController$PlaybackInfo;->getVolumeControl()I
    //         move-result v0
    //         return v0
    */

    private @JvmStatic fun toLegacyStreamType(aa: android.media.AudioAttributes): Int { return TODO("body: (Landroid/media/AudioAttributes;)I") }
    /*
    //         .locals 4
    //         const/4 v2, 0x4
    //         const/4 v0, 0x3
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Landroid/media/AudioAttributes;->getFlags()I
    //         move-result v3
    //         and-int/lit8 v3, v3, 0x1
    //         if-ne v3, v1, :cond_0
    //         const/4 v0, 0x7
    //         :goto_0
    //         :pswitch_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/media/AudioAttributes;->getFlags()I
    //         move-result v3
    //         and-int/lit8 v3, v3, 0x4
    //         if-ne v3, v2, :cond_1
    //         const/4 v0, 0x6
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/media/AudioAttributes;->getUsage()I
    //         move-result v3
    //         packed-switch v3, :pswitch_data_0
    //         goto :goto_0
    //         :pswitch_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :pswitch_2
    //         move v0, v1
    //         goto :goto_0
    //         :pswitch_3
    //         const/16 v0, 0x8
    //         goto :goto_0
    //         :pswitch_4
    //         move v0, v2
    //         goto :goto_0
    //         :pswitch_5
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         :pswitch_6
    //         const/4 v0, 0x5
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_6
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_6
    //             :pswitch_6
    //             :pswitch_6
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_2
    //             :pswitch_0
    //         .end packed-switch
    */

    }
}
