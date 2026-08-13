package com.ideaworks3d.marmalade.s3eGooglePlayServices

open class GameHelper() {
    var mActivity: android.app.Activity? = null
    var mAppContext: android.content.Context? = null
    var mConnectOnStart: Boolean = false
    private var mConnecting: Boolean = false
    var mDebugLog: Boolean = false
    var mExpectingResolution: Boolean = false
    var mGoogleApiClient: Any? = null
    var mGoogleApiClientBuilder: Any? = null
    var mHandler: android.os.Handler? = null
    var mInvitation: Any? = null
    var mListener: GameHelper_GameHelperListener? = null
    var mMaxAutoSignInAttempts: Int = 0
    var mPlusApiOptions: Any? = null
    var mRequestedClients: Int = 0
    var mRequests: java.util.ArrayList<Any?>? = null
    private var mSetupDone: Boolean = false
    var mShowErrorDialogs: Boolean = false
    var mSignInCancelled: Boolean = false
    var mSignInFailureReason: GameHelper_SignInFailureReason? = null
    var mTurnBasedMatch: Any? = null
    var mUserInitiatedSignIn: Boolean = false

    public constructor(p0: android.app.Activity, p1: Int) : this() {
        this.mActivity = p0
        this.mRequestedClients = p1
    }

    fun beginUserInitiatedSignIn() {}
    fun enableDebugLog(p0: Boolean) {}
    fun getApiClient(): Any? = null
    fun getInvitationId(): String = ""
    fun getSignInError(): GameHelper_SignInFailureReason? = null
    fun hasSignInError(): Boolean = false
    fun isSignedIn(): Boolean = false
    fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent?) {}
    fun onStart(p0: android.app.Activity) {}
    fun onStop() {}
    fun setGamesApiOptions(p0: Any?) {}
    fun setup(p0: GameHelper_GameHelperListener?) {}
}
