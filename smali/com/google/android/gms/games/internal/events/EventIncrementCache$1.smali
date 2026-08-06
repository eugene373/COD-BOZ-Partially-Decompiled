.class Lcom/google/android/gms/games/internal/events/EventIncrementCache$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/events/EventIncrementCache;->w(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aav:Lcom/google/android/gms/games/internal/events/EventIncrementCache;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/events/EventIncrementCache;)V
    .locals 0

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache$1;->aav:Lcom/google/android/gms/games/internal/events/EventIncrementCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/events/EventIncrementCache$1;->aav:Lcom/google/android/gms/games/internal/events/EventIncrementCache;

    invoke-static {v0}, Lcom/google/android/gms/games/internal/events/EventIncrementCache;->a(Lcom/google/android/gms/games/internal/events/EventIncrementCache;)V

    return-void
.end method
