package com.google.android.gms.analytics

// Auto-emitted from smali.
// 0 fields, 7 methods.

open class HitBuilders_EventBuilder: com.google.android.gms.analytics.HitBuilders.HitBuilder() {
    public constructor()

    public constructor(category: String, action: String)

    public fun build(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         invoke-super {p0}, Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;->build()Ljava/util/Map;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setAction(action: String): com.google.android.gms.analytics.HitBuilders.EventBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&ea"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setCategory(category: String): com.google.android.gms.analytics.HitBuilders.EventBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&ec"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setLabel(label: String): com.google.android.gms.analytics.HitBuilders.EventBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&el"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setValue(value: Long): com.google.android.gms.analytics.HitBuilders.EventBuilder { return TODO("body: (J)Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;") }
    /*
    //         .locals 3
    //         const-string v0, "&ev"
    //         invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/HitBuilders$EventBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

}
