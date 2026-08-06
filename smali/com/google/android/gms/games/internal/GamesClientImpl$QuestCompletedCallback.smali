.class final Lcom/google/android/gms/games/internal/GamesClientImpl$QuestCompletedCallback;
.super Lcom/google/android/gms/common/internal/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "QuestCompletedCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/e",
        "<",
        "Lcom/google/android/gms/games/internal/IGamesService;",
        ">.b<",
        "Lcom/google/android/gms/games/quest/QuestUpdateListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

.field private final WE:Lcom/google/android/gms/games/quest/Quest;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/quest/QuestUpdateListener;Lcom/google/android/gms/games/quest/Quest;)V
    .locals 0
    .param p2, "listener"    # Lcom/google/android/gms/games/quest/QuestUpdateListener;
    .param p3, "quest"    # Lcom/google/android/gms/games/quest/Quest;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestCompletedCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/internal/e$b;-><init>(Lcom/google/android/gms/common/internal/e;Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestCompletedCallback;->WE:Lcom/google/android/gms/games/quest/Quest;

    return-void
.end method


# virtual methods
.method protected b(Lcom/google/android/gms/games/quest/QuestUpdateListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestCompletedCallback;->WE:Lcom/google/android/gms/games/quest/Quest;

    invoke-interface {p1, v0}, Lcom/google/android/gms/games/quest/QuestUpdateListener;->onQuestCompleted(Lcom/google/android/gms/games/quest/Quest;)V

    return-void
.end method

.method protected synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/quest/QuestUpdateListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestCompletedCallback;->b(Lcom/google/android/gms/games/quest/QuestUpdateListener;)V

    return-void
.end method

.method protected gT()V
    .locals 0

    return-void
.end method
