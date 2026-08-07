package com.google.android.gms.analytics

// Auto-emitted from smali.
// 0 fields, 7 methods.

open class HitBuilders_TimingBuilder: com.google.android.gms.analytics.HitBuilders.HitBuilder() {
    public constructor()

    public constructor(category: String, variable: String, value: Long)

    public fun build(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         invoke-super {p0}, Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;->build()Ljava/util/Map;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setCategory(category: String): com.google.android.gms.analytics.HitBuilders.TimingBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&utc"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setLabel(label: String): com.google.android.gms.analytics.HitBuilders.TimingBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&utl"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setValue(value: Long): com.google.android.gms.analytics.HitBuilders.TimingBuilder { return TODO("body: (J)Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;") }
    /*
    //         .locals 3
    //         const-string v0, "&utt"
    //         invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

    public fun setVariable(variable: String): com.google.android.gms.analytics.HitBuilders.TimingBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;") }
    /*
    //         .locals 1
    //         const-string v0, "&utv"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/HitBuilders$TimingBuilder;->set(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;
    //         return-object p0
    */

}
