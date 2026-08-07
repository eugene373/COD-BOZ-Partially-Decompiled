package com.facebook.android

// Auto-emitted from smali source: Facebook.java.
// 27 fields, 54 methods.

open class Facebook {
    private var accessExpiresMillisecondsAfterEpoch: Long
    private var accessToken: String
    private var lastAccessUpdateMillisecondsAfterEpoch: Long
    private val lock: Object
    private var mAppId: String
    private var pendingAuthorizationActivity: android.app.Activity
    private var pendingAuthorizationPermissions: Array<String>
    private var pendingOpeningSession: com.facebook.Session
    private var session: com.facebook.Session
    private var sessionInvalidated: Boolean
    private var tokenCache: com.facebook.android.Facebook.SetterTokenCachingStrategy
    private var userSetSession: com.facebook.Session

    public constructor(p0: String)

    private fun authorize(p0: android.app.Activity, p1: Array<String>, p2: Int, p3: com.facebook.SessionLoginBehavior, p4: com.facebook.android.Facebook.DialogListener) { /* TODO(body): (Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/SessionLoginBehavior;Lcom/facebook/android/Facebook$DialogListener;)V */ }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         const-string v1, "authorize"
    //         invoke-direct {p0, v1}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V
    //         new-instance v1, Lcom/facebook/Session$Builder;
    //         invoke-direct {v1, p1}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V
    //         iget-object v2, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;
    //         move-result-object v1
    //         invoke-direct {p0}, Lcom/facebook/android/Facebook;->getTokenCache()Lcom/facebook/TokenCachingStrategy;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Lcom/facebook/Session$Builder;->setTokenCachingStrategy(Lcom/facebook/TokenCachingStrategy;)Lcom/facebook/Session$Builder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/android/Facebook;->pendingOpeningSession:Lcom/facebook/Session;
    //         iput-object p1, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationActivity:Landroid/app/Activity;
    //         if-eqz p2, :cond_1
    //         :goto_0
    //         iput-object p2, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;
    //         new-instance v1, Lcom/facebook/android/Facebook$1;
    //         invoke-direct {v1, p0, p5}, Lcom/facebook/android/Facebook$1;-><init>(Lcom/facebook/android/Facebook;Lcom/facebook/android/Facebook$DialogListener;)V
    //         new-instance v2, Lcom/facebook/Session$OpenRequest;
    //         invoke-direct {v2, p1}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V
    //         invoke-virtual {v2, v1}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v1
    //         invoke-virtual {v1, p4}, Lcom/facebook/Session$OpenRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Lcom/facebook/Session$OpenRequest;->setRequestCode(I)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;
    //         invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/android/Facebook;->pendingOpeningSession:Lcom/facebook/Session;
    //         iget-object v3, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;
    //         array-length v3, v3
    //         if-lez v3, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-direct {p0, v2, v1, v0}, Lcom/facebook/android/Facebook;->openSession(Lcom/facebook/Session;Lcom/facebook/Session$OpenRequest;Z)V
    //         return-void
    //         :cond_1
    //         new-array p2, v0, [Ljava/lang/String;
    //         goto :goto_0
    */

