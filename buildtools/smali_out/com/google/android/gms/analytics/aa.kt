package com.google.android.gms.analytics

// Auto-emitted from smali.
// 4 fields, 3 methods.

open class aa {
    private val AU: java.util.Map
    private val AV: java.util.Map
    private val AW: Boolean
    private val AX: String

    constructor(p0: String, p1: Boolean)

    fun e(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/aa;->AW:Z
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/aa;->AU:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Integer;
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/aa;->AU:Ljava/util/Map;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         add-int/2addr v0, p2
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    */

    fun eL(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/aa;->AW:Z
    //         if-nez v0, :cond_0
    //         const-string v0, ""
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/aa;->AX:Ljava/lang/String;
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/aa;->AU:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v3, "&"
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, "="
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/analytics/aa;->AU:Ljava/util/Map;
    //         invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/aa;->AV:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const-string v3, "&"
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, "="
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/analytics/aa;->AV:Ljava/util/Map;
    //         invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_2
    //         :cond_2
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

}
