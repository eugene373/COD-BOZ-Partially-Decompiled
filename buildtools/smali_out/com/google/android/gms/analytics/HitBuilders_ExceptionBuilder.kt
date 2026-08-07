package com.google.android.gms.analytics

// Auto-emitted from smali.
// 0 fields, 4 methods.

open class HitBuilders_ExceptionBuilder: com.google.android.gms.analytics.HitBuilders.HitBuilder() {
    public constructor()

    public fun build(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         invoke-super {p0}, Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;->build()Ljava/util/Map;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setDescription(description: String): com.google.android.gms.analytics.HitBuilders.ExceptionBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&exd"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setFatal(fatal: Boolean): com.google.android.gms.analytics.HitBuilders.ExceptionBuilder { return TODO("body: (Z)Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;") }
    /*
    //         .locals 2
    //         const-string v0, "&exf"
    //         invoke-static {p1}, Lcom/google/android/gms/analytics/aj;->C(Z)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

}
