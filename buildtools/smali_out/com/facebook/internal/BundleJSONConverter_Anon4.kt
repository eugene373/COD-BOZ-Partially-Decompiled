package com.facebook.internal

// Auto-emitted from smali source: BundleJSONConverter.java.
// 0 fields, 3 methods.

class BundleJSONConverter_Anon4: com.facebook.internal.BundleJSONConverter.Setter {
    constructor()

    public fun setOnBundle(p0: android.os.Bundle, p1: String, p2: Object) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         check-cast p3, Ljava/lang/Double;
    //         invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D
    //         move-result-wide v0
    //         invoke-virtual {p1, p2, v0, v1}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V
    //         return-void
    */

    public fun setOnJSON(p0: org.json.JSONObject, p1: String, p2: Object) { /* TODO(body): (Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         return-void
    */

}
