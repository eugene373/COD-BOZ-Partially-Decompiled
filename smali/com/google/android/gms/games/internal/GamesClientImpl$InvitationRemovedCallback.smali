.class final Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationRemovedCallback;
.super Lcom/google/android/gms/common/internal/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "InvitationRemovedCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/e",
        "<",
        "Lcom/google/android/gms/games/internal/IGamesService;",
        ">.b<",
        "Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

.field private final WO:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;Ljava/lang/String;)V
    .locals 0
    .param p2, "listener"    # Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;
    .param p3, "invitationId"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationRemovedCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/internal/e$b;-><init>(Lcom/google/android/gms/common/internal/e;Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationRemovedCallback;->WO:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected b(Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationRemovedCallback;->WO:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;->onInvitationRemoved(Ljava/lang/String;)V

    return-void
.end method

.method protected synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$InvitationRemovedCallback;->b(Lcom/google/android/gms/games/multiplayer/OnInvitationReceivedListener;)V

    return-void
.end method

.method protected gT()V
    .locals 0

    return-void
.end method
