package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 7 fields, 16 methods.

open class TagManager {
    private val aod: com.google.android.gms.tagmanager.DataLayer
    private val aqu: com.google.android.gms.tagmanager.r
    private val arK: com.google.android.gms.tagmanager.TagManager.a
    private val arL: com.google.android.gms.tagmanager.cx
    private val arM: java.util.concurrent.ConcurrentMap
    private val mContext: android.content.Context

    constructor(context: android.content.Context, containerHolderLoaderProvider: com.google.android.gms.tagmanager.TagManager.a, dataLayer: com.google.android.gms.tagmanager.DataLayer, serviceManager: com.google.android.gms.tagmanager.cx)

    private fun cT(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->arM:Ljava/util/concurrent/ConcurrentMap;
    //         invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/tagmanager/n;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/n;->cp(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    private fun py() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xe
    //         if-lt v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->mContext:Landroid/content/Context;
    //         new-instance v1, Lcom/google/android/gms/tagmanager/TagManager$3;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/tagmanager/TagManager$3;-><init>(Lcom/google/android/gms/tagmanager/TagManager;)V
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V
    //         :cond_0
    //         return-void
    */

    fun a(p0: com.google.android.gms.tagmanager.n) { /* TODO(body): (Lcom/google/android/gms/tagmanager/n;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->arM:Ljava/util/concurrent/ConcurrentMap;
    //         const/4 v1, 0x1
    //         invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v1
    //         invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    fun b(p0: com.google.android.gms.tagmanager.n): Boolean { return TODO("body: (Lcom/google/android/gms/tagmanager/n;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->arM:Ljava/util/concurrent/ConcurrentMap;
    //         invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun dispatch() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->arL:Lcom/google/android/gms/tagmanager/cx;
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/cx;->dispatch()V
    //         return-void
    */

    public fun getDataLayer(): com.google.android.gms.tagmanager.DataLayer { return TODO("body: ()Lcom/google/android/gms/tagmanager/DataLayer;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->aod:Lcom/google/android/gms/tagmanager/DataLayer;
    //         return-object v0
    */

    public fun loadContainerDefaultOnly(containerId: String, defaultContainerResourceId: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Ljava/lang/String;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->arK:Lcom/google/android/gms/tagmanager/TagManager$a;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/TagManager;->mContext:Landroid/content/Context;
    //         const/4 v3, 0x0
    //         iget-object v6, p0, Lcom/google/android/gms/tagmanager/TagManager;->aqu:Lcom/google/android/gms/tagmanager/r;
    //         move-object v2, p0
    //         move-object v4, p1
    //         move v5, p2
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/TagManager$a;->a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/r;)Lcom/google/android/gms/tagmanager/o;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/o;->nX()V
    //         return-object v0
    */

    public fun loadContainerDefaultOnly(containerId: String, defaultContainerResourceId: Int, handler: android.os.Handler): com.google.android.gms.common.api.PendingResult { return TODO("body: (Ljava/lang/String;ILandroid/os/Handler;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->arK:Lcom/google/android/gms/tagmanager/TagManager$a;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/TagManager;->mContext:Landroid/content/Context;
    //         invoke-virtual {p3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
    //         move-result-object v3
    //         iget-object v6, p0, Lcom/google/android/gms/tagmanager/TagManager;->aqu:Lcom/google/android/gms/tagmanager/r;
    //         move-object v2, p0
    //         move-object v4, p1
    //         move v5, p2
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/TagManager$a;->a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/r;)Lcom/google/android/gms/tagmanager/o;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/o;->nX()V
    //         return-object v0
    */

    public fun loadContainerPreferFresh(containerId: String, defaultContainerResourceId: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Ljava/lang/String;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->arK:Lcom/google/android/gms/tagmanager/TagManager$a;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/TagManager;->mContext:Landroid/content/Context;
    //         const/4 v3, 0x0
    //         iget-object v6, p0, Lcom/google/android/gms/tagmanager/TagManager;->aqu:Lcom/google/android/gms/tagmanager/r;
    //         move-object v2, p0
    //         move-object v4, p1
    //         move v5, p2
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/TagManager$a;->a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/r;)Lcom/google/android/gms/tagmanager/o;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/o;->nZ()V
    //         return-object v0
    */

    public fun loadContainerPreferFresh(containerId: String, defaultContainerResourceId: Int, handler: android.os.Handler): com.google.android.gms.common.api.PendingResult { return TODO("body: (Ljava/lang/String;ILandroid/os/Handler;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->arK:Lcom/google/android/gms/tagmanager/TagManager$a;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/TagManager;->mContext:Landroid/content/Context;
    //         invoke-virtual {p3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
    //         move-result-object v3
    //         iget-object v6, p0, Lcom/google/android/gms/tagmanager/TagManager;->aqu:Lcom/google/android/gms/tagmanager/r;
    //         move-object v2, p0
    //         move-object v4, p1
    //         move v5, p2
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/TagManager$a;->a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/r;)Lcom/google/android/gms/tagmanager/o;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/o;->nZ()V
    //         return-object v0
    */

    public fun loadContainerPreferNonDefault(containerId: String, defaultContainerResourceId: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Ljava/lang/String;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->arK:Lcom/google/android/gms/tagmanager/TagManager$a;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/TagManager;->mContext:Landroid/content/Context;
    //         const/4 v3, 0x0
    //         iget-object v6, p0, Lcom/google/android/gms/tagmanager/TagManager;->aqu:Lcom/google/android/gms/tagmanager/r;
    //         move-object v2, p0
    //         move-object v4, p1
    //         move v5, p2
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/TagManager$a;->a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/r;)Lcom/google/android/gms/tagmanager/o;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/o;->nY()V
    //         return-object v0
    */

    public fun loadContainerPreferNonDefault(containerId: String, defaultContainerResourceId: Int, handler: android.os.Handler): com.google.android.gms.common.api.PendingResult { return TODO("body: (Ljava/lang/String;ILandroid/os/Handler;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager;->arK:Lcom/google/android/gms/tagmanager/TagManager$a;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/TagManager;->mContext:Landroid/content/Context;
    //         invoke-virtual {p3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
    //         move-result-object v3
    //         iget-object v6, p0, Lcom/google/android/gms/tagmanager/TagManager;->aqu:Lcom/google/android/gms/tagmanager/r;
    //         move-object v2, p0
    //         move-object v4, p1
    //         move v5, p2
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/tagmanager/TagManager$a;->a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Ljava/lang/String;ILcom/google/android/gms/tagmanager/r;)Lcom/google/android/gms/tagmanager/o;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/o;->nY()V
    //         return-object v0
    */

    public fun setVerboseLoggingEnabled(enableVerboseLogging: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x2
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->setLogLevel(I)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x5
    //         goto :goto_0
    */

    companion object {
    private var arN: com.google.android.gms.tagmanager.TagManager

    @JvmStatic fun a(p0: com.google.android.gms.tagmanager.TagManager, p1: String) { /* TODO(body): (Lcom/google/android/gms/tagmanager/TagManager;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/TagManager;->cT(Ljava/lang/String;)V
    //         return-void
    */

    public @JvmStatic fun getInstance(context: android.content.Context): com.google.android.gms.tagmanager.TagManager { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/tagmanager/TagManager;") }
    /*
    //         .locals 5
    //         const-class v1, Lcom/google/android/gms/tagmanager/TagManager;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/tagmanager/TagManager;->arN:Lcom/google/android/gms/tagmanager/TagManager;
    //         if-nez v0, :cond_1
    //         if-nez p0, :cond_0
    //         const-string v0, "TagManager.getInstance requires non-null context."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         new-instance v0, Lcom/google/android/gms/tagmanager/TagManager$2;
    //         invoke-direct {v0}, Lcom/google/android/gms/tagmanager/TagManager$2;-><init>()V
    //         new-instance v2, Lcom/google/android/gms/tagmanager/v;
    //         invoke-direct {v2, p0}, Lcom/google/android/gms/tagmanager/v;-><init>(Landroid/content/Context;)V
    //         new-instance v3, Lcom/google/android/gms/tagmanager/TagManager;
    //         new-instance v4, Lcom/google/android/gms/tagmanager/DataLayer;
    //         invoke-direct {v4, v2}, Lcom/google/android/gms/tagmanager/DataLayer;-><init>(Lcom/google/android/gms/tagmanager/DataLayer$c;)V
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/cy;->pw()Lcom/google/android/gms/tagmanager/cy;
    //         move-result-object v2
    //         invoke-direct {v3, p0, v0, v4, v2}, Lcom/google/android/gms/tagmanager/TagManager;-><init>(Landroid/content/Context;Lcom/google/android/gms/tagmanager/TagManager$a;Lcom/google/android/gms/tagmanager/DataLayer;Lcom/google/android/gms/tagmanager/cx;)V
    //         sput-object v3, Lcom/google/android/gms/tagmanager/TagManager;->arN:Lcom/google/android/gms/tagmanager/TagManager;
    //         :cond_1
    //         sget-object v0, Lcom/google/android/gms/tagmanager/TagManager;->arN:Lcom/google/android/gms/tagmanager/TagManager;
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-object v0
    */

    }
}
