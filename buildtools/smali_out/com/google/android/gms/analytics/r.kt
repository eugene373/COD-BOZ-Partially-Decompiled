package com.google.android.gms.analytics

// Auto-emitted from smali.
// 19 fields, 20 methods.

open class r: com.google.android.gms.analytics.af, com.google.android.gms.analytics.c.b, com.google.android.gms.analytics.c.c {
    private val mContext: android.content.Context
    private var yA: Boolean
    private var yB: Boolean
    private var yC: Boolean
    private var yD: com.google.android.gms.internal.ju
    private var yE: Long
    private var yd: com.google.android.gms.analytics.d
    private val ye: com.google.android.gms.analytics.f
    private var yg: Boolean
    private var yq: Long
    private var yr: com.google.android.gms.analytics.r.a
    private var ys: com.google.android.gms.analytics.b
    private var yt: com.google.android.gms.analytics.d
    private val yu: com.google.android.gms.analytics.GoogleAnalytics
    private val yv: java.util.Queue
    private var yw: Int
    private var yx: java.util.Timer
    private var yy: java.util.Timer
    private var yz: java.util.Timer

    constructor(p0: android.content.Context, p1: com.google.android.gms.analytics.f)

    constructor(p0: android.content.Context, p1: com.google.android.gms.analytics.f, p2: com.google.android.gms.analytics.d, p3: com.google.android.gms.analytics.GoogleAnalytics)

