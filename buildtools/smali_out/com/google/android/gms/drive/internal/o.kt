package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 0 fields, 14 methods.

open class o: com.google.android.gms.drive.DriveApi {
    public constructor()

    public fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "I)",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/drive/DriveApi$DriveContentsResult;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/drive/internal/o$3;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/drive/internal/o$3;-><init>(Lcom/google/android/gms/drive/internal/o;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun discardContents(apiClient: com.google.android.gms.common.api.GoogleApiClient, contents: com.google.android.gms.drive.Contents): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/Contents;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         invoke-virtual {p2}, Lcom/google/android/gms/drive/Contents;->hK()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "DriveContents already closed."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p2}, Lcom/google/android/gms/drive/Contents;->hJ()V
    //         new-instance v0, Lcom/google/android/gms/drive/internal/o$4;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/drive/internal/o$4;-><init>(Lcom/google/android/gms/drive/internal/o;Lcom/google/android/gms/drive/Contents;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun fetchDriveId(apiClient: com.google.android.gms.common.api.GoogleApiClient, resourceId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/o$5;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/drive/internal/o$5;-><init>(Lcom/google/android/gms/drive/internal/o;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAppFolder(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.drive.DriveFolder { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/drive/DriveFolder;") }
    /*
    //         .locals 2
    //         invoke-interface {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Client must be connected"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/q;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/q;->ia()Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/u;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/drive/internal/u;-><init>(Lcom/google/android/gms/drive/DriveId;)V
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getFile(apiClient: com.google.android.gms.common.api.GoogleApiClient, id: com.google.android.gms.drive.DriveId): com.google.android.gms.drive.DriveFile { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/DriveFile;") }
    /*
    //         .locals 2
    //         if-nez p2, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Id must be provided."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Client must be connected"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/s;
    //         invoke-direct {v0, p2}, Lcom/google/android/gms/drive/internal/s;-><init>(Lcom/google/android/gms/drive/DriveId;)V
    //         return-object v0
    */

    public fun getFolder(apiClient: com.google.android.gms.common.api.GoogleApiClient, id: com.google.android.gms.drive.DriveId): com.google.android.gms.drive.DriveFolder { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/DriveFolder;") }
    /*
    //         .locals 2
    //         if-nez p2, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Id must be provided."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Client must be connected"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/u;
    //         invoke-direct {v0, p2}, Lcom/google/android/gms/drive/internal/u;-><init>(Lcom/google/android/gms/drive/DriveId;)V
    //         return-object v0
    */

    public fun getRootFolder(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.drive.DriveFolder { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/drive/DriveFolder;") }
    /*
    //         .locals 2
    //         invoke-interface {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Client must be connected"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/q;
    //         new-instance v1, Lcom/google/android/gms/drive/internal/u;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/q;->hZ()Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/drive/internal/u;-><init>(Lcom/google/android/gms/drive/DriveId;)V
    //         return-object v1
    */

    public fun newContents(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/o$2;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/drive/internal/o$2;-><init>(Lcom/google/android/gms/drive/internal/o;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newCreateFileActivityBuilder(): com.google.android.gms.drive.CreateFileActivityBuilder { return TODO("body: ()Lcom/google/android/gms/drive/CreateFileActivityBuilder;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;
    //         invoke-direct {v0}, Lcom/google/android/gms/drive/CreateFileActivityBuilder;-><init>()V
    //         return-object v0
    */

    public fun newDriveContents(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         const/high16 v0, 0x20000000
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/drive/internal/o;->a(Lcom/google/android/gms/common/api/GoogleApiClient;I)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newOpenFileActivityBuilder(): com.google.android.gms.drive.OpenFileActivityBuilder { return TODO("body: ()Lcom/google/android/gms/drive/OpenFileActivityBuilder;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;
    //         invoke-direct {v0}, Lcom/google/android/gms/drive/OpenFileActivityBuilder;-><init>()V
    //         return-object v0
    */

    public fun query(apiClient: com.google.android.gms.common.api.GoogleApiClient, query: com.google.android.gms.drive.query.Query): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         if-nez p2, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Query must be provided."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/drive/internal/o$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/drive/internal/o$1;-><init>(Lcom/google/android/gms/drive/internal/o;Lcom/google/android/gms/drive/query/Query;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun requestSync(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/o$6;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/drive/internal/o$6;-><init>(Lcom/google/android/gms/drive/internal/o;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
