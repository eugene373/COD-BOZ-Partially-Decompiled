package com.facebook

// Auto-emitted from smali source: TokenCachingStrategy.java.
// 9 fields, 22 methods.

open class TokenCachingStrategy {
    public constructor()

    public fun clear()

    public fun load(): android.os.Bundle

    public fun save(p0: android.os.Bundle)

    companion object {
    @JvmField public val DECLINED_PERMISSIONS_KEY: String = "com.facebook.TokenCachingStrategy.DeclinedPermissions"
    @JvmField public val EXPIRATION_DATE_KEY: String = "com.facebook.TokenCachingStrategy.ExpirationDate"
    private val INVALID_BUNDLE_MILLISECONDS: Long = 0L
    private val IS_SSO_KEY: String = "com.facebook.TokenCachingStrategy.IsSSO"
    @JvmField public val LAST_REFRESH_DATE_KEY: String = "com.facebook.TokenCachingStrategy.LastRefreshDate"
    @JvmField public val PERMISSIONS_KEY: String = "com.facebook.TokenCachingStrategy.Permissions"
    @JvmField public val TOKEN_KEY: String = "com.facebook.TokenCachingStrategy.Token"
    @JvmField public val TOKEN_SOURCE_KEY: String = "com.facebook.TokenCachingStrategy.AccessTokenSource"
    @JvmField public val USER_FBID_KEY: String = "com.facebook.TokenCachingStrategy.UserFBID"

    @JvmStatic fun getDate(p0: android.os.Bundle, p1: String): java.util.Date { return TODO("body: (Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/Date;") }
    /*
    //         .locals 6
    //         const-wide/high16 v4, -0x8000000000000000L
    //         const/4 v0, 0x0
    //         if-nez p0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         invoke-virtual {p0, p1, v4, v5}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J
    //         move-result-wide v2
    //         cmp-long v1, v2, v4
    //         if-eqz v1, :cond_0
    //         new-instance v0, Ljava/util/Date;
    //         invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V
    //         goto :goto_0
    */

    public @JvmStatic fun getExpirationDate(p0: android.os.Bundle): java.util.Date { return TODO("body: (Landroid/os/Bundle;)Ljava/util/Date;") }
    /*
    //         .locals 1
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.ExpirationDate"
    //         invoke-static {p0, v0}, Lcom/facebook/TokenCachingStrategy;->getDate(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/Date;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getExpirationMilliseconds(p0: android.os.Bundle): Long { return TODO("body: (Landroid/os/Bundle;)J") }
    /*
    //         .locals 2
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.ExpirationDate"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public @JvmStatic fun getLastRefreshDate(p0: android.os.Bundle): java.util.Date { return TODO("body: (Landroid/os/Bundle;)Ljava/util/Date;") }
    /*
    //         .locals 1
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.LastRefreshDate"
    //         invoke-static {p0, v0}, Lcom/facebook/TokenCachingStrategy;->getDate(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/Date;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getLastRefreshMilliseconds(p0: android.os.Bundle): Long { return TODO("body: (Landroid/os/Bundle;)J") }
    /*
    //         .locals 2
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.LastRefreshDate"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public @JvmStatic fun getPermissions(p0: android.os.Bundle): java.util.List { return TODO("body: (Landroid/os/Bundle;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/os/Bundle;",
    //                 ")",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.Permissions"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getSource(p0: android.os.Bundle): com.facebook.AccessTokenSource { return TODO("body: (Landroid/os/Bundle;)Lcom/facebook/AccessTokenSource;") }
    /*
    //         .locals 1
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.AccessTokenSource"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "com.facebook.TokenCachingStrategy.AccessTokenSource"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AccessTokenSource;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.facebook.TokenCachingStrategy.IsSSO"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/facebook/AccessTokenSource;->FACEBOOK_APPLICATION_WEB:Lcom/facebook/AccessTokenSource;
    //         goto :goto_0
    //         :cond_1
    //         sget-object v0, Lcom/facebook/AccessTokenSource;->WEB_VIEW:Lcom/facebook/AccessTokenSource;
    //         goto :goto_0
    */

    public @JvmStatic fun getToken(p0: android.os.Bundle): String { return TODO("body: (Landroid/os/Bundle;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.Token"
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun hasTokenInformation(p0: android.os.Bundle): Boolean { return TODO("body: (Landroid/os/Bundle;)Z") }
    /*
    //         .locals 6
    //         const-wide/16 v4, 0x0
    //         const/4 v0, 0x0
    //         if-nez p0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const-string v1, "com.facebook.TokenCachingStrategy.Token"
    //         invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Ljava/lang/String;->length()I
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const-string v1, "com.facebook.TokenCachingStrategy.ExpirationDate"
    //         invoke-virtual {p0, v1, v4, v5}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J
    //         move-result-wide v2
    //         cmp-long v1, v2, v4
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    @JvmStatic fun putDate(p0: android.os.Bundle, p1: String, p2: java.util.Date) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p2}, Ljava/util/Date;->getTime()J
    //         move-result-wide v0
    //         invoke-virtual {p0, p1, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         return-void
    */

    public @JvmStatic fun putDeclinedPermissions(p0: android.os.Bundle, p1: java.util.List) { /* TODO(body): (Landroid/os/Bundle;Ljava/util/List;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/os/Bundle;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "value"
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         instance-of v0, p1, Ljava/util/ArrayList;
    //         if-eqz v0, :cond_0
    //         check-cast p1, Ljava/util/ArrayList;
    //         :goto_0
    //         const-string v0, "com.facebook.TokenCachingStrategy.DeclinedPermissions"
    //         invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         return-void
    //         :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         move-object p1, v0
    //         goto :goto_0
    */

    public @JvmStatic fun putExpirationDate(p0: android.os.Bundle, p1: java.util.Date) { /* TODO(body): (Landroid/os/Bundle;Ljava/util/Date;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "value"
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.ExpirationDate"
    //         invoke-static {p0, v0, p1}, Lcom/facebook/TokenCachingStrategy;->putDate(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)V
    //         return-void
    */

    public @JvmStatic fun putExpirationMilliseconds(p0: android.os.Bundle, p1: Long) { /* TODO(body): (Landroid/os/Bundle;J)V */ }
    /*
    //         .locals 1
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.ExpirationDate"
    //         invoke-virtual {p0, v0, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         return-void
    */

    public @JvmStatic fun putLastRefreshDate(p0: android.os.Bundle, p1: java.util.Date) { /* TODO(body): (Landroid/os/Bundle;Ljava/util/Date;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "value"
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.LastRefreshDate"
    //         invoke-static {p0, v0, p1}, Lcom/facebook/TokenCachingStrategy;->putDate(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)V
    //         return-void
    */

    public @JvmStatic fun putLastRefreshMilliseconds(p0: android.os.Bundle, p1: Long) { /* TODO(body): (Landroid/os/Bundle;J)V */ }
    /*
    //         .locals 1
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.LastRefreshDate"
    //         invoke-virtual {p0, v0, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         return-void
    */

    public @JvmStatic fun putPermissions(p0: android.os.Bundle, p1: java.util.List) { /* TODO(body): (Landroid/os/Bundle;Ljava/util/List;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/os/Bundle;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "value"
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         instance-of v0, p1, Ljava/util/ArrayList;
    //         if-eqz v0, :cond_0
    //         check-cast p1, Ljava/util/ArrayList;
    //         :goto_0
    //         const-string v0, "com.facebook.TokenCachingStrategy.Permissions"
    //         invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         return-void
    //         :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         move-object p1, v0
    //         goto :goto_0
    */

    public @JvmStatic fun putSource(p0: android.os.Bundle, p1: com.facebook.AccessTokenSource) { /* TODO(body): (Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.AccessTokenSource"
    //         invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
    //         return-void
    */

    public @JvmStatic fun putToken(p0: android.os.Bundle, p1: String) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "bundle"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "value"
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.TokenCachingStrategy.Token"
    //         invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    }
}
