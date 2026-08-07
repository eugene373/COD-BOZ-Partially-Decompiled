package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 1 fields, 4 methods.

open class o_e: com.google.android.gms.drive.internal.c() {
    private val De: com.google.android.gms.common.api.BaseImplementation.b

    public constructor(p0: com.google.android.gms.common.api.BaseImplementation.b)

    public fun a(p0: com.google.android.gms.drive.internal.OnDriveIdResponse) { /* TODO(body): (Lcom/google/android/gms/drive/internal/OnDriveIdResponse;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/o$e;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         new-instance v1, Lcom/google/android/gms/drive/internal/o$f;
    //         sget-object v2, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnDriveIdResponse;->getDriveId()Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v3
    //         invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/o$f;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveId;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.drive.internal.OnMetadataResponse) { /* TODO(body): (Lcom/google/android/gms/drive/internal/OnMetadataResponse;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/o$e;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         new-instance v1, Lcom/google/android/gms/drive/internal/o$f;
    //         sget-object v2, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;
    //         new-instance v3, Lcom/google/android/gms/drive/internal/l;
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnMetadataResponse;->il()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;
    //         move-result-object v4
    //         invoke-direct {v3, v4}, Lcom/google/android/gms/drive/internal/l;-><init>(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V
    //         invoke-virtual {v3}, Lcom/google/android/gms/drive/internal/l;->getDriveId()Lcom/google/android/gms/drive/DriveId;
    //         move-result-object v3
    //         invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/o$f;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveId;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
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
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/o$e;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;
    //         new-instance v1, Lcom/google/android/gms/drive/internal/o$f;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, p1, v2}, Lcom/google/android/gms/drive/internal/o$f;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/DriveId;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         return-void
    */

}
