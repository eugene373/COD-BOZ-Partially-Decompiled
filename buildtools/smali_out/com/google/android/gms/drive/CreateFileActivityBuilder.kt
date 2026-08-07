package com.google.android.gms.drive

// Auto-emitted from smali.
// 3 fields, 7 methods.

open class CreateFileActivityBuilder {
    private val Na: com.google.android.gms.drive.internal.h
    private var Nb: com.google.android.gms.drive.DriveContents

    public constructor()

    public fun build(apiClient: com.google.android.gms.common.api.GoogleApiClient): android.content.IntentSender { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/IntentSender;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Nb:Lcom/google/android/gms/drive/DriveContents;
    //         const-string v1, "Must provide initial contents to CreateFileActivityBuilder."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->SCOPE_FILE:Lcom/google/android/gms/common/api/Scope;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Scope;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->Nc:Lcom/google/android/gms/common/api/Scope;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Scope;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "The apiClient must have suitable scope to create files"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Nb:Lcom/google/android/gms/drive/DriveContents;
    //         invoke-interface {v0}, Lcom/google/android/gms/drive/DriveContents;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/jy;->a(Landroid/os/ParcelFileDescriptor;)V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Nb:Lcom/google/android/gms/drive/DriveContents;
    //         invoke-interface {v0}, Lcom/google/android/gms/drive/DriveContents;->getContents()Lcom/google/android/gms/drive/Contents;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->hJ()V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Na:Lcom/google/android/gms/drive/internal/h;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/h;->build(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/IntentSender;
    //         move-result-object v0
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setActivityStartFolder(folder: com.google.android.gms.drive.DriveId): com.google.android.gms.drive.CreateFileActivityBuilder { return TODO("body: (Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Na:Lcom/google/android/gms/drive/internal/h;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/h;->a(Lcom/google/android/gms/drive/DriveId;)V
    //         return-object p0
    */

    public fun setActivityTitle(title: String): com.google.android.gms.drive.CreateFileActivityBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Na:Lcom/google/android/gms/drive/internal/h;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/h;->bi(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setInitialContents(contents: com.google.android.gms.drive.Contents): com.google.android.gms.drive.CreateFileActivityBuilder { return TODO("body: (Lcom/google/android/gms/drive/Contents;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/r;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/drive/internal/r;-><init>(Lcom/google/android/gms/drive/Contents;)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->setInitialDriveContents(Lcom/google/android/gms/drive/DriveContents;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setInitialDriveContents(driveContents: com.google.android.gms.drive.DriveContents): com.google.android.gms.drive.CreateFileActivityBuilder { return TODO("body: (Lcom/google/android/gms/drive/DriveContents;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;") }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "DriveContents must be provided."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/drive/internal/r;
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Only DriveContents obtained from the Drive API are accepted."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-interface {p1}, Lcom/google/android/gms/drive/DriveContents;->getDriveId()Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/drive/DriveContents;->getContents()Lcom/google/android/gms/drive/Contents;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->hK()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "DriveContents are already closed."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Na:Lcom/google/android/gms/drive/internal/h;
    //         invoke-interface {p1}, Lcom/google/android/gms/drive/DriveContents;->getContents()Lcom/google/android/gms/drive/Contents;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/google/android/gms/drive/Contents;->getRequestId()I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/internal/h;->bk(I)V
    //         iput-object p1, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Nb:Lcom/google/android/gms/drive/DriveContents;
    //         return-object p0
    */

    public fun setInitialMetadata(metadataChangeSet: com.google.android.gms.drive.MetadataChangeSet): com.google.android.gms.drive.CreateFileActivityBuilder { return TODO("body: (Lcom/google/android/gms/drive/MetadataChangeSet;)Lcom/google/android/gms/drive/CreateFileActivityBuilder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/CreateFileActivityBuilder;->Na:Lcom/google/android/gms/drive/internal/h;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/drive/internal/h;->a(Lcom/google/android/gms/drive/MetadataChangeSet;)V
    //         return-object p0
    */

    companion object {
    @JvmField public val EXTRA_RESPONSE_DRIVE_ID: String = "response_drive_id"
    }
}
