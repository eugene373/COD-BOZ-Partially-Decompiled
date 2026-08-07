package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 16 fields, 19 methods.

open class o: com.google.android.gms.common.api.BaseImplementation.AbstractPendingResult() {
    private val IH: android.os.Looper
    private var aoA: com.google.android.gms.tagmanager.o.a
    private val aoc: String
    private var aoh: Long
    private val aoo: com.google.android.gms.tagmanager.TagManager
    private val aor: com.google.android.gms.tagmanager.o.d
    private val aos: com.google.android.gms.tagmanager.cg
    private val aot: Int
    private var aou: com.google.android.gms.tagmanager.o.f
    private var aov: com.google.android.gms.tagmanager.n
    private var aow: Boolean
    private var aox: com.google.android.gms.internal.c.j
    private var aoy: String
    private var aoz: com.google.android.gms.tagmanager.o.e
    private val mContext: android.content.Context
    private val yD: com.google.android.gms.internal.ju

    constructor(p0: android.content.Context, p1: com.google.android.gms.tagmanager.TagManager, p2: android.os.Looper, p3: String, p4: Int, p5: com.google.android.gms.tagmanager.o.f, p6: com.google.android.gms.tagmanager.o.e, p7: com.google.android.gms.internal.ju, p8: com.google.android.gms.tagmanager.cg)

    public constructor(p0: android.content.Context, p1: com.google.android.gms.tagmanager.TagManager, p2: android.os.Looper, p3: String, p4: Int, p5: com.google.android.gms.tagmanager.r)

    private fun T(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 10
    //         const-wide/16 v4, 0x0
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aou:Lcom/google/android/gms/tagmanager/o$f;
    //         new-instance v1, Lcom/google/android/gms/tagmanager/o$b;
    //         invoke-direct {v1, p0, v2}, Lcom/google/android/gms/tagmanager/o$b;-><init>(Lcom/google/android/gms/tagmanager/o;Lcom/google/android/gms/tagmanager/o$1;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/o$f;->a(Lcom/google/android/gms/tagmanager/bg;)V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aoz:Lcom/google/android/gms/tagmanager/o$e;
    //         new-instance v1, Lcom/google/android/gms/tagmanager/o$c;
    //         invoke-direct {v1, p0, v2}, Lcom/google/android/gms/tagmanager/o$c;-><init>(Lcom/google/android/gms/tagmanager/o;Lcom/google/android/gms/tagmanager/o$1;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/o$e;->a(Lcom/google/android/gms/tagmanager/bg;)V
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aou:Lcom/google/android/gms/tagmanager/o$f;
    //         iget v1, p0, Lcom/google/android/gms/tagmanager/o;->aot:I
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/o$f;->ff(I)Lcom/google/android/gms/tagmanager/cr$c;
    //         move-result-object v6
    //         if-eqz v6, :cond_0
    //         new-instance v7, Lcom/google/android/gms/tagmanager/n;
    //         iget-object v8, p0, Lcom/google/android/gms/tagmanager/o;->aoo:Lcom/google/android/gms/tagmanager/TagManager;
    //         iget-object v9, p0, Lcom/google/android/gms/tagmanager/o;->IH:Landroid/os/Looper;
    //         new-instance v0, Lcom/google/android/gms/tagmanager/Container;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/o;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/o;->aoo:Lcom/google/android/gms/tagmanager/TagManager;
    //         invoke-virtual {v2}, Lcom/google/android/gms/tagmanager/TagManager;->getDataLayer()Lcom/google/android/gms/tagmanager/DataLayer;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/tagmanager/o;->aoc:Ljava/lang/String;
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/Container;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/DataLayer;Ljava/lang/String;JLcom/google/android/gms/tagmanager/cr$c;)V
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/o;->aor:Lcom/google/android/gms/tagmanager/o$d;
    //         invoke-direct {v7, v8, v9, v0, v1}, Lcom/google/android/gms/tagmanager/n;-><init>(Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Lcom/google/android/gms/tagmanager/Container;Lcom/google/android/gms/tagmanager/n$a;)V
    //         iput-object v7, p0, Lcom/google/android/gms/tagmanager/o;->aov:Lcom/google/android/gms/tagmanager/n;
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/tagmanager/o$2;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/tagmanager/o$2;-><init>(Lcom/google/android/gms/tagmanager/o;Z)V
    //         iput-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aoA:Lcom/google/android/gms/tagmanager/o$a;
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/o;->oa()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aoz:Lcom/google/android/gms/tagmanager/o$e;
    //         const-string v1, ""
    //         invoke-interface {v0, v4, v5, v1}, Lcom/google/android/gms/tagmanager/o$e;->e(JLjava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aou:Lcom/google/android/gms/tagmanager/o$f;
    //         invoke-interface {v0}, Lcom/google/android/gms/tagmanager/o$f;->oc()V
    //         goto :goto_0
    */

