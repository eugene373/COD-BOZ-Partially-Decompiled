package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 12 methods.

open class aj: com.google.android.gms.internal.ah {
    private val md: com.google.android.gms.internal.gv

    public constructor(p0: android.content.Context, p1: com.google.android.gms.internal.gt)

    private fun runOnUiThread(runnable: Runnable) { /* TODO(body): (Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.internal.ah.a) { /* TODO(body): (Lcom/google/android/gms/internal/ah$a;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/internal/aj$3;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/aj$3;-><init>(Lcom/google/android/gms/internal/aj;Lcom/google/android/gms/internal/ah$a;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/gw$a;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.t, p1: com.google.android.gms.internal.dn, p2: com.google.android.gms.internal.bw, p3: com.google.android.gms.internal.dq, p4: Boolean, p5: com.google.android.gms.internal.bz) { /* TODO(body): (Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/bw;Lcom/google/android/gms/internal/dq;ZLcom/google/android/gms/internal/bz;)V */ }
    /*
    //         .locals 8
    //         iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v0
    //         new-instance v7, Lcom/google/android/gms/internal/v;
    //         const/4 v1, 0x0
    //         invoke-direct {v7, v1}, Lcom/google/android/gms/internal/v;-><init>(Z)V
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         move v5, p5
    //         move-object v6, p6
    //         invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/bw;Lcom/google/android/gms/internal/dq;ZLcom/google/android/gms/internal/bz;Lcom/google/android/gms/internal/v;)V
    //         return-void
    */

    public fun a(p0: String, p1: com.google.android.gms.internal.by) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/internal/by;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v0
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         return-void
    */

    public fun a(p0: String, p1: org.json.JSONObject) { /* TODO(body): (Ljava/lang/String;Lorg/json/JSONObject;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/aj$1;
    //         invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/aj$1;-><init>(Lcom/google/android/gms/internal/aj;Ljava/lang/String;Lorg/json/JSONObject;)V
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aj;->runOnUiThread(Ljava/lang/Runnable;)V
    //         return-void
    */

    public fun destroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->destroy()V
    //         return-void
    */

    public fun f(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/aj$2;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/aj$2;-><init>(Lcom/google/android/gms/internal/aj;Ljava/lang/String;)V
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aj;->runOnUiThread(Ljava/lang/Runnable;)V
    //         return-void
    */

    public fun g(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         return-void
    */

    public fun pause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gj;->a(Landroid/webkit/WebView;)V
    //         return-void
    */

    public fun resume() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gj;->b(Landroid/webkit/WebView;)V
    //         return-void
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.aj): com.google.android.gms.internal.gv { return TODO("body: (Lcom/google/android/gms/internal/aj;)Lcom/google/android/gms/internal/gv;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;
    //         return-object v0
    */

    }
}
