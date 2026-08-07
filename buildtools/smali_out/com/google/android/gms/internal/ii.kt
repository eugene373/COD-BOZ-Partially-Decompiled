package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 8 methods.

open class ii {
    protected val Go: com.google.android.gms.internal.ip
    private val Gp: String
    private var Gq: com.google.android.gms.internal.ir

    protected constructor(p0: String, p1: String, p2: String)

    public fun a(p0: com.google.android.gms.internal.ir) { /* TODO(body): (Lcom/google/android/gms/internal/ir;)V */ }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/google/android/gms/internal/ii;->Gq:Lcom/google/android/gms/internal/ir;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ii;->Gq:Lcom/google/android/gms/internal/ir;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/ii;->fA()V
    //         :cond_0
    //         return-void
    */

    protected fun a(p0: String, p1: Long, p2: String) { /* TODO(body): (Ljava/lang/String;JLjava/lang/String;)V */ }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ii;->Go:Lcom/google/android/gms/internal/ip;
    //         const-string v1, "Sending text message: %s to: %s"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         aput-object p1, v2, v3
    //         const/4 v3, 0x1
    //         aput-object p4, v2, v3
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ii;->Gq:Lcom/google/android/gms/internal/ir;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ii;->Gp:Ljava/lang/String;
    //         move-object v3, p1
    //         move-wide v4, p2
    //         move-object v6, p4
    //         invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/ir;->a(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    //         return-void
    */

    public fun aD(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun b(p0: Long, p1: Int) { /* TODO(body): (JI)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun fA() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    protected fun fz(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ii;->Gq:Lcom/google/android/gms/internal/ir;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ir;->fx()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getNamespace(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ii;->Gp:Ljava/lang/String;
    //         return-object v0
    */

}
