package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 5 fields, 6 methods.

open class h {
    private var Nw: String
    private var Ny: com.google.android.gms.drive.DriveId
    protected var Oi: com.google.android.gms.drive.MetadataChangeSet
    private var Oj: Integer
    private val Ok: Int

    public constructor(p0: Int)

    public fun a(p0: com.google.android.gms.drive.DriveId) { /* TODO(body): (Lcom/google/android/gms/drive/DriveId;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/DriveId;
    //         iput-object v0, p0, Lcom/google/android/gms/drive/internal/h;->Ny:Lcom/google/android/gms/drive/DriveId;
    //         return-void
    */

    public fun a(p0: com.google.android.gms.drive.MetadataChangeSet) { /* TODO(body): (Lcom/google/android/gms/drive/MetadataChangeSet;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/MetadataChangeSet;
    //         iput-object v0, p0, Lcom/google/android/gms/drive/internal/h;->Oi:Lcom/google/android/gms/drive/MetadataChangeSet;
    //         return-void
    */

    public fun bi(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iput-object v0, p0, Lcom/google/android/gms/drive/internal/h;->Nw:Ljava/lang/String;
    //         return-void
    */

    public fun bk(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/drive/internal/h;->Oj:Ljava/lang/Integer;
    //         return-void
    */

    public fun build(apiClient: com.google.android.gms.common.api.GoogleApiClient): android.content.IntentSender { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/IntentSender;") }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/h;->Oi:Lcom/google/android/gms/drive/MetadataChangeSet;
    //         const-string v1, "Must provide initial metadata to CreateFileActivityBuilder."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-interface {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         const-string v1, "Client must be connected"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/q;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/h;->Oi:Lcom/google/android/gms/drive/MetadataChangeSet;
    //         invoke-virtual {v1}, Lcom/google/android/gms/drive/MetadataChangeSet;->hS()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         move-result-object v1
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/q;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->setContext(Landroid/content/Context;)V
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/q;->hY()Lcom/google/android/gms/drive/internal/ab;
    //         move-result-object v6
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/h;->Oj:Ljava/lang/Integer;
    //         if-nez v0, :cond_0
    //         const/4 v2, -0x1
    //         :goto_0
    //         :try_start_0
    //         new-instance v0, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/h;->Oi:Lcom/google/android/gms/drive/MetadataChangeSet;
    //         invoke-virtual {v1}, Lcom/google/android/gms/drive/MetadataChangeSet;->hS()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         move-result-object v1
    //         iget-object v3, p0, Lcom/google/android/gms/drive/internal/h;->Nw:Ljava/lang/String;
    //         iget-object v4, p0, Lcom/google/android/gms/drive/internal/h;->Ny:Lcom/google/android/gms/drive/DriveId;
    //         iget v5, p0, Lcom/google/android/gms/drive/internal/h;->Ok:I
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;-><init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;ILjava/lang/String;Lcom/google/android/gms/drive/DriveId;I)V
    //         invoke-interface {v6, v0}, Lcom/google/android/gms/drive/internal/ab;->a(Lcom/google/android/gms/drive/internal/CreateFileIntentSenderRequest;)Landroid/content/IntentSender;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/h;->Oj:Ljava/lang/Integer;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         const-string v2, "Unable to connect Drive Play Service"
    //         invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

}
