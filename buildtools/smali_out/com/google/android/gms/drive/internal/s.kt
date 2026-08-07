package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 0 fields, 7 methods.

open class s: com.google.android.gms.drive.internal.w(), com.google.android.gms.drive.DriveFile {
    public constructor(p0: com.google.android.gms.drive.DriveId)

    public fun commitAndCloseContents(client: com.google.android.gms.common.api.GoogleApiClient, contents: com.google.android.gms.drive.Contents): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/Contents;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/drive/internal/r;
    //         invoke-direct {v0, p2}, Lcom/google/android/gms/drive/internal/r;-><init>(Lcom/google/android/gms/drive/Contents;)V
    //         const/4 v1, 0x0
    //         invoke-interface {v0, p1, v1}, Lcom/google/android/gms/drive/DriveContents;->commit(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun commitAndCloseContents(client: com.google.android.gms.common.api.GoogleApiClient, contents: com.google.android.gms.drive.Contents, changeSet: com.google.android.gms.drive.MetadataChangeSet): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/Contents;Lcom/google/android/gms/drive/MetadataChangeSet;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/r;
    //         invoke-direct {v0, p2}, Lcom/google/android/gms/drive/internal/r;-><init>(Lcom/google/android/gms/drive/Contents;)V
    //         invoke-interface {v0, p1, p3}, Lcom/google/android/gms/drive/DriveContents;->commit(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun discardContents(apiClient: com.google.android.gms.common.api.GoogleApiClient, contents: com.google.android.gms.drive.Contents): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/Contents;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->DriveApi:Lcom/google/android/gms/drive/DriveApi;
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/drive/DriveApi;->discardContents(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/Contents;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun open(apiClient: com.google.android.gms.common.api.GoogleApiClient, mode: Int, listener: com.google.android.gms.drive.DriveFile.DownloadProgressListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;ILcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         const/high16 v0, 0x10000000
    //         if-eq p2, v0, :cond_0
    //         const/high16 v0, 0x20000000
    //         if-eq p2, v0, :cond_0
    //         const/high16 v0, 0x30000000
    //         if-eq p2, v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Invalid mode provided."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-static {p1, p3}, Lcom/google/android/gms/drive/internal/s;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/drive/internal/s$2;
    //         invoke-direct {v1, p0, p2, v0}, Lcom/google/android/gms/drive/internal/s$2;-><init>(Lcom/google/android/gms/drive/internal/s;ILcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun openContents(apiClient: com.google.android.gms.common.api.GoogleApiClient, mode: Int, listener: com.google.android.gms.drive.DriveFile.DownloadProgressListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;ILcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         const/high16 v0, 0x10000000
    //         if-eq p2, v0, :cond_0
    //         const/high16 v0, 0x20000000
    //         if-eq p2, v0, :cond_0
    //         const/high16 v0, 0x30000000
    //         if-eq p2, v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Invalid mode provided."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-static {p1, p3}, Lcom/google/android/gms/drive/internal/s;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/drive/internal/s$1;
    //         invoke-direct {v1, p0, p2, v0}, Lcom/google/android/gms/drive/internal/s$1;-><init>(Lcom/google/android/gms/drive/internal/s;ILcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private @JvmStatic fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.DriveFile.DownloadProgressListener): com.google.android.gms.drive.DriveFile.DownloadProgressListener { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;") }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/drive/internal/s$a;
    //         invoke-interface {p0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->c(Ljava/lang/Object;)Lcom/google/android/gms/common/api/c;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/drive/internal/s$a;-><init>(Lcom/google/android/gms/common/api/c;)V
    //         goto :goto_0
    */

    }
}
