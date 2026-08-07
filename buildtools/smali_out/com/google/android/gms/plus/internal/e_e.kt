package com.google.android.gms.plus.internal

// Auto-emitted from smali.
// 2 fields, 2 methods.

class e_e: com.google.android.gms.plus.internal.a() {
    private val alv: com.google.android.gms.common.api.BaseImplementation.b
    val alw: com.google.android.gms.plus.internal.e

    public constructor(p0: com.google.android.gms.plus.internal.e, p1: com.google.android.gms.common.api.BaseImplementation.b)

    public fun a(p0: com.google.android.gms.common.data.DataHolder, p1: String) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V */ }
    /*
    //         .locals 7
    //         const/4 v1, 0x0
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->gy()Landroid/os/Bundle;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->gy()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v2, "pendingIntent"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/PendingIntent;
    //         :goto_0
    //         new-instance v3, Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->getStatusCode()I
    //         move-result v2
    //         invoke-direct {v3, v2, v1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V
    //         invoke-virtual {v3}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->isClosed()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V
    //         :cond_0
    //         move-object v4, v1
    //         :goto_1
    //         iget-object v6, p0, Lcom/google/android/gms/plus/internal/e$e;->alw:Lcom/google/android/gms/plus/internal/e;
    //         new-instance v0, Lcom/google/android/gms/plus/internal/e$f;
    //         iget-object v1, p0, Lcom/google/android/gms/plus/internal/e$e;->alw:Lcom/google/android/gms/plus/internal/e;
    //         iget-object v2, p0, Lcom/google/android/gms/plus/internal/e$e;->alv:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         move-object v5, p2
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/plus/internal/e$f;-><init>(Lcom/google/android/gms/plus/internal/e;Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V
    //         invoke-virtual {v6, v0}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    //         :cond_1
    //         move-object v4, p1
    //         goto :goto_1
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_0
    */

}
