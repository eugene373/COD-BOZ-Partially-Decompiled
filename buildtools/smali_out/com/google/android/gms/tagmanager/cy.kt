package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 14 fields, 11 methods.

open class cy: com.google.android.gms.tagmanager.cx() {
    private var arq: android.content.Context
    private var arr: com.google.android.gms.tagmanager.at
    private var ars: com.google.android.gms.tagmanager.ar
    private var art: Int
    private var aru: Boolean
    private var arv: Boolean
    private var arw: Boolean
    private var arx: com.google.android.gms.tagmanager.au
    private var ary: com.google.android.gms.tagmanager.bo
    private var arz: Boolean
    private var connected: Boolean
    private var handler: android.os.Handler

    private constructor()

    private fun ea() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/tagmanager/bo;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/bo;-><init>(Lcom/google/android/gms/tagmanager/cx;)V
    //         iput-object v0, p0, Lcom/google/android/gms/tagmanager/cy;->ary:Lcom/google/android/gms/tagmanager/bo;
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/cy;->ary:Lcom/google/android/gms/tagmanager/bo;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/cy;->arq:Landroid/content/Context;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/bo;->z(Landroid/content/Context;)V
    //         return-void
    */

    private fun eb() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/cy;->arq:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         new-instance v2, Lcom/google/android/gms/tagmanager/cy$2;
    //         invoke-direct {v2, p0}, Lcom/google/android/gms/tagmanager/cy$2;-><init>(Lcom/google/android/gms/tagmanager/cy;)V
    //         invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V
    //         iput-object v0, p0, Lcom/google/android/gms/tagmanager/cy;->handler:Landroid/os/Handler;
    //         iget v0, p0, Lcom/google/android/gms/tagmanager/cy;->art:I
    //         if-lez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/cy;->handler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/cy;->handler:Landroid/os/Handler;
    //         const/4 v2, 0x1
    //         sget-object v3, Lcom/google/android/gms/tagmanager/cy;->yc:Ljava/lang/Object;
    //         invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/tagmanager/cy;->art:I
    //         int-to-long v2, v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    //         :cond_0
    //         return-void
    */

    companion object {
    private var arA: com.google.android.gms.tagmanager.cy
    private val yc: Object = null!!

    @JvmStatic fun a(p0: com.google.android.gms.tagmanager.cy): Boolean { return TODO("body: (Lcom/google/android/gms/tagmanager/cy;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/cy;->connected:Z
    //         return v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.tagmanager.cy): Int { return TODO("body: (Lcom/google/android/gms/tagmanager/cy;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/tagmanager/cy;->art:I
    //         return v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.tagmanager.cy): Boolean { return TODO("body: (Lcom/google/android/gms/tagmanager/cy;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/cy;->arz:Z
    //         return v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.tagmanager.cy): android.os.Handler { return TODO("body: (Lcom/google/android/gms/tagmanager/cy;)Landroid/os/Handler;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/cy;->handler:Landroid/os/Handler;
    //         return-object v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.tagmanager.cy): com.google.android.gms.tagmanager.at { return TODO("body: (Lcom/google/android/gms/tagmanager/cy;)Lcom/google/android/gms/tagmanager/at;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/cy;->arr:Lcom/google/android/gms/tagmanager/at;
    //         return-object v0
    */

    @JvmStatic fun ee(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/tagmanager/cy;->yc:Ljava/lang/Object;
    //         return-object v0
    */

    public @JvmStatic fun pw(): com.google.android.gms.tagmanager.cy { return TODO("body: ()Lcom/google/android/gms/tagmanager/cy;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/tagmanager/cy;->arA:Lcom/google/android/gms/tagmanager/cy;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/tagmanager/cy;
    //         invoke-direct {v0}, Lcom/google/android/gms/tagmanager/cy;-><init>()V
    //         sput-object v0, Lcom/google/android/gms/tagmanager/cy;->arA:Lcom/google/android/gms/tagmanager/cy;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/tagmanager/cy;->arA:Lcom/google/android/gms/tagmanager/cy;
    //         return-object v0
    */

    }
}
