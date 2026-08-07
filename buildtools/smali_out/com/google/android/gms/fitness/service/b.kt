package com.google.android.gms.fitness.service

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class b: com.google.android.gms.fitness.service.SensorEventDispatcher {
    private val UA: com.google.android.gms.fitness.data.k

    constructor(p0: com.google.android.gms.fitness.data.k)

    public fun publish(dataPoint: com.google.android.gms.fitness.data.DataPoint) { /* TODO(body): (Lcom/google/android/gms/fitness/data/DataPoint;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/service/b;->UA:Lcom/google/android/gms/fitness/data/k;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/fitness/data/k;->c(Lcom/google/android/gms/fitness/data/DataPoint;)V
    //         return-void
    */

    public fun publish(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataPoint;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         .local p1, "dataPoints":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/fitness/data/DataPoint;>;"
    //         invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataPoint;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/service/b;->publish(Lcom/google/android/gms/fitness/data/DataPoint;)V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

}
