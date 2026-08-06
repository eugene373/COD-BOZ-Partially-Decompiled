.class final Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;
.super Lcom/google/android/gms/common/api/a;

# interfaces
.implements Lcom/google/android/gms/games/quest/Quests$ClaimMilestoneResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ClaimMilestoneResultImpl"
.end annotation


# instance fields
.field private final WE:Lcom/google/android/gms/games/quest/Quest;

.field private final WG:Lcom/google/android/gms/games/quest/Milestone;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;Ljava/lang/String;)V
    .locals 5
    .param p1, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;
    .param p2, "milestoneId"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    new-instance v2, Lcom/google/android/gms/games/quest/QuestBuffer;

    invoke-direct {v2, p1}, Lcom/google/android/gms/games/quest/QuestBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    :try_start_0
    invoke-virtual {v2}, Lcom/google/android/gms/games/quest/QuestBuffer;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    new-instance v3, Lcom/google/android/gms/games/quest/QuestEntity;

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/games/quest/QuestBuffer;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/quest/Quest;

    invoke-direct {v3, v0}, Lcom/google/android/gms/games/quest/QuestEntity;-><init>(Lcom/google/android/gms/games/quest/Quest;)V

    iput-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;->WE:Lcom/google/android/gms/games/quest/Quest;

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;->WE:Lcom/google/android/gms/games/quest/Quest;

    invoke-interface {v0}, Lcom/google/android/gms/games/quest/Quest;->lJ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    :goto_0
    if-ge v1, v4, :cond_1

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/quest/Milestone;

    invoke-interface {v0}, Lcom/google/android/gms/games/quest/Milestone;->getMilestoneId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/quest/Milestone;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;->WG:Lcom/google/android/gms/games/quest/Milestone;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Lcom/google/android/gms/games/quest/QuestBuffer;->release()V

    :goto_1
    return-void

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;->WG:Lcom/google/android/gms/games/quest/Milestone;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    invoke-virtual {v2}, Lcom/google/android/gms/games/quest/QuestBuffer;->release()V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;->WG:Lcom/google/android/gms/games/quest/Milestone;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;->WE:Lcom/google/android/gms/games/quest/Quest;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/google/android/gms/games/quest/QuestBuffer;->release()V

    throw v0
.end method


# virtual methods
.method public getMilestone()Lcom/google/android/gms/games/quest/Milestone;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;->WG:Lcom/google/android/gms/games/quest/Milestone;

    return-object v0
.end method

.method public getQuest()Lcom/google/android/gms/games/quest/Quest;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;->WE:Lcom/google/android/gms/games/quest/Quest;

    return-object v0
.end method
