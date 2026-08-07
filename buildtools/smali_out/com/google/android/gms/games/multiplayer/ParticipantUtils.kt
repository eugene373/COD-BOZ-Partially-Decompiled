package com.google.android.gms.games.multiplayer

// Auto-emitted from smali.
// 0 fields, 3 methods.

class ParticipantUtils {
    private constructor()

    companion object {
    public @JvmStatic fun bV(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         const-string v0, "Participant ID must not be null"
    //         invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         const-string v0, "p_"
    //         invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getParticipantId(playerId: java.util.ArrayList, p1: String): String { return TODO("body: (Ljava/util/ArrayList;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .local p0, "participants":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/android/gms/games/multiplayer/Participant;>;"
    //         const/4 v0, 0x0
    //         invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
    //         move-result v2
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v2, :cond_1
    //         invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Participant;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Participant;->getPlayer()Lcom/google/android/gms/games/Player;
    //         move-result-object v3
    //         if-eqz v3, :cond_0
    //         invoke-interface {v3}, Lcom/google/android/gms/games/Player;->getPlayerId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    }
}
