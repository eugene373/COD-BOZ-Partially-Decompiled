package com.google.android.gms.cast

// Auto-emitted from smali.
// 5 fields, 3 methods.

open class RemoteMediaPlayer_Anon8: com.google.android.gms.cast.RemoteMediaPlayer.b() {
    val FK: com.google.android.gms.cast.RemoteMediaPlayer
    val FL: com.google.android.gms.common.api.GoogleApiClient
    val FS: org.json.JSONObject
    val FT: Long
    val FU: Int

    constructor(p0: com.google.android.gms.cast.RemoteMediaPlayer, p1: com.google.android.gms.common.api.GoogleApiClient, p2: Long, p3: Int, p4: org.json.JSONObject)

    protected fun a(p0: com.google.android.gms.common.api.Api.a) { /* TODO(body): (Lcom/google/android/gms/common/api/Api$a;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         check-cast p1, Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->a(Lcom/google/android/gms/internal/ij;)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.internal.ij) { /* TODO(body): (Lcom/google/android/gms/internal/ij;)V */ }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->FK:Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //         invoke-static {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->c(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Ljava/lang/Object;
    //         move-result-object v6
    //         monitor-enter v6
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->FK:Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //         invoke-static {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->d(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/RemoteMediaPlayer$a;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->FL:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$a;->b(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->FK:Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //         invoke-static {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->e(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/internal/iq;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->Gb:Lcom/google/android/gms/internal/is;
    //         iget-wide v2, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->FT:J
    //         iget v4, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->FU:I
    //         iget-object v5, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->FS:Lorg/json/JSONObject;
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/iq;->a(Lcom/google/android/gms/internal/is;JILorg/json/JSONObject;)J
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         :try_start_2
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->FK:Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //         invoke-static {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->d(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/RemoteMediaPlayer$a;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$a;->b(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    //         :goto_0
    //         monitor-exit v6
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         :try_start_3
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v1, 0x834
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->l(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/RemoteMediaPlayer$MediaChannelResult;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->b(Lcom/google/android/gms/common/api/Result;)V
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         :try_start_4
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->FK:Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //         invoke-static {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->d(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/RemoteMediaPlayer$a;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$a;->b(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v6
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_0
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         :try_start_5
    //         iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;->FK:Lcom/google/android/gms/cast/RemoteMediaPlayer;
    //         invoke-static {v1}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->d(Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/RemoteMediaPlayer$a;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$a;->b(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    //         throw v0
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_0
    */

}
