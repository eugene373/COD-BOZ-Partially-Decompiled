package com.google.android.gms.games.multiplayer.turnbased

// Auto-emitted from smali.
// 0 fields, 24 methods.

interface TurnBasedMultiplayer {
    public fun acceptInvitation(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun cancelMatch(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun createMatch(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig): com.google.android.gms.common.api.PendingResult

    public fun declineInvitation(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String)

    public fun dismissInvitation(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String)

    public fun dismissMatch(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String)

    public fun finishMatch(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun finishMatch(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: ByteArray, p3: java.util.List): com.google.android.gms.common.api.PendingResult

    public fun finishMatch(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: ByteArray, p3: Array<com.google.android.gms.games.multiplayer.ParticipantResult>): com.google.android.gms.common.api.PendingResult

    public fun getInboxIntent(p0: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent

    public fun getMaxMatchDataSize(p0: com.google.android.gms.common.api.GoogleApiClient): Int

    public fun getSelectOpponentsIntent(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: Int): android.content.Intent

    public fun getSelectOpponentsIntent(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: Int, p3: Boolean): android.content.Intent

    public fun leaveMatch(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun leaveMatchDuringTurn(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: String): com.google.android.gms.common.api.PendingResult

    public fun loadMatch(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun loadMatchesByStatus(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: IntArray): com.google.android.gms.common.api.PendingResult

    public fun loadMatchesByStatus(p0: com.google.android.gms.common.api.GoogleApiClient, p1: IntArray): com.google.android.gms.common.api.PendingResult

    public fun registerMatchUpdateListener(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener)

    public fun rematch(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun takeTurn(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: ByteArray, p3: String): com.google.android.gms.common.api.PendingResult

    public fun takeTurn(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: ByteArray, p3: String, p4: java.util.List): com.google.android.gms.common.api.PendingResult

    public fun takeTurn(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: ByteArray, p3: String, p4: Array<com.google.android.gms.games.multiplayer.ParticipantResult>): com.google.android.gms.common.api.PendingResult

    public fun unregisterMatchUpdateListener(p0: com.google.android.gms.common.api.GoogleApiClient)

}