    private fun checkUserSession(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->userSetSession:Lcom/facebook/Session;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Cannot call %s after setSession has been called."
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         aput-object p1, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    private fun getTokenCache(): com.facebook.TokenCachingStrategy { return TODO("body: ()Lcom/facebook/TokenCachingStrategy;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->tokenCache:Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;-><init>(Lcom/facebook/android/Facebook;Lcom/facebook/android/Facebook$1;)V
    //         iput-object v0, p0, Lcom/facebook/android/Facebook;->tokenCache:Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->tokenCache:Lcom/facebook/android/Facebook$SetterTokenCachingStrategy;
    //         return-object v0
    */

    private fun onSessionCallback(p0: com.facebook.Session, p1: com.facebook.SessionState, p2: Exception, p3: com.facebook.android.Facebook.DialogListener) { /* TODO(body): (Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;Lcom/facebook/android/Facebook$DialogListener;)V */ }
    /*
    //         .locals 5
    //         invoke-virtual {p1}, Lcom/facebook/Session;->getAuthorizationBundle()Landroid/os/Bundle;
    //         move-result-object v1
    //         sget-object v0, Lcom/facebook/SessionState;->OPENED:Lcom/facebook/SessionState;
    //         if-ne p2, v0, :cond_3
    //         const/4 v0, 0x0
    //         iget-object v2, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-object v3, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    //         if-eq p1, v3, :cond_0
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    //         iput-object p1, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    //         const/4 v3, 0x0
    //         iput-boolean v3, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z
    //         :cond_0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Lcom/facebook/Session;->close()V
    //         :cond_1
    //         invoke-interface {p4, v1}, Lcom/facebook/android/Facebook$DialogListener;->onComplete(Landroid/os/Bundle;)V
    //         :cond_2
    //         :goto_0
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    //         :cond_3
    //         if-eqz p3, :cond_2
    //         instance-of v0, p3, Lcom/facebook/FacebookOperationCanceledException;
    //         if-eqz v0, :cond_4
    //         invoke-interface {p4}, Lcom/facebook/android/Facebook$DialogListener;->onCancel()V
    //         goto :goto_0
    //         :cond_4
    //         instance-of v0, p3, Lcom/facebook/FacebookAuthorizationException;
    //         if-eqz v0, :cond_5
    //         if-eqz v1, :cond_5
    //         const-string v0, "com.facebook.sdk.WebViewErrorCode"
    //         invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         const-string v0, "com.facebook.sdk.FailingUrl"
    //         invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         new-instance v0, Lcom/facebook/android/DialogError;
    //         invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v2
    //         const-string v3, "com.facebook.sdk.WebViewErrorCode"
    //         invoke-virtual {v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v3
    //         const-string v4, "com.facebook.sdk.FailingUrl"
    //         invoke-virtual {v1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v2, v3, v1}, Lcom/facebook/android/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V
    //         invoke-interface {p4, v0}, Lcom/facebook/android/Facebook$DialogListener;->onError(Lcom/facebook/android/DialogError;)V
    //         goto :goto_0
    //         :cond_5
    //         new-instance v0, Lcom/facebook/android/FacebookError;
    //         invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V
    //         invoke-interface {p4, v0}, Lcom/facebook/android/Facebook$DialogListener;->onFacebookError(Lcom/facebook/android/FacebookError;)V
    //         goto :goto_0
    */

    private fun openSession(p0: com.facebook.Session, p1: com.facebook.Session.OpenRequest, p2: Boolean) { /* TODO(body): (Lcom/facebook/Session;Lcom/facebook/Session$OpenRequest;Z)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-virtual {p2, v0}, Lcom/facebook/Session$OpenRequest;->setIsLegacy(Z)V
    //         if-eqz p3, :cond_0
    //         invoke-virtual {p1, p2}, Lcom/facebook/Session;->openForPublish(Lcom/facebook/Session$OpenRequest;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p1, p2}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V
    //         goto :goto_0
    */

    private fun validateAppSignatureForPackage(p0: android.content.Context, p1: String): Boolean { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         const/16 v2, 0x40
    //         invoke-virtual {v1, p2, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v1
    //         iget-object v2, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
    //         array-length v3, v2
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         aget-object v4, v2, v1
    //         invoke-virtual {v4}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;
    //         move-result-object v4
    //         const-string v5, "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_1
    //         const/4 v0, 0x1
    //         :cond_0
    //         :goto_1
    //         return v0
    //         :cond_1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_1
    */

    private fun validateServiceIntent(p0: android.content.Context, p1: android.content.Intent): Boolean { return TODO("body: (Landroid/content/Context;Landroid/content/Intent;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         invoke-virtual {v1, p2, v0}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
    //         iget-object v0, v0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;
    //         invoke-direct {p0, p1, v0}, Lcom/facebook/android/Facebook;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun authorize(p0: android.app.Activity, p1: com.facebook.android.Facebook.DialogListener) { /* TODO(body): (Landroid/app/Activity;Lcom/facebook/android/Facebook$DialogListener;)V */ }
    /*
    //         .locals 6
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const/4 v0, 0x0
    //         new-array v2, v0, [Ljava/lang/String;
    //         const/16 v3, 0x7f99
    //         sget-object v4, Lcom/facebook/SessionLoginBehavior;->SSO_WITH_FALLBACK:Lcom/facebook/SessionLoginBehavior;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/SessionLoginBehavior;Lcom/facebook/android/Facebook$DialogListener;)V
    //         return-void
    */

    public fun authorize(p0: android.app.Activity, p1: Array<String>, p2: Int, p3: com.facebook.android.Facebook.DialogListener) { /* TODO(body): (Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V */ }
    /*
    //         .locals 6
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         if-ltz p3, :cond_0
    //         sget-object v4, Lcom/facebook/SessionLoginBehavior;->SSO_WITH_FALLBACK:Lcom/facebook/SessionLoginBehavior;
    //         :goto_0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move v3, p3
    //         move-object v5, p4
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/SessionLoginBehavior;Lcom/facebook/android/Facebook$DialogListener;)V
    //         return-void
    //         :cond_0
    //         sget-object v4, Lcom/facebook/SessionLoginBehavior;->SUPPRESS_SSO:Lcom/facebook/SessionLoginBehavior;
    //         goto :goto_0
    */

    public fun authorize(p0: android.app.Activity, p1: Array<String>, p2: com.facebook.android.Facebook.DialogListener) { /* TODO(body): (Landroid/app/Activity;[Ljava/lang/String;Lcom/facebook/android/Facebook$DialogListener;)V */ }
    /*
    //         .locals 6
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const/16 v3, 0x7f99
    //         sget-object v4, Lcom/facebook/SessionLoginBehavior;->SSO_WITH_FALLBACK:Lcom/facebook/SessionLoginBehavior;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v5, p3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/SessionLoginBehavior;Lcom/facebook/android/Facebook$DialogListener;)V
    //         return-void
    */

    public fun authorizeCallback(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const/4 v2, 0x0
    //         const-string v0, "authorizeCallback"
    //         invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->pendingOpeningSession:Lcom/facebook/Session;
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationActivity:Landroid/app/Activity;
    //         invoke-virtual {v0, v1, p1, p2, p3}, Lcom/facebook/Session;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iput-object v2, p0, Lcom/facebook/android/Facebook;->pendingOpeningSession:Lcom/facebook/Session;
    //         iput-object v2, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationActivity:Landroid/app/Activity;
    //         iput-object v2, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;
    //         :cond_0
    //         return-void
    */

    public fun dialog(p0: android.content.Context, p1: String, p2: android.os.Bundle, p3: com.facebook.android.Facebook.DialogListener) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V */ }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "display"
    //         const-string v1, "touch"
    //         invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "redirect_uri"
    //         const-string v1, "fbconnect://success"
    //         invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "oauth"
    //         invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-string v0, "type"
    //         const-string v1, "user_agent"
    //         invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "client_id"
    //         iget-object v1, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;
    //         invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         :goto_0
    //         const-string v0, "android.permission.INTERNET"
    //         invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const-string v0, "Error"
    //         const-string v1, "Application requires permission to access the Internet"
    //         invoke-static {p1, v0, v1}, Lcom/facebook/android/Util;->showAlert(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_1
    //         return-void
    //         :cond_1
    //         const-string v0, "app_id"
    //         iget-object v1, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;
    //         invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "access_token"
    //         invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_2
    //         new-instance v0, Lcom/facebook/android/FbDialog;
    //         invoke-direct {v0, p1, p2, p3, p4}, Lcom/facebook/android/FbDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V
    //         invoke-virtual {v0}, Lcom/facebook/android/FbDialog;->show()V
    //         goto :goto_1
    */

    public fun dialog(p0: android.content.Context, p1: String, p2: com.facebook.android.Facebook.DialogListener) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;Lcom/facebook/android/Facebook$DialogListener;)V */ }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         invoke-virtual {p0, p1, p2, v0, p3}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V
    //         return-void
    */

    public fun extendAccessToken(p0: android.content.Context, p1: com.facebook.android.Facebook.ServiceListener): Boolean { return TODO("body: (Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)Z") }
    /*
    //         .locals 3
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "extendAccessToken"
    //         invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0}, Landroid/content/Intent;-><init>()V
    //         const-string v1, "com.facebook.katana"
    //         const-string v2, "com.facebook.katana.platform.TokenRefreshService"
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         invoke-direct {p0, p1, v0}, Lcom/facebook/android/Facebook;->validateServiceIntent(Landroid/content/Context;Landroid/content/Intent;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         new-instance v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;
    //         invoke-direct {v1, p0, p1, p2}, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;-><init>(Lcom/facebook/android/Facebook;Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)V
    //         const/4 v2, 0x1
    //         invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun extendAccessTokenIfNeeded(p0: android.content.Context, p1: com.facebook.android.Facebook.ServiceListener): Boolean { return TODO("body: (Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)Z") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "extendAccessTokenIfNeeded"
    //         invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/facebook/android/Facebook;->shouldExtendAccessToken()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, p1, p2}, Lcom/facebook/android/Facebook;->extendAccessToken(Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun getAccessExpires(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getExpirationDate()Ljava/util/Date;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    //         move-result-wide v0
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         iget-wide v0, p0, Lcom/facebook/android/Facebook;->accessExpiresMillisecondsAfterEpoch:J
    //         goto :goto_0
    */

    public fun getAccessToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getAppId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getLastAccessUpdate(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-wide v0, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J
    //         return-wide v0
    */

    public fun getSession(): com.facebook.Session { return TODO("body: ()Lcom/facebook/Session;") }
    /*
    //         .locals 7
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const/4 v1, 0x0
    //         const/4 v2, 0x0
    //         :cond_0
    //         iget-object v3, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;
    //         monitor-enter v3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->userSetSession:Lcom/facebook/Session;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->userSetSession:Lcom/facebook/Session;
    //         monitor-exit v3
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    //         if-nez v0, :cond_2
    //         iget-boolean v0, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z
    //         if-nez v0, :cond_3
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    //         monitor-exit v3
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v3
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_3
    //         :try_start_1
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;
    //         iget-object v4, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    //         monitor-exit v3
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         if-nez v0, :cond_4
    //         move-object v0, v2
    //         goto :goto_0
    //         :cond_4
    //         if-eqz v4, :cond_5
    //         invoke-virtual {v4}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         :goto_1
    //         new-instance v3, Lcom/facebook/Session$Builder;
    //         iget-object v4, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationActivity:Landroid/app/Activity;
    //         invoke-direct {v3, v4}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V
    //         iget-object v4, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;
    //         invoke-virtual {v3, v4}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;
    //         move-result-object v3
    //         invoke-direct {p0}, Lcom/facebook/android/Facebook;->getTokenCache()Lcom/facebook/TokenCachingStrategy;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Lcom/facebook/Session$Builder;->setTokenCachingStrategy(Lcom/facebook/TokenCachingStrategy;)Lcom/facebook/Session$Builder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;
    //         move-result-object v4
    //         sget-object v5, Lcom/facebook/SessionState;->CREATED_TOKEN_LOADED:Lcom/facebook/SessionState;
    //         if-eq v4, v5, :cond_7
    //         move-object v0, v2
    //         goto :goto_0
    //         :cond_5
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;
    //         if-eqz v0, :cond_6
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationPermissions:[Ljava/lang/String;
    //         invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_6
    //         invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_7
    //         new-instance v4, Lcom/facebook/Session$OpenRequest;
    //         iget-object v5, p0, Lcom/facebook/android/Facebook;->pendingAuthorizationActivity:Landroid/app/Activity;
    //         invoke-direct {v4, v5}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V
    //         invoke-virtual {v4, v0}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;
    //         move-result-object v4
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_a
    //         const/4 v0, 0x1
    //         :goto_2
    //         invoke-direct {p0, v3, v4, v0}, Lcom/facebook/android/Facebook;->openSession(Lcom/facebook/Session;Lcom/facebook/Session$OpenRequest;Z)V
    //         iget-object v4, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;
    //         monitor-enter v4
    //         :try_start_2
    //         iget-boolean v0, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z
    //         if-nez v0, :cond_8
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    //         if-nez v0, :cond_b
    //         :cond_8
    //         iget-object v0, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    //         iput-object v3, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    //         const/4 v5, 0x0
    //         iput-boolean v5, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z
    //         move-object v6, v3
    //         move-object v3, v0
    //         move-object v0, v6
    //         :goto_3
    //         monitor-exit v4
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         if-eqz v3, :cond_9
    //         invoke-virtual {v3}, Lcom/facebook/Session;->close()V
    //         :cond_9
    //         if-eqz v0, :cond_0
    //         goto/16 :goto_0
    //         :cond_a
    //         move v0, v1
    //         goto :goto_2
    //         :catchall_1
    //         move-exception v0
    //         :try_start_3
    //         monitor-exit v4
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         throw v0
    //         :cond_b
    //         move-object v0, v2
    //         move-object v3, v2
    //         goto :goto_3
    */

    public fun getShouldAutoPublishInstall(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {}, Lcom/facebook/Settings;->getShouldAutoPublishInstall()Z
    //         move-result v0
    //         return v0
    */

    public fun isSessionValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J
    //         move-result-wide v0
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, v0, v2
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v0
    //         invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J
    //         move-result-wide v2
    //         cmp-long v0, v0, v2
    //         if-gez v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun logout(p0: android.content.Context): String { return TODO("body: (Landroid/content/Context;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/net/MalformedURLException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-virtual {p0, p1}, Lcom/facebook/android/Facebook;->logoutImpl(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    fun logoutImpl(p0: android.content.Context): String { return TODO("body: (Landroid/content/Context;)Ljava/lang/String;") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/net/MalformedURLException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const-string v0, "logout"
    //         invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "method"
    //         const-string v2, "auth.expireSession"
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p0, v0}, Lcom/facebook/android/Facebook;->request(Landroid/os/Bundle;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v4, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    //         const/4 v5, 0x0
    //         iput-object v5, p0, Lcom/facebook/android/Facebook;->session:Lcom/facebook/Session;
    //         const/4 v5, 0x0
    //         iput-object v5, p0, Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;
    //         const-wide/16 v6, 0x0
    //         iput-wide v6, p0, Lcom/facebook/android/Facebook;->accessExpiresMillisecondsAfterEpoch:J
    //         iput-wide v2, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J
    //         const/4 v2, 0x0
    //         iput-boolean v2, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v4, :cond_0
    //         invoke-virtual {v4}, Lcom/facebook/Session;->closeAndClearTokenInformation()V
    //         :cond_0
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun request(p0: android.os.Bundle): String { return TODO("body: (Landroid/os/Bundle;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/net/MalformedURLException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "method"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "API method must be specified. (parameters must contain key \"method\" and value). See http://developers.facebook.com/docs/reference/rest/"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         const-string v1, "GET"
    //         invoke-virtual {p0, v0, p1, v1}, Lcom/facebook/android/Facebook;->requestImpl(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun request(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/net/MalformedURLException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "GET"
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/android/Facebook;->requestImpl(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun request(p0: String, p1: android.os.Bundle): String { return TODO("body: (Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/net/MalformedURLException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "GET"
    //         invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/android/Facebook;->requestImpl(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun request(p0: String, p1: android.os.Bundle, p2: String): String { return TODO("body: (Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;,
    //                 Ljava/net/MalformedURLException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/android/Facebook;->requestImpl(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    fun requestImpl(p0: String, p1: android.os.Bundle, p2: String): String { return TODO("body: (Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;,
    //                 Ljava/net/MalformedURLException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const-string v0, "format"
    //         const-string v1, "json"
    //         invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "access_token"
    //         invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         if-eqz p1, :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         sget-object v1, Lcom/facebook/android/Facebook;->GRAPH_BASE_URL:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         invoke-static {v0, p3, p2}, Lcom/facebook/android/Util;->openUrl(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_1
    //         sget-object v0, Lcom/facebook/android/Facebook;->RESTSERVER_URL:Ljava/lang/String;
    //         goto :goto_0
    */

    public fun setAccessExpires(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 5
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "setAccessExpires"
    //         invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iput-wide p1, p0, Lcom/facebook/android/Facebook;->accessExpiresMillisecondsAfterEpoch:J
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         iput-wide v2, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun setAccessExpiresIn(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 6
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "setAccessExpiresIn"
    //         invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V
    //         if-eqz p1, :cond_0
    //         const-string v0, "0"
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-wide/16 v0, 0x0
    //         :goto_0
    //         invoke-virtual {p0, v0, v1}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v0
    //         invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    //         move-result-wide v2
    //         const-wide/16 v4, 0x3e8
    //         mul-long/2addr v2, v4
    //         add-long/2addr v0, v2
    //         goto :goto_0
    */

    public fun setAccessToken(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "setAccessToken"
    //         invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iput-object p1, p0, Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         iput-wide v2, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun setAppId(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "setAppId"
    //         invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iput-object p1, p0, Lcom/facebook/android/Facebook;->mAppId:Ljava/lang/String;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/android/Facebook;->sessionInvalidated:Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun setSession(p0: com.facebook.Session) { /* TODO(body): (Lcom/facebook/Session;)V */ }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "session cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iput-object p1, p0, Lcom/facebook/android/Facebook;->userSetSession:Lcom/facebook/Session;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun setShouldAutoPublishInstall(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p1}, Lcom/facebook/Settings;->setShouldAutoPublishInstall(Z)V
    //         return-void
    */

    public fun setTokenFromCache(p0: String, p1: Long, p2: Long) { /* TODO(body): (Ljava/lang/String;JJ)V */ }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "setTokenFromCache"
    //         invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/android/Facebook;->lock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iput-object p1, p0, Lcom/facebook/android/Facebook;->accessToken:Ljava/lang/String;
    //         iput-wide p2, p0, Lcom/facebook/android/Facebook;->accessExpiresMillisecondsAfterEpoch:J
    //         iput-wide p4, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun shouldExtendAccessToken(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "shouldExtendAccessToken"
    //         invoke-direct {p0, v0}, Lcom/facebook/android/Facebook;->checkUserSession(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v0
    //         iget-wide v2, p0, Lcom/facebook/android/Facebook;->lastAccessUpdateMillisecondsAfterEpoch:J
    //         sub-long/2addr v0, v2
    //         const-wide/32 v2, 0x5265c00
    //         cmp-long v0, v0, v2
    //         if-ltz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    @JvmField public val ATTRIBUTION_ID_COLUMN_NAME: String = "aid"
    @JvmField public val ATTRIBUTION_ID_CONTENT_URI: android.net.Uri = null!!
    @JvmField public val CANCEL_URI: String = "fbconnect://cancel"
    private val DEFAULT_AUTH_ACTIVITY_CODE: Int = 0x7f99
    @JvmField protected var DIALOG_BASE_URL: String
    @JvmField public val EXPIRES: String = "expires_in"
    @JvmField public val FB_APP_SIGNATURE: String = "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"
    @JvmField public val FORCE_DIALOG_AUTH: Int = 0
    @JvmField protected var GRAPH_BASE_URL: String
    private val LOGIN: String = "oauth"
    @JvmField public val REDIRECT_URI: String = "fbconnect://success"
    private val REFRESH_TOKEN_BARRIER: Long = 0x5265c00L
    @JvmField protected var RESTSERVER_URL: String
    @JvmField public val SINGLE_SIGN_ON_DISABLED: String = "service_disabled"
    @JvmField public val TOKEN: String = "access_token"

    public @JvmStatic fun getAttributionId(p0: android.content.ContentResolver): String { return TODO("body: (Landroid/content/ContentResolver;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p0}, Lcom/facebook/Settings;->getAttributionId(Landroid/content/ContentResolver;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun stringArray(p0: java.util.List): Array<String> { return TODO("body: (Ljava/util/List;)[Ljava/lang/String;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)[",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         if-eqz p0, :cond_0
    //         invoke-interface {p0}, Ljava/util/List;->size()I
    //         move-result v0
    //         :goto_0
    //         new-array v2, v0, [Ljava/lang/String;
    //         if-eqz p0, :cond_1
    //         :goto_1
    //         array-length v0, v2
    //         if-ge v1, v0, :cond_1
    //         invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         aput-object v0, v2, v1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_1
    //         :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_1
    //         return-object v2
    */

    private @JvmStatic fun stringList(p0: Array<String>): java.util.List { return TODO("body: ([Ljava/lang/String;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "([",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         if-eqz p0, :cond_0
    //         invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    //         move-result-object v0
    //         goto :goto_0
    */

    }
}
