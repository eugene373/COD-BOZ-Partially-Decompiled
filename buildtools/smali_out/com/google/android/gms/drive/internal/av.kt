package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class av: com.google.android.gms.drive.internal.c() {
    private val De: com.google.android.gms.common.api.BaseImplementation.b
    private val OU: com.google.android.gms.drive.DriveFile.DownloadProgressListener

    constructor(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.drive.DriveFile.DownloadProgressListener)

    public fun a(p0: com.google.android.gms.drive.internal.OnContentsResponse) { /* TODO(body): (Lcom/google/android/gms/drive/internal/OnContentsResponse;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnContentsResponse;->ie()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/4 v1, -0x1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         :goto_0
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/av;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         new-instance v2, Lcom/google/android/gms/drive/internal/o$c;
    //         new-instance v3, Lcom/google/android/gms/drive/internal/r;
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnContentsResponse;->id()Lcom/google/android/gms/drive/Contents;
    //         move-result-object v4
    //         invoke-direct {v3, v4}, Lcom/google/android/gms/drive/internal/r;-><init>(Lcom/google/android/gms/drive/Contents;)V
    //         invoke-direct {v2, v0, v3}, Lcom/google/android/gms/drive/internal/o$c;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveContents;)V
    //         invoke-interface {v1, v2}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         return-void
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.drive.internal.OnDownloadProgressResponse) { /* TODO(body): (Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/av;->OU:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/av;->OU:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;->if()J
    //         move-result-wide v2
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;->ig()J
    //         move-result-wide v4
    //         invoke-interface {v0, v2, v3, v4, v5}, Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;->onProgress(JJ)V
    //         :cond_0
    //         return-void
    */

    public fun o(p0: com.google.android.gms.common.api.Status) { /* TODO(body): (Lcom/google/android/gms/common/api/Status;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/av;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         new-instance v1, Lcom/google/android/gms/drive/internal/o$c;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, p1, v2}, Lcom/google/android/gms/drive/internal/o$c;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveContents;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         return-void
    */

}
