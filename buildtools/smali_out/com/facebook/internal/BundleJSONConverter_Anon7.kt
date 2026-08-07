package com.facebook.internal

// Auto-emitted from smali source: BundleJSONConverter.java.
// 0 fields, 3 methods.

class BundleJSONConverter_Anon7: com.facebook.internal.BundleJSONConverter.Setter {
    constructor()

    public fun setOnBundle(p0: android.os.Bundle, p1: String, p2: Object) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         check-cast p3, Lorg/json/JSONArray;
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {p3}, Lorg/json/JSONArray;->length()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p1, p2, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_1
    //         invoke-virtual {p3}, Lorg/json/JSONArray;->length()I
    //         move-result v0
    //         if-ge v1, v0, :cond_2
    //         invoke-virtual {p3, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v3, v0, Ljava/lang/String;
    //         if-eqz v3, :cond_1
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_1
    //         :cond_1
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Unexpected type in an array: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_2
    //         invoke-virtual {p1, p2, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         goto :goto_0
    */

    public fun setOnJSON(p0: org.json.JSONObject, p1: String, p2: Object) { /* TODO(body): (Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "JSONArray\'s are not supported in bundles."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

}
