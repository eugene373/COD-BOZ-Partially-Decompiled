package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 7 methods.

class hz: com.google.android.gms.appindexing.AppIndexApi, com.google.android.gms.internal.hu {
    public constructor()

    public fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Array<com.google.android.gms.internal.hs>): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "[",
    //                 "Lcom/google/android/gms/internal/hs;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/google/android/gms/internal/hd;->BN:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/hy;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/hy;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/internal/hz$2;
    //         invoke-direct {v1, p0, v0, p2}, Lcom/google/android/gms/internal/hz$2;-><init>(Lcom/google/android/gms/internal/hz;Ljava/lang/String;[Lcom/google/android/gms/internal/hs;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun view(apiClient: com.google.android.gms.common.api.GoogleApiClient, activity: android.app.Activity, viewIntent: android.content.Intent, title: String, webUrl: android.net.Uri, p5: java.util.List): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 9
    //         .local p6, "outLinks":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;>;"
    //         sget-object v0, Lcom/google/android/gms/internal/hd;->BN:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/hy;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/hy;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         const/4 v0, 0x1
    //         new-array v7, v0, [Lcom/google/android/gms/internal/hs;
    //         const/4 v8, 0x0
    //         new-instance v0, Lcom/google/android/gms/internal/hs;
    //         const/4 v5, 0x0
    //         move-object v2, p3
    //         move-object v3, p4
    //         move-object v4, p5
    //         move-object v6, p6
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/hs;-><init>(Ljava/lang/String;Landroid/content/Intent;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;)V
    //         aput-object v0, v7, v8
    //         invoke-virtual {p0, p1, v7}, Lcom/google/android/gms/internal/hz;->a(Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun view(apiClient: com.google.android.gms.common.api.GoogleApiClient, activity: android.app.Activity, appIndexingUrl: android.net.Uri, title: String, webUrl: android.net.Uri, p5: java.util.List): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/Activity;Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         .local p6, "outLinks":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/appindexing/AppIndexApi$AppIndexingLink;>;"
    //         sget-object v0, Lcom/google/android/gms/internal/hd;->BN:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/hy;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/hy;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0, p3}, Lcom/google/android/gms/internal/hz;->a(Ljava/lang/String;Landroid/net/Uri;)Landroid/net/Uri;
    //         move-result-object v0
    //         new-instance v3, Landroid/content/Intent;
    //         const-string v1, "android.intent.action.VIEW"
    //         invoke-direct {v3, v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v4, p4
    //         move-object v5, p5
    //         move-object v6, p6
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/hz;->view(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/Activity;Landroid/content/Intent;Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun viewEnd(apiClient: com.google.android.gms.common.api.GoogleApiClient, activity: android.app.Activity, viewIntent: android.content.Intent): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/Activity;Landroid/content/Intent;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 5
    //         sget-object v0, Lcom/google/android/gms/internal/hd;->BN:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/hy;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/hy;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/internal/hs;
    //         invoke-static {v0, p3}, Lcom/google/android/gms/internal/hs;->a(Ljava/lang/String;Landroid/content/Intent;)Lcom/google/android/gms/internal/hg;
    //         move-result-object v0
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         const/4 v4, 0x3
    //         invoke-direct {v1, v0, v2, v3, v4}, Lcom/google/android/gms/internal/hs;-><init>(Lcom/google/android/gms/internal/hg;JI)V
    //         const/4 v0, 0x1
    //         new-array v0, v0, [Lcom/google/android/gms/internal/hs;
    //         const/4 v2, 0x0
    //         aput-object v1, v0, v2
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/hz;->a(Lcom/google/android/gms/common/api/GoogleApiClient;[Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun viewEnd(apiClient: com.google.android.gms.common.api.GoogleApiClient, activity: android.app.Activity, appIndexingUrl: android.net.Uri): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/Activity;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/google/android/gms/internal/hd;->BN:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/hy;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/hy;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0, p3}, Lcom/google/android/gms/internal/hz;->a(Ljava/lang/String;Landroid/net/Uri;)Landroid/net/Uri;
    //         move-result-object v0
    //         new-instance v1, Landroid/content/Intent;
    //         const-string v2, "android.intent.action.VIEW"
    //         invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    //         invoke-virtual {p0, p1, p2, v1}, Lcom/google/android/gms/internal/hz;->viewEnd(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/Activity;Landroid/content/Intent;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    public @JvmStatic fun a(p0: String, p1: android.net.Uri): android.net.Uri { return TODO("body: (Ljava/lang/String;Landroid/net/Uri;)Landroid/net/Uri;") }
    /*
    //         .locals 5
    //         const/4 v4, 0x1
    //         const/4 v3, 0x0
    //         invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "android-app"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Uri scheme must be android-app: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Uri host must match package name: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Uri path must exist: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_3
    //         invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         new-instance v3, Landroid/net/Uri$Builder;
    //         invoke-direct {v3}, Landroid/net/Uri$Builder;-><init>()V
    //         invoke-virtual {v3, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-le v0, v4, :cond_4
    //         invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v3, v0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         const/4 v0, 0x2
    //         move v1, v0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-ge v1, v0, :cond_4
    //         invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v3, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_4
    //         invoke-virtual {p1}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Landroid/net/Uri$Builder;->encodedQuery(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         invoke-virtual {p1}, Landroid/net/Uri;->getEncodedFragment()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Landroid/net/Uri$Builder;->encodedFragment(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         invoke-virtual {v3}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
