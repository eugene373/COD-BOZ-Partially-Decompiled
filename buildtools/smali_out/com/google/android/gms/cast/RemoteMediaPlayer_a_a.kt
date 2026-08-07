package com.google.android.gms.cast

// Auto-emitted from smali.
// 2 fields, 3 methods.

class RemoteMediaPlayer_a_a: com.google.android.gms.common.api.ResultCallback {
    private val FZ: Long
    val Ga: com.google.android.gms.cast.RemoteMediaPlayer.a

    constructor(p0: com.google.android.gms.cast.RemoteMediaPlayer.a, p1: Long)

    public fun k(p0: com.google.android.gms.common.api.Status) { /* TODO(body): (Lcom/google/android/gms/common/api/Status;)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$a$a;->Ga:Lcom/google/android/gms/cast/RemoteMediaPlayer$a;
    //         iget-object v0, v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$a;->FK:Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //         invoke-static {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->e(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/internal/iq;
    //         move-result-object v0
    //         iget-wide v2, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$a$a;->FZ:J
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I
    //         move-result v1
    //         invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/internal/iq;->b(JI)V
    //         :cond_0
    //         return-void
    */

    public fun onResult(x0: com.google.android.gms.common.api.Result) { /* TODO(body): (Lcom/google/android/gms/common/api/Result;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/common/api/Status;
    //         .end local p1    # "x0":Lcom/google/android/gms/common/api/Result;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$a$a;->k(Lcom/google/android/gms/common/api/Status;)V
    //         return-void
    */

}
