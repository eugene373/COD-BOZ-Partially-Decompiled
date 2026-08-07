package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 2 methods.

open class gm_Anon1: android.content.DialogInterface.OnClickListener {
    val ww: String
    val wx: com.google.android.gms.internal.gm

    constructor(p0: com.google.android.gms.internal.gm, p1: String)

    public fun onClick(dialog: android.content.DialogInterface, which: Int) { /* TODO(body): (Landroid/content/DialogInterface;I)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gm$1;->wx:Lcom/google/android/gms/internal/gm;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gm;->a(Lcom/google/android/gms/internal/gm;)Landroid/content/Context;
    //         move-result-object v0
    //         new-instance v1, Landroid/content/Intent;
    //         const-string v2, "android.intent.action.SEND"
    //         invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v2, "text/plain"
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v1
    //         const-string v2, "android.intent.extra.TEXT"
    //         iget-object v3, p0, Lcom/google/android/gms/internal/gm$1;->ww:Ljava/lang/String;
    //         invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v1
    //         const-string v2, "Share via"
    //         invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    //         return-void
    */

}
