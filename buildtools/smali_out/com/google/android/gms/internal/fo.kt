package com.google.android.gms.internal

// Auto-emitted from smali.
// 9 fields, 13 methods.

open class fo: java.util.concurrent.Callable {
    private val mContext: android.content.Context
    private val mw: Object
    private val pw: com.google.android.gms.internal.u
    private val tX: com.google.android.gms.internal.go
    private val tY: com.google.android.gms.internal.ai
    private var tZ: Boolean
    private var tc: Int
    private val tn: com.google.android.gms.internal.fz.a
    private var ua: java.util.List

    public constructor(p0: android.content.Context, p1: com.google.android.gms.internal.u, p2: com.google.android.gms.internal.ai, p3: com.google.android.gms.internal.go, p4: com.google.android.gms.internal.fz.a)

    private fun a(p0: com.google.android.gms.internal.ah, p1: com.google.android.gms.internal.fo.a, p2: org.json.JSONObject): com.google.android.gms.internal.bq.a { return TODO("body: (Lcom/google/android/gms/internal/ah;Lcom/google/android/gms/internal/fo$a;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/bq$a;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/util/concurrent/ExecutionException;,
    //                 Ljava/lang/InterruptedException;,
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fo;->cH()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const-string v0, "tracking_urls_and_actions"
    //         invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         const-string v2, "impression_tracking_urls"
    //         invoke-direct {p0, v0, v2}, Lcom/google/android/gms/internal/fo;->b(Lorg/json/JSONObject;Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         move-object v0, v1
    //         :goto_1
    //         iput-object v0, p0, Lcom/google/android/gms/internal/fo;->ua:Ljava/util/List;
    //         invoke-interface {p2, p0, p3}, Lcom/google/android/gms/internal/fo$a;->a(Lcom/google/android/gms/internal/fo;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/bq$a;
    //         move-result-object v0
    //         if-nez v0, :cond_2
    //         const-string v0, "Failed to retrieve ad assets."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->T(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
    //         invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_2
    //         new-instance v1, Lcom/google/android/gms/internal/bq;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fo;->pw:Lcom/google/android/gms/internal/u;
    //         invoke-direct {v1, v2, p1, p3}, Lcom/google/android/gms/internal/bq;-><init>(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/ah;Lorg/json/JSONObject;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bq$a;->a(Lcom/google/android/gms/internal/bq;)V
    //         move-object v1, v0
    //         goto :goto_0
    */

    private fun a(p0: com.google.android.gms.internal.bq.a): com.google.android.gms.internal.fz { return TODO("body: (Lcom/google/android/gms/internal/bq$a;)Lcom/google/android/gms/internal/fz;") }
    /*
    //         .locals 31
    //         move-object/from16 v0, p0
    //         iget-object v3, v0, Lcom/google/android/gms/internal/fo;->mw:Ljava/lang/Object;
    //         monitor-enter v3
    //         :try_start_0
    //         move-object/from16 v0, p0
    //         iget v6, v0, Lcom/google/android/gms/internal/fo;->tc:I
    //         if-nez p1, :cond_0
    //         move-object/from16 v0, p0
    //         iget v2, v0, Lcom/google/android/gms/internal/fo;->tc:I
    //         const/4 v4, -0x2
    //         if-ne v2, v4, :cond_0
    //         const/4 v6, 0x0
    //         :cond_0
    //         monitor-exit v3
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         const/4 v2, -0x2
    //         if-eq v6, v2, :cond_1
    //         const/16 v30, 0x0
    //         :goto_0
    //         new-instance v2, Lcom/google/android/gms/internal/fz;
    //         move-object/from16 v0, p0
    //         iget-object v3, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v3, v3, Lcom/google/android/gms/internal/fz$a;->vv:Lcom/google/android/gms/internal/fi;
    //         iget-object v3, v3, Lcom/google/android/gms/internal/fi;->tx:Lcom/google/android/gms/internal/av;
    //         const/4 v4, 0x0
    //         move-object/from16 v0, p0
    //         iget-object v5, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v5, v5, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;
    //         iget-object v5, v5, Lcom/google/android/gms/internal/fk;->qf:Ljava/util/List;
    //         move-object/from16 v0, p0
    //         iget-object v7, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v7, v7, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;
    //         iget-object v7, v7, Lcom/google/android/gms/internal/fk;->qg:Ljava/util/List;
    //         move-object/from16 v0, p0
    //         iget-object v8, v0, Lcom/google/android/gms/internal/fo;->ua:Ljava/util/List;
    //         move-object/from16 v0, p0
    //         iget-object v9, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v9, v9, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;
    //         iget v9, v9, Lcom/google/android/gms/internal/fk;->orientation:I
    //         move-object/from16 v0, p0
    //         iget-object v10, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v10, v10, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;
    //         iget-wide v10, v10, Lcom/google/android/gms/internal/fk;->qj:J
    //         move-object/from16 v0, p0
    //         iget-object v12, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v12, v12, Lcom/google/android/gms/internal/fz$a;->vv:Lcom/google/android/gms/internal/fi;
    //         iget-object v12, v12, Lcom/google/android/gms/internal/fi;->tA:Ljava/lang/String;
    //         const/4 v13, 0x0
    //         const/4 v14, 0x0
    //         const/4 v15, 0x0
    //         const/16 v16, 0x0
    //         const/16 v17, 0x0
    //         const/16 v18, 0x0
    //         const-wide/16 v19, 0x0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         move-object/from16 v21, v0
    //         move-object/from16 v0, v21
    //         iget-object v0, v0, Lcom/google/android/gms/internal/fz$a;->lH:Lcom/google/android/gms/internal/ay;
    //         move-object/from16 v21, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         move-object/from16 v22, v0
    //         move-object/from16 v0, v22
    //         iget-object v0, v0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;
    //         move-object/from16 v22, v0
    //         move-object/from16 v0, v22
    //         iget-wide v0, v0, Lcom/google/android/gms/internal/fk;->tH:J
    //         move-wide/from16 v22, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         move-object/from16 v24, v0
    //         move-object/from16 v0, v24
    //         iget-wide v0, v0, Lcom/google/android/gms/internal/fz$a;->vs:J
    //         move-wide/from16 v24, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         move-object/from16 v26, v0
    //         move-object/from16 v0, v26
    //         iget-wide v0, v0, Lcom/google/android/gms/internal/fz$a;->vt:J
    //         move-wide/from16 v26, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         move-object/from16 v28, v0
    //         move-object/from16 v0, v28
    //         iget-object v0, v0, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;
    //         move-object/from16 v28, v0
    //         move-object/from16 v0, v28
    //         iget-object v0, v0, Lcom/google/android/gms/internal/fk;->tN:Ljava/lang/String;
    //         move-object/from16 v28, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         move-object/from16 v29, v0
    //         move-object/from16 v0, v29
    //         iget-object v0, v0, Lcom/google/android/gms/internal/fz$a;->vp:Lorg/json/JSONObject;
    //         move-object/from16 v29, v0
    //         invoke-direct/range {v2 .. v30}, Lcom/google/android/gms/internal/fz;-><init>(Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/gv;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/cl;Lcom/google/android/gms/internal/cu;Ljava/lang/String;Lcom/google/android/gms/internal/cm;Lcom/google/android/gms/internal/co;JLcom/google/android/gms/internal/ay;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/bq$a;)V
    //         return-object v2
    //         :catchall_0
    //         move-exception v2
    //         :try_start_1
    //         monitor-exit v3
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v2
    //         :cond_1
    //         move-object/from16 v30, p1
    //         goto/16 :goto_0
    */

    private fun b(p0: org.json.JSONObject, p1: String): Array<String> { return TODO("body: (Lorg/json/JSONObject;Ljava/lang/String;)[Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
    //         move-result v0
    //         new-array v1, v0, [Ljava/lang/String;
    //         const/4 v0, 0x0
    //         :goto_1
    //         invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
    //         move-result v3
    //         if-ge v0, v3, :cond_1
    //         invoke-virtual {v2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         :cond_1
    //         move-object v0, v1
    //         goto :goto_0
    */

    private fun c(p0: com.google.android.gms.internal.ah): org.json.JSONObject { return TODO("body: (Lcom/google/android/gms/internal/ah;)Lorg/json/JSONObject;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/util/concurrent/TimeoutException;,
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fo;->cH()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/gk;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/gk;-><init>()V
    //         const-string v1, "/nativeAdPreProcess"
    //         new-instance v2, Lcom/google/android/gms/internal/fo$1;
    //         invoke-direct {v2, p0, p1, v0}, Lcom/google/android/gms/internal/fo$1;-><init>(Lcom/google/android/gms/internal/fo;Lcom/google/android/gms/internal/ah;Lcom/google/android/gms/internal/gk;)V
    //         invoke-interface {p1, v1, v2}, Lcom/google/android/gms/internal/ah;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         new-instance v1, Lorg/json/JSONObject;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v2, v2, Lcom/google/android/gms/internal/fz$a;->vw:Lcom/google/android/gms/internal/fk;
    //         iget-object v2, v2, Lcom/google/android/gms/internal/fk;->tG:Ljava/lang/String;
    //         invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v2, "google.afma.nativeAds.preProcessJsonGmsg"
    //         invoke-interface {p1, v2, v1}, Lcom/google/android/gms/internal/ah;->a(Ljava/lang/String;Lorg/json/JSONObject;)V
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/gk;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lorg/json/JSONObject;
    //         goto :goto_0
    */

    private fun cG(): com.google.android.gms.internal.ah { return TODO("body: ()Lcom/google/android/gms/internal/ah;") }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/util/concurrent/CancellationException;,
    //                 Ljava/util/concurrent/ExecutionException;,
    //                 Ljava/lang/InterruptedException;,
    //                 Ljava/util/concurrent/TimeoutException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fo;->cH()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fo;->tY:Lcom/google/android/gms/internal/ai;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fo;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fo;->tn:Lcom/google/android/gms/internal/fz$a;
    //         iget-object v2, v2, Lcom/google/android/gms/internal/fz$a;->vv:Lcom/google/android/gms/internal/fi;
    //         iget-object v2, v2, Lcom/google/android/gms/internal/fi;->lD:Lcom/google/android/gms/internal/gt;
    //         const-string v3, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html"
    //         invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ai;->a(Landroid/content/Context;Lcom/google/android/gms/internal/gt;Ljava/lang/String;)Ljava/util/concurrent/Future;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ah;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fo;->pw:Lcom/google/android/gms/internal/u;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fo;->pw:Lcom/google/android/gms/internal/u;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/fo;->pw:Lcom/google/android/gms/internal/u;
    //         iget-object v4, p0, Lcom/google/android/gms/internal/fo;->pw:Lcom/google/android/gms/internal/u;
    //         const/4 v5, 0x0
    //         iget-object v6, p0, Lcom/google/android/gms/internal/fo;->pw:Lcom/google/android/gms/internal/u;
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/internal/ah;->a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/bw;Lcom/google/android/gms/internal/dq;ZLcom/google/android/gms/internal/bz;)V
    //         goto :goto_0
    */

    public fun a(p0: org.json.JSONObject, p1: String, p2: Boolean): java.util.concurrent.Future { return TODO("body: (Lorg/json/JSONObject;Ljava/lang/String;Z)Ljava/util/concurrent/Future;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lorg/json/JSONObject;",
    //                 "Ljava/lang/String;",
    //                 "Z)",
    //                 "Ljava/util/concurrent/Future",
    //                 "<",
    //                 "Landroid/graphics/drawable/Drawable;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         if-eqz p3, :cond_1
    //         invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         :goto_0
    //         if-nez v0, :cond_0
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         :cond_0
    //         if-eqz p3, :cond_2
    //         const-string v1, "url"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_1
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0, p3}, Lcom/google/android/gms/internal/fo;->a(IZ)V
    //         new-instance v0, Lcom/google/android/gms/internal/gl;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gl;-><init>(Ljava/lang/Object;)V
    //         :goto_2
    //         return-object v0
    //         :cond_1
    //         invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         const-string v1, "url"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fo;->tX:Lcom/google/android/gms/internal/go;
    //         new-instance v2, Lcom/google/android/gms/internal/fo$2;
    //         invoke-direct {v2, p0, p3}, Lcom/google/android/gms/internal/fo$2;-><init>(Lcom/google/android/gms/internal/fo;Z)V
    //         invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/go;->a(Ljava/lang/String;Lcom/google/android/gms/internal/go$a;)Ljava/util/concurrent/Future;
    //         move-result-object v0
    //         goto :goto_2
    */

    public fun a(p0: Int, p1: Boolean) { /* TODO(body): (IZ)V */ }
    /*
    //         .locals 0
    //         if-eqz p2, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/fo;->s(I)V
    //         :cond_0
    //         return-void
    */

    protected fun b(p0: org.json.JSONObject): com.google.android.gms.internal.fo.a { return TODO("body: (Lorg/json/JSONObject;)Lcom/google/android/gms/internal/fo$a;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fo;->cH()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v1, "template_id"
    //         invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "2"
    //         invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/fp;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/fp;-><init>()V
    //         goto :goto_0
    //         :cond_1
    //         const-string v2, "1"
    //         invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         new-instance v0, Lcom/google/android/gms/internal/fq;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/fq;-><init>()V
    //         goto :goto_0
    //         :cond_2
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/fo;->s(I)V
    //         goto :goto_0
    */

    public fun cF(): com.google.android.gms.internal.fz { return TODO("body: ()Lcom/google/android/gms/internal/fz;") }
    /*
    //         .locals 3
    //         :try_start_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/fo;->cG()Lcom/google/android/gms/internal/ah;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/fo;->c(Lcom/google/android/gms/internal/ah;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/fo;->b(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/fo$a;
    //         move-result-object v2
    //         invoke-direct {p0, v0, v2, v1}, Lcom/google/android/gms/internal/fo;->a(Lcom/google/android/gms/internal/ah;Lcom/google/android/gms/internal/fo$a;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/bq$a;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/fo;->a(Lcom/google/android/gms/internal/bq$a;)Lcom/google/android/gms/internal/fz;
    //         :try_end_0
    //         .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_4
    //         .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_3
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Malformed native JSON response."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         :goto_1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/fo;->tZ:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/fo;->s(I)V
    //         :cond_0
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/fo;->a(Lcom/google/android/gms/internal/bq$a;)Lcom/google/android/gms/internal/fz;
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         const-string v1, "Timeout when loading native ad."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_1
    //         :catch_2
    //         move-exception v0
    //         goto :goto_1
    //         :catch_3
    //         move-exception v0
    //         goto :goto_1
    //         :catch_4
    //         move-exception v0
    //         goto :goto_1
    */

    public fun cH(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fo;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/fo;->tZ:Z
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun call(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Exception;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fo;->cF()Lcom/google/android/gms/internal/fz;
    //         move-result-object v0
    //         return-object v0
    */

    public fun s(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fo;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         const/4 v0, 0x1
    //         :try_start_0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/fo;->tZ:Z
    //         iput p1, p0, Lcom/google/android/gms/internal/fo;->tc:I
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
