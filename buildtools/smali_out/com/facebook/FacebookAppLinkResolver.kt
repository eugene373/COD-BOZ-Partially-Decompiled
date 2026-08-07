package com.facebook

// Auto-emitted from smali source: FacebookAppLinkResolver.java.
// 9 fields, 10 methods.

open class FacebookAppLinkResolver: bolts.AppLinkResolver {
    private val cachedAppLinks: java.util.HashMap

    public constructor()

    public fun getAppLinkFromUrlInBackground(p0: android.net.Uri): bolts.Task { return TODO("body: (Landroid/net/Uri;)Lbolts/Task;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/net/Uri;",
    //                 ")",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Lbolts/AppLink;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         invoke-virtual {p0, v0}, Lcom/facebook/FacebookAppLinkResolver;->getAppLinkFromUrlsInBackground(Ljava/util/List;)Lbolts/Task;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/FacebookAppLinkResolver$1;
    //         invoke-direct {v1, p0, p1}, Lcom/facebook/FacebookAppLinkResolver$1;-><init>(Lcom/facebook/FacebookAppLinkResolver;Landroid/net/Uri;)V
    //         invoke-virtual {v0, v1}, Lbolts/Task;->onSuccess(Lbolts/Continuation;)Lbolts/Task;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAppLinkFromUrlsInBackground(p0: java.util.List): bolts.Task { return TODO("body: (Ljava/util/List;)Lbolts/Task;") }
    /*
    //         .locals 10
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/net/Uri;",
    //                 ">;)",
    //                 "Lbolts/Task",
    //                 "<",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Landroid/net/Uri;",
    //                 "Lbolts/AppLink;",
    //                 ">;>;"
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         new-instance v4, Ljava/util/HashMap;
    //         invoke-direct {v4}, Ljava/util/HashMap;-><init>()V
    //         new-instance v6, Ljava/util/HashSet;
    //         invoke-direct {v6}, Ljava/util/HashSet;-><init>()V
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/Uri;
    //         iget-object v7, p0, Lcom/facebook/FacebookAppLinkResolver;->cachedAppLinks:Ljava/util/HashMap;
    //         monitor-enter v7
    //         :try_start_0
    //         iget-object v2, p0, Lcom/facebook/FacebookAppLinkResolver;->cachedAppLinks:Ljava/util/HashMap;
    //         invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Lbolts/AppLink;
    //         monitor-exit v7
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v2, :cond_0
    //         invoke-interface {v4, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v7
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    //         :cond_0
    //         invoke-virtual {v6}, Ljava/util/HashSet;->isEmpty()Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         const/16 v2, 0x2c
    //         invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         :cond_1
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v6, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {v6}, Ljava/util/HashSet;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-static {v4}, Lbolts/Task;->forResult(Ljava/lang/Object;)Lbolts/Task;
    //         move-result-object v0
    //         :goto_1
    //         return-object v0
    //         :cond_3
    //         invoke-static {}, Lbolts/Task;->create()Lbolts/Task$TaskCompletionSource;
    //         move-result-object v7
    //         new-instance v3, Landroid/os/Bundle;
    //         invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
    //         const-string v0, "ids"
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "fields"
    //         const-string v2, "%s.fields(%s,%s)"
    //         const/4 v5, 0x3
    //         new-array v5, v5, [Ljava/lang/Object;
    //         const/4 v8, 0x0
    //         const-string v9, "app_links"
    //         aput-object v9, v5, v8
    //         const/4 v8, 0x1
    //         const-string v9, "android"
    //         aput-object v9, v5, v8
    //         const/4 v8, 0x2
    //         const-string v9, "web"
    //         aput-object v9, v5, v8
    //         invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, ""
    //         new-instance v5, Lcom/facebook/FacebookAppLinkResolver$2;
    //         invoke-direct {v5, p0, v7, v4, v6}, Lcom/facebook/FacebookAppLinkResolver$2;-><init>(Lcom/facebook/FacebookAppLinkResolver;Lbolts/Task$TaskCompletionSource;Ljava/util/Map;Ljava/util/HashSet;)V
    //         move-object v4, v1
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         invoke-virtual {v7}, Lbolts/Task$TaskCompletionSource;->getTask()Lbolts/Task;
    //         move-result-object v0
    //         goto :goto_1
    */

    companion object {
    private val APP_LINK_ANDROID_TARGET_KEY: String = "android"
    private val APP_LINK_KEY: String = "app_links"
    private val APP_LINK_TARGET_APP_NAME_KEY: String = "app_name"
    private val APP_LINK_TARGET_CLASS_KEY: String = "class"
    private val APP_LINK_TARGET_PACKAGE_KEY: String = "package"
    private val APP_LINK_TARGET_SHOULD_FALLBACK_KEY: String = "should_fallback"
    private val APP_LINK_TARGET_URL_KEY: String = "url"
    private val APP_LINK_WEB_TARGET_KEY: String = "web"

    private @JvmStatic fun getAndroidTargetFromJson(p0: org.json.JSONObject): bolts.AppLink.Target { return TODO("body: (Lorg/json/JSONObject;)Lbolts/AppLink$Target;") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         const-string v1, "package"
    //         invoke-static {p0, v1, v0}, Lcom/facebook/FacebookAppLinkResolver;->tryGetStringFromJson(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v1, "class"
    //         invoke-static {p0, v1, v0}, Lcom/facebook/FacebookAppLinkResolver;->tryGetStringFromJson(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v1, "app_name"
    //         invoke-static {p0, v1, v0}, Lcom/facebook/FacebookAppLinkResolver;->tryGetStringFromJson(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         const-string v1, "url"
    //         invoke-static {p0, v1, v0}, Lcom/facebook/FacebookAppLinkResolver;->tryGetStringFromJson(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         :cond_1
    //         new-instance v1, Lbolts/AppLink$Target;
    //         invoke-direct {v1, v2, v3, v0, v4}, Lbolts/AppLink$Target;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V
    //         move-object v0, v1
    //         goto :goto_0
    */

    private @JvmStatic fun getWebFallbackUriFromJson(p0: android.net.Uri, p1: org.json.JSONObject): android.net.Uri { return TODO("body: (Landroid/net/Uri;Lorg/json/JSONObject;)Landroid/net/Uri;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         :try_start_0
    //         const-string v1, "web"
    //         invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         const-string v2, "should_fallback"
    //         const/4 v3, 0x1
    //         invoke-static {v1, v2, v3}, Lcom/facebook/FacebookAppLinkResolver;->tryGetBooleanFromJson(Lorg/json/JSONObject;Ljava/lang/String;Z)Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         move-object p0, v0
    //         :cond_0
    //         :goto_0
    //         return-object p0
    //         :cond_1
    //         const-string v2, "url"
    //         const/4 v3, 0x0
    //         invoke-static {v1, v2, v3}, Lcom/facebook/FacebookAppLinkResolver;->tryGetStringFromJson(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_2
    //         invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :cond_2
    //         if-eqz v0, :cond_0
    //         move-object p0, v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    private @JvmStatic fun tryGetBooleanFromJson(p0: org.json.JSONObject, p1: String, p2: Boolean): Boolean { return TODO("body: (Lorg/json/JSONObject;Ljava/lang/String;Z)Z") }
    /*
    //         .locals 1
    //         :try_start_0
    //         invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result p2
    //         :goto_0
    //         return p2
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    private @JvmStatic fun tryGetStringFromJson(p0: org.json.JSONObject, p1: String, p2: String): String { return TODO("body: (Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         :try_start_0
    //         invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object p2
    //         :goto_0
    //         return-object p2
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    }
}
