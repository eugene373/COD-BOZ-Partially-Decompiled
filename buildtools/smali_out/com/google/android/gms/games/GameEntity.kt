package com.google.android.gms.games

// Auto-emitted from smali.
// 26 fields, 45 methods.

class GameEntity: com.google.android.gms.games.internal.GamesDowngradeableSafeParcel(), com.google.android.gms.games.Game {
    private val BR: Int
    private val Ez: String
    private val NH: String
    private val Tr: String
    private val Ve: String
    private val Vf: String
    private val Vg: String
    private val Vh: android.net.Uri
    private val Vi: android.net.Uri
    private val Vj: android.net.Uri
    private val Vk: Boolean
    private val Vl: Boolean
    private val Vm: String
    private val Vn: Int
    private val Vo: Int
    private val Vp: Int
    private val Vq: Boolean
    private val Vr: Boolean
    private val Vs: String
    private val Vt: String
    private val Vu: String
    private val Vv: Boolean
    private val Vw: Boolean
    private val Vx: Boolean
    private val Vy: String

    constructor(versionCode: Int, applicationId: String, displayName: String, primaryCategory: String, secondaryCategory: String, description: String, developerName: String, iconImageUri: android.net.Uri, hiResImageUri: android.net.Uri, featuredImageUri: android.net.Uri, playEnabledGame: Boolean, instanceInstalled: Boolean, instancePackageName: String, gameplayAclStatus: Int, achievementTotalCount: Int, leaderboardCount: Int, realTimeEnabled: Boolean, turnBasedEnabled: Boolean, iconImageUrl: String, hiResImageUrl: String, featuredImageUrl: String, muted: Boolean, identitySharingConfirmed: Boolean, snapshotsEnabled: Boolean, themeColor: String)

    public constructor(game: com.google.android.gms.games.Game)

