package android.support.v4.media.session

// Auto-emitted from smali source: PlaybackStateCompat.java.
// 7 fields, 7 methods.

class PlaybackStateCompat_Builder {
    private var mActions: Long
    private var mBufferedPosition: Long
    private var mErrorMessage: CharSequence
    private var mPosition: Long
    private var mRate: Float
    private var mState: Int
    private var mUpdateTime: Long

    public constructor()

    public constructor(source: android.support.v4.media.session.PlaybackStateCompat)

    public fun build(): android.support.v4.media.session.PlaybackStateCompat { return TODO("body: ()Landroid/support/v4/media/session/PlaybackStateCompat;") }
    /*
    //         .locals 13
    //         new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat;
    //         iget v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mState:I
    //         iget-wide v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mPosition:J
    //         iget-wide v4, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mBufferedPosition:J
    //         iget v6, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mRate:F
    //         iget-wide v7, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mActions:J
    //         iget-object v9, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mErrorMessage:Ljava/lang/CharSequence;
    //         iget-wide v10, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mUpdateTime:J
    //         const/4 v12, 0x0
    //         invoke-direct/range {v0 .. v12}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJLjava/lang/CharSequence;JLandroid/support/v4/media/session/PlaybackStateCompat$1;)V
    //         return-object v0
    */

    public fun setActions(capabilities: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mActions:J
    //         return-void
    */

    public fun setBufferedPosition(bufferPosition: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mBufferedPosition:J
    //         return-void
    */

    public fun setErrorMessage(errorMessage: CharSequence) { /* TODO(body): (Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mErrorMessage:Ljava/lang/CharSequence;
    //         return-void
    */

    public fun setState(state: Int, position: Long, playbackRate: Float) { /* TODO(body): (IJF)V */ }
    /*
    //         .locals 2
    //         iput p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mState:I
    //         iput-wide p2, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mPosition:J
    //         iput p4, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mRate:F
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->mUpdateTime:J
    //         return-void
    */

}
