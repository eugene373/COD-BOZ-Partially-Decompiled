package com.google.android.gms.drive

// Auto-emitted from smali.
// 4 fields, 5 methods.

open class OpenFileActivityBuilder {
    private var Nw: String
    private var Nx: Array<String>
    private var Ny: com.google.android.gms.drive.DriveId

    public constructor()

    public fun build(apiClient: com.google.android.gms.common.api.GoogleApiClient): android.content.IntentSender { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/IntentSender;") }
    /*
    //         .locals 5
    //         invoke-interface {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         const-string v1, "Client must be connected"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->Nx:[Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         new-array v0, v0, [Ljava/lang/String;
    //         iput-object v0, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->Nx:[Ljava/lang/String;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/q;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/q;->hY()Lcom/google/android/gms/drive/internal/ab;
    //         move-result-object v0
    //         :try_start_0
    //         new-instance v1, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;
    //         iget-object v2, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->Nw:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->Nx:[Ljava/lang/String;
    //         iget-object v4, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->Ny:Lcom/google/android/gms/drive/DriveId;
    //         invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;-><init>(Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/drive/DriveId;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/drive/internal/ab;->a(Lcom/google/android/gms/drive/internal/OpenFileIntentSenderRequest;)Landroid/content/IntentSender;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         const-string v2, "Unable to connect Drive Play Service"
    //         invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun setActivityStartFolder(folder: com.google.android.gms.drive.DriveId): com.google.android.gms.drive.OpenFileActivityBuilder { return TODO("body: (Lcom/google/android/gms/drive/DriveId;)Lcom/google/android/gms/drive/OpenFileActivityBuilder;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/DriveId;
    //         iput-object v0, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->Ny:Lcom/google/android/gms/drive/DriveId;
    //         return-object p0
    */

    public fun setActivityTitle(title: String): com.google.android.gms.drive.OpenFileActivityBuilder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/drive/OpenFileActivityBuilder;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iput-object v0, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->Nw:Ljava/lang/String;
    //         return-object p0
    */

    public fun setMimeType(mimeTypes: Array<String>): com.google.android.gms.drive.OpenFileActivityBuilder { return TODO("body: ([Ljava/lang/String;)Lcom/google/android/gms/drive/OpenFileActivityBuilder;") }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "mimeTypes may not be null"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iput-object p1, p0, Lcom/google/android/gms/drive/OpenFileActivityBuilder;->Nx:[Ljava/lang/String;
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    @JvmField public val EXTRA_RESPONSE_DRIVE_ID: String = "response_drive_id"
    }
}
