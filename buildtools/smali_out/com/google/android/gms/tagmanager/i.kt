package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 8 fields, 6 methods.

open class i: com.google.android.gms.tagmanager.dg() {
    private val anZ: com.google.android.gms.tagmanager.i.a
    private val mContext: android.content.Context

    public constructor(p0: android.content.Context)

    constructor(p0: android.content.Context, p1: com.google.android.gms.tagmanager.i.a)

    public fun E(p0: java.util.Map) { /* TODO(body): (Ljava/util/Map;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/internal/d$a;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/google/android/gms/tagmanager/i;->anW:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/google/android/gms/tagmanager/i;->anW:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->j(Lcom/google/android/gms/internal/d$a;)Ljava/lang/String;
    //         move-result-object v0
    //         move-object v1, v0
    //         :goto_0
    //         if-eqz v1, :cond_2
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/tagmanager/i;->cj(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         :cond_0
    //         :goto_1
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         move-object v1, v0
    //         goto :goto_0
    //         :cond_2
    //         sget-object v0, Lcom/google/android/gms/tagmanager/i;->URL:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->j(Lcom/google/android/gms/internal/d$a;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;
    //         move-result-object v2
    //         sget-object v0, Lcom/google/android/gms/tagmanager/i;->anV:Ljava/lang/String;
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/d$a;
    //         if-eqz v0, :cond_6
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/di;->o(Lcom/google/android/gms/internal/d$a;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v3, v0, Ljava/util/List;
    //         if-nez v3, :cond_3
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "ArbitraryPixel: additional params not a list: not sending partial hit: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         goto :goto_1
    //         :cond_3
    //         check-cast v0, Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_4
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v4, v0, Ljava/util/Map;
    //         if-nez v4, :cond_5
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "ArbitraryPixel: additional params contains non-map: not sending partial hit: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         goto :goto_1
    //         :cond_5
    //         check-cast v0, Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :goto_2
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v5, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         goto :goto_2
    //         :cond_6
    //         invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/i;->anZ:Lcom/google/android/gms/tagmanager/i$a;
    //         invoke-interface {v2}, Lcom/google/android/gms/tagmanager/i$a;->nO()Lcom/google/android/gms/tagmanager/aq;
    //         move-result-object v2
    //         invoke-interface {v2, v0}, Lcom/google/android/gms/tagmanager/aq;->cz(Ljava/lang/String;)Z
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "ArbitraryPixel: url = "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->V(Ljava/lang/String;)V
    //         if-eqz v1, :cond_0
    //         const-class v2, Lcom/google/android/gms/tagmanager/i;
    //         monitor-enter v2
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/tagmanager/i;->anY:Ljava/util/Set;
    //         invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/i;->mContext:Landroid/content/Context;
    //         sget-object v3, Lcom/google/android/gms/tagmanager/i;->anX:Ljava/lang/String;
    //         const-string v4, "true"
    //         invoke-static {v0, v3, v1, v4}, Lcom/google/android/gms/tagmanager/cz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         monitor-exit v2
    //         goto/16 :goto_1
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    fun ck(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/i;->mContext:Landroid/content/Context;
    //         sget-object v1, Lcom/google/android/gms/tagmanager/i;->anX:Ljava/lang/String;
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    fun cl(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/tagmanager/i;->anY:Ljava/util/Set;
    //         invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    companion object {
    private val ID: String = null!!
    private val URL: String = null!!
    private val anV: String = null!!
    private val anW: String = null!!
    val anX: String = null!!
    private val anY: java.util.Set = null!!
    }
}
