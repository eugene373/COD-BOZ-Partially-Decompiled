package com.google.android.gms.cast

// Auto-emitted from smali.
// 13 fields, 8 methods.

class CastMediaControlIntent {
    private constructor()

    companion object {
    @JvmField public val ACTION_SYNC_STATUS: String = "com.google.android.gms.cast.ACTION_SYNC_STATUS"
    @JvmField public val CATEGORY_CAST: String = "com.google.android.gms.cast.CATEGORY_CAST"
    @JvmField public val DEFAULT_MEDIA_RECEIVER_APPLICATION_ID: String = "CC1AD845"
    @JvmField public val ERROR_CODE_REQUEST_FAILED: Int = 0x1
    @JvmField public val ERROR_CODE_SESSION_START_FAILED: Int = 0x2
    @JvmField public val ERROR_CODE_TEMPORARILY_DISCONNECTED: Int = 0x3
    @JvmField public val EXTRA_CAST_APPLICATION_ID: String = "com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID"
    @JvmField public val EXTRA_CAST_LANGUAGE_CODE: String = "com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE"
    @JvmField public val EXTRA_CAST_RELAUNCH_APPLICATION: String = "com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION"
    @JvmField public val EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS: String = "com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS"
    @JvmField public val EXTRA_CUSTOM_DATA: String = "com.google.android.gms.cast.EXTRA_CUSTOM_DATA"
    @JvmField public val EXTRA_DEBUG_LOGGING_ENABLED: String = "com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED"
    @JvmField public val EXTRA_ERROR_CODE: String = "com.google.android.gms.cast.EXTRA_ERROR_CODE"

    private @JvmStatic fun a(p0: String, p1: String, p2: java.util.Collection): String { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/lang/StringBuffer;
    //         invoke-direct {v1, p0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v2, "[A-F0-9]+"
    //         invoke-virtual {v0, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Invalid application ID: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const-string v2, "/"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         :cond_1
    //         if-eqz p2, :cond_7
    //         invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Must specify at least one namespace"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_3
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v3
    //         if-nez v3, :cond_4
    //         invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v3, ""
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         :cond_4
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Namespaces must not be null or empty"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_5
    //         if-nez p1, :cond_6
    //         const-string v0, "/"
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         :cond_6
    //         const-string v0, "/"
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         move-result-object v0
    //         const-string v2, ","
    //         invoke-static {v2, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         :cond_7
    //         invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun categoryForCast(applicationId: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "applicationId cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.cast.CATEGORY_CAST"
    //         const/4 v1, 0x0
    //         invoke-static {v0, p0, v1}, Lcom/google/android/gms/cast/CastMediaControlIntent;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun categoryForCast(applicationId: String, p1: java.util.Collection): String { return TODO("body: (Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         .local p1, "namespaces":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "applicationId cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         if-nez p1, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "namespaces cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         const-string v0, "com.google.android.gms.cast.CATEGORY_CAST"
    //         invoke-static {v0, p0, p1}, Lcom/google/android/gms/cast/CastMediaControlIntent;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun categoryForCast(p0: java.util.Collection): String { return TODO("body: (Ljava/util/Collection;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;
    //             }
    //         .end annotation
    //         .local p0, "namespaces":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "namespaces cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.cast.CATEGORY_CAST"
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1, p0}, Lcom/google/android/gms/cast/CastMediaControlIntent;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun categoryForRemotePlayback(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         const-string v0, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK"
    //         invoke-static {v0, v1, v1}, Lcom/google/android/gms/cast/CastMediaControlIntent;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun categoryForRemotePlayback(applicationId: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "applicationId cannot be null or empty"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK"
    //         const/4 v1, 0x0
    //         invoke-static {v0, p0, v1}, Lcom/google/android/gms/cast/CastMediaControlIntent;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun languageTagForLocale(locale: java.util.Locale): String { return TODO("body: (Ljava/util/Locale;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/internal/ik;->b(Ljava/util/Locale;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