    public fun areSnapshotsEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->Vx:Z
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
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/GameEntity;->a(Lcom/google/android/gms/games/Game;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.Game { return TODO("body: ()Lcom/google/android/gms/games/Game;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->freeze()Lcom/google/android/gms/games/Game;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAchievementTotalCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/GameEntity;->Vo:I
    //         return v0
    */

    public fun getApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Ez:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Tr:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDescription(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Tr:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/jv;->b(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getDeveloperName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vg:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDeveloperName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vg:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/jv;->b(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getDisplayName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->NH:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDisplayName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->NH:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/jv;->b(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getFeaturedImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vj:Landroid/net/Uri;
    //         return-object v0
    */

    public fun getFeaturedImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vu:Ljava/lang/String;
    //         return-object v0
    */

    public fun getHiResImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vi:Landroid/net/Uri;
    //         return-object v0
    */

    public fun getHiResImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vt:Ljava/lang/String;
    //         return-object v0
    */

    public fun getIconImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vh:Landroid/net/Uri;
    //         return-object v0
    */

    public fun getIconImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vs:Ljava/lang/String;
    //         return-object v0
    */

    public fun getLeaderboardCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/GameEntity;->Vp:I
    //         return v0
    */

    public fun getPrimaryCategory(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Ve:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSecondaryCategory(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vf:Ljava/lang/String;
    //         return-object v0
    */

    public fun getThemeColor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vy:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/GameEntity;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->a(Lcom/google/android/gms/games/Game;)I
    //         move-result v0
    //         return v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun isMuted(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->Vv:Z
    //         return v0
    */

    public fun isRealTimeMultiplayerEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->Vq:Z
    //         return v0
    */

    public fun isTurnBasedMultiplayerEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->Vr:Z
    //         return v0
    */

    public fun jO(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->Vk:Z
    //         return v0
    */

    public fun jP(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->Vw:Z
    //         return v0
    */

    public fun jQ(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->Vl:Z
    //         return v0
    */

    public fun jR(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vm:Ljava/lang/String;
    //         return-object v0
    */

    public fun jS(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/GameEntity;->Vn:I
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->b(Lcom/google/android/gms/games/Game;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/GameEntity;->gQ()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/GameEntityCreator;->a(Lcom/google/android/gms/games/GameEntity;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Ez:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->NH:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Ve:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vf:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Tr:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vg:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vh:Landroid/net/Uri;
    //         if-nez v0, :cond_1
    //         move-object v0, v1
    //         :goto_1
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vi:Landroid/net/Uri;
    //         if-nez v0, :cond_2
    //         move-object v0, v1
    //         :goto_2
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vj:Landroid/net/Uri;
    //         if-nez v0, :cond_3
    //         :goto_3
    //         invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->Vk:Z
    //         if-eqz v0, :cond_4
    //         move v0, v2
    //         :goto_4
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/GameEntity;->Vl:Z
    //         if-eqz v0, :cond_5
    //         :goto_5
    //         invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vm:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget v0, p0, Lcom/google/android/gms/games/GameEntity;->Vn:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget v0, p0, Lcom/google/android/gms/games/GameEntity;->Vo:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget v0, p0, Lcom/google/android/gms/games/GameEntity;->Vp:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vh:Landroid/net/Uri;
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vi:Landroid/net/Uri;
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_2
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/games/GameEntity;->Vj:Landroid/net/Uri;
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         goto :goto_3
    //         :cond_4
    //         move v0, v3
    //         goto :goto_4
    //         :cond_5
    //         move v2, v3
    //         goto :goto_5
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    @JvmStatic fun a(p0: com.google.android.gms.games.Game): Int { return TODO("body: (Lcom/google/android/gms/games/Game;)I") }
    /*
    //         .locals 3
    //         const/16 v0, 0x15
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getApplicationId()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getDisplayName()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getPrimaryCategory()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getSecondaryCategory()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getDescription()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getDeveloperName()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x6
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x7
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x8
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getFeaturedImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x9
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jO()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0xa
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jQ()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0xb
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jR()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0xc
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jS()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0xd
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getAchievementTotalCount()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0xe
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getLeaderboardCount()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0xf
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->isRealTimeMultiplayerEnabled()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x10
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->isTurnBasedMultiplayerEnabled()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x11
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->isMuted()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x12
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jP()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x13
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->areSnapshotsEnabled()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x14
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getThemeColor()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.games.Game, p1: Object): Boolean { return TODO("body: (Lcom/google/android/gms/games/Game;Ljava/lang/Object;)Z") }
    /*
    //         .locals 5
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         instance-of v0, p1, Lcom/google/android/gms/games/Game;
    //         if-nez v0, :cond_1
    //         move v1, v2
    //         :cond_0
    //         :goto_0
    //         return v1
    //         :cond_1
    //         if-eq p0, p1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/games/Game;
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getApplicationId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getDisplayName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getDisplayName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getPrimaryCategory()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getPrimaryCategory()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getSecondaryCategory()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getSecondaryCategory()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getDescription()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getDescription()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getDeveloperName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getDeveloperName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getFeaturedImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getFeaturedImageUri()Landroid/net/Uri;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->jO()Z
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jO()Z
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->jQ()Z
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jQ()Z
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->jR()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jR()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->jS()I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jS()I
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getAchievementTotalCount()I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getAchievementTotalCount()I
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getLeaderboardCount()I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getLeaderboardCount()I
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->isRealTimeMultiplayerEnabled()Z
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->isRealTimeMultiplayerEnabled()Z
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->isTurnBasedMultiplayerEnabled()Z
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->isTurnBasedMultiplayerEnabled()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->isMuted()Z
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->isMuted()Z
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v4
    //         invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->jP()Z
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jP()Z
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v4
    //         invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         move v0, v1
    //         :goto_1
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-static {v3, v0}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->areSnapshotsEnabled()Z
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->areSnapshotsEnabled()Z
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/Game;->getThemeColor()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getThemeColor()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         :cond_2
    //         move v1, v2
    //         goto/16 :goto_0
    //         :cond_3
    //         move v0, v2
    //         goto :goto_1
    */

    @JvmStatic fun b(p0: com.google.android.gms.games.Game): String { return TODO("body: (Lcom/google/android/gms/games/Game;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "ApplicationId"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getApplicationId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "DisplayName"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getDisplayName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "PrimaryCategory"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getPrimaryCategory()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "SecondaryCategory"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getSecondaryCategory()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Description"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getDescription()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "DeveloperName"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getDeveloperName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "IconImageUri"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "IconImageUrl"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getIconImageUrl()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "HiResImageUri"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "HiResImageUrl"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getHiResImageUrl()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "FeaturedImageUri"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getFeaturedImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "FeaturedImageUrl"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getFeaturedImageUrl()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "PlayEnabledGame"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jO()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "InstanceInstalled"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jQ()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "InstancePackageName"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->jR()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "AchievementTotalCount"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getAchievementTotalCount()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "LeaderboardCount"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getLeaderboardCount()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "RealTimeMultiplayerEnabled"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->isRealTimeMultiplayerEnabled()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "TurnBasedMultiplayerEnabled"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->isTurnBasedMultiplayerEnabled()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "AreSnapshotsEnabled"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->areSnapshotsEnabled()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "ThemeColor"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/Game;->getThemeColor()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun b(p0: Integer): Boolean { return TODO("body: (Ljava/lang/Integer;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->c(Ljava/lang/Integer;)Z
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun bw(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->aV(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun jT(): Integer { return TODO("body: ()Ljava/lang/Integer;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/games/GameEntity;->gP()Ljava/lang/Integer;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
