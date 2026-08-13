package com.ideaworks3d.marmalade.s3eGooglePlayServices

open class s3eGooglePlayServicesActivity : BaseGameActivity() {

    fun incrementAchievement(p0: String, p1: Int, p2: Boolean): Boolean = false
    fun loadAchievements(): Boolean = false
    fun loadCurrentPlayerLeaderboardScore(p0: String, p1: Int, p2: Int): Boolean = false
    fun loadPlayerCenteredScores(p0: String, p1: Int, p2: Int, p3: Int, p4: Boolean): Boolean = false
    fun loadTopScores(p0: String, p1: Int, p2: Int, p3: Int, p4: Boolean): Boolean = false

    override fun onCreate(p0: android.os.Bundle?) {
        android.util.Log.v("s3eGooglePlayGamesActivity", "onCreate stub called")
        singleton = this
        super.onCreate(p0)
    }

    override fun onSignInFailed() {
        android.util.Log.v("s3eGooglePlayGamesActivity", "onSignInFailed stub called")
    }

    override fun onSignInSucceeded() {
        android.util.Log.v("s3eGooglePlayGamesActivity", "onSignInSucceeded stub called")
    }

    override fun onSignOut() {
        android.util.Log.v("s3eGooglePlayGamesActivity", "onSignOut stub called")
    }

    override fun onStart() {
        super.onStart()
    }

    fun revealAchievement(p0: String, p1: Boolean): Boolean = false
    fun showAchievements(): Boolean = false
    fun showAllLeaderboards(): Boolean = false
    fun showLeaderboard(p0: String): Boolean = false
    fun showMatchMakingInvitePlayersDialog(p0: Int, p1: Int, p2: Int): Boolean = false
    fun showMatchMakingInvitingListDialog(p0: Int): Boolean = false
    fun startActivityForResult_transfer(p0: android.content.Intent, p1: Int) {}
    fun submitScore(p0: String, p1: Int, p2: Boolean): Boolean = false
    fun unlockAchievement(p0: String, p1: Boolean): Boolean = false

    companion object {
        private val RC_RESOLVE: Int = 0x1388
        private val RC_UNUSED: Int = 0x1389
        private var S3EGOOGLEPLAYSERVICES_ERROR_LOAD_ACHIEVEMENTS: Int = 0
        private var S3EGOOGLEPLAYSERVICES_ERROR_LOAD_CURRENT_PLAYER_LEADERBOARD_SCORE: Int = 0
        private var S3EGOOGLEPLAYSERVICES_ERROR_LOAD_PLAYER_CENTERED_SCORES: Int = 0
        private var S3EGOOGLEPLAYSERVICES_ERROR_LOAD_TOP_SCORES: Int = 0
        private var S3EGOOGLEPLAYSERVICES_ERROR_SIGNING_IN: Int = 0
        private var S3EGOOGLEPLAYSERVICES_ERROR_SUBMIT_SCORE: Int = 0
        @JvmField public var singleton: s3eGooglePlayServicesActivity? = null

        @JvmStatic fun native_AchievementRevealedCallback(p0: String) {}
        @JvmStatic fun native_AchievementUnlockedCallback(p0: String) {}
        @JvmStatic fun native_AchievementsLoadedCallback(p0: Array<s3eGooglePlayAchievement>) {}
        @JvmStatic fun native_CurrentPlayerLeaderboardScoreLoadedCallback(p0: s3eGooglePlayLeaderboardScore) {}
        @JvmStatic fun native_ErrorCallback(p0: Int) {}
        @JvmStatic fun native_PlayerCenteredScoresLoadedCallback(p0: s3eGooglePlayLeaderboard) {}
        @JvmStatic fun native_ScoreSubmittedCallback(p0: String) {}
        @JvmStatic fun native_SignInCallback() {}
        @JvmStatic fun native_SignOutCallback() {}
        @JvmStatic fun native_TopScoresLoadedCallback(p0: s3eGooglePlayLeaderboard) {}
    }
}
