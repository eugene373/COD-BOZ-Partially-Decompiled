.class Ls3eFacebook$s3eFBSession;
.super Lcom/ideaworks3d/marmalade/LoaderActivitySlave;
.source "s3eFacebook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3eFacebook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "s3eFBSession"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3eFacebook$s3eFBSession$SessionLoginCallback;
    }
.end annotation


# instance fields
.field private loginCallback:Lcom/facebook/Session$StatusCallback;

.field public m_AppID:Ljava/lang/String;

.field public m_LegacyLogin:Z

.field public m_LoggedIn:Z

.field public m_Session:Lcom/facebook/Session;

.field public m_bIsActiveSession:Z

.field final synthetic this$0:Ls3eFacebook;


# direct methods
.method constructor <init>(Ls3eFacebook;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 134
    iput-object p1, p0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;-><init>()V

    .line 121
    new-instance v0, Ls3eFacebook$s3eFBSession$SessionLoginCallback;

    invoke-direct {v0, p0, v2}, Ls3eFacebook$s3eFBSession$SessionLoginCallback;-><init>(Ls3eFacebook$s3eFBSession;Ls3eFacebook$1;)V

    iput-object v0, p0, Ls3eFacebook$s3eFBSession;->loginCallback:Lcom/facebook/Session$StatusCallback;

    .line 135
    iput-object p2, p0, Ls3eFacebook$s3eFBSession;->m_AppID:Ljava/lang/String;

    .line 136
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {p1, v0}, Ls3eFacebook;->access$102(Ls3eFacebook;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences;

    .line 137
    iput-object v2, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    .line 138
    return-void
.end method


# virtual methods
.method public Close(I)I
    .locals 5

    .prologue
    const/4 v0, 0x1

    .line 302
    :try_start_0
    const-string v1, "s3eFacebook"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FBSession Close:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 303
    if-ne p1, v0, :cond_0

    .line 305
    const-string v1, "s3eFacebook"

    const-string v2, "Logout closeAndClearTokenInformation"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 306
    iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v1}, Lcom/facebook/Session;->closeAndClearTokenInformation()V

    .line 310
    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    .line 317
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 309
    :cond_0
    iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v1}, Lcom/facebook/Session;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 312
    :catch_0
    move-exception v1

    .line 314
    const-string v2, "s3eFacebook"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Logout exception: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method public GetAccessToken()Ljava/lang/String;
    .locals 2

    .prologue
    .line 334
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    if-eqz v0, :cond_0

    .line 336
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v0}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    .line 341
    :goto_0
    return-object v0

    .line 340
    :cond_0
    const-string v0, "s3eFacebook"

    const-string v1, "GetAccessToken - returning empty"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 341
    const-string v0, ""

    goto :goto_0
.end method

