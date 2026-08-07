package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 2 methods.

open class de_Anon1: android.content.DialogInterface.OnClickListener {
    val qY: String
    val qZ: String
    val ra: com.google.android.gms.internal.de

    constructor(p0: com.google.android.gms.internal.de, p1: String, p2: String)

    public fun onClick(dialog: android.content.DialogInterface, which: Int) { /* TODO(body): (Landroid/content/DialogInterface;I)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/de$1;->ra:Lcom/google/android/gms/internal/de;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/de;->a(Lcom/google/android/gms/internal/de;)Landroid/content/Context;
    //         move-result-object v0
    //         const-string v1, "download"
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/DownloadManager;
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/de$1;->ra:Lcom/google/android/gms/internal/de;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/de$1;->qY:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/de$1;->qZ:Ljava/lang/String;
    //         invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/de;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J
    //         :try_end_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "Could not store picture."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V
    //         goto :goto_0
    */

}
