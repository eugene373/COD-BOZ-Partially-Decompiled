package com.google.android.gms.games

// Auto-emitted from smali.
// 5 fields, 12 methods.

class PlayerLevel: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val VR: Int
    private val VS: Long
    private val VT: Long

    constructor(versionCode: Int, levelNumber: Int, minXp: Long, maxXp: Long)

    public constructor(value: Int, minXp: Long, maxXp: Long)

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
    //         instance-of v2, p1, Lcom/google/android/gms/games/PlayerLevel;
    //         if-nez v2, :cond_1
    //         move v0, v1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         if-eq p0, p1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/games/PlayerLevel;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         invoke-virtual {p1}, Lcom/google/android/gms/games/PlayerLevel;->getLevelNumber()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerLevel;->getLevelNumber()I
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/games/PlayerLevel;->getMinXp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerLevel;->getMinXp()J
    //         move-result-wide v4
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/games/PlayerLevel;->getMaxXp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerLevel;->getMaxXp()J
    //         move-result-wide v4
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getLevelNumber(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/PlayerLevel;->VR:I
    //         return v0
    */

    public fun getMaxXp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/games/PlayerLevel;->VT:J
    //         return-wide v0
    */

    public fun getMinXp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/games/PlayerLevel;->VS:J
    //         return-wide v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/PlayerLevel;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/games/PlayerLevel;->VR:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/games/PlayerLevel;->VS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/games/PlayerLevel;->VT:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "LevelNumber"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerLevel;->getLevelNumber()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "MinXp"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerLevel;->getMinXp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "MaxXp"
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerLevel;->getMaxXp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/PlayerLevelCreator;->a(Lcom/google/android/gms/games/PlayerLevel;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.games.PlayerLevelCreator = null!!
    }
}
