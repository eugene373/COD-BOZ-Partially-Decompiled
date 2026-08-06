.class public final Lcom/google/android/gms/games/GamesStatusCodes;
.super Ljava/lang/Object;


# static fields
.field public static final STATUS_ACHIEVEMENT_NOT_INCREMENTAL:I = 0xbba

.field public static final STATUS_ACHIEVEMENT_UNKNOWN:I = 0xbb9

.field public static final STATUS_ACHIEVEMENT_UNLOCKED:I = 0xbbb

.field public static final STATUS_ACHIEVEMENT_UNLOCK_FAILURE:I = 0xbb8

.field public static final STATUS_APP_MISCONFIGURED:I = 0x8

.field public static final STATUS_CLIENT_RECONNECT_REQUIRED:I = 0x2

.field public static final STATUS_GAME_NOT_FOUND:I = 0x9

.field public static final STATUS_INTERNAL_ERROR:I = 0x1

.field public static final STATUS_INTERRUPTED:I = 0xe

.field public static final STATUS_INVALID_REAL_TIME_ROOM_ID:I = 0x1b5a

.field public static final STATUS_LICENSE_CHECK_FAILED:I = 0x7

.field public static final STATUS_MATCH_ERROR_ALREADY_REMATCHED:I = 0x1969

.field public static final STATUS_MATCH_ERROR_INACTIVE_MATCH:I = 0x1965

.field public static final STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS:I = 0x1968

.field public static final STATUS_MATCH_ERROR_INVALID_MATCH_STATE:I = 0x1966

.field public static final STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE:I = 0x1964

.field public static final STATUS_MATCH_ERROR_LOCALLY_MODIFIED:I = 0x196b

.field public static final STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION:I = 0x1967

.field public static final STATUS_MATCH_NOT_FOUND:I = 0x196a

.field public static final STATUS_MILESTONE_CLAIMED_PREVIOUSLY:I = 0x1f40

.field public static final STATUS_MILESTONE_CLAIM_FAILED:I = 0x1f41

.field public static final STATUS_MULTIPLAYER_DISABLED:I = 0x1773

.field public static final STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED:I = 0x1770

.field public static final STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE:I = 0x1772

.field public static final STATUS_MULTIPLAYER_ERROR_INVALID_OPERATION:I = 0x1774

.field public static final STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER:I = 0x1771

.field public static final STATUS_NETWORK_ERROR_NO_DATA:I = 0x4

.field public static final STATUS_NETWORK_ERROR_OPERATION_DEFERRED:I = 0x5

.field public static final STATUS_NETWORK_ERROR_OPERATION_FAILED:I = 0x6

.field public static final STATUS_NETWORK_ERROR_STALE_DATA:I = 0x3

.field public static final STATUS_OK:I = 0x0

.field public static final STATUS_OPERATION_IN_FLIGHT:I = 0x1b5f

.field public static final STATUS_PARTICIPANT_NOT_CONNECTED:I = 0x1b5b

.field public static final STATUS_QUEST_NOT_STARTED:I = 0x1f43

.field public static final STATUS_QUEST_NO_LONGER_AVAILABLE:I = 0x1f42

.field public static final STATUS_REAL_TIME_CONNECTION_FAILED:I = 0x1b58

.field public static final STATUS_REAL_TIME_INACTIVE_ROOM:I = 0x1b5d

.field public static final STATUS_REAL_TIME_MESSAGE_SEND_FAILED:I = 0x1b59

.field public static final STATUS_REAL_TIME_ROOM_NOT_JOINED:I = 0x1b5c

.field public static final STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS:I = 0x7d0

.field public static final STATUS_REQUEST_UPDATE_TOTAL_FAILURE:I = 0x7d1

.field public static final STATUS_SNAPSHOT_COMMIT_FAILED:I = 0xfa3

.field public static final STATUS_SNAPSHOT_CONFLICT:I = 0xfa4

.field public static final STATUS_SNAPSHOT_CONFLICT_MISSING:I = 0xfa6

.field public static final STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE:I = 0xfa2

.field public static final STATUS_SNAPSHOT_CREATION_FAILED:I = 0xfa1

.field public static final STATUS_SNAPSHOT_FOLDER_UNAVAILABLE:I = 0xfa5

.field public static final STATUS_SNAPSHOT_NOT_FOUND:I = 0xfa0

