package android.support.v4.media.session

// Auto-emitted from smali source: PlaybackStateCompatApi21.java.
// 0 fields, 9 methods.

open class PlaybackStateCompatApi21 {
    constructor()

    companion object {
    public @JvmStatic fun getActions(stateObj: Object): Long { return TODO("body: (Ljava/lang/Object;)J") }
    /*
    //         .locals 2
    //         check-cast p0, Landroid/media/session/PlaybackState;
    //         .end local p0    # "stateObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getActions()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public @JvmStatic fun getBufferedPosition(stateObj: Object): Long { return TODO("body: (Ljava/lang/Object;)J") }
    /*
    //         .locals 2
    //         check-cast p0, Landroid/media/session/PlaybackState;
    //         .end local p0    # "stateObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getBufferedPosition()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public @JvmStatic fun getErrorMessage(stateObj: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/PlaybackState;
    //         .end local p0    # "stateObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getErrorMessage()Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getLastPositionUpdateTime(stateObj: Object): Long { return TODO("body: (Ljava/lang/Object;)J") }
    /*
    //         .locals 2
    //         check-cast p0, Landroid/media/session/PlaybackState;
    //         .end local p0    # "stateObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getLastPositionUpdateTime()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public @JvmStatic fun getPlaybackSpeed(stateObj: Object): Float { return TODO("body: (Ljava/lang/Object;)F") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/PlaybackState;
    //         .end local p0    # "stateObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getPlaybackSpeed()F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getPosition(stateObj: Object): Long { return TODO("body: (Ljava/lang/Object;)J") }
    /*
    //         .locals 2
    //         check-cast p0, Landroid/media/session/PlaybackState;
    //         .end local p0    # "stateObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getPosition()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public @JvmStatic fun getState(stateObj: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/session/PlaybackState;
    //         .end local p0    # "stateObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getState()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun newInstance(state: Int, position: Long, bufferedPosition: Long, speed: Float, actions: Long, errorMessage: CharSequence, updateTime: Long): Object { return TODO("body: (IJJFJLjava/lang/CharSequence;J)Ljava/lang/Object;") }
    /*
    //         .locals 7
    //         new-instance v0, Landroid/media/session/PlaybackState$Builder;
    //         invoke-direct {v0}, Landroid/media/session/PlaybackState$Builder;-><init>()V
    //         .local v0, "stateObj":Landroid/media/session/PlaybackState$Builder;
    //         move v1, p0
    //         move-wide v2, p1
    //         move v4, p5
    //         move-wide/from16 v5, p9
    //         invoke-virtual/range {v0 .. v6}, Landroid/media/session/PlaybackState$Builder;->setState(IJFJ)Landroid/media/session/PlaybackState$Builder;
    //         invoke-virtual {v0, p3, p4}, Landroid/media/session/PlaybackState$Builder;->setBufferedPosition(J)Landroid/media/session/PlaybackState$Builder;
    //         invoke-virtual {v0, p6, p7}, Landroid/media/session/PlaybackState$Builder;->setActions(J)Landroid/media/session/PlaybackState$Builder;
    //         invoke-virtual {v0, p8}, Landroid/media/session/PlaybackState$Builder;->setErrorMessage(Ljava/lang/CharSequence;)Landroid/media/session/PlaybackState$Builder;
    //         invoke-virtual {v0}, Landroid/media/session/PlaybackState$Builder;->build()Landroid/media/session/PlaybackState;
    //         move-result-object v1
    //         return-object v1
    */

    }
}
