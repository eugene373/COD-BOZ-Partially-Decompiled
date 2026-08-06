.class public final Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBufferHeader;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBufferHeader$1;,
        Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBufferHeader$Builder;
    }
.end annotation


# instance fields
.field private final Nh:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    .end local p1    # "bundle":Landroid/os/Bundle;
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBufferHeader;->Nh:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public lB()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreBufferHeader;->Nh:Landroid/os/Bundle;

    return-object v0
.end method
