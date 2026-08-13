package com.ideaworks3d.marmalade.s3eGooglePlayServices

open class s3eGooglePlayServices : s3eGooglePlayServicesInterface {
    var mHashIdToParticipMap: java.util.HashMap<Any?, Any?>? = null
    var mMyDisplayName: String? = ""
    var mMyEmail: String? = ""
    var mMyId: String? = ""
    var mParticipants: java.util.ArrayList<Any?>? = null
    var mPlayerHashIds: java.util.ArrayList<Any?>? = null
    var mRoomId: String? = ""
    var m_PretendActivity: s3eGooglePlayServicesActivity? = null
    var m_maxAutoMatchPlayers: Int = 0
    var m_minAutoMatchPlayers: Int = 0

    fun broadcastMyHashId() {}
    fun createMatchMaking() {}
    override fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent?): Boolean = false
    fun s3eGooglePlayLeaveRoom() {}
    fun s3eGooglePlayLocalPlayerID(): String = ""
    fun s3eGooglePlayLocalPlayerName(): String = ""
    fun s3eGooglePlayMatchMakingInvitePlayers(): Boolean = false
    fun s3eGooglePlayMatchMakingSubscribeOnInvitation(): Boolean = false
    fun s3eGooglePlayPlayerCount(): Int = 0
    fun s3eGooglePlayPlayerId(p0: Int): String = ""
    fun s3eGooglePlayServicesIncrementAchievement(p0: String, p1: Int, p2: Boolean): Boolean = false
    fun s3eGooglePlayServicesLoadAchievements(): Boolean = false
    fun s3eGooglePlayServicesLoadCurrentPlayerLeaderboardScore(p0: String, p1: Int, p2: Int): Boolean = false
    fun s3eGooglePlayServicesLoadPlayerCenteredScores(p0: String, p1: Int, p2: Int, p3: Int, p4: Boolean): Boolean = false
    fun s3eGooglePlayServicesLoadTopScores(p0: String, p1: Int, p2: Int, p3: Int, p4: Boolean): Boolean = false
    fun s3eGooglePlayServicesRevealAchievement(p0: String, p1: Boolean): Boolean = false
    fun s3eGooglePlayServicesShowAchievements(): Boolean = false
    fun s3eGooglePlayServicesShowAllLeaderboards(): Boolean = false
    fun s3eGooglePlayServicesShowLeaderboard(p0: String): Boolean = false
    fun s3eGooglePlayServicesSignIn() {}
    fun s3eGooglePlayServicesSignOut() {}
    fun s3eGooglePlayServicesSubmitScore(p0: String, p1: Int, p2: Boolean): Boolean = false
    fun s3eGooglePlayServicesUnlockAchievement(p0: String, p1: Boolean): Boolean = false

    companion object {
        val RC_INVITATION_INBOX: Int = 0x2711
        val RC_SELECT_PLAYERS: Int = 0x2710
        val RC_WAITING_ROOM: Int = 0x2712
        var m_IncomingInvitationId: String? = null
    }
}
