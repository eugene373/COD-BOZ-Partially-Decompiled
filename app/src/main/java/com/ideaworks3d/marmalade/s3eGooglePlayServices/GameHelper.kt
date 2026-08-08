package com.ideaworks3d.marmalade.s3eGooglePlayServices

// Auto-emitted from smali source: GameHelper.java.
// 37 fields, 56 methods.

open class GameHelper() {
    private val GAMEHELPER_SHARED_PREFS: String? = null
    private val KEY_SIGN_IN_CANCELLATIONS: String? = null
    var mActivity: android.app.Activity? = null
    var mAppContext: android.content.Context? = null
    var mAppStateApiOptions: com.google.android.gms.common.api.Api.ApiOptions.NoOptions? = null
    var mConnectOnStart: Boolean = false
    private var mConnecting: Boolean = false
    var mConnectionResult: com.google.android.gms.common.ConnectionResult? = null
    var mDebugLog: Boolean = false
    var mExpectingResolution: Boolean = false
    var mGamesApiOptions: com.google.android.gms.games.Games.GamesOptions? = null
    var mGoogleApiClient: com.google.android.gms.common.api.GoogleApiClient? = null
    var mGoogleApiClientBuilder: com.google.android.gms.common.api.GoogleApiClient.Builder? = null
    var mHandler: android.os.Handler? = null
    var mInvitation: com.google.android.gms.games.multiplayer.Invitation? = null
    var mListener: com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper_GameHelperListener? = null
    var mMaxAutoSignInAttempts: Int = 0
    var mPlusApiOptions: com.google.android.gms.plus.Plus.PlusOptions? = null
    var mRequestedClients: Int = 0
    var mRequests: java.util.ArrayList<Any?>? = null
    private var mSetupDone: Boolean = false
    var mShowErrorDialogs: Boolean = false
    var mSignInCancelled: Boolean = false
    var mSignInFailureReason: com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper_SignInFailureReason? = null
    var mTurnBasedMatch: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch? = null
    var mUserInitiatedSignIn: Boolean = false

    public constructor(p0: android.app.Activity, p1: Int) : this()

    private fun doApiOptionsPreCheck() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         if-eqz v0, :cond_0
    //         const-string v0, "GameHelper: you cannot call set*ApiOptions after the client builder has been created. Call it before calling createApiClientBuilder() or setup()."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         return-void
    */

