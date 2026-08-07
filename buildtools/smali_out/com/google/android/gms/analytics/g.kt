package com.google.android.gms.analytics

// Auto-emitted from smali.
// 6 fields, 7 methods.

open class g: com.google.android.gms.analytics.l {
    protected var xL: String
    protected var xM: String
    protected var xN: String
    protected var xO: String

    protected constructor()

    private constructor(p0: android.content.Context)

    public fun ac(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         const-string v0, "&an"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "&av"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "&aid"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "&aiid"
    //         invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getValue(field: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         if-nez p1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const-string v1, "&an"
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/g;->xL:Ljava/lang/String;
    //         goto :goto_0
    //         :cond_2
    //         const-string v1, "&av"
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/g;->xM:Ljava/lang/String;
    //         goto :goto_0
    //         :cond_3
    //         const-string v1, "&aid"
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/g;->xN:Ljava/lang/String;
    //         goto :goto_0
    //         :cond_4
    //         const-string v1, "&aiid"
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/g;->xO:Ljava/lang/String;
    //         goto :goto_0
    */

    companion object {
    private var xP: com.google.android.gms.analytics.g
    private var xz: Object

    public @JvmStatic fun dP(): com.google.android.gms.analytics.g { return TODO("body: ()Lcom/google/android/gms/analytics/g;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/analytics/g;->xP:Lcom/google/android/gms/analytics/g;
    //         return-object v0
    */

    public @JvmStatic fun y(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/google/android/gms/analytics/g;->xz:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/analytics/g;->xP:Lcom/google/android/gms/analytics/g;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/analytics/g;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/g;-><init>(Landroid/content/Context;)V
    //         sput-object v0, Lcom/google/android/gms/analytics/g;->xP:Lcom/google/android/gms/analytics/g;
    //         :cond_0
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    }
}
