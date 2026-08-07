package com.google.android.gms.games

// Auto-emitted from smali.
// 6 fields, 13 methods.

class PlayerLevelInfo: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val VU: Long
    private val VV: Long
    private val VW: com.google.android.gms.games.PlayerLevel
    private val VX: com.google.android.gms.games.PlayerLevel

    constructor(versionCode: Int, currentXpTotal: Long, lastLevelUpTimestamp: Long, currentLevel: com.google.android.gms.games.PlayerLevel, nextLevel: com.google.android.gms.games.PlayerLevel)

    public constructor(currentXpTotal: Long, lastLevelUpTimestamp: Long, currentLevel: com.google.android.gms.games.PlayerLevel, nextLevel: com.google.android.gms.games.PlayerLevel)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         instance-of v2, p1, Lcom/google/android/gms/games/PlayerLevelInfo;
    //         if-nez v2, :cond_1
    //         move v0, v1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         if-eq p1, p0, :cond_0
    //         check-cast p1, Lcom/google/android/gms/games/PlayerLevelInfo;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-wide v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VU:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         iget-wide v4, p1, Lcom/google/android/gms/games/PlayerLevelInfo;->VU:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         iget-wide v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VV:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         iget-wide v4, p1, Lcom/google/android/gms/games/PlayerLevelInfo;->VV:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         iget-object v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VW:Lcom/google/android/gms/games/PlayerLevel;
    //         iget-object v3, p1, Lcom/google/android/gms/games/PlayerLevelInfo;->VW:Lcom/google/android/gms/games/PlayerLevel;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         iget-object v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VX:Lcom/google/android/gms/games/PlayerLevel;
    //         iget-object v3, p1, Lcom/google/android/gms/games/PlayerLevelInfo;->VX:Lcom/google/android/gms/games/PlayerLevel;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getCurrentLevel(): com.google.android.gms.games.PlayerLevel { return TODO("body: ()Lcom/google/android/gms/games/PlayerLevel;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VW:Lcom/google/android/gms/games/PlayerLevel;
    //         return-object v0
    */

    public fun getCurrentXpTotal(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VU:J
    //         return-wide v0
    */

    public fun getLastLevelUpTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VV:J
    //         return-wide v0
    */

    public fun getNextLevel(): com.google.android.gms.games.PlayerLevel { return TODO("body: ()Lcom/google/android/gms/games/PlayerLevel;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VX:Lcom/google/android/gms/games/PlayerLevel;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x4
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-wide v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VU:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VV:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VW:Lcom/google/android/gms/games/PlayerLevel;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VX:Lcom/google/android/gms/games/PlayerLevel;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isMaxLevel(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VW:Lcom/google/android/gms/games/PlayerLevel;
    //         iget-object v1, p0, Lcom/google/android/gms/games/PlayerLevelInfo;->VX:Lcom/google/android/gms/games/PlayerLevel;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/PlayerLevel;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/PlayerLevelInfoCreator;->a(Lcom/google/android/gms/games/PlayerLevelInfo;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.games.PlayerLevelInfoCreator = null!!
    }
}
