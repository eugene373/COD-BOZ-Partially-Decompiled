package com.facebook

// Auto-emitted from smali source: Request.java.
// 52 fields, 105 methods.

open class Request {
    private var batchEntryDependsOn: String
    private var batchEntryName: String
    private var batchEntryOmitResultOnSuccess: Boolean
    private var callback: com.facebook.Request.Callback
    private var graphObject: com.facebook.model.GraphObject
    private var graphPath: String
    private var httpMethod: com.facebook.HttpMethod
    private var overriddenURL: String
    private var parameters: android.os.Bundle
    private var session: com.facebook.Session
    private var skipClientToken: Boolean
    private var tag: Object
    private var version: String

    public constructor()

    public constructor(p0: com.facebook.Session, p1: String)

    public constructor(p0: com.facebook.Session, p1: String, p2: android.os.Bundle, p3: com.facebook.HttpMethod)

    public constructor(p0: com.facebook.Session, p1: String, p2: android.os.Bundle, p3: com.facebook.HttpMethod, p4: com.facebook.Request.Callback)

    public constructor(p0: com.facebook.Session, p1: String, p2: android.os.Bundle, p3: com.facebook.HttpMethod, p4: com.facebook.Request.Callback, p5: String)

    constructor(p0: com.facebook.Session, p1: java.net.URL)

    private fun addCommonParameters() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/Request;->session:Lcom/facebook/Session;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/Request;->session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Session provided to a Request in un-opened state."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         const-string v1, "access_token"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/Request;->session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Logger;->registerAccessToken(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         const-string v2, "access_token"
    //         invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_1
    //         :goto_0
    //         iget-object v0, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         const-string v1, "sdk"
    //         const-string v2, "android"
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         const-string v1, "format"
    //         const-string v2, "json"
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    //         :cond_2
    //         iget-boolean v0, p0, Lcom/facebook/Request;->skipClientToken:Z
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         const-string v1, "access_token"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         invoke-static {}, Lcom/facebook/Settings;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {}, Lcom/facebook/Settings;->getClientToken()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_3
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_3
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, "|"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         const-string v2, "access_token"
    //         invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_3
    //         sget-object v0, Lcom/facebook/Request;->TAG:Ljava/lang/String;
    //         const-string v1, "Warning: Sessionless Request needs token but missing either application ID or client token."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    private fun appendParametersToBaseUrl(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 5
    //         new-instance v0, Landroid/net/Uri$Builder;
    //         invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V
    //         invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v2
    //         iget-object v0, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v1, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         invoke-virtual {v1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         if-nez v1, :cond_1
    //         const-string v1, ""
    //         :cond_1
    //         invoke-static {v1}, Lcom/facebook/Request;->isSupportedParameterType(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         invoke-static {v1}, Lcom/facebook/Request;->parameterToString(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v2, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/Request;->httpMethod:Lcom/facebook/HttpMethod;
    //         sget-object v4, Lcom/facebook/HttpMethod;->GET:Lcom/facebook/HttpMethod;
    //         if-ne v0, v4, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v2, "Unsupported parameter type for GET request: %s"
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
    //         move-result-object v1
    //         aput-object v1, v3, v4
    //         invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_3
    //         invoke-virtual {v2}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private fun getGraphPathWithVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/facebook/Request;->versionPattern:Ljava/util/regex/Pattern;
    //         iget-object v1, p0, Lcom/facebook/Request;->graphPath:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Request;->graphPath:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "%s/%s"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/facebook/Request;->version:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/facebook/Request;->graphPath:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    private fun serializeToBatch(p0: org.json.JSONArray, p1: java.util.Map) { /* TODO(body): (Lorg/json/JSONArray;Ljava/util/Map;)V */ }
    /*
    //         .locals 9
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lorg/json/JSONArray;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/facebook/Request$Attachment;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    //         iget-object v0, p0, Lcom/facebook/Request;->batchEntryName:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         const-string v0, "name"
    //         iget-object v2, p0, Lcom/facebook/Request;->batchEntryName:Ljava/lang/String;
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "omit_response_on_success"
    //         iget-boolean v2, p0, Lcom/facebook/Request;->batchEntryOmitResultOnSuccess:Z
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Request;->batchEntryDependsOn:Ljava/lang/String;
    //         if-eqz v0, :cond_1
    //         const-string v0, "depends_on"
    //         iget-object v2, p0, Lcom/facebook/Request;->batchEntryDependsOn:Ljava/lang/String;
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/facebook/Request;->getUrlForBatchedRequest()Ljava/lang/String;
    //         move-result-object v2
    //         const-string v0, "relative_url"
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "method"
    //         iget-object v3, p0, Lcom/facebook/Request;->httpMethod:Lcom/facebook/HttpMethod;
    //         invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         iget-object v0, p0, Lcom/facebook/Request;->session:Lcom/facebook/Session;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/Request;->session:Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getAccessToken()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Logger;->registerAccessToken(Ljava/lang/String;)V
    //         :cond_2
    //         new-instance v3, Ljava/util/ArrayList;
    //         invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v0, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :cond_3
    //         :goto_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v5, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         invoke-virtual {v5, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/Request;->isSupportedAttachmentType(Ljava/lang/Object;)Z
    //         move-result v5
    //         if-eqz v5, :cond_3
    //         const-string v5, "%s%d"
    //         const/4 v6, 0x2
    //         new-array v6, v6, [Ljava/lang/Object;
    //         const/4 v7, 0x0
    //         const-string v8, "file"
    //         aput-object v8, v6, v7
    //         const/4 v7, 0x1
    //         invoke-interface {p2}, Ljava/util/Map;->size()I
    //         move-result v8
    //         invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v8
    //         aput-object v8, v6, v7
    //         invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         new-instance v6, Lcom/facebook/Request$Attachment;
    //         invoke-direct {v6, p0, v0}, Lcom/facebook/Request$Attachment;-><init>(Lcom/facebook/Request;Ljava/lang/Object;)V
    //         invoke-interface {p2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_4
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_5
    //         const-string v0, ","
    //         invoke-static {v0, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v3, "attached_files"
    //         invoke-virtual {v1, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_5
    //         iget-object v0, p0, Lcom/facebook/Request;->graphObject:Lcom/facebook/model/GraphObject;
    //         if-eqz v0, :cond_6
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v3, p0, Lcom/facebook/Request;->graphObject:Lcom/facebook/model/GraphObject;
    //         new-instance v4, Lcom/facebook/Request$5;
    //         invoke-direct {v4, p0, v0}, Lcom/facebook/Request$5;-><init>(Lcom/facebook/Request;Ljava/util/ArrayList;)V
    //         invoke-static {v3, v2, v4}, Lcom/facebook/Request;->processGraphObject(Lcom/facebook/model/GraphObject;Ljava/lang/String;Lcom/facebook/Request$KeyValueSerializer;)V
    //         const-string v2, "&"
    //         invoke-static {v2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v2, "body"
    //         invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_6
    //         invoke-virtual {p1, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         return-void
    */