    private fun a(p0: java.util.Timer): java.util.Timer { return TODO("body: (Ljava/util/Timer;)Ljava/util/Timer;") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Ljava/util/Timer;->cancel()V
    //         :cond_0
    //         const/4 v0, 0x0
    //         return-object v0
    */

    private fun ef() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yx:Ljava/util/Timer;
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/r;->a(Ljava/util/Timer;)Ljava/util/Timer;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/r;->yx:Ljava/util/Timer;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yy:Ljava/util/Timer;
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/r;->a(Ljava/util/Timer;)Ljava/util/Timer;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/r;->yy:Ljava/util/Timer;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yz:Ljava/util/Timer;
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/r;->a(Ljava/util/Timer;)Ljava/util/Timer;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/r;->yz:Ljava/util/Timer;
    //         return-void
    */

    private fun ei() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yd:Lcom/google/android/gms/analytics/d;
    //         invoke-interface {v0}, Lcom/google/android/gms/analytics/d;->dispatch()V
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/analytics/r;->yg:Z
    //         return-void
    */

    private fun el() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yx:Ljava/util/Timer;
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/r;->a(Ljava/util/Timer;)Ljava/util/Timer;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/r;->yx:Ljava/util/Timer;
    //         new-instance v0, Ljava/util/Timer;
    //         const-string v1, "Service Reconnect"
    //         invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/r;->yx:Ljava/util/Timer;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yx:Ljava/util/Timer;
    //         new-instance v1, Lcom/google/android/gms/analytics/r$e;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, p0, v2}, Lcom/google/android/gms/analytics/r$e;-><init>(Lcom/google/android/gms/analytics/r;Lcom/google/android/gms/analytics/r$1;)V
    //         const-wide/16 v2, 0x1388
    //         invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    //         return-void
    */

    public fun b(p0: java.util.Map, p1: Long, p2: String, p3: java.util.List) { /* TODO(body): (Ljava/util/Map;JLjava/lang/String;Ljava/util/List;)V */ }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;J",
    //                 "Ljava/lang/String;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/hb;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const-string v0, "putHit called"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v6, p0, Lcom/google/android/gms/analytics/r;->yv:Ljava/util/Queue;
    //         new-instance v0, Lcom/google/android/gms/analytics/r$d;
    //         move-object v1, p1
    //         move-wide v2, p2
    //         move-object v4, p4
    //         move-object v5, p5
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/analytics/r$d;-><init>(Ljava/util/Map;JLjava/lang/String;Ljava/util/List;)V
    //         invoke-interface {v6, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    //         invoke-direct {p0}, Lcom/google/android/gms/analytics/r;->eh()V
    //         return-void
    */

    public fun dH() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         const-string v0, "clearHits called"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yv:Ljava/util/Queue;
    //         invoke-interface {v0}, Ljava/util/Queue;->clear()V
    //         sget-object v0, Lcom/google/android/gms/analytics/r$2;->yG:[I
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/r;->yr:Lcom/google/android/gms/analytics/r$a;
    //         invoke-virtual {v1}, Lcom/google/android/gms/analytics/r$a;->ordinal()I
    //         move-result v1
    //         aget v0, v0, v1
    //         packed-switch v0, :pswitch_data_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/analytics/r;->yA:Z
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yd:Lcom/google/android/gms/analytics/d;
    //         const-wide/16 v2, 0x0
    //         invoke-interface {v0, v2, v3}, Lcom/google/android/gms/analytics/d;->l(J)V
    //         iput-boolean v4, p0, Lcom/google/android/gms/analytics/r;->yA:Z
    //         goto :goto_0
    //         :pswitch_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->ys:Lcom/google/android/gms/analytics/b;
    //         invoke-interface {v0}, Lcom/google/android/gms/analytics/b;->dH()V
    //         iput-boolean v4, p0, Lcom/google/android/gms/analytics/r;->yA:Z
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    public fun dispatch() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/analytics/r$2;->yG:[I
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/r;->yr:Lcom/google/android/gms/analytics/r$a;
    //         invoke-virtual {v1}, Lcom/google/android/gms/analytics/r$a;->ordinal()I
    //         move-result v1
    //         aget v0, v0, v1
    //         packed-switch v0, :pswitch_data_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/analytics/r;->yg:Z
    //         :goto_0
    //         :pswitch_0
    //         return-void
    //         :pswitch_1
    //         invoke-direct {p0}, Lcom/google/android/gms/analytics/r;->ei()V
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_1
    //             :pswitch_0
    //         .end packed-switch
    */

    public fun eg() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->ys:Lcom/google/android/gms/analytics/b;
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/analytics/c;
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/r;->mContext:Landroid/content/Context;
    //         invoke-direct {v0, v1, p0, p0}, Lcom/google/android/gms/analytics/c;-><init>(Landroid/content/Context;Lcom/google/android/gms/analytics/c$b;Lcom/google/android/gms/analytics/c$c;)V
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/r;->ys:Lcom/google/android/gms/analytics/b;
    //         invoke-direct {p0}, Lcom/google/android/gms/analytics/r;->ek()V
    //         goto :goto_0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.analytics.r) { /* TODO(body): (Lcom/google/android/gms/analytics/r;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/analytics/r;->eh()V
    //         return-void
    */

    @JvmStatic fun b(p0: com.google.android.gms.analytics.r): com.google.android.gms.analytics.r.a { return TODO("body: (Lcom/google/android/gms/analytics/r;)Lcom/google/android/gms/analytics/r$a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yr:Lcom/google/android/gms/analytics/r$a;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.analytics.r) { /* TODO(body): (Lcom/google/android/gms/analytics/r;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/analytics/r;->ej()V
    //         return-void
    */

    @JvmStatic fun d(p0: com.google.android.gms.analytics.r) { /* TODO(body): (Lcom/google/android/gms/analytics/r;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/analytics/r;->ek()V
    //         return-void
    */

    @JvmStatic fun e(p0: com.google.android.gms.analytics.r): java.util.Queue { return TODO("body: (Lcom/google/android/gms/analytics/r;)Ljava/util/Queue;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yv:Ljava/util/Queue;
    //         return-object v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.analytics.r): Long { return TODO("body: (Lcom/google/android/gms/analytics/r;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/analytics/r;->yq:J
    //         return-wide v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.analytics.r): Long { return TODO("body: (Lcom/google/android/gms/analytics/r;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/analytics/r;->yE:J
    //         return-wide v0
    */

    @JvmStatic fun h(p0: com.google.android.gms.analytics.r): com.google.android.gms.internal.ju { return TODO("body: (Lcom/google/android/gms/analytics/r;)Lcom/google/android/gms/internal/ju;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yD:Lcom/google/android/gms/internal/ju;
    //         return-object v0
    */

    @JvmStatic fun i(p0: com.google.android.gms.analytics.r) { /* TODO(body): (Lcom/google/android/gms/analytics/r;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/analytics/r;->cC()V
    //         return-void
    */

    @JvmStatic fun j(p0: com.google.android.gms.analytics.r): java.util.Timer { return TODO("body: (Lcom/google/android/gms/analytics/r;)Ljava/util/Timer;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r;->yz:Ljava/util/Timer;
    //         return-object v0
    */

    }
}
