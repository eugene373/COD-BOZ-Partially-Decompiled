package com.google.android.gms.plus.internal

// Auto-emitted from smali.
// 4 fields, 7 methods.

class e_f: com.google.android.gms.common.internal.e.d(), com.google.android.gms.plus.People.LoadPeopleResult {
    private val CM: com.google.android.gms.common.api.Status
    private val Nq: String
    val alw: com.google.android.gms.plus.internal.e
    private var alz: com.google.android.gms.plus.model.people.PersonBuffer

    public constructor(p0: com.google.android.gms.plus.internal.e, p1: com.google.android.gms.common.api.BaseImplementation.b, p2: com.google.android.gms.common.api.Status, p3: com.google.android.gms.common.data.DataHolder, p4: String)

    protected fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/People$LoadPeopleResult;",
    //                 ">;",
    //                 "Lcom/google/android/gms/common/data/DataHolder;",
    //                 ")V"
    //             }
    //         .end annotation
    //         if-eqz p2, :cond_0
    //         new-instance v0, Lcom/google/android/gms/plus/model/people/PersonBuffer;
    //         invoke-direct {v0, p2}, Lcom/google/android/gms/plus/model/people/PersonBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         :goto_0
    //         iput-object v0, p0, Lcom/google/android/gms/plus/internal/e$f;->alz:Lcom/google/android/gms/plus/model/people/PersonBuffer;
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
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/plus/internal/e$f;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/common/data/DataHolder;)V
    //         return-void
    */

    public fun getNextPageToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$f;->Nq:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPersonBuffer(): com.google.android.gms.plus.model.people.PersonBuffer { return TODO("body: ()Lcom/google/android/gms/plus/model/people/PersonBuffer;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$f;->alz:Lcom/google/android/gms/plus/model/people/PersonBuffer;
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$f;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$f;->alz:Lcom/google/android/gms/plus/model/people/PersonBuffer;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$f;->alz:Lcom/google/android/gms/plus/model/people/PersonBuffer;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/model/people/PersonBuffer;->close()V
    //         :cond_0
    //         return-void
    */

}