    public fun executeAndWait(): com.facebook.Response { return TODO("body: ()Lcom/facebook/Response;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/facebook/Request;->executeAndWait(Lcom/facebook/Request;)Lcom/facebook/Response;
    //         move-result-object v0
    //         return-object v0
    */

    public fun executeAsync(): com.facebook.RequestAsyncTask { return TODO("body: ()Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         new-array v0, v0, [Lcom/facebook/Request;
    //         const/4 v1, 0x0
    //         aput-object p0, v0, v1
    //         invoke-static {v0}, Lcom/facebook/Request;->executeBatchAsync([Lcom/facebook/Request;)Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getBatchEntryDependsOn(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Request;->batchEntryDependsOn:Ljava/lang/String;
    //         return-object v0
    */

    public fun getBatchEntryName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Request;->batchEntryName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getBatchEntryOmitResultOnSuccess(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/Request;->batchEntryOmitResultOnSuccess:Z
    //         return v0
    */

    public fun getCallback(): com.facebook.Request.Callback { return TODO("body: ()Lcom/facebook/Request$Callback;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Request;->callback:Lcom/facebook/Request$Callback;
    //         return-object v0
    */

    public fun getGraphObject(): com.facebook.model.GraphObject { return TODO("body: ()Lcom/facebook/model/GraphObject;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Request;->graphObject:Lcom/facebook/model/GraphObject;
    //         return-object v0
    */

    public fun getGraphPath(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Request;->graphPath:Ljava/lang/String;
    //         return-object v0
    */

    public fun getHttpMethod(): com.facebook.HttpMethod { return TODO("body: ()Lcom/facebook/HttpMethod;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Request;->httpMethod:Lcom/facebook/HttpMethod;
    //         return-object v0
    */

    public fun getParameters(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getSession(): com.facebook.Session { return TODO("body: ()Lcom/facebook/Session;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Request;->session:Lcom/facebook/Session;
    //         return-object v0
    */

    public fun getTag(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Request;->tag:Ljava/lang/Object;
    //         return-object v0
    */

    fun getUrlForBatchedRequest(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/Request;->overriddenURL:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Can\'t override URL for a batch request"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/facebook/Request;->getGraphPathWithVersion()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {p0}, Lcom/facebook/Request;->addCommonParameters()V
    //         invoke-direct {p0, v0}, Lcom/facebook/Request;->appendParametersToBaseUrl(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    fun getUrlForSingleRequest(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/facebook/Request;->overriddenURL:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Request;->overriddenURL:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/Request;->getHttpMethod()Lcom/facebook/HttpMethod;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         if-ne v0, v1, :cond_1
    //         iget-object v0, p0, Lcom/facebook/Request;->graphPath:Ljava/lang/String;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/Request;->graphPath:Ljava/lang/String;
    //         const-string v1, "/videos"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-static {}, Lcom/facebook/internal/ServerProtocol;->getGraphVideoUrlBase()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_1
    //         const-string v1, "%s/%s"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         aput-object v0, v2, v3
    //         const/4 v0, 0x1
    //         invoke-direct {p0}, Lcom/facebook/Request;->getGraphPathWithVersion()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v2, v0
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {p0}, Lcom/facebook/Request;->addCommonParameters()V
    //         invoke-direct {p0, v0}, Lcom/facebook/Request;->appendParametersToBaseUrl(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         invoke-static {}, Lcom/facebook/internal/ServerProtocol;->getGraphUrlBase()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    */

    public fun getVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Request;->version:Ljava/lang/String;
    //         return-object v0
    */

    public fun setBatchEntryDependsOn(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Request;->batchEntryDependsOn:Ljava/lang/String;
    //         return-void
    */

    public fun setBatchEntryName(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Request;->batchEntryName:Ljava/lang/String;
    //         return-void
    */

    public fun setBatchEntryOmitResultOnSuccess(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/Request;->batchEntryOmitResultOnSuccess:Z
    //         return-void
    */

    public fun setCallback(p0: com.facebook.Request.Callback) { /* TODO(body): (Lcom/facebook/Request$Callback;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Request;->callback:Lcom/facebook/Request$Callback;
    //         return-void
    */

    public fun setGraphObject(p0: com.facebook.model.GraphObject) { /* TODO(body): (Lcom/facebook/model/GraphObject;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Request;->graphObject:Lcom/facebook/model/GraphObject;
    //         return-void
    */

    public fun setGraphPath(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Request;->graphPath:Ljava/lang/String;
    //         return-void
    */

    public fun setHttpMethod(p0: com.facebook.HttpMethod) { /* TODO(body): (Lcom/facebook/HttpMethod;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/Request;->overriddenURL:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/facebook/HttpMethod;->GET:Lcom/facebook/HttpMethod;
    //         if-eq p1, v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Can\'t change HTTP method on request with overridden URL."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         if-eqz p1, :cond_1
    //         :goto_0
    //         iput-object p1, p0, Lcom/facebook/Request;->httpMethod:Lcom/facebook/HttpMethod;
    //         return-void
    //         :cond_1
    //         sget-object p1, Lcom/facebook/HttpMethod;->GET:Lcom/facebook/HttpMethod;
    //         goto :goto_0
    */

    public fun setParameters(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         return-void
    */

    public fun setSession(p0: com.facebook.Session) { /* TODO(body): (Lcom/facebook/Session;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Request;->session:Lcom/facebook/Session;
    //         return-void
    */

    public fun setSkipClientToken(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/facebook/Request;->skipClientToken:Z
    //         return-void
    */

    public fun setTag(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Request;->tag:Ljava/lang/Object;
    //         return-void
    */

    public fun setVersion(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/Request;->version:Ljava/lang/String;
    //         return-void
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "{Request: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " session: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/Request;->session:Lcom/facebook/Session;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", graphPath: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/Request;->graphPath:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", graphObject: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/Request;->graphObject:Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", httpMethod: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/Request;->httpMethod:Lcom/facebook/HttpMethod;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", parameters: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val ACCEPT_LANGUAGE_HEADER: String = "Accept-Language"
    private val ACCESS_TOKEN_PARAM: String = "access_token"
    private val ATTACHED_FILES_PARAM: String = "attached_files"
    private val ATTACHMENT_FILENAME_PREFIX: String = "file"
    private val BATCH_APP_ID_PARAM: String = "batch_app_id"
    private val BATCH_BODY_PARAM: String = "body"
    private val BATCH_ENTRY_DEPENDS_ON_PARAM: String = "depends_on"
    private val BATCH_ENTRY_NAME_PARAM: String = "name"
    private val BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM: String = "omit_response_on_success"
    private val BATCH_METHOD_PARAM: String = "method"
    private val BATCH_PARAM: String = "batch"
    private val BATCH_RELATIVE_URL_PARAM: String = "relative_url"
    private val CONTENT_TYPE_HEADER: String = "Content-Type"
    private val FORMAT_JSON: String = "json"
    private val FORMAT_PARAM: String = "format"
    private val ISO_8601_FORMAT_STRING: String = "yyyy-MM-dd\'T\'HH:mm:ssZ"
    @JvmField public val MAXIMUM_BATCH_SIZE: Int = 0x32
    private val ME: String = "me"
    private val MIME_BOUNDARY: String = "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
    private val MY_ACTION_FORMAT: String = "me/%s"
    private val MY_FEED: String = "me/feed"
    private val MY_FRIENDS: String = "me/friends"
    private val MY_OBJECTS_FORMAT: String = "me/objects/%s"
    private val MY_PHOTOS: String = "me/photos"
    private val MY_STAGING_RESOURCES: String = "me/staging_resources"
    private val MY_VIDEOS: String = "me/videos"
    private val OBJECT_PARAM: String = "object"
    private val PICTURE_PARAM: String = "picture"
    private val SDK_ANDROID: String = "android"
    private val SDK_PARAM: String = "sdk"
    private val SEARCH: String = "search"
    private val STAGING_PARAM: String = "file"
    @JvmField public val TAG: String = null!!
    private val USER_AGENT_BASE: String = "FBAndroidSDK"
    private val USER_AGENT_HEADER: String = "User-Agent"
    private val VIDEOS_SUFFIX: String = "/videos"
    private var defaultBatchApplicationId: String
    private var userAgent: String
    private var versionPattern: java.util.regex.Pattern

    @JvmStatic fun createConnection(p0: java.net.URL): java.net.HttpURLConnection { return TODO("body: (Ljava/net/URL;)Ljava/net/HttpURLConnection;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    //         move-result-object v0
    //         check-cast v0, Ljava/net/HttpURLConnection;
    //         const-string v1, "User-Agent"
    //         invoke-static {}, Lcom/facebook/Request;->getUserAgent()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "Content-Type"
    //         invoke-static {}, Lcom/facebook/Request;->getMimeContentType()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "Accept-Language"
    //         invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/util/Locale;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V
    //         return-object v0
    */

    public @JvmStatic fun executeAndWait(p0: com.facebook.Request): com.facebook.Response { return TODO("body: (Lcom/facebook/Request;)Lcom/facebook/Response;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         const/4 v2, 0x0
    //         new-array v0, v3, [Lcom/facebook/Request;
    //         aput-object p0, v0, v2
    //         invoke-static {v0}, Lcom/facebook/Request;->executeBatchAndWait([Lcom/facebook/Request;)Ljava/util/List;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v1
    //         if-eq v1, v3, :cond_1
    //         :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "invalid state: expected a single response"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Response;
    //         return-object v0
    */

    public @JvmStatic fun executeBatchAndWait(p0: com.facebook.RequestBatch): java.util.List { return TODO("body: (Lcom/facebook/RequestBatch;)Ljava/util/List;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/RequestBatch;",
    //                 ")",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const-string v0, "requests"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notEmptyAndContainsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V
    //         :try_start_0
    //         invoke-static {p0}, Lcom/facebook/Request;->toHttpConnection(Lcom/facebook/RequestBatch;)Ljava/net/HttpURLConnection;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         invoke-static {v0, p0}, Lcom/facebook/Request;->executeConnectionAndWait(Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;)Ljava/util/List;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->getRequests()Ljava/util/List;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         new-instance v3, Lcom/facebook/FacebookException;
    //         invoke-direct {v3, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V
    //         invoke-static {v1, v2, v3}, Lcom/facebook/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/facebook/Request;->runCallbacks(Lcom/facebook/RequestBatch;Ljava/util/List;)V
    //         goto :goto_0
    */

    public @JvmStatic fun executeBatchAndWait(p0: java.util.Collection): java.util.List { return TODO("body: (Ljava/util/Collection;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/facebook/Request;",
    //                 ">;)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/RequestBatch;
    //         invoke-direct {v0, p0}, Lcom/facebook/RequestBatch;-><init>(Ljava/util/Collection;)V
    //         invoke-static {v0}, Lcom/facebook/Request;->executeBatchAndWait(Lcom/facebook/RequestBatch;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executeBatchAndWait(p0: Array<com.facebook.Request>): java.util.List { return TODO("body: ([Lcom/facebook/Request;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "([",
    //                 "Lcom/facebook/Request;",
    //                 ")",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const-string v0, "requests"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/Request;->executeBatchAndWait(Ljava/util/Collection;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executeBatchAsync(p0: com.facebook.RequestBatch): com.facebook.RequestAsyncTask { return TODO("body: (Lcom/facebook/RequestBatch;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         const-string v0, "requests"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notEmptyAndContainsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/RequestAsyncTask;
    //         invoke-direct {v0, p0}, Lcom/facebook/RequestAsyncTask;-><init>(Lcom/facebook/RequestBatch;)V
    //         invoke-virtual {v0}, Lcom/facebook/RequestAsyncTask;->executeOnSettingsExecutor()Lcom/facebook/RequestAsyncTask;
    //         return-object v0
    */

    public @JvmStatic fun executeBatchAsync(p0: java.util.Collection): com.facebook.RequestAsyncTask { return TODO("body: (Ljava/util/Collection;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/facebook/Request;",
    //                 ">;)",
    //                 "Lcom/facebook/RequestAsyncTask;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/RequestBatch;
    //         invoke-direct {v0, p0}, Lcom/facebook/RequestBatch;-><init>(Ljava/util/Collection;)V
    //         invoke-static {v0}, Lcom/facebook/Request;->executeBatchAsync(Lcom/facebook/RequestBatch;)Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executeBatchAsync(p0: Array<com.facebook.Request>): com.facebook.RequestAsyncTask { return TODO("body: ([Lcom/facebook/Request;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         const-string v0, "requests"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/Request;->executeBatchAsync(Ljava/util/Collection;)Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executeConnectionAndWait(p0: java.net.HttpURLConnection, p1: com.facebook.RequestBatch): java.util.List { return TODO("body: (Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;)Ljava/util/List;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/net/HttpURLConnection;",
    //                 "Lcom/facebook/RequestBatch;",
    //                 ")",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/facebook/Response;->fromHttpConnection(Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->disconnectQuietly(Ljava/net/URLConnection;)V
    //         invoke-virtual {p1}, Lcom/facebook/RequestBatch;->size()I
    //         move-result v0
    //         invoke-interface {v1}, Ljava/util/List;->size()I
    //         move-result v2
    //         if-eq v0, v2, :cond_0
    //         new-instance v2, Lcom/facebook/FacebookException;
    //         const-string v3, "Received %d responses while expecting %d"
    //         const/4 v4, 0x2
    //         new-array v4, v4, [Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         invoke-interface {v1}, Ljava/util/List;->size()I
    //         move-result v1
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         aput-object v1, v4, v5
    //         const/4 v1, 0x1
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         aput-object v0, v4, v1
    //         invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v2
    //         :cond_0
    //         invoke-static {p1, v1}, Lcom/facebook/Request;->runCallbacks(Lcom/facebook/RequestBatch;Ljava/util/List;)V
    //         new-instance v2, Ljava/util/HashSet;
    //         invoke-direct {v2}, Ljava/util/HashSet;-><init>()V
    //         invoke-virtual {p1}, Lcom/facebook/RequestBatch;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_1
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Request;
    //         iget-object v4, v0, Lcom/facebook/Request;->session:Lcom/facebook/Session;
    //         if-eqz v4, :cond_1
    //         iget-object v0, v0, Lcom/facebook/Request;->session:Lcom/facebook/Session;
    //         invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Session;
    //         invoke-virtual {v0}, Lcom/facebook/Session;->extendAccessTokenIfNeeded()V
    //         goto :goto_1
    //         :cond_3
    //         return-object v1
    */

    public @JvmStatic fun executeConnectionAndWait(p0: java.net.HttpURLConnection, p1: java.util.Collection): java.util.List { return TODO("body: (Ljava/net/HttpURLConnection;Ljava/util/Collection;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/net/HttpURLConnection;",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/facebook/Request;",
    //                 ">;)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/RequestBatch;
    //         invoke-direct {v0, p1}, Lcom/facebook/RequestBatch;-><init>(Ljava/util/Collection;)V
    //         invoke-static {p0, v0}, Lcom/facebook/Request;->executeConnectionAndWait(Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executeConnectionAsync(p0: android.os.Handler, p1: java.net.HttpURLConnection, p2: com.facebook.RequestBatch): com.facebook.RequestAsyncTask { return TODO("body: (Landroid/os/Handler;Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         const-string v0, "connection"
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/RequestAsyncTask;
    //         invoke-direct {v0, p1, p2}, Lcom/facebook/RequestAsyncTask;-><init>(Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;)V
    //         invoke-virtual {p2, p0}, Lcom/facebook/RequestBatch;->setCallbackHandler(Landroid/os/Handler;)V
    //         invoke-virtual {v0}, Lcom/facebook/RequestAsyncTask;->executeOnSettingsExecutor()Lcom/facebook/RequestAsyncTask;
    //         return-object v0
    */

    public @JvmStatic fun executeConnectionAsync(p0: java.net.HttpURLConnection, p1: com.facebook.RequestBatch): com.facebook.RequestAsyncTask { return TODO("body: (Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {v0, p0, p1}, Lcom/facebook/Request;->executeConnectionAsync(Landroid/os/Handler;Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;)Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executeGraphPathRequestAsync(p0: com.facebook.Session, p1: String, p2: com.facebook.Request.Callback): com.facebook.RequestAsyncTask { return TODO("body: (Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p0, p1, p2}, Lcom/facebook/Request;->newGraphPathRequest(Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executeMeRequestAsync(p0: com.facebook.Session, p1: com.facebook.Request.GraphUserCallback): com.facebook.RequestAsyncTask { return TODO("body: (Lcom/facebook/Session;Lcom/facebook/Request$GraphUserCallback;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/facebook/Request;->newMeRequest(Lcom/facebook/Session;Lcom/facebook/Request$GraphUserCallback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executeMyFriendsRequestAsync(p0: com.facebook.Session, p1: com.facebook.Request.GraphUserListCallback): com.facebook.RequestAsyncTask { return TODO("body: (Lcom/facebook/Session;Lcom/facebook/Request$GraphUserListCallback;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/facebook/Request;->newMyFriendsRequest(Lcom/facebook/Session;Lcom/facebook/Request$GraphUserListCallback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executePlacesSearchRequestAsync(p0: com.facebook.Session, p1: android.location.Location, p2: Int, p3: Int, p4: String, p5: com.facebook.Request.GraphPlaceListCallback): com.facebook.RequestAsyncTask { return TODO("body: (Lcom/facebook/Session;Landroid/location/Location;IILjava/lang/String;Lcom/facebook/Request$GraphPlaceListCallback;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static/range {p0 .. p5}, Lcom/facebook/Request;->newPlacesSearchRequest(Lcom/facebook/Session;Landroid/location/Location;IILjava/lang/String;Lcom/facebook/Request$GraphPlaceListCallback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executePostRequestAsync(p0: com.facebook.Session, p1: String, p2: com.facebook.model.GraphObject, p3: com.facebook.Request.Callback): com.facebook.RequestAsyncTask { return TODO("body: (Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/model/GraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p0, p1, p2, p3}, Lcom/facebook/Request;->newPostRequest(Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/model/GraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executeStatusUpdateRequestAsync(p0: com.facebook.Session, p1: String, p2: com.facebook.Request.Callback): com.facebook.RequestAsyncTask { return TODO("body: (Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p0, p1, p2}, Lcom/facebook/Request;->newStatusUpdateRequest(Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executeUploadPhotoRequestAsync(p0: com.facebook.Session, p1: android.graphics.Bitmap, p2: com.facebook.Request.Callback): com.facebook.RequestAsyncTask { return TODO("body: (Lcom/facebook/Session;Landroid/graphics/Bitmap;Lcom/facebook/Request$Callback;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p0, p1, p2}, Lcom/facebook/Request;->newUploadPhotoRequest(Lcom/facebook/Session;Landroid/graphics/Bitmap;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun executeUploadPhotoRequestAsync(p0: com.facebook.Session, p1: java.io.File, p2: com.facebook.Request.Callback): com.facebook.RequestAsyncTask { return TODO("body: (Lcom/facebook/Session;Ljava/io/File;Lcom/facebook/Request$Callback;)Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;
    //             }
    //         .end annotation
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p0, p1, p2}, Lcom/facebook/Request;->newUploadPhotoRequest(Lcom/facebook/Session;Ljava/io/File;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAsync()Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun getBatchAppId(p0: com.facebook.RequestBatch): String { return TODO("body: (Lcom/facebook/RequestBatch;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->getBatchApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->getBatchApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Request;
    //         iget-object v0, v0, Lcom/facebook/Request;->session:Lcom/facebook/Session;
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Lcom/facebook/Session;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         sget-object v0, Lcom/facebook/Request;->defaultBatchApplicationId:Ljava/lang/String;
    //         goto :goto_0
    */

    public @JvmStatic fun getDefaultBatchApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/Request;->defaultBatchApplicationId:Ljava/lang/String;
    //         return-object v0
    */

    private @JvmStatic fun getMimeContentType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "multipart/form-data; boundary=%s"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         const-string v3, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun getUserAgent(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/facebook/Request;->userAgent:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const-string v0, "%s.%s"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         const-string v3, "FBAndroidSDK"
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         const-string v3, "3.22.0"
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         sput-object v0, Lcom/facebook/Request;->userAgent:Ljava/lang/String;
    //         :cond_0
    //         sget-object v0, Lcom/facebook/Request;->userAgent:Ljava/lang/String;
    //         return-object v0
    */

    private @JvmStatic fun hasOnProgressCallbacks(p0: com.facebook.RequestBatch): Boolean { return TODO("body: (Lcom/facebook/RequestBatch;)Z") }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->getCallbacks()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/RequestBatch$Callback;
    //         instance-of v0, v0, Lcom/facebook/RequestBatch$OnProgressCallback;
    //         if-eqz v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Request;
    //         invoke-virtual {v0}, Lcom/facebook/Request;->getCallback()Lcom/facebook/Request$Callback;
    //         move-result-object v0
    //         instance-of v0, v0, Lcom/facebook/Request$OnProgressCallback;
    //         if-eqz v0, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private @JvmStatic fun isMeRequest(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         sget-object v1, Lcom/facebook/Request;->versionPattern:Ljava/util/regex/Pattern;
    //         invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
    //         move-result-object p0
    //         :cond_0
    //         const-string v1, "me/"
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         const-string v1, "/me/"
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         :cond_1
    //         :goto_0
    //         return v0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private @JvmStatic fun isSupportedAttachmentType(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         instance-of v0, p0, Landroid/graphics/Bitmap;
    //         if-nez v0, :cond_0
    //         instance-of v0, p0, [B
    //         if-nez v0, :cond_0
    //         instance-of v0, p0, Landroid/os/ParcelFileDescriptor;
    //         if-nez v0, :cond_0
    //         instance-of v0, p0, Lcom/facebook/Request$ParcelFileDescriptorWithMimeType;
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private @JvmStatic fun isSupportedParameterType(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         instance-of v0, p0, Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         instance-of v0, p0, Ljava/lang/Boolean;
    //         if-nez v0, :cond_0
    //         instance-of v0, p0, Ljava/lang/Number;
    //         if-nez v0, :cond_0
    //         instance-of v0, p0, Ljava/util/Date;
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun newCustomAudienceThirdPartyIdRequest(p0: com.facebook.Session, p1: android.content.Context, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Landroid/content/Context;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, p1, v0, p2}, Lcom/facebook/Request;->newCustomAudienceThirdPartyIdRequest(Lcom/facebook/Session;Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newCustomAudienceThirdPartyIdRequest(p0: com.facebook.Session, p1: android.content.Context, p2: String, p3: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         if-nez p0, :cond_8
    //         invoke-static {}, Lcom/facebook/Session;->getActiveSession()Lcom/facebook/Session;
    //         move-result-object v1
    //         :goto_0
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Lcom/facebook/Session;->isOpened()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v1, 0x0
    //         :cond_0
    //         if-nez p2, :cond_1
    //         if-eqz v1, :cond_2
    //         invoke-virtual {v1}, Lcom/facebook/Session;->getApplicationId()Ljava/lang/String;
    //         move-result-object p2
    //         :cond_1
    //         :goto_1
    //         if-nez p2, :cond_3
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Facebook App ID cannot be determined"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         invoke-static {p1}, Lcom/facebook/internal/Utility;->getMetadataApplicationId(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object p2
    //         goto :goto_1
    //         :cond_3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, "/custom_audience_third_party_id"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionIdentifiers(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    //         move-result-object v4
    //         new-instance v3, Landroid/os/Bundle;
    //         invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
    //         if-nez v1, :cond_4
    //         invoke-virtual {v4}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionId()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_7
    //         invoke-virtual {v4}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionId()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_2
    //         invoke-virtual {v4}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionId()Ljava/lang/String;
    //         move-result-object v5
    //         if-eqz v5, :cond_4
    //         const-string v5, "udid"
    //         invoke-virtual {v3, v5, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_4
    //         invoke-static {p1}, Lcom/facebook/Settings;->getLimitEventAndDataUsage(Landroid/content/Context;)Z
    //         move-result v0
    //         if-nez v0, :cond_5
    //         invoke-virtual {v4}, Lcom/facebook/internal/AttributionIdentifiers;->isTrackingLimited()Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         :cond_5
    //         const-string v0, "limit_event_usage"
    //         const-string v4, "1"
    //         invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_6
    //         new-instance v0, Lcom/facebook/Request;
    //         sget-object v4, Lcom/facebook/HttpMethod;->GET:Lcom/facebook/HttpMethod;
    //         move-object v5, p3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    //         :cond_7
    //         invoke-virtual {v4}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidAdvertiserId()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_2
    //         :cond_8
    //         move-object v1, p0
    //         goto :goto_0
    */

    public @JvmStatic fun newDeleteObjectRequest(p0: com.facebook.Session, p1: String, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         new-instance v0, Lcom/facebook/Request;
    //         const/4 v3, 0x0
    //         sget-object v4, Lcom/facebook/HttpMethod;->DELETE:Lcom/facebook/HttpMethod;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newGraphPathRequest(p0: com.facebook.Session, p1: String, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         new-instance v0, Lcom/facebook/Request;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v4, v3
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newMeRequest(p0: com.facebook.Session, p1: com.facebook.Request.GraphUserCallback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Lcom/facebook/Request$GraphUserCallback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         new-instance v5, Lcom/facebook/Request$1;
    //         invoke-direct {v5, p1}, Lcom/facebook/Request$1;-><init>(Lcom/facebook/Request$GraphUserCallback;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, "me"
    //         move-object v1, p0
    //         move-object v4, v3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newMyFriendsRequest(p0: com.facebook.Session, p1: com.facebook.Request.GraphUserListCallback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Lcom/facebook/Request$GraphUserListCallback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         new-instance v5, Lcom/facebook/Request$2;
    //         invoke-direct {v5, p1}, Lcom/facebook/Request$2;-><init>(Lcom/facebook/Request$GraphUserListCallback;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, "me/friends"
    //         move-object v1, p0
    //         move-object v4, v3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newPlacesSearchRequest(p0: com.facebook.Session, p1: android.location.Location, p2: Int, p3: Int, p4: String, p5: com.facebook.Request.GraphPlaceListCallback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Landroid/location/Location;IILjava/lang/String;Lcom/facebook/Request$GraphPlaceListCallback;)Lcom/facebook/Request;") }
    /*
    //         .locals 8
    //         if-nez p1, :cond_0
    //         invoke-static {p4}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Either location or searchText must be specified."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v3, Landroid/os/Bundle;
    //         const/4 v0, 0x5
    //         invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(I)V
    //         const-string v0, "type"
    //         const-string v1, "place"
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "limit"
    //         invoke-virtual {v3, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         if-eqz p1, :cond_1
    //         const-string v0, "center"
    //         sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         const-string v2, "%f,%f"
    //         const/4 v4, 0x2
    //         new-array v4, v4, [Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D
    //         move-result-wide v6
    //         invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v6
    //         aput-object v6, v4, v5
    //         const/4 v5, 0x1
    //         invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D
    //         move-result-wide v6
    //         invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v6
    //         aput-object v6, v4, v5
    //         invoke-static {v1, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "distance"
    //         invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         :cond_1
    //         invoke-static {p4}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         const-string v0, "q"
    //         invoke-virtual {v3, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_2
    //         new-instance v5, Lcom/facebook/Request$3;
    //         invoke-direct {v5, p5}, Lcom/facebook/Request$3;-><init>(Lcom/facebook/Request$GraphPlaceListCallback;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, "search"
    //         sget-object v4, Lcom/facebook/HttpMethod;->GET:Lcom/facebook/HttpMethod;
    //         move-object v1, p0
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newPostOpenGraphActionRequest(p0: com.facebook.Session, p1: com.facebook.model.OpenGraphAction, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Lcom/facebook/model/OpenGraphAction;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 4
    //         if-nez p1, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "openGraphAction cannot be null"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-interface {p1}, Lcom/facebook/model/OpenGraphAction;->getType()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "openGraphAction must have non-null \'type\' property"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         const-string v0, "me/%s"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-interface {p1}, Lcom/facebook/model/OpenGraphAction;->getType()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0, p1, p2}, Lcom/facebook/Request;->newPostRequest(Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/model/GraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newPostOpenGraphObjectRequest(p0: com.facebook.Session, p1: com.facebook.model.OpenGraphObject, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Lcom/facebook/model/OpenGraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         if-nez p1, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "openGraphObject cannot be null"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-interface {p1}, Lcom/facebook/model/OpenGraphObject;->getType()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "openGraphObject must have non-null \'type\' property"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-interface {p1}, Lcom/facebook/model/OpenGraphObject;->getTitle()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "openGraphObject must have non-null \'title\' property"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         const-string v0, "me/objects/%s"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-interface {p1}, Lcom/facebook/model/OpenGraphObject;->getType()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v2
    //         new-instance v3, Landroid/os/Bundle;
    //         invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
    //         const-string v0, "object"
    //         invoke-interface {p1}, Lcom/facebook/model/OpenGraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         move-object v1, p0
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newPostOpenGraphObjectRequest(p0: com.facebook.Session, p1: String, p2: String, p3: String, p4: String, p5: String, p6: com.facebook.model.GraphObject, p7: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/model/GraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         const-class v0, Lcom/facebook/model/OpenGraphObject;
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         move-object v5, p5
    //         invoke-static/range {v0 .. v5}, Lcom/facebook/model/OpenGraphObject$Factory;->createForPost(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/model/OpenGraphObject;
    //         move-result-object v0
    //         if-eqz p6, :cond_0
    //         invoke-interface {v0, p6}, Lcom/facebook/model/OpenGraphObject;->setData(Lcom/facebook/model/GraphObject;)V
    //         :cond_0
    //         invoke-static {p0, v0, p7}, Lcom/facebook/Request;->newPostOpenGraphObjectRequest(Lcom/facebook/Session;Lcom/facebook/model/OpenGraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newPostRequest(p0: com.facebook.Session, p1: String, p2: com.facebook.model.GraphObject, p3: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/model/GraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         new-instance v0, Lcom/facebook/Request;
    //         const/4 v3, 0x0
    //         sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v5, p3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         invoke-virtual {v0, p2}, Lcom/facebook/Request;->setGraphObject(Lcom/facebook/model/GraphObject;)V
    //         return-object v0
    */

    public @JvmStatic fun newStatusUpdateRequest(p0: com.facebook.Session, p1: String, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         move-object v0, v1
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {p0, p1, v0, v1, p2}, Lcom/facebook/Request;->newStatusUpdateRequest(Lcom/facebook/Session;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newStatusUpdateRequest(p0: com.facebook.Session, p1: String, p2: com.facebook.model.GraphPlace, p3: java.util.List, p4: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/model/GraphPlace;Ljava/util/List;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/Session;",
    //                 "Ljava/lang/String;",
    //                 "Lcom/facebook/model/GraphPlace;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/model/GraphUser;",
    //                 ">;",
    //                 "Lcom/facebook/Request$Callback;",
    //                 ")",
    //                 "Lcom/facebook/Request;"
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         if-eqz p3, :cond_0
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-interface {p3}, Ljava/util/List;->size()I
    //         move-result v0
    //         invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphUser;
    //         invoke-interface {v0}, Lcom/facebook/model/GraphUser;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         move-object v2, v1
    //         :cond_1
    //         if-nez p2, :cond_2
    //         move-object v0, v1
    //         :goto_1
    //         invoke-static {p0, p1, v0, v2, p4}, Lcom/facebook/Request;->newStatusUpdateRequest(Lcom/facebook/Session;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         return-object v0
    //         :cond_2
    //         invoke-interface {p2}, Lcom/facebook/model/GraphPlace;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    */

    private @JvmStatic fun newStatusUpdateRequest(p0: com.facebook.Session, p1: String, p2: String, p3: java.util.List, p4: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/Session;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Lcom/facebook/Request$Callback;",
    //                 ")",
    //                 "Lcom/facebook/Request;"
    //             }
    //         .end annotation
    //         new-instance v3, Landroid/os/Bundle;
    //         invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
    //         const-string v0, "message"
    //         invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         if-eqz p2, :cond_0
    //         const-string v0, "place"
    //         invoke-virtual {v3, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         if-eqz p3, :cond_1
    //         invoke-interface {p3}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-lez v0, :cond_1
    //         const-string v0, ","
    //         invoke-static {v0, p3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "tags"
    //         invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_1
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, "me/feed"
    //         sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         move-object v1, p0
    //         move-object v5, p4
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newUpdateOpenGraphObjectRequest(p0: com.facebook.Session, p1: com.facebook.model.OpenGraphObject, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Lcom/facebook/model/OpenGraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         if-nez p1, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "openGraphObject cannot be null"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-interface {p1}, Lcom/facebook/model/OpenGraphObject;->getId()Ljava/lang/String;
    //         move-result-object v2
    //         if-nez v2, :cond_1
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "openGraphObject must have an id"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         new-instance v3, Landroid/os/Bundle;
    //         invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
    //         const-string v0, "object"
    //         invoke-interface {p1}, Lcom/facebook/model/OpenGraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         move-object v1, p0
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newUpdateOpenGraphObjectRequest(p0: com.facebook.Session, p1: String, p2: String, p3: String, p4: String, p5: String, p6: com.facebook.model.GraphObject, p7: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/model/GraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         const-class v0, Lcom/facebook/model/OpenGraphObject;
    //         const/4 v1, 0x0
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         move-object v5, p5
    //         invoke-static/range {v0 .. v5}, Lcom/facebook/model/OpenGraphObject$Factory;->createForPost(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/model/OpenGraphObject;
    //         move-result-object v0
    //         invoke-interface {v0, p1}, Lcom/facebook/model/OpenGraphObject;->setId(Ljava/lang/String;)V
    //         invoke-interface {v0, p6}, Lcom/facebook/model/OpenGraphObject;->setData(Lcom/facebook/model/GraphObject;)V
    //         invoke-static {p0, v0, p7}, Lcom/facebook/Request;->newUpdateOpenGraphObjectRequest(Lcom/facebook/Session;Lcom/facebook/model/OpenGraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newUploadPhotoRequest(p0: com.facebook.Session, p1: android.graphics.Bitmap, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Landroid/graphics/Bitmap;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         new-instance v3, Landroid/os/Bundle;
    //         const/4 v0, 0x1
    //         invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(I)V
    //         const-string v0, "picture"
    //         invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, "me/photos"
    //         sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         move-object v1, p0
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newUploadPhotoRequest(p0: com.facebook.Session, p1: java.io.File, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Ljava/io/File;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;
    //             }
    //         .end annotation
    //         const/high16 v0, 0x10000000
    //         invoke-static {p1, v0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //         move-result-object v0
    //         new-instance v3, Landroid/os/Bundle;
    //         const/4 v1, 0x1
    //         invoke-direct {v3, v1}, Landroid/os/Bundle;-><init>(I)V
    //         const-string v1, "picture"
    //         invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, "me/photos"
    //         sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         move-object v1, p0
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newUploadStagingResourceWithImageRequest(p0: com.facebook.Session, p1: android.graphics.Bitmap, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Landroid/graphics/Bitmap;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         new-instance v3, Landroid/os/Bundle;
    //         const/4 v0, 0x1
    //         invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(I)V
    //         const-string v0, "file"
    //         invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, "me/staging_resources"
    //         sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         move-object v1, p0
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newUploadStagingResourceWithImageRequest(p0: com.facebook.Session, p1: java.io.File, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Ljava/io/File;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;
    //             }
    //         .end annotation
    //         const/high16 v0, 0x10000000
    //         invoke-static {p1, v0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/Request$ParcelFileDescriptorWithMimeType;
    //         const-string v2, "image/png"
    //         invoke-direct {v1, v0, v2}, Lcom/facebook/Request$ParcelFileDescriptorWithMimeType;-><init>(Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V
    //         new-instance v3, Landroid/os/Bundle;
    //         const/4 v0, 0x1
    //         invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(I)V
    //         const-string v0, "file"
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, "me/staging_resources"
    //         sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         move-object v1, p0
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun newUploadVideoRequest(p0: com.facebook.Session, p1: java.io.File, p2: com.facebook.Request.Callback): com.facebook.Request { return TODO("body: (Lcom/facebook/Session;Ljava/io/File;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/FileNotFoundException;
    //             }
    //         .end annotation
    //         const/high16 v0, 0x10000000
    //         invoke-static {p1, v0}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //         move-result-object v0
    //         new-instance v3, Landroid/os/Bundle;
    //         const/4 v1, 0x1
    //         invoke-direct {v3, v1}, Landroid/os/Bundle;-><init>(I)V
    //         invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v3, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         new-instance v0, Lcom/facebook/Request;
    //         const-string v2, "me/videos"
    //         sget-object v4, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         move-object v1, p0
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/Request$Callback;)V
    //         return-object v0
    */

    private @JvmStatic fun parameterToString(p0: Object): String { return TODO("body: (Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         instance-of v0, p0, Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Ljava/lang/String;
    //         :goto_0
    //         return-object p0
    //         :cond_0
    //         instance-of v0, p0, Ljava/lang/Boolean;
    //         if-nez v0, :cond_1
    //         instance-of v0, p0, Ljava/lang/Number;
    //         if-eqz v0, :cond_2
    //         :cond_1
    //         invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object p0
    //         goto :goto_0
    //         :cond_2
    //         instance-of v0, p0, Ljava/util/Date;
    //         if-eqz v0, :cond_3
    //         new-instance v0, Ljava/text/SimpleDateFormat;
    //         const-string v1, "yyyy-MM-dd\'T\'HH:mm:ssZ"
    //         sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    //         invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object p0
    //         goto :goto_0
    //         :cond_3
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Unsupported parameter type."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    private @JvmStatic fun processGraphObject(p0: com.facebook.model.GraphObject, p1: String, p2: com.facebook.Request.KeyValueSerializer) { /* TODO(body): (Lcom/facebook/model/GraphObject;Ljava/lang/String;Lcom/facebook/Request$KeyValueSerializer;)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/facebook/Request;->isMeRequest(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         const-string v0, ":"
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
    //         move-result v0
    //         const-string v1, "?"
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
    //         move-result v1
    //         const/4 v4, 0x3
    //         if-le v0, v4, :cond_1
    //         const/4 v4, -0x1
    //         if-eq v1, v4, :cond_0
    //         if-ge v0, v1, :cond_1
    //         :cond_0
    //         move v0, v2
    //         :goto_0
    //         move v4, v0
    //         :goto_1
    //         invoke-interface {p0}, Lcom/facebook/model/GraphObject;->asMap()Ljava/util/Map;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v6
    //         :goto_2
    //         invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         if-eqz v4, :cond_2
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         const-string v5, "image"
    //         invoke-virtual {v1, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         move v5, v2
    //         :goto_3
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v1, v0, p2, v5}, Lcom/facebook/Request;->processGraphObjectProperty(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/Request$KeyValueSerializer;Z)V
    //         goto :goto_2
    //         :cond_1
    //         move v0, v3
    //         goto :goto_0
    //         :cond_2
    //         move v5, v3
    //         goto :goto_3
    //         :cond_3
    //         return-void
    //         :cond_4
    //         move v4, v3
    //         goto :goto_1
    */

    private @JvmStatic fun processGraphObjectProperty(p0: String, p1: Object, p2: com.facebook.Request.KeyValueSerializer, p3: Boolean) { /* TODO(body): (Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/Request$KeyValueSerializer;Z)V */ }
    /*
    //         .locals 9
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         const/4 v8, 0x2
    //         const/4 v7, 0x1
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         const-class v1, Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/facebook/model/GraphObject;
    //         invoke-interface {p1}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object p1
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         move-object v1, v0
    //         move-object v0, p1
    //         :goto_0
    //         const-class v3, Lorg/json/JSONObject;
    //         invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v3
    //         if-eqz v3, :cond_5
    //         check-cast v0, Lorg/json/JSONObject;
    //         if-eqz p3, :cond_1
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         const-string v4, "%s[%s]"
    //         new-array v5, v8, [Ljava/lang/Object;
    //         aput-object p0, v5, v2
    //         aput-object v1, v5, v7
    //         invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-static {v4, v1, p2, p3}, Lcom/facebook/Request;->processGraphObjectProperty(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/Request$KeyValueSerializer;Z)V
    //         goto :goto_1
    //         :cond_0
    //         const-class v1, Lcom/facebook/model/GraphObjectList;
    //         invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v1
    //         if-eqz v1, :cond_9
    //         check-cast p1, Lcom/facebook/model/GraphObjectList;
    //         invoke-interface {p1}, Lcom/facebook/model/GraphObjectList;->getInnerJSONArray()Lorg/json/JSONArray;
    //         move-result-object p1
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         move-object v1, v0
    //         move-object v0, p1
    //         goto :goto_0
    //         :cond_1
    //         const-string v1, "id"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         const-string v1, "id"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0, p2, p3}, Lcom/facebook/Request;->processGraphObjectProperty(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/Request$KeyValueSerializer;Z)V
    //         :cond_2
    //         :goto_2
    //         return-void
    //         :cond_3
    //         const-string v1, "url"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         const-string v1, "url"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0, p2, p3}, Lcom/facebook/Request;->processGraphObjectProperty(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/Request$KeyValueSerializer;Z)V
    //         goto :goto_2
    //         :cond_4
    //         const-string v1, "fbsdk:create_object"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0, p2, p3}, Lcom/facebook/Request;->processGraphObjectProperty(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/Request$KeyValueSerializer;Z)V
    //         goto :goto_2
    //         :cond_5
    //         const-class v3, Lorg/json/JSONArray;
    //         invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v3
    //         if-eqz v3, :cond_6
    //         check-cast v0, Lorg/json/JSONArray;
    //         invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    //         move-result v3
    //         move v1, v2
    //         :goto_3
    //         if-ge v1, v3, :cond_2
    //         const-string v4, "%s[%d]"
    //         new-array v5, v8, [Ljava/lang/Object;
    //         aput-object p0, v5, v2
    //         invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v6
    //         aput-object v6, v5, v7
    //         invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v0, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
    //         move-result-object v5
    //         invoke-static {v4, v5, p2, p3}, Lcom/facebook/Request;->processGraphObjectProperty(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/Request$KeyValueSerializer;Z)V
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_3
    //         :cond_6
    //         const-class v2, Ljava/lang/String;
    //         invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v2
    //         if-nez v2, :cond_7
    //         const-class v2, Ljava/lang/Number;
    //         invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v2
    //         if-nez v2, :cond_7
    //         const-class v2, Ljava/lang/Boolean;
    //         invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v2
    //         if-eqz v2, :cond_8
    //         :cond_7
    //         invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p2, p0, v0}, Lcom/facebook/Request$KeyValueSerializer;->writeString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_2
    //         :cond_8
    //         const-class v2, Ljava/util/Date;
    //         invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         check-cast v0, Ljava/util/Date;
    //         new-instance v1, Ljava/text/SimpleDateFormat;
    //         const-string v2, "yyyy-MM-dd\'T\'HH:mm:ssZ"
    //         sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    //         invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p2, p0, v0}, Lcom/facebook/Request$KeyValueSerializer;->writeString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto/16 :goto_2
    //         :cond_9
    //         move-object v1, v0
    //         move-object v0, p1
    //         goto/16 :goto_0
    */

    private @JvmStatic fun processRequest(p0: com.facebook.RequestBatch, p1: com.facebook.internal.Logger, p2: Int, p3: java.net.URL, p4: java.io.OutputStream) { /* TODO(body): (Lcom/facebook/RequestBatch;Lcom/facebook/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v1, Lcom/facebook/Request$Serializer;
    //         invoke-direct {v1, p4, p1}, Lcom/facebook/Request$Serializer;-><init>(Ljava/io/OutputStream;Lcom/facebook/internal/Logger;)V
    //         const/4 v0, 0x1
    //         if-ne p2, v0, :cond_5
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/facebook/RequestBatch;->get(I)Lcom/facebook/Request;
    //         move-result-object v2
    //         new-instance v3, Ljava/util/HashMap;
    //         invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
    //         iget-object v0, v2, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v5, v2, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         invoke-virtual {v5, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v5
    //         invoke-static {v5}, Lcom/facebook/Request;->isSupportedAttachmentType(Ljava/lang/Object;)Z
    //         move-result v6
    //         if-eqz v6, :cond_0
    //         new-instance v6, Lcom/facebook/Request$Attachment;
    //         invoke-direct {v6, v2, v5}, Lcom/facebook/Request$Attachment;-><init>(Lcom/facebook/Request;Ljava/lang/Object;)V
    //         invoke-interface {v3, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_1
    //         if-eqz p1, :cond_2
    //         const-string v0, "  Parameters:\n"
    //         invoke-virtual {p1, v0}, Lcom/facebook/internal/Logger;->append(Ljava/lang/String;)V
    //         :cond_2
    //         iget-object v0, v2, Lcom/facebook/Request;->parameters:Landroid/os/Bundle;
    //         invoke-static {v0, v1, v2}, Lcom/facebook/Request;->serializeParameters(Landroid/os/Bundle;Lcom/facebook/Request$Serializer;Lcom/facebook/Request;)V
    //         if-eqz p1, :cond_3
    //         const-string v0, "  Attachments:\n"
    //         invoke-virtual {p1, v0}, Lcom/facebook/internal/Logger;->append(Ljava/lang/String;)V
    //         :cond_3
    //         invoke-static {v3, v1}, Lcom/facebook/Request;->serializeAttachments(Ljava/util/Map;Lcom/facebook/Request$Serializer;)V
    //         iget-object v0, v2, Lcom/facebook/Request;->graphObject:Lcom/facebook/model/GraphObject;
    //         if-eqz v0, :cond_4
    //         iget-object v0, v2, Lcom/facebook/Request;->graphObject:Lcom/facebook/model/GraphObject;
    //         invoke-virtual {p3}, Ljava/net/URL;->getPath()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2, v1}, Lcom/facebook/Request;->processGraphObject(Lcom/facebook/model/GraphObject;Ljava/lang/String;Lcom/facebook/Request$KeyValueSerializer;)V
    //         :cond_4
    //         :goto_1
    //         return-void
    //         :cond_5
    //         invoke-static {p0}, Lcom/facebook/Request;->getBatchAppId(Lcom/facebook/RequestBatch;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_6
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "At least one request in a batch must have an open Session, or a default app ID must be specified."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_6
    //         const-string v2, "batch_app_id"
    //         invoke-virtual {v1, v2, v0}, Lcom/facebook/Request$Serializer;->writeString(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         invoke-static {v1, p0, v0}, Lcom/facebook/Request;->serializeRequestsAsJSON(Lcom/facebook/Request$Serializer;Ljava/util/Collection;Ljava/util/Map;)V
    //         if-eqz p1, :cond_7
    //         const-string v2, "  Attachments:\n"
    //         invoke-virtual {p1, v2}, Lcom/facebook/internal/Logger;->append(Ljava/lang/String;)V
    //         :cond_7
    //         invoke-static {v0, v1}, Lcom/facebook/Request;->serializeAttachments(Ljava/util/Map;Lcom/facebook/Request$Serializer;)V
    //         goto :goto_1
    */

    @JvmStatic fun runCallbacks(p0: com.facebook.RequestBatch, p1: java.util.List) { /* TODO(body): (Lcom/facebook/RequestBatch;Ljava/util/List;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/RequestBatch;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->size()I
    //         move-result v1
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v1, :cond_1
    //         invoke-virtual {p0, v0}, Lcom/facebook/RequestBatch;->get(I)Lcom/facebook/Request;
    //         move-result-object v3
    //         iget-object v4, v3, Lcom/facebook/Request;->callback:Lcom/facebook/Request$Callback;
    //         if-eqz v4, :cond_0
    //         new-instance v4, Landroid/util/Pair;
    //         iget-object v3, v3, Lcom/facebook/Request;->callback:Lcom/facebook/Request$Callback;
    //         invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v5
    //         invoke-direct {v4, v3, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    //         invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         if-lez v0, :cond_2
    //         new-instance v0, Lcom/facebook/Request$4;
    //         invoke-direct {v0, v2, p0}, Lcom/facebook/Request$4;-><init>(Ljava/util/ArrayList;Lcom/facebook/RequestBatch;)V
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->getCallbackHandler()Landroid/os/Handler;
    //         move-result-object v1
    //         if-nez v1, :cond_3
    //         invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    //         :cond_2
    //         :goto_1
    //         return-void
    //         :cond_3
    //         invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         goto :goto_1
    */

    private @JvmStatic fun serializeAttachments(p0: java.util.Map, p1: com.facebook.Request.Serializer) { /* TODO(body): (Ljava/util/Map;Lcom/facebook/Request$Serializer;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/facebook/Request$Attachment;",
    //                 ">;",
    //                 "Lcom/facebook/Request$Serializer;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/facebook/Request$Attachment;
    //         invoke-virtual {v1}, Lcom/facebook/Request$Attachment;->getValue()Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-static {v3}, Lcom/facebook/Request;->isSupportedAttachmentType(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-virtual {v1}, Lcom/facebook/Request$Attachment;->getValue()Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-virtual {v1}, Lcom/facebook/Request$Attachment;->getRequest()Lcom/facebook/Request;
    //         move-result-object v1
    //         invoke-virtual {p1, v0, v3, v1}, Lcom/facebook/Request$Serializer;->writeObject(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/Request;)V
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    private @JvmStatic fun serializeParameters(p0: android.os.Bundle, p1: com.facebook.Request.Serializer, p2: com.facebook.Request) { /* TODO(body): (Landroid/os/Bundle;Lcom/facebook/Request$Serializer;Lcom/facebook/Request;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/facebook/Request;->isSupportedParameterType(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-virtual {p1, v0, v2, p2}, Lcom/facebook/Request$Serializer;->writeObject(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/Request;)V
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    private @JvmStatic fun serializeRequestsAsJSON(p0: com.facebook.Request.Serializer, p1: java.util.Collection, p2: java.util.Map) { /* TODO(body): (Lcom/facebook/Request$Serializer;Ljava/util/Collection;Ljava/util/Map;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/Request$Serializer;",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/facebook/Request;",
    //                 ">;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/facebook/Request$Attachment;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Request;
    //         invoke-direct {v0, v1, p2}, Lcom/facebook/Request;->serializeToBatch(Lorg/json/JSONArray;Ljava/util/Map;)V
    //         goto :goto_0
    //         :cond_0
    //         const-string v0, "batch"
    //         invoke-virtual {p0, v0, v1, p1}, Lcom/facebook/Request$Serializer;->writeRequestsAsJson(Ljava/lang/String;Lorg/json/JSONArray;Ljava/util/Collection;)V
    //         return-void
    */

    @JvmStatic fun serializeToUrlConnection(p0: com.facebook.RequestBatch, p1: java.net.HttpURLConnection) { /* TODO(body): (Lcom/facebook/RequestBatch;Ljava/net/HttpURLConnection;)V */ }
    /*
    //         .locals 10
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v6, 0x0
    //         const/4 v2, 0x0
    //         const/4 v1, 0x1
    //         new-instance v7, Lcom/facebook/internal/Logger;
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const-string v3, "Request"
    //         invoke-direct {v7, v0, v3}, Lcom/facebook/internal/Logger;-><init>(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->size()I
    //         move-result v8
    //         if-ne v8, v1, :cond_0
    //         invoke-virtual {p0, v2}, Lcom/facebook/RequestBatch;->get(I)Lcom/facebook/Request;
    //         move-result-object v0
    //         iget-object v0, v0, Lcom/facebook/Request;->httpMethod:Lcom/facebook/HttpMethod;
    //         :goto_0
    //         invoke-virtual {v0}, Lcom/facebook/HttpMethod;->name()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    //         invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;
    //         move-result-object v9
    //         const-string v3, "Request:\n"
    //         invoke-virtual {v7, v3}, Lcom/facebook/internal/Logger;->append(Ljava/lang/String;)V
    //         const-string v3, "Id"
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->getId()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v7, v3, v4}, Lcom/facebook/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V
    //         const-string v3, "URL"
    //         invoke-virtual {v7, v3, v9}, Lcom/facebook/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V
    //         const-string v3, "Method"
    //         invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v7, v3, v4}, Lcom/facebook/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V
    //         const-string v3, "User-Agent"
    //         const-string v4, "User-Agent"
    //         invoke-virtual {p1, v4}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v7, v3, v4}, Lcom/facebook/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V
    //         const-string v3, "Content-Type"
    //         const-string v4, "Content-Type"
    //         invoke-virtual {p1, v4}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v7, v3, v4}, Lcom/facebook/internal/Logger;->appendKeyValue(Ljava/lang/String;Ljava/lang/Object;)V
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->getTimeout()I
    //         move-result v3
    //         invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->getTimeout()I
    //         move-result v3
    //         invoke-virtual {p1, v3}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
    //         sget-object v3, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         if-ne v0, v3, :cond_1
    //         move v0, v1
    //         :goto_1
    //         if-nez v0, :cond_2
    //         invoke-virtual {v7}, Lcom/facebook/internal/Logger;->log()V
    //         :goto_2
    //         return-void
    //         :cond_0
    //         sget-object v0, Lcom/facebook/HttpMethod;->POST:Lcom/facebook/HttpMethod;
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
    //         :try_start_0
    //         invoke-static {p0}, Lcom/facebook/Request;->hasOnProgressCallbacks(Lcom/facebook/RequestBatch;)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         new-instance v0, Lcom/facebook/ProgressNoopOutputStream;
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->getCallbackHandler()Landroid/os/Handler;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/ProgressNoopOutputStream;-><init>(Landroid/os/Handler;)V
    //         const/4 v1, 0x0
    //         invoke-static {p0, v1, v8, v9, v0}, Lcom/facebook/Request;->processRequest(Lcom/facebook/RequestBatch;Lcom/facebook/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;)V
    //         invoke-virtual {v0}, Lcom/facebook/ProgressNoopOutputStream;->getMaxProgress()I
    //         move-result v2
    //         invoke-virtual {v0}, Lcom/facebook/ProgressNoopOutputStream;->getProgressMap()Ljava/util/Map;
    //         move-result-object v3
    //         new-instance v1, Ljava/io/BufferedOutputStream;
    //         invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    //         new-instance v0, Lcom/facebook/ProgressOutputStream;
    //         int-to-long v4, v2
    //         move-object v2, p0
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/ProgressOutputStream;-><init>(Ljava/io/OutputStream;Lcom/facebook/RequestBatch;Ljava/util/Map;J)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-object v1, v0
    //         :goto_3
    //         :try_start_1
    //         invoke-static {p0, v7, v8, v9, v1}, Lcom/facebook/Request;->processRequest(Lcom/facebook/RequestBatch;Lcom/facebook/internal/Logger;ILjava/net/URL;Ljava/io/OutputStream;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         if-eqz v1, :cond_3
    //         invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    //         :cond_3
    //         invoke-virtual {v7}, Lcom/facebook/internal/Logger;->log()V
    //         goto :goto_2
    //         :cond_4
    //         :try_start_2
    //         new-instance v1, Ljava/io/BufferedOutputStream;
    //         invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         goto :goto_3
    //         :catchall_0
    //         move-exception v0
    //         move-object v1, v6
    //         :goto_4
    //         if-eqz v1, :cond_5
    //         invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    //         :cond_5
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         goto :goto_4
    */

    public @JvmStatic fun setDefaultBatchApplicationId(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         sput-object p0, Lcom/facebook/Request;->defaultBatchApplicationId:Ljava/lang/String;
    //         return-void
    */

    public @JvmStatic fun toHttpConnection(p0: com.facebook.RequestBatch): java.net.HttpURLConnection { return TODO("body: (Lcom/facebook/RequestBatch;)Ljava/net/HttpURLConnection;") }
    /*
    //         .locals 3
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->size()I
    //         move-result v0
    //         const/4 v1, 0x1
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/facebook/RequestBatch;->get(I)Lcom/facebook/Request;
    //         move-result-object v1
    //         new-instance v0, Ljava/net/URL;
    //         invoke-virtual {v1}, Lcom/facebook/Request;->getUrlForSingleRequest()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         :try_start_1
    //         invoke-static {v0}, Lcom/facebook/Request;->createConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/facebook/Request;->serializeToUrlConnection(Lcom/facebook/RequestBatch;Ljava/net/HttpURLConnection;)V
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    //         return-object v0
    //         :cond_0
    //         :try_start_2
    //         new-instance v0, Ljava/net/URL;
    //         invoke-static {}, Lcom/facebook/internal/ServerProtocol;->getGraphUrlBase()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    //         :try_end_2
    //         .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Lcom/facebook/FacebookException;
    //         const-string v2, "could not construct URL for request"
    //         invoke-direct {v1, v2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    //         :catch_1
    //         move-exception v0
    //         new-instance v1, Lcom/facebook/FacebookException;
    //         const-string v2, "could not construct request body"
    //         invoke-direct {v1, v2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    //         :catch_2
    //         move-exception v0
    //         new-instance v1, Lcom/facebook/FacebookException;
    //         const-string v2, "could not construct request body"
    //         invoke-direct {v1, v2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    public @JvmStatic fun toHttpConnection(p0: java.util.Collection): java.net.HttpURLConnection { return TODO("body: (Ljava/util/Collection;)Ljava/net/HttpURLConnection;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/facebook/Request;",
    //                 ">;)",
    //                 "Ljava/net/HttpURLConnection;"
    //             }
    //         .end annotation
    //         const-string v0, "requests"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notEmptyAndContainsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/RequestBatch;
    //         invoke-direct {v0, p0}, Lcom/facebook/RequestBatch;-><init>(Ljava/util/Collection;)V
    //         invoke-static {v0}, Lcom/facebook/Request;->toHttpConnection(Lcom/facebook/RequestBatch;)Ljava/net/HttpURLConnection;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun toHttpConnection(p0: Array<com.facebook.Request>): java.net.HttpURLConnection { return TODO("body: ([Lcom/facebook/Request;)Ljava/net/HttpURLConnection;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/Request;->toHttpConnection(Ljava/util/Collection;)Ljava/net/HttpURLConnection;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun typedListFromResponse(p0: com.facebook.Response, p1: Class): java.util.List { return TODO("body: (Lcom/facebook/Response;Ljava/lang/Class;)Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/facebook/model/GraphObject;",
    //                 ">(",
    //                 "Lcom/facebook/Response;",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)",
    //                 "Ljava/util/List",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         const-class v0, Lcom/facebook/model/GraphMultiResult;
    //         invoke-virtual {p0, v0}, Lcom/facebook/Response;->getGraphObjectAs(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/GraphMultiResult;
    //         if-nez v0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-interface {v0}, Lcom/facebook/model/GraphMultiResult;->getData()Lcom/facebook/model/GraphObjectList;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_1
    //         invoke-interface {v0, p1}, Lcom/facebook/model/GraphObjectList;->castToListOf(Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;
    //         move-result-object v0
    //         goto :goto_0
    */

    }
}
