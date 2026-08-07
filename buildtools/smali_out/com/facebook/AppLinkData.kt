package com.facebook

// Auto-emitted from smali source: AppLinkData.java.
// 24 fields, 16 methods.

open class AppLinkData {
    private var argumentBundle: android.os.Bundle
    private var arguments: org.json.JSONObject
    private var ref: String
    private var targetUri: android.net.Uri

    private constructor()

    public fun getArgumentBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getArguments(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         return-object v0
    */

    public fun getRef(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AppLinkData;->ref:Ljava/lang/String;
    //         return-object v0
    */

    public fun getRefererData(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    //         const-string v1, "referer_data"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getTargetUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;
    //         return-object v0
    */

    companion object {
    private val APPLINK_BRIDGE_ARGS_KEY: String = "bridge_args"
    private val APPLINK_METHOD_ARGS_KEY: String = "method_args"
    private val APPLINK_VERSION_KEY: String = "version"
    @JvmField public val ARGUMENTS_NATIVE_CLASS_KEY: String = "com.facebook.platform.APPLINK_NATIVE_CLASS"
    @JvmField public val ARGUMENTS_NATIVE_URL: String = "com.facebook.platform.APPLINK_NATIVE_URL"
    @JvmField public val ARGUMENTS_REFERER_DATA_KEY: String = "referer_data"
    @JvmField public val ARGUMENTS_TAPTIME_KEY: String = "com.facebook.platform.APPLINK_TAP_TIME_UTC"
    private val BRIDGE_ARGS_METHOD_KEY: String = "method"
    private val BUNDLE_AL_APPLINK_DATA_KEY: String = "al_applink_data"
    val BUNDLE_APPLINK_ARGS_KEY: String = "com.facebook.platform.APPLINK_ARGS"
    private val DEFERRED_APP_LINK_ARGS_FIELD: String = "applink_args"
    private val DEFERRED_APP_LINK_CLASS_FIELD: String = "applink_class"
    private val DEFERRED_APP_LINK_CLICK_TIME_FIELD: String = "click_time"
    private val DEFERRED_APP_LINK_EVENT: String = "DEFERRED_APP_LINK"
    private val DEFERRED_APP_LINK_PATH: String = "%s/activities"
    private val DEFERRED_APP_LINK_URL_FIELD: String = "applink_url"
    private val METHOD_ARGS_REF_KEY: String = "ref"
    private val METHOD_ARGS_TARGET_URL_KEY: String = "target_url"
    private val REFERER_DATA_REF_KEY: String = "fb_ref"
    private val TAG: String = null!!

    public @JvmStatic fun createFromActivity(p0: android.app.Activity): com.facebook.AppLinkData { return TODO("body: (Landroid/app/Activity;)Lcom/facebook/AppLinkData;") }
    /*
    //         .locals 2
    //         const-string v0, "activity"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
    //         move-result-object v1
    //         if-nez v1, :cond_1
    //         const/4 v0, 0x0
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         invoke-static {v1}, Lcom/facebook/AppLinkData;->createFromAlApplinkData(Landroid/content/Intent;)Lcom/facebook/AppLinkData;
    //         move-result-object v0
    //         if-nez v0, :cond_2
    //         const-string v0, "com.facebook.platform.APPLINK_ARGS"
    //         invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/AppLinkData;->createFromJson(Ljava/lang/String;)Lcom/facebook/AppLinkData;
    //         move-result-object v0
    //         :cond_2
    //         if-nez v0, :cond_0
    //         invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/AppLinkData;->createFromUri(Landroid/net/Uri;)Lcom/facebook/AppLinkData;
    //         move-result-object v0
    //         goto :goto_0
    */

    private @JvmStatic fun createFromAlApplinkData(p0: android.content.Intent): com.facebook.AppLinkData { return TODO("body: (Landroid/content/Intent;)Lcom/facebook/AppLinkData;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         const-string v1, "al_applink_data"
    //         invoke-virtual {p0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v1, Lcom/facebook/AppLinkData;
    //         invoke-direct {v1}, Lcom/facebook/AppLinkData;-><init>()V
    //         invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v3
    //         iput-object v3, v1, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;
    //         iget-object v3, v1, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;
    //         if-nez v3, :cond_1
    //         const-string v3, "target_url"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         if-eqz v3, :cond_1
    //         invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v3
    //         iput-object v3, v1, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;
    //         :cond_1
    //         iput-object v2, v1, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    //         iput-object v0, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         const-string v0, "referer_data"
    //         invoke-virtual {v2, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         const-string v2, "fb_ref"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, v1, Lcom/facebook/AppLinkData;->ref:Ljava/lang/String;
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_0
    */

    private @JvmStatic fun createFromJson(p0: String): com.facebook.AppLinkData { return TODO("body: (Ljava/lang/String;)Lcom/facebook/AppLinkData;") }
    /*
    //         .locals 5
    //         const/4 v0, 0x0
    //         if-nez p0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         :try_start_0
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v1, "version"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v3, "bridge_args"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v3
    //         const-string v4, "method"
    //         invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v4, "applink"
    //         invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         const-string v3, "2"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         new-instance v1, Lcom/facebook/AppLinkData;
    //         invoke-direct {v1}, Lcom/facebook/AppLinkData;-><init>()V
    //         const-string v3, "method_args"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v2
    //         iput-object v2, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         iget-object v2, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         const-string v3, "ref"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         iget-object v2, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         const-string v3, "ref"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, v1, Lcom/facebook/AppLinkData;->ref:Ljava/lang/String;
    //         :cond_2
    //         :goto_1
    //         iget-object v2, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         const-string v3, "target_url"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         const-string v3, "target_url"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v2
    //         iput-object v2, v1, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;
    //         :cond_3
    //         iget-object v2, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         invoke-static {v2}, Lcom/facebook/AppLinkData;->toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;
    //         move-result-object v2
    //         iput-object v2, v1, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_4
    //         iget-object v2, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         const-string v3, "referer_data"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         iget-object v2, v1, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         const-string v3, "referer_data"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v2
    //         const-string v3, "fb_ref"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         const-string v3, "fb_ref"
    //         invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, v1, Lcom/facebook/AppLinkData;->ref:Ljava/lang/String;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/facebook/FacebookException; {:try_start_0 .. :try_end_0} :catch_1
    //         goto :goto_1
    //         :catch_0
    //         move-exception v1
    //         sget-object v2, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;
    //         const-string v3, "Unable to parse AppLink JSON"
    //         invoke-static {v2, v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto/16 :goto_0
    //         :catch_1
    //         move-exception v1
    //         sget-object v2, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;
    //         const-string v3, "Unable to parse AppLink JSON"
    //         invoke-static {v2, v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto/16 :goto_0
    */

    private @JvmStatic fun createFromUri(p0: android.net.Uri): com.facebook.AppLinkData { return TODO("body: (Landroid/net/Uri;)Lcom/facebook/AppLinkData;") }
    /*
    //         .locals 1
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Lcom/facebook/AppLinkData;
    //         invoke-direct {v0}, Lcom/facebook/AppLinkData;-><init>()V
    //         iput-object p0, v0, Lcom/facebook/AppLinkData;->targetUri:Landroid/net/Uri;
    //         goto :goto_0
    */

    public @JvmStatic fun fetchDeferredAppLinkData(p0: android.content.Context, p1: com.facebook.AppLinkData.CompletionHandler) { /* TODO(body): (Landroid/content/Context;Lcom/facebook/AppLinkData$CompletionHandler;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, v0, p1}, Lcom/facebook/AppLinkData;->fetchDeferredAppLinkData(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V
    //         return-void
    */

    public @JvmStatic fun fetchDeferredAppLinkData(p0: android.content.Context, p1: String, p2: com.facebook.AppLinkData.CompletionHandler) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "context"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "completionHandler"
    //         invoke-static {p2, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         if-nez p1, :cond_0
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->getMetadataApplicationId(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object p1
    //         :cond_0
    //         const-string v0, "applicationId"
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {}, Lcom/facebook/Settings;->getExecutor()Ljava/util/concurrent/Executor;
    //         move-result-object v1
    //         new-instance v2, Lcom/facebook/AppLinkData$1;
    //         invoke-direct {v2, v0, p1, p2}, Lcom/facebook/AppLinkData$1;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V
    //         invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         return-void
    */

    private @JvmStatic fun fetchDeferredAppLinkFromServer(p0: android.content.Context, p1: String, p2: com.facebook.AppLinkData.CompletionHandler) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V */ }
    /*
    //         .locals 10
    //         const-wide/16 v8, -0x1
    //         const/4 v0, 0x0
    //         invoke-static {}, Lcom/facebook/model/GraphObject$Factory;->create()Lcom/facebook/model/GraphObject;
    //         move-result-object v1
    //         const-string v2, "event"
    //         const-string v3, "DEFERRED_APP_LINK"
    //         invoke-interface {v1, v2, v3}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         invoke-static {p0}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionIdentifiers(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    //         move-result-object v2
    //         invoke-static {p0, p1}, Lcom/facebook/internal/Utility;->getHashedDeviceAndAppID(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {p0}, Lcom/facebook/Settings;->getLimitEventAndDataUsage(Landroid/content/Context;)Z
    //         move-result v4
    //         invoke-static {v1, v2, v3, v4}, Lcom/facebook/internal/Utility;->setAppEventAttributionParameters(Lcom/facebook/model/GraphObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Z)V
    //         const-string v2, "application_package_name"
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {v1, v2, v3}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         const-string v2, "%s/activities"
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         aput-object p1, v3, v4
    //         invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         const/4 v4, 0x0
    //         :try_start_0
    //         invoke-static {v3, v2, v1, v4}, Lcom/facebook/Request;->newPostRequest(Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/model/GraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/Request;->executeAndWait()Lcom/facebook/Response;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v1
    //         if-eqz v1, :cond_6
    //         invoke-interface {v1}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object v1
    //         :goto_0
    //         if-eqz v1, :cond_5
    //         const-string v2, "applink_args"
    //         invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v3, "click_time"
    //         const-wide/16 v4, -0x1
    //         invoke-virtual {v1, v3, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J
    //         move-result-wide v4
    //         const-string v3, "applink_class"
    //         invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v6, "applink_url"
    //         invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v6
    //         if-nez v6, :cond_5
    //         invoke-static {v2}, Lcom/facebook/AppLinkData;->createFromJson(Ljava/lang/String;)Lcom/facebook/AppLinkData;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v0
    //         cmp-long v2, v4, v8
    //         if-eqz v2, :cond_1
    //         :try_start_1
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         if-eqz v2, :cond_0
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         const-string v6, "com.facebook.platform.APPLINK_TAP_TIME_UTC"
    //         invoke-virtual {v2, v6, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         :cond_0
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    //         if-eqz v2, :cond_1
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    //         const-string v6, "com.facebook.platform.APPLINK_TAP_TIME_UTC"
    //         invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v6, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_1
    //         .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    //         :cond_1
    //         :goto_1
    //         if-eqz v3, :cond_3
    //         :try_start_2
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         if-eqz v2, :cond_2
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         const-string v4, "com.facebook.platform.APPLINK_NATIVE_CLASS"
    //         invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_2
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    //         if-eqz v2, :cond_3
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    //         const-string v4, "com.facebook.platform.APPLINK_NATIVE_CLASS"
    //         invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_2
    //         .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    //         :cond_3
    //         :goto_2
    //         if-eqz v1, :cond_5
    //         :try_start_3
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         if-eqz v2, :cond_4
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->arguments:Lorg/json/JSONObject;
    //         const-string v3, "com.facebook.platform.APPLINK_NATIVE_URL"
    //         invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_4
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    //         if-eqz v2, :cond_5
    //         iget-object v2, v0, Lcom/facebook/AppLinkData;->argumentBundle:Landroid/os/Bundle;
    //         const-string v3, "com.facebook.platform.APPLINK_NATIVE_URL"
    //         invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_3
    //         .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3
    //         .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    //         :cond_5
    //         :goto_3
    //         invoke-interface {p2, v0}, Lcom/facebook/AppLinkData$CompletionHandler;->onDeferredAppLinkDataFetched(Lcom/facebook/AppLinkData;)V
    //         return-void
    //         :cond_6
    //         move-object v1, v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         :try_start_4
    //         sget-object v2, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;
    //         const-string v4, "Unable to put tap time in AppLinkData.arguments"
    //         invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_4
    //         .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    //         goto :goto_1
    //         :catch_1
    //         move-exception v1
    //         sget-object v1, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;
    //         const-string v2, "Unable to fetch deferred applink from server"
    //         invoke-static {v1, v2}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_3
    //         :catch_2
    //         move-exception v2
    //         :try_start_5
    //         sget-object v2, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;
    //         const-string v3, "Unable to put tap time in AppLinkData.arguments"
    //         invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_2
    //         :catch_3
    //         move-exception v1
    //         sget-object v1, Lcom/facebook/AppLinkData;->TAG:Ljava/lang/String;
    //         const-string v2, "Unable to put tap time in AppLinkData.arguments"
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_5
    //         .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    //         goto :goto_3
    */

    private @JvmStatic fun toBundle(p0: org.json.JSONObject): android.os.Bundle { return TODO("body: (Lorg/json/JSONObject;)Landroid/os/Bundle;") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v3, 0x0
    //         new-instance v4, Landroid/os/Bundle;
    //         invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
    //         invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
    //         move-result-object v5
    //         :goto_0
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_7
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         instance-of v2, v1, Lorg/json/JSONObject;
    //         if-eqz v2, :cond_0
    //         check-cast v1, Lorg/json/JSONObject;
    //         invoke-static {v1}, Lcom/facebook/AppLinkData;->toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         goto :goto_0
    //         :cond_0
    //         instance-of v2, v1, Lorg/json/JSONArray;
    //         if-eqz v2, :cond_6
    //         check-cast v1, Lorg/json/JSONArray;
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         if-nez v2, :cond_1
    //         new-array v1, v3, [Ljava/lang/String;
    //         invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {v1, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         instance-of v6, v2, Lorg/json/JSONObject;
    //         if-eqz v6, :cond_3
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         new-array v6, v2, [Landroid/os/Bundle;
    //         move v2, v3
    //         :goto_1
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v7
    //         if-ge v2, v7, :cond_2
    //         invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
    //         move-result-object v7
    //         invoke-static {v7}, Lcom/facebook/AppLinkData;->toBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;
    //         move-result-object v7
    //         aput-object v7, v6, v2
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {v4, v0, v6}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V
    //         goto :goto_0
    //         :cond_3
    //         instance-of v2, v2, Lorg/json/JSONArray;
    //         if-eqz v2, :cond_4
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Nested arrays are not supported."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_4
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         new-array v6, v2, [Ljava/lang/String;
    //         move v2, v3
    //         :goto_2
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v7
    //         if-ge v2, v7, :cond_5
    //         invoke-virtual {v1, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;
    //         move-result-object v7
    //         invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v7
    //         aput-object v7, v6, v2
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_2
    //         :cond_5
    //         invoke-virtual {v4, v0, v6}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_6
    //         invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto/16 :goto_0
    //         :cond_7
    //         return-object v4
    */

    }
}
