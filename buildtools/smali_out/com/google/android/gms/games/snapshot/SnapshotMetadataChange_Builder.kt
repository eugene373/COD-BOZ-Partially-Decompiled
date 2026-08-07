package com.google.android.gms.games.snapshot

// Auto-emitted from smali.
// 4 fields, 6 methods.

class SnapshotMetadataChange_Builder {
    private var Tr: String
    private var adk: android.net.Uri
    private var adm: Long
    private var adn: com.google.android.gms.common.data.a

    public constructor()

    public fun build(): com.google.android.gms.games.snapshot.SnapshotMetadataChange { return TODO("body: ()Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;") }
    /*
    //         .locals 5
    //         new-instance v0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;
    //         iget-object v1, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->Tr:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adm:Ljava/lang/Long;
    //         iget-object v3, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adn:Lcom/google/android/gms/common/data/a;
    //         iget-object v4, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adk:Landroid/net/Uri;
    //         invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;-><init>(Ljava/lang/String;Ljava/lang/Long;Lcom/google/android/gms/common/data/a;Landroid/net/Uri;)V
    //         return-object v0
    */

    public fun fromMetadata(metadata: com.google.android.gms.games.snapshot.SnapshotMetadata): com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder { return TODO("body: (Lcom/google/android/gms/games/snapshot/SnapshotMetadata;)Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;") }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->getDescription()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->Tr:Ljava/lang/String;
    //         invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->getPlayedTime()J
    //         move-result-wide v0
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adm:Ljava/lang/Long;
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adm:Ljava/lang/Long;
    //         invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
    //         move-result-wide v0
    //         const-wide/16 v2, -0x1
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iput-object v4, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adm:Ljava/lang/Long;
    //         :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->getCoverImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adk:Landroid/net/Uri;
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adk:Landroid/net/Uri;
    //         if-eqz v0, :cond_1
    //         iput-object v4, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adn:Lcom/google/android/gms/common/data/a;
    //         :cond_1
    //         return-object p0
    */

    public fun setCoverImage(coverImage: android.graphics.Bitmap): com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder { return TODO("body: (Landroid/graphics/Bitmap;)Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/common/data/a;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/common/data/a;-><init>(Landroid/graphics/Bitmap;)V
    //         iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adn:Lcom/google/android/gms/common/data/a;
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adk:Landroid/net/Uri;
    //         return-object p0
    */

    public fun setDescription(description: String): com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->Tr:Ljava/lang/String;
    //         return-object p0
    */

    public fun setPlayedTimeMillis(playedTimeMillis: Long): com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder { return TODO("body: (J)Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange$Builder;->adm:Ljava/lang/Long;
    //         return-object p0
    */

}
