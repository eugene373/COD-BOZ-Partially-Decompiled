package com.google.android.gms.games

// Auto-emitted from smali.
// 3 fields, 27 methods.

class PlayerRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.Player {
    private val VP: com.google.android.gms.games.PlayerLevelInfo
    private val VY: com.google.android.gms.games.internal.player.PlayerColumnNames
    private val VZ: com.google.android.gms.games.internal.player.MostRecentGameInfoRef

    public constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int)

    public constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int, prefix: String)

    private fun jW(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v1, v1, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->abb:Ljava/lang/String;
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/games/PlayerRef;->aS(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v1, v1, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->abb:Ljava/lang/String;
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/games/PlayerRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v2
    //         const-wide/16 v4, -0x1
    //         cmp-long v1, v2, v4
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
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
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/PlayerEntity;->a(Lcom/google/android/gms/games/Player;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/PlayerEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/PlayerEntity;-><init>(Lcom/google/android/gms/games/Player;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerRef;->freeze()Lcom/google/android/gms/games/Player;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplayName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aaT:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplayName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aaT:Ljava/lang/String;
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/PlayerRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getHiResImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aaW:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getHiResImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aaX:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getIconImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aaU:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getIconImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aaV:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getLastPlayedWithTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aba:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->aQ(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aba:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const-wide/16 v0, -0x1
    //         :goto_0
    //         return-wide v0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aba:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         goto :goto_0
    */

    public fun getLevelInfo(): com.google.android.gms.games.PlayerLevelInfo { return TODO("body: ()Lcom/google/android/gms/games/PlayerLevelInfo;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VP:Lcom/google/android/gms/games/PlayerLevelInfo;
    //         return-object v0
    */

    public fun getPlayerId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aaS:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRetrievedTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aaY:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getTitle(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->abi:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getTitle(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->abi:Ljava/lang/String;
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/PlayerRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun hasHiResImage(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerRef;->getHiResImageUri()Landroid/net/Uri;
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
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerRef;->getIconImageUri()Landroid/net/Uri;
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

    public fun isProfileVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->abk:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public fun jU(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->aaZ:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun jV(): com.google.android.gms.games.internal.player.MostRecentGameInfo { return TODO("body: ()Lcom/google/android/gms/games/internal/player/MostRecentGameInfo;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VY:Lcom/google/android/gms/games/internal/player/PlayerColumnNames;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/player/PlayerColumnNames;->abl:Ljava/lang/String;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/PlayerRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/PlayerRef;->VZ:Lcom/google/android/gms/games/internal/player/MostRecentGameInfoRef;
    //         goto :goto_0
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
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/PlayerRef;->freeze()Lcom/google/android/gms/games/Player;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/PlayerEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/PlayerEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
