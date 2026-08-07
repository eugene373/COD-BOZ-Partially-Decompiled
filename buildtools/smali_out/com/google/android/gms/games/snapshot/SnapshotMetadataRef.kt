package com.google.android.gms.games.snapshot

// Auto-emitted from smali.
// 2 fields, 20 methods.

class SnapshotMetadataRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.snapshot.SnapshotMetadata {
    private val abx: com.google.android.gms.games.Game
    private val adu: com.google.android.gms.games.Player

    public constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;->a(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.snapshot.SnapshotMetadata { return TODO("body: ()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;-><init>(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->freeze()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCoverImageAspectRatio(): Float { return TODO("body: ()F") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         const-string v1, "cover_icon_image_height"
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->getFloat(Ljava/lang/String;)F
    //         move-result v1
    //         const-string v2, "cover_icon_image_width"
    //         invoke-virtual {p0, v2}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->getFloat(Ljava/lang/String;)F
    //         move-result v2
    //         cmpl-float v3, v1, v0
    //         if-nez v3, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         div-float v0, v2, v1
    //         goto :goto_0
    */

    public fun getCoverImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "cover_icon_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCoverImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "cover_icon_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "description"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescription(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "description"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getGame(): com.google.android.gms.games.Game { return TODO("body: ()Lcom/google/android/gms/games/Game;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->abx:Lcom/google/android/gms/games/Game;
    //         return-object v0
    */

    public fun getLastModifiedTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "last_modified_timestamp"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getOwner(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->adu:Lcom/google/android/gms/games/Player;
    //         return-object v0
    */

    public fun getPlayedTime(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "duration"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getSnapshotId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_snapshot_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getTitle(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "title"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getUniqueName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "unique_name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;->a(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;->b(Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataRef;->freeze()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
