package com.google.android.gms.cast

// Auto-emitted from smali.
// 3 fields, 4 methods.

open class RemoteMediaPlayer_a: com.google.android.gms.internal.ir {
    val FK: com.google.android.gms.cast.RemoteMediaPlayer
    private var FX: com.google.android.gms.common.api.GoogleApiClient
    private var FY: Long

    public constructor(p0: com.google.android.gms.cast.RemoteMediaPlayer)

    public fun a(p0: String, p1: String, p2: Long, p3: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$a;->FX:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "No GoogleApiClient available"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/cast/Cast;->CastApi:Lcom/google/android/gms/cast/Cast$CastApi;
    //         iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$a;->FX:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/cast/Cast$CastApi;->sendMessage(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/cast/RemoteMediaPlayer$a$a;
    //         invoke-direct {v1, p0, p3, p4}, Lcom/google/android/gms/cast/RemoteMediaPlayer$a$a;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer$a;J)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    //         return-void
    */

    public fun b(p0: com.google.android.gms.common.api.GoogleApiClient) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$a;->FX:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         return-void
    */

    public fun fx(): Long { return TODO("body: ()J") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$a;->FY:J
    //         const-wide/16 v2, 0x1
    //         add-long/2addr v0, v2
    //         iput-wide v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer$a;->FY:J
    //         return-wide v0
    */

}
