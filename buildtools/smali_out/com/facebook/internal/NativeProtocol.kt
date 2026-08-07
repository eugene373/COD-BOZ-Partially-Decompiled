package com.facebook.internal

// Auto-emitted from smali source: NativeProtocol.java.
// 122 fields, 27 methods.

class NativeProtocol {
    public constructor()

    companion object {
    @JvmField public val ACTION_FEED_DIALOG: String = "com.facebook.platform.action.request.FEED_DIALOG"
    @JvmField public val ACTION_FEED_DIALOG_REPLY: String = "com.facebook.platform.action.reply.FEED_DIALOG"
    @JvmField public val ACTION_LIKE_DIALOG: String = "com.facebook.platform.action.request.LIKE_DIALOG"
    @JvmField public val ACTION_LIKE_DIALOG_REPLY: String = "com.facebook.platform.action.reply.LIKE_DIALOG"
    @JvmField public val ACTION_MESSAGE_DIALOG: String = "com.facebook.platform.action.request.MESSAGE_DIALOG"
    @JvmField public val ACTION_MESSAGE_DIALOG_REPLY: String = "com.facebook.platform.action.reply.MESSAGE_DIALOG"
    @JvmField public val ACTION_OGACTIONPUBLISH_DIALOG: String = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"
    @JvmField public val ACTION_OGACTIONPUBLISH_DIALOG_REPLY: String = "com.facebook.platform.action.reply.OGACTIONPUBLISH_DIALOG"
    @JvmField public val ACTION_OGMESSAGEPUBLISH_DIALOG: String = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"
    @JvmField public val ACTION_OGMESSAGEPUBLISH_DIALOG_REPLY: String = "com.facebook.platform.action.reply.OGMESSAGEPUBLISH_DIALOG"
    @JvmField public val AUDIENCE_EVERYONE: String = "everyone"
    @JvmField public val AUDIENCE_FRIENDS: String = "friends"
    @JvmField public val AUDIENCE_ME: String = "only_me"
    @JvmField public val BRIDGE_ARG_ACTION_ID_STRING: String = "action_id"
    @JvmField public val BRIDGE_ARG_APP_NAME_STRING: String = "app_name"
    @JvmField public val BRIDGE_ARG_ERROR_BUNDLE: String = "error"
    @JvmField public val BRIDGE_ARG_ERROR_CODE: String = "error_code"
    @JvmField public val BRIDGE_ARG_ERROR_DESCRIPTION: String = "error_description"
    @JvmField public val BRIDGE_ARG_ERROR_JSON: String = "error_json"
    @JvmField public val BRIDGE_ARG_ERROR_SUBCODE: String = "error_subcode"
    @JvmField public val BRIDGE_ARG_ERROR_TYPE: String = "error_type"
    private val CONTENT_SCHEME: String = "content://"
    @JvmField public val DIALOG_REQUEST_CODE: Int = 0xfacf
    @JvmField public val ERROR_APPLICATION_ERROR: String = "ApplicationError"
    @JvmField public val ERROR_NETWORK_ERROR: String = "NetworkError"
    @JvmField public val ERROR_PERMISSION_DENIED: String = "PermissionDenied"
    @JvmField public val ERROR_PROTOCOL_ERROR: String = "ProtocolError"
    @JvmField public val ERROR_SERVICE_DISABLED: String = "ServiceDisabled"
    @JvmField public val ERROR_UNKNOWN_ERROR: String = "UnknownError"
    @JvmField public val ERROR_USER_CANCELED: String = "UserCanceled"
    @JvmField public val EXTRA_ACCESS_TOKEN: String = "com.facebook.platform.extra.ACCESS_TOKEN"
    @JvmField public val EXTRA_ACTION: String = "com.facebook.platform.extra.ACTION"
    @JvmField public val EXTRA_ACTION_TYPE: String = "com.facebook.platform.extra.ACTION_TYPE"
    @JvmField public val EXTRA_APPLICATION_ID: String = "com.facebook.platform.extra.APPLICATION_ID"
    @JvmField public val EXTRA_APPLICATION_NAME: String = "com.facebook.platform.extra.APPLICATION_NAME"
    @JvmField public val EXTRA_DATA_FAILURES_FATAL: String = "com.facebook.platform.extra.DATA_FAILURES_FATAL"
    @JvmField public val EXTRA_DESCRIPTION: String = "com.facebook.platform.extra.DESCRIPTION"
    @JvmField public val EXTRA_EXPIRES_SECONDS_SINCE_EPOCH: String = "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH"
    @JvmField public val EXTRA_FRIEND_TAGS: String = "com.facebook.platform.extra.FRIENDS"
    @JvmField public val EXTRA_GET_INSTALL_DATA_PACKAGE: String = "com.facebook.platform.extra.INSTALLDATA_PACKAGE"
    @JvmField public val EXTRA_IMAGE: String = "com.facebook.platform.extra.IMAGE"
    @JvmField public val EXTRA_LIKE_COUNT_STRING_WITHOUT_LIKE: String = "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"
    @JvmField public val EXTRA_LIKE_COUNT_STRING_WITH_LIKE: String = "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE"
    @JvmField public val EXTRA_LINK: String = "com.facebook.platform.extra.LINK"
    @JvmField public val EXTRA_OBJECT_ID: String = "com.facebook.platform.extra.OBJECT_ID"
    @JvmField public val EXTRA_OBJECT_IS_LIKED: String = "com.facebook.platform.extra.OBJECT_IS_LIKED"
    @JvmField public val EXTRA_PERMISSIONS: String = "com.facebook.platform.extra.PERMISSIONS"
    @JvmField public val EXTRA_PHOTOS: String = "com.facebook.platform.extra.PHOTOS"
    @JvmField public val EXTRA_PLACE_TAG: String = "com.facebook.platform.extra.PLACE"
    @JvmField public val EXTRA_PREVIEW_PROPERTY_NAME: String = "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME"
    @JvmField public val EXTRA_PROTOCOL_ACTION: String = "com.facebook.platform.protocol.PROTOCOL_ACTION"
    @JvmField public val EXTRA_PROTOCOL_BRIDGE_ARGS: String = "com.facebook.platform.protocol.BRIDGE_ARGS"
    @JvmField public val EXTRA_PROTOCOL_CALL_ID: String = "com.facebook.platform.protocol.CALL_ID"
    @JvmField public val EXTRA_PROTOCOL_METHOD_ARGS: String = "com.facebook.platform.protocol.METHOD_ARGS"
    @JvmField public val EXTRA_PROTOCOL_METHOD_RESULTS: String = "com.facebook.platform.protocol.RESULT_ARGS"
    @JvmField public val EXTRA_PROTOCOL_VERSION: String = "com.facebook.platform.protocol.PROTOCOL_VERSION"
    val EXTRA_PROTOCOL_VERSIONS: String = "com.facebook.platform.extra.PROTOCOL_VERSIONS"
    @JvmField public val EXTRA_REF: String = "com.facebook.platform.extra.REF"
    @JvmField public val EXTRA_SOCIAL_SENTENCE_WITHOUT_LIKE: String = "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"
    @JvmField public val EXTRA_SOCIAL_SENTENCE_WITH_LIKE: String = "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"
    @JvmField public val EXTRA_SUBTITLE: String = "com.facebook.platform.extra.SUBTITLE"
    @JvmField public val EXTRA_TITLE: String = "com.facebook.platform.extra.TITLE"
    @JvmField public val EXTRA_UNLIKE_TOKEN: String = "com.facebook.platform.extra.UNLIKE_TOKEN"
    private val FACEBOOK_APP_INFO: com.facebook.internal.NativeProtocol.NativeAppInfo = null!!
    private val FACEBOOK_PROXY_AUTH_ACTIVITY: String = "com.facebook.katana.ProxyAuth"
    @JvmField public val FACEBOOK_PROXY_AUTH_APP_ID_KEY: String = "client_id"
    @JvmField public val FACEBOOK_PROXY_AUTH_E2E_KEY: String = "e2e"
    @JvmField public val FACEBOOK_PROXY_AUTH_PERMISSIONS_KEY: String = "scope"
    private val FACEBOOK_TOKEN_REFRESH_ACTIVITY: String = "com.facebook.katana.platform.TokenRefreshService"
    @JvmField public val IMAGE_URL_KEY: String = "url"
    @JvmField public val IMAGE_USER_GENERATED_KEY: String = "user_generated"
    val INTENT_ACTION_PLATFORM_ACTIVITY: String = "com.facebook.platform.PLATFORM_ACTIVITY"
    val INTENT_ACTION_PLATFORM_SERVICE: String = "com.facebook.platform.PLATFORM_SERVICE"
    private val KNOWN_PROTOCOL_VERSIONS: java.util.List = null!!
    @JvmField public val MESSAGE_GET_ACCESS_TOKEN_REPLY: Int = 0x10001
    @JvmField public val MESSAGE_GET_ACCESS_TOKEN_REQUEST: Int = 0x10000
    @JvmField public val MESSAGE_GET_INSTALL_DATA_REPLY: Int = 0x10005
    @JvmField public val MESSAGE_GET_INSTALL_DATA_REQUEST: Int = 0x10004
    @JvmField public val MESSAGE_GET_LIKE_STATUS_REPLY: Int = 0x10007
    @JvmField public val MESSAGE_GET_LIKE_STATUS_REQUEST: Int = 0x10006
    val MESSAGE_GET_PROTOCOL_VERSIONS_REPLY: Int = 0x10003
    val MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST: Int = 0x10002
    @JvmField public val METHOD_ARGS_ACTION: String = "ACTION"
    @JvmField public val METHOD_ARGS_ACTION_TYPE: String = "ACTION_TYPE"
    @JvmField public val METHOD_ARGS_DATA_FAILURES_FATAL: String = "DATA_FAILURES_FATAL"
    @JvmField public val METHOD_ARGS_DESCRIPTION: String = "DESCRIPTION"
    @JvmField public val METHOD_ARGS_FRIEND_TAGS: String = "FRIENDS"
    @JvmField public val METHOD_ARGS_IMAGE: String = "IMAGE"
    @JvmField public val METHOD_ARGS_LINK: String = "LINK"
    @JvmField public val METHOD_ARGS_OBJECT_ID: String = "object_id"
    @JvmField public val METHOD_ARGS_PHOTOS: String = "PHOTOS"
    @JvmField public val METHOD_ARGS_PLACE_TAG: String = "PLACE"
    @JvmField public val METHOD_ARGS_PREVIEW_PROPERTY_NAME: String = "PREVIEW_PROPERTY_NAME"
    @JvmField public val METHOD_ARGS_REF: String = "REF"
    @JvmField public val METHOD_ARGS_SUBTITLE: String = "SUBTITLE"
    @JvmField public val METHOD_ARGS_TITLE: String = "TITLE"
    @JvmField public val METHOD_ARGS_VIDEO: String = "VIDEO"
    @JvmField public val NO_PROTOCOL_AVAILABLE: Int = 0
    @JvmField public val OPEN_GRAPH_CREATE_OBJECT_KEY: String = "fbsdk:create_object"
    private val PLATFORM_PROVIDER_VERSIONS: String = ".provider.PlatformProvider/versions"
    private val PLATFORM_PROVIDER_VERSION_COLUMN: String = "version"
    @JvmField public val PROTOCOL_VERSION_20121101: Int = 0x133060d
    @JvmField public val PROTOCOL_VERSION_20130502: Int = 0x1332ac6
    @JvmField public val PROTOCOL_VERSION_20130618: Int = 0x1332b3a
    @JvmField public val PROTOCOL_VERSION_20131107: Int = 0x1332d23
    @JvmField public val PROTOCOL_VERSION_20140204: Int = 0x13350ac
    @JvmField public val PROTOCOL_VERSION_20140324: Int = 0x1335124
    @JvmField public val PROTOCOL_VERSION_20140701: Int = 0x133529d
    @JvmField public val PROTOCOL_VERSION_20141001: Int = 0x13353c9
    @JvmField public val PROTOCOL_VERSION_20141028: Int = 0x13353e4
    @JvmField public val PROTOCOL_VERSION_20141107: Int = 0x1335433
    @JvmField public val PROTOCOL_VERSION_20141218: Int = 0x13354a2
    @JvmField public val RESULT_ARGS_ACCESS_TOKEN: String = "access_token"
    @JvmField public val RESULT_ARGS_EXPIRES_SECONDS_SINCE_EPOCH: String = "expires_seconds_since_epoch"
    @JvmField public val RESULT_ARGS_PERMISSIONS: String = "permissions"
    @JvmField public val STATUS_ERROR_CODE: String = "com.facebook.platform.status.ERROR_CODE"
    @JvmField public val STATUS_ERROR_DESCRIPTION: String = "com.facebook.platform.status.ERROR_DESCRIPTION"
    @JvmField public val STATUS_ERROR_JSON: String = "com.facebook.platform.status.ERROR_JSON"
    @JvmField public val STATUS_ERROR_SUBCODE: String = "com.facebook.platform.status.ERROR_SUBCODE"
    @JvmField public val STATUS_ERROR_TYPE: String = "com.facebook.platform.status.ERROR_TYPE"
    private var actionToAppInfoMap: java.util.Map
    private var facebookAppInfoList: java.util.List

    private @JvmStatic fun buildActionToAppInfoMap(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;",
    //                 ">;>;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         new-instance v2, Lcom/facebook/internal/NativeProtocol$MessengerAppInfo;
    //         const/4 v3, 0x0
    //         invoke-direct {v2, v3}, Lcom/facebook/internal/NativeProtocol$MessengerAppInfo;-><init>(Lcom/facebook/internal/NativeProtocol$1;)V
    //         invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         const-string v2, "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"
    //         sget-object v3, Lcom/facebook/internal/NativeProtocol;->facebookAppInfoList:Ljava/util/List;
    //         invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v2, "com.facebook.platform.action.request.FEED_DIALOG"
    //         sget-object v3, Lcom/facebook/internal/NativeProtocol;->facebookAppInfoList:Ljava/util/List;
    //         invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v2, "com.facebook.platform.action.request.LIKE_DIALOG"
    //         sget-object v3, Lcom/facebook/internal/NativeProtocol;->facebookAppInfoList:Ljava/util/List;
    //         invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v2, "com.facebook.platform.action.request.MESSAGE_DIALOG"
    //         invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v2, "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"
    //         invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-object v0
    */

    private @JvmStatic fun buildFacebookAppList(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         sget-object v1, Lcom/facebook/internal/NativeProtocol;->FACEBOOK_APP_INFO:Lcom/facebook/internal/NativeProtocol$NativeAppInfo;
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         new-instance v1, Lcom/facebook/internal/NativeProtocol$WakizashiAppInfo;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, v2}, Lcom/facebook/internal/NativeProtocol$WakizashiAppInfo;-><init>(Lcom/facebook/internal/NativeProtocol$1;)V
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-object v0
    */

    private @JvmStatic fun buildPlatformProviderVersionURI(p0: com.facebook.internal.NativeProtocol.NativeAppInfo): android.net.Uri { return TODO("body: (Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Landroid/net/Uri;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "content://"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;->getPackage()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ".provider.PlatformProvider/versions"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun computeLatestAvailableVersionFromVersionSpec(p0: java.util.TreeSet, p1: Int, p2: IntArray): Int { return TODO("body: (Ljava/util/TreeSet;I[I)I") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/TreeSet",
    //                 "<",
    //                 "Ljava/lang/Integer;",
    //                 ">;I[I)I"
    //             }
    //         .end annotation
    //         const/4 v2, -0x1
    //         array-length v0, p2
    //         add-int/lit8 v0, v0, -0x1
    //         invoke-virtual {p0}, Ljava/util/TreeSet;->descendingIterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         move v1, v2
    //         move v3, v0
    //         :goto_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Integer;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v5
    //         invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I
    //         move-result v0
    //         move v1, v3
    //         :goto_1
    //         if-ltz v1, :cond_0
    //         aget v3, p2, v1
    //         if-le v3, v5, :cond_0
    //         add-int/lit8 v1, v1, -0x1
    //         goto :goto_1
    //         :cond_0
    //         if-gez v1, :cond_2
    //         :cond_1
    //         :goto_2
    //         return v2
    //         :cond_2
    //         aget v3, p2, v1
    //         if-ne v3, v5, :cond_3
    //         rem-int/lit8 v1, v1, 0x2
    //         if-nez v1, :cond_1
    //         invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I
    //         move-result v2
    //         goto :goto_2
    //         :cond_3
    //         move v3, v1
    //         move v1, v0
    //         goto :goto_0
    */

    public @JvmStatic fun createPlatformActivityIntent(p0: android.content.Context, p1: String, p2: String, p3: Int, p4: String, p5: android.os.Bundle): android.content.Intent { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;") }
    /*
    //         .locals 4
    //         const-string v0, "com.facebook.platform.PLATFORM_ACTIVITY"
    //         invoke-static {p0, v0, p2}, Lcom/facebook/internal/NativeProtocol;->findActivityIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->getMetadataApplicationId(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "com.facebook.platform.protocol.PROTOCOL_VERSION"
    //         invoke-virtual {v0, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         move-result-object v2
    //         const-string v3, "com.facebook.platform.protocol.PROTOCOL_ACTION"
    //         invoke-virtual {v2, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         const-string v3, "com.facebook.platform.extra.APPLICATION_ID"
    //         invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         invoke-static {p3}, Lcom/facebook/internal/NativeProtocol;->isVersionCompatibleWithBucketedIntent(I)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         const-string v2, "action_id"
    //         invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "app_name"
    //         invoke-virtual {v1, v2, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v2, "com.facebook.platform.protocol.BRIDGE_ARGS"
    //         invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //         if-nez p5, :cond_1
    //         new-instance p5, Landroid/os/Bundle;
    //         invoke-direct {p5}, Landroid/os/Bundle;-><init>()V
    //         :cond_1
    //         const-string v1, "com.facebook.platform.protocol.METHOD_ARGS"
    //         invoke-virtual {v0, v1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //         goto :goto_0
    //         :cond_2
    //         const-string v1, "com.facebook.platform.protocol.CALL_ID"
    //         invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "com.facebook.platform.extra.APPLICATION_NAME"
    //         invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         invoke-virtual {v0, p5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         goto :goto_0
    */

    public @JvmStatic fun createPlatformServiceIntent(p0: android.content.Context): android.content.Intent { return TODO("body: (Landroid/content/Context;)Landroid/content/Intent;") }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/facebook/internal/NativeProtocol;->facebookAppInfoList:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;
    //         new-instance v2, Landroid/content/Intent;
    //         const-string v3, "com.facebook.platform.PLATFORM_SERVICE"
    //         invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;->getPackage()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         const-string v3, "android.intent.category.DEFAULT"
    //         invoke-virtual {v2, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         invoke-static {p0, v2, v0}, Lcom/facebook/internal/NativeProtocol;->validateServiceIntent(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Landroid/content/Intent;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun createProxyAuthIntent(p0: android.content.Context, p1: String, p2: java.util.List, p3: String, p4: Boolean, p5: com.facebook.SessionDefaultAudience): android.content.Intent { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLcom/facebook/SessionDefaultAudience;)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/lang/String;",
    //                 "Z",
    //                 "Lcom/facebook/SessionDefaultAudience;",
    //                 ")",
    //                 "Landroid/content/Intent;"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/facebook/internal/NativeProtocol;->facebookAppInfoList:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;
    //         new-instance v2, Landroid/content/Intent;
    //         invoke-direct {v2}, Landroid/content/Intent;-><init>()V
    //         invoke-virtual {v0}, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;->getPackage()Ljava/lang/String;
    //         move-result-object v3
    //         const-string v4, "com.facebook.katana.ProxyAuth"
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         const-string v3, "client_id"
    //         invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         invoke-static {p2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z
    //         move-result v3
    //         if-nez v3, :cond_1
    //         const-string v3, "scope"
    //         const-string v4, ","
    //         invoke-static {v4, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         :cond_1
    //         invoke-static {p3}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v3
    //         if-nez v3, :cond_2
    //         const-string v3, "e2e"
    //         invoke-virtual {v2, v3, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         :cond_2
    //         const-string v3, "response_type"
    //         const-string v4, "token"
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v3, "return_scopes"
    //         const-string v4, "true"
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v3, "default_audience"
    //         invoke-virtual {p5}, Lcom/facebook/SessionDefaultAudience;->getNativeProtocolAudience()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         invoke-static {}, Lcom/facebook/Settings;->getPlatformCompatibilityEnabled()Z
    //         move-result v3
    //         if-nez v3, :cond_3
    //         const-string v3, "legacy_override"
    //         const-string v4, "v2.2"
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         if-eqz p4, :cond_3
    //         const-string v3, "auth_type"
    //         const-string v4, "rerequest"
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         :cond_3
    //         invoke-static {p0, v2, v0}, Lcom/facebook/internal/NativeProtocol;->validateActivityIntent(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Landroid/content/Intent;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_4
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun createTokenRefreshIntent(p0: android.content.Context): android.content.Intent { return TODO("body: (Landroid/content/Context;)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         sget-object v0, Lcom/facebook/internal/NativeProtocol;->facebookAppInfoList:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;
    //         new-instance v2, Landroid/content/Intent;
    //         invoke-direct {v2}, Landroid/content/Intent;-><init>()V
    //         invoke-virtual {v0}, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;->getPackage()Ljava/lang/String;
    //         move-result-object v3
    //         const-string v4, "com.facebook.katana.platform.TokenRefreshService"
    //         invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         invoke-static {p0, v2, v0}, Lcom/facebook/internal/NativeProtocol;->validateServiceIntent(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Landroid/content/Intent;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private @JvmStatic fun findActivityIntent(p0: android.content.Context, p1: String, p2: String): android.content.Intent { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         sget-object v0, Lcom/facebook/internal/NativeProtocol;->actionToAppInfoMap:Ljava/util/Map;
    //         invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/List;
    //         if-nez v0, :cond_1
    //         move-object v0, v1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         move-object v0, v1
    //         :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;
    //         new-instance v1, Landroid/content/Intent;
    //         invoke-direct {v1}, Landroid/content/Intent;-><init>()V
    //         invoke-virtual {v1, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v1
    //         invoke-virtual {v0}, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;->getPackage()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v1
    //         const-string v3, "android.intent.category.DEFAULT"
    //         invoke-virtual {v1, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v1
    //         invoke-static {p0, v1, v0}, Lcom/facebook/internal/NativeProtocol;->validateActivityIntent(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Landroid/content/Intent;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         goto :goto_0
    */

    private @JvmStatic fun getAllAvailableProtocolVersionsForAppInfo(p0: android.content.Context, p1: com.facebook.internal.NativeProtocol.NativeAppInfo): java.util.TreeSet { return TODO("body: (Landroid/content/Context;Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Ljava/util/TreeSet;") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;",
    //                 ")",
    //                 "Ljava/util/TreeSet",
    //                 "<",
    //                 "Ljava/lang/Integer;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const/4 v6, 0x0
    //         new-instance v7, Ljava/util/TreeSet;
    //         invoke-direct {v7}, Ljava/util/TreeSet;-><init>()V
    //         invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         const/4 v1, 0x1
    //         new-array v2, v1, [Ljava/lang/String;
    //         const/4 v1, 0x0
    //         const-string v3, "version"
    //         aput-object v3, v2, v1
    //         invoke-static {p1}, Lcom/facebook/internal/NativeProtocol;->buildPlatformProviderVersionURI(Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Landroid/net/Uri;
    //         move-result-object v1
    //         const/4 v3, 0x0
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         :try_start_0
    //         invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_1
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         :goto_0
    //         :try_start_1
    //         invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-string v0, "version"
    //         invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
    //         move-result v0
    //         invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-virtual {v7, v0}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :goto_1
    //         if-eqz v1, :cond_0
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_0
    //         throw v0
    //         :cond_1
    //         if-eqz v1, :cond_2
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_2
    //         return-object v7
    //         :catchall_1
    //         move-exception v0
    //         move-object v1, v6
    //         goto :goto_1
    */

    public @JvmStatic fun getBridgeArgumentsFromIntent(p0: android.content.Intent): android.os.Bundle { return TODO("body: (Landroid/content/Intent;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/facebook/internal/NativeProtocol;->getProtocolVersionFromIntent(Landroid/content/Intent;)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/facebook/internal/NativeProtocol;->isVersionCompatibleWithBucketedIntent(I)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.facebook.platform.protocol.BRIDGE_ARGS"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun getCallIdFromIntent(p0: android.content.Intent): java.util.UUID { return TODO("body: (Landroid/content/Intent;)Ljava/util/UUID;") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         if-nez p0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v1
    //         :cond_1
    //         invoke-static {p0}, Lcom/facebook/internal/NativeProtocol;->getProtocolVersionFromIntent(Landroid/content/Intent;)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/facebook/internal/NativeProtocol;->isVersionCompatibleWithBucketedIntent(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         const-string v0, "com.facebook.platform.protocol.BRIDGE_ARGS"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         const-string v2, "action_id"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_1
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v1
    //         goto :goto_0
    //         :cond_2
    //         const-string v0, "com.facebook.platform.protocol.CALL_ID"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    //         :cond_3
    //         move-object v0, v1
    //         goto :goto_1
    */

    public @JvmStatic fun getErrorDataFromResultIntent(p0: android.content.Intent): android.os.Bundle { return TODO("body: (Landroid/content/Intent;)Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/facebook/internal/NativeProtocol;->isErrorResult(Landroid/content/Intent;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {p0}, Lcom/facebook/internal/NativeProtocol;->getBridgeArgumentsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         const-string v1, "error"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun getExceptionFromErrorData(p0: android.os.Bundle): Exception { return TODO("body: (Landroid/os/Bundle;)Ljava/lang/Exception;") }
    /*
    //         .locals 3
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "error_type"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         const-string v0, "com.facebook.platform.status.ERROR_TYPE"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_1
    //         const-string v1, "error_description"
    //         invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-nez v1, :cond_2
    //         const-string v1, "com.facebook.platform.status.ERROR_DESCRIPTION"
    //         invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         :cond_2
    //         if-eqz v0, :cond_3
    //         const-string v2, "UserCanceled"
    //         invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         new-instance v0, Lcom/facebook/FacebookOperationCanceledException;
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookOperationCanceledException;-><init>(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_3
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         goto :goto_0
    */

    public @JvmStatic fun getLatestAvailableProtocolVersionForAction(p0: android.content.Context, p1: String, p2: IntArray): Int { return TODO("body: (Landroid/content/Context;Ljava/lang/String;[I)I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/internal/NativeProtocol;->actionToAppInfoMap:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/List;
    //         invoke-static {p0, v0, p2}, Lcom/facebook/internal/NativeProtocol;->getLatestAvailableProtocolVersionForAppInfoList(Landroid/content/Context;Ljava/util/List;[I)I
    //         move-result v0
    //         return v0
    */

    private @JvmStatic fun getLatestAvailableProtocolVersionForAppInfo(p0: android.content.Context, p1: com.facebook.internal.NativeProtocol.NativeAppInfo, p2: IntArray): Int { return TODO("body: (Landroid/content/Context;Lcom/facebook/internal/NativeProtocol$NativeAppInfo;[I)I") }
    /*
    //         .locals 2
    //         invoke-static {p0, p1}, Lcom/facebook/internal/NativeProtocol;->getAllAvailableProtocolVersionsForAppInfo(Landroid/content/Context;Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Ljava/util/TreeSet;
    //         move-result-object v0
    //         invoke-static {}, Lcom/facebook/internal/NativeProtocol;->getLatestKnownVersion()I
    //         move-result v1
    //         invoke-static {v0, v1, p2}, Lcom/facebook/internal/NativeProtocol;->computeLatestAvailableVersionFromVersionSpec(Ljava/util/TreeSet;I[I)I
    //         move-result v0
    //         return v0
    */

    private @JvmStatic fun getLatestAvailableProtocolVersionForAppInfoList(p0: android.content.Context, p1: java.util.List, p2: IntArray): Int { return TODO("body: (Landroid/content/Context;Ljava/util/List;[I)I") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/internal/NativeProtocol$NativeAppInfo;",
    //                 ">;[I)I"
    //             }
    //         .end annotation
    //         const/4 v1, -0x1
    //         if-nez p1, :cond_0
    //         move v0, v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;
    //         invoke-static {p0, v0, p2}, Lcom/facebook/internal/NativeProtocol;->getLatestAvailableProtocolVersionForAppInfo(Landroid/content/Context;Lcom/facebook/internal/NativeProtocol$NativeAppInfo;[I)I
    //         move-result v0
    //         if-eq v0, v1, :cond_1
    //         goto :goto_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    */

    public @JvmStatic fun getLatestAvailableProtocolVersionForService(p0: android.content.Context, p1: Int): Int { return TODO("body: (Landroid/content/Context;I)I") }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/facebook/internal/NativeProtocol;->facebookAppInfoList:Ljava/util/List;
    //         const/4 v1, 0x1
    //         new-array v1, v1, [I
    //         const/4 v2, 0x0
    //         aput p1, v1, v2
    //         invoke-static {p0, v0, v1}, Lcom/facebook/internal/NativeProtocol;->getLatestAvailableProtocolVersionForAppInfoList(Landroid/content/Context;Ljava/util/List;[I)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getLatestKnownVersion(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/facebook/internal/NativeProtocol;->KNOWN_PROTOCOL_VERSIONS:Ljava/util/List;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Integer;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getProtocolVersionFromIntent(p0: android.content.Intent): Int { return TODO("body: (Landroid/content/Intent;)I") }
    /*
    //         .locals 2
    //         const-string v0, "com.facebook.platform.protocol.PROTOCOL_VERSION"
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getSuccessResultsFromIntent(p0: android.content.Intent): android.os.Bundle { return TODO("body: (Landroid/content/Intent;)Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/facebook/internal/NativeProtocol;->getProtocolVersionFromIntent(Landroid/content/Intent;)I
    //         move-result v1
    //         invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-static {v1}, Lcom/facebook/internal/NativeProtocol;->isVersionCompatibleWithBucketedIntent(I)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const-string v1, "com.facebook.platform.protocol.RESULT_ARGS"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun isErrorResult(p0: android.content.Intent): Boolean { return TODO("body: (Landroid/content/Intent;)Z") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/facebook/internal/NativeProtocol;->getBridgeArgumentsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const-string v1, "error"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "com.facebook.platform.status.ERROR_TYPE"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public @JvmStatic fun isVersionCompatibleWithBucketedIntent(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/facebook/internal/NativeProtocol;->KNOWN_PROTOCOL_VERSIONS:Ljava/util/List;
    //         invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const v0, 0x133529d
    //         if-lt p0, v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    @JvmStatic fun validateActivityIntent(p0: android.content.Context, p1: android.content.Intent, p2: com.facebook.internal.NativeProtocol.NativeAppInfo): android.content.Intent { return TODO("body: (Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Landroid/content/Intent;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         if-nez p1, :cond_1
    //         move-object p1, v0
    //         :cond_0
    //         :goto_0
    //         return-object p1
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //         move-result-object v1
    //         if-nez v1, :cond_2
    //         move-object p1, v0
    //         goto :goto_0
    //         :cond_2
    //         iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
    //         iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
    //         invoke-virtual {p2, p0, v1}, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;->validateSignature(Landroid/content/Context;Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         move-object p1, v0
    //         goto :goto_0
    */

    @JvmStatic fun validateServiceIntent(p0: android.content.Context, p1: android.content.Intent, p2: com.facebook.internal.NativeProtocol.NativeAppInfo): android.content.Intent { return TODO("body: (Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Landroid/content/Intent;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         if-nez p1, :cond_1
    //         move-object p1, v0
    //         :cond_0
    //         :goto_0
    //         return-object p1
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //         move-result-object v1
    //         if-nez v1, :cond_2
    //         move-object p1, v0
    //         goto :goto_0
    //         :cond_2
    //         iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
    //         iget-object v1, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;
    //         invoke-virtual {p2, p0, v1}, Lcom/facebook/internal/NativeProtocol$NativeAppInfo;->validateSignature(Landroid/content/Context;Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         move-object p1, v0
    //         goto :goto_0
    */

    }
}
