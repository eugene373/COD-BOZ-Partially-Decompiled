package com.google.android.gms.common.api

// Auto-emitted from smali.
// 3 fields, 2 methods.

open class d_c: Runnable {
    private val JK: Int
    private val JL: com.google.android.gms.common.ConnectionResult
    val JM: com.google.android.gms.common.api.d

    public constructor(p0: com.google.android.gms.common.api.d, p1: Int, p2: com.google.android.gms.common.ConnectionResult)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$c;->JL:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$c;->JM:Lcom/google/android/gms/common/api/d;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/d;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/d$c;->JM:Lcom/google/android/gms/common/api/d;
    //         invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I
    //         move-result v0
    //         add-int/lit8 v0, v0, 0x1
    //         shl-int/lit8 v0, v0, 0x10
    //         add-int/lit8 v0, v0, 0x1
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/d$c;->JL:Lcom/google/android/gms/common/ConnectionResult;
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/d$c;->JM:Lcom/google/android/gms/common/api/d;
    //         invoke-virtual {v2}, Lcom/google/android/gms/common/api/d;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v2
    //         invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/common/ConnectionResult;->startResolutionForResult(Landroid/app/Activity;I)V
    //         :try_end_0
    //         .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$c;->JM:Lcom/google/android/gms/common/api/d;
    //         invoke-static {v0}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d;)V
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$c;->JL:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isUserRecoverableError(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$c;->JL:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->getErrorCode()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/d$c;->JM:Lcom/google/android/gms/common/api/d;
    //         invoke-virtual {v1}, Lcom/google/android/gms/common/api/d;->getActivity()Landroid/support/v4/app/FragmentActivity;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/d$c;->JM:Lcom/google/android/gms/common/api/d;
    //         const/4 v3, 0x2
    //         iget-object v4, p0, Lcom/google/android/gms/common/api/d$c;->JM:Lcom/google/android/gms/common/api/d;
    //         invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->showErrorDialogFragment(ILandroid/app/Activity;Landroid/support/v4/app/Fragment;ILandroid/content/DialogInterface$OnCancelListener;)Z
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$c;->JM:Lcom/google/android/gms/common/api/d;
    //         iget v1, p0, Lcom/google/android/gms/common/api/d$c;->JK:I
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/d$c;->JL:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/api/d;->a(Lcom/google/android/gms/common/api/d;ILcom/google/android/gms/common/ConnectionResult;)V
    //         goto :goto_0
    */

}
