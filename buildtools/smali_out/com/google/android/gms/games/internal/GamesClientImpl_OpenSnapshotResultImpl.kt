package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 5 fields, 7 methods.

class GamesClientImpl_OpenSnapshotResultImpl: com.google.android.gms.common.api.a(), com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult {
    private val Xm: com.google.android.gms.games.snapshot.Snapshot
    private val Xn: String
    private val Xo: com.google.android.gms.games.snapshot.Snapshot
    private val Xp: com.google.android.gms.drive.Contents
    private val Xq: com.google.android.gms.games.snapshot.SnapshotContents

    constructor(dataHolder: com.google.android.gms.common.data.DataHolder, currentContents: com.google.android.gms.drive.Contents)

    constructor(metadataHolder: com.google.android.gms.common.data.DataHolder, conflictId: String, currentContents: com.google.android.gms.drive.Contents, conflictContents: com.google.android.gms.drive.Contents, resolutionContents: com.google.android.gms.drive.Contents)

    public fun getConflictId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$OpenSnapshotResultImpl;->Xn:Ljava/lang/String;
    //         return-object v0
    */

    public fun getConflictingSnapshot(): com.google.android.gms.games.snapshot.Snapshot { return TODO("body: ()Lcom/google/android/gms/games/snapshot/Snapshot;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$OpenSnapshotResultImpl;->Xo:Lcom/google/android/gms/games/snapshot/Snapshot;
    //         return-object v0
    */

    public fun getResolutionContents(): com.google.android.gms.drive.Contents { return TODO("body: ()Lcom/google/android/gms/drive/Contents;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$OpenSnapshotResultImpl;->Xp:Lcom/google/android/gms/drive/Contents;
    //         return-object v0
    */

    public fun getResolutionSnapshotContents(): com.google.android.gms.games.snapshot.SnapshotContents { return TODO("body: ()Lcom/google/android/gms/games/snapshot/SnapshotContents;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$OpenSnapshotResultImpl;->Xq:Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         return-object v0
    */

    public fun getSnapshot(): com.google.android.gms.games.snapshot.Snapshot { return TODO("body: ()Lcom/google/android/gms/games/snapshot/Snapshot;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$OpenSnapshotResultImpl;->Xm:Lcom/google/android/gms/games/snapshot/Snapshot;
    //         return-object v0
    */

}
