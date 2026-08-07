package com.google.android.gms.games.snapshot

// Auto-emitted from smali.
// 4 fields, 22 methods.

class SnapshotEntity: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.games.snapshot.Snapshot {
    private val BR: Int
    private val adh: com.google.android.gms.games.snapshot.SnapshotMetadataEntity
    private val adi: com.google.android.gms.games.snapshot.SnapshotContents

    constructor(versionCode: Int, metadata: com.google.android.gms.games.snapshot.SnapshotMetadata, contents: com.google.android.gms.games.snapshot.SnapshotContents)

    public constructor(metadata: com.google.android.gms.games.snapshot.SnapshotMetadata, contents: com.google.android.gms.games.snapshot.SnapshotContents)

    private fun isClosed(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->adi:Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->isClosed()Z
    //         move-result v0
    //         return v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->a(Lcom/google/android/gms/games/snapshot/Snapshot;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.snapshot.Snapshot { return TODO("body: ()Lcom/google/android/gms/games/snapshot/Snapshot;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->freeze()Lcom/google/android/gms/games/snapshot/Snapshot;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getContents(): com.google.android.gms.drive.Contents { return TODO("body: ()Lcom/google/android/gms/drive/Contents;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->isClosed()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->adi:Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->getContents()Lcom/google/android/gms/drive/Contents;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getMetadata(): com.google.android.gms.games.snapshot.SnapshotMetadata { return TODO("body: ()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->adh:Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;
    //         return-object v0
    */

    public fun getSnapshotContents(): com.google.android.gms.games.snapshot.SnapshotContents { return TODO("body: ()Lcom/google/android/gms/games/snapshot/SnapshotContents;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->isClosed()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->adi:Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         goto :goto_0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->b(Lcom/google/android/gms/games/snapshot/Snapshot;)I
    //         move-result v0
    //         return v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun modifyBytes(dstOffset: Int, content: ByteArray, srcOffset: Int, count: Int): Boolean { return TODO("body: (I[BII)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->adi:Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->modifyBytes(I[BII)Z
    //         move-result v0
    //         return v0
    */

    public fun readFully(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->adi:Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->readFully()[B
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->c(Lcom/google/android/gms/games/snapshot/Snapshot;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeBytes(content: ByteArray): Boolean { return TODO("body: ([B)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotEntity;->adi:Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->writeBytes([B)Z
    //         move-result v0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/snapshot/SnapshotEntityCreator;->a(Lcom/google/android/gms/games/snapshot/SnapshotEntity;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.games.snapshot.SnapshotEntityCreator = null!!

    @JvmStatic fun a(p0: com.google.android.gms.games.snapshot.Snapshot, p1: Object): Boolean { return TODO("body: (Lcom/google/android/gms/games/snapshot/Snapshot;Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         instance-of v2, p1, Lcom/google/android/gms/games/snapshot/Snapshot;
    //         if-nez v2, :cond_1
    //         move v0, v1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         if-eq p0, p1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/games/snapshot/Snapshot;
    //         invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/Snapshot;->getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/Snapshot;->getSnapshotContents()Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getSnapshotContents()Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    */

    @JvmStatic fun b(p0: com.google.android.gms.games.snapshot.Snapshot): Int { return TODO("body: (Lcom/google/android/gms/games/snapshot/Snapshot;)I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getSnapshotContents()Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.games.snapshot.Snapshot): String { return TODO("body: (Lcom/google/android/gms/games/snapshot/Snapshot;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Metadata"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v1
    //         const-string v2, "HasContents"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/snapshot/Snapshot;->getSnapshotContents()Lcom/google/android/gms/games/snapshot/SnapshotContents;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
