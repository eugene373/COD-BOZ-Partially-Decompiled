package android.support.v4.app

// Auto-emitted from smali source: RemoteInput.java.
// 0 fields, 3 methods.

open class RemoteInput_ImplBase: android.support.v4.app.RemoteInput.Impl {
    constructor()

    public fun addResultsToIntent(remoteInputs: Array<android.support.v4.app.RemoteInput>, intent: android.content.Intent, results: android.os.Bundle) { /* TODO(body): ([Landroid/support/v4/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "RemoteInput"
    //         const-string v1, "RemoteInput is only supported from API Level 16"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun getResultsFromIntent(intent: android.content.Intent): android.os.Bundle { return TODO("body: (Landroid/content/Intent;)Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         const-string v0, "RemoteInput"
    //         const-string v1, "RemoteInput is only supported from API Level 16"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         return-object v0
    */

}
