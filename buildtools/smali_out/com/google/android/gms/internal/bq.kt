package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 3 methods.

open class bq {
    private var pw: com.google.android.gms.internal.u
    private var px: com.google.android.gms.internal.ah
    private var py: org.json.JSONObject

    public constructor(p0: com.google.android.gms.internal.u, p1: com.google.android.gms.internal.ah, p2: org.json.JSONObject)

    public fun as() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bq;->pw:Lcom/google/android/gms/internal/u;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/u;->aj()V
    //         return-void
    */

    public fun b(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         const-string v1, "asset"
    //         invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         const-string v1, "template"
    //         invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    //         const-string v2, "ad"
    //         iget-object v3, p0, Lcom/google/android/gms/internal/bq;->py:Lorg/json/JSONObject;
    //         invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v2, "click"
    //         invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/bq;->px:Lcom/google/android/gms/internal/ah;
    //         const-string v2, "google.afma.nativeAds.handleClick"
    //         invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ah;->a(Ljava/lang/String;Lorg/json/JSONObject;)V
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Unable to create click JSON."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

}
