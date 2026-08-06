.class Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;
.super Ljava/lang/Object;
.source "s3eGooglePlayServices.java"

# interfaces
.implements Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesInterface;
.implements Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;
.implements Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
.implements Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;
.implements Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;


# static fields
.field static final RC_INVITATION_INBOX:I = 0x2711

.field static final RC_SELECT_PLAYERS:I = 0x2710

.field static final RC_WAITING_ROOM:I = 0x2712

.field private static final TAG:Ljava/lang/String; = "s3eGooglePlayServices"

.field static m_IncomingInvitationId:Ljava/lang/String;


# instance fields
.field mHashIdToParticipMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/games/multiplayer/Participant;",
            ">;"
        }
    .end annotation
.end field

.field mMyDisplayName:Ljava/lang/String;

.field mMyEmail:Ljava/lang/String;

.field mMyId:Ljava/lang/String;

.field mParticipants:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/games/multiplayer/Participant;",
            ">;"
        }
    .end annotation
.end field

.field mPlayerHashIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field mRoomId:Ljava/lang/String;

.field m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

.field private m_invitees:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field m_maxAutoMatchPlayers:I

.field m_minAutoMatchPlayers:I


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mParticipants:Ljava/util/ArrayList;

    .line 47
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;

    .line 48
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mHashIdToParticipMap:Ljava/util/HashMap;

    .line 50
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyId:Ljava/lang/String;

    .line 51
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;

    .line 52
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyDisplayName:Ljava/lang/String;

    .line 53
    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyEmail:Ljava/lang/String;

    .line 198
    iput v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_minAutoMatchPlayers:I

    .line 199
    iput v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_maxAutoMatchPlayers:I

    return-void
.end method

