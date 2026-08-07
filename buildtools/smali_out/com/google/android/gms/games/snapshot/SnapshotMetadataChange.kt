package com.google.android.gms.games.snapshot

// Auto-emitted from smali.
// 7 fields, 12 methods.

class SnapshotMetadataChange: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Tr: String
    private val adj: Long
    private val adk: android.net.Uri
    private var adl: com.google.android.gms.common.data.a

    constructor()

    constructor(versionCode: Int, description: String, playedTimeMillis: Long, coverImage: com.google.android.gms.common.data.a, coverImageUri: android.net.Uri)

    constructor(description: String, playedTimeMillis: Long, coverImage: com.google.android.gms.common.data.a, coverImageUri: android.net.Uri)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCoverImage(): android.graphics.Bitmap { return TODO("body: ()Landroid/graphics/Bitmap;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;->adl:Lcom/google/android/gms/common/data/a;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;->adl:Lcom/google/android/gms/common/data/a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/data/a;->gw()Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getCoverImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;->adk:Landroid/net/Uri;
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;->Tr:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPlayedTimeMillis(): Long { return TODO("body: ()Ljava/lang/Long;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;->adj:Ljava/lang/Long;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;->BR:I
    //         return v0
    */

    public fun lM(): com.google.android.gms.common.data.a { return TODO("body: ()Lcom/google/android/gms/common/data/a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;->adl:Lcom/google/android/gms/common/data/a;
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChangeCreator;->a(Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.games.snapshot.SnapshotMetadataChangeCreator = null!!
    @JvmField public val EMPTY_CHANGE: com.google.android.gms.games.snapshot.SnapshotMetadataChange = null!!
    }
}
