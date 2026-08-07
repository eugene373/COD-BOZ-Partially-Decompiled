package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 0 fields, 9 methods.

open class df_a: com.google.android.gms.analytics.Logger {
    constructor()

    public fun error(exception: Exception) { /* TODO(body): (Ljava/lang/Exception;)V */ }
    /*
    //         .locals 1
    //         const-string v0, ""
    //         invoke-static {v0, p1}, Lcom/google/android/gms/tagmanager/bh;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         return-void
    */

    public fun error(message: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         return-void
    */

    public fun getLogLevel(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/tagmanager/bh;->getLogLevel()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/df$a;->fn(I)I
    //         move-result v0
    //         return v0
    */

    public fun info(message: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Lcom/google/android/gms/tagmanager/bh;->U(Ljava/lang/String;)V
    //         return-void
    */

    public fun setLogLevel(logLevel: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         const-string v0, "GA uses GTM logger. Please use TagManager.setLogLevel(int) instead."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         return-void
    */

    public fun verbose(message: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Lcom/google/android/gms/tagmanager/bh;->V(Ljava/lang/String;)V
    //         return-void
    */

    public fun warn(message: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         return-void
    */

    companion object {
    private @JvmStatic fun fn(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x3
    //         packed-switch p0, :pswitch_data_0
    //         :goto_0
    //         :pswitch_0
    //         return v0
    //         :pswitch_1
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         :pswitch_2
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :pswitch_3
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x2
    //             :pswitch_3
    //             :pswitch_2
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_0
    //         .end packed-switch
    */

    }
}