.method public GetPermissions()[Ljava/lang/String;
    .locals 2

    .prologue
    .line 322
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;

    move-result-object v1

    .line 323
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 325
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    .line 326
    invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 329
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public IsActive()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 283
    iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    if-nez v1, :cond_0

    .line 285
    const-string v1, "s3eFacebook"

    const-string v2, "Session is empty."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 295
    :goto_0
    return v0

    .line 288
    :cond_0
    iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v2

    if-eq v1, v2, :cond_1

    .line 290
    const-string v1, "s3eFacebook"

    const-string v2, "Session is not active."

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 294
    :cond_1
    const-string v0, "s3eFacebook"

    const-string v1, "Session is active."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 295
    const/4 v0, 0x1

    goto :goto_0
.end method

.method LoggedIn()Z
    .locals 2

    .prologue
    .line 255
    const-string v0, "s3eFacebook"

    const-string v1, "s3eFBSession LoggedIn"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 256
    invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;

    move-result-object v0

    .line 257
    const-string v1, "s3eFacebook"

    if-nez v0, :cond_0

    const-string v0, "No active session."

    :goto_0
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 261
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    if-nez v0, :cond_1

    .line 262
    const/4 v0, 0x0

    .line 272
    :goto_1
    return v0

    .line 257
    :cond_0
    const-string v0, "Active session found."

    goto :goto_0

    .line 272
    :cond_1
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z

    move-result v0

    goto :goto_1
.end method

.method Login([Ljava/lang/String;I)I
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 142
    if-ne p2, v2, :cond_0

    .line 144
    const-string v0, "s3eFacebook"

    const-string v1, "s3eFBSessionBehaviourWithNoFallbackToWebView not supported on android"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 250
    :goto_0
    return v2

    .line 148
    :cond_0
    if-eq p2, v6, :cond_1

    const/4 v0, 0x4

    if-ne p2, v0, :cond_6

    :cond_1
    move v0, v2

    .line 150
    :goto_1
    iput-boolean v0, p0, Ls3eFacebook$s3eFBSession;->m_LegacyLogin:Z

    .line 152
    const/4 v3, 0x0

    iput-object v3, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    .line 157
    :try_start_0
    sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 158
    const-string v4, "com.facebook.katana"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 159
    const-string v3, "s3eFacebook"

    const-string v4, "Facebook App (com.facebook.katana) detected."

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move v3, v2

    .line 167
    :goto_2
    iget-object v4, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    if-nez v4, :cond_3

    .line 169
    new-instance v4, Lcom/facebook/Session$Builder;

    sget-object v5, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {v4, v5}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V

    iget-object v5, p0, Ls3eFacebook$s3eFBSession;->m_AppID:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;

    move-result-object v4

    .line 176
    if-nez v3, :cond_2

    if-ne p2, v6, :cond_d

    .line 178
    :cond_2
    const-string v3, "s3eFacebook"

    const-string v5, "Login closeAndClearTokenInformation"

    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    invoke-virtual {v4}, Lcom/facebook/Session;->closeAndClearTokenInformation()V

    .line 180
    new-instance v3, Lcom/facebook/Session$Builder;

    sget-object v4, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {v3, v4}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V

    iget-object v4, p0, Ls3eFacebook$s3eFBSession;->m_AppID:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;

    move-result-object v3

    .line 184
    :goto_3
    iput-object v3, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    .line 189
    :cond_3
    sget-object v3, Lcom/facebook/SessionState;->CREATED_TOKEN_LOADED:Lcom/facebook/SessionState;

    iget-object v4, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v4}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/SessionState;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 191
    const-string v3, "s3eFacebook"

    const-string v4, "Login: CREATED_TOKEN_LOADED state."

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 197
    :cond_4
    if-eqz v0, :cond_7

    .line 199
    const-string v0, "s3eFacebook"

    const-string v3, "Login: Using legacy webDialog login."

    invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    new-instance v0, Lcom/facebook/Session$OpenRequest;

    sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {v0, v3}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V

    .line 202
    sget-object v3, Lcom/facebook/SessionLoginBehavior;->SUPPRESS_SSO:Lcom/facebook/SessionLoginBehavior;

    invoke-virtual {v0, v3}, Lcom/facebook/Session$OpenRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$OpenRequest;

    .line 203
    const/4 v3, -0x1

    invoke-virtual {v0, v3}, Lcom/facebook/Session$OpenRequest;->setRequestCode(I)Lcom/facebook/Session$OpenRequest;

    .line 204
    array-length v3, p1

    if-lez v3, :cond_c

    .line 205
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;

    move-object v3, v0

    .line 216
    :goto_4
    if-eqz v3, :cond_5

    .line 218
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->loginCallback:Lcom/facebook/Session$StatusCallback;

    invoke-virtual {v3, v0}, Lcom/facebook/Session$OpenRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$OpenRequest;

    .line 222
    :cond_5
    const-string v4, "s3eFacebook"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Login: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    if-nez v3, :cond_9

    const-string v0, "Opening using cached token."

    :goto_5
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 226
    :try_start_1
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v0, v3}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 235
    if-nez v3, :cond_b

    .line 236
    sget-object v0, Lcom/facebook/SessionState;->OPENED:Lcom/facebook/SessionState;

    iget-object v3, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v3}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/SessionState;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 237
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;

    invoke-virtual {v0, p0, v2}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V

    .line 239
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v0}, Lcom/facebook/Session;->getPermissions()Ljava/util/List;

    move-result-object v0

    .line 240
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 242
    const-string v3, "s3eFacebook"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "permission: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :cond_6
    move v0, v1

    .line 148
    goto/16 :goto_1

    .line 162
    :catch_0
    move-exception v3

    .line 164
    const-string v3, "s3eFacebook"

    const-string v4, "Facebook App (com.facebook.katana) missing."

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move v3, v1

    goto/16 :goto_2

    .line 209
    :cond_7
    const-string v0, "s3eFacebook"

    const-string v3, "Login: Using facebook app for login."

    invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    new-instance v0, Lcom/facebook/Session$OpenRequest;

    sget-object v3, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {v0, v3}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V

    .line 212
    array-length v3, p1

    if-lez v3, :cond_8

    .line 213
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;

    :cond_8
    move-object v3, v0

    goto/16 :goto_4

    .line 222
    :cond_9
    const-string v0, "Opening for read."

    goto :goto_5

    .line 228
    :catch_1
    move-exception v0

    .line 230
    const-string v3, "s3eFacebook"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Login: openForRead exception: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 231
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;

    invoke-virtual {v0, p0, v1}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    .line 246
    :cond_a
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->this$0:Ls3eFacebook;

    invoke-virtual {v0, p0, v1}, Ls3eFacebook;->nativeLoginCallback(Ljava/lang/Object;Z)V

    :cond_b
    move v2, v1

    .line 250
    goto/16 :goto_0

    :cond_c
    move-object v3, v0

    goto/16 :goto_4

    :cond_d
    move-object v3, v4

    goto/16 :goto_3
