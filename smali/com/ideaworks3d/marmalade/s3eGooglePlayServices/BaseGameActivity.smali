.class public abstract Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;
.super Lcom/ideaworks3d/marmalade/LoaderActivitySlave;
.source "BaseGameActivity.java"

# interfaces
.implements Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;


# static fields
.field public static final CLIENT_ALL:I = 0xf

.field public static final CLIENT_APPSTATE:I = 0x4

.field public static final CLIENT_GAMES:I = 0x1

.field public static final CLIENT_PLUS:I = 0x2

.field private static final TAG:Ljava/lang/String; = "BaseGameActivity"


# instance fields
.field protected mDebugLog:Z

.field protected mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

.field protected mRequestedClients:I

.field protected m_Service:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;-><init>()V

    .line 68
    const/4 v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mRequestedClients:I

    .line 71
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mDebugLog:Z

    .line 78
    return-void
.end method

.method protected constructor <init>(I)V
    .locals 1

    .prologue
    .line 86
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;-><init>()V

    .line 68
    const/4 v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mRequestedClients:I

    .line 71
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mDebugLog:Z

    .line 87
    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->setRequestedClients(I)V

    .line 88
    return-void
.end method


# virtual methods
.method protected beginUserInitiatedSignIn()V
    .locals 3

    .prologue
    .line 158
    const-string v0, "BasicGameActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "beginUserInitiatedSignIn: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->beginUserInitiatedSignIn()V

    .line 160
    return-void
.end method

.method protected enableDebugLog(Z)V
    .locals 1

    .prologue
    .line 175
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mDebugLog:Z

    .line 176
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->enableDebugLog(Z)V

    .line 179
    :cond_0
    return-void
.end method

.method protected enableDebugLog(ZLjava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 183
    const-string v0, "BaseGameActivity"

    const-string v1, "BaseGameActivity.enabledDebugLog(bool,String) is deprecated. Use enableDebugLog(boolean)"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->enableDebugLog(Z)V

    .line 186
    return-void
.end method

.method public getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    return-object v0
.end method

.method public getGameHelper()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    .locals 3

    .prologue
    .line 105
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    if-nez v0, :cond_0

    .line 106
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mRequestedClients:I

    invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;-><init>(Landroid/app/Activity;I)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    .line 107
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mDebugLog:Z

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->enableDebugLog(Z)V

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    return-object v0
.end method

.method protected getInvitationId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getInvitationId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getSignInError()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getSignInError()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;

    move-result-object v0

    return-object v0
.end method

.method protected hasSignInError()Z
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->hasSignInError()Z

    move-result v0

    return v0
.end method

.method protected isSignedIn()Z
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->isSignedIn()Z

    move-result v0

    return v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 141
    const-string v0, "BasicGameActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onActivityResult request = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", response = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", data = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    invoke-super {p0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onActivityResult(IILandroid/content/Intent;)V

    .line 143
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->m_Service:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->onActivityResult(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->onActivityResult(IILandroid/content/Intent;)V

    .line 147
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 114
    const-string v0, "BasicGameActivity"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    invoke-super {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onCreate(Landroid/os/Bundle;)V

    .line 116
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    if-nez v0, :cond_0

    .line 117
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->getGameHelper()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->setup(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;)V

    .line 120
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 129
    invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onStart()V

    .line 130
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->onStart(Landroid/app/Activity;)V

    .line 131
    return-void
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 135
    invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onStop()V

    .line 136
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->onStop()V

    .line 137
    return-void
.end method

.method protected reconnectClient()V
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->reconnectClient()V

    .line 194
    return-void
.end method

.method protected setRequestedClients(I)V
    .locals 0

    .prologue
    .line 101
    iput p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mRequestedClients:I

    .line 102
    return-void
.end method

.method public setServiceInterface(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->m_Service:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;

    .line 125
    return-void
.end method

.method protected showAlert(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 168
    return-void
.end method

.method protected showAlert(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 172
    return-void
.end method

.method protected signOut()V
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->signOut()V

    .line 164
    return-void
.end method
