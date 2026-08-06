.class public Lcom/google/android/gms/games/internal/constants/Capability;
.super Ljava/lang/Object;


# static fields
.field public static final aam:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/google/android/gms/games/internal/constants/Capability;->aam:Ljava/util/ArrayList;

    sget-object v0, Lcom/google/android/gms/games/internal/constants/Capability;->aam:Ljava/util/ArrayList;

    const-string v1, "ibb"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/google/android/gms/games/internal/constants/Capability;->aam:Ljava/util/ArrayList;

    const-string v1, "rtp"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/google/android/gms/games/internal/constants/Capability;->aam:Ljava/util/ArrayList;

    const-string v1, "unreliable_ping"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
