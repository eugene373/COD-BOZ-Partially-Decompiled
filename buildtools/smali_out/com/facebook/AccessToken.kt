package com.facebook

// Auto-emitted from smali source: AccessToken.java.
// 15 fields, 28 methods.

class AccessToken: java.io.Serializable {
    private val declinedPermissions: java.util.List
    private val expires: java.util.Date
    private val lastRefresh: java.util.Date
    private val permissions: java.util.List
    private val source: com.facebook.AccessTokenSource
    private val token: String

    constructor(p0: String, p1: java.util.Date, p2: java.util.List, p3: java.util.List, p4: com.facebook.AccessTokenSource, p5: java.util.Date)

    private fun appendPermissions(p0: StringBuilder) { /* TODO(body): (Ljava/lang/StringBuilder;)V */ }
    /*
    //         .locals 2
    //         const-string v0, " permissions:"
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->permissions:Ljava/util/List;
    //         if-nez v0, :cond_0
    //         const-string v0, "null"
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "["
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v0, ", "
    //         iget-object v1, p0, Lcom/facebook/AccessToken;->permissions:Ljava/util/List;
    //         invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v0, "]"
    //         invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    */

    private fun readObject(p0: java.io.ObjectInputStream) { /* TODO(body): (Ljava/io/ObjectInputStream;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/InvalidObjectException;
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/io/InvalidObjectException;
    //         const-string v1, "Cannot readObject, serialization proxy required"
    //         invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    private fun tokenToString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->token:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const-string v0, "null"
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->INCLUDE_ACCESS_TOKENS:Lcom/facebook/LoggingBehavior;
    //         invoke-static {v0}, Lcom/facebook/Settings;->isLoggingBehaviorEnabled(Lcom/facebook/LoggingBehavior;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->token:Ljava/lang/String;
    //         goto :goto_0
    //         :cond_1
    //         const-string v0, "ACCESS_TOKEN_REMOVED"
    //         goto :goto_0
    */

    private fun writeReplace(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 8
    //         new-instance v0, Lcom/facebook/AccessToken$SerializationProxyV2;
    //         iget-object v1, p0, Lcom/facebook/AccessToken;->token:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/AccessToken;->expires:Ljava/util/Date;
    //         iget-object v3, p0, Lcom/facebook/AccessToken;->permissions:Ljava/util/List;
    //         iget-object v4, p0, Lcom/facebook/AccessToken;->declinedPermissions:Ljava/util/List;
    //         iget-object v5, p0, Lcom/facebook/AccessToken;->source:Lcom/facebook/AccessTokenSource;
    //         iget-object v6, p0, Lcom/facebook/AccessToken;->lastRefresh:Ljava/util/Date;
    //         const/4 v7, 0x0
    //         invoke-direct/range {v0 .. v7}, Lcom/facebook/AccessToken$SerializationProxyV2;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Lcom/facebook/AccessToken$1;)V
    //         return-object v0
    */

    public fun getDeclinedPermissions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->declinedPermissions:Ljava/util/List;
    //         return-object v0
    */

    public fun getExpires(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->expires:Ljava/util/Date;
    //         return-object v0
    */

    public fun getLastRefresh(): java.util.Date { return TODO("body: ()Ljava/util/Date;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->lastRefresh:Ljava/util/Date;
    //         return-object v0
    */

    public fun getPermissions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->permissions:Ljava/util/List;
    //         return-object v0
    */

    public fun getSource(): com.facebook.AccessTokenSource { return TODO("body: ()Lcom/facebook/AccessTokenSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->source:Lcom/facebook/AccessTokenSource;
    //         return-object v0
    */

    public fun getToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->token:Ljava/lang/String;
    //         return-object v0
    */

    fun isInvalid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->token:Ljava/lang/String;
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/util/Date;
    //         invoke-direct {v0}, Ljava/util/Date;-><init>()V
    //         iget-object v1, p0, Lcom/facebook/AccessToken;->expires:Ljava/util/Date;
    //         invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun toCacheBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "com.facebook.TokenCachingStrategy.Token"
    //         iget-object v2, p0, Lcom/facebook/AccessToken;->token:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "com.facebook.TokenCachingStrategy.ExpirationDate"
    //         iget-object v2, p0, Lcom/facebook/AccessToken;->expires:Ljava/util/Date;
    //         invoke-static {v0, v1, v2}, Lcom/facebook/TokenCachingStrategy;->putDate(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)V
    //         const-string v1, "com.facebook.TokenCachingStrategy.Permissions"
    //         new-instance v2, Ljava/util/ArrayList;
    //         iget-object v3, p0, Lcom/facebook/AccessToken;->permissions:Ljava/util/List;
    //         invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         const-string v1, "com.facebook.TokenCachingStrategy.DeclinedPermissions"
    //         new-instance v2, Ljava/util/ArrayList;
    //         iget-object v3, p0, Lcom/facebook/AccessToken;->declinedPermissions:Ljava/util/List;
    //         invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         const-string v1, "com.facebook.TokenCachingStrategy.AccessTokenSource"
    //         iget-object v2, p0, Lcom/facebook/AccessToken;->source:Lcom/facebook/AccessTokenSource;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
    //         const-string v1, "com.facebook.TokenCachingStrategy.LastRefreshDate"
    //         iget-object v2, p0, Lcom/facebook/AccessToken;->lastRefresh:Ljava/util/Date;
    //         invoke-static {v0, v1, v2}, Lcom/facebook/TokenCachingStrategy;->putDate(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)V
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "{AccessToken"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, " token:"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-direct {p0}, Lcom/facebook/AccessToken;->tokenToString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-direct {p0, v0}, Lcom/facebook/AccessToken;->appendPermissions(Ljava/lang/StringBuilder;)V
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    val ACCESS_TOKEN_KEY: String = "access_token"
    private val ALREADY_EXPIRED_EXPIRATION_TIME: java.util.Date = null!!
    private val DEFAULT_ACCESS_TOKEN_SOURCE: com.facebook.AccessTokenSource = null!!
    private val DEFAULT_EXPIRATION_TIME: java.util.Date = null!!
    private val DEFAULT_LAST_REFRESH_TIME: java.util.Date = null!!
    val EXPIRES_IN_KEY: String = "expires_in"
    private val MAX_DATE: java.util.Date = null!!
    private val MIN_DATE: java.util.Date = null!!
    private val serialVersionUID: Long = 0x1L

    @JvmStatic fun createEmptyToken(): com.facebook.AccessToken { return TODO("body: ()Lcom/facebook/AccessToken;") }
    /*
    //         .locals 7
    //         const/4 v3, 0x0
    //         new-instance v0, Lcom/facebook/AccessToken;
    //         const-string v1, ""
    //         sget-object v2, Lcom/facebook/AccessToken;->ALREADY_EXPIRED_EXPIRATION_TIME:Ljava/util/Date;
    //         sget-object v5, Lcom/facebook/AccessTokenSource;->NONE:Lcom/facebook/AccessTokenSource;
    //         sget-object v6, Lcom/facebook/AccessToken;->DEFAULT_LAST_REFRESH_TIME:Ljava/util/Date;
    //         move-object v4, v3
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
    //         return-object v0
    */

    private @JvmStatic fun createFromBundle(p0: java.util.List, p1: android.os.Bundle, p2: com.facebook.AccessTokenSource, p3: java.util.Date): com.facebook.AccessToken { return TODO("body: (Ljava/util/List;Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)Lcom/facebook/AccessToken;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Landroid/os/Bundle;",
    //                 "Lcom/facebook/AccessTokenSource;",
    //                 "Ljava/util/Date;",
    //                 ")",
    //                 "Lcom/facebook/AccessToken;"
    //             }
    //         .end annotation
    //         const/4 v4, 0x0
    //         const-string v0, "access_token"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v0, "expires_in"
    //         invoke-static {p1, v0, p3}, Lcom/facebook/AccessToken;->getBundleLongAsDate(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;
    //         move-result-object v2
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         if-nez v2, :cond_1
    //         :cond_0
    //         move-object v0, v4
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         new-instance v0, Lcom/facebook/AccessToken;
    //         new-instance v6, Ljava/util/Date;
    //         invoke-direct {v6}, Ljava/util/Date;-><init>()V
    //         move-object v3, p0
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
    //         goto :goto_0
    */

    @JvmStatic fun createFromCache(p0: android.os.Bundle): com.facebook.AccessToken { return TODO("body: (Landroid/os/Bundle;)Lcom/facebook/AccessToken;") }
    /*
    //         .locals 7
    //         const-string v0, "com.facebook.TokenCachingStrategy.Permissions"
    //         invoke-static {p0, v0}, Lcom/facebook/AccessToken;->getPermissionsFromBundle(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;
    //         move-result-object v3
    //         const-string v0, "com.facebook.TokenCachingStrategy.DeclinedPermissions"
    //         invoke-static {p0, v0}, Lcom/facebook/AccessToken;->getPermissionsFromBundle(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;
    //         move-result-object v4
    //         new-instance v0, Lcom/facebook/AccessToken;
    //         const-string v1, "com.facebook.TokenCachingStrategy.Token"
    //         invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "com.facebook.TokenCachingStrategy.ExpirationDate"
    //         invoke-static {p0, v2}, Lcom/facebook/TokenCachingStrategy;->getDate(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/Date;
    //         move-result-object v2
    //         invoke-static {p0}, Lcom/facebook/TokenCachingStrategy;->getSource(Landroid/os/Bundle;)Lcom/facebook/AccessTokenSource;
    //         move-result-object v5
    //         const-string v6, "com.facebook.TokenCachingStrategy.LastRefreshDate"
    //         invoke-static {p0, v6}, Lcom/facebook/TokenCachingStrategy;->getDate(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/Date;
    //         move-result-object v6
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
    //         return-object v0
    */

    public @JvmStatic fun createFromExistingAccessToken(p0: String, p1: java.util.Date, p2: java.util.Date, p3: com.facebook.AccessTokenSource, p4: java.util.List): com.facebook.AccessToken { return TODO("body: (Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/facebook/AccessTokenSource;Ljava/util/List;)Lcom/facebook/AccessToken;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Date;",
    //                 "Ljava/util/Date;",
    //                 "Lcom/facebook/AccessTokenSource;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/facebook/AccessToken;"
    //             }
    //         .end annotation
    //         if-nez p1, :cond_2
    //         sget-object v2, Lcom/facebook/AccessToken;->DEFAULT_EXPIRATION_TIME:Ljava/util/Date;
    //         :goto_0
    //         if-nez p2, :cond_1
    //         sget-object v6, Lcom/facebook/AccessToken;->DEFAULT_LAST_REFRESH_TIME:Ljava/util/Date;
    //         :goto_1
    //         if-nez p3, :cond_0
    //         sget-object v5, Lcom/facebook/AccessToken;->DEFAULT_ACCESS_TOKEN_SOURCE:Lcom/facebook/AccessTokenSource;
    //         :goto_2
    //         new-instance v0, Lcom/facebook/AccessToken;
    //         const/4 v4, 0x0
    //         move-object v1, p0
    //         move-object v3, p4
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
    //         return-object v0
    //         :cond_0
    //         move-object v5, p3
    //         goto :goto_2
    //         :cond_1
    //         move-object v6, p2
    //         goto :goto_1
    //         :cond_2
    //         move-object v2, p1
    //         goto :goto_0
    */

    public @JvmStatic fun createFromNativeLinkingIntent(p0: android.content.Intent): com.facebook.AccessToken { return TODO("body: (Landroid/content/Intent;)Lcom/facebook/AccessToken;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         const-string v1, "intent"
    //         invoke-static {p0, v1}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v1
    //         sget-object v2, Lcom/facebook/AccessTokenSource;->FACEBOOK_APPLICATION_WEB:Lcom/facebook/AccessTokenSource;
    //         new-instance v3, Ljava/util/Date;
    //         invoke-direct {v3}, Ljava/util/Date;-><init>()V
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/AccessToken;->createFromBundle(Ljava/util/List;Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         goto :goto_0
    */

    @JvmStatic fun createFromNativeLogin(p0: android.os.Bundle, p1: com.facebook.AccessTokenSource): com.facebook.AccessToken { return TODO("body: (Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;") }
    /*
    //         .locals 4
    //         const-string v0, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH"
    //         new-instance v1, Ljava/util/Date;
    //         const-wide/16 v2, 0x0
    //         invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V
    //         invoke-static {p0, v0, v1}, Lcom/facebook/AccessToken;->getBundleLongAsDate(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;
    //         move-result-object v0
    //         const-string v1, "com.facebook.platform.extra.PERMISSIONS"
    //         invoke-virtual {p0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v1
    //         const-string v2, "com.facebook.platform.extra.ACCESS_TOKEN"
    //         invoke-virtual {p0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         invoke-static {v1, v3, v2, v0, p1}, Lcom/facebook/AccessToken;->createNew(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun createFromRefresh(p0: com.facebook.AccessToken, p1: android.os.Bundle): com.facebook.AccessToken { return TODO("body: (Lcom/facebook/AccessToken;Landroid/os/Bundle;)Lcom/facebook/AccessToken;") }
    /*
    //         .locals 5
    //         .annotation build Landroid/annotation/SuppressLint;
    //             value = {
    //                 "FieldGetter"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->source:Lcom/facebook/AccessTokenSource;
    //         sget-object v1, Lcom/facebook/AccessTokenSource;->FACEBOOK_APPLICATION_WEB:Lcom/facebook/AccessTokenSource;
    //         if-eq v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->source:Lcom/facebook/AccessTokenSource;
    //         sget-object v1, Lcom/facebook/AccessTokenSource;->FACEBOOK_APPLICATION_NATIVE:Lcom/facebook/AccessTokenSource;
    //         if-eq v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/AccessToken;->source:Lcom/facebook/AccessTokenSource;
    //         sget-object v1, Lcom/facebook/AccessTokenSource;->FACEBOOK_APPLICATION_SERVICE:Lcom/facebook/AccessTokenSource;
    //         if-eq v0, v1, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Invalid token source: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/facebook/AccessToken;->source:Lcom/facebook/AccessTokenSource;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const-string v0, "expires_in"
    //         new-instance v1, Ljava/util/Date;
    //         const-wide/16 v2, 0x0
    //         invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V
    //         invoke-static {p1, v0, v1}, Lcom/facebook/AccessToken;->getBundleLongAsDate(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;
    //         move-result-object v0
    //         const-string v1, "access_token"
    //         invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/facebook/AccessToken;->getPermissions()Ljava/util/List;
    //         move-result-object v2
    //         invoke-virtual {p0}, Lcom/facebook/AccessToken;->getDeclinedPermissions()Ljava/util/List;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/facebook/AccessToken;->source:Lcom/facebook/AccessTokenSource;
    //         invoke-static {v2, v3, v1, v0, v4}, Lcom/facebook/AccessToken;->createNew(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun createFromString(p0: String, p1: java.util.List, p2: com.facebook.AccessTokenSource): com.facebook.AccessToken { return TODO("body: (Ljava/lang/String;Ljava/util/List;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Lcom/facebook/AccessTokenSource;",
    //                 ")",
    //                 "Lcom/facebook/AccessToken;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/AccessToken;
    //         sget-object v2, Lcom/facebook/AccessToken;->DEFAULT_EXPIRATION_TIME:Ljava/util/Date;
    //         const/4 v4, 0x0
    //         sget-object v6, Lcom/facebook/AccessToken;->DEFAULT_LAST_REFRESH_TIME:Ljava/util/Date;
    //         move-object v1, p0
    //         move-object v3, p1
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
    //         return-object v0
    */

    @JvmStatic fun createFromTokenWithRefreshedPermissions(p0: com.facebook.AccessToken, p1: java.util.List, p2: java.util.List): com.facebook.AccessToken { return TODO("body: (Lcom/facebook/AccessToken;Ljava/util/List;Ljava/util/List;)Lcom/facebook/AccessToken;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/AccessToken;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/facebook/AccessToken;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/facebook/AccessToken;
    //         iget-object v1, p0, Lcom/facebook/AccessToken;->token:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/AccessToken;->expires:Ljava/util/Date;
    //         iget-object v5, p0, Lcom/facebook/AccessToken;->source:Lcom/facebook/AccessTokenSource;
    //         iget-object v6, p0, Lcom/facebook/AccessToken;->lastRefresh:Ljava/util/Date;
    //         move-object v3, p1
    //         move-object v4, p2
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
    //         return-object v0
    */

    @JvmStatic fun createFromWebBundle(p0: java.util.List, p1: android.os.Bundle, p2: com.facebook.AccessTokenSource): com.facebook.AccessToken { return TODO("body: (Ljava/util/List;Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Landroid/os/Bundle;",
    //                 "Lcom/facebook/AccessTokenSource;",
    //                 ")",
    //                 "Lcom/facebook/AccessToken;"
    //             }
    //         .end annotation
    //         const-string v0, "expires_in"
    //         new-instance v1, Ljava/util/Date;
    //         invoke-direct {v1}, Ljava/util/Date;-><init>()V
    //         invoke-static {p1, v0, v1}, Lcom/facebook/AccessToken;->getBundleLongAsDate(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;
    //         move-result-object v1
    //         const-string v0, "access_token"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v0, "granted_scopes"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v3
    //         if-nez v3, :cond_0
    //         new-instance p0, Ljava/util/ArrayList;
    //         const-string v3, ","
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         :cond_0
    //         const-string v0, "denied_scopes"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const/4 v0, 0x0
    //         invoke-static {v3}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v4
    //         if-nez v4, :cond_1
    //         new-instance v0, Ljava/util/ArrayList;
    //         const-string v4, ","
    //         invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v3
    //         invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         :cond_1
    //         invoke-static {p0, v0, v2, v1, p2}, Lcom/facebook/AccessToken;->createNew(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun createNew(p0: java.util.List, p1: java.util.List, p2: String, p3: java.util.Date, p4: com.facebook.AccessTokenSource): com.facebook.AccessToken { return TODO("body: (Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;Lcom/facebook/AccessTokenSource;)Lcom/facebook/AccessToken;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Date;",
    //                 "Lcom/facebook/AccessTokenSource;",
    //                 ")",
    //                 "Lcom/facebook/AccessToken;"
    //             }
    //         .end annotation
    //         invoke-static {p2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         if-nez p3, :cond_1
    //         :cond_0
    //         invoke-static {}, Lcom/facebook/AccessToken;->createEmptyToken()Lcom/facebook/AccessToken;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         new-instance v0, Lcom/facebook/AccessToken;
    //         new-instance v6, Ljava/util/Date;
    //         invoke-direct {v6}, Ljava/util/Date;-><init>()V
    //         move-object v1, p2
    //         move-object v2, p3
    //         move-object v3, p0
    //         move-object v4, p1
    //         move-object v5, p4
    //         invoke-direct/range {v0 .. v6}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Lcom/facebook/AccessTokenSource;Ljava/util/Date;)V
    //         goto :goto_0
    */

    private @JvmStatic fun getBundleLongAsDate(p0: android.os.Bundle, p1: String, p2: java.util.Date): java.util.Date { return TODO("body: (Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;") }
    /*
    //         .locals 8
    //         const/4 v1, 0x0
    //         if-nez p0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0, p1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v2, v0, Ljava/lang/Long;
    //         if-eqz v2, :cond_1
    //         check-cast v0, Ljava/lang/Long;
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v0
    //         move-wide v2, v0
    //         :goto_1
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, v2, v0
    //         if-nez v0, :cond_3
    //         new-instance v0, Ljava/util/Date;
    //         const-wide v2, 0x7fffffffffffffffL
    //         invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V
    //         goto :goto_0
    //         :cond_1
    //         instance-of v2, v0, Ljava/lang/String;
    //         if-eqz v2, :cond_2
    //         :try_start_0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    //         :try_end_0
    //         .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-wide v0
    //         move-wide v2, v0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_3
    //         new-instance v0, Ljava/util/Date;
    //         invoke-virtual {p2}, Ljava/util/Date;->getTime()J
    //         move-result-wide v4
    //         const-wide/16 v6, 0x3e8
    //         mul-long/2addr v2, v6
    //         add-long/2addr v2, v4
    //         invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V
    //         goto :goto_0
    */

    @JvmStatic fun getPermissionsFromBundle(p0: android.os.Bundle, p1: String): java.util.List { return TODO("body: (Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/os/Bundle;",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    //         move-result-object v0
    //         goto :goto_0
    */

    }
}
