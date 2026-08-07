package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class u_Anon2: com.google.android.gms.drive.internal.u.f() {
    val OV: com.google.android.gms.drive.MetadataChangeSet
    val OX: com.google.android.gms.drive.internal.u

    constructor(p0: com.google.android.gms.drive.internal.u, p1: com.google.android.gms.drive.MetadataChangeSet)

    protected fun a(p0: com.google.android.gms.common.api.Api.a) { /* TODO(body): (Lcom/google/android/gms/common/api/Api$a;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         check-cast p1, Lcom/google/android/gms/drive/internal/q;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/u$2;->a(Lcom/google/android/gms/drive/internal/q;)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.drive.internal.q) { /* TODO(body): (Lcom/google/android/gms/drive/internal/q;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/u$2;->OV:Lcom/google/android/gms/drive/MetadataChangeSet;
    //         invoke-virtual {v0}, Lcom/google/android/gms/drive/MetadataChangeSet;->hS()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         move-result-object v0
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/q;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->setContext(Landroid/content/Context;)V
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/q;->hY()Lcom/google/android/gms/drive/internal/ab;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/drive/internal/CreateFolderRequest;
    //         iget-object v2, p0, Lcom/google/android/gms/drive/internal/u$2;->OX:Lcom/google/android/gms/drive/internal/u;
    //         invoke-virtual {v2}, Lcom/google/android/gms/drive/internal/u;->getDriveId()Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/drive/internal/u$2;->OV:Lcom/google/android/gms/drive/MetadataChangeSet;
    //         invoke-virtual {v3}, Lcom/google/android/gms/drive/MetadataChangeSet;->hS()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         move-result-object v3
    //         invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/CreateFolderRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V
    //         new-instance v2, Lcom/google/android/gms/drive/internal/u$b;
    //         invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/u$b;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/ab;->a(Lcom/google/android/gms/drive/internal/CreateFolderRequest;Lcom/google/android/gms/drive/internal/ac;)V
    //         return-void
    */

}
