package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 1 fields, 13 methods.

open class r: com.google.android.gms.drive.DriveContents {
    private val Ox: com.google.android.gms.drive.Contents

    public constructor(p0: com.google.android.gms.drive.Contents)

    private fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.MetadataChangeSet, p2: com.google.android.gms.drive.ExecutionOptions): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/drive/MetadataChangeSet;",
    //                 "Lcom/google/android/gms/drive/ExecutionOptions;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getMode()I
    //         move-result v0
    //         const/high16 v1, 0x10000000
    //         if-ne v0, v1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Cannot commit contents opened with MODE_READ_ONLY"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p3}, Lcom/google/android/gms/drive/ExecutionOptions;->hQ()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/drive/ExecutionOptions;->aV(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->hL()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "DriveContents must be valid for conflict detection."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-static {p1, p3}, Lcom/google/android/gms/drive/ExecutionOptions;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/ExecutionOptions;)V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->hK()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "DriveContents already closed."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/r;->getDriveId()Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v0
    //         if-nez v0, :cond_3
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Only DriveContents obtained through DriveFile.open can be committed."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_3
    //         if-eqz p2, :cond_4
    //         :goto_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->hJ()V
    //         new-instance v0, Lcom/google/android/gms/drive/internal/r$4;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/drive/internal/r$4;-><init>(Lcom/google/android/gms/drive/internal/r;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    //         :cond_4
    //         sget-object p2, Lcom/google/android/gms/drive/MetadataChangeSet;->Nt:Lcom/google/android/gms/drive/MetadataChangeSet;
    //         goto :goto_0
    */

    public fun commit(apiClient: com.google.android.gms.common.api.GoogleApiClient, changeSet: com.google.android.gms.drive.MetadataChangeSet): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/ExecutionOptions$Builder;
    //         invoke-direct {v0}, Lcom/google/android/gms/drive/ExecutionOptions$Builder;-><init>()V
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/ExecutionOptions$Builder;->build()Lcom/google/android/gms/drive/ExecutionOptions;
    //         move-result-object v0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/drive/internal/r;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun commit(apiClient: com.google.android.gms.common.api.GoogleApiClient, changeSet: com.google.android.gms.drive.MetadataChangeSet, executionOptions: com.google.android.gms.drive.ExecutionOptions): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/drive/internal/r;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun discard(apiClient: com.google.android.gms.common.api.GoogleApiClient) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->hK()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "DriveContents already closed."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->hJ()V
    //         new-instance v0, Lcom/google/android/gms/drive/internal/r$3;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/drive/internal/r$3;-><init>(Lcom/google/android/gms/drive/internal/r;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/r$3;
    //         new-instance v1, Lcom/google/android/gms/drive/internal/r$2;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/drive/internal/r$2;-><init>(Lcom/google/android/gms/drive/internal/r;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/internal/r$3;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    //         return-void
    */

    public fun getContents(): com.google.android.gms.drive.Contents { return TODO("body: ()Lcom/google/android/gms/drive/Contents;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         return-object v0
    */

    public fun getDriveId(): com.google.android.gms.drive.DriveId { return TODO("body: ()Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getDriveId()Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getInputStream(): java.io.InputStream { return TODO("body: ()Ljava/io/InputStream;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getInputStream()Ljava/io/InputStream;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getMode()I
    //         move-result v0
    //         return v0
    */

    public fun getOutputStream(): java.io.OutputStream { return TODO("body: ()Ljava/io/OutputStream;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getOutputStream()Ljava/io/OutputStream;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getParcelFileDescriptor(): android.os.ParcelFileDescriptor { return TODO("body: ()Landroid/os/ParcelFileDescriptor;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;
    //         move-result-object v0
    //         return-object v0
    */

    public fun reopenForWrite(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->hK()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "DriveContents already closed."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getMode()I
    //         move-result v0
    //         const/high16 v1, 0x10000000
    //         if-eq v0, v1, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->hJ()V
    //         new-instance v0, Lcom/google/android/gms/drive/internal/r$1;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/drive/internal/r$1;-><init>(Lcom/google/android/gms/drive/internal/r;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.drive.internal.r): com.google.android.gms.drive.Contents { return TODO("body: (Lcom/google/android/gms/drive/internal/r;)Lcom/google/android/gms/drive/Contents;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/r;->Ox:Lcom/google/android/gms/drive/Contents;
    //         return-object v0
    */

    }
}
