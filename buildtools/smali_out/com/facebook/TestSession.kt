package com.facebook

// Auto-emitted from smali source: TestSession.java.
// 12 fields, 23 methods.

open class TestSession: com.facebook.Session() {
    private val mode: com.facebook.TestSession.Mode
    private val requestedPermissions: java.util.List
    private val sessionUniqueUserTag: String
    private var testAccountId: String
    private var testAccountUserName: String
    private var wasAskedToExtendAccessToken: Boolean

    constructor(p0: android.app.Activity, p1: java.util.List, p2: com.facebook.TokenCachingStrategy, p3: String, p4: com.facebook.TestSession.Mode)

    private fun createTestAccountAndFinishAuth(): com.facebook.TestSession.TestAccount { return TODO("body: ()Lcom/facebook/TestSession$TestAccount;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x1
    //         const/4 v6, 0x0
    //         const/4 v1, 0x0
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         const-string v0, "installed"
    //         const-string v3, "true"
    //         invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "permissions"
    //         invoke-direct {p0}, Lcom/facebook/TestSession;->getPermissionsString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "access_token"
    //         invoke-static {}, Lcom/facebook/TestSession;->getAppAccessToken()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/TestSession;->mode:Lcom/facebook/TestSession$Mode;
    //         sget-object v3, Lcom/facebook/TestSession$Mode;->SHARED:Lcom/facebook/TestSession$Mode;
    //         if-ne v0, v3, :cond_0
    //         const-string v0, "name"
    //         const-string v3, "Shared %s Testuser"
    //         new-array v4, v7, [Ljava/lang/Object;
    //         invoke-direct {p0}, Lcom/facebook/TestSession;->getSharedTestAccountIdentifier()Ljava/lang/String;
    //         move-result-object v5
    //         aput-object v5, v4, v6
    //         invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         const-string v0, "%s/accounts/test-users"
    //         new-array v3, v7, [Ljava/lang/Object;
    //         sget-object v4, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;
    //         aput-object v4, v3, v6
    //         invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v3, Lcom/facebook/Request;
    //         sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         invoke-direct {v3, v1, v0, v2, v4}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V
    //         invoke-virtual {v3}, Lcom/facebook/Request;->executeAndWait()Lcom/facebook/Response;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v3
    //         const-class v4, Lcom/facebook/TestSession$TestAccount;
    //         invoke-virtual {v0, v4}, Lcom/facebook/Response;->getGraphObjectAs(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/TestSession$TestAccount;
    //         if-eqz v3, :cond_1
    //         invoke-virtual {v3}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;
    //         move-result-object v0
    //         invoke-virtual {p0, v1, v0}, Lcom/facebook/TestSession;->finishAuthOrReauth(Lcom/facebook/AccessToken;Ljava/lang/Exception;)V
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         sget-boolean v1, Lcom/facebook/TestSession;->$assertionsDisabled:Z
    //         if-nez v1, :cond_2
    //         if-nez v0, :cond_2
    //         new-instance v0, Ljava/lang/AssertionError;
    //         invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
    //         throw v0
    //         :cond_2
    //         iget-object v1, p0, Lcom/facebook/TestSession;->mode:Lcom/facebook/TestSession$Mode;
    //         sget-object v3, Lcom/facebook/TestSession$Mode;->SHARED:Lcom/facebook/TestSession$Mode;
    //         if-ne v1, v3, :cond_3
    //         const-string v1, "name"
    //         invoke-virtual {v2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/facebook/TestSession$TestAccount;->setName(Ljava/lang/String;)V
    //         invoke-static {v0}, Lcom/facebook/TestSession;->storeTestAccount(Lcom/facebook/TestSession$TestAccount;)V
    //         :cond_3
    //         invoke-direct {p0, v0}, Lcom/facebook/TestSession;->finishAuthWithTestAccount(Lcom/facebook/TestSession$TestAccount;)V
    //         goto :goto_0
    */

    private fun deleteTestAccount(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x1
    //         const/4 v4, 0x0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "access_token"
    //         invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v1, Lcom/facebook/Request;
    //         const/4 v2, 0x0
    //         sget-object v3, Lcom/facebook/HttpMethod;->DELETE:Lcom/facebook/HttpMethod;
    //         invoke-direct {v1, v2, p1, v0, v3}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;)V
    //         invoke-virtual {v1}, Lcom/facebook/Request;->executeAndWait()Lcom/facebook/Response;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v1
    //         invoke-virtual {v0}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         if-eqz v1, :cond_1
    //         const-string v0, "FacebookSDK.TestSession"
    //         const-string v2, "Could not delete test account %s: %s"
    //         const/4 v3, 0x2
    //         new-array v3, v3, [Ljava/lang/Object;
    //         aput-object p1, v3, v4
    //         invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/FacebookException;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         aput-object v1, v3, v5
    //         invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const-string v1, "FACEBOOK_NON_JSON_RESULT"
    //         invoke-interface {v0, v1}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         if-eq v1, v2, :cond_2
    //         const-string v1, "success"
    //         invoke-interface {v0, v1}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v1
    //         if-ne v0, v1, :cond_0
    //         :cond_2
    //         const-string v0, "FacebookSDK.TestSession"
    //         const-string v1, "Could not delete test account %s: unknown reason"
    //         new-array v2, v5, [Ljava/lang/Object;
    //         aput-object p1, v2, v4
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    private fun findOrCreateSharedTestAccount() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/facebook/TestSession;->getSharedTestAccountIdentifier()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/TestSession;->findTestAccountMatchingIdentifier(Ljava/lang/String;)Lcom/facebook/TestSession$TestAccount;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0, v0}, Lcom/facebook/TestSession;->finishAuthWithTestAccount(Lcom/facebook/TestSession$TestAccount;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-direct {p0}, Lcom/facebook/TestSession;->createTestAccountAndFinishAuth()Lcom/facebook/TestSession$TestAccount;
    //         goto :goto_0
    */

    private fun finishAuthWithTestAccount(p0: com.facebook.TestSession.TestAccount) { /* TODO(body): (Lcom/facebook/TestSession$TestAccount;)V */ }
    /*
    //         .locals 3
    //         invoke-interface {p1}, Lcom/facebook/TestSession$TestAccount;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/TestSession;->testAccountId:Ljava/lang/String;
    //         invoke-interface {p1}, Lcom/facebook/TestSession$TestAccount;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/TestSession;->testAccountUserName:Ljava/lang/String;
    //         invoke-interface {p1}, Lcom/facebook/TestSession$TestAccount;->getAccessToken()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/TestSession;->requestedPermissions:Ljava/util/List;
    //         sget-object v2, Lcom/facebook/AccessTokenSource;->TEST_USER:Lcom/facebook/AccessTokenSource;
    //         invoke-static {v0, v1, v2}, Lcom/facebook/AccessToken;->createFromString(Ljava/lang/String;Ljava/util/List;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v1}, Lcom/facebook/TestSession;->finishAuthOrReauth(Lcom/facebook/AccessToken;Ljava/lang/Exception;)V
    //         return-void
    */

    private fun getPermissionsString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const-string v0, ","
    //         iget-object v1, p0, Lcom/facebook/TestSession;->requestedPermissions:Ljava/util/List;
    //         invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private fun getSharedTestAccountIdentifier(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const-wide v4, 0xffffffffL
    //         invoke-direct {p0}, Lcom/facebook/TestSession;->getPermissionsString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         int-to-long v0, v0
    //         and-long v2, v0, v4
    //         iget-object v0, p0, Lcom/facebook/TestSession;->sessionUniqueUserTag:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/TestSession;->sessionUniqueUserTag:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         int-to-long v0, v0
    //         and-long/2addr v0, v4
    //         :goto_0
    //         xor-long/2addr v0, v2
    //         invoke-direct {p0, v0, v1}, Lcom/facebook/TestSession;->validNameStringFromInteger(J)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const-wide/16 v0, 0x0
    //         goto :goto_0
    */

    private fun validNameStringFromInteger(p0: Long): String { return TODO("body: (J)Ljava/lang/String;") }
    /*
    //         .locals 7
    //         const/4 v0, 0x0
    //         invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         const-string v2, "Perm"
    //         invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C
    //         move-result-object v4
    //         array-length v5, v4
    //         move v1, v0
    //         move v2, v0
    //         :goto_0
    //         if-ge v1, v5, :cond_1
    //         aget-char v0, v4, v1
    //         if-ne v0, v2, :cond_0
    //         add-int/lit8 v0, v0, 0xa
    //         int-to-char v0, v0
    //         :cond_0
    //         add-int/lit8 v2, v0, 0x61
    //         add-int/lit8 v2, v2, -0x30
    //         int-to-char v2, v2
    //         invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         add-int/lit8 v1, v1, 0x1
    //         move v2, v0
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    fun authorize(p0: com.facebook.Session.AuthorizationRequest) { /* TODO(body): (Lcom/facebook/Session$AuthorizationRequest;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/TestSession;->mode:Lcom/facebook/TestSession$Mode;
    //         sget-object v1, Lcom/facebook/TestSession$Mode;->PRIVATE:Lcom/facebook/TestSession$Mode;
    //         if-ne v0, v1, :cond_0
    //         invoke-direct {p0}, Lcom/facebook/TestSession;->createTestAccountAndFinishAuth()Lcom/facebook/TestSession$TestAccount;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-direct {p0}, Lcom/facebook/TestSession;->findOrCreateSharedTestAccount()V
    //         goto :goto_0
    */

    fun extendAccessToken() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/TestSession;->wasAskedToExtendAccessToken:Z
    //         invoke-super {p0}, Lcom/facebook/Session;->extendAccessToken()V
    //         return-void
    */

    fun fakeTokenRefreshAttempt() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/facebook/Session$TokenRefreshRequest;
    //         invoke-direct {v0, p0}, Lcom/facebook/Session$TokenRefreshRequest;-><init>(Lcom/facebook/Session;)V
    //         invoke-virtual {p0, v0}, Lcom/facebook/TestSession;->setCurrentTokenRefreshRequest(Lcom/facebook/Session$TokenRefreshRequest;)V
    //         return-void
    */

    fun forceExtendAccessToken(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 10
    //         const-wide/16 v8, 0x0
    //         invoke-virtual {p0}, Lcom/facebook/TestSession;->getTokenInfo()Lcom/facebook/AccessToken;
    //         move-result-object v4
    //         new-instance v0, Lcom/facebook/AccessToken;
    //         invoke-virtual {v4}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Ljava/util/Date;
    //         invoke-direct {v2}, Ljava/util/Date;-><init>()V
    //         invoke-virtual {v4}, Lcom/facebook/AccessToken;->getPermissions()Ljava/util/List;
    //         move-result-object v3
    //         invoke-virtual {v4}, Lcom/facebook/AccessToken;->getDeclinedPermissions()Ljava/util/List;
    //         move-result-object v4
    //         sget-object v5, Lcom/facebook/AccessTokenSource;->TEST_USER:Lcom/facebook/AccessTokenSource;
    //         new-instance v6, Ljava/util/Date;
    //         invoke-direct {v6, v8, v9}, Ljava/util/Date;-><init>(J)V
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
    //         invoke-virtual {p0, v0}, Lcom/facebook/TestSession;->setTokenInfo(Lcom/facebook/AccessToken;)V
    //         new-instance v0, Ljava/util/Date;
    //         invoke-direct {v0, v8, v9}, Ljava/util/Date;-><init>(J)V
    //         invoke-virtual {p0, v0}, Lcom/facebook/TestSession;->setLastAttemptedTokenExtendDate(Ljava/util/Date;)V
    //         return-void
    */

    public fun getTestUserId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/TestSession;->testAccountId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getTestUserName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/TestSession;->testAccountUserName:Ljava/lang/String;
    //         return-object v0
    */

    fun getWasAskedToExtendAccessToken(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/TestSession;->wasAskedToExtendAccessToken:Z
    //         return v0
    */

    fun postStateChange(p0: com.facebook.SessionState, p1: com.facebook.SessionState, p2: Exception) { /* TODO(body): (Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/TestSession;->testAccountId:Ljava/lang/String;
    //         invoke-super {p0, p1, p2, p3}, Lcom/facebook/Session;->postStateChange(Lcom/facebook/SessionState;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    //         invoke-virtual {p2}, Lcom/facebook/SessionState;->isClosed()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/TestSession;->mode:Lcom/facebook/TestSession$Mode;
    //         sget-object v2, Lcom/facebook/TestSession$Mode;->PRIVATE:Lcom/facebook/TestSession$Mode;
    //         if-ne v1, v2, :cond_0
    //         invoke-static {}, Lcom/facebook/TestSession;->getAppAccessToken()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {p0, v0, v1}, Lcom/facebook/TestSession;->deleteTestAccount(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    fun shouldExtendAccessToken(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-super {p0}, Lcom/facebook/Session;->shouldExtendAccessToken()Z
    //         move-result v0
    //         const/4 v1, 0x0
    //         iput-boolean v1, p0, Lcom/facebook/TestSession;->wasAskedToExtendAccessToken:Z
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-super {p0}, Lcom/facebook/Session;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "{TestSession"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " testUserId:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/TestSession;->testAccountId:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    val $assertionsDisabled: Boolean = false
    private val LOG_TAG: String = "FacebookSDK.TestSession"
    private var appTestAccounts: java.util.Map
    private val serialVersionUID: Long = 0x1L
    private var testApplicationId: String
    private var testApplicationSecret: String

    public @JvmStatic fun createSessionWithPrivateUser(p0: android.app.Activity, p1: java.util.List): com.facebook.TestSession { return TODO("body: (Landroid/app/Activity;Ljava/util/List;)Lcom/facebook/TestSession;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/app/Activity;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/facebook/TestSession;"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/facebook/TestSession$Mode;->PRIVATE:Lcom/facebook/TestSession$Mode;
    //         const/4 v1, 0x0
    //         invoke-static {p0, p1, v0, v1}, Lcom/facebook/TestSession;->createTestSession(Landroid/app/Activity;Ljava/util/List;Lcom/facebook/TestSession$Mode;Ljava/lang/String;)Lcom/facebook/TestSession;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun createSessionWithSharedUser(p0: android.app.Activity, p1: java.util.List): com.facebook.TestSession { return TODO("body: (Landroid/app/Activity;Ljava/util/List;)Lcom/facebook/TestSession;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/app/Activity;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/facebook/TestSession;"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-static {p0, p1, v0}, Lcom/facebook/TestSession;->createSessionWithSharedUser(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;)Lcom/facebook/TestSession;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun createSessionWithSharedUser(p0: android.app.Activity, p1: java.util.List, p2: String): com.facebook.TestSession { return TODO("body: (Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;)Lcom/facebook/TestSession;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/app/Activity;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Lcom/facebook/TestSession;"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/facebook/TestSession$Mode;->SHARED:Lcom/facebook/TestSession$Mode;
    //         invoke-static {p0, p1, v0, p2}, Lcom/facebook/TestSession;->createTestSession(Landroid/app/Activity;Ljava/util/List;Lcom/facebook/TestSession$Mode;Ljava/lang/String;)Lcom/facebook/TestSession;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun getAppAccessToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         sget-object v1, Lcom/facebook/TestSession;->testApplicationId:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "|"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/TestSession;->testApplicationSecret:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
