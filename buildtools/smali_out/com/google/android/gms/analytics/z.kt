package com.google.android.gms.analytics

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class z {
    companion object {
    private var AT: com.google.android.gms.analytics.GoogleAnalytics

    public @JvmStatic fun T(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/analytics/z;->getLogger()Lcom/google/android/gms/analytics/Logger;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p0}, Lcom/google/android/gms/analytics/Logger;->error(Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun U(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/analytics/z;->getLogger()Lcom/google/android/gms/analytics/Logger;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p0}, Lcom/google/android/gms/analytics/Logger;->info(Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun V(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/analytics/z;->getLogger()Lcom/google/android/gms/analytics/Logger;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p0}, Lcom/google/android/gms/analytics/Logger;->verbose(Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun W(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/analytics/z;->getLogger()Lcom/google/android/gms/analytics/Logger;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p0}, Lcom/google/android/gms/analytics/Logger;->warn(Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun eK(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-static {}, Lcom/google/android/gms/analytics/z;->getLogger()Lcom/google/android/gms/analytics/Logger;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-static {}, Lcom/google/android/gms/analytics/z;->getLogger()Lcom/google/android/gms/analytics/Logger;
    //         move-result-object v1
    //         invoke-interface {v1}, Lcom/google/android/gms/analytics/Logger;->getLogLevel()I
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         return v0
    */

    private @JvmStatic fun getLogger(): com.google.android.gms.analytics.Logger { return TODO("body: ()Lcom/google/android/gms/analytics/Logger;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/analytics/z;->AT:Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         if-nez v0, :cond_0
    //         invoke-static {}, Lcom/google/android/gms/analytics/GoogleAnalytics;->eD()Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         move-result-object v0
    //         sput-object v0, Lcom/google/android/gms/analytics/z;->AT:Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/analytics/z;->AT:Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/google/android/gms/analytics/z;->AT:Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getLogger()Lcom/google/android/gms/analytics/Logger;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
