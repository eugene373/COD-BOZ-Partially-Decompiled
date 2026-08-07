// Auto-emitted from smali source: s3eFacebook.java.
// 7 fields, 10 methods.

open class s3eFacebook_s3eFBSession: com.ideaworks3d.marmalade.LoaderActivitySlave() {
    private var loginCallback: com.facebook.Session.StatusCallback
    public var m_AppID: String
    public var m_LegacyLogin: Boolean
    public var m_LoggedIn: Boolean
    public var m_Session: com.facebook.Session
    public var m_bIsActiveSession: Boolean
    val this$0: s3eFacebook

    constructor(p0: s3eFacebook, p1: String)

    public fun Close(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 5
    //         const/4 v0, 0x1
    //         :try_start_0
    //         const-string v1, "s3eFacebook"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "FBSession Close:"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         if-ne p1, v0, :cond_0
    //         const-string v1, "s3eFacebook"
    //         const-string v2, "Logout closeAndClearTokenInformation"
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v1}, Lcom/facebook/Session;->closeAndClearTokenInformation()V
    //         :goto_0
    //         const/4 v1, 0x0
    //         iput-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         const/4 v0, 0x0
    //         :goto_1
    //         return v0
    //         :cond_0
    //         iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v1}, Lcom/facebook/Session;->close()V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v2, "s3eFacebook"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Logout exception: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_1
    */

    public fun GetAccessToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "GetAccessToken - returning empty"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, ""
    //         goto :goto_0
    */

