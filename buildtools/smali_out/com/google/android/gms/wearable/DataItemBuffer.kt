package com.google.android.gms.wearable

// Auto-emitted from smali.
// 1 fields, 5 methods.

open class DataItemBuffer: com.google.android.gms.common.data.g(), com.google.android.gms.common.api.Result {
    private val CM: com.google.android.gms.common.api.Status

    public constructor(dataHolder: com.google.android.gms.common.data.DataHolder)

    protected fun f(p0: Int, p1: Int): Object { return TODO("body: (II)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/DataItemBuffer;->q(II)Lcom/google/android/gms/wearable/DataItem;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun gD(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "path"
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataItemBuffer;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    protected fun q(p0: Int, p1: Int): com.google.android.gms.wearable.DataItem { return TODO("body: (II)Lcom/google/android/gms/wearable/DataItem;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/o;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/DataItemBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-direct {v0, v1, p1, p2}, Lcom/google/android/gms/wearable/internal/o;-><init>(Lcom/google/android/gms/common/data/DataHolder;II)V
    //         return-object v0
    */

}
