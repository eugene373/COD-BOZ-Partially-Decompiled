.class public Lbolts/WebViewAppLinkResolver;
.super Ljava/lang/Object;
.source "WebViewAppLinkResolver.java"

# interfaces
.implements Lbolts/AppLinkResolver;


# static fields
.field private static final KEY_AL_VALUE:Ljava/lang/String; = "value"

.field private static final KEY_ANDROID:Ljava/lang/String; = "android"

.field private static final KEY_APP_NAME:Ljava/lang/String; = "app_name"

.field private static final KEY_CLASS:Ljava/lang/String; = "class"

.field private static final KEY_PACKAGE:Ljava/lang/String; = "package"

.field private static final KEY_SHOULD_FALLBACK:Ljava/lang/String; = "should_fallback"

.field private static final KEY_URL:Ljava/lang/String; = "url"

.field private static final KEY_WEB:Ljava/lang/String; = "web"

.field private static final KEY_WEB_URL:Ljava/lang/String; = "url"

.field private static final META_TAG_PREFIX:Ljava/lang/String; = "al"

.field private static final PREFER_HEADER:Ljava/lang/String; = "Prefer-Html-Meta-Tags"

.field private static final TAG_EXTRACTION_JAVASCRIPT:Ljava/lang/String; = "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName(\'meta\');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute(\'property\');    if (property && property.substring(0, \'al:\'.length) === \'al:\') {      var tag = { \"property\": metaTags[i].getAttribute(\'property\') };      if (metaTags[i].hasAttribute(\'content\')) {        tag[\'content\'] = metaTags[i].getAttribute(\'content\');      }      results.push(tag);    }  }  return JSON.stringify(results);})())"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lbolts/WebViewAppLinkResolver;->context:Landroid/content/Context;

    .line 50
    return-void
.end method

