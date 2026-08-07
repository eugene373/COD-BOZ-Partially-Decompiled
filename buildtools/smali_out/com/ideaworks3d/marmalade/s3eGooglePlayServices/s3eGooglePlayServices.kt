package com.ideaworks3d.marmalade.s3eGooglePlayServices

// Auto-emitted from smali source: s3eGooglePlayServices.java.
// 16 fields, 46 methods.

open class s3eGooglePlayServices: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesInterface, com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener, com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener, com.google.android.gms.games.multiplayer.OnInvitationReceivedListener, com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener {
    var mHashIdToParticipMap: java.util.HashMap
    var mMyDisplayName: String
    var mMyEmail: String
    var mMyId: String
    var mParticipants: java.util.ArrayList
    var mPlayerHashIds: java.util.ArrayList
    var mRoomId: String
    var m_PretendActivity: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesActivity
    private var m_invitees: java.util.ArrayList
    var m_maxAutoMatchPlayers: Int
    var m_minAutoMatchPlayers: Int

    constructor()

    private fun getActivity(): com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesActivity { return TODO("body: ()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         invoke-direct {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;-><init>()V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->setServiceInterface(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->onCreate(Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->onStart()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         return-object v0
    */

    private fun makeBasicRoomConfigBuilder(): com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;") }
    /*
    //         .locals 2
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "makeBasicRoomConfigBuilder"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->builder(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->setRoomStatusUpdateListener(Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->setMessageReceivedListener(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;
    //         move-result-object v0
    //         return-object v0
    */

    fun broadcastMyHashId() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayLocalPlayerID()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mParticipants:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v6
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         move-object v5, v0
    //         check-cast v5, Lcom/google/android/gms/games/multiplayer/Participant;
    //         invoke-interface {v5}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyId:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         iget-object v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;
    //         invoke-interface {v5}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->sendReliableMessage(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;[BLjava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    public fun createMatchMaking() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "createMatchMaking begin"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_minAutoMatchPlayers:I
    //         if-lez v0, :cond_1
    //         iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_minAutoMatchPlayers:I
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_maxAutoMatchPlayers:I
    //         const-wide/16 v2, 0x0
    //         invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->createAutoMatchCriteria(IIJ)Landroid/os/Bundle;
    //         move-result-object v0
    //         :goto_0
    //         const-string v1, "s3eGooglePlayServices"
    //         const-string v2, "createMatchMaking 1"
    //         invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->makeBasicRoomConfigBuilder()Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_invitees:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->addPlayersToInvite(Ljava/util/ArrayList;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->setAutoMatchCriteria(Landroid/os/Bundle;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;
    //         :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "createMatchMaking 2 roomConfigBuilder = "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->build()Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;
    //         move-result-object v0
    //         const-string v1, "s3eGooglePlayServices"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "createMatchMaking 3 roomConfig = "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         sget-object v1, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v2
    //         invoke-interface {v1, v2, v0}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->create(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "createMatchMaking end"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent): Boolean { return TODO("body: (IILandroid/content/Intent;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         const/4 v5, -0x1
    //         const/4 v1, 0x1
    //         const-string v2, "s3eGooglePlayServices"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "onActivityResult begin request = "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, ", response = "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/16 v2, 0x2710
    //         if-ne p1, v2, :cond_2
    //         const-string v2, "s3eGooglePlayServices"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "onActivityResult 0, data "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         if-ne p2, v5, :cond_0
    //         const-string v2, "players"
    //         invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_invitees:Ljava/util/ArrayList;
    //         const-string v2, "min_automatch_players"
    //         invoke-virtual {p3, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    //         move-result v2
    //         iput v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_minAutoMatchPlayers:I
    //         const-string v2, "max_automatch_players"
    //         invoke-virtual {p3, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    //         move-result v0
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_maxAutoMatchPlayers:I
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "onActivityResult m_invitees = "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_invitees:Ljava/util/ArrayList;
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->createMatchMaking()V
    //         :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v2, "onActivityResult 2"
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         move v0, v1
    //         :cond_1
    //         :goto_0
    //         return v0
    //         :cond_2
    //         const/16 v2, 0x2712
    //         if-ne p1, v2, :cond_6
    //         if-ne p2, v5, :cond_4
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "onActivityResult request"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ", response = "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ", intent = "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->broadcastMyHashId()V
    //         :cond_3
    //         :goto_1
    //         move v0, v1
    //         goto :goto_0
    //         :cond_4
    //         if-nez p2, :cond_5
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayLeaveRoom()V
    //         goto :goto_1
    //         :cond_5
    //         const/16 v0, 0x2715
    //         if-ne p2, v0, :cond_3
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayLeaveRoom()V
    //         goto :goto_1
    //         :cond_6
    //         const/16 v2, 0x2711
    //         if-ne p1, v2, :cond_1
    //         if-eq p2, v5, :cond_7
    //         move v0, v1
    //         goto :goto_0
    //         :cond_7
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "onActivityResult RC_INVITATION_INBOX, response = "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v2, "invitation"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Invitation;
    //         const-string v2, "s3eGooglePlayServices"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "onActivityResult RC_INVITATION_INBOX, invitation = "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;
    //         move-result-object v0
    //         sput-object v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_IncomingInvitationId:Ljava/lang/String;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->makeBasicRoomConfigBuilder()Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;
    //         move-result-object v0
    //         sget-object v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_IncomingInvitationId:Ljava/lang/String;
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->setInvitationIdToAccept(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->build()Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;
    //         move-result-object v0
    //         sget-object v2, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v3
    //         invoke-interface {v2, v3, v0}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->join(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V
    //         move v0, v1
    //         goto/16 :goto_0
    */

    public fun onConnectedToRoom(p0: com.google.android.gms.games.multiplayer.realtime.Room) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/Room;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "onConnectedToRoom."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mParticipants:Ljava/util/ArrayList;
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Players:Lcom/google/android/gms/games/Players;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/games/Players;->getCurrentPlayerId(Lcom/google/android/gms/common/api/GoogleApiClient;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipantId(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyId:Ljava/lang/String;
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Players:Lcom/google/android/gms/games/Players;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/games/Players;->getCurrentPlayer(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/Player;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/games/Player;->getDisplayName()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyDisplayName:Ljava/lang/String;
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getRoomId()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Room ID: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "My ID: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyId:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "My player name: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyDisplayName:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "<< CONNECTED TO ROOM>>"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun onDisconnectedFromRoom(p0: com.google.android.gms.games.multiplayer.realtime.Room) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/Room;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onInvitationReceived(p0: com.google.android.gms.games.multiplayer.Invitation) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/Invitation;)V */ }
    /*
    //         .locals 3
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;
    //         move-result-object v0
    //         sput-object v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_IncomingInvitationId:Ljava/lang/String;
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onInvitationReceived m_IncomingInvitationId "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         sget-object v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_IncomingInvitationId:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Invitations:Lcom/google/android/gms/games/multiplayer/Invitations;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/games/multiplayer/Invitations;->getInvitationInboxIntent(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;
    //         move-result-object v0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v1
    //         const/16 v2, 0x2711
    //         invoke-virtual {v1, v0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->startActivityForResult_transfer(Landroid/content/Intent;I)V
    //         return-void
    */

    public fun onInvitationRemoved(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onJoinedRoom(p0: Int, p1: com.google.android.gms.games.multiplayer.realtime.Room) { /* TODO(body): (ILcom/google/android/gms/games/multiplayer/realtime/Room;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onJoinedRoom statusCode = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ", room = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         if-eqz p1, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, " *** ERROR onJoinedRoom"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         const v2, 0x7fffffff
    //         invoke-interface {v0, v1, p2, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->getWaitingRoomIntent(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;
    //         move-result-object v0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v1
    //         const/16 v2, 0x2712
    //         invoke-virtual {v1, v0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->startActivityForResult_transfer(Landroid/content/Intent;I)V
    //         goto :goto_0
    */

    public fun onLeftRoom(p0: Int, p1: String) { /* TODO(body): (ILjava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onP2PConnected(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onP2PDisconnected(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onPeerDeclined(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         return-void
    */

    public fun onPeerInvitedToRoom(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         return-void
    */

    public fun onPeerJoined(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         return-void
    */

    public fun onPeerLeft(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         return-void
    */

    public fun onPeersConnected(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         return-void
    */

    public fun onPeersDisconnected(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: java.util.List) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         return-void
    */

    public fun onRealTimeMessageReceived(p0: com.google.android.gms.games.multiplayer.realtime.RealTimeMessage) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V */ }
    /*
    //         .locals 5
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onRealTimeMessageReceived rtm = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;->getMessageData()[B
    //         move-result-object v0
    //         new-instance v1, Ljava/lang/String;
    //         invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V
    //         invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;->getSenderParticipantId()Ljava/lang/String;
    //         move-result-object v2
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "onRealTimeMessageReceived playerHashId = "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, ", sender = "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mParticipants:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Participant;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         iget-object v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mHashIdToParticipMap:Ljava/util/HashMap;
    //         invoke-virtual {v4, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mParticipants:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         if-ne v0, v1, :cond_2
    //         const/4 v0, 0x0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_MatchMakingGameStart(I)V
    //         :cond_2
    //         return-void
    */

    public fun onRoomAutoMatching(p0: com.google.android.gms.games.multiplayer.realtime.Room) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/Room;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onRoomConnected(p0: Int, p1: com.google.android.gms.games.multiplayer.realtime.Room) { /* TODO(body): (ILcom/google/android/gms/games/multiplayer/realtime/Room;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onRoomConnected statusCode = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ", room = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         if-eqz p1, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "*** Error: onRoomConnected, status "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-interface {p2}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mParticipants:Ljava/util/ArrayList;
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayLocalPlayerID()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mHashIdToParticipMap:Ljava/util/HashMap;
    //         goto :goto_0
    */

    public fun onRoomConnecting(p0: com.google.android.gms.games.multiplayer.realtime.Room) { /* TODO(body): (Lcom/google/android/gms/games/multiplayer/realtime/Room;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onRoomCreated(p0: Int, p1: com.google.android.gms.games.multiplayer.realtime.Room) { /* TODO(body): (ILcom/google/android/gms/games/multiplayer/realtime/Room;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onRoomCreated statusCode = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, ", room = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         if-eqz p1, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, " *** ERROR onRoomCreated"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-interface {p2}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getRoomId()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;
    //         sget-object v0, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         const v2, 0x7fffffff
    //         invoke-interface {v0, v1, p2, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->getWaitingRoomIntent(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;
    //         move-result-object v0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v1
    //         const/16 v2, 0x2712
    //         invoke-virtual {v1, v0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->startActivityForResult_transfer(Landroid/content/Intent;I)V
    //         goto :goto_0
    */

    public fun s3eGooglePlayLeaveRoom() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eGooglePlayLeaveRoom mRoomId "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;
    //         invoke-interface {v0, v1, p0, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->leave(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;
    //         goto :goto_0
    */

    public fun s3eGooglePlayLocalPlayerID(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayLocalPlayerName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "s3eGooglePlayServices"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "s3eGooglePlayLocalPlayerID id = "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         return-object v0
    */

    fun s3eGooglePlayLocalPlayerName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyEmail:Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         sget-object v1, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;
    //         invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;
    //         move-result-object v2
    //         array-length v3, v2
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v3, :cond_0
    //         aget-object v4, v2, v0
    //         iget-object v5, v4, Landroid/accounts/Account;->name:Ljava/lang/String;
    //         invoke-virtual {v1, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z
    //         move-result v5
    //         if-eqz v5, :cond_1
    //         iget-object v0, v4, Landroid/accounts/Account;->name:Ljava/lang/String;
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyEmail:Ljava/lang/String;
    //         :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eGooglePlayLocalPlayerName possibleEmail = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyEmail:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyEmail:Ljava/lang/String;
    //         return-object v0
    //         :cond_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    */

    public fun s3eGooglePlayMatchMakingInvitePlayers(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayMatchMakingInvitePlayers begin"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayMatchMakingInvitePlayers called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         new-instance v1, Landroid/app/AlertDialog$Builder;
    //         invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
    //         const-string v0, "Select"
    //         invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         const-string v1, "Select from"
    //         invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         const-string v1, "invite players"
    //         new-instance v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$2;
    //         invoke-direct {v2, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$2;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)V
    //         invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         const-string v1, "see invitings"
    //         new-instance v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$1;
    //         invoke-direct {v2, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$1;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)V
    //         invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun s3eGooglePlayMatchMakingSubscribeOnInvitation(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayMatchMakingSubscribeOnInvitation begin"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayMatchMakingSubscribeOnInvitation called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/games/Games;->Invitations:Lcom/google/android/gms/games/multiplayer/Invitations;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p0}, Lcom/google/android/gms/games/multiplayer/Invitations;->registerInvitationListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    public fun s3eGooglePlayPlayerCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eGooglePlayPlayerCount mPlayerHashIds "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         return v0
    */

    public fun s3eGooglePlayPlayerId(p0: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, "s3eGooglePlayServices"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "s3eGooglePlayPlayerId mPlayerHashIds "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         return-object v0
    */

    public fun s3eGooglePlayServicesIncrementAchievement(p0: String, p1: Int, p2: Boolean): Boolean { return TODO("body: (Ljava/lang/String;IZ)Z") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayServicesIncrementAchievement called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->incrementAchievement(Ljava/lang/String;IZ)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun s3eGooglePlayServicesLoadAchievements(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayServicesLoadAchievements called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->loadAchievements()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun s3eGooglePlayServicesLoadCurrentPlayerLeaderboardScore(p0: String, p1: Int, p2: Int): Boolean { return TODO("body: (Ljava/lang/String;II)Z") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayServicesLoadCurrentPlayerLeaderboardScore called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->loadCurrentPlayerLeaderboardScore(Ljava/lang/String;II)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun s3eGooglePlayServicesLoadPlayerCenteredScores(p0: String, p1: Int, p2: Int, p3: Int, p4: Boolean): Boolean { return TODO("body: (Ljava/lang/String;IIIZ)Z") }
    /*
    //         .locals 6
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayServicesLoadPlayerCenteredScores called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         move-object v1, p1
    //         move v2, p2
    //         move v3, p3
    //         move v4, p4
    //         move v5, p5
    //         invoke-virtual/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->loadPlayerCenteredScores(Ljava/lang/String;IIIZ)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun s3eGooglePlayServicesLoadTopScores(p0: String, p1: Int, p2: Int, p3: Int, p4: Boolean): Boolean { return TODO("body: (Ljava/lang/String;IIIZ)Z") }
    /*
    //         .locals 6
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayServicesLoadTopScores called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         move-object v1, p1
    //         move v2, p2
    //         move v3, p3
    //         move v4, p4
    //         move v5, p5
    //         invoke-virtual/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->loadTopScores(Ljava/lang/String;IIIZ)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun s3eGooglePlayServicesRevealAchievement(p0: String, p1: Boolean): Boolean { return TODO("body: (Ljava/lang/String;Z)Z") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayServicesRevealAchievement called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->revealAchievement(Ljava/lang/String;Z)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun s3eGooglePlayServicesShowAchievements(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayServicesShowAchievements called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->showAchievements()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun s3eGooglePlayServicesShowAllLeaderboards(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayServicesShowAllLeaderboards called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->showAllLeaderboards()Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun s3eGooglePlayServicesShowLeaderboard(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayServicesShowLeaderboard called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->showLeaderboard(Ljava/lang/String;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun s3eGooglePlayServicesSignIn() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "signIn"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->beginUserInitiatedSignIn()V
    //         return-void
    */

    public fun s3eGooglePlayServicesSignOut() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "signOut"
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->signOut()V
    //         return-void
    */

    public fun s3eGooglePlayServicesSubmitScore(p0: String, p1: Int, p2: Boolean): Boolean { return TODO("body: (Ljava/lang/String;IZ)Z") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayServicesSubmitScore called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->submitScore(Ljava/lang/String;IZ)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun s3eGooglePlayServicesUnlockAchievement(p0: String, p1: Boolean): Boolean { return TODO("body: (Ljava/lang/String;Z)Z") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "s3eGooglePlayServices"
    //         const-string v1, "s3eGooglePlayServicesUnlockAchievement called when not signed in"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    //         move-result-object v0
    //         invoke-virtual {v0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->unlockAchievement(Ljava/lang/String;Z)Z
    //         move-result v0
    //         goto :goto_0
    */

    companion object {
    val RC_INVITATION_INBOX: Int = 0x2711
    val RC_SELECT_PLAYERS: Int = 0x2710
    val RC_WAITING_ROOM: Int = 0x2712
    private val TAG: String = "s3eGooglePlayServices"
    var m_IncomingInvitationId: String
    }
}
