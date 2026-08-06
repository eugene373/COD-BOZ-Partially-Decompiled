package com.ideaworks3d.marmalade

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log

class s3eGooglePlayServices {

    companion object {
        private const val TAG = "s3eGooglePlayServices"
        private var s_Instance: s3eGooglePlayServices? = null

        @JvmStatic
        fun GetInstance(): s3eGooglePlayServices {
            if (s_Instance == null) {
                s_Instance = s3eGooglePlayServices()
            }
            return s_Instance!!
        }
    }

    private var m_Context: Context? = null
    private var m_Activity: Activity? = null

    fun s3eGooglePlayServicesInit(context: Context?): Int {
        m_Context = context
        m_Activity = context as? Activity
        return 0
    }

    fun s3eGooglePlayServicesTerm() {
    }

    fun s3eGooglePlayServicesSetup(clientId: String, requestCode: Int): Int {
        return 0
    }

    fun s3eGooglePlayServicesSignIn(): Int {
        return 0
    }

    fun s3eGooglePlayServicesSignOut(): Int {
        return 0
    }

    fun s3eGooglePlayServicesIsSignedIn(): Boolean {
        return false
    }

    fun s3eGooglePlayServicesUnlockAchievement(achievementId: String): Int {
        return 0
    }

    fun s3eGooglePlayServicesIncrementAchievement(achievementId: String, numSteps: Int): Int {
        return 0
    }

    fun s3eGooglePlayServicesShowAchievements(): Int {
        return 0
    }

    fun s3eGooglePlayServicesSubmitScore(leaderboardId: String, score: Long): Int {
        return 0
    }

    fun s3eGooglePlayServicesShowLeaderboard(leaderboardId: String): Int {
        return 0
    }

    fun s3eGooglePlayServicesShowAllLeaderboards(): Int {
        return 0
    }

    fun s3eGooglePlayServicesOnActivityResult(requestCode: Int, resultCode: Int, data: Intent?): Boolean {
        return false
    }

    fun s3eGooglePlayServicesOnStart() {
    }

    fun s3eGooglePlayServicesOnStop() {
    }

    external fun s3eGooglePlayServicesSignInNotify(result: Int): Unit
}