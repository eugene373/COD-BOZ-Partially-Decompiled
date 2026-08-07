package android.support.v4.net

// Auto-emitted from smali source: ConnectivityManagerCompat.java.
// 1 fields, 4 methods.

open class ConnectivityManagerCompat {
    public constructor()

    companion object {
    private val IMPL: android.support.v4.net.ConnectivityManagerCompat.ConnectivityManagerCompatImpl = null!!

    public @JvmStatic fun getNetworkInfoFromBroadcast(cm: android.net.ConnectivityManager, intent: android.content.Intent): android.net.NetworkInfo { return TODO("body: (Landroid/net/ConnectivityManager;Landroid/content/Intent;)Landroid/net/NetworkInfo;") }
    /*
    //         .locals 2
    //         const-string v1, "networkInfo"
    //         invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/NetworkInfo;
    //         .local v0, "info":Landroid/net/NetworkInfo;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
    //         move-result-object v1
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun isActiveNetworkMetered(cm: android.net.ConnectivityManager): Boolean { return TODO("body: (Landroid/net/ConnectivityManager;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/net/ConnectivityManagerCompat;->IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;->isActiveNetworkMetered(Landroid/net/ConnectivityManager;)Z
    //         move-result v0
    //         return v0
    */

    }
}
