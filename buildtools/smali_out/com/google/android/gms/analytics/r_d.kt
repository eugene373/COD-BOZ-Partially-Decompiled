package com.google.android.gms.analytics

// Auto-emitted from smali.
// 4 fields, 6 methods.

open class r_d {
    private val yP: java.util.Map
    private val yQ: Long
    private val yR: String
    private val yS: java.util.List

    public constructor(p0: java.util.Map, p1: Long, p2: String, p3: java.util.List)

    public fun em(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r$d;->yP:Ljava/util/Map;
    //         return-object v0
    */

    public fun en(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/analytics/r$d;->yQ:J
    //         return-wide v0
    */

    public fun eo(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/hb;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r$d;->yS:Ljava/util/List;
    //         return-object v0
    */

    public fun getPath(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r$d;->yR:Ljava/lang/String;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v0, "PATH: "
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r$d;->yR:Ljava/lang/String;
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r$d;->yP:Ljava/util/Map;
    //         if-eqz v0, :cond_0
    //         const-string v0, "  PARAMS: "
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r$d;->yP:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, "="
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v0, ",  "
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
