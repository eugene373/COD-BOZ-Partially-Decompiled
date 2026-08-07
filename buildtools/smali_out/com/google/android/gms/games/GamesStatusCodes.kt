package com.google.android.gms.games

// Auto-emitted from smali.
// 49 fields, 2 methods.

class GamesStatusCodes {
    private constructor()

    companion object {
    @JvmField public val STATUS_ACHIEVEMENT_NOT_INCREMENTAL: Int = 0xbba
    @JvmField public val STATUS_ACHIEVEMENT_UNKNOWN: Int = 0xbb9
    @JvmField public val STATUS_ACHIEVEMENT_UNLOCKED: Int = 0xbbb
    @JvmField public val STATUS_ACHIEVEMENT_UNLOCK_FAILURE: Int = 0xbb8
    @JvmField public val STATUS_APP_MISCONFIGURED: Int = 0x8
    @JvmField public val STATUS_CLIENT_RECONNECT_REQUIRED: Int = 0x2
    @JvmField public val STATUS_GAME_NOT_FOUND: Int = 0x9
    @JvmField public val STATUS_INTERNAL_ERROR: Int = 0x1
    @JvmField public val STATUS_INTERRUPTED: Int = 0xe
    @JvmField public val STATUS_INVALID_REAL_TIME_ROOM_ID: Int = 0x1b5a
    @JvmField public val STATUS_LICENSE_CHECK_FAILED: Int = 0x7
    @JvmField public val STATUS_MATCH_ERROR_ALREADY_REMATCHED: Int = 0x1969
    @JvmField public val STATUS_MATCH_ERROR_INACTIVE_MATCH: Int = 0x1965
    @JvmField public val STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS: Int = 0x1968
    @JvmField public val STATUS_MATCH_ERROR_INVALID_MATCH_STATE: Int = 0x1966
    @JvmField public val STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE: Int = 0x1964
    @JvmField public val STATUS_MATCH_ERROR_LOCALLY_MODIFIED: Int = 0x196b
    @JvmField public val STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION: Int = 0x1967
    @JvmField public val STATUS_MATCH_NOT_FOUND: Int = 0x196a
    @JvmField public val STATUS_MILESTONE_CLAIMED_PREVIOUSLY: Int = 0x1f40
    @JvmField public val STATUS_MILESTONE_CLAIM_FAILED: Int = 0x1f41
    @JvmField public val STATUS_MULTIPLAYER_DISABLED: Int = 0x1773
    @JvmField public val STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED: Int = 0x1770
    @JvmField public val STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE: Int = 0x1772
    @JvmField public val STATUS_MULTIPLAYER_ERROR_INVALID_OPERATION: Int = 0x1774
    @JvmField public val STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER: Int = 0x1771
    @JvmField public val STATUS_NETWORK_ERROR_NO_DATA: Int = 0x4
    @JvmField public val STATUS_NETWORK_ERROR_OPERATION_DEFERRED: Int = 0x5
    @JvmField public val STATUS_NETWORK_ERROR_OPERATION_FAILED: Int = 0x6
    @JvmField public val STATUS_NETWORK_ERROR_STALE_DATA: Int = 0x3
    @JvmField public val STATUS_OK: Int = 0x0
    @JvmField public val STATUS_OPERATION_IN_FLIGHT: Int = 0x1b5f
    @JvmField public val STATUS_PARTICIPANT_NOT_CONNECTED: Int = 0x1b5b
    @JvmField public val STATUS_QUEST_NOT_STARTED: Int = 0x1f43
    @JvmField public val STATUS_QUEST_NO_LONGER_AVAILABLE: Int = 0x1f42
    @JvmField public val STATUS_REAL_TIME_CONNECTION_FAILED: Int = 0x1b58
    @JvmField public val STATUS_REAL_TIME_INACTIVE_ROOM: Int = 0x1b5d
    @JvmField public val STATUS_REAL_TIME_MESSAGE_SEND_FAILED: Int = 0x1b59
    @JvmField public val STATUS_REAL_TIME_ROOM_NOT_JOINED: Int = 0x1b5c
    @JvmField public val STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS: Int = 0x7d0
    @JvmField public val STATUS_REQUEST_UPDATE_TOTAL_FAILURE: Int = 0x7d1
    @JvmField public val STATUS_SNAPSHOT_COMMIT_FAILED: Int = 0xfa3
    @JvmField public val STATUS_SNAPSHOT_CONFLICT: Int = 0xfa4
    @JvmField public val STATUS_SNAPSHOT_CONFLICT_MISSING: Int = 0xfa6
    @JvmField public val STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE: Int = 0xfa2
    @JvmField public val STATUS_SNAPSHOT_CREATION_FAILED: Int = 0xfa1
    @JvmField public val STATUS_SNAPSHOT_FOLDER_UNAVAILABLE: Int = 0xfa5
    @JvmField public val STATUS_SNAPSHOT_NOT_FOUND: Int = 0xfa0
    @JvmField public val STATUS_TIMEOUT: Int = 0xf

    public @JvmStatic fun getStatusString(statusCode: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         sparse-switch p0, :sswitch_data_0
    //         const-string v0, "Status code (%d) not found!"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :sswitch_0
    //         const-string v0, "STATUS_OK"
    //         goto :goto_0
    //         :sswitch_1
    //         const-string v0, "STATUS_INTERNAL_ERROR"
    //         goto :goto_0
    //         :sswitch_2
    //         const-string v0, "STATUS_CLIENT_RECONNECT_REQUIRED"
    //         goto :goto_0
    //         :sswitch_3
    //         const-string v0, "STATUS_NETWORK_ERROR_STALE_DATA"
    //         goto :goto_0
    //         :sswitch_4
    //         const-string v0, "STATUS_NETWORK_ERROR_NO_DATA"
    //         goto :goto_0
    //         :sswitch_5
    //         const-string v0, "STATUS_NETWORK_ERROR_OPERATION_DEFERRED"
    //         goto :goto_0
    //         :sswitch_6
    //         const-string v0, "STATUS_NETWORK_ERROR_OPERATION_FAILED"
    //         goto :goto_0
    //         :sswitch_7
    //         const-string v0, "STATUS_LICENSE_CHECK_FAILED"
    //         goto :goto_0
    //         :sswitch_8
    //         const-string v0, "STATUS_APP_MISCONFIGURED"
    //         goto :goto_0
    //         :sswitch_9
    //         const-string v0, "STATUS_GAME_NOT_FOUND"
    //         goto :goto_0
    //         :sswitch_a
    //         const-string v0, "STATUS_INTERRUPTED"
    //         goto :goto_0
    //         :sswitch_b
    //         const-string v0, "STATUS_TIMEOUT"
    //         goto :goto_0
    //         :sswitch_c
    //         const-string v0, "STATUS_RESOLVE_STALE_OR_NO_DATA"
    //         goto :goto_0
    //         :sswitch_d
    //         const-string v0, "STATUS_AUTH_ERROR_HARD"
    //         goto :goto_0
    //         :sswitch_e
    //         const-string v0, "STATUS_AUTH_ERROR_USER_RECOVERABLE"
    //         goto :goto_0
    //         :sswitch_f
    //         const-string v0, "STATUS_AUTH_ERROR_UNREGISTERED_CLIENT_ID"
    //         goto :goto_0
    //         :sswitch_10
    //         const-string v0, "STATUS_AUTH_ERROR_API_ACCESS_DENIED"
    //         goto :goto_0
    //         :sswitch_11
    //         const-string v0, "STATUS_PLAYER_OOB_REQUIRED"
    //         goto :goto_0
    //         :sswitch_12
    //         const-string v0, "STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS"
    //         goto :goto_0
    //         :sswitch_13
    //         const-string v0, "STATUS_REQUEST_UPDATE_TOTAL_FAILURE"
    //         goto :goto_0
    //         :sswitch_14
    //         const-string v0, "STATUS_ACHIEVEMENT_UNLOCK_FAILURE"
    //         goto :goto_0
    //         :sswitch_15
    //         const-string v0, "STATUS_ACHIEVEMENT_UNKNOWN"
    //         goto :goto_0
    //         :sswitch_16
    //         const-string v0, "STATUS_ACHIEVEMENT_NOT_INCREMENTAL"
    //         goto :goto_0
    //         :sswitch_17
    //         const-string v0, "STATUS_ACHIEVEMENT_UNLOCKED"
    //         goto :goto_0
    //         :sswitch_18
    //         const-string v0, "STATUS_SNAPSHOT_NOT_FOUND"
    //         goto :goto_0
    //         :sswitch_19
    //         const-string v0, "STATUS_SNAPSHOT_CREATION_FAILED"
    //         goto :goto_0
    //         :sswitch_1a
    //         const-string v0, "STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE"
    //         goto :goto_0
    //         :sswitch_1b
    //         const-string v0, "STATUS_SNAPSHOT_COMMIT_FAILED"
    //         goto :goto_0
    //         :sswitch_1c
    //         const-string v0, "STATUS_SNAPSHOT_CONFLICT"
    //         goto :goto_0
    //         :sswitch_1d
    //         const-string v0, "STATUS_SNAPSHOT_CONFLICT_MISSING"
    //         goto :goto_0
    //         :sswitch_1e
    //         const-string v0, "STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED"
    //         goto :goto_0
    //         :sswitch_1f
    //         const-string v0, "STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER"
    //         goto :goto_0
    //         :sswitch_20
    //         const-string v0, "STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE"
    //         goto :goto_0
    //         :sswitch_21
    //         const-string v0, "STATUS_MULTIPLAYER_DISABLED"
    //         goto :goto_0
    //         :sswitch_22
    //         const-string v0, "STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE"
    //         goto :goto_0
    //         :sswitch_23
    //         const-string v0, "STATUS_MATCH_ERROR_INACTIVE_MATCH"
    //         goto :goto_0
    //         :sswitch_24
    //         const-string v0, "STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION"
    //         goto :goto_0
    //         :sswitch_25
    //         const-string v0, "STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS"
    //         goto :goto_0
    //         :sswitch_26
    //         const-string v0, "STATUS_MATCH_ERROR_ALREADY_REMATCHED"
    //         goto :goto_0
    //         :sswitch_27
    //         const-string v0, "STATUS_MATCH_NOT_FOUND"
    //         goto :goto_0
    //         :sswitch_28
    //         const-string v0, "STATUS_MATCH_ERROR_LOCALLY_MODIFIED"
    //         goto :goto_0
    //         :sswitch_29
    //         const-string v0, "STATUS_REAL_TIME_CONNECTION_FAILED"
    //         goto :goto_0
    //         :sswitch_2a
    //         const-string v0, "STATUS_REAL_TIME_MESSAGE_SEND_FAILED"
    //         goto/16 :goto_0
    //         :sswitch_2b
    //         const-string v0, "STATUS_INVALID_REAL_TIME_ROOM_ID"
    //         goto/16 :goto_0
    //         :sswitch_2c
    //         const-string v0, "STATUS_PARTICIPANT_NOT_CONNECTED"
    //         goto/16 :goto_0
    //         :sswitch_2d
    //         const-string v0, "STATUS_REAL_TIME_ROOM_NOT_JOINED"
    //         goto/16 :goto_0
    //         :sswitch_2e
    //         const-string v0, "STATUS_REAL_TIME_INACTIVE_ROOM"
    //         goto/16 :goto_0
    //         :sswitch_2f
    //         const-string v0, "STATUS_REAL_TIME_SERVICE_NOT_CONNECTED"
    //         goto/16 :goto_0
    //         :sswitch_30
    //         const-string v0, "STATUS_OPERATION_IN_FLIGHT"
    //         goto/16 :goto_0
    //         :sswitch_31
    //         const-string v0, "STATUS_MILESTONE_CLAIMED_PREVIOUSLY"
    //         goto/16 :goto_0
    //         :sswitch_32
    //         const-string v0, "STATUS_MILESTONE_CLAIM_FAILED"
    //         goto/16 :goto_0
    //         :sswitch_33
    //         const-string v0, "STATUS_QUEST_NO_LONGER_AVAILABLE"
    //         goto/16 :goto_0
    //         :sswitch_34
    //         const-string v0, "STATUS_QUEST_NOT_STARTED"
    //         goto/16 :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x4 -> :sswitch_4
    //             0x5 -> :sswitch_5
    //             0x6 -> :sswitch_6
    //             0x7 -> :sswitch_7
    //             0x8 -> :sswitch_8
    //             0x9 -> :sswitch_9
    //             0xe -> :sswitch_a
    //             0xf -> :sswitch_b
    //             0x1f4 -> :sswitch_c
    //             0x3e8 -> :sswitch_d
    //             0x3e9 -> :sswitch_e
    //             0x3ea -> :sswitch_f
    //             0x3eb -> :sswitch_10
    //             0x5dc -> :sswitch_11
    //             0x7d0 -> :sswitch_12
    //             0x7d1 -> :sswitch_13
    //             0xbb8 -> :sswitch_14
    //             0xbb9 -> :sswitch_15
    //             0xbba -> :sswitch_16
    //             0xbbb -> :sswitch_17
    //             0xfa0 -> :sswitch_18
    //             0xfa1 -> :sswitch_19
    //             0xfa2 -> :sswitch_1a
    //             0xfa3 -> :sswitch_1b
    //             0xfa4 -> :sswitch_1c
    //             0xfa6 -> :sswitch_1d
    //             0x1770 -> :sswitch_1e
    //             0x1771 -> :sswitch_1f
    //             0x1772 -> :sswitch_20
    //             0x1773 -> :sswitch_21
    //             0x1964 -> :sswitch_22
    //             0x1965 -> :sswitch_23
    //             0x1967 -> :sswitch_24
    //             0x1968 -> :sswitch_25
    //             0x1969 -> :sswitch_26
    //             0x196a -> :sswitch_27
    //             0x196b -> :sswitch_28
    //             0x1b58 -> :sswitch_29
    //             0x1b59 -> :sswitch_2a
    //             0x1b5a -> :sswitch_2b
    //             0x1b5b -> :sswitch_2c
    //             0x1b5c -> :sswitch_2d
    //             0x1b5d -> :sswitch_2e
    //             0x1b5e -> :sswitch_2f
    //             0x1b5f -> :sswitch_30
    //             0x1f40 -> :sswitch_31
    //             0x1f41 -> :sswitch_32
    //             0x1f42 -> :sswitch_33
    //             0x1f43 -> :sswitch_34
    //         .end sparse-switch
    */

    }
}