    fun assertConfigured(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSetupDone:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "GameHelper error: Operation attempted without setup: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ". The setup() method must be called before attempting any other operation."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         return-void
    */

    public fun beginUserInitiatedSignIn() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x1
    //         const-string v0, "beginUserInitiatedSignIn: resetting attempt count."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->resetSignInCancellations()V
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInCancelled:Z
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "beginUserInitiatedSignIn() called when already connected. Calling listener directly to notify of success."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logWarn(Ljava/lang/String;)V
    //         invoke-virtual {p0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         if-eqz v0, :cond_1
    //         const-string v0, "beginUserInitiatedSignIn() called when already connecting. Be patient! You can only call this method after you get an onSignInSucceeded() or onSignInFailed() callback. Suggestion: disable the sign-in button on startup and also when it\'s clicked, and re-enable when you get the callback."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logWarn(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "Starting USER-INITIATED sign-in flow."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mUserInitiatedSignIn:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;
    //         if-eqz v0, :cond_2
    //         const-string v0, "beginUserInitiatedSignIn: continuing pending sign-in flow."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->resolveConnectionResult()V
    //         goto :goto_0
    //         :cond_2
    //         const-string v0, "beginUserInitiatedSignIn: starting new sign-in flow."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->connect()V
    //         goto :goto_0
    */

    public fun clearInvitation() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;
    //         return-void
    */

    public fun clearRequests() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;
    //         return-void
    */

    public fun clearTurnBasedMatch() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //         return-void
    */

    fun connect() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "Already connected."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "Starting connection."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;
    //         iput-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V
    //         goto :goto_0
    */

    public fun createApiClientBuilder(): com.google.android.gms.common.api.GoogleApiClient.Builder? { return null }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSetupDone:Z
    //         if-eqz v0, :cond_0
    //         const-string v0, "GameHelper: you called GameHelper.createApiClientBuilder() after calling setup. You can only get a client builder BEFORE performing setup."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;
    //         invoke-direct {v0, v1, p0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I
    //         and-int/lit8 v1, v1, 0x1
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGamesApiOptions:Lcom/google/android/gms/games/Games$GamesOptions;
    //         if-eqz v1, :cond_5
    //         sget-object v1, Lcom/google/android/gms/games/Games;->API:Lcom/google/android/gms/common/api/Api;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGamesApiOptions:Lcom/google/android/gms/games/Games$GamesOptions;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         :goto_0
    //         sget-object v1, Lcom/google/android/gms/games/Games;->SCOPE_GAMES:Lcom/google/android/gms/common/api/Scope;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         :cond_1
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I
    //         and-int/lit8 v1, v1, 0x2
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mPlusApiOptions:Lcom/google/android/gms/plus/Plus$PlusOptions;
    //         if-eqz v1, :cond_6
    //         sget-object v1, Lcom/google/android/gms/plus/Plus;->API:Lcom/google/android/gms/common/api/Api;
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mPlusApiOptions:Lcom/google/android/gms/plus/Plus$PlusOptions;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         :goto_1
    //         sget-object v1, Lcom/google/android/gms/plus/Plus;->SCOPE_PLUS_LOGIN:Lcom/google/android/gms/common/api/Scope;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         :cond_2
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I
    //         and-int/lit8 v1, v1, 0x4
    //         if-eqz v1, :cond_3
    //         sget-object v1, Lcom/google/android/gms/appstate/AppStateManager;->API:Lcom/google/android/gms/common/api/Api;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         sget-object v1, Lcom/google/android/gms/appstate/AppStateManager;->SCOPE_APP_STATE:Lcom/google/android/gms/common/api/Scope;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         :cond_3
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I
    //         and-int/lit8 v1, v1, 0x8
    //         if-eqz v1, :cond_4
    //         sget-object v1, Lcom/google/android/gms/drive/Drive;->SCOPE_APPFOLDER:Lcom/google/android/gms/common/api/Scope;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addScope(Lcom/google/android/gms/common/api/Scope;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         sget-object v1, Lcom/google/android/gms/drive/Drive;->API:Lcom/google/android/gms/common/api/Api;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         :cond_4
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         return-object v0
    //         :cond_5
    //         sget-object v1, Lcom/google/android/gms/games/Games;->API:Lcom/google/android/gms/common/api/Api;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         goto :goto_0
    //         :cond_6
    //         sget-object v1, Lcom/google/android/gms/plus/Plus;->API:Lcom/google/android/gms/common/api/Api;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         goto :goto_1
    */

    fun debugLog(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "GameHelper"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "GameHelper: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun disconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "Disconnecting client."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "GameHelper"
    //         const-string v1, "disconnect() called when client was already disconnected."
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public fun enableDebugLog(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mDebugLog:Z
    //         if-eqz p1, :cond_0
    //         const-string v0, "Debug log enabled."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    public fun enableDebugLog(p0: Boolean, p1: String) { /* TODO(body): (ZLjava/lang/String;)V */ }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "GameHelper"
    //         const-string v1, "GameHelper.enableDebugLog(boolean,String) is deprecated. Use GameHelper.enableDebugLog(boolean)"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->enableDebugLog(Z)V
    //         return-void
    */

    public fun getApiClient(): com.google.android.gms.common.api.GoogleApiClient? { return null }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "No GoogleApiClient. Did you call setup()?"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         return-object v0
    */

    public fun getInvitation(): com.google.android.gms.games.multiplayer.Invitation? { return null }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "GameHelper"
    //         const-string v1, "Warning: getInvitation() should only be called when signed in, that is, after getting onSignInSuceeded()"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;
    //         return-object v0
    */

    public fun getInvitationId(): String { return "" }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "GameHelper"
    //         const-string v1, "Warning: getInvitationId() should only be called when signed in, that is, after getting onSignInSuceeded()"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getRequests(): java.util.ArrayList<Any?>? { return null }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/games/request/GameRequest;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "GameHelper"
    //         const-string v1, "Warning: getRequests() should only be called when signed in, that is, after getting onSignInSuceeded()"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;
    //         return-object v0
    */

    fun getSignInCancellations(): Int { return 0 }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;
    //         const-string v1, "GAMEHELPER_SHARED_PREFS"
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         const-string v1, "KEY_SIGN_IN_CANCELLATIONS"
    //         invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
    //         move-result v0
    //         return v0
    */

    public fun getSignInError(): com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper_SignInFailureReason? { return null }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         return-object v0
    */

    public fun getTurnBasedMatch(): com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch? { return null }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "GameHelper"
    //         const-string v1, "Warning: getTurnBasedMatch() should only be called when signed in, that is, after getting onSignInSuceeded()"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //         return-object v0
    */

    fun giveUp(p0: com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper_SignInFailureReason) { /* TODO(body): (Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->disconnect()V
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         iget v0, p1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->mActivityResultCode:I
    //         const/16 v1, 0x2714
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->printMisconfiguredDebugInfo(Landroid/content/Context;)V
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->showFailureDialog()V
    //         iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V
    //         return-void
    */

    public fun hasInvitation(): Boolean { return false }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun hasRequests(): Boolean { return false }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun hasSignInError(): Boolean { return false }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun hasTurnBasedMatch(): Boolean { return false }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun incrementSignInCancellations(): Int { return 0 }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getSignInCancellations()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;
    //         const-string v2, "GAMEHELPER_SHARED_PREFS"
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v1
    //         invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v1
    //         const-string v2, "KEY_SIGN_IN_CANCELLATIONS"
    //         add-int/lit8 v3, v0, 0x1
    //         invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //         invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    //         add-int/lit8 v0, v0, 0x1
    //         return v0
    */

    public fun isConnecting(): Boolean { return false }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         return v0
    */

    public fun isSignedIn(): Boolean { return false }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun logError(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "GameHelper"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "*** GameHelper ERROR: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    fun logWarn(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "GameHelper"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "!!! GameHelper WARNING: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun makeSimpleDialog(p0: String): android.app.Dialog? { return null }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;
    //         if-nez v0, :cond_0
    //         const-string v0, "*** makeSimpleDialog failed: no current Activity!"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;
    //         invoke-static {v0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun makeSimpleDialog(p0: String, p1: String): android.app.Dialog? { return null }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;
    //         if-nez v0, :cond_0
    //         const-string v0, "*** makeSimpleDialog failed: no current Activity!"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;
    //         invoke-static {v0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;
    //         move-result-object v0
    //         goto :goto_0
    */

    fun notifyListener(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Notifying LISTENER of sign-in "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         if-eqz p1, :cond_1
    //         const-string v0, "SUCCESS"
    //         :goto_0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;
    //         if-eqz v0, :cond_0
    //         if-eqz p1, :cond_3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;
    //         invoke-interface {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;->onSignInSucceeded()V
    //         :cond_0
    //         :goto_1
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         if-eqz v0, :cond_2
    //         const-string v0, "FAILURE (error)"
    //         goto :goto_0
    //         :cond_2
    //         const-string v0, "FAILURE (no error)"
    //         goto :goto_0
    //         :cond_3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;
    //         invoke-interface {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;->onSignInFailed()V
    //         goto :goto_1
    */

    fun notifyListenerOfSignOut() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const-string v0, "Notifying LISTENER of sign-out"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;
    //         invoke-interface {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;->onSignOut()V
    //         :cond_0
    //         return-void
    */

    public fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 6
    //         const/16 v5, 0x2711
    //         const/16 v3, 0x2329
    //         const/4 v4, 0x0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "onActivityResult: req="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         if-ne p1, v3, :cond_1
    //         const-string v0, "RC_RESOLVE"
    //         :goto_0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", resp="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-static {p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->activityResponseCodeToString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         const-string v1, "GameHelper"
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onActivityResult: req="
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         if-ne p1, v3, :cond_2
    //         const-string v0, "RC_RESOLVE"
    //         :goto_1
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, ", resp="
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-static {p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->activityResponseCodeToString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         if-ne p2, v5, :cond_3
    //         const/16 v0, 0x232a
    //         if-eq p1, v0, :cond_0
    //         const/16 v0, 0x1389
    //         if-ne p1, v0, :cond_3
    //         :cond_0
    //         const-string v0, "onActivityResult: external signout?"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         const-string v0, "onActivityResult: signOut detected."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListenerOfSignOut()V
    //         :goto_2
    //         return-void
    //         :cond_1
    //         invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_3
    //         if-eq p1, v3, :cond_4
    //         const-string v0, "onActivityResult: request code not meant for us. Ignoring."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         goto :goto_2
    //         :cond_4
    //         iput-boolean v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mExpectingResolution:Z
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         if-nez v0, :cond_5
    //         const-string v0, "onActivityResult: ignoring because we are not connecting."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         goto :goto_2
    //         :cond_5
    //         const/4 v0, -0x1
    //         if-ne p2, v0, :cond_6
    //         const-string v0, "onAR: Resolution was RESULT_OK, so connecting current client again."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->connect()V
    //         goto :goto_2
    //         :cond_6
    //         if-ne p2, v5, :cond_7
    //         const-string v0, "onAR: Resolution was RECONNECT_REQUIRED, so reconnecting."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->connect()V
    //         goto :goto_2
    //         :cond_7
    //         if-nez p2, :cond_8
    //         const-string v0, "onAR: Got a cancellation result, so disconnecting."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInCancelled:Z
    //         iput-boolean v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z
    //         iput-boolean v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mUserInitiatedSignIn:Z
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         iput-boolean v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getSignInCancellations()I
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->incrementSignInCancellations()I
    //         move-result v1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "onAR: # of cancellations "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, " --> "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", max "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mMaxAutoSignInAttempts:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         invoke-virtual {p0, v4}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V
    //         goto/16 :goto_2
    //         :cond_8
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "onAR: responseCode="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-static {p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->activityResponseCodeToString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", so giving up."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I
    //         move-result v1
    //         invoke-direct {v0, v1, p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;-><init>(II)V
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->giveUp(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;)V
    //         goto/16 :goto_2
    */

    public fun onConnected(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "onConnected: connected!"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         if-eqz p1, :cond_2
    //         const-string v0, "onConnected: connection hint provided. Checking for invite."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         const-string v0, "invitation"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Invitation;
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         const-string v1, "onConnected: connection hint has a room invite!"
    //         invoke-virtual {p0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Invitation ID: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mInvitation:Lcom/google/android/gms/games/multiplayer/Invitation;
    //         invoke-interface {v1}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Requests:Lcom/google/android/gms/games/request/Requests;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/games/request/Requests;->getGameRequestsFromBundle(Landroid/os/Bundle;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "onConnected: connection hint has "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequests:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " request(s)"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         :cond_1
    //         const-string v0, "onConnected: connection hint provided. Checking for TBMP game."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         const-string v0, "turn_based_match"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mTurnBasedMatch:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->succeedSignIn()V
    //         return-void
    */

    public fun onConnectionFailed(p0: com.google.android.gms.common.ConnectionResult) { /* TODO(body): (Lcom/google/android/gms/common/ConnectionResult;)V */ }
    /*
    //         .locals 5
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         const-string v2, "onConnectionFailed"
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;
    //         const-string v2, "Connection failure:"
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "   - code: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {v3}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I
    //         move-result v3
    //         invoke-static {v3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->errorCodeToString(I)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "   - resolvable: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {v3}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z
    //         move-result v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "   - details: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {v3}, Lcom/google/android/gms/common/ConnectionResult;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getSignInCancellations()I
    //         move-result v2
    //         iget-boolean v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mUserInitiatedSignIn:Z
    //         if-eqz v3, :cond_0
    //         const-string v2, "onConnectionFailed: WILL resolve because user initiated sign-in."
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         :goto_0
    //         if-nez v0, :cond_3
    //         const-string v0, "onConnectionFailed: since we won\'t resolve, failing now."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         invoke-virtual {p0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V
    //         :goto_1
    //         return-void
    //         :cond_0
    //         iget-boolean v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInCancelled:Z
    //         if-eqz v3, :cond_1
    //         const-string v0, "onConnectionFailed WILL NOT resolve (user already cancelled once)."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         move v0, v1
    //         goto :goto_0
    //         :cond_1
    //         iget v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mMaxAutoSignInAttempts:I
    //         if-ge v2, v3, :cond_2
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "onConnectionFailed: WILL resolve because we have below the max# of attempts, "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " < "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mMaxAutoSignInAttempts:I
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "onConnectionFailed: Will NOT resolve; not user-initiated and max attempts reached: "
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, " >= "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mMaxAutoSignInAttempts:I
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         const-string v0, "onConnectionFailed: resolving problem..."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->resolveConnectionResult()V
    //         goto :goto_1
    */

    public fun onConnectionSuspended(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "onConnectionSuspended, cause="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->disconnect()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         const-string v0, "Making extraordinary call to onSignInFailed callback"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V
    //         return-void
    */

    public fun onStart(p0: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 4
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;
    //         invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;
    //         const-string v0, "onStart"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         const-string v0, "onStart"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->assertConfigured(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "GameHelper"
    //         const-string v1, "GameHelper: client was already connected on onStart()"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "Connecting client."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "Not attempting to connect because mConnectOnStart=false"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         const-string v0, "Instead, reporting a sign-in failure."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mHandler:Landroid/os/Handler;
    //         new-instance v1, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$1;
    //         invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$1;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;)V
    //         const-wide/16 v2, 0x3e8
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         goto :goto_0
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         const-string v0, "onStop"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         const-string v0, "onStop"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->assertConfigured(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "Disconnecting client due to onStop"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V
    //         :goto_0
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mExpectingResolution:Z
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;
    //         return-void
    //         :cond_0
    //         const-string v0, "Client already disconnected when we got onStop."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun reconnectClient() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "GameHelper"
    //         const-string v1, "reconnectClient() called when client is not connected."
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->connect()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "Reconnecting client."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->reconnect()V
    //         goto :goto_0
    */

    fun resetSignInCancellations() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppContext:Landroid/content/Context;
    //         const-string v1, "GAMEHELPER_SHARED_PREFS"
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         const-string v1, "KEY_SIGN_IN_CANCELLATIONS"
    //         invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    //         invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    //         return-void
    */

    fun resolveConnectionResult() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mExpectingResolution:Z
    //         if-eqz v0, :cond_0
    //         const-string v0, "We\'re already expecting the result of a previous resolution."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;
    //         if-nez v0, :cond_1
    //         const-string v0, "No need to resolve issue, activity does not exist anymore"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "resolveConnectionResult: trying to resolve result: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const-string v0, "Result has resolution. Starting it."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         const/4 v0, 0x1
    //         :try_start_0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mExpectingResolution:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;
    //         const/16 v2, 0x2329
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;->startResolutionForResult(Landroid/app/Activity;I)V
    //         :try_end_0
    //         .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "SendIntentException, so connecting again."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->connect()V
    //         goto :goto_0
    //         :cond_2
    //         const-string v0, "resolveConnectionResult: result has no resolution. Giving up."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectionResult:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I
    //         move-result v1
    //         invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;-><init>(I)V
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->giveUp(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;)V
    //         goto :goto_0
    */

    public fun setAppStateApiOptions(p0: com.google.android.gms.common.api.Api.ApiOptions.NoOptions) { /* TODO(body): (Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->doApiOptionsPreCheck()V
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mAppStateApiOptions:Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;
    //         return-void
    */

    public fun setConnectOnStart(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Forcing mConnectOnStart="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z
    //         return-void
    */

    public fun setGamesApiOptions(p0: com.google.android.gms.games.Games.GamesOptions) { /* TODO(body): (Lcom/google/android/gms/games/Games$GamesOptions;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->doApiOptionsPreCheck()V
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGamesApiOptions:Lcom/google/android/gms/games/Games$GamesOptions;
    //         return-void
    */

    public fun setMaxAutoSignInAttempts(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mMaxAutoSignInAttempts:I
    //         return-void
    */

    public fun setPlusApiOptions(p0: com.google.android.gms.plus.Plus.PlusOptions) { /* TODO(body): (Lcom/google/android/gms/plus/Plus$PlusOptions;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->doApiOptionsPreCheck()V
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mPlusApiOptions:Lcom/google/android/gms/plus/Plus$PlusOptions;
    //         return-void
    */

    public fun setShowErrorDialogs(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mShowErrorDialogs:Z
    //         return-void
    */

    public fun setup(p0: com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper_GameHelperListener) { /* TODO(body): (Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;)V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSetupDone:Z
    //         if-eqz v0, :cond_0
    //         const-string v0, "GameHelper: you cannot call GameHelper.setup() more than once!"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->logError(Ljava/lang/String;)V
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mListener:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Setup: requested clients: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         if-nez v0, :cond_1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->createApiClientBuilder()Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;
    //         invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->setViewForPopups(Landroid/view/View;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClientBuilder:Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSetupDone:Z
    //         return-void
    */

    public fun showFailureDialog() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->getServiceErrorCode()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;->getActivityResultCode()I
    //         move-result v1
    //         iget-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mShowErrorDialogs:Z
    //         if-eqz v2, :cond_1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mActivity:Landroid/app/Activity;
    //         invoke-static {v2, v1, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->showFailureDialog(Landroid/app/Activity;II)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Not showing error dialog because mShowErrorDialogs==false. Error was: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun signOut() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "signOut: was already disconnected, ignoring."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListenerOfSignOut()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I
    //         and-int/lit8 v0, v0, 0x2
    //         if-eqz v0, :cond_1
    //         const-string v0, "Clearing default account on PlusClient."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         sget-object v0, Lcom/google/android/gms/plus/Plus;->AccountApi:Lcom/google/android/gms/plus/Account;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/plus/Account;->clearDefaultAccount(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    //         :cond_1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mRequestedClients:I
    //         and-int/lit8 v0, v0, 0x1
    //         if-eqz v0, :cond_2
    //         const-string v0, "Signing out from the Google API Client."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-static {v0}, Lcom/google/android/gms/games/Games;->signOut(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    //         :cond_2
    //         const-string v0, "Disconnecting client."
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z
    //         iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V
    //         goto :goto_0
    */

    fun succeedSignIn() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         const/4 v1, 0x0
    //         const-string v0, "succeedSignIn"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->debugLog(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mSignInFailureReason:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnectOnStart:Z
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mUserInitiatedSignIn:Z
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->mConnecting:Z
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->notifyListener(Z)V
    //         return-void
    */

    companion object {
    @JvmField public val CLIENT_ALL: Int = 0xf
    @JvmField public val CLIENT_APPSTATE: Int = 0x4
    @JvmField public val CLIENT_GAMES: Int = 0x1
    @JvmField public val CLIENT_NONE: Int = 0x0
    @JvmField public val CLIENT_PLUS: Int = 0x2
    @JvmField public val CLIENT_SNAPSHOT: Int = 0x8
    val DEFAULT_MAX_SIGN_IN_ATTEMPTS: Int = 0x3
    val RC_RESOLVE: Int = 0x2329
    val RC_UNUSED: Int = 0x232a
    val RC_UNUSED_ALT: Int = 0x1389
    val TAG: String = "GameHelper"

    @JvmStatic fun makeSimpleDialog(p0: android.app.Activity, p1: String): android.app.Dialog? { return null }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/app/AlertDialog$Builder;
    //         invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
    //         invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         const v1, 0x104000a
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun makeSimpleDialog(p0: android.app.Activity, p1: String, p2: String): android.app.Dialog? { return null }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/app/AlertDialog$Builder;
    //         invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
    //         invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         const v1, 0x104000a
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun showFailureDialog(p0: android.app.Activity, p1: Int, p2: Int) { /* TODO(body): (Landroid/app/Activity;II)V */ }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const-string v0, "GameHelper"
    //         const-string v1, "*** No Activity. Can\'t show failure dialog!"
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         packed-switch p1, :pswitch_data_0
    //         const/16 v0, 0x232a
    //         const/4 v1, 0x0
    //         invoke-static {p2, p0, v0, v1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->getErrorDialog(ILandroid/app/Activity;ILandroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         const-string v0, "GameHelper"
    //         const-string v1, "No standard error dialog available. Making fallback dialog."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const/4 v1, 0x0
    //         invoke-static {p0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-static {p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->errorCodeToString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;
    //         move-result-object v0
    //         :cond_1
    //         :goto_1
    //         invoke-virtual {v0}, Landroid/app/Dialog;->show()V
    //         goto :goto_0
    //         :pswitch_0
    //         const/4 v0, 0x2
    //         invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;
    //         move-result-object v0
    //         goto :goto_1
    //         :pswitch_1
    //         const/4 v0, 0x1
    //         invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;
    //         move-result-object v0
    //         goto :goto_1
    //         :pswitch_2
    //         const/4 v0, 0x3
    //         invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelperUtils;->getString(Landroid/content/Context;I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Landroid/app/Activity;Ljava/lang/String;)Landroid/app/Dialog;
    //         move-result-object v0
    //         goto :goto_1
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x2712
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_0
    //         .end packed-switch
    */

    }
}