package com.google.android.gms.ads

// Auto-emitted from smali.
// 3 fields, 13 methods.

class AdActivity: android.app.Activity() {
    private var lc: com.google.android.gms.internal.ds

    public constructor()

    private fun U() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ds;->U()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward setContentViewSet to ad overlay:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    protected fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
    //         invoke-static {p0}, Lcom/google/android/gms/internal/dr;->b(Landroid/app/Activity;)Lcom/google/android/gms/internal/ds;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         if-nez v0, :cond_0
    //         const-string v0, "Could not create ad overlay."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdActivity;->finish()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ds;->onCreate(Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward onCreate to ad overlay:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdActivity;->finish()V
    //         goto :goto_0
    */

    protected fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ds;->onDestroy()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward onDestroy to ad overlay:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    protected fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ds;->onPause()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-super {p0}, Landroid/app/Activity;->onPause()V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward onPause to ad overlay:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdActivity;->finish()V
    //         goto :goto_0
    */

    protected fun onRestart() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/app/Activity;->onRestart()V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ds;->onRestart()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward onRestart to ad overlay:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdActivity;->finish()V
    //         goto :goto_0
    */

    protected fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/app/Activity;->onResume()V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ds;->onResume()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward onResume to ad overlay:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdActivity;->finish()V
    //         goto :goto_0
    */

    protected fun onSaveInstanceState(outState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ds;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward onSaveInstanceState to ad overlay:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdActivity;->finish()V
    //         goto :goto_0
    */

    protected fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/app/Activity;->onStart()V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ds;->onStart()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward onStart to ad overlay:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdActivity;->finish()V
    //         goto :goto_0
    */

    protected fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/ads/AdActivity;->lc:Lcom/google/android/gms/internal/ds;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ds;->onStop()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-super {p0}, Landroid/app/Activity;->onStop()V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Could not forward onStop to ad overlay:"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/ads/AdActivity;->finish()V
    //         goto :goto_0
    */

    public fun setContentView(layoutResID: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(I)V
    //         invoke-direct {p0}, Lcom/google/android/gms/ads/AdActivity;->U()V
    //         return-void
    */

    public fun setContentView(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V
    //         invoke-direct {p0}, Lcom/google/android/gms/ads/AdActivity;->U()V
    //         return-void
    */

    public fun setContentView(view: android.view.View, params: android.view.ViewGroup.LayoutParams) { /* TODO(body): (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1, p2}, Landroid/app/Activity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //         invoke-direct {p0}, Lcom/google/android/gms/ads/AdActivity;->U()V
    //         return-void
    */

    companion object {
    @JvmField public val CLASS_NAME: String = "com.google.android.gms.ads.AdActivity"
    @JvmField public val SIMPLE_CLASS_NAME: String = "AdActivity"
    }
}
