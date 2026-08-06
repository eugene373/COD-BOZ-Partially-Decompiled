package com.ideaworks3d.marmalade

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle

class s3eFacebook {

    companion object {
        private const val TAG = "s3eFacebook"
        private var s_Instance: s3eFacebook? = null

        @JvmStatic
        fun GetInstance(): s3eFacebook {
            if (s_Instance == null) {
                s_Instance = s3eFacebook()
            }
            return s_Instance!!
        }
    }

    private var m_Context: Context? = null
    private var m_Activity: Activity? = null

    fun s3eFacebookInit(context: Context?): Int {
        m_Context = context
        m_Activity = context as? Activity
        return 0
    }

    fun s3eFacebookTerm() {
    }

    fun s3eFacebookLogin(permissions: Array<String>?): Int {
        return 0
    }

    fun s3eFacebookLogout(): Int {
        return 0
    }

    fun s3eFacebookIsLoggedIn(): Boolean {
        return false
    }

    fun s3eFacebookRequest(path: String, params: String?, httpMethod: String?): Int {
        return 0
    }

    fun s3eFacebookDialog(action: String, params: String?): Int {
        return 0
    }

    fun s3eFacebookOnActivityResult(requestCode: Int, resultCode: Int, data: Intent?): Boolean {
        return false
    }

    fun s3eFacebookOnResume() {
    }

    fun s3eFacebookOnPause() {
    }

    fun s3eFacebookOnDestroy() {
    }

    fun s3eFacebookOnSaveInstanceState(bundle: Bundle) {
    }

    external fun s3eFacebookLoginNotify(result: Int): Unit
    external fun s3eFacebookRequestNotify(json: String, error: String): Unit
    external fun s3eFacebookDialogNotify(success: Boolean, json: String): Unit
}