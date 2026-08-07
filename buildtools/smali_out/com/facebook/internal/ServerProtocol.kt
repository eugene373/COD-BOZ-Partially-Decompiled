package com.facebook.internal

// Auto-emitted from smali source: ServerProtocol.java.
// 31 fields, 7 methods.

class ServerProtocol {
    public constructor()

    companion object {
    private val DIALOG_AUTHORITY_FORMAT: String = "m.%s"
    @JvmField public val DIALOG_PARAM_ACCESS_TOKEN: String = "access_token"
    @JvmField public val DIALOG_PARAM_APP_ID: String = "app_id"
    @JvmField public val DIALOG_PARAM_AUTH_TYPE: String = "auth_type"
    @JvmField public val DIALOG_PARAM_CLIENT_ID: String = "client_id"
    @JvmField public val DIALOG_PARAM_DEFAULT_AUDIENCE: String = "default_audience"
    @JvmField public val DIALOG_PARAM_DISPLAY: String = "display"
    @JvmField public val DIALOG_PARAM_E2E: String = "e2e"
    @JvmField public val DIALOG_PARAM_LEGACY_OVERRIDE: String = "legacy_override"
    @JvmField public val DIALOG_PARAM_REDIRECT_URI: String = "redirect_uri"
    @JvmField public val DIALOG_PARAM_RESPONSE_TYPE: String = "response_type"
    @JvmField public val DIALOG_PARAM_RETURN_SCOPES: String = "return_scopes"
    @JvmField public val DIALOG_PARAM_SCOPE: String = "scope"
    @JvmField public val DIALOG_PATH: String = "dialog/"
    @JvmField public val DIALOG_REREQUEST_AUTH_TYPE: String = "rerequest"
    @JvmField public val DIALOG_RESPONSE_TYPE_TOKEN: String = "token"
    @JvmField public val DIALOG_RETURN_SCOPES_TRUE: String = "true"
    @JvmField public val FALLBACK_DIALOG_DISPLAY_VALUE_TOUCH: String = "touch"
    @JvmField public val FALLBACK_DIALOG_PARAM_APP_ID: String = "app_id"
    @JvmField public val FALLBACK_DIALOG_PARAM_BRIDGE_ARGS: String = "bridge_args"
    @JvmField public val FALLBACK_DIALOG_PARAM_KEY_HASH: String = "android_key_hash"
    @JvmField public val FALLBACK_DIALOG_PARAM_METHOD_ARGS: String = "method_args"
    @JvmField public val FALLBACK_DIALOG_PARAM_METHOD_RESULTS: String = "method_results"
    @JvmField public val FALLBACK_DIALOG_PARAM_VERSION: String = "version"
    @JvmField public val GRAPH_API_VERSION: String = "v2.2"
    private val GRAPH_URL_FORMAT: String = "https://graph.%s"
    private val GRAPH_VIDEO_URL_FORMAT: String = "https://graph-video.%s"
    private val LEGACY_API_VERSION: String = "v1.0"
    private val TAG: String = null!!
    @JvmField public val errorsProxyAuthDisabled: java.util.Collection = null!!
    @JvmField public val errorsUserCanceled: java.util.Collection = null!!

    public @JvmStatic fun getAPIVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/facebook/Settings;->getPlatformCompatibilityEnabled()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "v1.0"
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "v2.2"
    //         goto :goto_0
    */

    public @JvmStatic fun getDialogAuthority(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "m.%s"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-static {}, Lcom/facebook/Settings;->getFacebookDomain()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getGraphUrlBase(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "https://graph.%s"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-static {}, Lcom/facebook/Settings;->getFacebookDomain()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getGraphVideoUrlBase(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "https://graph-video.%s"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-static {}, Lcom/facebook/Settings;->getFacebookDomain()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getQueryParamsForPlatformActivityIntentWebFallback(p0: android.content.Context, p1: String, p2: Int, p3: String, p4: android.os.Bundle): android.os.Bundle { return TODO("body: (Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;") }
    /*
    //         .locals 7
    //         const/4 v1, 0x0
    //         invoke-static {p0}, Lcom/facebook/Settings;->getApplicationSignature(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v1
    //         :cond_1
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v3, "android_key_hash"
    //         invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "app_id"
    //         invoke-static {}, Lcom/facebook/Settings;->getApplicationId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "version"
    //         invoke-virtual {v0, v2, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v2, "display"
    //         const-string v3, "touch"
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         const-string v3, "action_id"
    //         invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v3, "app_name"
    //         invoke-virtual {v2, v3, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         if-nez p4, :cond_2
    //         new-instance p4, Landroid/os/Bundle;
    //         invoke-direct {p4}, Landroid/os/Bundle;-><init>()V
    //         :cond_2
    //         :try_start_0
    //         invoke-static {v2}, Lcom/facebook/internal/BundleJSONConverter;->convertToJSON(Landroid/os/Bundle;)Lorg/json/JSONObject;
    //         move-result-object v2
    //         invoke-static {p4}, Lcom/facebook/internal/BundleJSONConverter;->convertToJSON(Landroid/os/Bundle;)Lorg/json/JSONObject;
    //         move-result-object v3
    //         if-eqz v2, :cond_0
    //         if-eqz v3, :cond_0
    //         const-string v4, "bridge_args"
    //         invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "method_args"
    //         invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         move-object v1, v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->DEVELOPER_ERRORS:Lcom/facebook/LoggingBehavior;
    //         const/4 v3, 0x6
    //         sget-object v4, Lcom/facebook/internal/ServerProtocol;->TAG:Ljava/lang/String;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Error creating Url -- "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v3, v4, v0}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         move-object v0, v1
    //         goto :goto_1
    */

    }
}
