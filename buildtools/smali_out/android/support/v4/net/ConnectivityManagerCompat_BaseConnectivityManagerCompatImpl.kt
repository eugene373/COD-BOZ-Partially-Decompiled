package android.support.v4.net

// Auto-emitted from smali source: ConnectivityManagerCompat.java.
// 0 fields, 2 methods.

open class ConnectivityManagerCompat_BaseConnectivityManagerCompatImpl: android.support.v4.net.ConnectivityManagerCompat.ConnectivityManagerCompatImpl {
    constructor()

    public fun isActiveNetworkMetered(cm: android.net.ConnectivityManager): Boolean { return TODO("body: (Landroid/net/ConnectivityManager;)Z") }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    //         move-result-object v0
    //         .local v0, "info":Landroid/net/NetworkInfo;
    //         if-nez v0, :cond_0
    //         :goto_0
    //         :pswitch_0
    //         return v2
    //         :cond_0
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
    //         move-result v1
    //         .local v1, "type":I
    //         packed-switch v1, :pswitch_data_0
    //         goto :goto_0
    //         :pswitch_1
    //         const/4 v2, 0x0
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

}
