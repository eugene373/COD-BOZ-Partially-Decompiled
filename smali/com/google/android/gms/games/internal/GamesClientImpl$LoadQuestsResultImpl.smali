.class final Lcom/google/android/gms/games/internal/GamesClientImpl$LoadQuestsResultImpl;
.super Lcom/google/android/gms/common/api/a;

# interfaces
.implements Lcom/google/android/gms/games/quest/Quests$LoadQuestsResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "LoadQuestsResultImpl"
.end annotation


# instance fields
.field private final II:Lcom/google/android/gms/common/data/DataHolder;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0
    .param p1, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadQuestsResultImpl;->II:Lcom/google/android/gms/common/data/DataHolder;

    return-void
.end method


# virtual methods
.method public getQuests()Lcom/google/android/gms/games/quest/QuestBuffer;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/quest/QuestBuffer;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadQuestsResultImpl;->II:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/quest/QuestBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v0
.end method
