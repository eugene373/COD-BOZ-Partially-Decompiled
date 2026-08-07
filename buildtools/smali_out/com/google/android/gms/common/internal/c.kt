package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 4 fields, 3 methods.

open class c: android.content.DialogInterface.OnClickListener {
    private val Lt: android.support.v4.app.Fragment
    private val Lu: Int
    private val mIntent: android.content.Intent
    private val nr: android.app.Activity

    public constructor(p0: android.app.Activity, p1: android.content.Intent, p2: Int)

    public constructor(p0: android.support.v4.app.Fragment, p1: android.content.Intent, p2: Int)

    public fun onClick(dialog: android.content.DialogInterface, which: Int) { /* TODO(body): (Landroid/content/DialogInterface;I)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/c;->mIntent:Landroid/content/Intent;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/c;->Lt:Landroid/support/v4/app/Fragment;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/c;->Lt:Landroid/support/v4/app/Fragment;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/c;->mIntent:Landroid/content/Intent;
    //         iget v2, p0, Lcom/google/android/gms/common/internal/c;->Lu:I
    //         invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V
    //         :cond_0
    //         :goto_0
    //         invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V
    //         :goto_1
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/c;->mIntent:Landroid/content/Intent;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/c;->nr:Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/c;->mIntent:Landroid/content/Intent;
    //         iget v2, p0, Lcom/google/android/gms/common/internal/c;->Lu:I
    //         invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         :try_end_0
    //         .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "SettingsRedirect"
    //         const-string v1, "Can\'t redirect to app settings for Google Play services"
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_1
    */

}
