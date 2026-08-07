package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class af_a {
    private var US: com.google.android.gms.fitness.data.Subscription
    private var UT: Boolean

    public constructor()

    public fun b(p0: com.google.android.gms.fitness.data.Subscription): com.google.android.gms.fitness.request.af.a { return TODO("body: (Lcom/google/android/gms/fitness/data/Subscription;)Lcom/google/android/gms/fitness/request/af$a;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/af$a;->US:Lcom/google/android/gms/fitness/data/Subscription;
    //         return-object p0
    */

    public fun jF(): com.google.android.gms.fitness.request.af { return TODO("body: ()Lcom/google/android/gms/fitness/request/af;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/af$a;->US:Lcom/google/android/gms/fitness/data/Subscription;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Must call setSubscription()"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         new-instance v0, Lcom/google/android/gms/fitness/request/af;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/af;-><init>(Lcom/google/android/gms/fitness/request/af$a;Lcom/google/android/gms/fitness/request/af$1;)V
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.request.af.a): com.google.android.gms.fitness.data.Subscription { return TODO("body: (Lcom/google/android/gms/fitness/request/af$a;)Lcom/google/android/gms/fitness/data/Subscription;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/af$a;->US:Lcom/google/android/gms/fitness/data/Subscription;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.fitness.request.af.a): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/af$a;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/af$a;->UT:Z
    //         return v0
    */

    }
}
