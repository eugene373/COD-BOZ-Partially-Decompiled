package com.google.android.gms.games.multiplayer.turnbased

// Auto-emitted from smali.
// 4 fields, 8 methods.

class LoadMatchesResponse {
    private val acA: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer
    private val acB: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer
    private val acC: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer
    private val acz: com.google.android.gms.games.multiplayer.InvitationBuffer

    public constructor(matchData: android.os.Bundle)

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acz:Lcom/google/android/gms/games/multiplayer/InvitationBuffer;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acz:Lcom/google/android/gms/games/multiplayer/InvitationBuffer;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;->close()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acA:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acA:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;->close()V
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acB:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acB:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;->close()V
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acC:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acC:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;->close()V
    //         :cond_3
    //         return-void
    */

    public fun getCompletedMatches(): com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acC:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         return-object v0
    */

    public fun getInvitations(): com.google.android.gms.games.multiplayer.InvitationBuffer { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/InvitationBuffer;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acz:Lcom/google/android/gms/games/multiplayer/InvitationBuffer;
    //         return-object v0
    */

    public fun getMyTurnMatches(): com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acA:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         return-object v0
    */

    public fun getTheirTurnMatches(): com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acB:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         return-object v0
    */

    public fun hasData(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acz:Lcom/google/android/gms/games/multiplayer/InvitationBuffer;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acz:Lcom/google/android/gms/games/multiplayer/InvitationBuffer;
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;->getCount()I
    //         move-result v1
    //         if-lez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acA:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acA:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;->getCount()I
    //         move-result v1
    //         if-gtz v1, :cond_0
    //         :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acB:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         if-eqz v1, :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acB:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;->getCount()I
    //         move-result v1
    //         if-gtz v1, :cond_0
    //         :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acC:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         if-eqz v1, :cond_4
    //         iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/LoadMatchesResponse;->acC:Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;->getCount()I
    //         move-result v1
    //         if-gtz v1, :cond_0
    //         :cond_4
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    private @JvmStatic fun a(p0: android.os.Bundle, p1: Int): com.google.android.gms.common.data.DataHolder { return TODO("body: (Landroid/os/Bundle;I)Lcom/google/android/gms/common/data/DataHolder;") }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/google/android/gms/games/internal/constants/TurnBasedMatchTurnStatus;->dH(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/data/DataHolder;
    //         goto :goto_0
    */

    }
}
