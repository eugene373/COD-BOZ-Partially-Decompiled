package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 8 fields, 22 methods.

open class Container {
    private val aoc: String
    private val aod: com.google.android.gms.tagmanager.DataLayer
    private var aoe: com.google.android.gms.tagmanager.ct
    private var aof: java.util.Map
    private var aog: java.util.Map
    private var aoh: Long
    private var aoi: String
    private val mContext: android.content.Context

    constructor(context: android.content.Context, dataLayer: com.google.android.gms.tagmanager.DataLayer, containerId: String, lastRefreshTime: Long, resource: com.google.android.gms.internal.c.j)

    constructor(context: android.content.Context, dataLayer: com.google.android.gms.tagmanager.DataLayer, containerId: String, lastRefreshTime: Long, resource: com.google.android.gms.tagmanager.cr.c)

    private fun a(p0: com.google.android.gms.internal.c.f) { /* TODO(body): (Lcom/google/android/gms/internal/c$f;)V */ }
    /*
    //         .locals 3
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V
    //         throw v0
    //         :cond_0
    //         :try_start_0
    //         invoke-static {p1}, Lcom/google/android/gms/tagmanager/cr;->b(Lcom/google/android/gms/internal/c$f;)Lcom/google/android/gms/tagmanager/cr$c;
    //         :try_end_0
    //         .catch Lcom/google/android/gms/tagmanager/cr$g; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/Container;->a(Lcom/google/android/gms/tagmanager/cr$c;)V
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Not loading resource: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " because it is invalid: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/cr$g;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         goto :goto_0
    */

    private fun a(p0: com.google.android.gms.tagmanager.cr.c) { /* TODO(body): (Lcom/google/android/gms/tagmanager/cr$c;)V */ }
    /*
    //         .locals 7
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/cr$c;->getVersion()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/tagmanager/Container;->aoi:Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/Container;->aoi:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/Container;->cq(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/ag;
    //         move-result-object v6
    //         new-instance v0, Lcom/google/android/gms/tagmanager/ct;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/Container;->mContext:Landroid/content/Context;
    //         iget-object v3, p0, Lcom/google/android/gms/tagmanager/Container;->aod:Lcom/google/android/gms/tagmanager/DataLayer;
    //         new-instance v4, Lcom/google/android/gms/tagmanager/Container$a;
    //         invoke-direct {v4, p0, v2}, Lcom/google/android/gms/tagmanager/Container$a;-><init>(Lcom/google/android/gms/tagmanager/Container;Lcom/google/android/gms/tagmanager/Container$1;)V
    //         new-instance v5, Lcom/google/android/gms/tagmanager/Container$b;
    //         invoke-direct {v5, p0, v2}, Lcom/google/android/gms/tagmanager/Container$b;-><init>(Lcom/google/android/gms/tagmanager/Container;Lcom/google/android/gms/tagmanager/Container$1;)V
    //         move-object v2, p1
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/ct;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/cr$c;Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/tagmanager/s$a;Lcom/google/android/gms/tagmanager/s$a;Lcom/google/android/gms/tagmanager/ag;)V
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/Container;->a(Lcom/google/android/gms/tagmanager/ct;)V
    //         return-void
    */

    private fun a(p0: Array<com.google.android.gms.internal.c.i>) { /* TODO(body): ([Lcom/google/android/gms/internal/c$i;)V */ }
    /*
    //         .locals 4
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         array-length v2, p1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_0
    //         aget-object v3, p1, v0
    //         invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/Container;->nT()Lcom/google/android/gms/tagmanager/ct;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/ct;->k(Ljava/util/List;)V
    //         return-void
    */