.end method

.method public ReauthorizeWithPermissions([Ljava/lang/String;IZ)I
    .locals 4

    .prologue
    .line 347
    new-instance v1, Ls3eFacebook$s3eFBSession$1;

    invoke-direct {v1, p0}, Ls3eFacebook$s3eFBSession$1;-><init>(Ls3eFacebook$s3eFBSession;)V

    .line 368
    new-instance v0, Lcom/facebook/Session$NewPermissionsRequest;

    sget-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/facebook/Session$NewPermissionsRequest;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    .line 369
    invoke-virtual {v0, v1}, Lcom/facebook/Session$NewPermissionsRequest;->setCallback(Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session$NewPermissionsRequest;

    .line 371
    iget-boolean v1, p0, Ls3eFacebook$s3eFBSession;->m_LegacyLogin:Z

    if-eqz v1, :cond_0

    .line 373
    sget-object v1, Lcom/facebook/SessionLoginBehavior;->SUPPRESS_SSO:Lcom/facebook/SessionLoginBehavior;

    invoke-virtual {v0, v1}, Lcom/facebook/Session$NewPermissionsRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$NewPermissionsRequest;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/facebook/Session$NewPermissionsRequest;->setRequestCode(I)Lcom/facebook/Session$NewPermissionsRequest;

    move-result-object v0

    .line 376
    :cond_0
    if-eqz p3, :cond_1

    .line 378
    iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v1, v0}, Lcom/facebook/Session;->requestNewPublishPermissions(Lcom/facebook/Session$NewPermissionsRequest;)V

    .line 379
    invoke-static {p2}, Ls3eFacebook$s3eFacebookAudience;->fromInt(I)Lcom/facebook/SessionDefaultAudience;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/Session$NewPermissionsRequest;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$NewPermissionsRequest;

    .line 386
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 383
    :cond_1
    iget-object v1, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    invoke-virtual {v1, v0}, Lcom/facebook/Session;->requestNewReadPermissions(Lcom/facebook/Session$NewPermissionsRequest;)V

    goto :goto_0
.end method

.method public SetNotActive()V
    .locals 1

    .prologue
    .line 277
    const/4 v0, 0x0

    iput-boolean v0, p0, Ls3eFacebook$s3eFBSession;->m_bIsActiveSession:Z

    .line 278
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V

    .line 279
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 126
    const-string v0, "s3eFacebook"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LoginActivity request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    if-nez v0, :cond_0

    .line 128
    const-string v0, "s3eFacebook"

    const-string v1, "m_Session is null - ignoring"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    :goto_0
    return-void

    .line 130
    :cond_0
    iget-object v0, p0, Ls3eFacebook$s3eFBSession;->m_Session:Lcom/facebook/Session;

    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/facebook/Session;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)Z

    goto :goto_0
.end method
