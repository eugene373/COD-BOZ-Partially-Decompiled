package com.google.android.gms.games.achievement

// Auto-emitted from smali.
// 18 fields, 35 methods.

class AchievementEntity: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.games.achievement.Achievement {
    private val BR: Int
    private val FD: Int
    private val Tr: String
    private val Wa: String
    private val Wb: android.net.Uri
    private val Wc: String
    private val Wd: android.net.Uri
    private val We: String
    private val Wf: Int
    private val Wg: String
    private val Wh: com.google.android.gms.games.PlayerEntity
    private val Wi: Int
    private val Wj: String
    private val Wk: Long
    private val Wl: Long
    private val mName: String
    private val mState: Int

    constructor(versionCode: Int, achievementId: String, type: Int, name: String, description: String, unlockedImageUri: android.net.Uri, unlockedImageUrl: String, revealedImageUri: android.net.Uri, revealedImageUrl: String, totalSteps: Int, formattedTotalSteps: String, player: com.google.android.gms.games.PlayerEntity, state: Int, currentSteps: Int, formattedCurrentSteps: String, lastUpdatedTimestamp: Long, xpValue: Long)

    public constructor(achievement: com.google.android.gms.games.achievement.Achievement)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/achievement/AchievementEntity;->a(Lcom/google/android/gms/games/achievement/Achievement;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.achievement.Achievement { return TODO("body: ()Lcom/google/android/gms/games/achievement/Achievement;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->freeze()Lcom/google/android/gms/games/achievement/Achievement;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAchievementId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wa:Ljava/lang/String;
    //         return-object v0
    */

    public fun getCurrentSteps(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wi:I
    //         return v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Tr:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDescription(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Tr:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/jv;->b(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getFormattedCurrentSteps(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wj:Ljava/lang/String;
    //         return-object v0
    */

    public fun getFormattedCurrentSteps(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wj:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/jv;->b(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getFormattedTotalSteps(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wg:Ljava/lang/String;
    //         return-object v0
    */

    public fun getFormattedTotalSteps(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wg:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/jv;->b(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getLastUpdatedTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wk:J
    //         return-wide v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->mName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->mName:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/jv;->b(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getPlayer(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         return-object v0
    */

    public fun getRevealedImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wd:Landroid/net/Uri;
    //         return-object v0
    */

    public fun getRevealedImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->We:Ljava/lang/String;
    //         return-object v0
    */

    public fun getState(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->mState:I
    //         return v0
    */

    public fun getTotalSteps(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wf:I
    //         return v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->FD:I
    //         return v0
    */

    public fun getUnlockedImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wb:Landroid/net/Uri;
    //         return-object v0
    */

    public fun getUnlockedImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wc:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->BR:I
    //         return v0
    */

    public fun getXpValue(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/games/achievement/AchievementEntity;->Wl:J
    //         return-wide v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->a(Lcom/google/android/gms/games/achievement/Achievement;)I
    //         move-result v0
    //         return v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->b(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/achievement/AchievementEntityCreator;->a(Lcom/google/android/gms/games/achievement/AchievementEntity;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.games.achievement.AchievementEntityCreator = null!!

    @JvmStatic fun a(p0: com.google.android.gms.games.achievement.Achievement): Int { return TODO("body: (Lcom/google/android/gms/games/achievement/Achievement;)I") }
    /*
    //         .locals 6
    //         const/4 v5, 0x1
    //         const/4 v1, 0x0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I
    //         move-result v0
    //         if-ne v0, v5, :cond_0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getCurrentSteps()I
    //         move-result v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getTotalSteps()I
    //         move-result v0
    //         :goto_0
    //         const/16 v3, 0xa
    //         new-array v3, v3, [Ljava/lang/Object;
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getAchievementId()Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v3, v1
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         aput-object v1, v3, v5
    //         const/4 v1, 0x2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v3, v1
    //         const/4 v1, 0x3
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v3, v1
    //         const/4 v1, 0x4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getXpValue()J
    //         move-result-wide v4
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v4
    //         aput-object v4, v3, v1
    //         const/4 v1, 0x5
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v3, v1
    //         const/4 v1, 0x6
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getLastUpdatedTimestamp()J
    //         move-result-wide v4
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v4
    //         aput-object v4, v3, v1
    //         const/4 v1, 0x7
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getPlayer()Lcom/google/android/gms/games/Player;
    //         move-result-object v4
    //         aput-object v4, v3, v1
    //         const/16 v1, 0x8
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v3, v1
    //         const/16 v1, 0x9
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         aput-object v0, v3, v1
    //         invoke-static {v3}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    //         :cond_0
    //         move v0, v1
    //         move v2, v1
    //         goto :goto_0
    */

    @JvmStatic fun a(p0: com.google.android.gms.games.achievement.Achievement, p1: Object): Boolean { return TODO("body: (Lcom/google/android/gms/games/achievement/Achievement;Ljava/lang/Object;)Z") }
    /*
    //         .locals 8
    //         const/4 v3, 0x0
    //         const/4 v1, 0x1
    //         instance-of v0, p1, Lcom/google/android/gms/games/achievement/Achievement;
    //         if-nez v0, :cond_1
    //         move v1, v3
    //         :cond_0
    //         :goto_0
    //         return v1
    //         :cond_1
    //         if-eq p0, p1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/games/achievement/Achievement;
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I
    //         move-result v0
    //         if-ne v0, v1, :cond_3
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getCurrentSteps()I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getCurrentSteps()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getTotalSteps()I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getTotalSteps()I
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         invoke-static {v0, v4}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         :goto_1
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getAchievementId()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getAchievementId()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I
    //         move-result v5
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getXpValue()J
    //         move-result-wide v4
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getXpValue()J
    //         move-result-wide v6
    //         invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I
    //         move-result v5
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getLastUpdatedTimestamp()J
    //         move-result-wide v4
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getLastUpdatedTimestamp()J
    //         move-result-wide v6
    //         invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievement;->getPlayer()Lcom/google/android/gms/games/Player;
    //         move-result-object v4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getPlayer()Lcom/google/android/gms/games/Player;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         if-eqz v2, :cond_2
    //         if-nez v0, :cond_0
    //         :cond_2
    //         move v1, v3
    //         goto/16 :goto_0
    //         :cond_3
    //         move v0, v1
    //         move v2, v1
    //         goto/16 :goto_1
    */

    @JvmStatic fun b(p0: com.google.android.gms.games.achievement.Achievement): String { return TODO("body: (Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Id"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getAchievementId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Type"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Name"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Description"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getDescription()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Player"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getPlayer()Lcom/google/android/gms/games/Player;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "State"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getState()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getType()I
    //         move-result v1
    //         const/4 v2, 0x1
    //         if-ne v1, v2, :cond_0
    //         const-string v1, "CurrentSteps"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getCurrentSteps()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         const-string v1, "TotalSteps"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/achievement/Achievement;->getTotalSteps()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
