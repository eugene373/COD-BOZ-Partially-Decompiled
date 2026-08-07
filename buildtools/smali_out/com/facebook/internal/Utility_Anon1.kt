package com.facebook.internal

// Auto-emitted from smali source: Utility.java.
// 3 fields, 5 methods.

class Utility_Anon1: android.os.AsyncTask() {
    val val$applicationId: String
    val val$context: android.content.Context
    val val$settingsKey: String

    constructor(p0: String, p1: android.content.Context, p2: String)

    protected fun doInBackground(p0: Array<Void>): com.facebook.model.GraphObject { return TODO("body: ([Ljava/lang/Void;)Lcom/facebook/model/GraphObject;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/Utility$1;->val$applicationId:Ljava/lang/String;
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->access$000(Ljava/lang/String;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Ljava/lang/Void;
    //         invoke-virtual {p0, p1}, Lcom/facebook/internal/Utility$1;->doInBackground([Ljava/lang/Void;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun onPostExecute(p0: com.facebook.model.GraphObject) { /* TODO(body): (Lcom/facebook/model/GraphObject;)V */ }
    /*
    //         .locals 4
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/internal/Utility$1;->val$applicationId:Ljava/lang/String;
    //         invoke-static {v1, v0}, Lcom/facebook/internal/Utility;->access$100(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         iget-object v1, p0, Lcom/facebook/internal/Utility$1;->val$context:Landroid/content/Context;
    //         const-string v2, "com.facebook.internal.preferences.APP_SETTINGS"
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v1
    //         invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/internal/Utility$1;->val$settingsKey:Ljava/lang/String;
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    //         :cond_0
    //         const/4 v0, 0x0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->access$202(Landroid/os/AsyncTask;)Landroid/os/AsyncTask;
    //         return-void
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/facebook/model/GraphObject;
    //         invoke-virtual {p0, p1}, Lcom/facebook/internal/Utility$1;->onPostExecute(Lcom/facebook/model/GraphObject;)V
    //         return-void
    */

}
