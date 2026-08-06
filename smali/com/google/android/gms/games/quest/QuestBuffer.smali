.class public final Lcom/google/android/gms/games/quest/QuestBuffer;
.super Lcom/google/android/gms/common/data/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/g",
        "<",
        "Lcom/google/android/gms/games/quest/Quest;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0
    .param p1, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/data/g;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method


# virtual methods
.method protected synthetic f(II)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/games/quest/QuestBuffer;->m(II)Lcom/google/android/gms/games/quest/Quest;

    move-result-object v0

    return-object v0
.end method

.method protected gD()Ljava/lang/String;
    .locals 1

    const-string v0, "external_quest_id"

    return-object v0
.end method

.method protected m(II)Lcom/google/android/gms/games/quest/Quest;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/quest/QuestRef;

    iget-object v1, p0, Lcom/google/android/gms/games/quest/QuestBuffer;->II:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1, p1, p2}, Lcom/google/android/gms/games/quest/QuestRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;II)V

    return-object v0
.end method
