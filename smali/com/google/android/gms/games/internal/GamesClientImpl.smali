.class public final Lcom/google/android/gms/games/internal/GamesClientImpl;
.super Lcom/google/android/gms/common/internal/e;

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/internal/GamesClientImpl$DeleteSnapshotResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$CommitSnapshotResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$OpenSnapshotResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadSnapshotsResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadQuestsResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$AcceptQuestResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadRequestSummariesResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadRequestsResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$UpdateRequestsResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$SendRequestResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$InboxCountResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$ContactSettingLoadResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangeResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadAclResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$CancelMatchResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LeaveMatchResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$UpdateMatchResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$InitiateMatchResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadMatchResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchResult;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$SubmitScoreResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadOwnerCoverPhotoUrisResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadProfileSettingsResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadXpStreamResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadXpForGameCategoriesResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadPlayersResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadMatchesResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadInvitationsResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadPlayerScoreResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadScoresResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardMetadataResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadGameSearchSuggestionsResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadGameInstancesResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadExtendedGamesResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadGamesResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadEventResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$UpdateAchievementResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LoadAchievementsResultImpl;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$P2PDisconnectedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$P2PConnectedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$PeerDisconnectedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$PeerConnectedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$PeerDeclinedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$PeerLeftRoomCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$PeerJoinedRoomCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$PeerInvitedToRoomCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$DisconnectedFromRoomCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$ConnectedToRoomCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RoomAutoMatchingCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RoomConnectingCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RoomConnectedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$JoinedRoomCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RoomCreatedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$AbstractPeerStatusCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$AbstractRoomStatusCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$AbstractRoomCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$NearbyPlayerDetectedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RequestRemovedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$QuestCompletedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$MatchRemovedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationRemovedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotDeletedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotCommittedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotOpenedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotsLoadedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$QuestMilestoneClaimBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$QuestAcceptedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RequestSummariesLoadedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsLoadedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RequestSentBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsUpdatedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$SignOutCompleteBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$InboxCountsLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$ContactSettingsUpdatedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$ContactSettingsLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$NotifyAclUpdatedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$NotifyAclLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeReliableMessageBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchCanceledBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchLeftBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchLoadedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$SubmitScoreBinderCallbacks;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$OwnerCoverPhotoUrisLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$ProfileSettingsUpdatedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$ProfileSettingsLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$PlayerXpStreamLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$PlayerXpForGameCategoriesLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$QuestUpdateBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationsLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$PlayerLeaderboardScoreLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$GameSearchSuggestionsLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$GameInstancesLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$EventsLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$GamesLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementsLoadedBinderCallback;,
        Lcom/google/android/gms/games/internal/GamesClientImpl$GameClientEventIncrementCache;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/e",
        "<",
        "Lcom/google/android/gms/games/internal/IGamesService;",
        ">;",
        "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;",
        "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;"
    }
.end annotation


# instance fields
.field private final Dd:Ljava/lang/String;

.field private final WA:J

.field private final WB:Lcom/google/android/gms/games/Games$GamesOptions;

.field Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

.field private final Wt:Ljava/lang/String;

.field private final Wu:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;",
            ">;"
        }
    .end annotation
.end field

.field private Wv:Lcom/google/android/gms/games/PlayerEntity;

.field private Ww:Lcom/google/android/gms/games/GameEntity;

.field private final Wx:Lcom/google/android/gms/games/internal/PopupManager;

.field private Wy:Z

