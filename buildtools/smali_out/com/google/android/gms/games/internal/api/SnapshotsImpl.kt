package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 0 fields, 14 methods.

class SnapshotsImpl: com.google.android.gms.games.snapshot.Snapshots {
    public constructor()

    public fun commitAndClose(apiClient: com.google.android.gms.common.api.GoogleApiClient, snapshot: com.google.android.gms.games.snapshot.Snapshot, metadataChange: com.google.android.gms.games.snapshot.SnapshotMetadataChange): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/snapshot/Snapshot;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$3;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$3;-><init>(Lcom/google/android/gms/games/internal/api/SnapshotsImpl;Lcom/google/android/gms/games/snapshot/Snapshot;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun delete(apiClient: com.google.android.gms.common.api.GoogleApiClient, metadata: com.google.android.gms.games.snapshot.SnapshotMetadata): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$4;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$4;-><init>(Lcom/google/android/gms/games/internal/api/SnapshotsImpl;Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun discardAndClose(apiClient: com.google.android.gms.common.api.GoogleApiClient, snapshot: com.google.android.gms.games.snapshot.Snapshot) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/snapshot/Snapshot;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/games/snapshot/Snapshot;)V
    //         return-void
    */

    public fun getMaxCoverImageSize(apiClient: com.google.android.gms.common.api.GoogleApiClient): Int { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kv()I
    //         move-result v0
    //         return v0
    */

    public fun getMaxDataSize(apiClient: com.google.android.gms.common.api.GoogleApiClient): Int { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->ku()I
    //         move-result v0
    //         return v0
    */

    public fun getSelectSnapshotIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient, title: String, allowAddButton: Boolean, allowDelete: Boolean, maxSnapshots: Int): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;ZZI)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p2, p3, p4, p5}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Ljava/lang/String;ZZI)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getSnapshotFromBundle(extras: android.os.Bundle): com.google.android.gms.games.snapshot.SnapshotMetadata { return TODO("body: (Landroid/os/Bundle;)Lcom/google/android/gms/games/snapshot/SnapshotMetadata;") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         const-string v0, "com.google.android.gms.games.SNAPSHOT_METADATA"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const-string v0, "com.google.android.gms.games.SNAPSHOT_METADATA"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //         goto :goto_0
    */

    public fun load(apiClient: com.google.android.gms.common.api.GoogleApiClient, forceReload: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/SnapshotsImpl;Z)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun open(apiClient: com.google.android.gms.common.api.GoogleApiClient, metadata: com.google.android.gms.games.snapshot.SnapshotMetadata): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         invoke-interface {p2}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->getUniqueName()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/games/internal/api/SnapshotsImpl;->open(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Z)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun open(apiClient: com.google.android.gms.common.api.GoogleApiClient, fileName: String, createIfNotFound: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Z)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$2;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$2;-><init>(Lcom/google/android/gms/games/internal/api/SnapshotsImpl;Ljava/lang/String;Z)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun resolveConflict(apiClient: com.google.android.gms.common.api.GoogleApiClient, conflictId: String, snapshot: com.google.android.gms.games.snapshot.Snapshot): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/Snapshot;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 6
    //         invoke-interface {p3}, Lcom/google/android/gms/games/snapshot/Snapshot;->getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;
    //         invoke-direct {v1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;-><init>()V
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->fromMetadata(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->build()Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;
    //         move-result-object v4
    //         invoke-interface {v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->getSnapshotId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {p3}, Lcom/google/android/gms/games/snapshot/Snapshot;->getSnapshotContents()Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         move-result-object v5
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/games/internal/api/SnapshotsImpl;->resolveConflict(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;Lcom/google/android/gms/games/snapshot/SnapshotContents;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun resolveConflict(apiClient: com.google.android.gms.common.api.GoogleApiClient, conflictId: String, snapshotId: String, metadataChange: com.google.android.gms.games.snapshot.SnapshotMetadataChange, contents: com.google.android.gms.drive.Contents): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;Lcom/google/android/gms/drive/Contents;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 6
    //         new-instance v5, Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         invoke-direct {v5, p5}, Lcom/google/android/gms/games/snapshot/SnapshotContents;-><init>(Lcom/google/android/gms/drive/Contents;)V
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$5;
    //         move-object v1, p0
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$5;-><init>(Lcom/google/android/gms/games/internal/api/SnapshotsImpl;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;Lcom/google/android/gms/games/snapshot/SnapshotContents;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun resolveConflict(apiClient: com.google.android.gms.common.api.GoogleApiClient, conflictId: String, snapshotId: String, metadataChange: com.google.android.gms.games.snapshot.SnapshotMetadataChange, snapshotContents: com.google.android.gms.games.snapshot.SnapshotContents): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;Lcom/google/android/gms/games/snapshot/SnapshotContents;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 6
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$6;
    //         move-object v1, p0
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         move-object v5, p5
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/games/internal/api/SnapshotsImpl$6;-><init>(Lcom/google/android/gms/games/internal/api/SnapshotsImpl;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;Lcom/google/android/gms/games/snapshot/SnapshotContents;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
