package com.google.android.gms.auth.api

// Auto-emitted from smali.
// 24 fields, 32 methods.

open class GoogleAuthApiRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    var DA: ByteArray
    var DB: Long
    var Dt: String
    var Du: android.os.Bundle
    var Dv: String
    var Dw: java.util.List
    var Dx: String
    var Dy: Int
    var Dz: android.os.Bundle
    var name: String
    var version: String
    val versionCode: Int
    var yR: String

    constructor(versionCode: Int, name: String, version: String, apiId: String, path: String, parameters: android.os.Bundle, accountName: String, scopePrefix: java.util.List, httpMethod: String, headers: Int, body: android.os.Bundle, timeout: ByteArray, p12: Long)

    public constructor(name: String, version: String, apiId: String)

    public constructor(name: String, version: String, path: String, httpMethod: Int)

    private fun T(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         if-ltz p1, :cond_0
    //         const/4 v0, 0x7
    //         if-le p1, v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Invalid HTTP method."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iput p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dy:I
    //         return-void
    */

    private fun ay(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         const/16 v1, 0x30
    //         if-lt v0, v1, :cond_0
    //         invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         const/16 v1, 0x39
    //         if-gt v0, v1, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "v"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object p1
    //         :cond_0
    //         iput-object p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->version:Ljava/lang/String;
    //         return-void
    */

    private fun setPath(path: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         const/16 v2, 0x2f
    //         const/4 v1, 0x0
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         if-ne v0, v2, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    //         move-result-object p1
    //         :cond_0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x1
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         if-ne v0, v2, :cond_1
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x1
    //         invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    //         move-result-object p1
    //         :cond_1
    //         iput-object p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->yR:Ljava/lang/String;
    //         return-void
    */

    public fun addParameter(key: String, value: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         iget-object v1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;
    //         invoke-virtual {v1, p1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    */

    public fun addScope(scope: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dv:Ljava/lang/String;
    //         return-object v0
    */

    public fun getApiId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dt:Ljava/lang/String;
    //         return-object v0
    */

    public fun getFullScope(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->getScope()Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v2, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dx:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getHeader(key: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getHeaders(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getHeadersAsMap(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/HashMap;
    //         invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v3, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;
    //         invoke-virtual {v3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public fun getHttpBody(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DA:[B
    //         return-object v0
    */

    public fun getHttpBodyAsJson(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         :try_start_0
    //         new-instance v1, Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DA:[B
    //         const-string v2, "UTF-8"
    //         invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "GoogleAuthApiRequest"
    //         const-string v1, "Unsupported encoding error."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getHttpMethod(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dy:I
    //         return v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->name:Ljava/lang/String;
    //         return-object v0
    */

    public fun getParameters(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getParametersAsMap(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
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
    //                 "Ljava/lang/String;",
    //                 ">;>;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/HashMap;
    //         invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v3, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Du:Landroid/os/Bundle;
    //         invoke-virtual {v3, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v3
    //         invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public fun getPath(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->yR:Ljava/lang/String;
    //         return-object v0
    */

    public fun getScope(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v2, Ljava/lang/StringBuffer;
    //         invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-ge v1, v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dw:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         add-int/lit8 v0, v0, -0x1
    //         if-eq v1, v0, :cond_1
    //         const-string v0, " "
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         :cond_1
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getTimeout(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DB:J
    //         return-wide v0
    */

    public fun getVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->version:Ljava/lang/String;
    //         return-object v0
    */

    public fun putHeader(key: String, value: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dz:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setAccountName(accountName: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->Dv:Ljava/lang/String;
    //         return-void
    */

    public fun setHttpBody(string: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         const-string v0, "UTF-8"
    //         invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DA:[B
    //         :try_end_0
    //         .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "GoogleAuthApiRequest"
    //         const-string v1, "Unsupported encoding error."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public fun setTimeout(timeout: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->DB:J
    //         return-void
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "{ API: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->name:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "/"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->version:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", Scope: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->getFullScope()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", Account: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;->getAccountName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " }"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/api/GoogleAuthApiRequestCreator;->a(Lcom/google/android/gms/auth/api/GoogleAuthApiRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.auth.api.GoogleAuthApiRequestCreator = null!!
    @JvmField public val DEFAULT_SCOPE_PREFIX: String = "oauth2:"
    @JvmField public val HTTP_METHOD_DELETE: Int = 0x3
    @JvmField public val HTTP_METHOD_GET: Int = 0x0
    @JvmField public val HTTP_METHOD_HEAD: Int = 0x4
    @JvmField public val HTTP_METHOD_OPTIONS: Int = 0x5
    @JvmField public val HTTP_METHOD_PATCH: Int = 0x7
    @JvmField public val HTTP_METHOD_POST: Int = 0x1
    @JvmField public val HTTP_METHOD_PUT: Int = 0x2
    @JvmField public val HTTP_METHOD_TRACE: Int = 0x6
    @JvmField public val VERSION_CODE: Int = 0x1
    }
}
