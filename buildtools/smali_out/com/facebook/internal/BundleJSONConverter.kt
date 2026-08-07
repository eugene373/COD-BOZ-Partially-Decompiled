package com.facebook.internal

// Auto-emitted from smali source: BundleJSONConverter.java.
// 1 fields, 4 methods.

open class BundleJSONConverter {
    public constructor()

    companion object {
    private val SETTERS: java.util.Map = null!!

    public @JvmStatic fun convertToBundle(p0: org.json.JSONObject): android.os.Bundle { return TODO("body: (Lorg/json/JSONObject;)Landroid/os/Bundle;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v3, Landroid/os/Bundle;
    //         invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
    //         invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;
    //         move-result-object v4
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;
    //         if-eq v1, v2, :cond_0
    //         instance-of v2, v1, Lorg/json/JSONObject;
    //         if-eqz v2, :cond_1
    //         check-cast v1, Lorg/json/JSONObject;
    //         invoke-static {v1}, Lcom/facebook/internal/BundleJSONConverter;->convertToBundle(Lorg/json/JSONObject;)Landroid/os/Bundle;
    //         move-result-object v1
    //         invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    //         goto :goto_0
    //         :cond_1
    //         sget-object v2, Lcom/facebook/internal/BundleJSONConverter;->SETTERS:Ljava/util/Map;
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v5
    //         invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Lcom/facebook/internal/BundleJSONConverter$Setter;
    //         if-nez v2, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Unsupported type: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         invoke-interface {v2, v3, v0, v1}, Lcom/facebook/internal/BundleJSONConverter$Setter;->setOnBundle(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_3
    //         return-object v3
    */

    public @JvmStatic fun convertToJSON(p0: android.os.Bundle): org.json.JSONObject { return TODO("body: (Landroid/os/Bundle;)Lorg/json/JSONObject;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v3, Lorg/json/JSONObject;
    //         invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         instance-of v2, v1, Ljava/util/List;
    //         if-eqz v2, :cond_2
    //         new-instance v2, Lorg/json/JSONArray;
    //         invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V
    //         check-cast v1, Ljava/util/List;
    //         invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :goto_1
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         goto :goto_1
    //         :cond_1
    //         invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_0
    //         :cond_2
    //         instance-of v2, v1, Landroid/os/Bundle;
    //         if-eqz v2, :cond_3
    //         check-cast v1, Landroid/os/Bundle;
    //         invoke-static {v1}, Lcom/facebook/internal/BundleJSONConverter;->convertToJSON(Landroid/os/Bundle;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_0
    //         :cond_3
    //         sget-object v2, Lcom/facebook/internal/BundleJSONConverter;->SETTERS:Ljava/util/Map;
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v5
    //         invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Lcom/facebook/internal/BundleJSONConverter$Setter;
    //         if-nez v2, :cond_4
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Unsupported type: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_4
    //         invoke-interface {v2, v3, v0, v1}, Lcom/facebook/internal/BundleJSONConverter$Setter;->setOnJSON(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_5
    //         return-object v3
    */

    }
}
