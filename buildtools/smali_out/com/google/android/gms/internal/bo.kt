package com.google.android.gms.internal

// Auto-emitted from smali.
// 10 fields, 12 methods.

open class bo: com.google.android.gms.internal.br.a(), com.google.android.gms.internal.bq.a {
    private val mw: Object
    private val pl: String
    private val pm: android.graphics.drawable.Drawable
    private val pn: String
    private val po: android.graphics.drawable.Drawable
    private val pp: String
    private val pq: Double
    private val pr: String
    private val ps: String
    private var pt: com.google.android.gms.internal.bq

    public constructor(p0: String, p1: android.graphics.drawable.Drawable, p2: String, p3: android.graphics.drawable.Drawable, p4: String, p5: Double, p6: String, p7: String)

    public fun a(p0: com.google.android.gms.internal.bq) { /* TODO(body): (Lcom/google/android/gms/internal/bq;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bo;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/bo;->pt:Lcom/google/android/gms/internal/bq;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun as() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bo;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pt:Lcom/google/android/gms/internal/bq;
    //         if-nez v0, :cond_0
    //         const-string v0, "Attempt to record impression before app install ad initialized."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->T(Ljava/lang/String;)V
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pt:Lcom/google/android/gms/internal/bq;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/bq;->as()V
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun bt(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pl:Ljava/lang/String;
    //         return-object v0
    */

    public fun bu(): com.google.android.gms.dynamic.d { return TODO("body: ()Lcom/google/android/gms/dynamic/d;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pm:Landroid/graphics/drawable/Drawable;
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         return-object v0
    */

    public fun bv(): com.google.android.gms.dynamic.d { return TODO("body: ()Lcom/google/android/gms/dynamic/d;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bo;->po:Landroid/graphics/drawable/Drawable;
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         return-object v0
    */

    public fun bw(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pp:Ljava/lang/String;
    //         return-object v0
    */

    public fun bx(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/bo;->pq:D
    //         return-wide v0
    */

    public fun by(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pr:Ljava/lang/String;
    //         return-object v0
    */

    public fun bz(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bo;->ps:Ljava/lang/String;
    //         return-object v0
    */

    public fun getBody(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pn:Ljava/lang/String;
    //         return-object v0
    */

    public fun i(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/bo;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pt:Lcom/google/android/gms/internal/bq;
    //         if-nez v0, :cond_0
    //         const-string v0, "Attempt to perform click before app install ad initialized."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->T(Ljava/lang/String;)V
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bo;->pt:Lcom/google/android/gms/internal/bq;
    //         const-string v2, "2"
    //         invoke-virtual {v0, v2, p1}, Lcom/google/android/gms/internal/bq;->b(Ljava/lang/String;I)V
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
