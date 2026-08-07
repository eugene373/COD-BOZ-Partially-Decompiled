package com.facebook

// Auto-emitted from smali source: InsightsLogger.java.
// 4 fields, 7 methods.

open class InsightsLogger {
    private var appEventsLogger: com.facebook.AppEventsLogger

    private constructor(p0: android.content.Context, p1: String, p2: com.facebook.Session)

    public fun logConversionPixel(p0: String, p1: Double) { /* TODO(body): (Ljava/lang/String;D)V */ }
    /*
    //         .locals 4
    //         if-nez p1, :cond_0
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->DEVELOPER_ERRORS:Lcom/facebook/LoggingBehavior;
    //         const-string v1, "Insights"
    //         const-string v2, "pixelID cannot be null"
    //         invoke-static {v0, v1, v2}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "fb_offsite_pixel_id"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "fb_offsite_pixel_value"
    //         invoke-virtual {v0, v1, p2, p3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V
    //         iget-object v1, p0, Lcom/facebook/InsightsLogger;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         const-string v2, "fb_log_offsite_pixel"
    //         invoke-virtual {v1, v2, p2, p3, v0}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;DLandroid/os/Bundle;)V
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->eagerFlush()V
    //         goto :goto_0
    */

    public fun logPurchase(p0: java.math.BigDecimal, p1: java.util.Currency) { /* TODO(body): (Ljava/math/BigDecimal;Ljava/util/Currency;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/InsightsLogger;->logPurchase(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun logPurchase(p0: java.math.BigDecimal, p1: java.util.Currency, p2: android.os.Bundle) { /* TODO(body): (Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/InsightsLogger;->appEventsLogger:Lcom/facebook/AppEventsLogger;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/AppEventsLogger;->logPurchase(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V
    //         return-void
    */

    companion object {
    private val EVENT_NAME_LOG_CONVERSION_PIXEL: String = "fb_log_offsite_pixel"
    private val EVENT_PARAMETER_PIXEL_ID: String = "fb_offsite_pixel_id"
    private val EVENT_PARAMETER_PIXEL_VALUE: String = "fb_offsite_pixel_value"

    public @JvmStatic fun newLogger(p0: android.content.Context, p1: String): com.facebook.InsightsLogger { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/InsightsLogger;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         new-instance v0, Lcom/facebook/InsightsLogger;
    //         invoke-direct {v0, p0, v1, v1}, Lcom/facebook/InsightsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V
    //         return-object v0
    */

    public @JvmStatic fun newLogger(p0: android.content.Context, p1: String, p2: String): com.facebook.InsightsLogger { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/InsightsLogger;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/facebook/InsightsLogger;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, p2, v1}, Lcom/facebook/InsightsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V
    //         return-object v0
    */

    public @JvmStatic fun newLogger(p0: android.content.Context, p1: String, p2: String, p3: com.facebook.Session): com.facebook.InsightsLogger { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/Session;)Lcom/facebook/InsightsLogger;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/facebook/InsightsLogger;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/facebook/InsightsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V
    //         return-object v0
    */

    }
}
