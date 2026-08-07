package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 1 fields, 4 methods.

open class w_a {
    private var St: com.google.android.gms.fitness.data.Session

    public constructor()

    public fun b(p0: com.google.android.gms.fitness.data.Session): com.google.android.gms.fitness.request.w.a { return TODO("body: (Lcom/google/android/gms/fitness/data/Session;)Lcom/google/android/gms/fitness/request/w$a;") }
    /*
    //         .locals 4
    //         sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/fitness/data/Session;->getEndTime(Ljava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Cannot start a session which has already ended"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/w$a;->St:Lcom/google/android/gms/fitness/data/Session;
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun jA(): com.google.android.gms.fitness.request.w { return TODO("body: ()Lcom/google/android/gms/fitness/request/w;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/fitness/request/w;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/w;-><init>(Lcom/google/android/gms/fitness/request/w$a;Lcom/google/android/gms/fitness/request/w$1;)V
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.request.w.a): com.google.android.gms.fitness.data.Session { return TODO("body: (Lcom/google/android/gms/fitness/request/w$a;)Lcom/google/android/gms/fitness/data/Session;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/w$a;->St:Lcom/google/android/gms/fitness/data/Session;
    //         return-object v0
    */

    }
}
