package com.facebook.widget

// Auto-emitted from smali source: LoginButton.java.
// 19 fields, 61 methods.

open class LoginButton: android.widget.Button() {
    private var applicationId: String
    private var confirmLogout: Boolean
    private var fetchUserInfo: Boolean
    private var listenerCallback: android.view.View.OnClickListener
    private var loginLogoutEventName: String
    private var loginText: String
    private var logoutText: String
    private var nuxChecked: Boolean
    private var nuxDisplayTime: Long
    private var nuxMode: com.facebook.widget.LoginButton.ToolTipMode
    private var nuxPopup: com.facebook.widget.ToolTipPopup
    private var nuxStyle: com.facebook.widget.ToolTipPopup.Style
    private var parentFragment: android.support.v4.app.Fragment
    private var properties: com.facebook.widget.LoginButton.LoginButtonProperties
    private var sessionTracker: com.facebook.internal.SessionTracker
    private var user: com.facebook.model.GraphUser
    private var userInfoChangedCallback: com.facebook.widget.LoginButton.UserInfoChangedCallback
    private var userInfoSession: com.facebook.Session

    public constructor(p0: android.content.Context)

    public constructor(p0: android.content.Context, p1: android.util.AttributeSet)

    public constructor(p0: android.content.Context, p1: android.util.AttributeSet, p2: Int)

