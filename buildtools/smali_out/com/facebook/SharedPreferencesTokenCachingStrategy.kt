package com.facebook

// Auto-emitted from smali source: SharedPreferencesTokenCachingStrategy.java.
// 26 fields, 8 methods.

open class SharedPreferencesTokenCachingStrategy: com.facebook.TokenCachingStrategy() {
    private var cache: android.content.SharedPreferences
    private var cacheKey: String

    public constructor(p0: android.content.Context)

    public constructor(p0: android.content.Context, p1: String)

    private fun deserializeKey(p0: String, p1: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v6, 0x1
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->cache:Landroid/content/SharedPreferences;
    //         const-string v2, "{}"
    //         invoke-interface {v1, p1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v1, "valueType"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v3, "bool"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         const-string v0, "value"
    //         invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const-string v3, "bool[]"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_3
    //         const-string v1, "value"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         new-array v2, v2, [Z
    //         :goto_1
    //         array-length v3, v2
    //         if-ge v0, v3, :cond_2
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getBoolean(I)Z
    //         move-result v3
    //         aput-boolean v3, v2, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {p2, p1, v2}, Landroid/os/Bundle;->putBooleanArray(Ljava/lang/String;[Z)V
    //         goto :goto_0
    //         :cond_3
    //         const-string v3, "byte"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_4
    //         const-string v0, "value"
    //         invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    //         move-result v0
    //         int-to-byte v0, v0
    //         invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putByte(Ljava/lang/String;B)V
    //         goto :goto_0
    //         :cond_4
    //         const-string v3, "byte[]"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_6
    //         const-string v1, "value"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         new-array v2, v2, [B
    //         :goto_2
    //         array-length v3, v2
    //         if-ge v0, v3, :cond_5
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getInt(I)I
    //         move-result v3
    //         int-to-byte v3, v3
    //         aput-byte v3, v2, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_2
    //         :cond_5
    //         invoke-virtual {p2, p1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
    //         goto :goto_0
    //         :cond_6
    //         const-string v3, "short"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_7
    //         const-string v0, "value"
    //         invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    //         move-result v0
    //         int-to-short v0, v0
    //         invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putShort(Ljava/lang/String;S)V
    //         goto :goto_0
    //         :cond_7
    //         const-string v3, "short[]"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_9
    //         const-string v1, "value"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         new-array v2, v2, [S
    //         :goto_3
    //         array-length v3, v2
    //         if-ge v0, v3, :cond_8
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getInt(I)I
    //         move-result v3
    //         int-to-short v3, v3
    //         aput-short v3, v2, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_3
    //         :cond_8
    //         invoke-virtual {p2, p1, v2}, Landroid/os/Bundle;->putShortArray(Ljava/lang/String;[S)V
    //         goto/16 :goto_0
    //         :cond_9
    //         const-string v3, "int"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_a
    //         const-string v0, "value"
    //         invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    //         move-result v0
    //         invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         goto/16 :goto_0
    //         :cond_a
    //         const-string v3, "int[]"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_c
    //         const-string v1, "value"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         new-array v2, v2, [I
    //         :goto_4
    //         array-length v3, v2
    //         if-ge v0, v3, :cond_b
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getInt(I)I
    //         move-result v3
    //         aput v3, v2, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_4
    //         :cond_b
    //         invoke-virtual {p2, p1, v2}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V
    //         goto/16 :goto_0
    //         :cond_c
    //         const-string v3, "long"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_d
    //         const-string v0, "value"
    //         invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         invoke-virtual {p2, p1, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         goto/16 :goto_0
    //         :cond_d
    //         const-string v3, "long[]"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_f
    //         const-string v1, "value"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         new-array v2, v2, [J
    //         :goto_5
    //         array-length v3, v2
    //         if-ge v0, v3, :cond_e
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getLong(I)J
    //         move-result-wide v4
    //         aput-wide v4, v2, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_5
    //         :cond_e
    //         invoke-virtual {p2, p1, v2}, Landroid/os/Bundle;->putLongArray(Ljava/lang/String;[J)V
    //         goto/16 :goto_0
    //         :cond_f
    //         const-string v3, "float"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_10
    //         const-string v0, "value"
    //         invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
    //         move-result-wide v0
    //         double-to-float v0, v0
    //         invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V
    //         goto/16 :goto_0
    //         :cond_10
    //         const-string v3, "float[]"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_12
    //         const-string v1, "value"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         new-array v2, v2, [F
    //         :goto_6
    //         array-length v3, v2
    //         if-ge v0, v3, :cond_11
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getDouble(I)D
    //         move-result-wide v4
    //         double-to-float v3, v4
    //         aput v3, v2, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_6
    //         :cond_11
    //         invoke-virtual {p2, p1, v2}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V
    //         goto/16 :goto_0
    //         :cond_12
    //         const-string v3, "double"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_13
    //         const-string v0, "value"
    //         invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
    //         move-result-wide v0
    //         invoke-virtual {p2, p1, v0, v1}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V
    //         goto/16 :goto_0
    //         :cond_13
    //         const-string v3, "double[]"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_15
    //         const-string v1, "value"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
    //         move-result v2
    //         new-array v2, v2, [D
    //         :goto_7
    //         array-length v3, v2
    //         if-ge v0, v3, :cond_14
    //         invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getDouble(I)D
    //         move-result-wide v4
    //         aput-wide v4, v2, v0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_7
    //         :cond_14
    //         invoke-virtual {p2, p1, v2}, Landroid/os/Bundle;->putDoubleArray(Ljava/lang/String;[D)V
    //         goto/16 :goto_0
    //         :cond_15
    //         const-string v3, "char"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_16
    //         const-string v1, "value"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Ljava/lang/String;->length()I
    //         move-result v2
    //         if-ne v2, v6, :cond_0
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C
    //         move-result v0
    //         invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putChar(Ljava/lang/String;C)V
    //         goto/16 :goto_0
    //         :cond_16
    //         const-string v3, "char[]"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_19
    //         const-string v1, "value"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
    //         move-result v1
    //         new-array v3, v1, [C
    //         move v1, v0
    //         :goto_8
    //         array-length v4, v3
    //         if-ge v1, v4, :cond_18
    //         invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
    //         move-result-object v4
    //         if-eqz v4, :cond_17
    //         invoke-virtual {v4}, Ljava/lang/String;->length()I
    //         move-result v5
    //         if-ne v5, v6, :cond_17
    //         invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C
    //         move-result v4
    //         aput-char v4, v3, v1
    //         :cond_17
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_8
    //         :cond_18
    //         invoke-virtual {p2, p1, v3}, Landroid/os/Bundle;->putCharArray(Ljava/lang/String;[C)V
    //         goto/16 :goto_0
    //         :cond_19
    //         const-string v3, "string"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1a
    //         const-string v0, "value"
    //         invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         goto/16 :goto_0
    //         :cond_1a
    //         const-string v3, "stringList"
    //         invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1d
    //         const-string v1, "value"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
    //         move-result v3
    //         new-instance v4, Ljava/util/ArrayList;
    //         invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V
    //         move v1, v0
    //         :goto_9
    //         if-ge v1, v3, :cond_1c
    //         invoke-virtual {v2, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         sget-object v5, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;
    //         if-ne v0, v5, :cond_1b
    //         const/4 v0, 0x0
    //         :goto_a
    //         invoke-virtual {v4, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_9
    //         :cond_1b
    //         check-cast v0, Ljava/lang/String;
    //         goto :goto_a
    //         :cond_1c
    //         invoke-virtual {p2, p1, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto/16 :goto_0
    //         :cond_1d
    //         const-string v0, "enum"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         const-string v0, "enumType"
    //         invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v0
    //         const-string v1, "value"
    //         invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
    //         :try_end_0
    //         .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    //         goto/16 :goto_0
    //         :catch_0
    //         move-exception v0
    //         goto/16 :goto_0
    //         :catch_1
    //         move-exception v0
    //         goto/16 :goto_0
    */

    private fun serializeKey(p0: String, p1: android.os.Bundle, p2: android.content.SharedPreferences.Editor) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;Landroid/content/SharedPreferences$Editor;)V */ }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         const/4 v3, 0x0
    //         invoke-virtual {p2, p1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         new-instance v4, Lorg/json/JSONObject;
    //         invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V
    //         instance-of v2, v0, Ljava/lang/Byte;
    //         if-eqz v2, :cond_3
    //         const-string v2, "byte"
    //         const-string v3, "value"
    //         check-cast v0, Ljava/lang/Byte;
    //         invoke-virtual {v0}, Ljava/lang/Byte;->intValue()I
    //         move-result v0
    //         invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-object v0, v1
    //         move-object v1, v2
    //         :goto_1
    //         if-eqz v1, :cond_0
    //         const-string v2, "valueType"
    //         invoke-virtual {v4, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         if-eqz v0, :cond_2
    //         const-string v1, "value"
    //         invoke-virtual {v4, v1, v0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_2
    //         invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p3, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //         goto :goto_0
    //         :cond_3
    //         instance-of v2, v0, Ljava/lang/Short;
    //         if-eqz v2, :cond_4
    //         const-string v2, "short"
    //         const-string v3, "value"
    //         check-cast v0, Ljava/lang/Short;
    //         invoke-virtual {v0}, Ljava/lang/Short;->intValue()I
    //         move-result v0
    //         invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-object v0, v1
    //         move-object v1, v2
    //         goto :goto_1
    //         :cond_4
    //         instance-of v2, v0, Ljava/lang/Integer;
    //         if-eqz v2, :cond_5
    //         const-string v2, "int"
    //         const-string v3, "value"
    //         check-cast v0, Ljava/lang/Integer;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-object v0, v1
    //         move-object v1, v2
    //         goto :goto_1
    //         :cond_5
    //         instance-of v2, v0, Ljava/lang/Long;
    //         if-eqz v2, :cond_6
    //         const-string v2, "long"
    //         const-string v3, "value"
    //         check-cast v0, Ljava/lang/Long;
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v6
    //         invoke-virtual {v4, v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         move-object v0, v1
    //         move-object v1, v2
    //         goto :goto_1
    //         :cond_6
    //         instance-of v2, v0, Ljava/lang/Float;
    //         if-eqz v2, :cond_7
    //         const-string v2, "float"
    //         const-string v3, "value"
    //         check-cast v0, Ljava/lang/Float;
    //         invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D
    //         move-result-wide v6
    //         invoke-virtual {v4, v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    //         move-object v0, v1
    //         move-object v1, v2
    //         goto :goto_1
    //         :cond_7
    //         instance-of v2, v0, Ljava/lang/Double;
    //         if-eqz v2, :cond_8
    //         const-string v2, "double"
    //         const-string v3, "value"
    //         check-cast v0, Ljava/lang/Double;
    //         invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D
    //         move-result-wide v6
    //         invoke-virtual {v4, v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    //         move-object v0, v1
    //         move-object v1, v2
    //         goto :goto_1
    //         :cond_8
    //         instance-of v2, v0, Ljava/lang/Boolean;
    //         if-eqz v2, :cond_9
    //         const-string v2, "bool"
    //         const-string v3, "value"
    //         check-cast v0, Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         move-object v0, v1
    //         move-object v1, v2
    //         goto/16 :goto_1
    //         :cond_9
    //         instance-of v2, v0, Ljava/lang/Character;
    //         if-eqz v2, :cond_a
    //         const-string v2, "char"
    //         const-string v3, "value"
    //         invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         move-object v0, v1
    //         move-object v1, v2
    //         goto/16 :goto_1
    //         :cond_a
    //         instance-of v2, v0, Ljava/lang/String;
    //         if-eqz v2, :cond_b
    //         const-string v2, "string"
    //         const-string v3, "value"
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         move-object v0, v1
    //         move-object v1, v2
    //         goto/16 :goto_1
    //         :cond_b
    //         instance-of v2, v0, Ljava/lang/Enum;
    //         if-eqz v2, :cond_c
    //         const-string v2, "enum"
    //         const-string v3, "value"
    //         invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v3, "enumType"
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v4, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         move-object v0, v1
    //         move-object v1, v2
    //         goto/16 :goto_1
    //         :cond_c
    //         new-instance v2, Lorg/json/JSONArray;
    //         invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V
    //         instance-of v5, v0, [B
    //         if-eqz v5, :cond_e
    //         const-string v1, "byte[]"
    //         check-cast v0, [B
    //         check-cast v0, [B
    //         array-length v5, v0
    //         :goto_2
    //         if-ge v3, v5, :cond_d
    //         aget-byte v6, v0, v3
    //         invoke-virtual {v2, v6}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_2
    //         :cond_d
    //         move-object v0, v2
    //         goto/16 :goto_1
    //         :cond_e
    //         instance-of v5, v0, [S
    //         if-eqz v5, :cond_10
    //         const-string v1, "short[]"
    //         check-cast v0, [S
    //         check-cast v0, [S
    //         array-length v5, v0
    //         :goto_3
    //         if-ge v3, v5, :cond_f
    //         aget-short v6, v0, v3
    //         invoke-virtual {v2, v6}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_3
    //         :cond_f
    //         move-object v0, v2
    //         goto/16 :goto_1
    //         :cond_10
    //         instance-of v5, v0, [I
    //         if-eqz v5, :cond_12
    //         const-string v1, "int[]"
    //         check-cast v0, [I
    //         check-cast v0, [I
    //         array-length v5, v0
    //         :goto_4
    //         if-ge v3, v5, :cond_11
    //         aget v6, v0, v3
    //         invoke-virtual {v2, v6}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_4
    //         :cond_11
    //         move-object v0, v2
    //         goto/16 :goto_1
    //         :cond_12
    //         instance-of v5, v0, [J
    //         if-eqz v5, :cond_14
    //         const-string v1, "long[]"
    //         check-cast v0, [J
    //         check-cast v0, [J
    //         array-length v5, v0
    //         :goto_5
    //         if-ge v3, v5, :cond_13
    //         aget-wide v6, v0, v3
    //         invoke-virtual {v2, v6, v7}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_5
    //         :cond_13
    //         move-object v0, v2
    //         goto/16 :goto_1
    //         :cond_14
    //         instance-of v5, v0, [F
    //         if-eqz v5, :cond_16
    //         const-string v1, "float[]"
    //         check-cast v0, [F
    //         check-cast v0, [F
    //         array-length v5, v0
    //         :goto_6
    //         if-ge v3, v5, :cond_15
    //         aget v6, v0, v3
    //         float-to-double v6, v6
    //         invoke-virtual {v2, v6, v7}, Lorg/json/JSONArray;->put(D)Lorg/json/JSONArray;
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_6
    //         :cond_15
    //         move-object v0, v2
    //         goto/16 :goto_1
    //         :cond_16
    //         instance-of v5, v0, [D
    //         if-eqz v5, :cond_18
    //         const-string v1, "double[]"
    //         check-cast v0, [D
    //         check-cast v0, [D
    //         array-length v5, v0
    //         :goto_7
    //         if-ge v3, v5, :cond_17
    //         aget-wide v6, v0, v3
    //         invoke-virtual {v2, v6, v7}, Lorg/json/JSONArray;->put(D)Lorg/json/JSONArray;
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_7
    //         :cond_17
    //         move-object v0, v2
    //         goto/16 :goto_1
    //         :cond_18
    //         instance-of v5, v0, [Z
    //         if-eqz v5, :cond_1a
    //         const-string v1, "bool[]"
    //         check-cast v0, [Z
    //         check-cast v0, [Z
    //         array-length v5, v0
    //         :goto_8
    //         if-ge v3, v5, :cond_19
    //         aget-boolean v6, v0, v3
    //         invoke-virtual {v2, v6}, Lorg/json/JSONArray;->put(Z)Lorg/json/JSONArray;
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_8
    //         :cond_19
    //         move-object v0, v2
    //         goto/16 :goto_1
    //         :cond_1a
    //         instance-of v5, v0, [C
    //         if-eqz v5, :cond_1c
    //         const-string v1, "char[]"
    //         check-cast v0, [C
    //         check-cast v0, [C
    //         array-length v5, v0
    //         :goto_9
    //         if-ge v3, v5, :cond_1b
    //         aget-char v6, v0, v3
    //         invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;
    //         move-result-object v6
    //         invoke-virtual {v2, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_9
    //         :cond_1b
    //         move-object v0, v2
    //         goto/16 :goto_1
    //         :cond_1c
    //         instance-of v3, v0, Ljava/util/List;
    //         if-eqz v3, :cond_1f
    //         const-string v1, "stringList"
    //         check-cast v0, Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_a
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1e
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-nez v0, :cond_1d
    //         sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;
    //         :cond_1d
    //         invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         goto :goto_a
    //         :cond_1e
    //         move-object v0, v2
    //         goto/16 :goto_1
    //         :cond_1f
    //         move-object v0, v1
    //         goto/16 :goto_1
    */

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->cache:Landroid/content/SharedPreferences;
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    //         return-void
    */

    public fun load(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 7
    //         new-instance v1, Landroid/os/Bundle;
    //         invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
    //         iget-object v0, p0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->cache:Landroid/content/SharedPreferences;
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
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
    //         :try_start_0
    //         invoke-direct {p0, v0, v1}, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->deserializeKey(Ljava/lang/String;Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         const/4 v3, 0x5
    //         sget-object v4, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->TAG:Ljava/lang/String;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Error reading cached value for key: \'"
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v5, "\' -- "
    //         invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v3, v4, v0}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         move-object v0, v1
    //         goto :goto_1
    */

    public fun save(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 7
    //         const-string v0, "bundle"
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->cache:Landroid/content/SharedPreferences;
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v1
    //         invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
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
    //         :try_start_0
    //         invoke-direct {p0, v0, p1, v1}, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->serializeKey(Ljava/lang/String;Landroid/os/Bundle;Landroid/content/SharedPreferences$Editor;)V
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;
    //         const/4 v3, 0x5
    //         sget-object v4, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->TAG:Ljava/lang/String;
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "Error processing value for key: \'"
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v5, "\' -- "
    //         invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v3, v4, v0}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         :goto_1
    //         return-void
    //         :cond_0
    //         invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    //         goto :goto_1
    */

    companion object {
    private val DEFAULT_CACHE_KEY: String = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY"
    private val JSON_VALUE: String = "value"
    private val JSON_VALUE_ENUM_TYPE: String = "enumType"
    private val JSON_VALUE_TYPE: String = "valueType"
    private val TAG: String = null!!
    private val TYPE_BOOLEAN: String = "bool"
    private val TYPE_BOOLEAN_ARRAY: String = "bool[]"
    private val TYPE_BYTE: String = "byte"
    private val TYPE_BYTE_ARRAY: String = "byte[]"
    private val TYPE_CHAR: String = "char"
    private val TYPE_CHAR_ARRAY: String = "char[]"
    private val TYPE_DOUBLE: String = "double"
    private val TYPE_DOUBLE_ARRAY: String = "double[]"
    private val TYPE_ENUM: String = "enum"
    private val TYPE_FLOAT: String = "float"
    private val TYPE_FLOAT_ARRAY: String = "float[]"
    private val TYPE_INTEGER: String = "int"
    private val TYPE_INTEGER_ARRAY: String = "int[]"
    private val TYPE_LONG: String = "long"
    private val TYPE_LONG_ARRAY: String = "long[]"
    private val TYPE_SHORT: String = "short"
    private val TYPE_SHORT_ARRAY: String = "short[]"
    private val TYPE_STRING: String = "string"
    private val TYPE_STRING_LIST: String = "stringList"
    }
}
