.class public final Lcom/google/android/gms/games/internal/JingleLog;
.super Ljava/lang/Object;


# static fields
.field private static final Pa:Lcom/google/android/gms/common/internal/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/internal/i;

    const-string v1, "GamesJingle"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/i;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/games/internal/JingleLog;->Pa:Lcom/google/android/gms/common/internal/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
