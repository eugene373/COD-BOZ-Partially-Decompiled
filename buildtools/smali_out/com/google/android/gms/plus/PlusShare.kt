package com.google.android.gms.plus

// Auto-emitted from smali.
// 13 fields, 5 methods.

class PlusShare {
    protected constructor()

    companion object {
    @JvmField public val EXTRA_CALL_TO_ACTION: String = "com.google.android.apps.plus.CALL_TO_ACTION"
    @JvmField public val EXTRA_CONTENT_DEEP_LINK_ID: String = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"
    @JvmField public val EXTRA_CONTENT_DEEP_LINK_METADATA: String = "com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA"
    @JvmField public val EXTRA_CONTENT_URL: String = "com.google.android.apps.plus.CONTENT_URL"
    @JvmField public val EXTRA_IS_INTERACTIVE_POST: String = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST"
    @JvmField public val EXTRA_SENDER_ID: String = "com.google.android.apps.plus.SENDER_ID"
    @JvmField public val KEY_CALL_TO_ACTION_DEEP_LINK_ID: String = "deepLinkId"
    @JvmField public val KEY_CALL_TO_ACTION_LABEL: String = "label"
    @JvmField public val KEY_CALL_TO_ACTION_URL: String = "url"
    @JvmField public val KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION: String = "description"
    @JvmField public val KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL: String = "thumbnailUrl"
    @JvmField public val KEY_CONTENT_DEEP_LINK_METADATA_TITLE: String = "title"
    @JvmField public val PARAM_CONTENT_DEEP_LINK_ID: String = "deep_link_id"

    public @JvmStatic fun a(p0: String, p1: String, p2: android.net.Uri): android.os.Bundle { return TODO("body: (Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Landroid/os/Bundle;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "title"
    //         invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "description"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         if-eqz p2, :cond_0
    //         const-string v1, "thumbnailUrl"
    //         invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         return-object v0
    */

    protected @JvmStatic fun cd(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const-string v1, "GooglePlusPlatform"
    //         const-string v2, "The provided deep-link ID is empty."
    //         invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v1, " "
    //         invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         const-string v1, "GooglePlusPlatform"
    //         const-string v2, "Spaces are not allowed in deep-link IDs."
    //         invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public @JvmStatic fun createPerson(id: String, displayName: String): com.google.android.gms.plus.model.people.Person { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/plus/model/people/Person;") }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "MinimalPerson ID must not be empty."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Display name must not be empty."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/nz;
    //         const/4 v4, 0x0
    //         move-object v1, p1
    //         move-object v2, p0
    //         move-object v5, v3
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/nz;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/nz$c;ILjava/lang/String;)V
    //         return-object v0
    */

    public @JvmStatic fun getDeepLinkId(intent: android.content.Intent): String { return TODO("body: (Landroid/content/Intent;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         if-eqz p0, :cond_0
    //         invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v0
    //         const-string v1, "deep_link_id"
    //         invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         return-object v0
    */

    }
}