.method static synthetic access$000(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    return-object v0
.end method

.method private getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    if-nez v0, :cond_0

    .line 60
    new-instance v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    invoke-direct {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    .line 61
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->setServiceInterface(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)V

    .line 62
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->onCreate(Landroid/os/Bundle;)V

    .line 63
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->onStart()V

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_PretendActivity:Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    return-object v0
.end method

.method private makeBasicRoomConfigBuilder()Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;
    .locals 2

    .prologue
    .line 356
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "makeBasicRoomConfigBuilder"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 357
    invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->builder(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->setRoomStatusUpdateListener(Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->setMessageReceivedListener(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method broadcastMyHashId()V
    .locals 7

    .prologue
    .line 361
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayLocalPlayerID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    .line 362
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mParticipants:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/gms/games/multiplayer/Participant;

    .line 363
    invoke-interface {v5}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 365
    sget-object v0, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;

    invoke-interface {v5}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;

    move-result-object v5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->sendReliableMessage(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;[BLjava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 367
    :cond_1
    return-void
.end method

.method public createMatchMaking()V
    .locals 4

    .prologue
    .line 322
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "createMatchMaking begin"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 325
    iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_minAutoMatchPlayers:I

    if-lez v0, :cond_1

    .line 327
    iget v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_minAutoMatchPlayers:I

    iget v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_maxAutoMatchPlayers:I

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->createAutoMatchCriteria(IIJ)Landroid/os/Bundle;

    move-result-object v0

    .line 334
    :goto_0
    const-string v1, "s3eGooglePlayServices"

    const-string v2, "createMatchMaking 1"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 336
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->makeBasicRoomConfigBuilder()Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;

    move-result-object v1

    .line 337
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_invitees:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->addPlayersToInvite(Ljava/util/ArrayList;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;

    .line 338
    if-eqz v0, :cond_0

    .line 340
    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->setAutoMatchCriteria(Landroid/os/Bundle;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;

    .line 343
    :cond_0
    const-string v0, "s3eGooglePlayServices"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createMatchMaking 2 roomConfigBuilder = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 344
    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->build()Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;

    move-result-object v0

    .line 345
    const-string v1, "s3eGooglePlayServices"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createMatchMaking 3 roomConfig = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 346
    sget-object v1, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->create(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V

    .line 348
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "createMatchMaking end"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 351
    return-void

    .line 331
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v5, -0x1

    const/4 v1, 0x1

    .line 244
    const-string v2, "s3eGooglePlayServices"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onActivityResult begin request = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", response = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    const/16 v2, 0x2710

    if-ne p1, v2, :cond_2

    .line 247
    const-string v2, "s3eGooglePlayServices"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onActivityResult 0, data "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 249
    if-ne p2, v5, :cond_0

    .line 251
    const-string v2, "players"

    invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_invitees:Ljava/util/ArrayList;

    .line 252
    const-string v2, "min_automatch_players"

    invoke-virtual {p3, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_minAutoMatchPlayers:I

    .line 253
    const-string v2, "max_automatch_players"

    invoke-virtual {p3, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_maxAutoMatchPlayers:I

    .line 255
    const-string v0, "s3eGooglePlayServices"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult m_invitees = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_invitees:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 256
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->createMatchMaking()V

    .line 259
    :cond_0
    const-string v0, "s3eGooglePlayServices"

    const-string v2, "onActivityResult 2"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v1

    .line 317
    :cond_1
    :goto_0
    return v0

    .line 262
    :cond_2
    const/16 v2, 0x2712

    if-ne p1, v2, :cond_6

    .line 264
    if-ne p2, v5, :cond_4

    .line 266
    const-string v0, "s3eGooglePlayServices"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult request"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->broadcastMyHashId()V

    :cond_3
    :goto_1
    move v0, v1

    .line 288
    goto :goto_0

    .line 269
    :cond_4
    if-nez p2, :cond_5

    .line 279
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayLeaveRoom()V

    goto :goto_1

    .line 281
    :cond_5
    const/16 v0, 0x2715

    if-ne p2, v0, :cond_3

    .line 286
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayLeaveRoom()V

    goto :goto_1

    .line 290
    :cond_6
    const/16 v2, 0x2711

    if-ne p1, v2, :cond_1

    .line 292
    if-eq p2, v5, :cond_7

    move v0, v1

    .line 295
    goto :goto_0

    .line 298
    :cond_7
    const-string v0, "s3eGooglePlayServices"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult RC_INVITATION_INBOX, response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 301
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 302
    const-string v2, "invitation"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/Invitation;

    .line 304
    const-string v2, "s3eGooglePlayServices"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onActivityResult RC_INVITATION_INBOX, invitation = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 305
    invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_IncomingInvitationId:Ljava/lang/String;

    .line 308
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->makeBasicRoomConfigBuilder()Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;

    move-result-object v0

    .line 309
    sget-object v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_IncomingInvitationId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->setInvitationIdToAccept(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->build()Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;

    move-result-object v0

    .line 310
    sget-object v2, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->join(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V

    move v0, v1

    .line 314
    goto/16 :goto_0
.end method

.method public onConnectedToRoom(Lcom/google/android/gms/games/multiplayer/realtime/Room;)V
    .locals 3

    .prologue
    .line 502
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "onConnectedToRoom."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 505
    invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mParticipants:Ljava/util/ArrayList;

    .line 506
    sget-object v0, Lcom/google/android/gms/games/Games;->Players:Lcom/google/android/gms/games/Players;

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/games/Players;->getCurrentPlayerId(Lcom/google/android/gms/common/api/GoogleApiClient;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipantId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyId:Ljava/lang/String;

    .line 507
    sget-object v0, Lcom/google/android/gms/games/Games;->Players:Lcom/google/android/gms/games/Players;

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/games/Players;->getCurrentPlayer(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/Player;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/games/Player;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyDisplayName:Ljava/lang/String;

    .line 510
    invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getRoomId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;

    .line 513
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Room ID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 514
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "My ID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 515
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "My player name: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyDisplayName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 516
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "<< CONNECTED TO ROOM>>"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 517
    return-void
.end method

.method public onDisconnectedFromRoom(Lcom/google/android/gms/games/multiplayer/realtime/Room;)V
    .locals 0

    .prologue
    .line 521
    return-void
.end method

.method public onInvitationReceived(Lcom/google/android/gms/games/multiplayer/Invitation;)V
    .locals 3

    .prologue
    .line 426
    invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInvitationId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_IncomingInvitationId:Ljava/lang/String;

    .line 427
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onInvitationReceived m_IncomingInvitationId "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->m_IncomingInvitationId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 428
    sget-object v0, Lcom/google/android/gms/games/Games;->Invitations:Lcom/google/android/gms/games/multiplayer/Invitations;

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/games/multiplayer/Invitations;->getInvitationInboxIntent(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;

    move-result-object v0

    .line 429
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v1

    const/16 v2, 0x2711

    invoke-virtual {v1, v0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->startActivityForResult_transfer(Landroid/content/Intent;I)V

    .line 430
    return-void
.end method

.method public onInvitationRemoved(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 565
    return-void
.end method

.method public onJoinedRoom(ILcom/google/android/gms/games/multiplayer/realtime/Room;)V
    .locals 3

    .prologue
    .line 392
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onJoinedRoom statusCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", room = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 393
    if-eqz p1, :cond_0

    .line 395
    const-string v0, "s3eGooglePlayServices"

    const-string v1, " *** ERROR onJoinedRoom"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 402
    :goto_0
    return-void

    .line 400
    :cond_0
    sget-object v0, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    const v2, 0x7fffffff

    invoke-interface {v0, v1, p2, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->getWaitingRoomIntent(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;

    move-result-object v0

    .line 401
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v1

    const/16 v2, 0x2712

    invoke-virtual {v1, v0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->startActivityForResult_transfer(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method public onLeftRoom(ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 497
    return-void
.end method

.method public onP2PConnected(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 525
    return-void
.end method

.method public onP2PDisconnected(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 529
    return-void
.end method

.method public onPeerDeclined(Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 533
    return-void
.end method

.method public onPeerInvitedToRoom(Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 537
    return-void
.end method

.method public onPeerJoined(Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 541
    return-void
.end method

.method public onPeerLeft(Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 545
    return-void
.end method

.method public onPeersConnected(Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 549
    return-void
.end method

.method public onPeersDisconnected(Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 553
    return-void
.end method

.method public onRealTimeMessageReceived(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V
    .locals 5

    .prologue
    .line 372
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onRealTimeMessageReceived rtm = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 373
    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;->getMessageData()[B

    move-result-object v0

    .line 374
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 375
    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;->getSenderParticipantId()Ljava/lang/String;

    move-result-object v2

    .line 376
    const-string v0, "s3eGooglePlayServices"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onRealTimeMessageReceived playerHashId = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", sender = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 378
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mParticipants:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/Participant;

    .line 381
    invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 382
    iget-object v4, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mHashIdToParticipMap:Ljava/util/HashMap;

    invoke-virtual {v4, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 385
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mParticipants:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 386
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_MatchMakingGameStart(I)V

    .line 387
    :cond_2
    return-void
.end method

.method public onRoomAutoMatching(Lcom/google/android/gms/games/multiplayer/realtime/Room;)V
    .locals 0

    .prologue
    .line 557
    return-void
.end method

.method public onRoomConnected(ILcom/google/android/gms/games/multiplayer/realtime/Room;)V
    .locals 3

    .prologue
    .line 484
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onRoomConnected statusCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", room = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 485
    if-eqz p1, :cond_0

    .line 486
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "*** Error: onRoomConnected, status "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 493
    :goto_0
    return-void

    .line 489
    :cond_0
    invoke-interface {p2}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mParticipants:Ljava/util/ArrayList;

    .line 490
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;

    .line 491
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayLocalPlayerID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 492
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mHashIdToParticipMap:Ljava/util/HashMap;

    goto :goto_0
.end method

.method public onRoomConnecting(Lcom/google/android/gms/games/multiplayer/realtime/Room;)V
    .locals 0

    .prologue
    .line 561
    return-void
.end method

.method public onRoomCreated(ILcom/google/android/gms/games/multiplayer/realtime/Room;)V
    .locals 3

    .prologue
    .line 408
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onRoomCreated statusCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", room = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 409
    if-eqz p1, :cond_0

    .line 411
    const-string v0, "s3eGooglePlayServices"

    const-string v1, " *** ERROR onRoomCreated"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 421
    :goto_0
    return-void

    .line 416
    :cond_0
    invoke-interface {p2}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getRoomId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;

    .line 419
    sget-object v0, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    const v2, 0x7fffffff

    invoke-interface {v0, v1, p2, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->getWaitingRoomIntent(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;

    move-result-object v0

    .line 420
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v1

    const/16 v2, 0x2712

    invoke-virtual {v1, v0, v2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->startActivityForResult_transfer(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method public s3eGooglePlayLeaveRoom()V
    .locals 3

    .prologue
    .line 471
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eGooglePlayLeaveRoom mRoomId "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 473
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 478
    :goto_0
    return-void

    .line 476
    :cond_0
    sget-object v0, Lcom/google/android/gms/games/Games;->RealTimeMultiplayer:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;

    invoke-interface {v0, v1, p0, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer;->leave(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Ljava/lang/String;)V

    .line 477
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mRoomId:Ljava/lang/String;

    goto :goto_0
.end method

.method public s3eGooglePlayLocalPlayerID()Ljava/lang/String;
    .locals 4

    .prologue
    .line 434
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->s3eGooglePlayLocalPlayerName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 435
    const-string v1, "s3eGooglePlayServices"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "s3eGooglePlayLocalPlayerID id = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 436
    return-object v0
.end method

.method s3eGooglePlayLocalPlayerName()Ljava/lang/String;
    .locals 6

    .prologue
    .line 441
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyEmail:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 443
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    .line 444
    sget-object v1, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    .line 445
    invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;

    move-result-object v2

    .line 446
    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 447
    iget-object v5, v4, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 448
    iget-object v0, v4, Landroid/accounts/Account;->name:Ljava/lang/String;

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyEmail:Ljava/lang/String;

    .line 453
    :cond_0
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eGooglePlayLocalPlayerName possibleEmail = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyEmail:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 454
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mMyEmail:Ljava/lang/String;

    return-object v0

    .line 446
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public s3eGooglePlayMatchMakingInvitePlayers()Z
    .locals 3

    .prologue
    .line 203
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayMatchMakingInvitePlayers begin"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 206
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayMatchMakingInvitePlayers called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 207
    const/4 v0, 0x0

    .line 227
    :goto_0
    return v0

    .line 210
    :cond_0
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    .line 211
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v0, "Select"

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "Select from"

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "invite players"

    new-instance v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$2;

    invoke-direct {v2, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$2;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "see invitings"

    new-instance v2, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$1;

    invoke-direct {v2, p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices$1;-><init>(Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 227
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public s3eGooglePlayMatchMakingSubscribeOnInvitation()Z
    .locals 2

    .prologue
    .line 232
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayMatchMakingSubscribeOnInvitation begin"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 235
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayMatchMakingSubscribeOnInvitation called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 236
    const/4 v0, 0x0

    .line 239
    :goto_0
    return v0

    .line 238
    :cond_0
    sget-object v0, Lcom/google/android/gms/games/Games;->Invitations:Lcom/google/android/gms/games/multiplayer/Invitations;

    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->getApiClient()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Lcom/google/android/gms/games/multiplayer/Invitations;->registerInvitationListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V

    .line 239
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public s3eGooglePlayPlayerCount()I
    .locals 3

    .prologue
    .line 459
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eGooglePlayPlayerCount mPlayerHashIds "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 460
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public s3eGooglePlayPlayerId(I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 465
    const-string v0, "s3eGooglePlayServices"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "s3eGooglePlayPlayerId mPlayerHashIds "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 466
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->mPlayerHashIds:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public s3eGooglePlayServicesIncrementAchievement(Ljava/lang/String;IZ)Z
    .locals 2

    .prologue
    .line 163
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayServicesIncrementAchievement called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    const/4 v0, 0x0

    .line 168
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->incrementAchievement(Ljava/lang/String;IZ)Z

    move-result v0

    goto :goto_0
.end method

.method public s3eGooglePlayServicesLoadAchievements()Z
    .locals 2

    .prologue
    .line 145
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 147
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayServicesLoadAchievements called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    const/4 v0, 0x0

    .line 150
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->loadAchievements()Z

    move-result v0

    goto :goto_0
.end method

.method public s3eGooglePlayServicesLoadCurrentPlayerLeaderboardScore(Ljava/lang/String;II)Z
    .locals 2

    .prologue
    .line 85
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayServicesLoadCurrentPlayerLeaderboardScore called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    const/4 v0, 0x0

    .line 90
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->loadCurrentPlayerLeaderboardScore(Ljava/lang/String;II)Z

    move-result v0

    goto :goto_0
.end method

.method public s3eGooglePlayServicesLoadPlayerCenteredScores(Ljava/lang/String;IIIZ)Z
    .locals 6

    .prologue
    .line 94
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayServicesLoadPlayerCenteredScores called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    const/4 v0, 0x0

    .line 99
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->loadPlayerCenteredScores(Ljava/lang/String;IIIZ)Z

    move-result v0

    goto :goto_0
.end method

.method public s3eGooglePlayServicesLoadTopScores(Ljava/lang/String;IIIZ)Z
    .locals 6

    .prologue
    .line 103
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayServicesLoadTopScores called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    const/4 v0, 0x0

    .line 108
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->loadTopScores(Ljava/lang/String;IIIZ)Z

    move-result v0

    goto :goto_0
.end method

.method public s3eGooglePlayServicesRevealAchievement(Ljava/lang/String;Z)Z
    .locals 2

    .prologue
    .line 172
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayServicesRevealAchievement called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    const/4 v0, 0x0

    .line 177
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->revealAchievement(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0
.end method

.method public s3eGooglePlayServicesShowAchievements()Z
    .locals 2

    .prologue
    .line 181
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 183
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayServicesShowAchievements called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    const/4 v0, 0x0

    .line 186
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->showAchievements()Z

    move-result v0

    goto :goto_0
.end method

.method public s3eGooglePlayServicesShowAllLeaderboards()Z
    .locals 2

    .prologue
    .line 121
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 123
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayServicesShowAllLeaderboards called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    const/4 v0, 0x0

    .line 126
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->showAllLeaderboards()Z

    move-result v0

    goto :goto_0
.end method

.method public s3eGooglePlayServicesShowLeaderboard(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 130
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayServicesShowLeaderboard called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    const/4 v0, 0x0

    .line 135
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->showLeaderboard(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method public s3eGooglePlayServicesSignIn()V
    .locals 2

    .prologue
    .line 75
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "signIn"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->beginUserInitiatedSignIn()V

    .line 77
    return-void
.end method

.method public s3eGooglePlayServicesSignOut()V
    .locals 2

    .prologue
    .line 80
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "signOut"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->signOut()V

    .line 82
    return-void
.end method

.method public s3eGooglePlayServicesSubmitScore(Ljava/lang/String;IZ)Z
    .locals 2

    .prologue
    .line 112
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 114
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayServicesSubmitScore called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    const/4 v0, 0x0

    .line 117
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->submitScore(Ljava/lang/String;IZ)Z

    move-result v0

    goto :goto_0
.end method

.method public s3eGooglePlayServicesUnlockAchievement(Ljava/lang/String;Z)Z
    .locals 2

    .prologue
    .line 154
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->isSignedIn()Z

    move-result v0

    if-nez v0, :cond_0

    .line 156
    const-string v0, "s3eGooglePlayServices"

    const-string v1, "s3eGooglePlayServicesUnlockAchievement called when not signed in"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    const/4 v0, 0x0

    .line 159
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServices;->getActivity()Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->unlockAchievement(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0
.end method
