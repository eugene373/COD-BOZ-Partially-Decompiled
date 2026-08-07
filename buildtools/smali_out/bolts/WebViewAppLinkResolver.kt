package bolts

// Auto-emitted from smali source: WebViewAppLinkResolver.java.
// 13 fields, 11 methods.

open class WebViewAppLinkResolver: bolts.AppLinkResolver {
    private val context: android.content.Context

    public constructor(context: android.content.Context)

    public fun getAppLinkFromUrlInBackground(url: android.net.Uri): bolts.Task { return TODO("body: (Landroid/net/Uri;)Lbolts/Task;") }
    /*
    //         .locals 5
    //         new-instance v0, Lbolts/Capture;
    //         invoke-direct {v0}, Lbolts/Capture;-><init>()V
    //         .local v0, "content":Lbolts/Capture;, "Lbolts/Capture<Ljava/lang/String;>;"
    //         new-instance v1, Lbolts/Capture;
    //         invoke-direct {v1}, Lbolts/Capture;-><init>()V
    //         .local v1, "contentType":Lbolts/Capture;, "Lbolts/Capture<Ljava/lang/String;>;"
    //         new-instance v2, Lbolts/WebViewAppLinkResolver$3;
    //         invoke-direct {v2, p0, p1, v0, v1}, Lbolts/WebViewAppLinkResolver$3;-><init>(Lbolts/WebViewAppLinkResolver;Landroid/net/Uri;Lbolts/Capture;Lbolts/Capture;)V
    //         invoke-static {v2}, Lbolts/Task;->callInBackground(Ljava/util/concurrent/Callable;)Lbolts/Task;
    //         move-result-object v2
    //         new-instance v3, Lbolts/WebViewAppLinkResolver$2;
    //         invoke-direct {v3, p0, v1, p1, v0}, Lbolts/WebViewAppLinkResolver$2;-><init>(Lbolts/WebViewAppLinkResolver;Lbolts/Capture;Landroid/net/Uri;Lbolts/Capture;)V
    //         sget-object v4, Lbolts/Task;->UI_THREAD_EXECUTOR:Ljava/util/concurrent/Executor;
    //         invoke-virtual {v2, v3, v4}, Lbolts/Task;->onSuccessTask(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
    //         move-result-object v2
    //         new-instance v3, Lbolts/WebViewAppLinkResolver$1;
    //         invoke-direct {v3, p0, p1}, Lbolts/WebViewAppLinkResolver$1;-><init>(Lbolts/WebViewAppLinkResolver;Landroid/net/Uri;)V
    //         invoke-virtual {v2, v3}, Lbolts/Task;->onSuccess(Lbolts/Continuation;)Lbolts/Task;
    //         move-result-object v2
    //         return-object v2
    */

