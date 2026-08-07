package com.google.android.gms.analytics

// Auto-emitted from smali.
// 7 fields, 14 methods.

open class ai: com.google.android.gms.analytics.i {
    var BC: String
    var BD: Double
    var BE: Int
    var BF: Int
    var BG: Int
    var BH: Int
    var BI: java.util.Map

    constructor()

    public fun am(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ai;->BI:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         move-object v0, p1
    //         goto :goto_0
    */

    public fun eZ(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ai;->BC:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun fa(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ai;->BC:Ljava/lang/String;
    //         return-object v0
    */

    public fun fb(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/google/android/gms/analytics/ai;->BD:D
    //         const-wide/16 v2, 0x0
    //         cmpl-double v0, v0, v2
    //         if-ltz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun fc(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/analytics/ai;->BD:D
    //         return-wide v0
    */

    public fun fd(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/analytics/ai;->BE:I
    //         if-ltz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun fe(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/analytics/ai;->BF:I
    //         const/4 v1, -0x1
    //         if-eq v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun ff(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget v1, p0, Lcom/google/android/gms/analytics/ai;->BF:I
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun fg(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/analytics/ai;->BG:I
    //         const/4 v1, -0x1
    //         if-eq v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun fh(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget v1, p0, Lcom/google/android/gms/analytics/ai;->BG:I
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun fi(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget v1, p0, Lcom/google/android/gms/analytics/ai;->BH:I
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getSessionTimeout(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/analytics/ai;->BE:I
    //         return v0
    */

    public fun k(p0: android.app.Activity): String { return TODO("body: (Landroid/app/Activity;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/ai;->am(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
