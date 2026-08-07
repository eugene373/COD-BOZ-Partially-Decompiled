package com.facebook.internal

// Auto-emitted from smali source: Utility.java.
// 22 fields, 54 methods.

class Utility {
    public constructor()

    companion object {
    private val APPLICATION_FIELDS: String = "fields"
    private val APP_SETTINGS_PREFS_KEY_FORMAT: String = "com.facebook.internal.APP_SETTINGS.%s"
    private val APP_SETTINGS_PREFS_STORE: String = "com.facebook.internal.preferences.APP_SETTINGS"
    private val APP_SETTING_DIALOG_CONFIGS: String = "android_dialog_configs"
    private val APP_SETTING_FIELDS: Array<String> = null!!
    private val APP_SETTING_NUX_CONTENT: String = "gdpv4_nux_content"
    private val APP_SETTING_NUX_ENABLED: String = "gdpv4_nux_enabled"
    private val APP_SETTING_SUPPORTS_ATTRIBUTION: String = "supports_attribution"
    private val APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING: String = "supports_implicit_sdk_logging"
    @JvmField public val DEFAULT_STREAM_BUFFER_SIZE: Int = 0x2000
    private val DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR: String = "\\|"
    private val DIALOG_CONFIG_NAME_KEY: String = "name"
    private val DIALOG_CONFIG_URL_KEY: String = "url"
    private val DIALOG_CONFIG_VERSIONS_KEY: String = "versions"
    private val EXTRA_APP_EVENTS_INFO_FORMAT_VERSION: String = "a1"
    private val HASH_ALGORITHM_MD5: String = "MD5"
    private val HASH_ALGORITHM_SHA1: String = "SHA-1"
    val LOG_TAG: String = "FacebookSDK"
    private val URL_SCHEME: String = "https"
    private val UTF8: String = "UTF-8"
    private var fetchedAppSettings: java.util.Map
    private var initialAppSettingsLoadTask: android.os.AsyncTask

    public @JvmStatic fun areObjectsEqual(p0: Object, p1: Object): Boolean { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(TT;TT;)Z"
    //             }
    //         .end annotation
    //         if-nez p0, :cond_1
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public @JvmStatic fun arrayList(p0: Array<Object>): java.util.ArrayList { return TODO("body: ([Ljava/lang/Object;)Ljava/util/ArrayList;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">([TT;)",
    //                 "Ljava/util/ArrayList",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         array-length v0, p0
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         array-length v2, p0
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_0
    //         aget-object v3, p0, v0
    //         invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public @JvmStatic fun asListNoNulls(p0: Array<Object>): java.util.List { return TODO("body: ([Ljava/lang/Object;)Ljava/util/List;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">([TT;)",
    //                 "Ljava/util/List",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         array-length v2, p0
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_1
    //         aget-object v3, p0, v0
    //         if-eqz v3, :cond_0
    //         invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         return-object v1
    */

    public @JvmStatic fun buildUri(p0: String, p1: String, p2: android.os.Bundle): android.net.Uri { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;") }
    /*
    //         .locals 5
    //         new-instance v2, Landroid/net/Uri$Builder;
    //         invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V
    //         const-string v0, "https"
    //         invoke-virtual {v2, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         invoke-virtual {v2, p0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         invoke-virtual {v2, p1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         invoke-virtual {p2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         instance-of v4, v1, Ljava/lang/String;
    //         if-eqz v4, :cond_0
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v2, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun clearCaches(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0}, Lcom/facebook/internal/ImageDownloader;->clearCache(Landroid/content/Context;)V
    //         return-void
    */

    private @JvmStatic fun clearCookiesForDomain(p0: android.content.Context, p1: String) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;)V */ }
    /*
    //         .locals 7
    //         const/4 v1, 0x0
    //         invoke-static {p0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->sync()V
    //         invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v3, ";"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v3
    //         array-length v4, v3
    //         move v0, v1
    //         :goto_1
    //         if-ge v0, v4, :cond_2
    //         aget-object v5, v3, v0
    //         const-string v6, "="
    //         invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v5
    //         array-length v6, v5
    //         if-lez v6, :cond_1
    //         new-instance v6, Ljava/lang/StringBuilder;
    //         invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
    //         aget-object v5, v5, v1
    //         invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         const-string v6, "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v2, p1, v5}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {v2}, Landroid/webkit/CookieManager;->removeExpiredCookie()V
    //         goto :goto_0
    */

    public @JvmStatic fun clearFacebookCookies(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "facebook.com"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->clearCookiesForDomain(Landroid/content/Context;Ljava/lang/String;)V
    //         const-string v0, ".facebook.com"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->clearCookiesForDomain(Landroid/content/Context;Ljava/lang/String;)V
    //         const-string v0, "https://facebook.com"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->clearCookiesForDomain(Landroid/content/Context;Ljava/lang/String;)V
    //         const-string v0, "https://.facebook.com"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->clearCookiesForDomain(Landroid/content/Context;Ljava/lang/String;)V
    //         return-void
    */

    public @JvmStatic fun closeQuietly(p0: java.io.Closeable) { /* TODO(body): (Ljava/io/Closeable;)V */ }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_0
    //         :try_start_0
    //         invoke-interface {p0}, Ljava/io/Closeable;->close()V
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    public @JvmStatic fun coerceValueIfNullOrEmpty(p0: String, p1: String): String { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-object p1
    //         :cond_0
    //         move-object p1, p0
    //         goto :goto_0
    */

    @JvmStatic fun convertJSONObjectToHashMap(p0: org.json.JSONObject): java.util.Map { return TODO("body: (Lorg/json/JSONObject;)Ljava/util/Map;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lorg/json/JSONObject;",
    //                 ")",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/HashMap;
    //         invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    //         invoke-virtual {p0}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;
    //         move-result-object v3
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
    //         move-result v0
    //         if-ge v1, v0, :cond_1
    //         :try_start_0
    //         invoke-virtual {v3, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {p0, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v5, v0, Lorg/json/JSONObject;
    //         if-eqz v5, :cond_0
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->convertJSONObjectToHashMap(Lorg/json/JSONObject;)Ljava/util/Map;
    //         move-result-object v0
    //         :cond_0
    //         invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_1
    //         return-object v2
    //         :catch_0
    //         move-exception v0
    //         goto :goto_1
    */

    public @JvmStatic fun deleteDirectory(p0: java.io.File) { /* TODO(body): (Ljava/io/File;)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Ljava/io/File;->exists()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
    //         move-result-object v1
    //         array-length v2, v1
    //         const/4 v0, 0x0
    //         :goto_1
    //         if-ge v0, v2, :cond_1
    //         aget-object v3, v1, v0
    //         invoke-static {v3}, Lcom/facebook/internal/Utility;->deleteDirectory(Ljava/io/File;)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         :cond_1
    //         invoke-virtual {p0}, Ljava/io/File;->delete()Z
    //         goto :goto_0
    */

    public @JvmStatic fun disconnectQuietly(p0: java.net.URLConnection) { /* TODO(body): (Ljava/net/URLConnection;)V */ }
    /*
    //         .locals 1
    //         instance-of v0, p0, Ljava/net/HttpURLConnection;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Ljava/net/HttpURLConnection;
    //         invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun getActivityName(p0: android.content.Context): String { return TODO("body: (Landroid/content/Context;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         if-nez p0, :cond_0
    //         const-string v0, "null"
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         if-ne p0, v0, :cond_1
    //         const-string v0, "unknown"
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    private @JvmStatic fun getAppSettingsQueryResponse(p0: String): com.facebook.model.GraphObject { return TODO("body: (Ljava/lang/String;)Lcom/facebook/model/GraphObject;") }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "fields"
    //         const-string v2, ","
    //         sget-object v3, Lcom/facebook/internal/Utility;->APP_SETTING_FIELDS:[Ljava/lang/String;
    //         invoke-static {v2, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {v4, p0, v4}, Lcom/facebook/Request;->newGraphPathRequest(Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v1
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Lcom/facebook/Request;->setSkipClientToken(Z)V
    //         invoke-virtual {v1, v0}, Lcom/facebook/Request;->setParameters(Landroid/os/Bundle;)V
    //         invoke-virtual {v1}, Lcom/facebook/Request;->executeAndWait()Lcom/facebook/Response;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getDialogFeatureConfig(p0: String, p1: String, p2: String): com.facebook.internal.Utility.DialogFeatureConfig { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/internal/Utility$DialogFeatureConfig;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-static {p2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         sget-object v0, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;
    //         invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         if-eqz v0, :cond_2
    //         invoke-virtual {v0}, Lcom/facebook/internal/Utility$FetchedAppSettings;->getDialogConfigurations()Ljava/util/Map;
    //         move-result-object v0
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map;
    //         if-eqz v0, :cond_2
    //         invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/Utility$DialogFeatureConfig;
    //         goto :goto_0
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_0
    */

    public @JvmStatic fun getHashedDeviceAndAppID(p0: android.content.Context, p1: String): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         const-string v1, "android_id"
    //         invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->sha1hash(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun getMetadataApplicationId(p0: android.content.Context): String { return TODO("body: (Landroid/content/Context;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "context"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-static {p0}, Lcom/facebook/Settings;->loadDefaultsFromMetadata(Landroid/content/Context;)V
    //         invoke-static {}, Lcom/facebook/Settings;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getMethodQuietly(p0: Class, p1: String, p2: Array<Class>): java.lang.reflect.Method { return TODO("body: (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Class",
    //                 "<*>;",
    //                 "Ljava/lang/String;",
    //                 "[",
    //                 "Ljava/lang/Class",
    //                 "<*>;)",
    //                 "Ljava/lang/reflect/Method;"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         :try_end_0
    //         .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun getMethodQuietly(p0: String, p1: String, p2: Array<Class>): java.lang.reflect.Method { return TODO("body: (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "[",
    //                 "Ljava/lang/Class",
    //                 "<*>;)",
    //                 "Ljava/lang/reflect/Method;"
    //             }
    //         .end annotation
    //         :try_start_0
    //         invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-static {v0, p1, p2}, Lcom/facebook/internal/Utility;->getMethodQuietly(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         :try_end_0
    //         .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun getStringPropertyAsJSON(p0: org.json.JSONObject, p1: String, p2: String): Object { return TODO("body: (Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         instance-of v1, v0, Ljava/lang/String;
    //         if-eqz v1, :cond_2
    //         new-instance v1, Lorg/json/JSONTokener;
    //         check-cast v0, Ljava/lang/String;
    //         invoke-direct {v1, v0}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v1}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;
    //         move-result-object v0
    //         move-object v1, v0
    //         :goto_0
    //         if-eqz v1, :cond_1
    //         instance-of v0, v1, Lorg/json/JSONObject;
    //         if-nez v0, :cond_1
    //         instance-of v0, v1, Lorg/json/JSONArray;
    //         if-nez v0, :cond_1
    //         if-eqz p2, :cond_0
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {v0, p2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Got an unexpected non-JSON object."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_2
    //         move-object v1, v0
    //         goto :goto_0
    */

    private @JvmStatic fun hashBytes(p0: java.security.MessageDigest, p1: ByteArray): String { return TODO("body: (Ljava/security/MessageDigest;[B)Ljava/lang/String;") }
    /*
    //         .locals 6
    //         invoke-virtual {p0, p1}, Ljava/security/MessageDigest;->update([B)V
    //         invoke-virtual {p0}, Ljava/security/MessageDigest;->digest()[B
    //         move-result-object v1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         array-length v3, v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v3, :cond_0
    //         aget-byte v4, v1, v0
    //         shr-int/lit8 v5, v4, 0x4
    //         and-int/lit8 v5, v5, 0xf
    //         invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         shr-int/lit8 v4, v4, 0x0
    //         and-int/lit8 v4, v4, 0xf
    //         invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun hashWithAlgorithm(p0: String, p1: String): String { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->hashWithAlgorithm(Ljava/lang/String;[B)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun hashWithAlgorithm(p0: String, p1: ByteArray): String { return TODO("body: (Ljava/lang/String;[B)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         :try_start_0
    //         invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    //         :try_end_0
    //         .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         invoke-static {v0, p1}, Lcom/facebook/internal/Utility;->hashBytes(Ljava/security/MessageDigest;[B)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun intersectRanges(p0: IntArray, p1: IntArray): IntArray { return TODO("body: ([I[I)[I") }
    /*
    //         .locals 10
    //         const/high16 v7, -0x80000000
    //         const/4 v0, 0x0
    //         const v4, 0x7fffffff
    //         if-nez p0, :cond_0
    //         :goto_0
    //         return-object p1
    //         :cond_0
    //         if-nez p1, :cond_1
    //         move-object p1, p0
    //         goto :goto_0
    //         :cond_1
    //         array-length v1, p0
    //         array-length v2, p1
    //         add-int/2addr v1, v2
    //         new-array v9, v1, [I
    //         move v1, v0
    //         move v2, v0
    //         :cond_2
    //         :goto_1
    //         array-length v3, p0
    //         if-ge v1, v3, :cond_9
    //         array-length v3, p1
    //         if-ge v0, v3, :cond_9
    //         aget v8, p0, v1
    //         aget v6, p1, v0
    //         array-length v3, p0
    //         add-int/lit8 v3, v3, -0x1
    //         if-ge v1, v3, :cond_b
    //         add-int/lit8 v3, v1, 0x1
    //         aget v3, p0, v3
    //         :goto_2
    //         array-length v5, p1
    //         add-int/lit8 v5, v5, -0x1
    //         if-ge v0, v5, :cond_a
    //         add-int/lit8 v5, v0, 0x1
    //         aget v5, p1, v5
    //         :goto_3
    //         if-ge v8, v6, :cond_5
    //         if-le v3, v6, :cond_4
    //         if-le v3, v5, :cond_3
    //         add-int/lit8 v0, v0, 0x2
    //         :goto_4
    //         if-eq v6, v7, :cond_2
    //         add-int/lit8 v3, v2, 0x1
    //         aput v6, v9, v2
    //         if-eq v5, v4, :cond_8
    //         add-int/lit8 v2, v3, 0x1
    //         aput v5, v9, v3
    //         goto :goto_1
    //         :cond_3
    //         add-int/lit8 v1, v1, 0x2
    //         move v5, v3
    //         goto :goto_4
    //         :cond_4
    //         add-int/lit8 v1, v1, 0x2
    //         move v5, v4
    //         move v6, v7
    //         goto :goto_4
    //         :cond_5
    //         if-le v5, v8, :cond_7
    //         if-le v5, v3, :cond_6
    //         add-int/lit8 v1, v1, 0x2
    //         move v5, v3
    //         move v6, v8
    //         goto :goto_4
    //         :cond_6
    //         add-int/lit8 v0, v0, 0x2
    //         move v6, v8
    //         goto :goto_4
    //         :cond_7
    //         add-int/lit8 v0, v0, 0x2
    //         move v5, v4
    //         move v6, v7
    //         goto :goto_4
    //         :cond_8
    //         move v2, v3
    //         :cond_9
    //         invoke-static {v9, v2}, Ljava/util/Arrays;->copyOf([II)[I
    //         move-result-object p1
    //         goto :goto_0
    //         :cond_a
    //         move v5, v4
    //         goto :goto_3
    //         :cond_b
    //         move v3, v4
    //         goto :goto_2
    */

    public @JvmStatic fun invokeMethodQuietly(p0: Object, p1: java.lang.reflect.Method, p2: Array<Object>): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         goto :goto_0
    */

    public @JvmStatic fun isNullOrEmpty(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_0
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun isNullOrEmpty(p0: java.util.Collection): Boolean { return TODO("body: (Ljava/util/Collection;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/util/Collection",
    //                 "<TT;>;)Z"
    //             }
    //         .end annotation
    //         if-eqz p0, :cond_0
    //         invoke-interface {p0}, Ljava/util/Collection;->size()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun isSubset(p0: java.util.Collection, p1: java.util.Collection): Boolean { return TODO("body: (Ljava/util/Collection;Ljava/util/Collection;)Z") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/util/Collection",
    //                 "<TT;>;",
    //                 "Ljava/util/Collection",
    //                 "<TT;>;)Z"
    //             }
    //         .end annotation
    //         const/4 v1, 0x1
    //         const/4 v0, 0x0
    //         if-eqz p1, :cond_0
    //         invoke-interface {p1}, Ljava/util/Collection;->size()I
    //         move-result v2
    //         if-nez v2, :cond_3
    //         :cond_0
    //         if-eqz p0, :cond_1
    //         invoke-interface {p0}, Ljava/util/Collection;->size()I
    //         move-result v2
    //         if-nez v2, :cond_2
    //         :cond_1
    //         move v0, v1
    //         :cond_2
    //         :goto_0
    //         return v0
    //         :cond_3
    //         new-instance v2, Ljava/util/HashSet;
    //         invoke-direct {v2, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
    //         invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_4
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v4
    //         if-eqz v4, :cond_5
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v4
    //         invoke-virtual {v2, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-nez v4, :cond_4
    //         goto :goto_0
    //         :cond_5
    //         move v0, v1
    //         goto :goto_0
    */

    public @JvmStatic fun loadAppSettingsAsync(p0: android.content.Context, p1: String) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         const/4 v1, 0x0
    //         invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/facebook/internal/Utility;->initialAppSettingsLoadTask:Landroid/os/AsyncTask;
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const-string v0, "com.facebook.internal.APP_SETTINGS.%s"
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/Object;
    //         aput-object p1, v2, v4
    //         invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v2
    //         new-instance v0, Lcom/facebook/internal/Utility$1;
    //         invoke-direct {v0, p1, p0, v2}, Lcom/facebook/internal/Utility$1;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    //         sput-object v0, Lcom/facebook/internal/Utility;->initialAppSettingsLoadTask:Landroid/os/AsyncTask;
    //         sget-object v3, Lcom/facebook/internal/Utility;->initialAppSettingsLoadTask:Landroid/os/AsyncTask;
    //         move-object v0, v1
    //         check-cast v0, [Ljava/lang/Void;
    //         invoke-virtual {v3, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         const-string v0, "com.facebook.internal.preferences.APP_SETTINGS"
    //         invoke-virtual {p0, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :try_start_0
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-object v1, v0
    //         :goto_1
    //         if-eqz v1, :cond_0
    //         invoke-static {p1, v1}, Lcom/facebook/internal/Utility;->parseAppSettingsFromJSON(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v2, "FacebookSDK"
    //         invoke-static {v2, v0}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V
    //         goto :goto_1
    */

    public @JvmStatic fun logd(p0: String, p1: Exception) { /* TODO(body): (Ljava/lang/String;Ljava/lang/Exception;)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/facebook/Settings;->isDebugEnabled()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         if-eqz p0, :cond_0
    //         if-eqz p1, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ": "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun logd(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/facebook/Settings;->isDebugEnabled()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         if-eqz p0, :cond_0
    //         if-eqz p1, :cond_0
    //         invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun logd(p0: String, p1: String, p2: Throwable) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/facebook/Settings;->isDebugEnabled()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-static {p0, p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :cond_0
    //         return-void
    */

    @JvmStatic fun md5hash(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "MD5"
    //         invoke-static {v0, p0}, Lcom/facebook/internal/Utility;->hashWithAlgorithm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun parseAppSettingsFromJSON(p0: String, p1: org.json.JSONObject): com.facebook.internal.Utility.FetchedAppSettings { return TODO("body: (Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;") }
    /*
    //         .locals 7
    //         const/4 v5, 0x0
    //         new-instance v0, Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         const-string v1, "supports_attribution"
    //         invoke-virtual {p1, v1, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
    //         move-result v1
    //         const-string v2, "supports_implicit_sdk_logging"
    //         invoke-virtual {p1, v2, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
    //         move-result v2
    //         const-string v3, "gdpv4_nux_content"
    //         const-string v4, ""
    //         invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v4, "gdpv4_nux_enabled"
    //         invoke-virtual {p1, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
    //         move-result v4
    //         const-string v5, "android_dialog_configs"
    //         invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v5
    //         invoke-static {v5}, Lcom/facebook/internal/Utility;->parseDialogConfigurations(Lorg/json/JSONObject;)Ljava/util/Map;
    //         move-result-object v5
    //         const/4 v6, 0x0
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/internal/Utility$FetchedAppSettings;-><init>(ZZLjava/lang/String;ZLjava/util/Map;Lcom/facebook/internal/Utility$1;)V
    //         sget-object v1, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;
    //         invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-object v0
    */

    private @JvmStatic fun parseDialogConfigurations(p0: org.json.JSONObject): java.util.Map { return TODO("body: (Lorg/json/JSONObject;)Ljava/util/Map;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lorg/json/JSONObject;",
    //                 ")",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/facebook/internal/Utility$DialogFeatureConfig;",
    //                 ">;>;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/util/HashMap;
    //         invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    //         if-eqz p0, :cond_2
    //         const-string v0, "data"
    //         invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v3
    //         if-eqz v3, :cond_2
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
    //         move-result v0
    //         if-ge v1, v0, :cond_2
    //         invoke-virtual {v3, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->access$400(Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$DialogFeatureConfig;
    //         move-result-object v4
    //         if-nez v4, :cond_0
    //         :goto_1
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {v4}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->getDialogName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map;
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_1
    //         invoke-virtual {v4}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->getFeatureName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_1
    //         :cond_2
    //         return-object v2
    */

    public @JvmStatic fun parseUrlQueryString(p0: String): android.os.Bundle { return TODO("body: (Ljava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x1
    //         const/4 v0, 0x0
    //         new-instance v2, Landroid/os/Bundle;
    //         invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         const-string v1, "&"
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v3
    //         array-length v4, v3
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v4, :cond_2
    //         aget-object v0, v3, v1
    //         const-string v5, "="
    //         invoke-virtual {v0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v0
    //         :try_start_0
    //         array-length v5, v0
    //         const/4 v6, 0x2
    //         if-ne v5, v6, :cond_1
    //         const/4 v5, 0x0
    //         aget-object v5, v0, v5
    //         const-string v6, "UTF-8"
    //         invoke-static {v5, v6}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v5
    //         const/4 v6, 0x1
    //         aget-object v0, v0, v6
    //         const-string v6, "UTF-8"
    //         invoke-static {v0, v6}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v5, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         :goto_1
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_1
    //         array-length v5, v0
    //         if-ne v5, v7, :cond_0
    //         const/4 v5, 0x0
    //         aget-object v0, v0, v5
    //         const-string v5, "UTF-8"
    //         invoke-static {v0, v5}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v5, ""
    //         invoke-virtual {v2, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         const-string v5, "FacebookSDK"
    //         invoke-static {v5, v0}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V
    //         goto :goto_1
    //         :cond_2
    //         return-object v2
    */

    public @JvmStatic fun putObjectInBundle(p0: android.os.Bundle, p1: String, p2: Object) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         instance-of v0, p2, Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         check-cast p2, Ljava/lang/String;
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         instance-of v0, p2, Landroid/os/Parcelable;
    //         if-eqz v0, :cond_1
    //         check-cast p2, Landroid/os/Parcelable;
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         goto :goto_0
    //         :cond_1
    //         instance-of v0, p2, [B
    //         if-eqz v0, :cond_2
    //         check-cast p2, [B
    //         check-cast p2, [B
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
    //         goto :goto_0
    //         :cond_2
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "attempted to add unsupported type to Bundle"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public @JvmStatic fun queryAppSettings(p0: String, p1: Boolean): com.facebook.internal.Utility.FetchedAppSettings { return TODO("body: (Ljava/lang/String;Z)Lcom/facebook/internal/Utility$FetchedAppSettings;") }
    /*
    //         .locals 1
    //         if-nez p1, :cond_0
    //         sget-object v0, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;
    //         invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/facebook/internal/Utility;->fetchedAppSettings:Ljava/util/Map;
    //         invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->getAppSettingsQueryResponse(Ljava/lang/String;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_1
    //         invoke-interface {v0}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Utility;->parseAppSettingsFromJSON(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun readStreamToString(p0: java.io.InputStream): String { return TODO("body: (Ljava/io/InputStream;)Ljava/lang/String;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         :try_start_0
    //         new-instance v3, Ljava/io/BufferedInputStream;
    //         invoke-direct {v3, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_1
    //         :try_start_1
    //         new-instance v1, Ljava/io/InputStreamReader;
    //         invoke-direct {v1, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_2
    //         :try_start_2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const/16 v2, 0x800
    //         new-array v2, v2, [C
    //         :goto_0
    //         invoke-virtual {v1, v2}, Ljava/io/InputStreamReader;->read([C)I
    //         move-result v4
    //         const/4 v5, -0x1
    //         if-eq v4, v5, :cond_0
    //         const/4 v5, 0x0
    //         invoke-virtual {v0, v2, v5, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         move-object v2, v3
    //         :goto_1
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         throw v0
    //         :cond_0
    //         :try_start_3
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         move-result-object v0
    //         invoke-static {v3}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         return-object v0
    //         :catchall_1
    //         move-exception v0
    //         move-object v1, v2
    //         goto :goto_1
    //         :catchall_2
    //         move-exception v0
    //         move-object v1, v2
    //         move-object v2, v3
    //         goto :goto_1
    */

    public @JvmStatic fun safeGetBooleanFromResponse(p0: com.facebook.model.GraphObject, p1: String): Boolean { return TODO("body: (Lcom/facebook/model/GraphObject;Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         if-eqz p0, :cond_0
    //         invoke-interface {p0, p1}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         :cond_0
    //         instance-of v1, v0, Ljava/lang/Boolean;
    //         if-nez v1, :cond_1
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         :cond_1
    //         check-cast v0, Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun safeGetStringFromResponse(p0: com.facebook.model.GraphObject, p1: String): String { return TODO("body: (Lcom/facebook/model/GraphObject;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const-string v0, ""
    //         if-eqz p0, :cond_0
    //         invoke-interface {p0, p1}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         :cond_0
    //         instance-of v1, v0, Ljava/lang/String;
    //         if-nez v1, :cond_1
    //         const-string v0, ""
    //         :cond_1
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public @JvmStatic fun setAppEventAttributionParameters(p0: com.facebook.model.GraphObject, p1: com.facebook.internal.AttributionIdentifiers, p2: String, p3: Boolean) { /* TODO(body): (Lcom/facebook/model/GraphObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Z)V */ }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionId()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "attribution"
    //         invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {p0, v0, v3}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         :cond_0
    //         if-eqz p1, :cond_3
    //         invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidAdvertiserId()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         const-string v0, "advertiser_id"
    //         invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidAdvertiserId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {p0, v0, v3}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         const-string v3, "advertiser_tracking_enabled"
    //         invoke-virtual {p1}, Lcom/facebook/internal/AttributionIdentifiers;->isTrackingLimited()Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         move v0, v1
    //         :goto_0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-interface {p0, v3, v0}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         :cond_1
    //         :goto_1
    //         const-string v0, "application_tracking_enabled"
    //         if-nez p3, :cond_4
    //         :goto_2
    //         invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v1
    //         invoke-interface {p0, v0, v1}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         return-void
    //         :cond_2
    //         move v0, v2
    //         goto :goto_0
    //         :cond_3
    //         if-eqz p2, :cond_1
    //         const-string v0, "advertiser_id"
    //         invoke-interface {p0, v0, p2}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         goto :goto_1
    //         :cond_4
    //         move v1, v2
    //         goto :goto_2
    */

    public @JvmStatic fun setAppEventExtendedDeviceInfoParameters(p0: com.facebook.model.GraphObject, p1: android.content.Context) { /* TODO(body): (Lcom/facebook/model/GraphObject;Landroid/content/Context;)V */ }
    /*
    //         .locals 6
    //         new-instance v2, Lorg/json/JSONArray;
    //         invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V
    //         const-string v0, "a1"
    //         invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         const/4 v1, -0x1
    //         const-string v0, ""
    //         :try_start_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v4
    //         const/4 v5, 0x0
    //         invoke-virtual {v4, v3, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v4
    //         iget v1, v4, Landroid/content/pm/PackageInfo;->versionCode:I
    //         iget-object v0, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         invoke-virtual {v2, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         invoke-virtual {v2, v1}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;
    //         invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         const-string v0, "extinfo"
    //         invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {p0, v0, v1}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         return-void
    //         :catch_0
    //         move-exception v4
    //         goto :goto_0
    */

    @JvmStatic fun sha1hash(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "SHA-1"
    //         invoke-static {v0, p0}, Lcom/facebook/internal/Utility;->hashWithAlgorithm(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun sha1hash(p0: ByteArray): String { return TODO("body: ([B)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "SHA-1"
    //         invoke-static {v0, p0}, Lcom/facebook/internal/Utility;->hashWithAlgorithm(Ljava/lang/String;[B)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun stringsEqualOrEmpty(p0: String, p1: String): Boolean { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Z") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-eqz v0, :cond_0
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         if-nez v0, :cond_1
    //         if-nez v1, :cond_1
    //         invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun tryGetJSONArrayFromResponse(p0: com.facebook.model.GraphObject, p1: String): org.json.JSONArray { return TODO("body: (Lcom/facebook/model/GraphObject;Ljava/lang/String;)Lorg/json/JSONArray;") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         if-nez p0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-interface {p0, p1}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v2, v0, Lorg/json/JSONArray;
    //         if-nez v2, :cond_1
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_1
    //         check-cast v0, Lorg/json/JSONArray;
    //         goto :goto_0
    */

    public @JvmStatic fun tryGetJSONObjectFromResponse(p0: com.facebook.model.GraphObject, p1: String): org.json.JSONObject { return TODO("body: (Lcom/facebook/model/GraphObject;Ljava/lang/String;)Lorg/json/JSONObject;") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         if-nez p0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-interface {p0, p1}, Lcom/facebook/model/GraphObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v2, v0, Lorg/json/JSONObject;
    //         if-nez v2, :cond_1
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_1
    //         check-cast v0, Lorg/json/JSONObject;
    //         goto :goto_0
    */

    public @JvmStatic fun unmodifiableCollection(p0: Array<Object>): java.util.Collection { return TODO("body: ([Ljava/lang/Object;)Ljava/util/Collection;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">([TT;)",
    //                 "Ljava/util/Collection",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
