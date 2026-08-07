package com.google.android.gms.internal

// Auto-emitted from smali.
// 14 fields, 22 methods.

open class gw: android.webkit.WebViewClient() {
    protected val md: com.google.android.gms.internal.gv
    private val mw: Object
    private var pJ: com.google.android.gms.internal.cb
    private var pL: com.google.android.gms.internal.bz
    private var pM: com.google.android.gms.internal.v
    private var pz: com.google.android.gms.internal.bw
    private var tg: com.google.android.gms.internal.gw.a
    private val wP: java.util.HashMap
    private var wQ: com.google.android.gms.internal.t
    private var wR: com.google.android.gms.internal.dn
    private var wS: Boolean
    private var wT: Boolean
    private var wU: com.google.android.gms.internal.dq
    private val wV: com.google.android.gms.internal.dg

    public constructor(p0: com.google.android.gms.internal.gv, p1: Boolean)

    constructor(p0: com.google.android.gms.internal.gv, p1: Boolean, p2: com.google.android.gms.internal.dg)

    private fun e(p0: android.net.Uri) { /* TODO(body): (Landroid/net/Uri;)V */ }
    /*
    //         .locals 6
    //         invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->wP:Ljava/util/HashMap;
    //         invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/by;
    //         if-eqz v0, :cond_1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/gj;->c(Landroid/net/Uri;)Ljava/util/Map;
    //         move-result-object v2
    //         const/4 v3, 0x2
    //         invoke-static {v3}, Lcom/google/android/gms/internal/gs;->u(I)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Received GMSG: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "  "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         const-string v5, ": "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/by;->a(Lcom/google/android/gms/internal/gv;Ljava/util/Map;)V
    //         :goto_1
    //         return-void
    //         :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "No GMSG handler found for GMSG: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.internal.dj) { /* TODO(body): (Lcom/google/android/gms/internal/dj;)V */ }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->dy()Z
    //         move-result v1
    //         new-instance v0, Lcom/google/android/gms/internal/dm;
    //         if-eqz v1, :cond_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/gv;->Y()Lcom/google/android/gms/internal/ay;
    //         move-result-object v2
    //         iget-boolean v2, v2, Lcom/google/android/gms/internal/ay;->og:Z
    //         if-nez v2, :cond_0
    //         move-object v2, v3
    //         :goto_0
    //         if-eqz v1, :cond_1
    //         :goto_1
    //         iget-object v4, p0, Lcom/google/android/gms/internal/gw;->wU:Lcom/google/android/gms/internal/dq;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->dx()Lcom/google/android/gms/internal/gt;
    //         move-result-object v5
    //         move-object v1, p1
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/dm;-><init>(Lcom/google/android/gms/internal/dj;Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/dq;Lcom/google/android/gms/internal/gt;)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/dm;)V
    //         return-void
    //         :cond_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gw;->wQ:Lcom/google/android/gms/internal/t;
    //         goto :goto_0
    //         :cond_1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/gw;->wR:Lcom/google/android/gms/internal/dn;
    //         goto :goto_1
    */

    protected fun a(p0: com.google.android.gms.internal.dm) { /* TODO(body): (Lcom/google/android/gms/internal/dm;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/dk;->a(Landroid/content/Context;Lcom/google/android/gms/internal/dm;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.gw.a) { /* TODO(body): (Lcom/google/android/gms/internal/gw$a;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/gw;->tg:Lcom/google/android/gms/internal/gw$a;
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.t, p1: com.google.android.gms.internal.dn, p2: com.google.android.gms.internal.bw, p3: com.google.android.gms.internal.dq, p4: Boolean, p5: com.google.android.gms.internal.bz, p6: com.google.android.gms.internal.cb, p7: com.google.android.gms.internal.v) { /* TODO(body): (Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/bw;Lcom/google/android/gms/internal/dq;ZLcom/google/android/gms/internal/bz;Lcom/google/android/gms/internal/cb;Lcom/google/android/gms/internal/v;)V */ }
    /*
    //         .locals 8
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         move v5, p5
    //         move-object v6, p6
    //         move-object/from16 v7, p8
    //         invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/bw;Lcom/google/android/gms/internal/dq;ZLcom/google/android/gms/internal/bz;Lcom/google/android/gms/internal/v;)V
    //         const-string v0, "/setInterstitialProperties"
    //         new-instance v1, Lcom/google/android/gms/internal/ca;
    //         invoke-direct {v1, p7}, Lcom/google/android/gms/internal/ca;-><init>(Lcom/google/android/gms/internal/cb;)V
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         iput-object p7, p0, Lcom/google/android/gms/internal/gw;->pJ:Lcom/google/android/gms/internal/cb;
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.t, p1: com.google.android.gms.internal.dn, p2: com.google.android.gms.internal.bw, p3: com.google.android.gms.internal.dq, p4: Boolean, p5: com.google.android.gms.internal.bz, p6: com.google.android.gms.internal.v) { /* TODO(body): (Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/bw;Lcom/google/android/gms/internal/dq;ZLcom/google/android/gms/internal/bz;Lcom/google/android/gms/internal/v;)V */ }
    /*
    //         .locals 2
    //         if-nez p7, :cond_0
    //         new-instance p7, Lcom/google/android/gms/internal/v;
    //         const/4 v0, 0x0
    //         invoke-direct {p7, v0}, Lcom/google/android/gms/internal/v;-><init>(Z)V
    //         :cond_0
    //         const-string v0, "/appEvent"
    //         new-instance v1, Lcom/google/android/gms/internal/bv;
    //         invoke-direct {v1, p3}, Lcom/google/android/gms/internal/bv;-><init>(Lcom/google/android/gms/internal/bw;)V
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/canOpenURLs"
    //         sget-object v1, Lcom/google/android/gms/internal/bx;->pB:Lcom/google/android/gms/internal/by;
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/click"
    //         sget-object v1, Lcom/google/android/gms/internal/bx;->pC:Lcom/google/android/gms/internal/by;
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/close"
    //         sget-object v1, Lcom/google/android/gms/internal/bx;->pD:Lcom/google/android/gms/internal/by;
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/customClose"
    //         sget-object v1, Lcom/google/android/gms/internal/bx;->pE:Lcom/google/android/gms/internal/by;
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/httpTrack"
    //         sget-object v1, Lcom/google/android/gms/internal/bx;->pF:Lcom/google/android/gms/internal/by;
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/log"
    //         sget-object v1, Lcom/google/android/gms/internal/bx;->pG:Lcom/google/android/gms/internal/by;
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/open"
    //         new-instance v1, Lcom/google/android/gms/internal/cd;
    //         invoke-direct {v1, p6, p7}, Lcom/google/android/gms/internal/cd;-><init>(Lcom/google/android/gms/internal/bz;Lcom/google/android/gms/internal/v;)V
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/touch"
    //         sget-object v1, Lcom/google/android/gms/internal/bx;->pH:Lcom/google/android/gms/internal/by;
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/video"
    //         sget-object v1, Lcom/google/android/gms/internal/bx;->pI:Lcom/google/android/gms/internal/by;
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/mraid"
    //         new-instance v1, Lcom/google/android/gms/internal/cc;
    //         invoke-direct {v1}, Lcom/google/android/gms/internal/cc;-><init>()V
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         iput-object p1, p0, Lcom/google/android/gms/internal/gw;->wQ:Lcom/google/android/gms/internal/t;
    //         iput-object p2, p0, Lcom/google/android/gms/internal/gw;->wR:Lcom/google/android/gms/internal/dn;
    //         iput-object p3, p0, Lcom/google/android/gms/internal/gw;->pz:Lcom/google/android/gms/internal/bw;
    //         iput-object p6, p0, Lcom/google/android/gms/internal/gw;->pL:Lcom/google/android/gms/internal/bz;
    //         iput-object p4, p0, Lcom/google/android/gms/internal/gw;->wU:Lcom/google/android/gms/internal/dq;
    //         iput-object p7, p0, Lcom/google/android/gms/internal/gw;->pM:Lcom/google/android/gms/internal/v;
    //         invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/gw;->y(Z)V
    //         return-void
    */

    public fun a(p0: String, p1: com.google.android.gms.internal.by) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/internal/by;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->wP:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun a(p0: Boolean, p1: Int) { /* TODO(body): (ZI)V */ }
    /*
    //         .locals 8
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->dy()Z
    //         move-result v1
    //         new-instance v0, Lcom/google/android/gms/internal/dm;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->Y()Lcom/google/android/gms/internal/ay;
    //         move-result-object v1
    //         iget-boolean v1, v1, Lcom/google/android/gms/internal/ay;->og:Z
    //         if-nez v1, :cond_0
    //         const/4 v1, 0x0
    //         :goto_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gw;->wR:Lcom/google/android/gms/internal/dn;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/gw;->wU:Lcom/google/android/gms/internal/dq;
    //         iget-object v4, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         iget-object v5, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v5}, Lcom/google/android/gms/internal/gv;->dx()Lcom/google/android/gms/internal/gt;
    //         move-result-object v7
    //         move v5, p1
    //         move v6, p2
    //         invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/dm;-><init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/dq;Lcom/google/android/gms/internal/gv;ZILcom/google/android/gms/internal/gt;)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/dm;)V
    //         return-void
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->wQ:Lcom/google/android/gms/internal/t;
    //         goto :goto_0
    */

    public fun a(p0: Boolean, p1: Int, p2: String) { /* TODO(body): (ZILjava/lang/String;)V */ }
    /*
    //         .locals 11
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->dy()Z
    //         move-result v3
    //         new-instance v0, Lcom/google/android/gms/internal/dm;
    //         if-eqz v3, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->Y()Lcom/google/android/gms/internal/ay;
    //         move-result-object v1
    //         iget-boolean v1, v1, Lcom/google/android/gms/internal/ay;->og:Z
    //         if-nez v1, :cond_0
    //         move-object v1, v2
    //         :goto_0
    //         if-eqz v3, :cond_1
    //         :goto_1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/gw;->pz:Lcom/google/android/gms/internal/bw;
    //         iget-object v4, p0, Lcom/google/android/gms/internal/gw;->wU:Lcom/google/android/gms/internal/dq;
    //         iget-object v5, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         iget-object v6, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v6}, Lcom/google/android/gms/internal/gv;->dx()Lcom/google/android/gms/internal/gt;
    //         move-result-object v9
    //         iget-object v10, p0, Lcom/google/android/gms/internal/gw;->pL:Lcom/google/android/gms/internal/bz;
    //         move v6, p1
    //         move v7, p2
    //         move-object v8, p3
    //         invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/dm;-><init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/bw;Lcom/google/android/gms/internal/dq;Lcom/google/android/gms/internal/gv;ZILjava/lang/String;Lcom/google/android/gms/internal/gt;Lcom/google/android/gms/internal/bz;)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/dm;)V
    //         return-void
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->wQ:Lcom/google/android/gms/internal/t;
    //         goto :goto_0
    //         :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gw;->wR:Lcom/google/android/gms/internal/dn;
    //         goto :goto_1
    */

    public fun a(p0: Boolean, p1: Int, p2: String, p3: String) { /* TODO(body): (ZILjava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 12
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->dy()Z
    //         move-result v2
    //         new-instance v0, Lcom/google/android/gms/internal/dm;
    //         if-eqz v2, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->Y()Lcom/google/android/gms/internal/ay;
    //         move-result-object v1
    //         iget-boolean v1, v1, Lcom/google/android/gms/internal/ay;->og:Z
    //         if-nez v1, :cond_0
    //         const/4 v1, 0x0
    //         :goto_0
    //         if-eqz v2, :cond_1
    //         const/4 v2, 0x0
    //         :goto_1
    //         iget-object v3, p0, Lcom/google/android/gms/internal/gw;->pz:Lcom/google/android/gms/internal/bw;
    //         iget-object v4, p0, Lcom/google/android/gms/internal/gw;->wU:Lcom/google/android/gms/internal/dq;
    //         iget-object v5, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         iget-object v6, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v6}, Lcom/google/android/gms/internal/gv;->dx()Lcom/google/android/gms/internal/gt;
    //         move-result-object v10
    //         iget-object v11, p0, Lcom/google/android/gms/internal/gw;->pL:Lcom/google/android/gms/internal/bz;
    //         move v6, p1
    //         move v7, p2
    //         move-object v8, p3
    //         move-object/from16 v9, p4
    //         invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/dm;-><init>(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/bw;Lcom/google/android/gms/internal/dq;Lcom/google/android/gms/internal/gv;ZILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gt;Lcom/google/android/gms/internal/bz;)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/dm;)V
    //         return-void
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->wQ:Lcom/google/android/gms/internal/t;
    //         goto :goto_0
    //         :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gw;->wR:Lcom/google/android/gms/internal/dn;
    //         goto :goto_1
    */

    public fun bX() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         const/4 v0, 0x0
    //         :try_start_0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/gw;->wS:Z
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/gw;->wT:Z
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->dt()Lcom/google/android/gms/internal/dk;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         sget-object v2, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v3, Lcom/google/android/gms/internal/gw$1;
    //         invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/gw$1;-><init>(Lcom/google/android/gms/internal/gw;Lcom/google/android/gms/internal/dk;)V
    //         invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :cond_0
    //         :goto_0
    //         monitor-exit v1
    //         return-void
    //         :cond_1
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/dk;->bX()V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun dD(): com.google.android.gms.internal.v { return TODO("body: ()Lcom/google/android/gms/internal/v;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->pM:Lcom/google/android/gms/internal/v;
    //         return-object v0
    */

    public fun dE(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gw;->wT:Z
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun dF() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/gw;->dE()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->wV:Lcom/google/android/gms/internal/dg;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/dg;->bP()V
    //         :cond_0
    //         return-void
    */

    public fun onLoadResource(webView: android.webkit.WebView, url: String) { /* TODO(body): (Landroid/webkit/WebView;Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Loading resource: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         const-string v1, "gmsg"
    //         invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const-string v1, "mobileads.google.com"
    //         invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/gw;->e(Landroid/net/Uri;)V
    //         :cond_0
    //         return-void
    */

    public fun onPageFinished(webView: android.webkit.WebView, url: String) { /* TODO(body): (Landroid/webkit/WebView;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->tg:Lcom/google/android/gms/internal/gw$a;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->tg:Lcom/google/android/gms/internal/gw$a;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/gw$a;->a(Lcom/google/android/gms/internal/gv;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gw;->tg:Lcom/google/android/gms/internal/gw$a;
    //         :cond_0
    //         return-void
    */

    public fun reset() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->wP:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gw;->wQ:Lcom/google/android/gms/internal/t;
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gw;->wR:Lcom/google/android/gms/internal/dn;
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gw;->tg:Lcom/google/android/gms/internal/gw$a;
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gw;->pz:Lcom/google/android/gms/internal/bw;
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/gw;->wS:Z
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/gw;->wT:Z
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gw;->pL:Lcom/google/android/gms/internal/bz;
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gw;->wU:Lcom/google/android/gms/internal/dq;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun shouldOverrideUrlLoading(webView: android.webkit.WebView, url: String): Boolean { return TODO("body: (Landroid/webkit/WebView;Ljava/lang/String;)Z") }
    /*
    //         .locals 8
    //         const/4 v3, 0x0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "AdWebView shouldOverrideUrlLoading: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->V(Ljava/lang/String;)V
    //         invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         const-string v1, "gmsg"
    //         invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const-string v1, "mobileads.google.com"
    //         invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/gw;->e(Landroid/net/Uri;)V
    //         :goto_0
    //         const/4 v0, 0x1
    //         :goto_1
    //         return v0
    //         :cond_0
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/gw;->wS:Z
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         if-ne p1, v1, :cond_1
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gw;->d(Landroid/net/Uri;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    //         move-result v0
    //         goto :goto_1
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->willNotDraw()Z
    //         move-result v1
    //         if-nez v1, :cond_5
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->dw()Lcom/google/android/gms/internal/k;
    //         move-result-object v1
    //         if-eqz v1, :cond_2
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/k;->b(Landroid/net/Uri;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gw;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/gv;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/k;->a(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;
    //         :try_end_0
    //         .catch Lcom/google/android/gms/internal/l; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :cond_2
    //         move-object v2, v0
    //         :goto_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->pM:Lcom/google/android/gms/internal/v;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->pM:Lcom/google/android/gms/internal/v;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/v;->av()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         :cond_3
    //         new-instance v0, Lcom/google/android/gms/internal/dj;
    //         const-string v1, "android.intent.action.VIEW"
    //         invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         move-object v4, v3
    //         move-object v5, v3
    //         move-object v6, v3
    //         move-object v7, v3
    //         invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/dj;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/dj;)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unable to append parameter to URL: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         move-object v2, v0
    //         goto :goto_2
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gw;->pM:Lcom/google/android/gms/internal/v;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/v;->d(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_5
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "AdWebView unable to handle URL: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto/16 :goto_0
    */

    public fun y(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/gw;->wS:Z
    //         return-void
    */

    companion object {
    private @JvmStatic fun d(p0: android.net.Uri): Boolean { return TODO("body: (Landroid/net/Uri;)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "http"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, "https"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
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

    }
}
