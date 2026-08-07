package com.google.android.gms.internal

// Auto-emitted from smali.
// 9 fields, 14 methods.

open class fc: Runnable {
    private val lf: Int
    private val lg: Int
    protected val md: com.google.android.gms.internal.gv
    private val td: android.os.Handler
    private val te: Long
    private var tf: Long
    private var tg: com.google.android.gms.internal.gw.a
    protected var th: Boolean
    protected var ti: Boolean

    public constructor(p0: com.google.android.gms.internal.gw.a, p1: com.google.android.gms.internal.gv, p2: Int, p3: Int)

    public constructor(p0: com.google.android.gms.internal.gw.a, p1: com.google.android.gms.internal.gv, p2: Int, p3: Int, p4: Long, p5: Long)

    public fun a(p0: com.google.android.gms.internal.fk, p1: com.google.android.gms.internal.ha) { /* TODO(body): (Lcom/google/android/gms/internal/fk;Lcom/google/android/gms/internal/ha;)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/gv;->setWebViewClient(Landroid/webkit/WebViewClient;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;
    //         iget-object v1, p1, Lcom/google/android/gms/internal/fk;->rP:Ljava/lang/String;
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         move-object v1, v5
    //         :goto_0
    //         iget-object v2, p1, Lcom/google/android/gms/internal/fk;->tG:Ljava/lang/String;
    //         const-string v3, "text/html"
    //         const-string v4, "UTF-8"
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/gv;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    //         :cond_0
    //         iget-object v1, p1, Lcom/google/android/gms/internal/fk;->rP:Ljava/lang/String;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gj;->L(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         goto :goto_0
    */

    public fun b(p0: com.google.android.gms.internal.fk) { /* TODO(body): (Lcom/google/android/gms/internal/fk;)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/internal/ha;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/fk;->tP:Ljava/lang/String;
    //         invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/internal/ha;-><init>(Lcom/google/android/gms/internal/fc;Lcom/google/android/gms/internal/gv;Ljava/lang/String;)V
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/fc;->a(Lcom/google/android/gms/internal/fk;Lcom/google/android/gms/internal/ha;)V
    //         return-void
    */

    public fun cB(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/fc;->ti:Z
    //         return v0
    */

    public fun cy() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc;->td:Landroid/os/Handler;
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/fc;->te:J
    //         invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         return-void
    */

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fc;->cA()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc;->tg:Lcom/google/android/gms/internal/gw$a;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/gw$a;->a(Lcom/google/android/gms/internal/gv;)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/fc$a;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/fc$a;-><init>(Lcom/google/android/gms/internal/fc;Landroid/webkit/WebView;)V
    //         const/4 v1, 0x0
    //         new-array v1, v1, [Ljava/lang/Void;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/fc$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         goto :goto_0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.fc): Int { return TODO("body: (Lcom/google/android/gms/internal/fc;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/fc;->lf:I
    //         return v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.internal.fc): Int { return TODO("body: (Lcom/google/android/gms/internal/fc;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/fc;->lg:I
    //         return v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.internal.fc): Long { return TODO("body: (Lcom/google/android/gms/internal/fc;)J") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/fc;->tf:J
    //         const-wide/16 v2, 0x1
    //         sub-long/2addr v0, v2
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/fc;->tf:J
    //         return-wide v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.internal.fc): Long { return TODO("body: (Lcom/google/android/gms/internal/fc;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/fc;->tf:J
    //         return-wide v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.internal.fc): com.google.android.gms.internal.gw.a { return TODO("body: (Lcom/google/android/gms/internal/fc;)Lcom/google/android/gms/internal/gw$a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc;->tg:Lcom/google/android/gms/internal/gw$a;
    //         return-object v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.internal.fc): Long { return TODO("body: (Lcom/google/android/gms/internal/fc;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/fc;->te:J
    //         return-wide v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.internal.fc): android.os.Handler { return TODO("body: (Lcom/google/android/gms/internal/fc;)Landroid/os/Handler;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc;->td:Landroid/os/Handler;
    //         return-object v0
    */

    }
}