    private fun checkNuxSettings() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->nuxMode:Lcom/facebook/widget/LoginButton$ToolTipMode;
    //         sget-object v1, Lcom/facebook/widget/LoginButton$ToolTipMode;->DISPLAY_ALWAYS:Lcom/facebook/widget/LoginButton$ToolTipMode;
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$string;->com_facebook_tooltip_default:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/LoginButton;->displayNux(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->getMetadataApplicationId(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/widget/LoginButton$1;
    //         invoke-direct {v1, p0, v0}, Lcom/facebook/widget/LoginButton$1;-><init>(Lcom/facebook/widget/LoginButton;Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         check-cast v0, [Ljava/lang/Void;
    //         invoke-virtual {v1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         goto :goto_0
    */

    private fun displayNux(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/facebook/widget/ToolTipPopup;
    //         invoke-direct {v0, p1, p0}, Lcom/facebook/widget/ToolTipPopup;-><init>(Ljava/lang/String;Landroid/view/View;)V
    //         iput-object v0, p0, Lcom/facebook/widget/LoginButton;->nuxPopup:Lcom/facebook/widget/ToolTipPopup;
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->nuxPopup:Lcom/facebook/widget/ToolTipPopup;
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton;->nuxStyle:Lcom/facebook/widget/ToolTipPopup$Style;
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/ToolTipPopup;->setStyle(Lcom/facebook/widget/ToolTipPopup$Style;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->nuxPopup:Lcom/facebook/widget/ToolTipPopup;
    //         iget-wide v2, p0, Lcom/facebook/widget/LoginButton;->nuxDisplayTime:J
    //         invoke-virtual {v0, v2, v3}, Lcom/facebook/widget/ToolTipPopup;->setNuxDisplayTime(J)V
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->nuxPopup:Lcom/facebook/widget/ToolTipPopup;
    //         invoke-virtual {v0}, Lcom/facebook/widget/ToolTipPopup;->show()V
    //         return-void
    */

    private fun fetchUserInfo() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-boolean v0, p0, Lcom/facebook/widget/LoginButton;->fetchUserInfo:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->getOpenSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton;->userInfoSession:Lcom/facebook/Session;
    //         if-eq v0, v1, :cond_0
    //         new-instance v1, Lcom/facebook/widget/LoginButton$2;
    //         invoke-direct {v1, p0, v0}, Lcom/facebook/widget/LoginButton$2;-><init>(Lcom/facebook/widget/LoginButton;Lcom/facebook/Session;)V
    //         invoke-static {v0, v1}, Lcom/facebook/Request;->newMeRequest(Lcom/facebook/Session;Lcom/facebook/Request$GraphUserCallback;)Lcom/facebook/Request;
    //         move-result-object v1
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Lcom/facebook/Request;
    //         const/4 v3, 0x0
    //         aput-object v1, v2, v3
    //         invoke-static {v2}, Lcom/facebook/Request;->executeBatchAsync([Lcom/facebook/Request;)Lcom/facebook/RequestAsyncTask;
    //         iput-object v0, p0, Lcom/facebook/widget/LoginButton;->userInfoSession:Lcom/facebook/Session;
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/LoginButton;->user:Lcom/facebook/model/GraphUser;
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->userInfoChangedCallback:Lcom/facebook/widget/LoginButton$UserInfoChangedCallback;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->userInfoChangedCallback:Lcom/facebook/widget/LoginButton$UserInfoChangedCallback;
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton;->user:Lcom/facebook/model/GraphUser;
    //         invoke-interface {v0, v1}, Lcom/facebook/widget/LoginButton$UserInfoChangedCallback;->onUserInfoFetched(Lcom/facebook/model/GraphUser;)V
    //         goto :goto_0
    */

    private fun finishInit() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         new-instance v0, Lcom/facebook/widget/LoginButton$LoginClickListener;
    //         invoke-direct {v0, p0, v4}, Lcom/facebook/widget/LoginButton$LoginClickListener;-><init>(Lcom/facebook/widget/LoginButton;Lcom/facebook/widget/LoginButton$1;)V
    //         invoke-super {p0, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         invoke-direct {p0}, Lcom/facebook/widget/LoginButton;->setButtonText()V
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->isInEditMode()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         new-instance v2, Lcom/facebook/widget/LoginButton$LoginButtonCallback;
    //         invoke-direct {v2, p0, v4}, Lcom/facebook/widget/LoginButton$LoginButtonCallback;-><init>(Lcom/facebook/widget/LoginButton;Lcom/facebook/widget/LoginButton$1;)V
    //         const/4 v3, 0x0
    //         invoke-direct {v0, v1, v2, v4, v3}, Lcom/facebook/internal/SessionTracker;-><init>(Landroid/content/Context;Lcom/facebook/Session$StatusCallback;Lcom/facebook/Session;Z)V
    //         iput-object v0, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-direct {p0}, Lcom/facebook/widget/LoginButton;->fetchUserInfo()V
    //         :cond_0
    //         return-void
    */

    private fun initializeActiveSessionWithCachedToken(p0: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         if-nez p1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         if-eqz v1, :cond_2
    //         invoke-virtual {v1}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v0
    //         goto :goto_0
    //         :cond_2
    //         invoke-static {p1}, Lcom/facebook/internal/Utility;->getMetadataApplicationId(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-static {p1}, Lcom/facebook/Session;->openActiveSessionFromCache(Landroid/content/Context;)Lcom/facebook/Session;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    private fun parseAttributes(p0: android.util.AttributeSet) { /* TODO(body): (Landroid/util/AttributeSet;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/android/R$styleable;->com_facebook_login_view:[I
    //         invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_login_view_confirm_logout:I
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v1
    //         iput-boolean v1, p0, Lcom/facebook/widget/LoginButton;->confirmLogout:Z
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_login_view_fetch_user_info:I
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
    //         move-result v1
    //         iput-boolean v1, p0, Lcom/facebook/widget/LoginButton;->fetchUserInfo:Z
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_login_view_login_text:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/widget/LoginButton;->loginText:Ljava/lang/String;
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_login_view_logout_text:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/widget/LoginButton;->logoutText:Ljava/lang/String;
    //         invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
    //         return-void
    */

    private fun setButtonText() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->getOpenSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->logoutText:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->logoutText:Ljava/lang/String;
    //         :goto_0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/LoginButton;->setText(Ljava/lang/CharSequence;)V
    //         :goto_1
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$string;->com_facebook_loginview_log_out_button:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->loginText:Ljava/lang/String;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->loginText:Ljava/lang/String;
    //         :goto_2
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/LoginButton;->setText(Ljava/lang/CharSequence;)V
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$string;->com_facebook_loginview_log_in_button:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_2
    */

    private fun showNuxPerSettings(p0: com.facebook.internal.Utility.FetchedAppSettings) { /* TODO(body): (Lcom/facebook/internal/Utility$FetchedAppSettings;)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/internal/Utility$FetchedAppSettings;->getNuxEnabled()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->getVisibility()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/internal/Utility$FetchedAppSettings;->getNuxContent()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/LoginButton;->displayNux(Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    public fun clearPermissions() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->clearPermissions()V
    //         return-void
    */

    public fun dismissToolTip() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->nuxPopup:Lcom/facebook/widget/ToolTipPopup;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->nuxPopup:Lcom/facebook/widget/ToolTipPopup;
    //         invoke-virtual {v0}, Lcom/facebook/widget/ToolTipPopup;->dismiss()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/LoginButton;->nuxPopup:Lcom/facebook/widget/ToolTipPopup;
    //         :cond_0
    //         return-void
    */

    public fun getDefaultAudience(): com.facebook.SessionDefaultAudience { return TODO("body: ()Lcom/facebook/SessionDefaultAudience;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->getDefaultAudience()Lcom/facebook/SessionDefaultAudience;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getLoginBehavior(): com.facebook.SessionLoginBehavior { return TODO("body: ()Lcom/facebook/SessionLoginBehavior;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->getLoginBehavior()Lcom/facebook/SessionLoginBehavior;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getOnErrorListener(): com.facebook.widget.LoginButton.OnErrorListener { return TODO("body: ()Lcom/facebook/widget/LoginButton$OnErrorListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->getOnErrorListener()Lcom/facebook/widget/LoginButton$OnErrorListener;
    //         move-result-object v0
    //         return-object v0
    */

    fun getPermissions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getSessionStatusCallback(): com.facebook.Session.StatusCallback { return TODO("body: ()Lcom/facebook/Session$StatusCallback;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->getSessionStatusCallback()Lcom/facebook/Session$StatusCallback;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getToolTipDisplayTime(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/facebook/widget/LoginButton;->nuxDisplayTime:J
    //         return-wide v0
    */

    public fun getToolTipMode(): com.facebook.widget.LoginButton.ToolTipMode { return TODO("body: ()Lcom/facebook/widget/LoginButton$ToolTipMode;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->nuxMode:Lcom/facebook/widget/LoginButton$ToolTipMode;
    //         return-object v0
    */

    public fun getUserInfoChangedCallback(): com.facebook.widget.LoginButton.UserInfoChangedCallback { return TODO("body: ()Lcom/facebook/widget/LoginButton$UserInfoChangedCallback;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->userInfoChangedCallback:Lcom/facebook/widget/LoginButton$UserInfoChangedCallback;
    //         return-object v0
    */

    fun handleError(p0: Exception) { /* TODO(body): (Ljava/lang/Exception;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$2000(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/widget/LoginButton$OnErrorListener;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         instance-of v0, p1, Lcom/facebook/FacebookException;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$2000(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/widget/LoginButton$OnErrorListener;
    //         move-result-object v0
    //         check-cast p1, Lcom/facebook/FacebookException;
    //         invoke-interface {v0, p1}, Lcom/facebook/widget/LoginButton$OnErrorListener;->onError(Lcom/facebook/FacebookException;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-static {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$2000(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/widget/LoginButton$OnErrorListener;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/FacebookException;
    //         invoke-direct {v1, p1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V
    //         invoke-interface {v0, v1}, Lcom/facebook/widget/LoginButton$OnErrorListener;->onError(Lcom/facebook/FacebookException;)V
    //         goto :goto_0
    */

    public fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent): Boolean { return TODO("body: (IILandroid/content/Intent;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/Activity;
    //         invoke-virtual {v1, v0, p1, p2, p3}, Lcom/facebook/Session;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    protected fun onAttachedToWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/widget/Button;->onAttachedToWindow()V
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->isTracking()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->startTracking()V
    //         invoke-direct {p0}, Lcom/facebook/widget/LoginButton;->fetchUserInfo()V
    //         invoke-direct {p0}, Lcom/facebook/widget/LoginButton;->setButtonText()V
    //         :cond_0
    //         return-void
    */

    protected fun onDetachedFromWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/widget/Button;->onDetachedFromWindow()V
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->stopTracking()V
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->dismissToolTip()V
    //         return-void
    */

    protected fun onDraw(p0: android.graphics.Canvas) { /* TODO(body): (Landroid/graphics/Canvas;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1}, Landroid/widget/Button;->onDraw(Landroid/graphics/Canvas;)V
    //         iget-boolean v0, p0, Lcom/facebook/widget/LoginButton;->nuxChecked:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->nuxMode:Lcom/facebook/widget/LoginButton$ToolTipMode;
    //         sget-object v1, Lcom/facebook/widget/LoginButton$ToolTipMode;->NEVER_DISPLAY:Lcom/facebook/widget/LoginButton$ToolTipMode;
    //         if-eq v0, v1, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->isInEditMode()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/widget/LoginButton;->nuxChecked:Z
    //         invoke-direct {p0}, Lcom/facebook/widget/LoginButton;->checkNuxSettings()V
    //         :cond_0
    //         return-void
    */

    public fun onFinishInflate() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Landroid/widget/Button;->onFinishInflate()V
    //         invoke-direct {p0}, Lcom/facebook/widget/LoginButton;->finishInit()V
    //         return-void
    */

    protected fun onVisibilityChanged(p0: android.view.View, p1: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1, p2}, Landroid/widget/Button;->onVisibilityChanged(Landroid/view/View;I)V
    //         if-eqz p2, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LoginButton;->dismissToolTip()V
    //         :cond_0
    //         return-void
    */

    public fun setApplicationId(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton;->applicationId:Ljava/lang/String;
    //         return-void
    */

    public fun setDefaultAudience(p0: com.facebook.SessionDefaultAudience) { /* TODO(body): (Lcom/facebook/SessionDefaultAudience;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0, p1}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)V
    //         return-void
    */

    public fun setFragment(p0: android.support.v4.app.Fragment) { /* TODO(body): (Landroid/support/v4/app/Fragment;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton;->parentFragment:Landroid/support/v4/app/Fragment;
    //         return-void
    */

    public fun setLoginBehavior(p0: com.facebook.SessionLoginBehavior) { /* TODO(body): (Lcom/facebook/SessionLoginBehavior;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0, p1}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)V
    //         return-void
    */

    fun setLoginLogoutEventName(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton;->loginLogoutEventName:Ljava/lang/String;
    //         return-void
    */

    public fun setOnClickListener(p0: android.view.View.OnClickListener) { /* TODO(body): (Landroid/view/View$OnClickListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton;->listenerCallback:Landroid/view/View$OnClickListener;
    //         return-void
    */

    public fun setOnErrorListener(p0: com.facebook.widget.LoginButton.OnErrorListener) { /* TODO(body): (Lcom/facebook/widget/LoginButton$OnErrorListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0, p1}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setOnErrorListener(Lcom/facebook/widget/LoginButton$OnErrorListener;)V
    //         return-void
    */

    fun setProperties(p0: com.facebook.widget.LoginButton.LoginButtonProperties) { /* TODO(body): (Lcom/facebook/widget/LoginButton$LoginButtonProperties;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         return-void
    */

    public fun setPublishPermissions(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v1}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setPublishPermissions(Ljava/util/List;Lcom/facebook/Session;)V
    //         return-void
    */

    public fun setPublishPermissions(p0: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v2}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setPublishPermissions(Ljava/util/List;Lcom/facebook/Session;)V
    //         return-void
    */

    public fun setReadPermissions(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         iget-object v1, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v1}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setReadPermissions(Ljava/util/List;Lcom/facebook/Session;)V
    //         return-void
    */

    public fun setReadPermissions(p0: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v2}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setReadPermissions(Ljava/util/List;Lcom/facebook/Session;)V
    //         return-void
    */

    public fun setSession(p0: com.facebook.Session) { /* TODO(body): (Lcom/facebook/Session;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    //         invoke-virtual {v0, p1}, Lcom/facebook/internal/SessionTracker;->setSession(Lcom/facebook/Session;)V
    //         invoke-direct {p0}, Lcom/facebook/widget/LoginButton;->fetchUserInfo()V
    //         invoke-direct {p0}, Lcom/facebook/widget/LoginButton;->setButtonText()V
    //         return-void
    */

    public fun setSessionStatusCallback(p0: com.facebook.Session.StatusCallback) { /* TODO(body): (Lcom/facebook/Session$StatusCallback;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    //         invoke-virtual {v0, p1}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->setSessionStatusCallback(Lcom/facebook/Session$StatusCallback;)V
    //         return-void
    */

    public fun setToolTipDisplayTime(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Lcom/facebook/widget/LoginButton;->nuxDisplayTime:J
    //         return-void
    */

    public fun setToolTipMode(p0: com.facebook.widget.LoginButton.ToolTipMode) { /* TODO(body): (Lcom/facebook/widget/LoginButton$ToolTipMode;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton;->nuxMode:Lcom/facebook/widget/LoginButton$ToolTipMode;
    //         return-void
    */

    public fun setToolTipStyle(p0: com.facebook.widget.ToolTipPopup.Style) { /* TODO(body): (Lcom/facebook/widget/ToolTipPopup$Style;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton;->nuxStyle:Lcom/facebook/widget/ToolTipPopup$Style;
    //         return-void
    */

    public fun setUserInfoChangedCallback(p0: com.facebook.widget.LoginButton.UserInfoChangedCallback) { /* TODO(body): (Lcom/facebook/widget/LoginButton$UserInfoChangedCallback;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LoginButton;->userInfoChangedCallback:Lcom/facebook/widget/LoginButton$UserInfoChangedCallback;
    //         return-void
    */

    companion object {
    private val TAG: String = null!!
    }
}
