package com.facebook

// Auto-emitted from smali source: AppEventsLogger.java.
// 5 fields, 10 methods.

open class AppEventsLogger_AppEvent: java.io.Serializable {
    private var isImplicit: Boolean
    private var jsonObject: org.json.JSONObject
    private var name: String

    public constructor(p0: android.content.Context, p1: String, p2: Double, p3: android.os.Bundle, p4: Boolean)

    private constructor(p0: String, p1: Boolean)

    constructor(p0: String, p1: Boolean, p2: com.facebook.AppEventsLogger.1)

    private fun validateIdentifier(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lcom/facebook/FacebookException;
    //             }
    //         .end annotation
    //         const/16 v5, 0x28
    //         const/4 v4, 0x1
    //         const/4 v3, 0x0
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-le v0, v5, :cond_2
    //         :cond_0
    //         if-nez p1, :cond_1
    //         const-string p1, "<None Provided>"
    //         :cond_1
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Identifier \'%s\' must be less than %d characters"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         aput-object p1, v2, v3
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v2, v4
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         sget-object v1, Lcom/facebook/AppEventsLogger$AppEvent;->validatedIdentifiers:Ljava/util/HashSet;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/AppEventsLogger$AppEvent;->validatedIdentifiers:Ljava/util/HashSet;
    //         invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-nez v0, :cond_3
    //         const-string v0, "^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$"
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         sget-object v1, Lcom/facebook/AppEventsLogger$AppEvent;->validatedIdentifiers:Ljava/util/HashSet;
    //         monitor-enter v1
    //         :try_start_1
    //         sget-object v0, Lcom/facebook/AppEventsLogger$AppEvent;->validatedIdentifiers:Ljava/util/HashSet;
    //         invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         :cond_3
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_2
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         :try_start_3
    //         monitor-exit v1
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         throw v0
    //         :cond_4
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Skipping event named \'%s\' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen."
    //         new-array v2, v4, [Ljava/lang/Object;
    //         aput-object p1, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    private fun writeReplace(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/facebook/AppEventsLogger$AppEvent$SerializationProxyV1;
    //         iget-object v1, p0, Lcom/facebook/AppEventsLogger$AppEvent;->jsonObject:Lorg/json/JSONObject;
    //         invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         iget-boolean v2, p0, Lcom/facebook/AppEventsLogger$AppEvent;->isImplicit:Z
    //         const/4 v3, 0x0
    //         invoke-direct {v0, v1, v2, v3}, Lcom/facebook/AppEventsLogger$AppEvent$SerializationProxyV1;-><init>(Ljava/lang/String;ZLcom/facebook/AppEventsLogger$1;)V
    //         return-object v0
    */

    public fun getIsImplicit(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/AppEventsLogger$AppEvent;->isImplicit:Z
    //         return v0
    */

    public fun getJSONObject(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AppEventsLogger$AppEvent;->jsonObject:Lorg/json/JSONObject;
    //         return-object v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AppEventsLogger$AppEvent;->name:Ljava/lang/String;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         const-string v0, "\"%s\", implicit: %b, json: %s"
    //         const/4 v1, 0x3
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/facebook/AppEventsLogger$AppEvent;->jsonObject:Lorg/json/JSONObject;
    //         const-string v4, "_eventName"
    //         invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-boolean v3, p0, Lcom/facebook/AppEventsLogger$AppEvent;->isImplicit:Z
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget-object v3, p0, Lcom/facebook/AppEventsLogger$AppEvent;->jsonObject:Lorg/json/JSONObject;
    //         invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    private val validatedIdentifiers: java.util.HashSet = null!!
    }
}
