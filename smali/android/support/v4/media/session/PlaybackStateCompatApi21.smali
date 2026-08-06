.class Landroid/support/v4/media/session/PlaybackStateCompatApi21;
.super Ljava/lang/Object;
.source "PlaybackStateCompatApi21.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getActions(Ljava/lang/Object;)J
    .locals 2
    .param p0, "stateObj"    # Ljava/lang/Object;

    .prologue
    .line 40
    check-cast p0, Landroid/media/session/PlaybackState;

    .end local p0    # "stateObj":Ljava/lang/Object;
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getActions()J

    move-result-wide v0

    return-wide v0
.end method

.method public static getBufferedPosition(Ljava/lang/Object;)J
    .locals 2
    .param p0, "stateObj"    # Ljava/lang/Object;

    .prologue
    .line 32
    check-cast p0, Landroid/media/session/PlaybackState;

    .end local p0    # "stateObj":Ljava/lang/Object;
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getBufferedPosition()J

    move-result-wide v0

    return-wide v0
.end method

.method public static getErrorMessage(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1
    .param p0, "stateObj"    # Ljava/lang/Object;

    .prologue
    .line 44
    check-cast p0, Landroid/media/session/PlaybackState;

    .end local p0    # "stateObj":Ljava/lang/Object;
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getErrorMessage()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public static getLastPositionUpdateTime(Ljava/lang/Object;)J
    .locals 2
    .param p0, "stateObj"    # Ljava/lang/Object;

    .prologue
    .line 48
    check-cast p0, Landroid/media/session/PlaybackState;

    .end local p0    # "stateObj":Ljava/lang/Object;
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getLastPositionUpdateTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public static getPlaybackSpeed(Ljava/lang/Object;)F
    .locals 1
    .param p0, "stateObj"    # Ljava/lang/Object;

    .prologue
    .line 36
    check-cast p0, Landroid/media/session/PlaybackState;

    .end local p0    # "stateObj":Ljava/lang/Object;
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getPlaybackSpeed()F

    move-result v0

    return v0
.end method

.method public static getPosition(Ljava/lang/Object;)J
    .locals 2
    .param p0, "stateObj"    # Ljava/lang/Object;

    .prologue
    .line 28
    check-cast p0, Landroid/media/session/PlaybackState;

    .end local p0    # "stateObj":Ljava/lang/Object;
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getPosition()J

    move-result-wide v0

    return-wide v0
.end method

.method public static getState(Ljava/lang/Object;)I
    .locals 1
    .param p0, "stateObj"    # Ljava/lang/Object;

    .prologue
    .line 24
    check-cast p0, Landroid/media/session/PlaybackState;

    .end local p0    # "stateObj":Ljava/lang/Object;
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getState()I

    move-result v0

    return v0
.end method

.method public static newInstance(IJJFJLjava/lang/CharSequence;J)Ljava/lang/Object;
    .locals 7
    .param p0, "state"    # I
    .param p1, "position"    # J
    .param p3, "bufferedPosition"    # J
    .param p5, "speed"    # F
    .param p6, "actions"    # J
    .param p8, "errorMessage"    # Ljava/lang/CharSequence;
    .param p9, "updateTime"    # J

    .prologue
    .line 53
    new-instance v0, Landroid/media/session/PlaybackState$Builder;

    invoke-direct {v0}, Landroid/media/session/PlaybackState$Builder;-><init>()V

    .local v0, "stateObj":Landroid/media/session/PlaybackState$Builder;
    move v1, p0

    move-wide v2, p1

    move v4, p5

    move-wide/from16 v5, p9

    .line 54
    invoke-virtual/range {v0 .. v6}, Landroid/media/session/PlaybackState$Builder;->setState(IJFJ)Landroid/media/session/PlaybackState$Builder;

    .line 55
    invoke-virtual {v0, p3, p4}, Landroid/media/session/PlaybackState$Builder;->setBufferedPosition(J)Landroid/media/session/PlaybackState$Builder;

    .line 56
    invoke-virtual {v0, p6, p7}, Landroid/media/session/PlaybackState$Builder;->setActions(J)Landroid/media/session/PlaybackState$Builder;

    .line 57
    invoke-virtual {v0, p8}, Landroid/media/session/PlaybackState$Builder;->setErrorMessage(Ljava/lang/CharSequence;)Landroid/media/session/PlaybackState$Builder;

    .line 58
    invoke-virtual {v0}, Landroid/media/session/PlaybackState$Builder;->build()Landroid/media/session/PlaybackState;

    move-result-object v1

    return-object v1
.end method