    public fun GetPermissions(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-interface {v1}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/List;->size()I
    //         move-result v0
    //         new-array v0, v0, [Ljava/lang/String;
    //         invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun IsActive(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         if-nez v1, :cond_0
    //         const-string v1, "s3eFacebook"
    //         const-string v2, "Session is empty."
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v2
    //         if-eq v1, v2, :cond_1
    //         const-string v1, "s3eFacebook"
    //         const-string v2, "Session is not active."
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "Session is active."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    fun LoggedIn(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "s3eFBSession LoggedIn"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         const-string v1, "s3eFacebook"
    //         if-nez v0, :cond_0
    //         const-string v0, "No active session."
    //         :goto_0
    //         invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         :goto_1
    //         return v0
    //         :cond_0
    //         const-string v0, "Active session found."
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v0
    //         goto :goto_1
    */

    fun Login(p0: Array<String>, p1: Int): Int { return TODO("body: ([Ljava/lang/String;I)I") }
    /*
    //         .locals 7
    //         const/4 v6, 0x2
    //         const/4 v2, 0x1
    //         const/4 v1, 0x0
    //         if-ne p2, v2, :cond_0
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "s3eFBSessionBehaviourWithNoFallbackToWebView not supported on android"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return v2
    //         :cond_0
    //         if-eq p2, v6, :cond_1
    //         const/4 v0, 0x4
    //         if-ne p2, v0, :cond_6
    //         :cond_1
    //         move v0, v2
    //         :goto_1
    //         iput-boolean v0, p0, Ls3eFacebook$s3eFBSession;->m_LegacyLogin:Z
    //         const/4 v3, 0x0
    //         iput-object v3, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         :try_start_0
    //         sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v3
    //         const-string v4, "com.facebook.katana"
    //         const/4 v5, 0x0
    //         invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //         const-string v3, "s3eFacebook"
    //         const-string v4, "Facebook App (com.facebook.katana) detected."
    //         invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move v3, v2
    //         :goto_2
    //         iget-object v4, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         if-nez v4, :cond_3
    //         new-instance v4, Lcom/facebook/Session$Builder;
    //         sget-object v5, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-direct {v4, v5}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V
    //         iget-object v5, p0, Ls3eFacebook$s3eFBSession;->m_AppID:Ljava/lang/String;
    //         invoke-virtual {v4, v5}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;
    //         move-result-object v4
    //         if-nez v3, :cond_2
    //         if-ne p2, v6, :cond_d
    //         :cond_2
    //         const-string v3, "s3eFacebook"
    //         const-string v5, "Login closeAndClearTokenInformation"
    //         invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {v4}, Lcom/facebook/Session;->closeAndClearTokenInformation()V
    //         new-instance v3, Lcom/facebook/Session$Builder;
    //         sget-object v4, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-direct {v3, v4}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V
    //         iget-object v4, p0, Ls3eFacebook$s3eFBSession;->m_AppID:Ljava/lang/String;
    //         invoke-virtual {v3, v4}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;
    //         move-result-object v3
    //         :goto_3
    //         iput-object v3, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         :cond_3
    //         sget-object v3, Lcom/facebook/SessionState;->CREATED_TOKEN_LOADED:Lcom/facebook/SessionState;
    //         iget-object v4, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v4}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Lcom/facebook/SessionState;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_4
    //         const-string v3, "s3eFacebook"
    //         const-string v4, "Login: CREATED_TOKEN_LOADED state."
    //         invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_4
    //         if-eqz v0, :cond_7
    //         const-string v0, "s3eFacebook"
    //         const-string v3, "Login: Using legacy webDialog login."
    //         invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/facebook/Session$OpenRequest;
    //         sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-direct {v0, v3}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V
    //         sget-object v3, Lcom/facebook/SessionLoginBehavior;->SUPPRESS_SSO:Lcom/facebook/SessionLoginBehavior;
    //         invoke-virtual {v0, v3}, Lcom/facebook/Session$OpenRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$OpenRequest;
    //         const/4 v3, -0x1
    //         invoke-virtual {v0, v3}, Lcom/facebook/Session$OpenRequest;->setRequestCode(I)Lcom/facebook/Session$OpenRequest;
    //         array-length v3, p1
    //         if-lez v3, :cond_c
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v3
    //         invoke-virtual {v0, v3}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;
    //         move-object v3, v0
    //         :goto_4
    //         if-eqz v3, :cond_5
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->loginCallback:Lcom/facebook/Session$StatusCallback;
    //         invoke-virtual {v3, v0}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;
    //         :cond_5
    //         const-string v4, "s3eFacebook"
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Login: "
    //         invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         if-nez v3, :cond_9
    //         const-string v0, "Opening using cached token."
    //         :goto_5
    //         invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_start_1
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v0, v3}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    //         if-nez v3, :cond_b
    //         sget-object v0, Lcom/facebook/SessionState;->OPENED:Lcom/facebook/SessionState;
    //         iget-object v3, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v3}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;
    //         move-result-object v3
    //         invoke-virtual {v0, v3}, Lcom/facebook/SessionState;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_a
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;
    //         invoke-virtual {v0, p0, v2}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_6
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_b
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v3, "s3eFacebook"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "permission: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_6
    //         :cond_6
    //         move v0, v1
    //         goto/16 :goto_1
    //         :catch_0
    //         move-exception v3
    //         const-string v3, "s3eFacebook"
    //         const-string v4, "Facebook App (com.facebook.katana) missing."
    //         invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         move v3, v1
    //         goto/16 :goto_2
    //         :cond_7
    //         const-string v0, "s3eFacebook"
    //         const-string v3, "Login: Using facebook app for login."
    //         invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v0, Lcom/facebook/Session$OpenRequest;
    //         sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-direct {v0, v3}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V
    //         array-length v3, p1
    //         if-lez v3, :cond_8
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v3
    //         invoke-virtual {v0, v3}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;
    //         :cond_8
    //         move-object v3, v0
    //         goto/16 :goto_4
    //         :cond_9
    //         const-string v0, "Opening for read."
    //         goto :goto_5
    //         :catch_1
    //         move-exception v0
    //         const-string v3, "s3eFacebook"
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Login: openForRead exception: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;
    //         invoke-virtual {v0, p0, v1}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V
    //         goto/16 :goto_0
    //         :cond_a
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;
    //         invoke-virtual {v0, p0, v1}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V
    //         :cond_b
    //         move v2, v1
    //         goto/16 :goto_0
    //         :cond_c
    //         move-object v3, v0
    //         goto/16 :goto_4
    //         :cond_d
    //         move-object v3, v4
    //         goto/16 :goto_3
    */

    public fun ReauthorizeWithPermissions(p0: Array<String>, p1: Int, p2: Boolean): Int { return TODO("body: ([Ljava/lang/String;IZ)I") }
    /*
    //         .locals 4
    //         new-instance v1, Ls3eFacebook$s3eFBSession$1;
    //         invoke-direct {v1, p0}, Ls3eFacebook$s3eFBSession$1;-><init>(Ls3eFacebook$s3eFBSession;)V
    //         new-instance v0, Lcom/facebook/Session$NewPermissionsRequest;
    //         sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v3
    //         invoke-direct {v0, v2, v3}, Lcom/facebook/Session$NewPermissionsRequest;-><init>(Landroid/app/Activity;Ljava/util/List;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session$NewPermissionsRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$NewPermissionsRequest;
    //         iget-boolean v1, p0, Ls3eFacebook$s3eFBSession;->m_LegacyLogin:Z
    //         if-eqz v1, :cond_0
    //         sget-object v1, Lcom/facebook/SessionLoginBehavior;->SUPPRESS_SSO:Lcom/facebook/SessionLoginBehavior;
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session$NewPermissionsRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$NewPermissionsRequest;
    //         move-result-object v0
    //         const/4 v1, -0x1
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session$NewPermissionsRequest;->setRequestCode(I)Lcom/facebook/Session$NewPermissionsRequest;
    //         move-result-object v0
    //         :cond_0
    //         if-eqz p3, :cond_1
    //         iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v1, v0}, Lcom/facebook/Session;->requestNewPublishPermissions(Lcom/facebook/Session$NewPermissionsRequest;)V
    //         invoke-static {p2}, Ls3eFacebook$s3eFacebookAudience;->fromInt(I)Lcom/facebook/SessionDefaultAudience;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/Session$NewPermissionsRequest;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$NewPermissionsRequest;
    //         :goto_0
    //         const/4 v0, 0x0
    //         return v0
    //         :cond_1
    //         iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         invoke-virtual {v1, v0}, Lcom/facebook/Session;->requestNewReadPermissions(Lcom/facebook/Session$NewPermissionsRequest;)V
    //         goto :goto_0
    */

    public fun SetNotActive() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Ls3eFacebook$s3eFBSession;->m_bIsActiveSession:Z
    //         const/4 v0, 0x0
    //         invoke-static {v0}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V
    //         return-void
    */

    public fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "s3eFacebook"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "LoginActivity request: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " result: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eFacebook"
    //         const-string v1, "m_Session is null - ignoring"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0, v1, p1, p2, p3}, Lcom/facebook/Session;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z
    //         goto :goto_0
    */

}
