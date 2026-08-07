package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 7 methods.

open class nc: com.google.android.gms.panorama.PanoramaApi {
    public constructor()

    public fun loadPanoramaInfo(client: com.google.android.gms.common.api.GoogleApiClient, uri: android.net.Uri): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/nc$2;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/nc$2;-><init>(Lcom/google/android/gms/internal/nc;Landroid/net/Uri;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadPanoramaInfoAndGrantAccess(client: com.google.android.gms.common.api.GoogleApiClient, uri: android.net.Uri): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/nc$3;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/nc$3;-><init>(Lcom/google/android/gms/internal/nc;Landroid/net/Uri;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private @JvmStatic fun a(p0: android.content.Context, p1: android.net.Uri) { /* TODO(body): (Landroid/content/Context;Landroid/net/Uri;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, p1, v0}, Landroid/content/Context;->revokeUriPermission(Landroid/net/Uri;I)V
    //         return-void
    */

    private @JvmStatic fun a(p0: android.content.Context, p1: com.google.android.gms.internal.nb, p2: com.google.android.gms.internal.na, p3: android.net.Uri, p4: android.os.Bundle) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/internal/nb;Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v1, 0x1
    //         const-string v0, "com.google.android.gms"
    //         invoke-virtual {p0, v0, p3, v1}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V
    //         new-instance v0, Lcom/google/android/gms/internal/nc$4;
    //         invoke-direct {v0, p0, p3, p2}, Lcom/google/android/gms/internal/nc$4;-><init>(Landroid/content/Context;Landroid/net/Uri;Lcom/google/android/gms/internal/na;)V
    //         const/4 v1, 0x1
    //         :try_start_0
    //         invoke-interface {p1, v0, p3, p4, v1}, Lcom/google/android/gms/internal/nb;->a(Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         invoke-static {p0, p3}, Lcom/google/android/gms/internal/nc;->a(Landroid/content/Context;Landroid/net/Uri;)V
    //         throw v0
    //         :catch_1
    //         move-exception v0
    //         invoke-static {p0, p3}, Lcom/google/android/gms/internal/nc;->a(Landroid/content/Context;Landroid/net/Uri;)V
    //         throw v0
    */

    @JvmStatic fun b(p0: android.content.Context, p1: android.net.Uri) { /* TODO(body): (Landroid/content/Context;Landroid/net/Uri;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1}, Lcom/google/android/gms/internal/nc;->a(Landroid/content/Context;Landroid/net/Uri;)V
    //         return-void
    */

    @JvmStatic fun b(p0: android.content.Context, p1: com.google.android.gms.internal.nb, p2: com.google.android.gms.internal.na, p3: android.net.Uri, p4: android.os.Bundle) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/internal/nb;Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/nc;->a(Landroid/content/Context;Lcom/google/android/gms/internal/nb;Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;)V
    //         return-void
    */

    }
}