    private fun oa(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/ce;->oJ()Lcom/google/android/gms/tagmanager/ce;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/ce;->oK()Lcom/google/android/gms/tagmanager/ce$a;
    //         move-result-object v1
    //         sget-object v2, Lcom/google/android/gms/tagmanager/ce$a;->aqi:Lcom/google/android/gms/tagmanager/ce$a;
    //         if-eq v1, v2, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/ce;->oK()Lcom/google/android/gms/tagmanager/ce$a;
    //         move-result-object v1
    //         sget-object v2, Lcom/google/android/gms/tagmanager/ce$a;->aqj:Lcom/google/android/gms/tagmanager/ce$a;
    //         if-ne v1, v2, :cond_1
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/o;->aoc:Ljava/lang/String;
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/ce;->getContainerId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    protected fun aE(p0: com.google.android.gms.common.api.Status): com.google.android.gms.tagmanager.ContainerHolder { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/ContainerHolder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aov:Lcom/google/android/gms/tagmanager/n;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aov:Lcom/google/android/gms/tagmanager/n;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/api/Status;->Jy:Lcom/google/android/gms/common/api/Status;
    //         if-ne p1, v0, :cond_1
    //         const-string v0, "timer expired: setting result to failure"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/tagmanager/n;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/tagmanager/n;-><init>(Lcom/google/android/gms/common/api/Status;)V
    //         goto :goto_0
    */

    protected fun c(p0: com.google.android.gms.common.api.Status): com.google.android.gms.common.api.Result { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/o;->aE(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/ContainerHolder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun nX() { /* TODO(body): ()V */ }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aou:Lcom/google/android/gms/tagmanager/o$f;
    //         iget v1, p0, Lcom/google/android/gms/tagmanager/o;->aot:I
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/o$f;->ff(I)Lcom/google/android/gms/tagmanager/cr$c;
    //         move-result-object v6
    //         if-eqz v6, :cond_0
    //         new-instance v0, Lcom/google/android/gms/tagmanager/Container;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/o;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/o;->aoo:Lcom/google/android/gms/tagmanager/TagManager;
    //         invoke-virtual {v2}, Lcom/google/android/gms/tagmanager/TagManager;->getDataLayer()Lcom/google/android/gms/tagmanager/DataLayer;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/tagmanager/o;->aoc:Ljava/lang/String;
    //         const-wide/16 v4, 0x0
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/Container;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/DataLayer;Ljava/lang/String;JLcom/google/android/gms/tagmanager/cr$c;)V
    //         new-instance v1, Lcom/google/android/gms/tagmanager/n;
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/o;->aoo:Lcom/google/android/gms/tagmanager/TagManager;
    //         iget-object v3, p0, Lcom/google/android/gms/tagmanager/o;->IH:Landroid/os/Looper;
    //         new-instance v4, Lcom/google/android/gms/tagmanager/o$1;
    //         invoke-direct {v4, p0}, Lcom/google/android/gms/tagmanager/o$1;-><init>(Lcom/google/android/gms/tagmanager/o;)V
    //         invoke-direct {v1, v2, v3, v0, v4}, Lcom/google/android/gms/tagmanager/n;-><init>(Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Lcom/google/android/gms/tagmanager/Container;Lcom/google/android/gms/tagmanager/n$a;)V
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/tagmanager/o;->b(Lcom/google/android/gms/common/api/Result;)V
    //         :goto_0
    //         iput-object v7, p0, Lcom/google/android/gms/tagmanager/o;->aoz:Lcom/google/android/gms/tagmanager/o$e;
    //         iput-object v7, p0, Lcom/google/android/gms/tagmanager/o;->aou:Lcom/google/android/gms/tagmanager/o$f;
    //         return-void
    //         :cond_0
    //         const-string v0, "Default was requested, but no default container was found"
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         new-instance v1, Lcom/google/android/gms/common/api/Status;
    //         const/16 v2, 0xa
    //         invoke-direct {v1, v2, v0, v7}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/tagmanager/o;->aE(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/tagmanager/ContainerHolder;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/o;->b(Lcom/google/android/gms/common/api/Result;)V
    //         goto :goto_0
    */

    public fun nY() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/o;->T(Z)V
    //         return-void
    */

    public fun nZ() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/o;->T(Z)V
    //         return-void
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.tagmanager.o): com.google.android.gms.internal.ju { return TODO("body: (Lcom/google/android/gms/tagmanager/o;)Lcom/google/android/gms/internal/ju;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->yD:Lcom/google/android/gms/internal/ju;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.tagmanager.o, p1: Long) { /* TODO(body): (Lcom/google/android/gms/tagmanager/o;J)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/tagmanager/o;->w(J)V
    //         return-void
    */

    @JvmStatic fun a(p0: com.google.android.gms.tagmanager.o, p1: com.google.android.gms.internal.c.j) { /* TODO(body): (Lcom/google/android/gms/tagmanager/o;Lcom/google/android/gms/internal/c$j;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/o;->a(Lcom/google/android/gms/internal/c$j;)V
    //         return-void
    */

    @JvmStatic fun a(p0: com.google.android.gms.tagmanager.o, p1: com.google.android.gms.internal.c.j, p2: Long, p3: Boolean) { /* TODO(body): (Lcom/google/android/gms/tagmanager/o;Lcom/google/android/gms/internal/c$j;JZ)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/tagmanager/o;->a(Lcom/google/android/gms/internal/c$j;JZ)V
    //         return-void
    */

    @JvmStatic fun b(p0: com.google.android.gms.tagmanager.o): Boolean { return TODO("body: (Lcom/google/android/gms/tagmanager/o;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/o;->aow:Z
    //         return v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.tagmanager.o): com.google.android.gms.internal.c.j { return TODO("body: (Lcom/google/android/gms/tagmanager/o;)Lcom/google/android/gms/internal/c$j;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aox:Lcom/google/android/gms/internal/c$j;
    //         return-object v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.tagmanager.o): Long { return TODO("body: (Lcom/google/android/gms/tagmanager/o;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/tagmanager/o;->aoh:J
    //         return-wide v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.tagmanager.o): Boolean { return TODO("body: (Lcom/google/android/gms/tagmanager/o;)Z") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/o;->oa()Z
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.tagmanager.o): com.google.android.gms.tagmanager.n { return TODO("body: (Lcom/google/android/gms/tagmanager/o;)Lcom/google/android/gms/tagmanager/n;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aov:Lcom/google/android/gms/tagmanager/n;
    //         return-object v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.tagmanager.o): com.google.android.gms.tagmanager.cg { return TODO("body: (Lcom/google/android/gms/tagmanager/o;)Lcom/google/android/gms/tagmanager/cg;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/o;->aos:Lcom/google/android/gms/tagmanager/cg;
    //         return-object v0
    */

    }
}
