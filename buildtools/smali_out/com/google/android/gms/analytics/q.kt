package com.google.android.gms.analytics

// Auto-emitted from smali.
// 15 fields, 11 methods.

open class q: com.google.android.gms.analytics.ae() {
    private var mContext: android.content.Context
    private var mHandler: android.os.Handler
    private var yd: com.google.android.gms.analytics.d
    private var ye: com.google.android.gms.analytics.f
    private var yf: Int
    private var yg: Boolean
    private var yh: Boolean
    private var yi: String
    private var yj: Boolean
    private var yk: Boolean
    private var yl: com.google.android.gms.analytics.e
    private var ym: com.google.android.gms.analytics.p
    private var yn: Boolean

    private constructor()

    private fun ea() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/analytics/p;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/p;-><init>(Lcom/google/android/gms/analytics/ae;)V
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/q;->ym:Lcom/google/android/gms/analytics/p;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/q;->ym:Lcom/google/android/gms/analytics/p;
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/q;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/p;->z(Landroid/content/Context;)V
    //         return-void
    */

    private fun eb() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/q;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         new-instance v2, Lcom/google/android/gms/analytics/q$2;
    //         invoke-direct {v2, p0}, Lcom/google/android/gms/analytics/q$2;-><init>(Lcom/google/android/gms/analytics/q;)V
    //         invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;
    //         iget v0, p0, Lcom/google/android/gms/analytics/q;->yf:I
    //         if-lez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;
    //         const/4 v2, 0x1
    //         sget-object v3, Lcom/google/android/gms/analytics/q;->yc:Ljava/lang/Object;
    //         invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/analytics/q;->yf:I
    //         mul-int/lit16 v2, v2, 0x3e8
    //         int-to-long v2, v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    //         :cond_0
    //         return-void
    */

    fun dN() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/q;->ye:Lcom/google/android/gms/analytics/f;
    //         if-nez v0, :cond_0
    //         const-string v0, "setForceLocalDispatch() queued. It will be called once initialization is complete."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yh:Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/analytics/t$a;->Ak:Lcom/google/android/gms/analytics/t$a;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/q;->ye:Lcom/google/android/gms/analytics/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/analytics/f;->dN()V
    //         goto :goto_0
    */

    companion object {
    private val yc: Object = null!!
    private var yo: com.google.android.gms.analytics.q

    @JvmStatic fun a(p0: com.google.android.gms.analytics.q): Boolean { return TODO("body: (Lcom/google/android/gms/analytics/q;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yj:Z
    //         return v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.analytics.q): Int { return TODO("body: (Lcom/google/android/gms/analytics/q;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/analytics/q;->yf:I
    //         return v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.analytics.q): Boolean { return TODO("body: (Lcom/google/android/gms/analytics/q;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/q;->yn:Z
    //         return v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.analytics.q): android.os.Handler { return TODO("body: (Lcom/google/android/gms/analytics/q;)Landroid/os/Handler;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/q;->mHandler:Landroid/os/Handler;
    //         return-object v0
    */

    public @JvmStatic fun dZ(): com.google.android.gms.analytics.q { return TODO("body: ()Lcom/google/android/gms/analytics/q;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/analytics/q;->yo:Lcom/google/android/gms/analytics/q;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/analytics/q;
    //         invoke-direct {v0}, Lcom/google/android/gms/analytics/q;-><init>()V
    //         sput-object v0, Lcom/google/android/gms/analytics/q;->yo:Lcom/google/android/gms/analytics/q;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/analytics/q;->yo:Lcom/google/android/gms/analytics/q;
    //         return-object v0
    */

    @JvmStatic fun ee(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/analytics/q;->yc:Ljava/lang/Object;
    //         return-object v0
    */

    }
}