.field public static final STATUS_TIMEOUT:I = 0xf


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getStatusString(I)Ljava/lang/String;
    .locals 4
    .param p0, "statusCode"    # I

    .prologue
    sparse-switch p0, :sswitch_data_0

    const-string v0, "Status code (%d) not found!"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :sswitch_0
    const-string v0, "STATUS_OK"

    goto :goto_0

    :sswitch_1
    const-string v0, "STATUS_INTERNAL_ERROR"

    goto :goto_0

    :sswitch_2
    const-string v0, "STATUS_CLIENT_RECONNECT_REQUIRED"

    goto :goto_0

    :sswitch_3
    const-string v0, "STATUS_NETWORK_ERROR_STALE_DATA"

    goto :goto_0

    :sswitch_4
    const-string v0, "STATUS_NETWORK_ERROR_NO_DATA"

    goto :goto_0

    :sswitch_5
    const-string v0, "STATUS_NETWORK_ERROR_OPERATION_DEFERRED"

    goto :goto_0

    :sswitch_6
    const-string v0, "STATUS_NETWORK_ERROR_OPERATION_FAILED"

    goto :goto_0

    :sswitch_7
    const-string v0, "STATUS_LICENSE_CHECK_FAILED"

    goto :goto_0

    :sswitch_8
    const-string v0, "STATUS_APP_MISCONFIGURED"

    goto :goto_0

    :sswitch_9
    const-string v0, "STATUS_GAME_NOT_FOUND"

    goto :goto_0

    :sswitch_a
    const-string v0, "STATUS_INTERRUPTED"

    goto :goto_0

    :sswitch_b
    const-string v0, "STATUS_TIMEOUT"

    goto :goto_0

    :sswitch_c
    const-string v0, "STATUS_RESOLVE_STALE_OR_NO_DATA"

    goto :goto_0

    :sswitch_d
    const-string v0, "STATUS_AUTH_ERROR_HARD"

    goto :goto_0

    :sswitch_e
    const-string v0, "STATUS_AUTH_ERROR_USER_RECOVERABLE"

    goto :goto_0

    :sswitch_f
    const-string v0, "STATUS_AUTH_ERROR_UNREGISTERED_CLIENT_ID"

    goto :goto_0

    :sswitch_10
    const-string v0, "STATUS_AUTH_ERROR_API_ACCESS_DENIED"

    goto :goto_0

    :sswitch_11
    const-string v0, "STATUS_PLAYER_OOB_REQUIRED"

    goto :goto_0

    :sswitch_12
    const-string v0, "STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS"

    goto :goto_0

    :sswitch_13
    const-string v0, "STATUS_REQUEST_UPDATE_TOTAL_FAILURE"

    goto :goto_0

    :sswitch_14
    const-string v0, "STATUS_ACHIEVEMENT_UNLOCK_FAILURE"

    goto :goto_0

    :sswitch_15
    const-string v0, "STATUS_ACHIEVEMENT_UNKNOWN"

    goto :goto_0

    :sswitch_16
    const-string v0, "STATUS_ACHIEVEMENT_NOT_INCREMENTAL"

    goto :goto_0

    :sswitch_17
    const-string v0, "STATUS_ACHIEVEMENT_UNLOCKED"

    goto :goto_0

    :sswitch_18
    const-string v0, "STATUS_SNAPSHOT_NOT_FOUND"

    goto :goto_0

    :sswitch_19
    const-string v0, "STATUS_SNAPSHOT_CREATION_FAILED"

    goto :goto_0

    :sswitch_1a
    const-string v0, "STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE"

    goto :goto_0

    :sswitch_1b
    const-string v0, "STATUS_SNAPSHOT_COMMIT_FAILED"

    goto :goto_0

    :sswitch_1c
    const-string v0, "STATUS_SNAPSHOT_CONFLICT"

    goto :goto_0

    :sswitch_1d
    const-string v0, "STATUS_SNAPSHOT_CONFLICT_MISSING"

    goto :goto_0

    :sswitch_1e
    const-string v0, "STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED"

    goto :goto_0

    :sswitch_1f
    const-string v0, "STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER"

    goto :goto_0

    :sswitch_20
    const-string v0, "STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE"

    goto :goto_0

    :sswitch_21
    const-string v0, "STATUS_MULTIPLAYER_DISABLED"

    goto :goto_0

    :sswitch_22
    const-string v0, "STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE"

    goto :goto_0

    :sswitch_23
    const-string v0, "STATUS_MATCH_ERROR_INACTIVE_MATCH"

    goto :goto_0

    :sswitch_24
    const-string v0, "STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION"

    goto :goto_0

    :sswitch_25
    const-string v0, "STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS"

    goto :goto_0

    :sswitch_26
    const-string v0, "STATUS_MATCH_ERROR_ALREADY_REMATCHED"

    goto :goto_0

    :sswitch_27
    const-string v0, "STATUS_MATCH_NOT_FOUND"

    goto :goto_0

    :sswitch_28
    const-string v0, "STATUS_MATCH_ERROR_LOCALLY_MODIFIED"

    goto :goto_0

    :sswitch_29
    const-string v0, "STATUS_REAL_TIME_CONNECTION_FAILED"

    goto :goto_0

    :sswitch_2a
    const-string v0, "STATUS_REAL_TIME_MESSAGE_SEND_FAILED"

    goto/16 :goto_0

    :sswitch_2b
    const-string v0, "STATUS_INVALID_REAL_TIME_ROOM_ID"

    goto/16 :goto_0

    :sswitch_2c
    const-string v0, "STATUS_PARTICIPANT_NOT_CONNECTED"

    goto/16 :goto_0

    :sswitch_2d
    const-string v0, "STATUS_REAL_TIME_ROOM_NOT_JOINED"

    goto/16 :goto_0

    :sswitch_2e
    const-string v0, "STATUS_REAL_TIME_INACTIVE_ROOM"

    goto/16 :goto_0

    :sswitch_2f
    const-string v0, "STATUS_REAL_TIME_SERVICE_NOT_CONNECTED"

    goto/16 :goto_0

    :sswitch_30
    const-string v0, "STATUS_OPERATION_IN_FLIGHT"

    goto/16 :goto_0

    :sswitch_31
    const-string v0, "STATUS_MILESTONE_CLAIMED_PREVIOUSLY"

    goto/16 :goto_0

    :sswitch_32
    const-string v0, "STATUS_MILESTONE_CLAIM_FAILED"

    goto/16 :goto_0

    :sswitch_33
    const-string v0, "STATUS_QUEST_NO_LONGER_AVAILABLE"

    goto/16 :goto_0

    :sswitch_34
    const-string v0, "STATUS_QUEST_NOT_STARTED"

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x9 -> :sswitch_9
        0xe -> :sswitch_a
        0xf -> :sswitch_b
        0x1f4 -> :sswitch_c
        0x3e8 -> :sswitch_d
        0x3e9 -> :sswitch_e
        0x3ea -> :sswitch_f
        0x3eb -> :sswitch_10
        0x5dc -> :sswitch_11
        0x7d0 -> :sswitch_12
        0x7d1 -> :sswitch_13
        0xbb8 -> :sswitch_14
        0xbb9 -> :sswitch_15
        0xbba -> :sswitch_16
        0xbbb -> :sswitch_17
        0xfa0 -> :sswitch_18
        0xfa1 -> :sswitch_19
        0xfa2 -> :sswitch_1a
        0xfa3 -> :sswitch_1b
        0xfa4 -> :sswitch_1c
        0xfa6 -> :sswitch_1d
        0x1770 -> :sswitch_1e
        0x1771 -> :sswitch_1f
        0x1772 -> :sswitch_20
        0x1773 -> :sswitch_21
        0x1964 -> :sswitch_22
        0x1965 -> :sswitch_23
        0x1967 -> :sswitch_24
        0x1968 -> :sswitch_25
        0x1969 -> :sswitch_26
        0x196a -> :sswitch_27
        0x196b -> :sswitch_28
        0x1b58 -> :sswitch_29
        0x1b59 -> :sswitch_2a
        0x1b5a -> :sswitch_2b
        0x1b5b -> :sswitch_2c
        0x1b5c -> :sswitch_2d
        0x1b5d -> :sswitch_2e
        0x1b5e -> :sswitch_2f
        0x1b5f -> :sswitch_30
        0x1f40 -> :sswitch_31
        0x1f41 -> :sswitch_32
        0x1f42 -> :sswitch_33
        0x1f43 -> :sswitch_34
    .end sparse-switch
.end method
