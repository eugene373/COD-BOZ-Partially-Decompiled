package com.google.android.gms.games

// Auto-emitted from smali.
// 15 fields, 35 methods.

class PlayerEntity: com.google.android.gms.games.internal.GamesDowngradeableSafeParcel(), com.google.android.gms.games.Player {
    private val BR: Int
    private val NH: String
    private val Nw: String
    private val VK: String
    private val VL: Long
    private val VM: Int
    private val VN: Long
    private val VO: com.google.android.gms.games.internal.player.MostRecentGameInfoEntity
    private val VP: com.google.android.gms.games.PlayerLevelInfo
    private val VQ: Boolean
    private val Vh: android.net.Uri
    private val Vi: android.net.Uri
    private val Vs: String
    private val Vt: String

    constructor(versionCode: Int, playerId: String, displayName: String, iconImageUri: android.net.Uri, hiResImageUri: android.net.Uri, retrievedTimestamp: Long, isInCircles: Int, lastPlayedWithTimestamp: Long, iconImageUrl: String, hiResImageUrl: String, title: String, mostRecentGameInfo: com.google.android.gms.games.internal.player.MostRecentGameInfoEntity, playerLevelInfo: com.google.android.gms.games.PlayerLevelInfo, isProfileVisible: Boolean)

    public constructor(player: com.google.android.gms.games.Player)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/PlayerEntity;->a(Lcom/google/android/gms/games/Player;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->freeze()Lcom/google/android/gms/games/Player;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplayName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->NH:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDisplayName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->NH:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/jv;->b(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getHiResImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->Vi:Landroid/net/Uri;
    //         return-object v0
    */

    public fun getHiResImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->Vt:Ljava/lang/String;
    //         return-object v0
    */

    public fun getIconImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->Vh:Landroid/net/Uri;
    //         return-object v0
    */

    public fun getIconImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->Vs:Ljava/lang/String;
    //         return-object v0
    */

    public fun getLastPlayedWithTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/games/PlayerEntity;->VN:J
    //         return-wide v0
    */

    public fun getLevelInfo(): com.google.android.gms.games.PlayerLevelInfo { return TODO("body: ()Lcom/google/android/gms/games/PlayerLevelInfo;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->VP:Lcom/google/android/gms/games/PlayerLevelInfo;
    //         return-object v0
    */

    public fun getPlayerId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->VK:Ljava/lang/String;
    //         return-object v0
    */

    public fun getRetrievedTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/games/PlayerEntity;->VL:J
    //         return-wide v0
    */

    public fun getTitle(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->Nw:Ljava/lang/String;
    //         return-object v0
    */

    public fun getTitle(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->Nw:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/jv;->b(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/PlayerEntity;->BR:I
    //         return v0
    */

    public fun hasHiResImage(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun hasIconImage(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->b(Lcom/google/android/gms/games/Player;)I
    //         move-result v0
    //         return v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun isProfileVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/PlayerEntity;->VQ:Z
    //         return v0
    */

    public fun jU(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/PlayerEntity;->VM:I
    //         return v0
    */

    public fun jV(): com.google.android.gms.games.internal.player.MostRecentGameInfo { return TODO("body: ()Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->VO:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoEntity;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->c(Lcom/google/android/gms/games/Player;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerEntity;->gQ()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/PlayerEntityCreator;->a(Lcom/google/android/gms/games/PlayerEntity;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->VK:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->NH:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->Vh:Landroid/net/Uri;
    //         if-nez v0, :cond_1
    //         move-object v0, v1
    //         :goto_1
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->Vi:Landroid/net/Uri;
    //         if-nez v0, :cond_2
    //         :goto_2
    //         invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-wide v0, p0, Lcom/google/android/gms/games/PlayerEntity;->VL:J
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->Vh:Landroid/net/Uri;
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerEntity;->Vi:Landroid/net/Uri;
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         goto :goto_2
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    @JvmStatic fun a(p0: com.google.android.gms.games.Player, p1: Object): Boolean { return TODO("body: (Lcom/google/android/gms/games/Player;Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         instance-of v2, p1, Lcom/google/android/gms/games/Player;
    //         if-nez v2, :cond_1
    //         move v0, v1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         if-eq p0, p1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/games/Player;
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getPlayerId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getPlayerId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getDisplayName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getDisplayName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getRetrievedTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getRetrievedTimestamp()J
    //         move-result-wide v4
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getTitle()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getTitle()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Player;->getLevelInfo()Lcom/google/android/gms/games/PlayerLevelInfo;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getLevelInfo()Lcom/google/android/gms/games/PlayerLevelInfo;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    */

    @JvmStatic fun b(p0: com.google.android.gms.games.Player): Int { return TODO("body: (Lcom/google/android/gms/games/Player;)I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x7
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getPlayerId()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getDisplayName()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getRetrievedTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getTitle()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x6
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getLevelInfo()Lcom/google/android/gms/games/PlayerLevelInfo;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun b(p0: Integer): Boolean { return TODO("body: (Ljava/lang/Integer;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->c(Ljava/lang/Integer;)Z
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun bw(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/PlayerEntity;->aV(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.games.Player): String { return TODO("body: (Lcom/google/android/gms/games/Player;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "PlayerId"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getPlayerId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "DisplayName"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getDisplayName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "IconImageUri"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "IconImageUrl"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getIconImageUrl()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "HiResImageUri"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "HiResImageUrl"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getHiResImageUrl()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "RetrievedTimestamp"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getRetrievedTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Title"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getTitle()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "LevelInfo"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Player;->getLevelInfo()Lcom/google/android/gms/games/PlayerLevelInfo;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun jT(): Integer { return TODO("body: ()Ljava/lang/Integer;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/games/PlayerEntity;->gP()Ljava/lang/Integer;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