.method static synthetic access$000(Lorg/json/JSONArray;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 40
    invoke-static {p0}, Lbolts/WebViewAppLinkResolver;->parseAlData(Lorg/json/JSONArray;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Ljava/util/Map;Landroid/net/Uri;)Lbolts/AppLink;
    .locals 1
    .param p0, "x0"    # Ljava/util/Map;
    .param p1, "x1"    # Landroid/net/Uri;

    .prologue
    .line 40
    invoke-static {p0, p1}, Lbolts/WebViewAppLinkResolver;->makeAppLinkFromAlData(Ljava/util/Map;Landroid/net/Uri;)Lbolts/AppLink;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lbolts/WebViewAppLinkResolver;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Lbolts/WebViewAppLinkResolver;

    .prologue
    .line 40
    iget-object v0, p0, Lbolts/WebViewAppLinkResolver;->context:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$300(Ljava/net/URLConnection;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Ljava/net/URLConnection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 40
    invoke-static {p0}, Lbolts/WebViewAppLinkResolver;->readFromConnection(Ljava/net/URLConnection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getAlList(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 231
    .local p0, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 232
    .local v0, "result":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    if-nez v0, :cond_0

    .line 233
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 235
    .end local v0    # "result":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    :cond_0
    return-object v0
.end method

.method private static makeAppLinkFromAlData(Ljava/util/Map;Landroid/net/Uri;)Lbolts/AppLink;
    .locals 30
    .param p1, "destination"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/net/Uri;",
            ")",
            "Lbolts/AppLink;"
        }
    .end annotation

    .prologue
    .line 240
    .local p0, "appLinkDict":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 241
    .local v18, "targets":Ljava/util/List;, "Ljava/util/List<Lbolts/AppLink$Target;>;"
    const-string v26, "android"

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    .line 243
    .local v14, "platformMapList":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    if-nez v14, :cond_0

    .line 244
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v14

    .line 246
    :cond_0
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    .local v9, "i$":Ljava/util/Iterator;
    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map;

    .line 249
    .local v13, "platformMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v26, "url"

    move-object/from16 v0, v26

    invoke-static {v13, v0}, Lbolts/WebViewAppLinkResolver;->getAlList(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v21

    .line 250
    .local v21, "urls":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    const-string v26, "package"

    move-object/from16 v0, v26

    invoke-static {v13, v0}, Lbolts/WebViewAppLinkResolver;->getAlList(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    .line 251
    .local v12, "packages":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    const-string v26, "class"

    move-object/from16 v0, v26

    invoke-static {v13, v0}, Lbolts/WebViewAppLinkResolver;->getAlList(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    .line 252
    .local v7, "classes":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    const-string v26, "app_name"

    move-object/from16 v0, v26

    invoke-static {v13, v0}, Lbolts/WebViewAppLinkResolver;->getAlList(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 254
    .local v5, "appNames":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I

    move-result v26

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v27

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v28

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v29

    invoke-static/range {v28 .. v29}, Ljava/lang/Math;->max(II)I

    move-result v28

    invoke-static/range {v27 .. v28}, Ljava/lang/Math;->max(II)I

    move-result v27

    invoke-static/range {v26 .. v27}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 256
    .local v10, "maxCount":I
    const/4 v8, 0x0

    .local v8, "i":I
    :goto_0
    if-ge v8, v10, :cond_1

    .line 257
    invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I

    move-result v26

    move/from16 v0, v26

    if-le v0, v8, :cond_2

    move-object/from16 v0, v21

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Ljava/util/Map;

    const-string v27, "value"

    invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v26

    :goto_1
    check-cast v26, Ljava/lang/String;

    move-object/from16 v20, v26

    check-cast v20, Ljava/lang/String;

    .line 259
    .local v20, "urlString":Ljava/lang/String;
    invoke-static/range {v20 .. v20}, Lbolts/WebViewAppLinkResolver;->tryCreateUrl(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v19

    .line 260
    .local v19, "url":Landroid/net/Uri;
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v26

    move/from16 v0, v26

    if-le v0, v8, :cond_3

    invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Ljava/util/Map;

    const-string v27, "value"

    invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v26

    :goto_2
    check-cast v26, Ljava/lang/String;

    move-object/from16 v11, v26

    check-cast v11, Ljava/lang/String;

    .line 262
    .local v11, "packageName":Ljava/lang/String;
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v26

    move/from16 v0, v26

    if-le v0, v8, :cond_4

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Ljava/util/Map;

    const-string v27, "value"

    invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v26

    :goto_3
    check-cast v26, Ljava/lang/String;

    move-object/from16 v6, v26

    check-cast v6, Ljava/lang/String;

    .line 264
    .local v6, "className":Ljava/lang/String;
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v26

    move/from16 v0, v26

    if-le v0, v8, :cond_5

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Ljava/util/Map;

    const-string v27, "value"

    invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v26

    :goto_4
    check-cast v26, Ljava/lang/String;

    move-object/from16 v4, v26

    check-cast v4, Ljava/lang/String;

    .line 266
    .local v4, "appName":Ljava/lang/String;
    new-instance v17, Lbolts/AppLink$Target;

    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-direct {v0, v11, v6, v1, v4}, Lbolts/AppLink$Target;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    .line 267
    .local v17, "target":Lbolts/AppLink$Target;
    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 257
    .end local v4    # "appName":Ljava/lang/String;
    .end local v6    # "className":Ljava/lang/String;
    .end local v11    # "packageName":Ljava/lang/String;
    .end local v17    # "target":Lbolts/AppLink$Target;
    .end local v19    # "url":Landroid/net/Uri;
    .end local v20    # "urlString":Ljava/lang/String;
    :cond_2
    const/16 v26, 0x0

    goto :goto_1

    .line 260
    .restart local v19    # "url":Landroid/net/Uri;
    .restart local v20    # "urlString":Ljava/lang/String;
    :cond_3
    const/16 v26, 0x0

    goto :goto_2

    .line 262
    .restart local v11    # "packageName":Ljava/lang/String;
    :cond_4
    const/16 v26, 0x0

    goto :goto_3

    .line 264
    .restart local v6    # "className":Ljava/lang/String;
    :cond_5
    const/16 v26, 0x0

    goto :goto_4

    .line 271
    .end local v5    # "appNames":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    .end local v6    # "className":Ljava/lang/String;
    .end local v7    # "classes":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    .end local v8    # "i":I
    .end local v10    # "maxCount":I
    .end local v11    # "packageName":Ljava/lang/String;
    .end local v12    # "packages":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    .end local v13    # "platformMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v19    # "url":Landroid/net/Uri;
    .end local v20    # "urlString":Ljava/lang/String;
    .end local v21    # "urls":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    :cond_6
    move-object/from16 v24, p1

    .line 272
    .local v24, "webUrl":Landroid/net/Uri;
    const-string v26, "web"

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Ljava/util/List;

    .line 273
    .local v23, "webMapList":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    if-eqz v23, :cond_8

    invoke-interface/range {v23 .. v23}, Ljava/util/List;->size()I

    move-result v26

    if-lez v26, :cond_8

    .line 274
    const/16 v26, 0x0

    move-object/from16 v0, v23

    move/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Ljava/util/Map;

    .line 275
    .local v22, "webMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v26, "url"

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v21

    check-cast v21, Ljava/util/List;

    .line 276
    .restart local v21    # "urls":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    const-string v26, "should_fallback"

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/List;

    .line 278
    .local v16, "shouldFallbacks":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    if-eqz v16, :cond_7

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v26

    if-lez v26, :cond_7

    .line 279
    const/16 v26, 0x0

    move-object/from16 v0, v16

    move/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Ljava/util/Map;

    const-string v27, "value"

    invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 280
    .local v15, "shouldFallbackString":Ljava/lang/String;
    const/16 v26, 0x3

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v26, v0

    const/16 v27, 0x0

    const-string v28, "no"

    aput-object v28, v26, v27

    const/16 v27, 0x1

    const-string v28, "false"

    aput-object v28, v26, v27

    const/16 v27, 0x2

    const-string v28, "0"

    aput-object v28, v26, v27

    invoke-static/range {v26 .. v26}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v26

    invoke-virtual {v15}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v27

    invoke-interface/range {v26 .. v27}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_7

    .line 281
    const/16 v24, 0x0

    .line 284
    .end local v15    # "shouldFallbackString":Ljava/lang/String;
    :cond_7
    if-eqz v24, :cond_8

    if-eqz v21, :cond_8

    invoke-interface/range {v21 .. v21}, Ljava/util/List;->size()I

    move-result v26

    if-lez v26, :cond_8

    .line 285
    const/16 v26, 0x0

    move-object/from16 v0, v21

    move/from16 v1, v26

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Ljava/util/Map;

    const-string v27, "value"

    invoke-interface/range {v26 .. v27}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Ljava/lang/String;

    .line 286
    .local v25, "webUrlString":Ljava/lang/String;
    invoke-static/range {v25 .. v25}, Lbolts/WebViewAppLinkResolver;->tryCreateUrl(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v24

    .line 289
    .end local v16    # "shouldFallbacks":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    .end local v21    # "urls":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    .end local v22    # "webMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v25    # "webUrlString":Ljava/lang/String;
    :cond_8
    new-instance v26, Lbolts/AppLink;

    move-object/from16 v0, v26

    move-object/from16 v1, p1

    move-object/from16 v2, v18

    move-object/from16 v3, v24

    invoke-direct {v0, v1, v2, v3}, Lbolts/AppLink;-><init>(Landroid/net/Uri;Ljava/util/List;Landroid/net/Uri;)V

    return-object v26
.end method

.method private static parseAlData(Lorg/json/JSONArray;)Ljava/util/Map;
    .locals 12
    .param p0, "dataArray"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v10, 0x0

    .line 194
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 195
    .local v0, "al":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-ge v3, v9, :cond_8

    .line 196
    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 197
    .local v8, "tag":Lorg/json/JSONObject;
    const-string v9, "property"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 198
    .local v5, "name":Ljava/lang/String;
    const-string v9, ":"

    invoke-virtual {v5, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 199
    .local v6, "nameComponents":[Ljava/lang/String;
    const/4 v9, 0x0

    aget-object v9, v6, v9

    const-string v11, "al"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1

    .line 195
    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 202
    :cond_1
    move-object v7, v0

    .line 203
    .local v7, "root":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    const/4 v4, 0x1

    .local v4, "j":I
    :goto_2
    array-length v9, v6

    if-ge v4, v9, :cond_6

    .line 205
    aget-object v9, v6, v4

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 207
    .local v2, "children":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    if-nez v2, :cond_2

    .line 208
    new-instance v2, Ljava/util/ArrayList;

    .end local v2    # "children":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .restart local v2    # "children":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    aget-object v9, v6, v4

    invoke-interface {v7, v9, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    if-lez v9, :cond_5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    move-object v1, v9

    .line 212
    .local v1, "child":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    :goto_3
    if-eqz v1, :cond_3

    array-length v9, v6

    add-int/lit8 v9, v9, -0x1

    if-ne v4, v9, :cond_4

    .line 213
    :cond_3
    new-instance v1, Ljava/util/HashMap;

    .end local v1    # "child":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 214
    .restart local v1    # "child":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    :cond_4
    move-object v7, v1

    .line 203
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .end local v1    # "child":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    :cond_5
    move-object v1, v10

    .line 211
    goto :goto_3

    .line 218
    .end local v2    # "children":Ljava/util/List;, "Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    :cond_6
    const-string v9, "content"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 219
    const-string v9, "content"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 220
    const-string v9, "value"

    invoke-interface {v7, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 222
    :cond_7
    const-string v9, "value"

    const-string v11, "content"

    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v7, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 226
    .end local v4    # "j":I
    .end local v5    # "name":Ljava/lang/String;
    .end local v6    # "nameComponents":[Ljava/lang/String;
    .end local v7    # "root":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v8    # "tag":Lorg/json/JSONObject;
    :cond_8
    return-object v0
.end method

.method private static readFromConnection(Ljava/net/URLConnection;)Ljava/lang/String;
    .locals 15
    .param p0, "connection"    # Ljava/net/URLConnection;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 305
    instance-of v13, p0, Ljava/net/HttpURLConnection;

    if-eqz v13, :cond_0

    move-object v4, p0

    .line 306
    check-cast v4, Ljava/net/HttpURLConnection;

    .line 308
    .local v4, "httpConnection":Ljava/net/HttpURLConnection;
    :try_start_0
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v12

    .line 316
    .end local v4    # "httpConnection":Ljava/net/HttpURLConnection;
    .local v12, "stream":Ljava/io/InputStream;
    :goto_0
    :try_start_1
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 317
    .local v8, "output":Ljava/io/ByteArrayOutputStream;
    const/16 v13, 0x400

    new-array v1, v13, [B

    .line 318
    .local v1, "buffer":[B
    const/4 v11, 0x0

    .line 319
    .local v11, "read":I
    :goto_1
    invoke-virtual {v12, v1}, Ljava/io/InputStream;->read([B)I

    move-result v11

    const/4 v13, -0x1

    if-eq v11, v13, :cond_1

    .line 320
    const/4 v13, 0x0

    invoke-virtual {v8, v1, v13, v11}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 339
    .end local v1    # "buffer":[B
    .end local v8    # "output":Ljava/io/ByteArrayOutputStream;
    .end local v11    # "read":I
    :catchall_0
    move-exception v13

    invoke-virtual {v12}, Ljava/io/InputStream;->close()V

    throw v13

    .line 309
    .end local v12    # "stream":Ljava/io/InputStream;
    .restart local v4    # "httpConnection":Ljava/net/HttpURLConnection;
    :catch_0
    move-exception v3

    .line 310
    .local v3, "e":Ljava/lang/Exception;
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v12

    .restart local v12    # "stream":Ljava/io/InputStream;
    goto :goto_0

    .line 313
    .end local v3    # "e":Ljava/lang/Exception;
    .end local v4    # "httpConnection":Ljava/net/HttpURLConnection;
    .end local v12    # "stream":Ljava/io/InputStream;
    :cond_0
    invoke-virtual {p0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v12

    .restart local v12    # "stream":Ljava/io/InputStream;
    goto :goto_0

    .line 322
    .restart local v1    # "buffer":[B
    .restart local v8    # "output":Ljava/io/ByteArrayOutputStream;
    .restart local v11    # "read":I
    :cond_1
    :try_start_2
    invoke-virtual {p0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v2

    .line 323
    .local v2, "charset":Ljava/lang/String;
    if-nez v2, :cond_3

    .line 324
    invoke-virtual {p0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    move-result-object v7

    .line 325
    .local v7, "mimeType":Ljava/lang/String;
    const-string v13, ";"

    invoke-virtual {v7, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 326
    .local v10, "parts":[Ljava/lang/String;
    move-object v0, v10

    .local v0, "arr$":[Ljava/lang/String;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v5, 0x0

    .local v5, "i$":I
    :goto_2
    if-ge v5, v6, :cond_2

    aget-object v9, v0, v5

    .line 327
    .local v9, "part":Ljava/lang/String;
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    .line 328
    const-string v13, "charset="

    invoke-virtual {v9, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_4

    .line 329
    const-string v13, "charset="

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    invoke-virtual {v9, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 333
    .end local v9    # "part":Ljava/lang/String;
    :cond_2
    if-nez v2, :cond_3

    .line 334
    const-string v2, "UTF-8"

    .line 337
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v5    # "i$":I
    .end local v6    # "len$":I
    .end local v7    # "mimeType":Ljava/lang/String;
    .end local v10    # "parts":[Ljava/lang/String;
    :cond_3
    new-instance v13, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v14

    invoke-direct {v13, v14, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 339
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V

    return-object v13

    .line 326
    .restart local v0    # "arr$":[Ljava/lang/String;
    .restart local v5    # "i$":I
    .restart local v6    # "len$":I
    .restart local v7    # "mimeType":Ljava/lang/String;
    .restart local v9    # "part":Ljava/lang/String;
    .restart local v10    # "parts":[Ljava/lang/String;
    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2
.end method

.method private static tryCreateUrl(Ljava/lang/String;)Landroid/net/Uri;
    .locals 1
    .param p0, "urlString"    # Ljava/lang/String;

    .prologue
    .line 293
    if-nez p0, :cond_0

    .line 294
    const/4 v0, 0x0

    .line 296
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public getAppLinkFromUrlInBackground(Landroid/net/Uri;)Lbolts/Task;
    .locals 5
    .param p1, "url"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lbolts/Task",
            "<",
            "Lbolts/AppLink;",
            ">;"
        }
    .end annotation

    .prologue
    .line 83
    new-instance v0, Lbolts/Capture;

    invoke-direct {v0}, Lbolts/Capture;-><init>()V

    .line 84
    .local v0, "content":Lbolts/Capture;, "Lbolts/Capture<Ljava/lang/String;>;"
    new-instance v1, Lbolts/Capture;

    invoke-direct {v1}, Lbolts/Capture;-><init>()V

    .line 85
    .local v1, "contentType":Lbolts/Capture;, "Lbolts/Capture<Ljava/lang/String;>;"
    new-instance v2, Lbolts/WebViewAppLinkResolver$3;

    invoke-direct {v2, p0, p1, v0, v1}, Lbolts/WebViewAppLinkResolver$3;-><init>(Lbolts/WebViewAppLinkResolver;Landroid/net/Uri;Lbolts/Capture;Lbolts/Capture;)V

    invoke-static {v2}, Lbolts/Task;->callInBackground(Ljava/util/concurrent/Callable;)Lbolts/Task;

    move-result-object v2

    new-instance v3, Lbolts/WebViewAppLinkResolver$2;

    invoke-direct {v3, p0, v1, p1, v0}, Lbolts/WebViewAppLinkResolver$2;-><init>(Lbolts/WebViewAppLinkResolver;Lbolts/Capture;Landroid/net/Uri;Lbolts/Capture;)V

    sget-object v4, Lbolts/Task;->UI_THREAD_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-virtual {v2, v3, v4}, Lbolts/Task;->onSuccessTask(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;

    move-result-object v2

    new-instance v3, Lbolts/WebViewAppLinkResolver$1;

    invoke-direct {v3, p0, p1}, Lbolts/WebViewAppLinkResolver$1;-><init>(Lbolts/WebViewAppLinkResolver;Landroid/net/Uri;)V

    invoke-virtual {v2, v3}, Lbolts/Task;->onSuccess(Lbolts/Continuation;)Lbolts/Task;

    move-result-object v2

    return-object v2
.end method
