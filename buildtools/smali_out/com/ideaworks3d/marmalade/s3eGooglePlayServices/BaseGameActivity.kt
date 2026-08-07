package com.ideaworks3d.marmalade.s3eGooglePlayServices

// Auto-emitted from smali source: BaseGameActivity.java.
// 9 fields, 21 methods.

open class BaseGameActivity: com.ideaworks3d.marmalade.LoaderActivitySlave(), com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper.GameHelperListener {
    protected var mDebugLog: Boolean
    protected var mHelper: com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper
    protected var mRequestedClients: Int
    protected var m_Service: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServices

    protected constructor()

    protected constructor(p0: Int)

    protected fun beginUserInitiatedSignIn() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const-string v0, "BasicGameActivity"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "beginUserInitiatedSignIn: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->beginUserInitiatedSignIn()V
    //         return-void
    */

    protected fun enableDebugLog(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mDebugLog:Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->enableDebugLog(Z)V
    //         :cond_0
    //         return-void
    */

    protected fun enableDebugLog(p0: Boolean, p1: String) { /* TODO(body): (ZLjava/lang/String;)V */ }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-string v0, "BaseGameActivity"
    //         const-string v1, "BaseGameActivity.enabledDebugLog(bool,String) is deprecated. Use enableDebugLog(boolean)"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->enableDebugLog(Z)V
    //         return-void
    */

    public fun getApiClient(): com.google.android.gms.common.api.GoogleApiClient { return TODO("body: ()Lcom/google/android/gms/common/api/GoogleApiClient;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getGameHelper(): com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper { return TODO("body: ()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->getActivity()Landroid/app/Activity;
    //         move-result-object v1
    //         iget v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mRequestedClients:I
    //         invoke-direct {v0, v1, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;-><init>(Landroid/app/Activity;I)V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mDebugLog:Z
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->enableDebugLog(Z)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         return-object v0
    */

    protected fun getInvitationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getInvitationId()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun getSignInError(): com.ideaworks3d.marmalade.s3eGooglePlayServices.GameHelper.SignInFailureReason { return TODO("body: ()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->getSignInError()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$SignInFailureReason;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun hasSignInError(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->hasSignInError()Z
    //         move-result v0
    //         return v0
    */

    protected fun isSignedIn(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->isSignedIn()Z
    //         move-result v0
    //         return v0
    */

    protected fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "BasicGameActivity"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onActivityResult request = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ", response = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ", data = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-super {p0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onActivityResult(IILandroid/content/Intent;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->m_Service:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->onActivityResult(IILandroid/content/Intent;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->onActivityResult(IILandroid/content/Intent;)V
    //         :cond_0
    //         return-void
    */

    protected fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "BasicGameActivity"
    //         const-string v1, "onCreate"
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-super {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onCreate(Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->getGameHelper()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->setup(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper$GameHelperListener;)V
    //         return-void
    */

    protected fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onStart()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->getActivity()Landroid/app/Activity;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->onStart(Landroid/app/Activity;)V
    //         return-void
    */

    protected fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onStop()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->onStop()V
    //         return-void
    */

    protected fun reconnectClient() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->reconnectClient()V
    //         return-void
    */

    protected fun setRequestedClients(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mRequestedClients:I
    //         return-void
    */

    public fun setServiceInterface(p0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServices) { /* TODO(body): (Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->m_Service:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;
    //         return-void
    */

    protected fun showAlert(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Ljava/lang/String;)Landroid/app/Dialog;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/app/Dialog;->show()V
    //         return-void
    */

    protected fun showAlert(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->makeSimpleDialog(Ljava/lang/String;Ljava/lang/String;)Landroid/app/Dialog;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/app/Dialog;->show()V
    //         return-void
    */

    protected fun signOut() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/BaseGameActivity;->mHelper:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/GameHelper;->signOut()V
    //         return-void
    */

    companion object {
    @JvmField public val CLIENT_ALL: Int = 0xf
    @JvmField public val CLIENT_APPSTATE: Int = 0x4
    @JvmField public val CLIENT_GAMES: Int = 0x1
    @JvmField public val CLIENT_PLUS: Int = 0x2
    private val TAG: String = "BaseGameActivity"
    }
}
