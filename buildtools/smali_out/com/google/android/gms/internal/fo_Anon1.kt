package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 2 methods.

open class fo_Anon1: com.google.android.gms.internal.by {
    val ub: com.google.android.gms.internal.ah
    val uc: com.google.android.gms.internal.gk
    val ud: com.google.android.gms.internal.fo

    constructor(p0: com.google.android.gms.internal.fo, p1: com.google.android.gms.internal.ah, p2: com.google.android.gms.internal.gk)

    public fun a(p0: com.google.android.gms.internal.gv, p1: java.util.Map) { /* TODO(body): (Lcom/google/android/gms/internal/gv;Ljava/util/Map;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/internal/gv;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fo$1;->ub:Lcom/google/android/gms/internal/ah;
    //         const-string v1, "/nativeAdPreProcess"
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ah;->g(Ljava/lang/String;)V
    //         :try_start_0
    //         const-string v0, "success"
    //         invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fo$1;->uc:Lcom/google/android/gms/internal/gk;
    //         new-instance v2, Lorg/json/JSONObject;
    //         invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v0, "ads"
    //         invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v0
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/gk;->a(Ljava/lang/Object;)V
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Malformed native JSON response."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fo$1;->ud:Lcom/google/android/gms/internal/fo;
    //         invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/fo;->s(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fo$1;->ud:Lcom/google/android/gms/internal/fo;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/fo;->cH()Z
    //         move-result v0
    //         const-string v1, "Unable to set the ad state error!"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fo$1;->uc:Lcom/google/android/gms/internal/gk;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gk;->a(Ljava/lang/Object;)V
    //         goto :goto_0
    */

}
