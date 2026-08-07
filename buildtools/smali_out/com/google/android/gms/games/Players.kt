package com.google.android.gms.games

// Auto-emitted from smali.
// 1 fields, 9 methods.

interface Players {
    public fun getCurrentPlayer(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.games.Player

    public fun getCurrentPlayerId(p0: com.google.android.gms.common.api.GoogleApiClient): String

    public fun getPlayerSearchIntent(p0: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent

    public fun loadConnectedPlayers(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Boolean): com.google.android.gms.common.api.PendingResult

    public fun loadInvitablePlayers(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: Boolean): com.google.android.gms.common.api.PendingResult

    public fun loadMoreInvitablePlayers(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int): com.google.android.gms.common.api.PendingResult

    public fun loadMoreRecentlyPlayedWithPlayers(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int): com.google.android.gms.common.api.PendingResult

    public fun loadPlayer(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun loadRecentlyPlayedWithPlayers(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: Boolean): com.google.android.gms.common.api.PendingResult

    companion object {
    @JvmField public val EXTRA_PLAYER_SEARCH_RESULTS: String = "player_search_results"
    }
}
