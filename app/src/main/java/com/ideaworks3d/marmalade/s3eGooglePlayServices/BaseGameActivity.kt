package com.ideaworks3d.marmalade.s3eGooglePlayServices

open class BaseGameActivity() : com.ideaworks3d.marmalade.LoaderActivitySlave(), GameHelper_GameHelperListener {
    protected var mDebugLog: Boolean = false
    protected var mHelper: GameHelper? = null
    protected var mRequestedClients: Int = 0
    protected var m_Service: s3eGooglePlayServices? = null

    protected constructor(p0: Int) : this()

    protected fun beginUserInitiatedSignIn() {
        mHelper?.beginUserInitiatedSignIn()
    }

    protected fun enableDebugLog(p0: Boolean) {}
    protected fun enableDebugLog(p0: Boolean, p1: String) {}

    public fun getApiClient(): Any? {
        val helper = mHelper
        return helper?.getApiClient()
    }

    public fun getGameHelper(): GameHelper? {
        var helper = mHelper
        if (helper == null) {
            val activity = getActivity()
            if (activity != null) {
                helper = GameHelper(activity, mRequestedClients)
                mHelper = helper
            }
        }
        return helper
    }

    protected fun getInvitationId(): String { return "" }
    protected fun getSignInError(): GameHelper_SignInFailureReason? { return null }
    protected fun hasSignInError(): Boolean { return false }

    public fun isSignedIn(): Boolean {
        return false
    }

    override protected fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent?) {
        super.onActivityResult(p0, p1, p2)
    }

    override public fun onCreate(p0: android.os.Bundle?) {
        super.onCreate(p0)
    }

    override public fun onSignInFailed() {}
    override public fun onSignInSucceeded() {}
    override public fun onSignOut() {}

    override public fun onStart() {
        super.onStart()
    }

    override public fun onStop() {
        super.onStop()
    }

    public fun setServiceInterface(p0: s3eGooglePlayServices) {
        m_Service = p0
    }

    protected fun signOut() {
        mHelper?.onStop()
    }
}
