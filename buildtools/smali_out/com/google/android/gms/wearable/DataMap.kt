package com.google.android.gms.wearable

// Auto-emitted from smali.
// 2 fields, 63 methods.

open class DataMap {
    private val auW: java.util.HashMap

    public constructor()

    private fun a(p0: String, p1: Object, p2: String, p3: ClassCastException) { /* TODO(body): (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V */ }
    /*
    //         .locals 6
    //         const-string v4, "<null>"
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v5, p4
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassCastException;)V
    //         return-void
    */

    private fun a(p0: String, p1: Object, p2: String, p3: Object, p4: ClassCastException) { /* TODO(body): (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassCastException;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "Key "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, " expected "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, " but value was a "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, ".  The default value "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         const-string v1, " was returned."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v1, "DataMap"
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "DataMap"
    //         const-string v1, "Attempt to cast generated internal exception:"
    //         invoke-static {v0, v1, p5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         return-void
    */

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    //         return-void
    */

    public fun containsKey(key: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         instance-of v0, p1, Lcom/google/android/gms/wearable/DataMap;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         check-cast p1, Lcom/google/android/gms/wearable/DataMap;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-static {p0, p1}, Lcom/google/android/gms/wearable/DataMap;->a(Lcom/google/android/gms/wearable/DataMap;Lcom/google/android/gms/wearable/DataMap;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun get(key: String): Object { return TODO("body: (Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAsset(key: String): com.google.android.gms.wearable.Asset { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wearable/Asset;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         check-cast v0, Lcom/google/android/gms/wearable/Asset;
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         const-string v3, "Asset"
    //         invoke-direct {p0, p1, v0, v3, v2}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         move-object v0, v1
    //         goto :goto_0
    */

    public fun getBoolean(key: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/DataMap;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         return v0
    */

    public fun getBoolean(key: String, defaultValue: Boolean): Boolean { return TODO("body: (Ljava/lang/String;Z)Z") }
    /*
    //         .locals 7
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         if-nez v3, :cond_0
    //         .end local p2    # "defaultValue":Z
    //         :goto_0
    //         return p2
    //         .restart local p2    # "defaultValue":Z
    //         :cond_0
    //         :try_start_0
    //         move-object v0, v3
    //         check-cast v0, Ljava/lang/Boolean;
    //         move-object v1, v0
    //         invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result p2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v6
    //         const-string v4, "Boolean"
    //         invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v5
    //         move-object v1, p0
    //         move-object v2, p1
    //         invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassCastException;)V
    //         goto :goto_0
    */

    public fun getByte(key: String): Byte { return TODO("body: (Ljava/lang/String;)B") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/DataMap;->getByte(Ljava/lang/String;B)B
    //         move-result v0
    //         return v0
    */

    public fun getByte(key: String, defaultValue: Byte): Byte { return TODO("body: (Ljava/lang/String;B)B") }
    /*
    //         .locals 7
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         if-nez v3, :cond_0
    //         .end local p2    # "defaultValue":B
    //         :goto_0
    //         return p2
    //         .restart local p2    # "defaultValue":B
    //         :cond_0
    //         :try_start_0
    //         move-object v0, v3
    //         check-cast v0, Ljava/lang/Byte;
    //         move-object v1, v0
    //         invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result p2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v6
    //         const-string v4, "Byte"
    //         invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
    //         move-result-object v5
    //         move-object v1, p0
    //         move-object v2, p1
    //         invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassCastException;)V
    //         goto :goto_0
    */

    public fun getByteArray(key: String): ByteArray { return TODO("body: (Ljava/lang/String;)[B") }
    /*
    //         .locals 5
    //         const/4 v3, 0x0
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         move-object v1, v3
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         :try_start_0
    //         move-object v0, v2
    //         check-cast v0, [B
    //         move-object v1, v0
    //         check-cast v1, [B
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v4, "byte[]"
    //         invoke-direct {p0, p1, v2, v4, v1}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         move-object v1, v3
    //         goto :goto_0
    */

    public fun getDataMap(key: String): com.google.android.gms.wearable.DataMap { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wearable/DataMap;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         check-cast v0, Lcom/google/android/gms/wearable/DataMap;
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         const-string v3, "DataMap"
    //         invoke-direct {p0, p1, v0, v3, v2}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         move-object v0, v1
    //         goto :goto_0
    */

    public fun getDataMapArrayList(key: String): java.util.ArrayList { return TODO("body: (Ljava/lang/String;)Ljava/util/ArrayList;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         check-cast v0, Ljava/util/ArrayList;
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         const-string v3, "ArrayList<DataMap>"
    //         invoke-direct {p0, p1, v0, v3, v2}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         move-object v0, v1
    //         goto :goto_0
    */

    public fun getDouble(key: String): Double { return TODO("body: (Ljava/lang/String;)D") }
    /*
    //         .locals 2
    //         const-wide/16 v0, 0x0
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/wearable/DataMap;->getDouble(Ljava/lang/String;D)D
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getDouble(key: String, defaultValue: Double): Double { return TODO("body: (Ljava/lang/String;D)D") }
    /*
    //         .locals 8
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         if-nez v3, :cond_0
    //         .end local p2    # "defaultValue":D
    //         :goto_0
    //         return-wide p2
    //         .restart local p2    # "defaultValue":D
    //         :cond_0
    //         :try_start_0
    //         move-object v0, v3
    //         check-cast v0, Ljava/lang/Double;
    //         move-object v1, v0
    //         invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-wide p2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v6
    //         const-string v4, "Double"
    //         invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v5
    //         move-object v1, p0
    //         move-object v2, p1
    //         invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassCastException;)V
    //         goto :goto_0
    */

    public fun getFloat(key: String): Float { return TODO("body: (Ljava/lang/String;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/DataMap;->getFloat(Ljava/lang/String;F)F
    //         move-result v0
    //         return v0
    */

    public fun getFloat(key: String, defaultValue: Float): Float { return TODO("body: (Ljava/lang/String;F)F") }
    /*
    //         .locals 7
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         if-nez v3, :cond_0
    //         .end local p2    # "defaultValue":F
    //         :goto_0
    //         return p2
    //         .restart local p2    # "defaultValue":F
    //         :cond_0
    //         :try_start_0
    //         move-object v0, v3
    //         check-cast v0, Ljava/lang/Float;
    //         move-object v1, v0
    //         invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result p2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v6
    //         const-string v4, "Float"
    //         invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v5
    //         move-object v1, p0
    //         move-object v2, p1
    //         invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassCastException;)V
    //         goto :goto_0
    */

    public fun getFloatArray(key: String): FloatArray { return TODO("body: (Ljava/lang/String;)[F") }
    /*
    //         .locals 5
    //         const/4 v3, 0x0
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         move-object v1, v3
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         :try_start_0
    //         move-object v0, v2
    //         check-cast v0, [F
    //         move-object v1, v0
    //         check-cast v1, [F
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v4, "float[]"
    //         invoke-direct {p0, p1, v2, v4, v1}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         move-object v1, v3
    //         goto :goto_0
    */

    public fun getInt(key: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/DataMap;->getInt(Ljava/lang/String;I)I
    //         move-result v0
    //         return v0
    */

    public fun getInt(key: String, defaultValue: Int): Int { return TODO("body: (Ljava/lang/String;I)I") }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         .end local p2    # "defaultValue":I
    //         :goto_0
    //         return p2
    //         .restart local p2    # "defaultValue":I
    //         :cond_0
    //         :try_start_0
    //         move-object v0, v2
    //         check-cast v0, Ljava/lang/Integer;
    //         move-object v1, v0
    //         invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result p2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v3, "Integer"
    //         invoke-direct {p0, p1, v2, v3, v1}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         goto :goto_0
    */

    public fun getIntegerArrayList(key: String): java.util.ArrayList { return TODO("body: (Ljava/lang/String;)Ljava/util/ArrayList;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         check-cast v0, Ljava/util/ArrayList;
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         const-string v3, "ArrayList<Integer>"
    //         invoke-direct {p0, p1, v0, v3, v2}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         move-object v0, v1
    //         goto :goto_0
    */

    public fun getLong(key: String): Long { return TODO("body: (Ljava/lang/String;)J") }
    /*
    //         .locals 2
    //         const-wide/16 v0, 0x0
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/wearable/DataMap;->getLong(Ljava/lang/String;J)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getLong(key: String, defaultValue: Long): Long { return TODO("body: (Ljava/lang/String;J)J") }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         .end local p2    # "defaultValue":J
    //         :goto_0
    //         return-wide p2
    //         .restart local p2    # "defaultValue":J
    //         :cond_0
    //         :try_start_0
    //         move-object v0, v2
    //         check-cast v0, Ljava/lang/Long;
    //         move-object v1, v0
    //         invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-wide p2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v3, "long"
    //         invoke-direct {p0, p1, v2, v3, v1}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         goto :goto_0
    */

    public fun getLongArray(key: String): LongArray { return TODO("body: (Ljava/lang/String;)[J") }
    /*
    //         .locals 5
    //         const/4 v3, 0x0
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         move-object v1, v3
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         :try_start_0
    //         move-object v0, v2
    //         check-cast v0, [J
    //         move-object v1, v0
    //         check-cast v1, [J
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v4, "long[]"
    //         invoke-direct {p0, p1, v2, v4, v1}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         move-object v1, v3
    //         goto :goto_0
    */

    public fun getString(key: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         check-cast v0, Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         const-string v3, "String"
    //         invoke-direct {p0, p1, v0, v3, v2}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         move-object v0, v1
    //         goto :goto_0
    */

    public fun getString(key: String, defaultValue: String): String { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/DataMap;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         .end local p2    # "defaultValue":Ljava/lang/String;
    //         :goto_0
    //         return-object p2
    //         .restart local p2    # "defaultValue":Ljava/lang/String;
    //         :cond_0
    //         move-object p2, v0
    //         goto :goto_0
    */

    public fun getStringArray(key: String): Array<String> { return TODO("body: (Ljava/lang/String;)[Ljava/lang/String;") }
    /*
    //         .locals 5
    //         const/4 v3, 0x0
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         move-object v1, v3
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         :try_start_0
    //         move-object v0, v2
    //         check-cast v0, [Ljava/lang/String;
    //         move-object v1, v0
    //         check-cast v1, [Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v4, "String[]"
    //         invoke-direct {p0, p1, v2, v4, v1}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         move-object v1, v3
    //         goto :goto_0
    */

    public fun getStringArrayList(key: String): java.util.ArrayList { return TODO("body: (Ljava/lang/String;)Ljava/util/ArrayList;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_0
    //         check-cast v0, Ljava/util/ArrayList;
    //         :try_end_0
    //         .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v2
    //         const-string v3, "ArrayList<String>"
    //         invoke-direct {p0, p1, v0, v3, v2}, Lcom/google/android/gms/wearable/DataMap;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/ClassCastException;)V
    //         move-object v0, v1
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->hashCode()I
    //         move-result v0
    //         mul-int/lit8 v0, v0, 0x1d
    //         return v0
    */

    public fun isEmpty(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z
    //         move-result v0
    //         return v0
    */

    public fun keySet(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         return-object v0
    */

    public fun putAll(dataMap: com.google.android.gms.wearable.DataMap) { /* TODO(body): (Lcom/google/android/gms/wearable/DataMap;)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p1}, Lcom/google/android/gms/wearable/DataMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/wearable/DataMap;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun putAsset(key: String, value: com.google.android.gms.wearable.Asset) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putBoolean(key: String, value: Boolean) { /* TODO(body): (Ljava/lang/String;Z)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putByte(key: String, value: Byte) { /* TODO(body): (Ljava/lang/String;B)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putByteArray(key: String, value: ByteArray) { /* TODO(body): (Ljava/lang/String;[B)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putDataMap(key: String, value: com.google.android.gms.wearable.DataMap) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/wearable/DataMap;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putDataMapArrayList(key: String, p1: java.util.ArrayList) { /* TODO(body): (Ljava/lang/String;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 1
    //         .local p2, "value":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/android/gms/wearable/DataMap;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putDouble(key: String, value: Double) { /* TODO(body): (Ljava/lang/String;D)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putFloat(key: String, value: Float) { /* TODO(body): (Ljava/lang/String;F)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putFloatArray(key: String, value: FloatArray) { /* TODO(body): (Ljava/lang/String;[F)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putInt(key: String, value: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putIntegerArrayList(key: String, p1: java.util.ArrayList) { /* TODO(body): (Ljava/lang/String;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 1
    //         .local p2, "value":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putLong(key: String, value: Long) { /* TODO(body): (Ljava/lang/String;J)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putLongArray(key: String, value: LongArray) { /* TODO(body): (Ljava/lang/String;[J)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putString(key: String, value: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putStringArray(key: String, value: Array<String>) { /* TODO(body): (Ljava/lang/String;[Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun putStringArrayList(key: String, p1: java.util.ArrayList) { /* TODO(body): (Ljava/lang/String;Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 1
    //         .local p2, "value":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun remove(key: String): Object { return TODO("body: (Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun size(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->size()I
    //         move-result v0
    //         return v0
    */

    public fun toBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v3, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-static {v1, v0, v3}, Lcom/google/android/gms/wearable/DataMap;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public fun toByteArray(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pc;->a(Lcom/google/android/gms/wearable/DataMap;)Lcom/google/android/gms/internal/pc$a;
    //         move-result-object v0
    //         iget-object v0, v0, Lcom/google/android/gms/internal/pc$a;->awb:Lcom/google/android/gms/internal/pd;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pn;->f(Lcom/google/android/gms/internal/pn;)[B
    //         move-result-object v0
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/DataMap;->auW:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmField public val TAG: String = "DataMap"

    private @JvmStatic fun a(p0: android.os.Bundle, p1: String, p2: Object) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 3
    //         instance-of v0, p2, Ljava/lang/String;
    //         if-eqz v0, :cond_1
    //         check-cast p2, Ljava/lang/String;
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         instance-of v0, p2, Ljava/lang/Integer;
    //         if-eqz v0, :cond_2
    //         check-cast p2, Ljava/lang/Integer;
    //         invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         goto :goto_0
    //         :cond_2
    //         instance-of v0, p2, Ljava/lang/Long;
    //         if-eqz v0, :cond_3
    //         check-cast p2, Ljava/lang/Long;
    //         invoke-virtual {p2}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v0
    //         invoke-virtual {p0, p1, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         goto :goto_0
    //         :cond_3
    //         instance-of v0, p2, Ljava/lang/Double;
    //         if-eqz v0, :cond_4
    //         check-cast p2, Ljava/lang/Double;
    //         invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D
    //         move-result-wide v0
    //         invoke-virtual {p0, p1, v0, v1}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V
    //         goto :goto_0
    //         :cond_4
    //         instance-of v0, p2, Ljava/lang/Float;
    //         if-eqz v0, :cond_5
    //         check-cast p2, Ljava/lang/Float;
    //         invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F
    //         move-result v0
    //         invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V
    //         goto :goto_0
    //         :cond_5
    //         instance-of v0, p2, Ljava/lang/Boolean;
    //         if-eqz v0, :cond_6
    //         check-cast p2, Ljava/lang/Boolean;
    //         invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         goto :goto_0
    //         :cond_6
    //         instance-of v0, p2, Ljava/lang/Byte;
    //         if-eqz v0, :cond_7
    //         check-cast p2, Ljava/lang/Byte;
    //         invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B
    //         move-result v0
    //         invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putByte(Ljava/lang/String;B)V
    //         goto :goto_0
    //         :cond_7
    //         instance-of v0, p2, [B
    //         if-eqz v0, :cond_8
    //         check-cast p2, [B
    //         check-cast p2, [B
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
    //         goto :goto_0
    //         :cond_8
    //         instance-of v0, p2, [Ljava/lang/String;
    //         if-eqz v0, :cond_9
    //         check-cast p2, [Ljava/lang/String;
    //         check-cast p2, [Ljava/lang/String;
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_9
    //         instance-of v0, p2, [J
    //         if-eqz v0, :cond_a
    //         check-cast p2, [J
    //         check-cast p2, [J
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putLongArray(Ljava/lang/String;[J)V
    //         goto :goto_0
    //         :cond_a
    //         instance-of v0, p2, [F
    //         if-eqz v0, :cond_b
    //         check-cast p2, [F
    //         check-cast p2, [F
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V
    //         goto/16 :goto_0
    //         :cond_b
    //         instance-of v0, p2, Lcom/google/android/gms/wearable/Asset;
    //         if-eqz v0, :cond_c
    //         check-cast p2, Lcom/google/android/gms/wearable/Asset;
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         goto/16 :goto_0
    //         :cond_c
    //         instance-of v0, p2, Lcom/google/android/gms/wearable/DataMap;
    //         if-eqz v0, :cond_d
    //         check-cast p2, Lcom/google/android/gms/wearable/DataMap;
    //         invoke-virtual {p2}, Lcom/google/android/gms/wearable/DataMap;->toBundle()Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         goto/16 :goto_0
    //         :cond_d
    //         instance-of v0, p2, Ljava/util/ArrayList;
    //         if-eqz v0, :cond_0
    //         move-object v0, p2
    //         check-cast v0, Ljava/util/ArrayList;
    //         invoke-static {v0}, Lcom/google/android/gms/wearable/DataMap;->d(Ljava/util/ArrayList;)I
    //         move-result v0
    //         packed-switch v0, :pswitch_data_0
    //         goto/16 :goto_0
    //         :pswitch_0
    //         check-cast p2, Ljava/util/ArrayList;
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :pswitch_1
    //         check-cast p2, Ljava/util/ArrayList;
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :pswitch_2
    //         check-cast p2, Ljava/util/ArrayList;
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :pswitch_3
    //         check-cast p2, Ljava/util/ArrayList;
    //         invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :pswitch_4
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         check-cast p2, Ljava/util/ArrayList;
    //         invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_e
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/DataMap;
    //         invoke-virtual {v0}, Lcom/google/android/gms/wearable/DataMap;->toBundle()Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_1
    //         :cond_e
    //         invoke-virtual {p0, p1, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_3
    //             :pswitch_2
    //             :pswitch_4
    //         .end packed-switch
    */

    private @JvmStatic fun a(p0: com.google.android.gms.wearable.DataMap, p1: String, p2: Object) { /* TODO(body): (Lcom/google/android/gms/wearable/DataMap;Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         instance-of v0, p2, Ljava/lang/String;
    //         if-eqz v0, :cond_1
    //         check-cast p2, Ljava/lang/String;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/DataMap;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         instance-of v0, p2, Ljava/lang/Integer;
    //         if-eqz v0, :cond_2
    //         check-cast p2, Ljava/lang/Integer;
    //         invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/DataMap;->putInt(Ljava/lang/String;I)V
    //         goto :goto_0
    //         :cond_2
    //         instance-of v0, p2, Ljava/lang/Long;
    //         if-eqz v0, :cond_3
    //         check-cast p2, Ljava/lang/Long;
    //         invoke-virtual {p2}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v0
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/wearable/DataMap;->putLong(Ljava/lang/String;J)V
    //         goto :goto_0
    //         :cond_3
    //         instance-of v0, p2, Ljava/lang/Double;
    //         if-eqz v0, :cond_4
    //         check-cast p2, Ljava/lang/Double;
    //         invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D
    //         move-result-wide v0
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/wearable/DataMap;->putDouble(Ljava/lang/String;D)V
    //         goto :goto_0
    //         :cond_4
    //         instance-of v0, p2, Ljava/lang/Float;
    //         if-eqz v0, :cond_5
    //         check-cast p2, Ljava/lang/Float;
    //         invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F
    //         move-result v0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/DataMap;->putFloat(Ljava/lang/String;F)V
    //         goto :goto_0
    //         :cond_5
    //         instance-of v0, p2, Ljava/lang/Boolean;
    //         if-eqz v0, :cond_6
    //         check-cast p2, Ljava/lang/Boolean;
    //         invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/DataMap;->putBoolean(Ljava/lang/String;Z)V
    //         goto :goto_0
    //         :cond_6
    //         instance-of v0, p2, Ljava/lang/Byte;
    //         if-eqz v0, :cond_7
    //         check-cast p2, Ljava/lang/Byte;
    //         invoke-virtual {p2}, Ljava/lang/Byte;->byteValue()B
    //         move-result v0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/DataMap;->putByte(Ljava/lang/String;B)V
    //         goto :goto_0
    //         :cond_7
    //         instance-of v0, p2, [B
    //         if-eqz v0, :cond_8
    //         check-cast p2, [B
    //         check-cast p2, [B
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/DataMap;->putByteArray(Ljava/lang/String;[B)V
    //         goto :goto_0
    //         :cond_8
    //         instance-of v0, p2, [Ljava/lang/String;
    //         if-eqz v0, :cond_9
    //         check-cast p2, [Ljava/lang/String;
    //         check-cast p2, [Ljava/lang/String;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/DataMap;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_9
    //         instance-of v0, p2, [J
    //         if-eqz v0, :cond_a
    //         check-cast p2, [J
    //         check-cast p2, [J
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/DataMap;->putLongArray(Ljava/lang/String;[J)V
    //         goto :goto_0
    //         :cond_a
    //         instance-of v0, p2, [F
    //         if-eqz v0, :cond_b
    //         check-cast p2, [F
    //         check-cast p2, [F
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/DataMap;->putFloatArray(Ljava/lang/String;[F)V
    //         goto/16 :goto_0
    //         :cond_b
    //         instance-of v0, p2, Lcom/google/android/gms/wearable/Asset;
    //         if-eqz v0, :cond_c
    //         check-cast p2, Lcom/google/android/gms/wearable/Asset;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/DataMap;->putAsset(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)V
    //         goto/16 :goto_0
    //         :cond_c
    //         instance-of v0, p2, Landroid/os/Bundle;
    //         if-eqz v0, :cond_d
    //         check-cast p2, Landroid/os/Bundle;
    //         invoke-static {p2}, Lcom/google/android/gms/wearable/DataMap;->fromBundle(Landroid/os/Bundle;)Lcom/google/android/gms/wearable/DataMap;
    //         move-result-object v0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/DataMap;->putDataMap(Ljava/lang/String;Lcom/google/android/gms/wearable/DataMap;)V
    //         goto/16 :goto_0
    //         :cond_d
    //         instance-of v0, p2, Ljava/util/ArrayList;
    //         if-eqz v0, :cond_0
    //         move-object v0, p2
    //         check-cast v0, Ljava/util/ArrayList;
    //         invoke-static {v0}, Lcom/google/android/gms/wearable/DataMap;->d(Ljava/util/ArrayList;)I
    //         move-result v0
    //         packed-switch v0, :pswitch_data_0
    //         :pswitch_0
    //         goto/16 :goto_0
    //         :pswitch_1
    //         check-cast p2, Ljava/util/ArrayList;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/DataMap;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :pswitch_2
    //         check-cast p2, Ljava/util/ArrayList;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/DataMap;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :pswitch_3
    //         check-cast p2, Ljava/util/ArrayList;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/DataMap;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :pswitch_4
    //         check-cast p2, Ljava/util/ArrayList;
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/wearable/DataMap;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :pswitch_5
    //         check-cast p2, Ljava/util/ArrayList;
    //         invoke-static {p2}, Lcom/google/android/gms/wearable/DataMap;->arrayListFromBundleArrayList(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/DataMap;->putDataMapArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_4
    //             :pswitch_3
    //             :pswitch_0
    //             :pswitch_5
    //         .end packed-switch
    */

    private @JvmStatic fun a(p0: com.google.android.gms.wearable.Asset, p1: com.google.android.gms.wearable.Asset): Boolean { return TODO("body: (Lcom/google/android/gms/wearable/Asset;Lcom/google/android/gms/wearable/Asset;)Z") }
    /*
    //         .locals 2
    //         if-eqz p0, :cond_0
    //         if-nez p1, :cond_2
    //         :cond_0
    //         if-ne p0, p1, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/Asset;->getDigest()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-nez v0, :cond_3
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/Asset;->getDigest()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1}, Lcom/google/android/gms/wearable/Asset;->getDigest()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    //         :cond_3
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/Asset;->getData()[B
    //         move-result-object v0
    //         invoke-virtual {p1}, Lcom/google/android/gms/wearable/Asset;->getData()[B
    //         move-result-object v1
    //         invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v0
    //         goto :goto_0
    */

    private @JvmStatic fun a(p0: com.google.android.gms.wearable.DataMap, p1: com.google.android.gms.wearable.DataMap): Boolean { return TODO("body: (Lcom/google/android/gms/wearable/DataMap;Lcom/google/android/gms/wearable/DataMap;)Z") }
    /*
    //         .locals 6
    //         const/4 v3, 0x1
    //         const/4 v4, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/DataMap;->size()I
    //         move-result v0
    //         invoke-virtual {p1}, Lcom/google/android/gms/wearable/DataMap;->size()I
    //         move-result v1
    //         if-eq v0, v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v4
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/DataMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :cond_2
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_b
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/DataMap;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/wearable/DataMap;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v2
    //         instance-of v0, v1, Lcom/google/android/gms/wearable/Asset;
    //         if-eqz v0, :cond_3
    //         instance-of v0, v2, Lcom/google/android/gms/wearable/Asset;
    //         if-eqz v0, :cond_0
    //         move-object v0, v1
    //         check-cast v0, Lcom/google/android/gms/wearable/Asset;
    //         move-object v1, v2
    //         check-cast v1, Lcom/google/android/gms/wearable/Asset;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/wearable/DataMap;->a(Lcom/google/android/gms/wearable/Asset;Lcom/google/android/gms/wearable/Asset;)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         goto :goto_0
    //         :cond_3
    //         instance-of v0, v1, [Ljava/lang/String;
    //         if-eqz v0, :cond_4
    //         instance-of v0, v2, [Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         check-cast v1, [Ljava/lang/String;
    //         check-cast v1, [Ljava/lang/String;
    //         check-cast v2, [Ljava/lang/String;
    //         check-cast v2, [Ljava/lang/String;
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         goto :goto_0
    //         :cond_4
    //         instance-of v0, v1, [J
    //         if-eqz v0, :cond_5
    //         instance-of v0, v2, [J
    //         if-eqz v0, :cond_0
    //         check-cast v1, [J
    //         check-cast v1, [J
    //         check-cast v2, [J
    //         check-cast v2, [J
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([J[J)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         goto :goto_0
    //         :cond_5
    //         instance-of v0, v1, [F
    //         if-eqz v0, :cond_6
    //         instance-of v0, v2, [F
    //         if-eqz v0, :cond_0
    //         check-cast v1, [F
    //         check-cast v1, [F
    //         check-cast v2, [F
    //         check-cast v2, [F
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([F[F)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         goto :goto_0
    //         :cond_6
    //         instance-of v0, v1, [B
    //         if-eqz v0, :cond_7
    //         instance-of v0, v2, [B
    //         if-eqz v0, :cond_0
    //         check-cast v1, [B
    //         check-cast v1, [B
    //         check-cast v2, [B
    //         check-cast v2, [B
    //         invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         goto/16 :goto_0
    //         :cond_7
    //         if-eqz v1, :cond_8
    //         if-nez v2, :cond_a
    //         :cond_8
    //         if-ne v1, v2, :cond_9
    //         move v0, v3
    //         :goto_1
    //         move v4, v0
    //         goto/16 :goto_0
    //         :cond_9
    //         move v0, v4
    //         goto :goto_1
    //         :cond_a
    //         invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         goto/16 :goto_0
    //         :cond_b
    //         move v4, v3
    //         goto/16 :goto_0
    */

    public @JvmStatic fun arrayListFromBundleArrayList(p0: java.util.ArrayList): java.util.ArrayList { return TODO("body: (Ljava/util/ArrayList;)Ljava/util/ArrayList;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Landroid/os/Bundle;",
    //                 ">;)",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/wearable/DataMap;",
    //                 ">;"
    //             }
    //         .end annotation
    //         .local p0, "bundleArrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/os/Bundle;>;"
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/Bundle;
    //         invoke-static {v0}, Lcom/google/android/gms/wearable/DataMap;->fromBundle(Landroid/os/Bundle;)Lcom/google/android/gms/wearable/DataMap;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    private @JvmStatic fun d(p0: java.util.ArrayList): Int { return TODO("body: (Ljava/util/ArrayList;)I") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<*>;)I"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         :cond_1
    //         invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_5
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         instance-of v2, v1, Ljava/lang/Integer;
    //         if-eqz v2, :cond_2
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         :cond_2
    //         instance-of v2, v1, Ljava/lang/String;
    //         if-eqz v2, :cond_3
    //         const/4 v0, 0x3
    //         goto :goto_0
    //         :cond_3
    //         instance-of v2, v1, Lcom/google/android/gms/wearable/DataMap;
    //         if-eqz v2, :cond_4
    //         const/4 v0, 0x4
    //         goto :goto_0
    //         :cond_4
    //         instance-of v1, v1, Landroid/os/Bundle;
    //         if-eqz v1, :cond_1
    //         const/4 v0, 0x5
    //         goto :goto_0
    //         :cond_5
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public @JvmStatic fun fromBundle(bundle: android.os.Bundle): com.google.android.gms.wearable.DataMap { return TODO("body: (Landroid/os/Bundle;)Lcom/google/android/gms/wearable/DataMap;") }
    /*
    //         .locals 4
    //         const-class v0, Lcom/google/android/gms/wearable/Asset;
    //         invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    //         new-instance v1, Lcom/google/android/gms/wearable/DataMap;
    //         invoke-direct {v1}, Lcom/google/android/gms/wearable/DataMap;-><init>()V
    //         invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v3
    //         invoke-static {v1, v0, v3}, Lcom/google/android/gms/wearable/DataMap;->a(Lcom/google/android/gms/wearable/DataMap;Ljava/lang/String;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public @JvmStatic fun fromByteArray(bytes: ByteArray): com.google.android.gms.wearable.DataMap { return TODO("body: ([B)Lcom/google/android/gms/wearable/DataMap;") }
    /*
    //         .locals 3
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/internal/pc$a;
    //         invoke-static {p0}, Lcom/google/android/gms/internal/pd;->n([B)Lcom/google/android/gms/internal/pd;
    //         move-result-object v1
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/pc$a;-><init>(Lcom/google/android/gms/internal/pd;Ljava/util/List;)V
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pc;->a(Lcom/google/android/gms/internal/pc$a;)Lcom/google/android/gms/wearable/DataMap;
    //         :try_end_0
    //         .catch Lcom/google/android/gms/internal/pm; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         const-string v2, "Unable to convert data"
    //         invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    }
}
