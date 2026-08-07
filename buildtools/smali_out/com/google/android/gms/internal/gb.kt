package com.google.android.gms.internal

// Auto-emitted from smali.
// 22 fields, 34 methods.

open class gb: com.google.android.gms.internal.cf.b {
    private var mContext: android.content.Context
    private val mw: Object
    private var nu: com.google.android.gms.internal.am
    private var nv: com.google.android.gms.internal.al
    private var nw: com.google.android.gms.internal.ey
    private var qs: com.google.android.gms.internal.gt
    private var uH: Boolean
    private var uI: Boolean
    public val vL: String
    private val vM: com.google.android.gms.internal.gc
    private var vN: java.math.BigInteger
    private val vO: java.util.HashSet
    private val vP: java.util.HashMap
    private var vQ: Boolean
    private var vR: Boolean
    private var vS: com.google.android.gms.internal.an
    private var vT: java.util.LinkedList
    private var vU: Boolean
    private var vV: android.os.Bundle
    private var vW: String

    private constructor()

    public fun a(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         const/4 v0, 0x1
    //         :try_start_0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/gb;->vU:Z
    //         iput-object p1, p0, Lcom/google/android/gms/internal/gb;->vV:Landroid/os/Bundle;
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vT:Ljava/util/LinkedList;
    //         invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gb;->mContext:Landroid/content/Context;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vT:Ljava/util/LinkedList;
    //         const/4 v3, 0x0
    //         invoke-virtual {v0, v3}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Thread;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/gb;->qs:Lcom/google/android/gms/internal/gt;
    //         invoke-static {v2, v0, v3}, Lcom/google/android/gms/internal/ey;->a(Landroid/content/Context;Ljava/lang/Thread;Lcom/google/android/gms/internal/gt;)Lcom/google/android/gms/internal/ey;
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.ga) { /* TODO(body): (Lcom/google/android/gms/internal/ga;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vO:Ljava/util/HashSet;
    //         invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun a(p0: String, p1: com.google.android.gms.internal.ge) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/internal/ge;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vP:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun a(p0: Thread) { /* TODO(body): (Ljava/lang/Thread;)V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gb;->vU:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gb;->qs:Lcom/google/android/gms/internal/gt;
    //         invoke-static {v0, p1, v2}, Lcom/google/android/gms/internal/ey;->a(Landroid/content/Context;Ljava/lang/Thread;Lcom/google/android/gms/internal/gt;)Lcom/google/android/gms/internal/ey;
    //         :goto_0
    //         monitor-exit v1
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vT:Ljava/util/LinkedList;
    //         invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun b(p0: android.content.Context, p1: com.google.android.gms.internal.gd, p2: String): android.os.Bundle { return TODO("body: (Landroid/content/Context;Lcom/google/android/gms/internal/gd;Ljava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 6
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v2
    //         :try_start_0
    //         new-instance v3, Landroid/os/Bundle;
    //         invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
    //         const-string v0, "app"
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->vM:Lcom/google/android/gms/internal/gc;
    //         invoke-virtual {v1, p1, p3}, Lcom/google/android/gms/internal/gc;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         new-instance v4, Landroid/os/Bundle;
    //         invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vP:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :goto_0
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->vP:Ljava/util/HashMap;
    //         invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/ge;
    //         invoke-virtual {v1}, Lcom/google/android/gms/internal/ge;->toBundle()Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         const-string v0, "slots"
    //         invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vO:Ljava/util/HashSet;
    //         invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :goto_1
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ga;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ga;->toBundle()Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_1
    //         :cond_1
    //         const-string v0, "ads"
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vO:Ljava/util/HashSet;
    //         invoke-interface {p2, v0}, Lcom/google/android/gms/internal/gd;->a(Ljava/util/HashSet;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vO:Ljava/util/HashSet;
    //         invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-object v3
    */

    public fun b(p0: android.content.Context, p1: com.google.android.gms.internal.gt) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/internal/gt;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gb;->vR:Z
    //         if-nez v0, :cond_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gb;->mContext:Landroid/content/Context;
    //         iput-object p2, p0, Lcom/google/android/gms/internal/gb;->qs:Lcom/google/android/gms/internal/gt;
    //         invoke-static {p1}, Lcom/google/android/gms/internal/gh;->o(Landroid/content/Context;)Z
    //         move-result v0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/gb;->uH:Z
    //         invoke-static {p1}, Lcom/google/android/gms/internal/iv;->H(Landroid/content/Context;)V
    //         invoke-static {p1, p0}, Lcom/google/android/gms/internal/cf;->a(Landroid/content/Context;Lcom/google/android/gms/internal/cf$b;)V
    //         invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gb;->a(Ljava/lang/Thread;)V
    //         iget-object v0, p2, Lcom/google/android/gms/internal/gt;->wD:Ljava/lang/String;
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/gj;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gb;->vW:Ljava/lang/String;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/gb;->vR:Z
    //         :cond_0
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun b(p0: android.content.Context, p1: Boolean) { /* TODO(body): (Landroid/content/Context;Z)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gb;->uH:Z
    //         if-eq p2, v0, :cond_0
    //         iput-boolean p2, p0, Lcom/google/android/gms/internal/gb;->uH:Z
    //         invoke-static {p1, p2}, Lcom/google/android/gms/internal/gh;->a(Landroid/content/Context;Z)V
    //         :cond_0
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun c(p0: java.util.HashSet) { /* TODO(body): (Ljava/util/HashSet;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/HashSet",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/ga;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vO:Ljava/util/HashSet;
    //         invoke-virtual {v0, p1}, Ljava/util/HashSet;->addAll(Ljava/util/Collection;)Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun cV(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gb;->uI:Z
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun cX(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vN:Ljava/math/BigInteger;
    //         invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gb;->vN:Ljava/math/BigInteger;
    //         sget-object v3, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;
    //         invoke-virtual {v2, v3}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/google/android/gms/internal/gb;->vN:Ljava/math/BigInteger;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun cZ(): com.google.android.gms.internal.gc { return TODO("body: ()Lcom/google/android/gms/internal/gc;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vM:Lcom/google/android/gms/internal/gc;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun d(p0: Int, p1: String): String { return TODO("body: (ILjava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->qs:Lcom/google/android/gms/internal/gt;
    //         iget-boolean v0, v0, Lcom/google/android/gms/internal/gt;->wG:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         :goto_0
    //         if-nez v0, :cond_1
    //         :goto_1
    //         return-object p2
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->mContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->getRemoteResource(Landroid/content/Context;)Landroid/content/res/Resources;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object p2
    //         goto :goto_1
    */

    public fun db(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gb;->vQ:Z
    //         const/4 v2, 0x1
    //         iput-boolean v2, p0, Lcom/google/android/gms/internal/gb;->vQ:Z
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun dd(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gb;->uH:Z
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun df(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vW:Ljava/lang/String;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun dg(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vV:Landroid/os/Bundle;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun f(p0: Throwable) { /* TODO(body): (Ljava/lang/Throwable;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/gb;->vR:Z
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/ey;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gb;->qs:Lcom/google/android/gms/internal/gt;
    //         invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/internal/ey;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/gt;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/lang/Thread$UncaughtExceptionHandler;)V
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ey;->b(Ljava/lang/Throwable;)V
    //         :cond_0
    //         return-void
    */

    public fun l(p0: android.content.Context): com.google.android.gms.internal.an { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/internal/an;") }
    /*
    //         .locals 10
    //         const/4 v0, 0x0
    //         invoke-static {}, Lcom/google/android/gms/internal/gb;->bD()Landroid/os/Bundle;
    //         move-result-object v1
    //         sget-object v2, Lcom/google/android/gms/internal/bn;->pd:Lcom/google/android/gms/internal/iv;
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/iv;->getKey()Ljava/lang/String;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-static {}, Lcom/google/android/gms/internal/kc;->hE()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/gb;->cV()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gb;->nu:Lcom/google/android/gms/internal/am;
    //         if-nez v2, :cond_3
    //         instance-of v2, p1, Landroid/app/Activity;
    //         if-nez v2, :cond_2
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_2
    //         :try_start_1
    //         new-instance v2, Lcom/google/android/gms/internal/am;
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/Application;
    //         check-cast p1, Landroid/app/Activity;
    //         invoke-direct {v2, v0, p1}, Lcom/google/android/gms/internal/am;-><init>(Landroid/app/Application;Landroid/app/Activity;)V
    //         iput-object v2, p0, Lcom/google/android/gms/internal/gb;->nu:Lcom/google/android/gms/internal/am;
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->nv:Lcom/google/android/gms/internal/al;
    //         if-nez v0, :cond_4
    //         new-instance v0, Lcom/google/android/gms/internal/al;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/al;-><init>()V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gb;->nv:Lcom/google/android/gms/internal/al;
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vS:Lcom/google/android/gms/internal/an;
    //         if-nez v0, :cond_5
    //         new-instance v0, Lcom/google/android/gms/internal/an;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/gb;->nu:Lcom/google/android/gms/internal/am;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/gb;->nv:Lcom/google/android/gms/internal/al;
    //         iget-object v4, p0, Lcom/google/android/gms/internal/gb;->vV:Landroid/os/Bundle;
    //         new-instance v5, Lcom/google/android/gms/internal/ey;
    //         iget-object v6, p0, Lcom/google/android/gms/internal/gb;->mContext:Landroid/content/Context;
    //         iget-object v7, p0, Lcom/google/android/gms/internal/gb;->qs:Lcom/google/android/gms/internal/gt;
    //         const/4 v8, 0x0
    //         const/4 v9, 0x0
    //         invoke-direct {v5, v6, v7, v8, v9}, Lcom/google/android/gms/internal/ey;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/gt;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/lang/Thread$UncaughtExceptionHandler;)V
    //         invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/internal/an;-><init>(Lcom/google/android/gms/internal/am;Lcom/google/android/gms/internal/al;Landroid/os/Bundle;Lcom/google/android/gms/internal/ey;)V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gb;->vS:Lcom/google/android/gms/internal/an;
    //         :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vS:Lcom/google/android/gms/internal/an;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/an;->aV()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gb;->vS:Lcom/google/android/gms/internal/an;
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    */

    public fun v(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/gb;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/gb;->uI:Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    companion object {
    private val vJ: com.google.android.gms.internal.gb = null!!
    @JvmField public val vK: String = null!!

    public @JvmStatic fun a(p0: android.content.Context, p1: com.google.android.gms.internal.gd, p2: String): android.os.Bundle { return TODO("body: (Landroid/content/Context;Lcom/google/android/gms/internal/gd;Ljava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/internal/gb;->b(Landroid/content/Context;Lcom/google/android/gms/internal/gd;Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun a(p0: android.content.Context, p1: com.google.android.gms.internal.gt) { /* TODO(body): (Landroid/content/Context;Lcom/google/android/gms/internal/gt;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/gb;->b(Landroid/content/Context;Lcom/google/android/gms/internal/gt;)V
    //         return-void
    */

    public @JvmStatic fun a(p0: android.content.Context, p1: Boolean) { /* TODO(body): (Landroid/content/Context;Z)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/gb;->b(Landroid/content/Context;Z)V
    //         return-void
    */

    public @JvmStatic fun b(p0: java.util.HashSet) { /* TODO(body): (Ljava/util/HashSet;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/HashSet",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/ga;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gb;->c(Ljava/util/HashSet;)V
    //         return-void
    */

    public @JvmStatic fun bD(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gb;->dg()Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun c(p0: Int, p1: String): String { return TODO("body: (ILjava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/gb;->d(ILjava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun cU(): com.google.android.gms.internal.gb { return TODO("body: ()Lcom/google/android/gms/internal/gb;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         return-object v0
    */

    public @JvmStatic fun cW(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gb;->cX()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun cY(): com.google.android.gms.internal.gc { return TODO("body: ()Lcom/google/android/gms/internal/gc;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gb;->cZ()Lcom/google/android/gms/internal/gc;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun da(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gb;->db()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun dc(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gb;->dd()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun de(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gb;->df()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun e(p0: Throwable) { /* TODO(body): (Ljava/lang/Throwable;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/gb;->vJ:Lcom/google/android/gms/internal/gb;
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gb;->f(Ljava/lang/Throwable;)V
    //         return-void
    */

    }
}
