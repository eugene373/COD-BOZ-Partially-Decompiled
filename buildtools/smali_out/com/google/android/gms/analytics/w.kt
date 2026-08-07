package com.google.android.gms.analytics

// Auto-emitted from smali.
// 4 fields, 7 methods.

open class w {
    private var AE: String
    private val AF: Long
    private val AG: Long
    private var AH: String

    constructor(p0: String, p1: Long, p2: Long)

    fun aj(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/analytics/w;->AE:Ljava/lang/String;
    //         return-void
    */

    fun ak(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "http:"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "http:"
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/w;->AH:Ljava/lang/String;
    //         goto :goto_0
    */

    fun eF(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/w;->AE:Ljava/lang/String;
    //         return-object v0
    */

    fun eG(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/analytics/w;->AF:J
    //         return-wide v0
    */

    fun eH(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/analytics/w;->AG:J
    //         return-wide v0
    */

    fun eI(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/w;->AH:Ljava/lang/String;
    //         return-object v0
    */

}
