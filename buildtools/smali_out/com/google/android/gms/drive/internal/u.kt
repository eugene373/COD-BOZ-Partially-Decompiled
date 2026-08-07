package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 0 fields, 9 methods.

open class u: com.google.android.gms.drive.internal.w(), com.google.android.gms.drive.DriveFolder {
    public constructor(p0: com.google.android.gms.drive.DriveId)

    private fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.MetadataChangeSet, p2: com.google.android.gms.drive.Contents, p3: Int, p4: com.google.android.gms.drive.ExecutionOptions): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/Contents;ILcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/drive/MetadataChangeSet;",
    //                 "Lcom/google/android/gms/drive/Contents;",
    //                 "I",
    //                 "Lcom/google/android/gms/drive/ExecutionOptions;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/drive/DriveFolder$DriveFileResult;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {p1, p5}, Lcom/google/android/gms/drive/ExecutionOptions;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/ExecutionOptions;)V
    //         if-eqz p3, :cond_0
    //         invoke-virtual {p3}, Lcom/google/android/gms/drive/Contents;->hJ()V
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/drive/internal/u$1;
    //         move-object v1, p0
    //         move-object v2, p2
    //         move-object v3, p3
    //         move v4, p4
    //         move-object v5, p5
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/internal/u$1;-><init>(Lcom/google/android/gms/drive/internal/u;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/Contents;ILcom/google/android/gms/drive/ExecutionOptions;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    private fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.MetadataChangeSet, p2: com.google.android.gms.drive.DriveContents, p3: com.google.android.gms.drive.ExecutionOptions): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/DriveContents;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/drive/MetadataChangeSet;",
    //                 "Lcom/google/android/gms/drive/DriveContents;",
    //                 "Lcom/google/android/gms/drive/ExecutionOptions;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/drive/DriveFolder$DriveFileResult;",
    //                 ">;"
    //             }
    //         .end annotation
    //         if-nez p3, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "DriveContents must be provided."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         instance-of v0, p3, Lcom/google/android/gms/drive/internal/r;
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Only DriveContents obtained from the Drive API are accepted."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-interface {p3}, Lcom/google/android/gms/drive/DriveContents;->getDriveId()Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         invoke-interface {p3}, Lcom/google/android/gms/drive/DriveContents;->getContents()Lcom/google/android/gms/drive/Contents;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->hK()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "DriveContents are already closed."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_3
    //         if-nez p2, :cond_4
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "MetadataChangeSet must be provided."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_4
    //         const-string v0, "application/vnd.google-apps.folder"
    //         invoke-virtual {p2}, Lcom/google/android/gms/drive/MetadataChangeSet;->getMimeType()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "May not create folders (mimetype: application/vnd.google-apps.folder) using this method. Use DriveFolder.createFolder() instead."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_5
    //         invoke-interface {p3}, Lcom/google/android/gms/drive/DriveContents;->getContents()Lcom/google/android/gms/drive/Contents;
    //         move-result-object v3
    //         const/4 v4, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v5, p4
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/internal/u;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/Contents;ILcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun createFile(apiClient: com.google.android.gms.common.api.GoogleApiClient, changeSet: com.google.android.gms.drive.MetadataChangeSet, contents: com.google.android.gms.drive.Contents): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/Contents;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/r;
    //         invoke-direct {v0, p3}, Lcom/google/android/gms/drive/internal/r;-><init>(Lcom/google/android/gms/drive/Contents;)V
    //         invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/drive/internal/u;->createFile(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/DriveContents;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun createFile(apiClient: com.google.android.gms.common.api.GoogleApiClient, changeSet: com.google.android.gms.drive.MetadataChangeSet, driveContents: com.google.android.gms.drive.DriveContents): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/DriveContents;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/drive/internal/u;->createFile(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/DriveContents;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun createFile(apiClient: com.google.android.gms.common.api.GoogleApiClient, changeSet: com.google.android.gms.drive.MetadataChangeSet, driveContents: com.google.android.gms.drive.DriveContents, executionOptions: com.google.android.gms.drive.ExecutionOptions): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/DriveContents;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         if-nez p4, :cond_0
    //         new-instance v0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;
    //         invoke-direct {v0}, Lcom/google/android/gms/drive/ExecutionOptions$Builder;-><init>()V
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->build()Lcom/google/android/gms/drive/ExecutionOptions;
    //         move-result-object p4
    //         :cond_0
    //         invoke-virtual {p4}, Lcom/google/android/gms/drive/ExecutionOptions;->hQ()I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "May not set a conflict strategy for calls to createFile."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/drive/internal/u;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/DriveContents;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun createFolder(apiClient: com.google.android.gms.common.api.GoogleApiClient, changeSet: com.google.android.gms.drive.MetadataChangeSet): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         if-nez p2, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "MetadataChangeSet must be provided."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p2}, Lcom/google/android/gms/drive/MetadataChangeSet;->getMimeType()Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p2}, Lcom/google/android/gms/drive/MetadataChangeSet;->getMimeType()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "application/vnd.google-apps.folder"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "The mimetype must be of type application/vnd.google-apps.folder"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/u$2;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/drive/internal/u$2;-><init>(Lcom/google/android/gms/drive/internal/u;Lcom/google/android/gms/drive/MetadataChangeSet;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun listChildren(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/drive/internal/u;->queryChildren(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun queryChildren(apiClient: com.google.android.gms.common.api.GoogleApiClient, query: com.google.android.gms.drive.query.Query): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/drive/query/Query$Builder;
    //         invoke-direct {v0}, Lcom/google/android/gms/drive/query/Query$Builder;-><init>()V
    //         sget-object v1, Lcom/google/android/gms/drive/query/SearchableField;->PARENTS:Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField;
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/u;->getDriveId()Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Lcom/google/android/gms/drive/query/Filters;->in(Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField;Ljava/lang/Object;)Lcom/google/android/gms/drive/query/Filter;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/query/Query$Builder;->addFilter(Lcom/google/android/gms/drive/query/Filter;)Lcom/google/android/gms/drive/query/Query$Builder;
    //         move-result-object v0
    //         if-eqz p2, :cond_1
    //         invoke-virtual {p2}, Lcom/google/android/gms/drive/query/Query;->getFilter()Lcom/google/android/gms/drive/query/Filter;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p2}, Lcom/google/android/gms/drive/query/Query;->getFilter()Lcom/google/android/gms/drive/query/Filter;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/query/Query$Builder;->addFilter(Lcom/google/android/gms/drive/query/Filter;)Lcom/google/android/gms/drive/query/Query$Builder;
    //         :cond_0
    //         invoke-virtual {p2}, Lcom/google/android/gms/drive/query/Query;->getPageToken()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/query/Query$Builder;->setPageToken(Ljava/lang/String;)Lcom/google/android/gms/drive/query/Query$Builder;
    //         invoke-virtual {p2}, Lcom/google/android/gms/drive/query/Query;->getSortOrder()Lcom/google/android/gms/drive/query/SortOrder;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/query/Query$Builder;->setSortOrder(Lcom/google/android/gms/drive/query/SortOrder;)Lcom/google/android/gms/drive/query/Query$Builder;
    //         :cond_1
    //         new-instance v1, Lcom/google/android/gms/drive/internal/o;
    //         invoke-direct {v1}, Lcom/google/android/gms/drive/internal/o;-><init>()V
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/query/Query$Builder;->build()Lcom/google/android/gms/drive/query/Query;
    //         move-result-object v0
    //         invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/drive/internal/o;->query(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/query/Query;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

}