.field private final Wz:Landroid/os/Binder;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;ILandroid/view/View;Lcom/google/android/gms/games/Games$GamesOptions;)V
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "looper"    # Landroid/os/Looper;
    .param p3, "gamePackageName"    # Ljava/lang/String;
    .param p4, "accountName"    # Ljava/lang/String;
    .param p5, "connectedListener"    # Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
    .param p6, "connectionFailedListener"    # Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
    .param p7, "scopes"    # [Ljava/lang/String;
    .param p8, "gravity"    # I
    .param p9, "gamesContentView"    # Landroid/view/View;
    .param p10, "options"    # Lcom/google/android/gms/games/Games$GamesOptions;

    .prologue
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/common/internal/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    new-instance v2, Lcom/google/android/gms/games/internal/GamesClientImpl$1;

    invoke-direct {v2, p0}, Lcom/google/android/gms/games/internal/GamesClientImpl$1;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;)V

    iput-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wy:Z

    iput-object p3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wt:Ljava/lang/String;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Dd:Ljava/lang/String;

    new-instance v2, Landroid/os/Binder;

    invoke-direct {v2}, Landroid/os/Binder;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wz:Landroid/os/Binder;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wu:Ljava/util/Map;

    move/from16 v0, p8

    invoke-static {p0, v0}, Lcom/google/android/gms/games/internal/PopupManager;->a(Lcom/google/android/gms/games/internal/GamesClientImpl;I)Lcom/google/android/gms/games/internal/PopupManager;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    move-object/from16 v0, p9

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->k(Landroid/view/View;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    int-to-long v2, v2

    iput-wide v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    move-object/from16 v0, p10

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WB:Lcom/google/android/gms/games/Games$GamesOptions;

    invoke-virtual {p0, p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V

    invoke-virtual {p0, p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->registerConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    return-void
.end method

.method private R(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/multiplayer/realtime/Room;
    .locals 3

    new-instance v1, Lcom/google/android/gms/games/multiplayer/realtime/RoomBuffer;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomBuffer;->getCount()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomBuffer;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/realtime/Room;

    invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->freeze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/realtime/Room;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomBuffer;->release()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomBuffer;->release()V

    throw v0
.end method

.method static synthetic a(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/multiplayer/realtime/Room;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->R(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/multiplayer/realtime/Room;

    move-result-object v0

    return-object v0
.end method

.method private bA(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;
    .locals 5

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1}, Lcom/google/android/gms/games/internal/IGamesService;->bF(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    new-instance v2, Landroid/net/LocalSocket;

    invoke-direct {v2}, Landroid/net/LocalSocket;-><init>()V

    new-instance v3, Landroid/net/LocalSocketAddress;

    invoke-direct {v3, v0}, Landroid/net/LocalSocketAddress;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/net/LocalSocket;->connect(Landroid/net/LocalSocketAddress;)V

    new-instance v0, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;

    invoke-direct {v0, v2, p1}, Lcom/google/android/gms/games/internal/RealTimeSocketImpl;-><init>(Landroid/net/LocalSocket;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v2, "Unable to create socket. Service died."

    invoke-static {v0, v2}, Lcom/google/android/gms/games/internal/GamesLog;->q(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v2, "GamesClientImpl"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "connect() call failed on socket: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/games/internal/GamesLog;->q(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method private bB(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;
    .locals 4

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1}, Lcom/google/android/gms/games/internal/IGamesService;->bK(Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v0, "GamesClientImpl"

    const-string v3, "Created native libjingle socket."

    invoke-static {v0, v3}, Lcom/google/android/gms/games/internal/GamesLog;->o(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/games/internal/LibjingleNativeSocket;

    invoke-direct {v0, v2}, Lcom/google/android/gms/games/internal/LibjingleNativeSocket;-><init>(Landroid/os/ParcelFileDescriptor;)V

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "GamesClientImpl"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to create socket for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/games/internal/GamesLog;->q(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v2, "Unable to create socket. Service died."

    invoke-static {v0, v2}, Lcom/google/android/gms/games/internal/GamesLog;->q(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0
.end method

.method private bz(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/kc;->hD()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->bB(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wu:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0

    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->bA(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;

    move-result-object v0

    goto :goto_0
.end method

.method private jZ()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wv:Lcom/google/android/gms/games/PlayerEntity;

    return-void
.end method

.method private kw()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wu:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;

    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "GamesClientImpl"

    const-string v3, "IOException:"

    invoke-static {v2, v3, v0}, Lcom/google/android/gms/games/internal/GamesLog;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wu:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;[BLjava/lang/String;Ljava/lang/String;)I
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeReliableMessageBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeReliableMessageBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;[BLjava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    goto :goto_0
.end method

.method public a([BLjava/lang/String;[Ljava/lang/String;)I
    .locals 2

    const-string v0, "Participant IDs must not be null"

    invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->b([BLjava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    goto :goto_0
.end method

.method public a(IIZ)Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->a(IIZ)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(I[BILandroid/graphics/Bitmap;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1, p2, p3, p5}, Lcom/google/android/gms/games/internal/IGamesService;->a(I[BILjava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "Must provide a non null icon"

    invoke-static {p4, v1}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "com.google.android.gms.games.REQUEST_ITEM_ICON"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/realtime/Room;I)Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->freeze()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;I)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;ZZI)Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->a(Ljava/lang/String;ZZI)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 1

    if-nez p1, :cond_0

    if-eqz p3, :cond_0

    const-string v0, "show_welcome_popup"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wy:Z

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/common/internal/e;->a(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->a(Landroid/os/IBinder;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;III)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/request/Requests$LoadRequestsResult;",
            ">;III)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;III)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;IIZZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadExtendedGamesResult;",
            ">;IIZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;IIZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;IZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;IZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;I[I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$LoadMatchesResult;",
            ">;I[I)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;I[I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;II)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;",
            ">;",
            "Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;",
            "II)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-virtual {p2}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBuffer;->lA()Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBufferHeader;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBufferHeader;->lB()Landroid/os/Bundle;

    move-result-object v2

    invoke-interface {v0, v1, v2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Landroid/os/Bundle;II)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$InitiateMatchResult;",
            ">;",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;->getVariant()I

    move-result v2

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;->lH()I

    move-result v3

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;->getInvitedPlayerIds()[Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;->getAutoMatchCriteria()Landroid/os/Bundle;

    move-result-object v5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;II[Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/games/snapshot/Snapshot;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/snapshot/Snapshots$CommitSnapshotResult;",
            ">;",
            "Lcom/google/android/gms/games/snapshot/Snapshot;",
            "Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;",
            ")V"
        }
    .end annotation

    invoke-interface {p2}, Lcom/google/android/gms/games/snapshot/Snapshot;->getSnapshotContents()Lcom/google/android/gms/games/snapshot/SnapshotContents;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->isClosed()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v2, "Snapshot already closed"

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    invoke-virtual {p3}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;->lM()Lcom/google/android/gms/common/data/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/data/a;->a(Ljava/io/File;)V

    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->getContents()Lcom/google/android/gms/drive/Contents;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->close()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotCommittedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotCommittedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {p2}, Lcom/google/android/gms/games/snapshot/Snapshot;->getMetadata()Lcom/google/android/gms/games/snapshot/SnapshotMetadata;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/games/snapshot/SnapshotMetadata;->getSnapshotId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3, p3, v2}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;Lcom/google/android/gms/drive/Contents;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v2}, Lcom/google/android/gms/games/internal/PopupManager;->kO()Landroid/os/IBinder;

    move-result-object v4

    iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v2}, Lcom/google/android/gms/games/internal/PopupManager;->kN()Landroid/os/Bundle;

    move-result-object v5

    move-object v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    :goto_1
    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;IIIZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;",
            ">;",
            "Ljava/lang/String;",
            "IIIZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IIIZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;IZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;",
            "Ljava/lang/String;",
            "IZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;IZZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;",
            "Ljava/lang/String;",
            "IZZ)V"
        }
    .end annotation

    const/4 v0, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    packed-switch v0, :pswitch_data_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid player collection: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-string v1, "played_with"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :pswitch_1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->d(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x9529ab2
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;IZZZZ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadExtendedGamesResult;",
            ">;",
            "Ljava/lang/String;",
            "IZZZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-interface/range {v0 .. v7}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;I[I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$LoadMatchesResult;",
            ">;",
            "Ljava/lang/String;",
            "I[I)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;I[I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;JLjava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/leaderboard/Leaderboards$SubmitScoreResult;",
            ">;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v2, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/games/internal/IGamesService;

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;JLjava/lang/String;)V

    :goto_1
    return-void

    :cond_0
    new-instance v2, Lcom/google/android/gms/games/internal/GamesClientImpl$SubmitScoreBinderCallbacks;

    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$SubmitScoreBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$LeaveMatchResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchLeftBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchLeftBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->c(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadPlayerScoreResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayerLeaderboardScoreLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayerLeaderboardScoreLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;II)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/request/Requests$LoadRequestsResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "III)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;III)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;IIIZ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIIZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-interface/range {v0 .. v7}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;IIIZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;IZZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IZZ)V"
        }
    .end annotation

    const/4 v0, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :cond_0
    :goto_0
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid player collection: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    const-string v1, "circled"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :sswitch_1
    const-string v1, "played_with"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "nearby"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :pswitch_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3e8dd581 -> :sswitch_2
        0x9529ab2 -> :sswitch_1
        0x2eaadd94 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;Lcom/google/android/gms/games/snapshot/SnapshotContents;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/snapshot/Snapshots$OpenSnapshotResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;",
            "Lcom/google/android/gms/games/snapshot/SnapshotContents;",
            ")V"
        }
    .end annotation

    invoke-virtual {p5}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->isClosed()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "SnapshotContents already closed"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    invoke-virtual {p4}, Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;->lM()Lcom/google/android/gms/common/data/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/data/a;->a(Ljava/io/File;)V

    :cond_0
    invoke-virtual {p5}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->getContents()Lcom/google/android/gms/drive/Contents;

    move-result-object v5

    invoke-virtual {p5}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->close()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotOpenedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotOpenedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/games/snapshot/SnapshotMetadataChange;Lcom/google/android/gms/drive/Contents;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/leaderboard/Leaderboards$LeaderboardMetadataResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/quest/Quests$LoadQuestsResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->flush()V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;[IIZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/quest/Quests$LoadQuestsResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[IIZ)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->flush()V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;[IIZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/request/Requests$UpdateRequestsResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsUpdatedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsUpdatedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/leaderboard/Leaderboards$LeaderboardMetadataResult;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->c(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;[BLjava/lang/String;[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$UpdateMatchResult;",
            ">;",
            "Ljava/lang/String;",
            "[B",
            "Ljava/lang/String;",
            "[",
            "Lcom/google/android/gms/games/multiplayer/ParticipantResult;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;[BLjava/lang/String;[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;[B[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$UpdateMatchResult;",
            ">;",
            "Ljava/lang/String;",
            "[B[",
            "Lcom/google/android/gms/games/multiplayer/ParticipantResult;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;[B[Lcom/google/android/gms/games/multiplayer/ParticipantResult;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;[Ljava/lang/String;I[BI)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/request/Requests$SendRequestResult;",
            ">;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "I[BI)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestSentBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestSentBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;[Ljava/lang/String;I[BI)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->c(Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;ZLandroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;Z",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ContactSettingsUpdatedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ContactSettingsUpdatedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;ZLandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public varargs a(Lcom/google/android/gms/common/api/BaseImplementation$b;Z[Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/event/Events$LoadEventsResult;",
            ">;Z[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->flush()V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$EventsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$EventsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Z[Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;[IIZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/quest/Quests$LoadQuestsResult;",
            ">;[IIZ)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->flush()V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;[IIZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/BaseImplementation$b;[Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->c(Lcom/google/android/gms/games/internal/IGamesCallbacks;[Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected a(Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    const-string v0, "com.google.android.gms.games.key.isHeadless"

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WB:Lcom/google/android/gms/games/Games$GamesOptions;

    iget-boolean v1, v1, Lcom/google/android/gms/games/Games$GamesOptions;->VD:Z

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "com.google.android.gms.games.key.showConnectingPopup"

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WB:Lcom/google/android/gms/games/Games$GamesOptions;

    iget-boolean v1, v1, Lcom/google/android/gms/games/Games$GamesOptions;->VE:Z

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "com.google.android.gms.games.key.connectingPopupGravity"

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WB:Lcom/google/android/gms/games/Games$GamesOptions;

    iget v1, v1, Lcom/google/android/gms/games/Games$GamesOptions;->VF:I

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "com.google.android.gms.games.key.retryingSignIn"

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WB:Lcom/google/android/gms/games/Games$GamesOptions;

    iget-boolean v1, v1, Lcom/google/android/gms/games/Games$GamesOptions;->VG:Z

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "com.google.android.gms.games.key.sdkVariant"

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WB:Lcom/google/android/gms/games/Games$GamesOptions;

    iget v1, v1, Lcom/google/android/gms/games/Games$GamesOptions;->VH:I

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "com.google.android.gms.games.key.forceResolveAccountKey"

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WB:Lcom/google/android/gms/games/Games$GamesOptions;

    iget-object v1, v1, Lcom/google/android/gms/games/Games$GamesOptions;->VI:Ljava/lang/String;

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.google.android.gms.games.key.proxyApis"

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WB:Lcom/google/android/gms/games/Games$GamesOptions;

    iget-object v1, v1, Lcom/google/android/gms/games/Games$GamesOptions;->VJ:Ljava/util/ArrayList;

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const v2, 0x5e2978

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Dd:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gR()[Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wt:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/PopupManager;->kO()Landroid/os/IBinder;

    move-result-object v7

    move-object v0, p1

    move-object v1, p2

    invoke-interface/range {v0 .. v9}, Lcom/google/android/gms/common/internal/l;->a(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/IBinder;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V
    .locals 4

    :try_start_0
    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-wide v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V
    .locals 10

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kw()V

    :try_start_0
    new-instance v2, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomStatusUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getMessageReceivedListener()Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;

    move-result-object v3

    invoke-direct {v2, p0, v0, v1, v3}, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/games/internal/IGamesService;

    iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wz:Landroid/os/Binder;

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getVariant()I

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getInvitedPlayerIds()[Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getAutoMatchCriteria()Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->isSocketEnabled()Z

    move-result v7

    iget-wide v8, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    invoke-interface/range {v1 .. v9}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Landroid/os/IBinder;I[Ljava/lang/String;Landroid/os/Bundle;ZJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->c(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kw()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/turnbased/OnTurnBasedMatchUpdateReceivedListener;)V
    .locals 4

    :try_start_0
    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/turnbased/OnTurnBasedMatchUpdateReceivedListener;)V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-wide v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/games/quest/QuestUpdateListener;)V
    .locals 4

    :try_start_0
    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestUpdateBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestUpdateBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/quest/QuestUpdateListener;)V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-wide v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/games/internal/IGamesService;->d(Lcom/google/android/gms/games/internal/IGamesCallbacks;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/games/request/OnRequestReceivedListener;)V
    .locals 4

    :try_start_0
    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/request/OnRequestReceivedListener;)V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-wide v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/games/internal/IGamesService;->c(Lcom/google/android/gms/games/internal/IGamesCallbacks;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/games/snapshot/Snapshot;)V
    .locals 3

    invoke-interface {p1}, Lcom/google/android/gms/games/snapshot/Snapshot;->getSnapshotContents()Lcom/google/android/gms/games/snapshot/SnapshotContents;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "Snapshot already closed"

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    invoke-virtual {v1}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->getContents()Lcom/google/android/gms/drive/Contents;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/games/snapshot/SnapshotContents;->close()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, v2}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/drive/Contents;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method protected az(Landroid/os/IBinder;)Lcom/google/android/gms/games/internal/IGamesService;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/games/internal/IGamesService$Stub;->aB(Landroid/os/IBinder;)Lcom/google/android/gms/games/internal/IGamesService;

    move-result-object v0

    return-object v0
.end method

.method public b(IIZ)Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->b(IIZ)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b([I)Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1}, Lcom/google/android/gms/games/internal/IGamesService;->b([I)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->flush()V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$SignOutCompleteBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$SignOutCompleteBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;IZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;IZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v2}, Lcom/google/android/gms/games/internal/PopupManager;->kO()Landroid/os/IBinder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v3}, Lcom/google/android/gms/games/internal/PopupManager;->kN()Landroid/os/Bundle;

    move-result-object v3

    invoke-interface {v0, v1, p2, v2, v3}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V

    :goto_1
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v2}, Lcom/google/android/gms/games/internal/PopupManager;->kO()Landroid/os/IBinder;

    move-result-object v4

    iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v2}, Lcom/google/android/gms/games/internal/PopupManager;->kN()Landroid/os/Bundle;

    move-result-object v5

    move-object v2, p2

    move v3, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    :goto_1
    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;IIIZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;",
            ">;",
            "Ljava/lang/String;",
            "IIIZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IIIZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;IZZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadExtendedGamesResult;",
            ">;",
            "Ljava/lang/String;",
            "IZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/quest/Quests$ClaimMilestoneResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->flush()V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestMilestoneClaimBinderCallbacks;

    invoke-direct {v1, p0, p1, p3}, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestMilestoneClaimBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->f(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;IIIZ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/leaderboard/Leaderboards$LoadScoresResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIIZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-interface/range {v0 .. v7}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;IIIZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/achievement/Achievements$LoadAchievementsResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/snapshot/Snapshots$OpenSnapshotResult;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotOpenedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotOpenedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->e(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/leaderboard/Leaderboards$LeaderboardMetadataResult;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;Z[Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/quest/Quests$LoadQuestsResult;",
            ">;Z[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->flush()V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p3, p2}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;[Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/BaseImplementation$b;[Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/request/Requests$UpdateRequestsResult;",
            ">;[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsUpdatedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsUpdatedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;[Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;)V
    .locals 8

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kw()V

    :try_start_0
    new-instance v2, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getRoomStatusUpdateListener()Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getMessageReceivedListener()Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;

    move-result-object v3

    invoke-direct {v2, p0, v0, v1, v3}, Lcom/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/games/internal/IGamesService;

    iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wz:Landroid/os/Binder;

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->getInvitationId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->isSocketEnabled()Z

    move-result v5

    iget-wide v6, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Landroid/os/IBinder;Ljava/lang/String;ZJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public bC(Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1}, Lcom/google/android/gms/games/internal/IGamesService;->bC(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bD(Ljava/lang/String;)V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v1}, Lcom/google/android/gms/games/internal/PopupManager;->kO()Landroid/os/IBinder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v2}, Lcom/google/android/gms/games/internal/PopupManager;->kN()Landroid/os/Bundle;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/games/internal/IGamesService;->a(Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public bx(Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1}, Lcom/google/android/gms/games/internal/IGamesService;->bx(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public by(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1}, Lcom/google/android/gms/games/internal/IGamesService;->bJ(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/common/api/BaseImplementation$b;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/Invitations$LoadInvitationsResult;",
            ">;I)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/common/api/BaseImplementation$b;IZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;IZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->c(Lcom/google/android/gms/games/internal/IGamesCallbacks;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v2}, Lcom/google/android/gms/games/internal/PopupManager;->kO()Landroid/os/IBinder;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v3}, Lcom/google/android/gms/games/internal/PopupManager;->kN()Landroid/os/Bundle;

    move-result-object v3

    invoke-interface {v0, v1, p2, v2, v3}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V

    :goto_1
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public c(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadXpStreamResult;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayerXpStreamLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayerXpStreamLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;IZZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadExtendedGamesResult;",
            ">;",
            "Ljava/lang/String;",
            "IZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->e(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$InitiateMatchResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->d(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/snapshot/Snapshots$LoadSnapshotsResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotsLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotsLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->c(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/leaderboard/Leaderboards$LeaderboardMetadataResult;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->d(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/common/api/BaseImplementation$b;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/achievement/Achievements$LoadAchievementsResult;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/common/api/BaseImplementation$b;[Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/request/Requests$UpdateRequestsResult;",
            ">;[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsUpdatedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestsUpdatedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;[Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected varargs c([Ljava/lang/String;)V
    .locals 7

    const/4 v4, 0x1

    const/4 v1, 0x0

    move v0, v1

    move v2, v1

    move v3, v1

    :goto_0
    array-length v5, p1

    if-ge v0, v5, :cond_2

    aget-object v5, p1, v0

    const-string v6, "https://www.googleapis.com/auth/games"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v3, v4

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const-string v6, "https://www.googleapis.com/auth/games.firstparty"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v2, v4

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_4

    if-nez v3, :cond_3

    move v0, v4

    :goto_2
    const-string v2, "Cannot have both %s and %s!"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string v5, "https://www.googleapis.com/auth/games"

    aput-object v5, v3, v1

    const-string v1, "https://www.googleapis.com/auth/games.firstparty"

    aput-object v1, v3, v4

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    :goto_3
    return-void

    :cond_3
    move v0, v1

    goto :goto_2

    :cond_4
    const-string v0, "Games APIs requires %s to function."

    new-array v2, v4, [Ljava/lang/Object;

    const-string v4, "https://www.googleapis.com/auth/games"

    aput-object v4, v2, v1

    invoke-static {v3, v0, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3
.end method

.method public connect()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->jZ()V

    invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->connect()V

    return-void
.end method

.method public d([BLjava/lang/String;)I
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/gms/games/internal/IGamesService;->b([BLjava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    goto :goto_0
.end method

.method public d(Lcom/google/android/gms/common/api/BaseImplementation$b;IZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;IZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->e(Lcom/google/android/gms/games/internal/IGamesCallbacks;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$InitiateMatchResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->l(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadXpStreamResult;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayerXpStreamLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayerXpStreamLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->c(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;IZZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadExtendedGamesResult;",
            ">;",
            "Ljava/lang/String;",
            "IZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->f(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$InitiateMatchResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->e(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Notifications$GameMuteStatusChangeResult;",
            ">;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d(Lcom/google/android/gms/common/api/BaseImplementation$b;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/event/Events$LoadEventsResult;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->flush()V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$EventsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$EventsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->f(Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public dB(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/games/internal/PopupManager;->setGravity(I)V

    return-void
.end method

.method public dC(I)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1}, Lcom/google/android/gms/games/internal/IGamesService;->dC(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public disconnect()V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wy:Z

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kx()V

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    invoke-virtual {v1}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->flush()V

    iget-wide v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/games/internal/IGamesService;->q(J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kw()V

    invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->disconnect()V

    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "Failed to notify client disconnect."

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public e(Lcom/google/android/gms/common/api/BaseImplementation$b;IZZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;IZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/games/internal/IGamesService;->d(Lcom/google/android/gms/games/internal/IGamesCallbacks;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public e(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$InitiateMatchResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->m(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public e(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/Invitations$LoadInvitationsResult;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, p2, p3, v2}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public e(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;IZZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadExtendedGamesResult;",
            ">;",
            "Ljava/lang/String;",
            "IZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->c(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public e(Lcom/google/android/gms/common/api/BaseImplementation$b;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/snapshot/Snapshots$LoadSnapshotsResult;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotsLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotsLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->d(Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public f(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadGamesResult;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$GamesLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$GamesLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/games/internal/IGamesService;->d(Lcom/google/android/gms/games/internal/IGamesCallbacks;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public f(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$LeaveMatchResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchLeftBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchLeftBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->o(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public f(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/request/Requests$LoadRequestSummariesResult;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestSummariesLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestSummariesLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/games/internal/IGamesService;->a(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public f(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;IZZ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;",
            "Ljava/lang/String;",
            "IZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public f(Lcom/google/android/gms/common/api/BaseImplementation$b;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadProfileSettingsResult;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ProfileSettingsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ProfileSettingsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->g(Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public fC()Landroid/os/Bundle;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->fC()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-class v1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadOwnerCoverPhotoUrisResult;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$OwnerCoverPhotoUrisLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$OwnerCoverPhotoUrisLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/games/internal/IGamesService;->j(Lcom/google/android/gms/games/internal/IGamesCallbacks;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public g(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$CancelMatchResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchCanceledBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchCanceledBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->n(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public g(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;IZZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadPlayersResult;",
            ">;",
            "Ljava/lang/String;",
            "IZZ)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    const/4 v3, 0x0

    move-object v2, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/games/internal/IGamesService;->b(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;Ljava/lang/String;IZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public g(Lcom/google/android/gms/common/api/BaseImplementation$b;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ProfileSettingsUpdatedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ProfileSettingsUpdatedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->h(Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.games.internal.IGamesService"

    return-object v0
.end method

.method protected getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.games.service.START"

    return-object v0
.end method

.method public h(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/internal/game/Acls$LoadAclResult;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$NotifyAclLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$NotifyAclLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/games/internal/IGamesService;->h(Lcom/google/android/gms/games/internal/IGamesCallbacks;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public h(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMultiplayer$LoadMatchResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchLoadedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchLoadedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->p(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public h(Lcom/google/android/gms/common/api/BaseImplementation$b;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Notifications$ContactSettingLoadResult;",
            ">;Z)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ContactSettingsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ContactSettingsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->e(Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public i(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Notifications$ContactSettingLoadResult;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ContactSettingsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ContactSettingsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/games/internal/IGamesService;->e(Lcom/google/android/gms/games/internal/IGamesCallbacks;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public i(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/quest/Quests$AcceptQuestResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->flush()V

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestAcceptedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestAcceptedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->u(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected synthetic j(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->az(Landroid/os/IBinder;)Lcom/google/android/gms/games/internal/IGamesService;

    move-result-object v0

    return-object v0
.end method

.method public j(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Notifications$InboxCountResult;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$InboxCountsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$InboxCountsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/games/internal/IGamesService;->t(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public j(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/snapshot/Snapshots$DeleteSnapshotResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotDeletedBinderCallbacks;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$SnapshotDeletedBinderCallbacks;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->r(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public k(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/games/internal/PopupManager;->l(Landroid/view/View;)V

    return-void
.end method

.method public k(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadExtendedGamesResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$ExtendedGamesLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->e(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public ka()Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->ka()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public kb()Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kb()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public kc()Lcom/google/android/gms/games/Player;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->dJ()V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wv:Lcom/google/android/gms/games/PlayerEntity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_1

    :try_start_1
    new-instance v1, Lcom/google/android/gms/games/PlayerBuffer;

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kz()Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/PlayerBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lcom/google/android/gms/games/PlayerBuffer;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/PlayerBuffer;->get(I)Lcom/google/android/gms/games/Player;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/games/Player;->freeze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/PlayerEntity;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wv:Lcom/google/android/gms/games/PlayerEntity;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    :try_start_3
    invoke-virtual {v1}, Lcom/google/android/gms/games/PlayerBuffer;->release()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_1
    :goto_0
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wv:Lcom/google/android/gms/games/PlayerEntity;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_5
    invoke-virtual {v1}, Lcom/google/android/gms/games/PlayerBuffer;->release()V

    throw v0
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catch_0
    move-exception v0

    :try_start_6
    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0
.end method

.method public kd()Lcom/google/android/gms/games/Game;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->dJ()V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ww:Lcom/google/android/gms/games/GameEntity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_1

    :try_start_1
    new-instance v1, Lcom/google/android/gms/games/GameBuffer;

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kB()Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/games/GameBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lcom/google/android/gms/games/GameBuffer;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/games/GameBuffer;->get(I)Lcom/google/android/gms/games/Game;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/games/Game;->freeze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/GameEntity;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ww:Lcom/google/android/gms/games/GameEntity;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    :try_start_3
    invoke-virtual {v1}, Lcom/google/android/gms/games/GameBuffer;->release()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_1
    :goto_0
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ww:Lcom/google/android/gms/games/GameEntity;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_5
    invoke-virtual {v1}, Lcom/google/android/gms/games/GameBuffer;->release()V

    throw v0
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catch_0
    move-exception v0

    :try_start_6
    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw v0
.end method

.method public ke()Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->ke()Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public kf()Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kf()Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public kg()Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kg()Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public kh()Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kh()Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public ki()V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-wide v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/games/internal/IGamesService;->r(J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public kj()V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-wide v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/games/internal/IGamesService;->s(J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public kk()V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-wide v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/games/internal/IGamesService;->u(J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public kl()V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    iget-wide v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->WA:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/games/internal/IGamesService;->t(J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public km()Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->km()Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public kn()Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kn()Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public ko()I
    .locals 3

    const/16 v1, 0x1110

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->ko()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v2, "service died"

    invoke-static {v0, v2}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    goto :goto_0
.end method

.method public kp()Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kp()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public kq()I
    .locals 3

    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kq()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v2, "service died"

    invoke-static {v0, v2}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    goto :goto_0
.end method

.method public kr()Landroid/content/Intent;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kr()Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public ks()I
    .locals 3

    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->ks()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v2, "service died"

    invoke-static {v0, v2}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    goto :goto_0
.end method

.method public kt()I
    .locals 3

    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kt()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v2, "service died"

    invoke-static {v0, v2}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    goto :goto_0
.end method

.method public ku()I
    .locals 3

    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->ku()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v2, "service died"

    invoke-static {v0, v2}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    goto :goto_0
.end method

.method public kv()I
    .locals 3

    const/4 v1, -0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kv()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v2, "service died"

    invoke-static {v0, v2}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    goto :goto_0
.end method

.method public kx()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0}, Lcom/google/android/gms/games/internal/IGamesService;->kx()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public l(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadGameInstancesResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$GameInstancesLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$GameInstancesLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->f(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public m(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/GamesMetadata$LoadGameSearchSuggestionsResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$GameSearchSuggestionsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$GameSearchSuggestionsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->q(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public n(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Players$LoadXpForGameCategoriesResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayerXpForGameCategoriesLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$PlayerXpForGameCategoriesLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->s(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public n(Ljava/lang/String;I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Ws:Lcom/google/android/gms/games/internal/events/EventIncrementManager;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/internal/events/EventIncrementManager;->n(Ljava/lang/String;I)V

    return-void
.end method

.method public o(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/multiplayer/Invitations$LoadInvitationsResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationsLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationsLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->k(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public o(Ljava/lang/String;I)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->o(Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "connectionHint"    # Landroid/os/Bundle;

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wy:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wx:Lcom/google/android/gms/games/internal/PopupManager;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/PopupManager;->kM()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wy:Z

    :cond_0
    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1
    .param p1, "result"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wy:Z

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0
    .param p1, "cause"    # I

    .prologue
    return-void
.end method

.method public p(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$NotifyAclUpdatedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$NotifyAclUpdatedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->j(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public p(Ljava/lang/String;I)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->p(Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public q(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/Notifications$GameMuteStatusLoadResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/IGamesService;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadedBinderCallback;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadedBinderCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/games/internal/IGamesService;->i(Lcom/google/android/gms/games/internal/IGamesCallbacks;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v0, "GamesClientImpl"

    const-string v1, "service died"

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public t(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;
    .locals 2

    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/games/multiplayer/ParticipantUtils;->bV(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Bad participant ID"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl;->Wu:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;->isClosed()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    invoke-direct {p0, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->bz(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RealTimeSocket;

    move-result-object v0

    :cond_3
    return-object v0
.end method
