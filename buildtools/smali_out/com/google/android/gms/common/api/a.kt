package com.google.android.gms.common.api

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class a: com.google.android.gms.common.api.Releasable, com.google.android.gms.common.api.Result {
    protected val CM: com.google.android.gms.common.api.Status
    protected val II: com.google.android.gms.common.data.DataHolder

    protected constructor(p0: com.google.android.gms.common.data.DataHolder)

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/a;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/a;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/a;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->close()V
    //         :cond_0
    //         return-void
    */

}
