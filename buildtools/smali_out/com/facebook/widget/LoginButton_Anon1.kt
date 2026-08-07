package com.facebook.widget

// Auto-emitted from smali source: LoginButton.java.
// 2 fields, 5 methods.

open class LoginButton_Anon1: android.os.AsyncTask() {
    val this$0: com.facebook.widget.LoginButton
    val val$appId: String

    constructor(p0: com.facebook.widget.LoginButton, p1: String)

    protected fun doInBackground(p0: Array<Void>): com.facebook.internal.Utility.FetchedAppSettings { return TODO("body: ([Ljava/lang/Void;)Lcom/facebook/internal/Utility$FetchedAppSettings;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$1;->val$appId:Ljava/lang/String;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->queryAppSettings(Ljava/lang/String;Z)Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Ljava/lang/Void;
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/LoginButton$1;->doInBackground([Ljava/lang/Void;)Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun onPostExecute(p0: com.facebook.internal.Utility.FetchedAppSettings) { /* TODO(body): (Lcom/facebook/internal/Utility$FetchedAppSettings;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LoginButton$1;->this$0:Lcom/facebook/widget/LoginButton;
    //         invoke-static {v0, p1}, Lcom/facebook/widget/LoginButton;->access$300(Lcom/facebook/widget/LoginButton;Lcom/facebook/internal/Utility$FetchedAppSettings;)V
    //         return-void
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/LoginButton$1;->onPostExecute(Lcom/facebook/internal/Utility$FetchedAppSettings;)V
    //         return-void
    */

}
