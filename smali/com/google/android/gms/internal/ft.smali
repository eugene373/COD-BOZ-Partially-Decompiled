.class public final Lcom/google/android/gms/internal/ft;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# instance fields
.field private md:Lcom/google/android/gms/internal/gv;

.field private final mw:Ljava/lang/Object;

.field private uq:Ljava/lang/String;

.field private ur:Lcom/google/android/gms/internal/gk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/gk",
            "<",
            "Lcom/google/android/gms/internal/fv;",
            ">;"
        }
    .end annotation
.end field

.field public final us:Lcom/google/android/gms/internal/by;

.field public final ut:Lcom/google/android/gms/internal/by;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ft;->mw:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/gk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gk;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ft;->ur:Lcom/google/android/gms/internal/gk;

    new-instance v0, Lcom/google/android/gms/internal/ft$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ft$1;-><init>(Lcom/google/android/gms/internal/ft;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ft;->us:Lcom/google/android/gms/internal/by;

    new-instance v0, Lcom/google/android/gms/internal/ft$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ft$2;-><init>(Lcom/google/android/gms/internal/ft;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ft;->ut:Lcom/google/android/gms/internal/by;

    iput-object p1, p0, Lcom/google/android/gms/internal/ft;->uq:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ft;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ft;->mw:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ft;)Lcom/google/android/gms/internal/gk;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ft;->ur:Lcom/google/android/gms/internal/gk;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ft;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ft;->uq:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/google/android/gms/internal/gv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ft;->md:Lcom/google/android/gms/internal/gv;

    return-void
.end method

.method public cK()Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future",
            "<",
            "Lcom/google/android/gms/internal/fv;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ft;->ur:Lcom/google/android/gms/internal/gk;

    return-object v0
.end method
