package com.facebook

// Auto-emitted from smali source: Response.java.
// 16 fields, 23 methods.

open class Response {
    private val connection: java.net.HttpURLConnection
    private val error: com.facebook.FacebookRequestError
    private val graphObject: com.facebook.model.GraphObject
    private val graphObjectList: com.facebook.model.GraphObjectList
    private val isFromCache: Boolean
    private val rawResponse: String
    private val request: com.facebook.Request

    constructor(p0: com.facebook.Request, p1: java.net.HttpURLConnection, p2: com.facebook.FacebookRequestError)

    constructor(p0: com.facebook.Request, p1: java.net.HttpURLConnection, p2: String, p3: com.facebook.model.GraphObject, p4: com.facebook.model.GraphObjectList, p5: Boolean, p6: com.facebook.FacebookRequestError)

    constructor(p0: com.facebook.Request, p1: java.net.HttpURLConnection, p2: String, p3: com.facebook.model.GraphObject, p4: Boolean)

    constructor(p0: com.facebook.Request, p1: java.net.HttpURLConnection, p2: String, p3: com.facebook.model.GraphObjectList, p4: Boolean)

    public fun getConnection(): java.net.HttpURLConnection { return TODO("body: ()Ljava/net/HttpURLConnection;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Response;->connection:Ljava/net/HttpURLConnection;
    //         return-object v0
    */

    public fun getError(): com.facebook.FacebookRequestError { return TODO("body: ()Lcom/facebook/FacebookRequestError;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Response;->error:Lcom/facebook/FacebookRequestError;
    //         return-object v0
    */

    public fun getGraphObject(): com.facebook.model.GraphObject { return TODO("body: ()Lcom/facebook/model/GraphObject;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Response;->graphObject:Lcom/facebook/model/GraphObject;
    //         return-object v0
    */

    public fun getGraphObjectAs(p0: Class): com.facebook.model.GraphObject { return TODO("body: (Ljava/lang/Class;)Lcom/facebook/model/GraphObject;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/facebook/model/GraphObject;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/Response;->graphObject:Lcom/facebook/model/GraphObject;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         if-nez p1, :cond_1
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         const-string v1, "Must pass in a valid interface that extends GraphObject"
    //         invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/Response;->graphObject:Lcom/facebook/model/GraphObject;
    //         invoke-interface {v0, p1}, Lcom/facebook/model/GraphObject;->cast(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getGraphObjectList(): com.facebook.model.GraphObjectList { return TODO("body: ()Lcom/facebook/model/GraphObjectList;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/facebook/model/GraphObjectList",
    //                 "<",
    //                 "Lcom/facebook/model/GraphObject;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/Response;->graphObjectList:Lcom/facebook/model/GraphObjectList;
    //         return-object v0
    */

    public fun getGraphObjectListAs(p0: Class): com.facebook.model.GraphObjectList { return TODO("body: (Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/facebook/model/GraphObject;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)",
    //                 "Lcom/facebook/model/GraphObjectList",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/Response;->graphObjectList:Lcom/facebook/model/GraphObjectList;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/Response;->graphObjectList:Lcom/facebook/model/GraphObjectList;
    //         invoke-interface {v0, p1}, Lcom/facebook/model/GraphObjectList;->castToListOf(Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getIsFromCache(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/Response;->isFromCache:Z
    //         return v0
    */

    public fun getRawResponse(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Response;->rawResponse:Ljava/lang/String;
    //         return-object v0
    */

    public fun getRequest(): com.facebook.Request { return TODO("body: ()Lcom/facebook/Request;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/Response;->request:Lcom/facebook/Request;
    //         return-object v0
    */

    public fun getRequestForPagedResults(p0: com.facebook.Response.PagingDirection): com.facebook.Request { return TODO("body: (Lcom/facebook/Response$PagingDirection;)Lcom/facebook/Request;") }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/facebook/Response;->graphObject:Lcom/facebook/model/GraphObject;
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/facebook/Response;->graphObject:Lcom/facebook/model/GraphObject;
    //         const-class v2, Lcom/facebook/Response$PagedResults;
    //         invoke-interface {v0, v2}, Lcom/facebook/model/GraphObject;->cast(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Response$PagedResults;
    //         invoke-interface {v0}, Lcom/facebook/Response$PagedResults;->getPaging()Lcom/facebook/Response$PagingInfo;
    //         move-result-object v0
    //         if-eqz v0, :cond_4
    //         sget-object v2, Lcom/facebook/Response$PagingDirection;->NEXT:Lcom/facebook/Response$PagingDirection;
    //         if-ne p1, v2, :cond_1
    //         invoke-interface {v0}, Lcom/facebook/Response$PagingInfo;->getNext()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         :cond_0
    //         :goto_1
    //         return-object v1
    //         :cond_1
    //         invoke-interface {v0}, Lcom/facebook/Response$PagingInfo;->getPrevious()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         if-eqz v0, :cond_3
    //         iget-object v2, p0, Lcom/facebook/Response;->request:Lcom/facebook/Request;
    //         invoke-virtual {v2}, Lcom/facebook/Request;->getUrlForSingleRequest()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_3
    //         :try_start_0
    //         new-instance v2, Lcom/facebook/Request;
    //         iget-object v3, p0, Lcom/facebook/Response;->request:Lcom/facebook/Request;
    //         invoke-virtual {v3}, Lcom/facebook/Request;->getSession()Lcom/facebook/Session;
    //         move-result-object v3
    //         new-instance v4, Ljava/net/URL;
    //         invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    //         invoke-direct {v2, v3, v4}, Lcom/facebook/Request;-><init>(Lcom/facebook/Session;Ljava/net/URL;)V
    //         :try_end_0
    //         .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-object v1, v2
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         goto :goto_1
    //         :cond_4
    //         move-object v0, v1
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         :try_start_0
    //         const-string v1, "%d"
    //         const/4 v0, 0x1
    //         new-array v2, v0, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/facebook/Response;->connection:Ljava/net/HttpURLConnection;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/Response;->connection:Ljava/net/HttpURLConnection;
    //         invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    //         move-result v0
    //         :goto_0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         aput-object v0, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "{Response: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " responseCode: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", graphObject: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/Response;->graphObject:Lcom/facebook/model/GraphObject;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", error: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/Response;->error:Lcom/facebook/FacebookRequestError;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", isFromCache:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-boolean v1, p0, Lcom/facebook/Response;->isFromCache:Z
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const/16 v0, 0xc8
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "unknown"
    //         goto :goto_1
    */

    companion object {
    val $assertionsDisabled: Boolean = false
    private val BODY_KEY: String = "body"
    private val CODE_KEY: String = "code"
    private val INVALID_SESSION_FACEBOOK_ERROR_CODE: Int = 0xbe
    @JvmField public val NON_JSON_RESPONSE_PROPERTY: String = "FACEBOOK_NON_JSON_RESULT"
    private val RESPONSE_CACHE_TAG: String = "ResponseCache"
    private val RESPONSE_LOG_TAG: String = "Response"
    @JvmField public val SUCCESS_KEY: String = "success"
    private var responseCache: com.facebook.internal.FileLruCache

    @JvmStatic fun constructErrorResponses(p0: java.util.List, p1: java.net.HttpURLConnection, p2: com.facebook.FacebookException): java.util.List { return TODO("body: (Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Request;",
    //                 ">;",
    //                 "Ljava/net/HttpURLConnection;",
    //                 "Lcom/facebook/FacebookException;",
    //                 ")",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-interface {p0}, Ljava/util/List;->size()I
    //         move-result v2
    //         new-instance v3, Ljava/util/ArrayList;
    //         invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v2, :cond_0
    //         new-instance v4, Lcom/facebook/Response;
    //         invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Request;
    //         new-instance v5, Lcom/facebook/FacebookRequestError;
    //         invoke-direct {v5, p1, p2}, Lcom/facebook/FacebookRequestError;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V
    //         invoke-direct {v4, v0, p1, v5}, Lcom/facebook/Response;-><init>(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V
    //         invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return-object v3
    */

    private @JvmStatic fun createResponseFromObject(p0: com.facebook.Request, p1: java.net.HttpURLConnection, p2: Object, p3: Boolean, p4: Object): com.facebook.Response { return TODO("body: (Lcom/facebook/Request;Ljava/net/HttpURLConnection;Ljava/lang/Object;ZLjava/lang/Object;)Lcom/facebook/Response;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         instance-of v0, p2, Lorg/json/JSONObject;
    //         if-eqz v0, :cond_4
    //         check-cast p2, Lorg/json/JSONObject;
    //         invoke-static {p2, p4, p1}, Lcom/facebook/FacebookRequestError;->checkResponseAndCreateError(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lcom/facebook/FacebookRequestError;
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         invoke-virtual {v1}, Lcom/facebook/FacebookRequestError;->getErrorCode()I
    //         move-result v0
    //         const/16 v2, 0xbe
    //         if-ne v0, v2, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/Request;->getSession()Lcom/facebook/Session;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/Session;->closeAndClearTokenInformation()V
    //         :cond_0
    //         new-instance v0, Lcom/facebook/Response;
    //         invoke-direct {v0, p0, p1, v1}, Lcom/facebook/Response;-><init>(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const-string v0, "body"
    //         const-string v1, "FACEBOOK_NON_JSON_RESULT"
    //         invoke-static {p2, v0, v1}, Lcom/facebook/internal/Utility;->getStringPropertyAsJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         instance-of v0, v1, Lorg/json/JSONObject;
    //         if-eqz v0, :cond_2
    //         move-object v0, v1
    //         check-cast v0, Lorg/json/JSONObject;
    //         invoke-static {v0}, Lcom/facebook/model/GraphObject$Factory;->create(Lorg/json/JSONObject;)Lcom/facebook/model/GraphObject;
    //         move-result-object v4
    //         new-instance v0, Lcom/facebook/Response;
    //         invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         move-object v1, p0
    //         move-object v2, p1
    //         move v5, p3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Response;-><init>(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/facebook/model/GraphObject;Z)V
    //         goto :goto_0
    //         :cond_2
    //         instance-of v0, v1, Lorg/json/JSONArray;
    //         if-eqz v0, :cond_3
    //         move-object v0, v1
    //         check-cast v0, Lorg/json/JSONArray;
    //         const-class v2, Lcom/facebook/model/GraphObject;
    //         invoke-static {v0, v2}, Lcom/facebook/model/GraphObject$Factory;->createList(Lorg/json/JSONArray;Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;
    //         move-result-object v4
    //         new-instance v0, Lcom/facebook/Response;
    //         invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         move-object v1, p0
    //         move-object v2, p1
    //         move v5, p3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Response;-><init>(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/facebook/model/GraphObjectList;Z)V
    //         goto :goto_0
    //         :cond_3
    //         sget-object p2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;
    //         :cond_4
    //         sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;
    //         if-ne p2, v0, :cond_5
    //         new-instance v0, Lcom/facebook/Response;
    //         invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         const/4 v4, 0x0
    //         check-cast v4, Lcom/facebook/model/GraphObject;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move v5, p3
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Response;-><init>(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/facebook/model/GraphObject;Z)V
    //         goto :goto_0
    //         :cond_5
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Got unexpected object type in response, class: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    private @JvmStatic fun createResponsesFromObject(p0: java.net.HttpURLConnection, p1: java.util.List, p2: Object, p3: Boolean): java.util.List { return TODO("body: (Ljava/net/HttpURLConnection;Ljava/util/List;Ljava/lang/Object;Z)Ljava/util/List;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/net/HttpURLConnection;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Request;",
    //                 ">;",
    //                 "Ljava/lang/Object;",
    //                 "Z)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/facebook/FacebookException;,
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         sget-boolean v0, Lcom/facebook/Response;->$assertionsDisabled:Z
    //         if-nez v0, :cond_0
    //         if-nez p0, :cond_0
    //         if-nez p3, :cond_0
    //         new-instance v0, Ljava/lang/AssertionError;
    //         invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
    //         throw v0
    //         :cond_0
    //         invoke-interface {p1}, Ljava/util/List;->size()I
    //         move-result v3
    //         new-instance v4, Ljava/util/ArrayList;
    //         invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V
    //         const/4 v0, 0x1
    //         if-ne v3, v0, :cond_3
    //         invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Request;
    //         :try_start_0
    //         new-instance v5, Lorg/json/JSONObject;
    //         invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V
    //         const-string v1, "body"
    //         invoke-virtual {v5, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         if-eqz p0, :cond_2
    //         invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    //         move-result v1
    //         :goto_0
    //         const-string v6, "code"
    //         invoke-virtual {v5, v6, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         new-instance v1, Lorg/json/JSONArray;
    //         invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
    //         invoke-virtual {v1, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    //         :goto_1
    //         instance-of v0, v1, Lorg/json/JSONArray;
    //         if-eqz v0, :cond_1
    //         move-object v0, v1
    //         check-cast v0, Lorg/json/JSONArray;
    //         invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    //         move-result v0
    //         if-eq v0, v3, :cond_4
    //         :cond_1
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Unexpected number of results"
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         const/16 v1, 0xc8
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         new-instance v5, Lcom/facebook/Response;
    //         new-instance v6, Lcom/facebook/FacebookRequestError;
    //         invoke-direct {v6, p0, v1}, Lcom/facebook/FacebookRequestError;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V
    //         invoke-direct {v5, v0, p0, v6}, Lcom/facebook/Response;-><init>(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V
    //         invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         move-object v1, p2
    //         goto :goto_1
    //         :catch_1
    //         move-exception v1
    //         new-instance v5, Lcom/facebook/Response;
    //         new-instance v6, Lcom/facebook/FacebookRequestError;
    //         invoke-direct {v6, p0, v1}, Lcom/facebook/FacebookRequestError;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V
    //         invoke-direct {v5, v0, p0, v6}, Lcom/facebook/Response;-><init>(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V
    //         invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_3
    //         move-object v1, p2
    //         goto :goto_1
    //         :cond_4
    //         check-cast v1, Lorg/json/JSONArray;
    //         :goto_2
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v0
    //         if-ge v2, v0, :cond_5
    //         invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Request;
    //         :try_start_1
    //         invoke-virtual {v1, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-static {v0, p0, v3, p3, p2}, Lcom/facebook/Response;->createResponseFromObject(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Ljava/lang/Object;ZLjava/lang/Object;)Lcom/facebook/Response;
    //         move-result-object v3
    //         invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :try_end_1
    //         .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    //         .catch Lcom/facebook/FacebookException; {:try_start_1 .. :try_end_1} :catch_3
    //         :goto_3
    //         add-int/lit8 v0, v2, 0x1
    //         move v2, v0
    //         goto :goto_2
    //         :catch_2
    //         move-exception v3
    //         new-instance v5, Lcom/facebook/Response;
    //         new-instance v6, Lcom/facebook/FacebookRequestError;
    //         invoke-direct {v6, p0, v3}, Lcom/facebook/FacebookRequestError;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V
    //         invoke-direct {v5, v0, p0, v6}, Lcom/facebook/Response;-><init>(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V
    //         invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_3
    //         :catch_3
    //         move-exception v3
    //         new-instance v5, Lcom/facebook/Response;
    //         new-instance v6, Lcom/facebook/FacebookRequestError;
    //         invoke-direct {v6, p0, v3}, Lcom/facebook/FacebookRequestError;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V
    //         invoke-direct {v5, v0, p0, v6}, Lcom/facebook/Response;-><init>(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V
    //         invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_3
    //         :cond_5
    //         return-object v4
    */

    @JvmStatic fun createResponsesFromStream(p0: java.io.InputStream, p1: java.net.HttpURLConnection, p2: com.facebook.RequestBatch, p3: Boolean): java.util.List { return TODO("body: (Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;Z)Ljava/util/List;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/io/InputStream;",
    //                 "Ljava/net/HttpURLConnection;",
    //                 "Lcom/facebook/RequestBatch;",
    //                 "Z)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/facebook/FacebookException;,
    //                 Lorg/json/JSONException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->readStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/LoggingBehavior;->INCLUDE_RAW_RESPONSES:Lcom/facebook/LoggingBehavior;
    //         const-string v2, "Response"
    //         const-string v3, "Response (raw)\n  Size: %d\n  Response:\n%s\n"
    //         const/4 v4, 0x2
    //         new-array v4, v4, [Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v6
    //         invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v6
    //         aput-object v6, v4, v5
    //         const/4 v5, 0x1
    //         aput-object v0, v4, v5
    //         invoke-static {v1, v2, v3, v4}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         invoke-static {v0, p1, p2, p3}, Lcom/facebook/Response;->createResponsesFromString(Ljava/lang/String;Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;Z)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun createResponsesFromString(p0: String, p1: java.net.HttpURLConnection, p2: com.facebook.RequestBatch, p3: Boolean): java.util.List { return TODO("body: (Ljava/lang/String;Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;Z)Ljava/util/List;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/net/HttpURLConnection;",
    //                 "Lcom/facebook/RequestBatch;",
    //                 "Z)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/facebook/FacebookException;,
    //                 Lorg/json/JSONException;,
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONTokener;
    //         invoke-direct {v0, p0}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {p1, p2, v0, p3}, Lcom/facebook/Response;->createResponsesFromObject(Ljava/net/HttpURLConnection;Ljava/util/List;Ljava/lang/Object;Z)Ljava/util/List;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const-string v2, "Response"
    //         const-string v3, "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n"
    //         const/4 v4, 0x3
    //         new-array v4, v4, [Ljava/lang/Object;
    //         const/4 v5, 0x0
    //         invoke-virtual {p2}, Lcom/facebook/RequestBatch;->getId()Ljava/lang/String;
    //         move-result-object v6
    //         aput-object v6, v4, v5
    //         const/4 v5, 0x1
    //         invoke-virtual {p0}, Ljava/lang/String;->length()I
    //         move-result v6
    //         invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v6
    //         aput-object v6, v4, v5
    //         const/4 v5, 0x2
    //         aput-object v0, v4, v5
    //         invoke-static {v1, v2, v3, v4}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         return-object v0
    */

    @JvmStatic fun fromHttpConnection(p0: java.net.HttpURLConnection, p1: com.facebook.RequestBatch): java.util.List { return TODO("body: (Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;)Ljava/util/List;") }
    /*
    //         .locals 8
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
    //         const/4 v2, 0x0
    //         const/4 v6, 0x1
    //         const/4 v5, 0x0
    //         instance-of v0, p1, Lcom/facebook/internal/CacheableRequestBatch;
    //         if-eqz v0, :cond_6
    //         move-object v0, p1
    //         check-cast v0, Lcom/facebook/internal/CacheableRequestBatch;
    //         invoke-static {}, Lcom/facebook/Response;->getResponseCache()Lcom/facebook/internal/FileLruCache;
    //         move-result-object v3
    //         invoke-virtual {v0}, Lcom/facebook/internal/CacheableRequestBatch;->getCacheKeyOverride()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/RequestBatch;->size()I
    //         move-result v4
    //         if-ne v4, v6, :cond_1
    //         invoke-virtual {p1, v5}, Lcom/facebook/RequestBatch;->get(I)Lcom/facebook/Request;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/facebook/Request;->getUrlForSingleRequest()Ljava/lang/String;
    //         move-result-object v1
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {v0}, Lcom/facebook/internal/CacheableRequestBatch;->getForceRoundTrip()Z
    //         move-result v0
    //         if-nez v0, :cond_5
    //         if-eqz v3, :cond_5
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_5
    //         :try_start_0
    //         invoke-virtual {v3, v1}, Lcom/facebook/internal/FileLruCache;->get(Ljava/lang/String;)Ljava/io/InputStream;
    //         :try_end_0
    //         .catch Lcom/facebook/FacebookException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v2
    //         if-eqz v2, :cond_2
    //         const/4 v0, 0x0
    //         const/4 v4, 0x1
    //         :try_start_1
    //         invoke-static {v2, v0, p1, v4}, Lcom/facebook/Response;->createResponsesFromStream(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;Z)Ljava/util/List;
    //         :try_end_1
    //         .catch Lcom/facebook/FacebookException; {:try_start_1 .. :try_end_1} :catch_7
    //         .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         move-result-object v0
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         :goto_1
    //         return-object v0
    //         :cond_1
    //         sget-object v4, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const-string v5, "ResponseCache"
    //         const-string v6, "Not using cache for cacheable request because no key was specified"
    //         invoke-static {v4, v5, v6}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_2
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         move-object v0, v3
    //         move-object v7, v1
    //         move-object v1, v2
    //         move-object v2, v7
    //         :goto_2
    //         :try_start_2
    //         invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I
    //         move-result v3
    //         const/16 v4, 0x190
    //         if-lt v3, v4, :cond_4
    //         invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;
    //         move-result-object v1
    //         :cond_3
    //         :goto_3
    //         const/4 v0, 0x0
    //         invoke-static {v1, p0, p1, v0}, Lcom/facebook/Response;->createResponsesFromStream(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;Z)Ljava/util/List;
    //         :try_end_2
    //         .catch Lcom/facebook/FacebookException; {:try_start_2 .. :try_end_2} :catch_3
    //         .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_4
    //         .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    //         .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_6
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         move-result-object v0
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         move-object v0, v2
    //         :goto_4
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         move-object v2, v1
    //         move-object v1, v0
    //         move-object v0, v3
    //         goto :goto_2
    //         :catch_1
    //         move-exception v0
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         move-object v0, v3
    //         move-object v7, v1
    //         move-object v1, v2
    //         move-object v2, v7
    //         goto :goto_2
    //         :catch_2
    //         move-exception v0
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         move-object v0, v3
    //         move-object v7, v1
    //         move-object v1, v2
    //         move-object v2, v7
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         invoke-static {v2}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         throw v0
    //         :cond_4
    //         :try_start_3
    //         invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    //         move-result-object v1
    //         if-eqz v0, :cond_3
    //         if-eqz v2, :cond_3
    //         if-eqz v1, :cond_3
    //         invoke-virtual {v0, v2, v1}, Lcom/facebook/internal/FileLruCache;->interceptAndPut(Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;
    //         :try_end_3
    //         .catch Lcom/facebook/FacebookException; {:try_start_3 .. :try_end_3} :catch_3
    //         .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_4
    //         .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    //         .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_6
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         move-object v1, v0
    //         goto :goto_3
    //         :catch_3
    //         move-exception v0
    //         :try_start_4
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const-string v3, "Response"
    //         const-string v4, "Response <Error>: %s"
    //         const/4 v5, 0x1
    //         new-array v5, v5, [Ljava/lang/Object;
    //         const/4 v6, 0x0
    //         aput-object v0, v5, v6
    //         invoke-static {v2, v3, v4, v5}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         invoke-static {p1, p0, v0}, Lcom/facebook/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_1
    //         move-result-object v0
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto :goto_1
    //         :catch_4
    //         move-exception v0
    //         :try_start_5
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const-string v3, "Response"
    //         const-string v4, "Response <Error>: %s"
    //         const/4 v5, 0x1
    //         new-array v5, v5, [Ljava/lang/Object;
    //         const/4 v6, 0x0
    //         aput-object v0, v5, v6
    //         invoke-static {v2, v3, v4, v5}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         new-instance v2, Lcom/facebook/FacebookException;
    //         invoke-direct {v2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V
    //         invoke-static {p1, p0, v2}, Lcom/facebook/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_1
    //         move-result-object v0
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto/16 :goto_1
    //         :catch_5
    //         move-exception v0
    //         :try_start_6
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const-string v3, "Response"
    //         const-string v4, "Response <Error>: %s"
    //         const/4 v5, 0x1
    //         new-array v5, v5, [Ljava/lang/Object;
    //         const/4 v6, 0x0
    //         aput-object v0, v5, v6
    //         invoke-static {v2, v3, v4, v5}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         new-instance v2, Lcom/facebook/FacebookException;
    //         invoke-direct {v2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V
    //         invoke-static {p1, p0, v2}, Lcom/facebook/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //         :try_end_6
    //         .catchall {:try_start_6 .. :try_end_6} :catchall_1
    //         move-result-object v0
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto/16 :goto_1
    //         :catch_6
    //         move-exception v0
    //         :try_start_7
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const-string v3, "Response"
    //         const-string v4, "Response <Error>: %s"
    //         const/4 v5, 0x1
    //         new-array v5, v5, [Ljava/lang/Object;
    //         const/4 v6, 0x0
    //         aput-object v0, v5, v6
    //         invoke-static {v2, v3, v4, v5}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         new-instance v2, Lcom/facebook/FacebookException;
    //         invoke-direct {v2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V
    //         invoke-static {p1, p0, v2}, Lcom/facebook/Response;->constructErrorResponses(Ljava/util/List;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;)Ljava/util/List;
    //         :try_end_7
    //         .catchall {:try_start_7 .. :try_end_7} :catchall_1
    //         move-result-object v0
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto/16 :goto_1
    //         :catchall_1
    //         move-exception v0
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         throw v0
    //         :catch_7
    //         move-exception v0
    //         move-object v0, v2
    //         goto/16 :goto_4
    //         :cond_5
    //         move-object v0, v3
    //         move-object v7, v1
    //         move-object v1, v2
    //         move-object v2, v7
    //         goto/16 :goto_2
    //         :cond_6
    //         move-object v0, v2
    //         move-object v1, v2
    //         goto/16 :goto_2
    */

    @JvmStatic fun getResponseCache(): com.facebook.internal.FileLruCache { return TODO("body: ()Lcom/facebook/internal/FileLruCache;") }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/facebook/Response;->responseCache:Lcom/facebook/internal/FileLruCache;
    //         if-nez v0, :cond_0
    //         invoke-static {}, Lcom/facebook/Session;->getStaticContext()Landroid/content/Context;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         new-instance v1, Lcom/facebook/internal/FileLruCache;
    //         const-string v2, "ResponseCache"
    //         new-instance v3, Lcom/facebook/internal/FileLruCache$Limits;
    //         invoke-direct {v3}, Lcom/facebook/internal/FileLruCache$Limits;-><init>()V
    //         invoke-direct {v1, v0, v2, v3}, Lcom/facebook/internal/FileLruCache;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/FileLruCache$Limits;)V
    //         sput-object v1, Lcom/facebook/Response;->responseCache:Lcom/facebook/internal/FileLruCache;
    //         :cond_0
    //         sget-object v0, Lcom/facebook/Response;->responseCache:Lcom/facebook/internal/FileLruCache;
    //         return-object v0
    */

    }
}
