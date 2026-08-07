package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

class e_f: android.content.ServiceConnection {
    val LF: com.google.android.gms.common.internal.e

    constructor(p0: com.google.android.gms.common.internal.e)

    public fun onServiceConnected(component: android.content.ComponentName, binder: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Lcom/google/android/gms/common/internal/e$f;, "Lcom/google/android/gms/common/internal/e<TT;>.f;"
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$f;->LF:Lcom/google/android/gms/common/internal/e;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/internal/e;->N(Landroid/os/IBinder;)V
    //         return-void
    */

    public fun onServiceDisconnected(component: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 4
    //         .local p0, "this":Lcom/google/android/gms/common/internal/e$f;, "Lcom/google/android/gms/common/internal/e<TT;>.f;"
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$f;->LF:Lcom/google/android/gms/common/internal/e;
    //         iget-object v0, v0, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/e$f;->LF:Lcom/google/android/gms/common/internal/e;
    //         iget-object v1, v1, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         const/4 v2, 0x4
    //         const/4 v3, 0x1
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    //         return-void
    */

}
