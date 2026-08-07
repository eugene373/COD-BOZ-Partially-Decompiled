package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 2 fields, 3 methods.

class GamesClientImpl_InvitationReceivedBinderCallback: com.google.android.gms.games.internal.AbstractGamesCallbacks() {
    val WC: com.google.android.gms.games.internal.GamesClientImpl
    private val WM: com.google.android.gms.games.multiplayer.OnInvitationReceivedListener

    constructor(listener: com.google.android.gms.games.internal.GamesClientImpl, p1: com.google.android.gms.games.multiplayer.OnInvitationReceivedListener)

    public fun n(p0: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 5
    //         new-instance v1, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;->getCount()I
    //         move-result v2
    //         if-lez v2, :cond_0
    //         const/4 v0, 0x0
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Invitation;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Invitation;->freeze()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Invitation;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;->release()V
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v2, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedCallback;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v4, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedBinderCallback;->WM:Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;
    //         invoke-direct {v2, v3, v4, v0}, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;Lcom/google/android/gms/games/multiplayer/Invitation;)V
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         :cond_1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;->release()V
    //         throw v0
    */

    public fun onInvitationRemoved(invitationId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationRemovedCallback;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedBinderCallback;->WM:Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;
    //         invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationRemovedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         return-void
    */

}
