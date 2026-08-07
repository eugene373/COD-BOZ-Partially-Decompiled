package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 2 methods.

open class v_b: com.google.android.gms.internal.v.a {
    private val mc: com.google.android.gms.internal.fz.a
    private val md: com.google.android.gms.internal.gv

    public constructor(p0: com.google.android.gms.internal.fz.a, p1: com.google.android.gms.internal.gv)

    public fun e(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "An auto-clicking creative is blocked"
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         new-instance v0, Landroid/net/Uri$Builder;
    //         invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V
    //         const-string v1, "https"
    //         invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         const-string v1, "//pagead2.googlesyndication.com/pagead/gen_204"
    //         invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         const-string v1, "id"
    //         const-string v2, "gmob-apps-blocked-navigation"
    //         invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, "navigationURL"
    //         invoke-virtual {v0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/v$b;->mc:Lcom/google/android/gms/internal/fz$a;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/v$b;->mc:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/v$b;->mc:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/fk;->tN:Ljava/lang/String;
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         const-string v1, "debugDialog"
    //         iget-object v2, p0, Lcom/google/android/gms/internal/v$b;->mc:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v2, v2, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;
    //         iget-object v2, v2, Lcom/google/android/gms/internal/fk;->tN:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/v$b;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/v$b;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/gv;->dx()Lcom/google/android/gms/internal/gt;
    //         move-result-object v2
    //         iget-object v2, v2, Lcom/google/android/gms/internal/gt;->wD:Ljava/lang/String;
    //         invoke-virtual {v0}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/gj;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

}
