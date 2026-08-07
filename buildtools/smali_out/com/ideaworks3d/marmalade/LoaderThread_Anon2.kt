package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderThread.java.
// 1 fields, 2 methods.

open class LoaderThread_Anon2: android.content.BroadcastReceiver() {
    val this$0: com.ideaworks3d.marmalade.LoaderThread

    constructor(p0: com.ideaworks3d.marmalade.LoaderThread)

    public fun onReceive(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "connectivity"
    //         invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/ConnectivityManager;
    //         invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$2;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         const/4 v1, 0x1
    //         invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$900(Lcom/ideaworks3d/marmalade/LoaderThread;Z)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread$2;->this$0:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->access$900(Lcom/ideaworks3d/marmalade/LoaderThread;Z)V
    //         goto :goto_0
    */

}
