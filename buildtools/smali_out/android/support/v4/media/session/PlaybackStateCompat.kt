package android.support.v4.media.session

// Auto-emitted from smali source: PlaybackStateCompat.java.
// 34 fields, 24 methods.

class PlaybackStateCompat: android.os.Parcelable {
    private val mActions: Long
    private val mBufferedPosition: Long
    private val mErrorMessage: CharSequence
    private val mPosition: Long
    private val mSpeed: Float
    private val mState: Int
    private var mStateObj: Object
    private val mUpdateTime: Long

    private constructor(state: Int, position: Long, bufferedPosition: Long, rate: Float, actions: Long, errorMessage: CharSequence, updateTime: Long)

    constructor(x0: Int, x1: Long, x2: Long, x3: Float, x4: Long, x5: CharSequence, x6: Long, x7: android.support.v4.media.session.PlaybackStateCompat.1)

    private constructor(in: android.os.Parcel)

    constructor(x0: android.os.Parcel, x1: android.support.v4.media.session.PlaybackStateCompat.1)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getActions(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mActions:J
    //         return-wide v0
    */

    public fun getBufferedPosition(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mBufferedPosition:J
    //         return-wide v0
    */

    public fun getErrorMessage(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mErrorMessage:Ljava/lang/CharSequence;
    //         return-object v0
    */

    public fun getLastPositionUpdateTime(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mUpdateTime:J
    //         return-wide v0
    */

    public fun getPlaybackSpeed(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mSpeed:F
    //         return v0
    */

    public fun getPlaybackState(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 12
    //         iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mStateObj:Ljava/lang/Object;
    //         if-nez v0, :cond_0
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x15
    //         if-ge v0, v1, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mStateObj:Ljava/lang/Object;
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mState:I
    //         iget-wide v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mPosition:J
    //         iget-wide v4, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mBufferedPosition:J
    //         iget v6, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mSpeed:F
    //         iget-wide v7, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mActions:J
    //         iget-object v9, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mErrorMessage:Ljava/lang/CharSequence;
    //         iget-wide v10, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mUpdateTime:J
    //         invoke-static/range {v1 .. v11}, Landroid/support/v4/media/session/PlaybackStateCompatApi21;->newInstance(IJJFJLjava/lang/CharSequence;J)Ljava/lang/Object;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mStateObj:Ljava/lang/Object;
    //         iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mStateObj:Ljava/lang/Object;
    //         goto :goto_0
    */

    public fun getPosition(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mPosition:J
    //         return-wide v0
    */

    public fun getState(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mState:I
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         const-string v1, "PlaybackState {"
    //         invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         .local v0, "bob":Ljava/lang/StringBuilder;
    //         const-string v1, "state="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mState:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         const-string v1, ", position="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-wide v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mPosition:J
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         const-string v1, ", buffered position="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-wide v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mBufferedPosition:J
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         const-string v1, ", speed="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mSpeed:F
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
    //         const-string v1, ", updated="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-wide v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mUpdateTime:J
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         const-string v1, ", actions="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-wide v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mActions:J
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         const-string v1, ", error="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mErrorMessage:Ljava/lang/CharSequence;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         return-object v1
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mState:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mPosition:J
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
    //         iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mSpeed:F
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V
    //         iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mUpdateTime:J
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mBufferedPosition:J
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mActions:J
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
    //         iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->mErrorMessage:Ljava/lang/CharSequence;
    //         invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val ACTION_FAST_FORWARD: Long = 0x40L
    @JvmField public val ACTION_PAUSE: Long = 0x2L
    @JvmField public val ACTION_PLAY: Long = 0x4L
    @JvmField public val ACTION_PLAY_FROM_MEDIA_ID: Long = 0x400L
    @JvmField public val ACTION_PLAY_FROM_SEARCH: Long = 0x800L
    @JvmField public val ACTION_PLAY_PAUSE: Long = 0x200L
    @JvmField public val ACTION_REWIND: Long = 0x8L
    @JvmField public val ACTION_SEEK_TO: Long = 0x100L
    @JvmField public val ACTION_SET_RATING: Long = 0x80L
    @JvmField public val ACTION_SKIP_TO_NEXT: Long = 0x20L
    @JvmField public val ACTION_SKIP_TO_PREVIOUS: Long = 0x10L
    @JvmField public val ACTION_SKIP_TO_QUEUE_ITEM: Long = 0x1000L
    @JvmField public val ACTION_STOP: Long = 0x1L
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val PLAYBACK_POSITION_UNKNOWN: Long = 0L
    @JvmField public val STATE_BUFFERING: Int = 0x6
    @JvmField public val STATE_CONNECTING: Int = 0x8
    @JvmField public val STATE_ERROR: Int = 0x7
    @JvmField public val STATE_FAST_FORWARDING: Int = 0x4
    @JvmField public val STATE_NONE: Int = 0x0
    @JvmField public val STATE_PAUSED: Int = 0x2
    @JvmField public val STATE_PLAYING: Int = 0x3
    @JvmField public val STATE_REWINDING: Int = 0x5
    @JvmField public val STATE_SKIPPING_TO_NEXT: Int = 0xa
    @JvmField public val STATE_SKIPPING_TO_PREVIOUS: Int = 0x9
    @JvmField public val STATE_STOPPED: Int = 0x1

    public @JvmStatic fun fromPlaybackState(stateObj: Object): android.support.v4.media.session.PlaybackStateCompat { return TODO("body: (Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat;") }
    /*
    //         .locals 12
    //         if-eqz p0, :cond_0
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v2, 0x15
    //         if-ge v1, v2, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat;
    //         invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompatApi21;->getState(Ljava/lang/Object;)I
    //         move-result v1
    //         invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompatApi21;->getPosition(Ljava/lang/Object;)J
    //         move-result-wide v2
    //         invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompatApi21;->getBufferedPosition(Ljava/lang/Object;)J
    //         move-result-wide v4
    //         invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompatApi21;->getPlaybackSpeed(Ljava/lang/Object;)F
    //         move-result v6
    //         invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompatApi21;->getActions(Ljava/lang/Object;)J
    //         move-result-wide v7
    //         invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompatApi21;->getErrorMessage(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v9
    //         invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompatApi21;->getLastPositionUpdateTime(Ljava/lang/Object;)J
    //         move-result-wide v10
    //         invoke-direct/range {v0 .. v11}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJLjava/lang/CharSequence;J)V
    //         .local v0, "state":Landroid/support/v4/media/session/PlaybackStateCompat;
    //         iput-object p0, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->mStateObj:Ljava/lang/Object;
    //         goto :goto_0
    */

    }
}