    fun cn(p0: String): com.google.android.gms.tagmanager.Container.FunctionCallMacroCallback { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/tagmanager/Container$FunctionCallMacroCallback;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/Container;->aof:Ljava/util/Map;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/Container;->aof:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/tagmanager/Container$FunctionCallMacroCallback;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    fun co(p0: String): com.google.android.gms.tagmanager.Container.FunctionCallTagCallback { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/tagmanager/Container$FunctionCallTagCallback;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/Container;->aog:Ljava/util/Map;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/Container;->aog:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/tagmanager/Container$FunctionCallTagCallback;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    fun cp(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/Container;->nT()Lcom/google/android/gms/tagmanager/ct;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/ct;->cp(Ljava/lang/String;)V
    //         return-void
    */

    fun cq(p0: String): com.google.android.gms.tagmanager.ag { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/tagmanager/ag;") }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/ce;->oJ()Lcom/google/android/gms/tagmanager/ce;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/ce;->oK()Lcom/google/android/gms/tagmanager/ce$a;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/tagmanager/ce$a;->aqj:Lcom/google/android/gms/tagmanager/ce$a;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/ce$a;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/tagmanager/br;
    //         invoke-direct {v0}, Lcom/google/android/gms/tagmanager/br;-><init>()V
    //         return-object v0
    */

    public fun getBoolean(key: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/Container;->nT()Lcom/google/android/gms/tagmanager/ct;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const-string v0, "getBoolean called for closed container."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pH()Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         :try_start_0
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/ct;->cR(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/bz;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bz;->getObject()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->n(Lcom/google/android/gms/internal/d$a;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Calling getBoolean() threw an exception: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " Returning default value."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pH()Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun getContainerId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/Container;->aoc:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDouble(key: String): Double { return TODO("body: (Ljava/lang/String;)D") }
    /*
    //         .locals 3
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/Container;->nT()Lcom/google/android/gms/tagmanager/ct;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const-string v0, "getDouble called for closed container."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pG()Ljava/lang/Double;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D
    //         move-result-wide v0
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         :try_start_0
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/ct;->cR(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/bz;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bz;->getObject()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->m(Lcom/google/android/gms/internal/d$a;)Ljava/lang/Double;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-wide v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Calling getDouble() threw an exception: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " Returning default value."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pG()Ljava/lang/Double;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D
    //         move-result-wide v0
    //         goto :goto_0
    */

    public fun getLastRefreshTime(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/tagmanager/Container;->aoh:J
    //         return-wide v0
    */

    public fun getLong(key: String): Long { return TODO("body: (Ljava/lang/String;)J") }
    /*
    //         .locals 3
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/Container;->nT()Lcom/google/android/gms/tagmanager/ct;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const-string v0, "getLong called for closed container."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pF()Ljava/lang/Long;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v0
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         :try_start_0
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/ct;->cR(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/bz;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bz;->getObject()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->l(Lcom/google/android/gms/internal/d$a;)Ljava/lang/Long;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-wide v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Calling getLong() threw an exception: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " Returning default value."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pF()Ljava/lang/Long;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v0
    //         goto :goto_0
    */

    public fun getString(key: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-direct {p0}, Lcom/google/android/gms/tagmanager/Container;->nT()Lcom/google/android/gms/tagmanager/ct;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const-string v0, "getString called for closed container."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pJ()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/ct;->cR(Ljava/lang/String;)Lcom/google/android/gms/tagmanager/bz;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/bz;->getObject()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->j(Lcom/google/android/gms/internal/d$a;)Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Calling getString() threw an exception: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " Returning default value."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/di;->pJ()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun isDefault(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/Container;->getLastRefreshTime()J
    //         move-result-wide v0
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun nS(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/Container;->aoi:Ljava/lang/String;
    //         return-object v0
    */

    public fun registerFunctionCallMacroCallback(customMacroName: String, customMacroCallback: com.google.android.gms.tagmanager.Container.FunctionCallMacroCallback) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/tagmanager/Container$FunctionCallMacroCallback;)V */ }
    /*
    //         .locals 2
    //         if-nez p2, :cond_0
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         const-string v1, "Macro handler must be non-null"
    //         invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/Container;->aof:Ljava/util/Map;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/Container;->aof:Ljava/util/Map;
    //         invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun registerFunctionCallTagCallback(customTagName: String, customTagCallback: com.google.android.gms.tagmanager.Container.FunctionCallTagCallback) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/tagmanager/Container$FunctionCallTagCallback;)V */ }
    /*
    //         .locals 2
    //         if-nez p2, :cond_0
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         const-string v1, "Tag callback must be non-null"
    //         invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/Container;->aog:Ljava/util/Map;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/Container;->aog:Ljava/util/Map;
    //         invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/tagmanager/Container;->aoe:Lcom/google/android/gms/tagmanager/ct;
    //         return-void
    */

    public fun unregisterFunctionCallMacroCallback(customMacroName: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/Container;->aof:Ljava/util/Map;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/Container;->aof:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun unregisterFunctionCallTagCallback(customTagName: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/Container;->aog:Ljava/util/Map;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/Container;->aog:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
