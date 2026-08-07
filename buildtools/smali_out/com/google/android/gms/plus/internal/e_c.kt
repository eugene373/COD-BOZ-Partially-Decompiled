package com.google.android.gms.plus.internal

// Auto-emitted from smali.
// 5 fields, 8 methods.

class e_c: com.google.android.gms.common.internal.e.d(), com.google.android.gms.plus.Moments.LoadMomentsResult {
    private val CM: com.google.android.gms.common.api.Status
    private val Nq: String
    val alw: com.google.android.gms.plus.internal.e
    private val alx: String
    private var aly: com.google.android.gms.plus.model.moments.MomentBuffer

    public constructor(p0: com.google.android.gms.plus.internal.e, p1: com.google.android.gms.common.api.BaseImplementation.b, p2: com.google.android.gms.common.api.Status, p3: com.google.android.gms.common.data.DataHolder, p4: String, p5: String)

    protected fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/Moments$LoadMomentsResult;",
    //                 ">;",
    //                 "Lcom/google/android/gms/common/data/DataHolder;",
    //                 ")V"
    //             }
    //         .end annotation
    //         if-eqz p2, :cond_0
    //         new-instance v0, Lcom/google/android/gms/plus/model/moments/MomentBuffer;
    //         invoke-direct {v0, p2}, Lcom/google/android/gms/plus/model/moments/MomentBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         :goto_0
    //         iput-object v0, p0, Lcom/google/android/gms/plus/internal/e$c;->aly:Lcom/google/android/gms/plus/model/moments/MomentBuffer;
    //         invoke-interface {p1, p0}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    protected fun a(p0: Object, p1: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Ljava/lang/Object;Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/plus/internal/e$c;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/common/data/DataHolder;)V
    //         return-void
    */

    public fun getMomentBuffer(): com.google.android.gms.plus.model.moments.MomentBuffer { return TODO("body: ()Lcom/google/android/gms/plus/model/moments/MomentBuffer;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$c;->aly:Lcom/google/android/gms/plus/model/moments/MomentBuffer;
    //         return-object v0
    */

    public fun getNextPageToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$c;->Nq:Ljava/lang/String;
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$c;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun getUpdated(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$c;->alx:Ljava/lang/String;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$c;->aly:Lcom/google/android/gms/plus/model/moments/MomentBuffer;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$c;->aly:Lcom/google/android/gms/plus/model/moments/MomentBuffer;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/model/moments/MomentBuffer;->close()V
    //         :cond_0
    //         return-void
    */

}