    companion object {
    private val KEY_AL_VALUE: String = "value"
    private val KEY_ANDROID: String = "android"
    private val KEY_APP_NAME: String = "app_name"
    private val KEY_CLASS: String = "class"
    private val KEY_PACKAGE: String = "package"
    private val KEY_SHOULD_FALLBACK: String = "should_fallback"
    private val KEY_URL: String = "url"
    private val KEY_WEB: String = "web"
    private val KEY_WEB_URL: String = "url"
    private val META_TAG_PREFIX: String = "al"
    private val PREFER_HEADER: String = "Prefer-Html-Meta-Tags"
    private val TAG_EXTRACTION_JAVASCRIPT: String = "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName(\'meta\');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute(\'property\');    if (property && property.substring(0, \'al:\'.length) === \'al:\') {      var tag = { \"property\": metaTags[i].getAttribute(\'property\') };      if (metaTags[i].hasAttribute(\'content\')) {        tag[\'content\'] = metaTags[i].getAttribute(\'content\');      }      results.push(tag);    }  }  return JSON.stringify(results);})())"

    private @JvmStatic fun getAlList(key: java.util.Map, p1: String): java.util.List { return TODO("body: (Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         .local p0, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/List;
    //         .local v0, "result":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         if-nez v0, :cond_0
    //         invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    //         move-result-object v0
    //         .end local v0    # "result":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         :cond_0
    //         return-object v0
    */

    private @JvmStatic fun makeAppLinkFromAlData(destination: java.util.Map, p1: android.net.Uri): bolts.AppLink { return TODO("body: (Ljava/util/Map;Landroid/net/Uri;)Lbolts/AppLink;") }
    /*
    //         .locals 30
    //         .local p0, "appLinkDict":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         new-instance v18, Ljava/util/ArrayList;
    //         invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V
    //         .local v18, "targets":Ljava/util/List;, "Ljava/util/List<Lbolts/AppLink$Target;>;"
    //         const-string v26, "android"
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, v26
    //         invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v14
    //         check-cast v14, Ljava/util/List;
    //         .local v14, "platformMapList":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         if-nez v14, :cond_0
    //         invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    //         move-result-object v14
    //         :cond_0
    //         invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v9
    //         .local v9, "i$":Ljava/util/Iterator;
    //         :cond_1
    //         invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v26
    //         if-eqz v26, :cond_6
    //         invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v13
    //         check-cast v13, Ljava/util/Map;
    //         .local v13, "platformMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         const-string v26, "url"
    //         move-object/from16 v0, v26
    //         invoke-static {v13, v0}, Lbolts/WebViewAppLinkResolver;->getAlList(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;
    //         move-result-object v21
    //         .local v21, "urls":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         const-string v26, "package"
    //         move-object/from16 v0, v26
    //         invoke-static {v13, v0}, Lbolts/WebViewAppLinkResolver;->getAlList(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;
    //         move-result-object v12
    //         .local v12, "packages":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         const-string v26, "class"
    //         move-object/from16 v0, v26
    //         invoke-static {v13, v0}, Lbolts/WebViewAppLinkResolver;->getAlList(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;
    //         move-result-object v7
    //         .local v7, "classes":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         const-string v26, "app_name"
    //         move-object/from16 v0, v26
    //         invoke-static {v13, v0}, Lbolts/WebViewAppLinkResolver;->getAlList(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;
    //         move-result-object v5
    //         .local v5, "appNames":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I
    //         move-result v26
    //         invoke-interface {v12}, Ljava/util/List;->size()I
    //         move-result v27
    //         invoke-interface {v7}, Ljava/util/List;->size()I
    //         move-result v28
    //         invoke-interface {v5}, Ljava/util/List;->size()I
    //         move-result v29
    //         invoke-static/range {v28 .. v29}, Ljava/lang/Math;->max(II)I
    //         move-result v28
    //         invoke-static/range {v27 .. v28}, Ljava/lang/Math;->max(II)I
    //         move-result v27
    //         invoke-static/range {v26 .. v27}, Ljava/lang/Math;->max(II)I
    //         move-result v10
    //         .local v10, "maxCount":I
    //         const/4 v8, 0x0
    //         .local v8, "i":I
    //         :goto_0
    //         if-ge v8, v10, :cond_1
    //         invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I
    //         move-result v26
    //         move/from16 v0, v26
    //         if-le v0, v8, :cond_2
    //         move-object/from16 v0, v21
    //         invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v26
    //         check-cast v26, Ljava/util/Map;
    //         const-string v27, "value"
    //         invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v26
    //         :goto_1
    //         check-cast v26, Ljava/lang/String;
    //         move-object/from16 v20, v26
    //         check-cast v20, Ljava/lang/String;
    //         .local v20, "urlString":Ljava/lang/String;
    //         invoke-static/range {v20 .. v20}, Lbolts/WebViewAppLinkResolver;->tryCreateUrl(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v19
    //         .local v19, "url":Landroid/net/Uri;
    //         invoke-interface {v12}, Ljava/util/List;->size()I
    //         move-result v26
    //         move/from16 v0, v26
    //         if-le v0, v8, :cond_3
    //         invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v26
    //         check-cast v26, Ljava/util/Map;
    //         const-string v27, "value"
    //         invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v26
    //         :goto_2
    //         check-cast v26, Ljava/lang/String;
    //         move-object/from16 v11, v26
    //         check-cast v11, Ljava/lang/String;
    //         .local v11, "packageName":Ljava/lang/String;
    //         invoke-interface {v7}, Ljava/util/List;->size()I
    //         move-result v26
    //         move/from16 v0, v26
    //         if-le v0, v8, :cond_4
    //         invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v26
    //         check-cast v26, Ljava/util/Map;
    //         const-string v27, "value"
    //         invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v26
    //         :goto_3
    //         check-cast v26, Ljava/lang/String;
    //         move-object/from16 v6, v26
    //         check-cast v6, Ljava/lang/String;
    //         .local v6, "className":Ljava/lang/String;
    //         invoke-interface {v5}, Ljava/util/List;->size()I
    //         move-result v26
    //         move/from16 v0, v26
    //         if-le v0, v8, :cond_5
    //         invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v26
    //         check-cast v26, Ljava/util/Map;
    //         const-string v27, "value"
    //         invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v26
    //         :goto_4
    //         check-cast v26, Ljava/lang/String;
    //         move-object/from16 v4, v26
    //         check-cast v4, Ljava/lang/String;
    //         .local v4, "appName":Ljava/lang/String;
    //         new-instance v17, Lbolts/AppLink$Target;
    //         move-object/from16 v0, v17
    //         move-object/from16 v1, v19
    //         invoke-direct {v0, v11, v6, v1, v4}, Lbolts/AppLink$Target;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V
    //         .local v17, "target":Lbolts/AppLink$Target;
    //         move-object/from16 v0, v18
    //         move-object/from16 v1, v17
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v8, v8, 0x1
    //         goto/16 :goto_0
    //         .end local v4    # "appName":Ljava/lang/String;
    //         .end local v6    # "className":Ljava/lang/String;
    //         .end local v11    # "packageName":Ljava/lang/String;
    //         .end local v17    # "target":Lbolts/AppLink$Target;
    //         .end local v19    # "url":Landroid/net/Uri;
    //         .end local v20    # "urlString":Ljava/lang/String;
    //         :cond_2
    //         const/16 v26, 0x0
    //         goto :goto_1
    //         .restart local v19    # "url":Landroid/net/Uri;
    //         .restart local v20    # "urlString":Ljava/lang/String;
    //         :cond_3
    //         const/16 v26, 0x0
    //         goto :goto_2
    //         .restart local v11    # "packageName":Ljava/lang/String;
    //         :cond_4
    //         const/16 v26, 0x0
    //         goto :goto_3
    //         .restart local v6    # "className":Ljava/lang/String;
    //         :cond_5
    //         const/16 v26, 0x0
    //         goto :goto_4
    //         .end local v5    # "appNames":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         .end local v6    # "className":Ljava/lang/String;
    //         .end local v7    # "classes":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         .end local v8    # "i":I
    //         .end local v10    # "maxCount":I
    //         .end local v11    # "packageName":Ljava/lang/String;
    //         .end local v12    # "packages":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         .end local v13    # "platformMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         .end local v19    # "url":Landroid/net/Uri;
    //         .end local v20    # "urlString":Ljava/lang/String;
    //         .end local v21    # "urls":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         :cond_6
    //         move-object/from16 v24, p1
    //         .local v24, "webUrl":Landroid/net/Uri;
    //         const-string v26, "web"
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, v26
    //         invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v23
    //         check-cast v23, Ljava/util/List;
    //         .local v23, "webMapList":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         if-eqz v23, :cond_8
    //         invoke-interface/range {v23 .. v23}, Ljava/util/List;->size()I
    //         move-result v26
    //         if-lez v26, :cond_8
    //         const/16 v26, 0x0
    //         move-object/from16 v0, v23
    //         move/from16 v1, v26
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v22
    //         check-cast v22, Ljava/util/Map;
    //         .local v22, "webMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         const-string v26, "url"
    //         move-object/from16 v0, v22
    //         move-object/from16 v1, v26
    //         invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v21
    //         check-cast v21, Ljava/util/List;
    //         .restart local v21    # "urls":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         const-string v26, "should_fallback"
    //         move-object/from16 v0, v22
    //         move-object/from16 v1, v26
    //         invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v16
    //         check-cast v16, Ljava/util/List;
    //         .local v16, "shouldFallbacks":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         if-eqz v16, :cond_7
    //         invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I
    //         move-result v26
    //         if-lez v26, :cond_7
    //         const/16 v26, 0x0
    //         move-object/from16 v0, v16
    //         move/from16 v1, v26
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v26
    //         check-cast v26, Ljava/util/Map;
    //         const-string v27, "value"
    //         invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v15
    //         check-cast v15, Ljava/lang/String;
    //         .local v15, "shouldFallbackString":Ljava/lang/String;
    //         const/16 v26, 0x3
    //         move/from16 v0, v26
    //         new-array v0, v0, [Ljava/lang/String;
    //         move-object/from16 v26, v0
    //         const/16 v27, 0x0
    //         const-string v28, "no"
    //         aput-object v28, v26, v27
    //         const/16 v27, 0x1
    //         const-string v28, "false"
    //         aput-object v28, v26, v27
    //         const/16 v27, 0x2
    //         const-string v28, "0"
    //         aput-object v28, v26, v27
    //         invoke-static/range {v26 .. v26}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v26
    //         invoke-virtual {v15}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
    //         move-result-object v27
    //         invoke-interface/range {v26 .. v27}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v26
    //         if-eqz v26, :cond_7
    //         const/16 v24, 0x0
    //         .end local v15    # "shouldFallbackString":Ljava/lang/String;
    //         :cond_7
    //         if-eqz v24, :cond_8
    //         if-eqz v21, :cond_8
    //         invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I
    //         move-result v26
    //         if-lez v26, :cond_8
    //         const/16 v26, 0x0
    //         move-object/from16 v0, v21
    //         move/from16 v1, v26
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v26
    //         check-cast v26, Ljava/util/Map;
    //         const-string v27, "value"
    //         invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v25
    //         check-cast v25, Ljava/lang/String;
    //         .local v25, "webUrlString":Ljava/lang/String;
    //         invoke-static/range {v25 .. v25}, Lbolts/WebViewAppLinkResolver;->tryCreateUrl(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v24
    //         .end local v16    # "shouldFallbacks":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         .end local v21    # "urls":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         .end local v22    # "webMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         .end local v25    # "webUrlString":Ljava/lang/String;
    //         :cond_8
    //         new-instance v26, Lbolts/AppLink;
    //         move-object/from16 v0, v26
    //         move-object/from16 v1, p1
    //         move-object/from16 v2, v18
    //         move-object/from16 v3, v24
    //         invoke-direct {v0, v1, v2, v3}, Lbolts/AppLink;-><init>(Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;)V
    //         return-object v26
    */

    private @JvmStatic fun parseAlData(dataArray: org.json.JSONArray): java.util.Map { return TODO("body: (Lorg/json/JSONArray;)Ljava/util/Map;") }
    /*
    //         .locals 12
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v10, 0x0
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         .local v0, "al":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    //         const/4 v3, 0x0
    //         .local v3, "i":I
    //         :goto_0
    //         invoke-virtual {p0}, Lorg/json/JSONArray;->length()I
    //         move-result v9
    //         if-ge v3, v9, :cond_8
    //         invoke-virtual {p0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
    //         move-result-object v8
    //         .local v8, "tag":Lorg/json/JSONObject;
    //         const-string v9, "property"
    //         invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v5
    //         .local v5, "name":Ljava/lang/String;
    //         const-string v9, ":"
    //         invoke-virtual {v5, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v6
    //         .local v6, "nameComponents":[Ljava/lang/String;
    //         const/4 v9, 0x0
    //         aget-object v9, v6, v9
    //         const-string v11, "al"
    //         invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v9
    //         if-nez v9, :cond_1
    //         :cond_0
    //         :goto_1
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_0
    //         :cond_1
    //         move-object v7, v0
    //         .local v7, "root":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         const/4 v4, 0x1
    //         .local v4, "j":I
    //         :goto_2
    //         array-length v9, v6
    //         if-ge v4, v9, :cond_6
    //         aget-object v9, v6, v4
    //         invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/util/List;
    //         .local v2, "children":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         if-nez v2, :cond_2
    //         new-instance v2, Ljava/util/ArrayList;
    //         .end local v2    # "children":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         .restart local v2    # "children":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         aget-object v9, v6, v4
    //         invoke-interface {v7, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_2
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v9
    //         if-lez v9, :cond_5
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v9
    //         add-int/lit8 v9, v9, -0x1
    //         invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v9
    //         check-cast v9, Ljava/util/Map;
    //         move-object v1, v9
    //         .local v1, "child":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         :goto_3
    //         if-eqz v1, :cond_3
    //         array-length v9, v6
    //         add-int/lit8 v9, v9, -0x1
    //         if-ne v4, v9, :cond_4
    //         :cond_3
    //         new-instance v1, Ljava/util/HashMap;
    //         .end local v1    # "child":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    //         .restart local v1    # "child":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_4
    //         move-object v7, v1
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_2
    //         .end local v1    # "child":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         :cond_5
    //         move-object v1, v10
    //         goto :goto_3
    //         .end local v2    # "children":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    //         :cond_6
    //         const-string v9, "content"
    //         invoke-virtual {v8, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v9
    //         if-eqz v9, :cond_0
    //         const-string v9, "content"
    //         invoke-virtual {v8, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
    //         move-result v9
    //         if-eqz v9, :cond_7
    //         const-string v9, "value"
    //         invoke-interface {v7, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_1
    //         :cond_7
    //         const-string v9, "value"
    //         const-string v11, "content"
    //         invoke-virtual {v8, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v11
    //         invoke-interface {v7, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_1
    //         .end local v4    # "j":I
    //         .end local v5    # "name":Ljava/lang/String;
    //         .end local v6    # "nameComponents":[Ljava/lang/String;
    //         .end local v7    # "root":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    //         .end local v8    # "tag":Lorg/json/JSONObject;
    //         :cond_8
    //         return-object v0
    */

    private @JvmStatic fun readFromConnection(connection: java.net.URLConnection): String { return TODO("body: (Ljava/net/URLConnection;)Ljava/lang/String;") }
    /*
    //         .locals 15
    //         instance-of v13, p0, Ljava/net/HttpURLConnection;
    //         if-eqz v13, :cond_0
    //         move-object v4, p0
    //         check-cast v4, Ljava/net/HttpURLConnection;
    //         .local v4, "httpConnection":Ljava/net/HttpURLConnection;
    //         :try_start_0
    //         invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v12
    //         .end local v4    # "httpConnection":Ljava/net/HttpURLConnection;
    //         .local v12, "stream":Ljava/io/InputStream;
    //         :goto_0
    //         :try_start_1
    //         new-instance v8, Ljava/io/ByteArrayOutputStream;
    //         invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V
    //         .local v8, "output":Ljava/io/ByteArrayOutputStream;
    //         const/16 v13, 0x400
    //         new-array v1, v13, [B
    //         .local v1, "buffer":[B
    //         const/4 v11, 0x0
    //         .local v11, "read":I
    //         :goto_1
    //         invoke-virtual {v12, v1}, Ljava/io/InputStream;->read([B)I
    //         move-result v11
    //         const/4 v13, -0x1
    //         if-eq v11, v13, :cond_1
    //         const/4 v13, 0x0
    //         invoke-virtual {v8, v1, v13, v11}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    //         .end local v1    # "buffer":[B
    //         .end local v8    # "output":Ljava/io/ByteArrayOutputStream;
    //         .end local v11    # "read":I
    //         :catchall_0
    //         move-exception v13
    //         invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    //         throw v13
    //         .end local v12    # "stream":Ljava/io/InputStream;
    //         .restart local v4    # "httpConnection":Ljava/net/HttpURLConnection;
    //         :catch_0
    //         move-exception v3
    //         .local v3, "e":Ljava/lang/Exception;
    //         invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;
    //         move-result-object v12
    //         .restart local v12    # "stream":Ljava/io/InputStream;
    //         goto :goto_0
    //         .end local v3    # "e":Ljava/lang/Exception;
    //         .end local v4    # "httpConnection":Ljava/net/HttpURLConnection;
    //         .end local v12    # "stream":Ljava/io/InputStream;
    //         :cond_0
    //         invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
    //         move-result-object v12
    //         .restart local v12    # "stream":Ljava/io/InputStream;
    //         goto :goto_0
    //         .restart local v1    # "buffer":[B
    //         .restart local v8    # "output":Ljava/io/ByteArrayOutputStream;
    //         .restart local v11    # "read":I
    //         :cond_1
    //         :try_start_2
    //         invoke-virtual {p0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;
    //         move-result-object v2
    //         .local v2, "charset":Ljava/lang/String;
    //         if-nez v2, :cond_3
    //         invoke-virtual {p0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;
    //         move-result-object v7
    //         .local v7, "mimeType":Ljava/lang/String;
    //         const-string v13, ";"
    //         invoke-virtual {v7, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v10
    //         .local v10, "parts":[Ljava/lang/String;
    //         move-object v0, v10
    //         .local v0, "arr$":[Ljava/lang/String;
    //         array-length v6, v0
    //         .local v6, "len$":I
    //         const/4 v5, 0x0
    //         .local v5, "i$":I
    //         :goto_2
    //         if-ge v5, v6, :cond_2
    //         aget-object v9, v0, v5
    //         .local v9, "part":Ljava/lang/String;
    //         invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v9
    //         const-string v13, "charset="
    //         invoke-virtual {v9, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v13
    //         if-eqz v13, :cond_4
    //         const-string v13, "charset="
    //         invoke-virtual {v13}, Ljava/lang/String;->length()I
    //         move-result v13
    //         invoke-virtual {v9, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object v2
    //         .end local v9    # "part":Ljava/lang/String;
    //         :cond_2
    //         if-nez v2, :cond_3
    //         const-string v2, "UTF-8"
    //         .end local v0    # "arr$":[Ljava/lang/String;
    //         .end local v5    # "i$":I
    //         .end local v6    # "len$":I
    //         .end local v7    # "mimeType":Ljava/lang/String;
    //         .end local v10    # "parts":[Ljava/lang/String;
    //         :cond_3
    //         new-instance v13, Ljava/lang/String;
    //         invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    //         move-result-object v14
    //         invoke-direct {v13, v14, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    //         return-object v13
    //         .restart local v0    # "arr$":[Ljava/lang/String;
    //         .restart local v5    # "i$":I
    //         .restart local v6    # "len$":I
    //         .restart local v7    # "mimeType":Ljava/lang/String;
    //         .restart local v9    # "part":Ljava/lang/String;
    //         .restart local v10    # "parts":[Ljava/lang/String;
    //         :cond_4
    //         add-int/lit8 v5, v5, 0x1
    //         goto :goto_2
    */

    private @JvmStatic fun tryCreateUrl(urlString: String): android.net.Uri { return TODO("body: (Ljava/lang/String;)Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         goto :goto_0
    */

    }
}
