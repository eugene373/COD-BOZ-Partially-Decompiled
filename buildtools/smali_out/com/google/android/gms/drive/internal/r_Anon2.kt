package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class r_Anon2: com.google.android.gms.common.api.ResultCallback {
    val OL: com.google.android.gms.drive.internal.r

    constructor(p0: com.google.android.gms.drive.internal.r)

    public fun k(p0: com.google.android.gms.common.api.Status) { /* TODO(body): (Lcom/google/android/gms/common/api/Status;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "DriveContentsImpl"
    //         const-string v1, "Error discarding contents"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/v;->q(Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "DriveContentsImpl"
    //         const-string v1, "Contents discarded"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/drive/internal/v;->n(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun onResult(x0: com.google.android.gms.common.api.Result) { /* TODO(body): (Lcom/google/android/gms/common/api/Result;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/common/api/Status;
    //         .end local p1    # "x0":Lcom/google/android/gms/common/api/Result;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/r$2;->k(Lcom/google/android/gms/common/api/Status;)V
    //         return-void
    */

}
