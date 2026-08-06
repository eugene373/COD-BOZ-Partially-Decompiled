.class public Lcom/google/android/gms/internal/lp;
.super Ljava/lang/Object;


# instance fields
.field private final Dd:Ljava/lang/String;

.field private final Dh:Lcom/google/android/gms/internal/me;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/me",
            "<",
            "Lcom/google/android/gms/internal/lx;",
            ">;"
        }
    .end annotation
.end field

.field private final IM:Ljava/lang/String;

.field private aeA:Lcom/google/android/gms/internal/lq;

.field private final mContext:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/me;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/me",
            "<",
            "Lcom/google/android/gms/internal/lx;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/lp;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/lp;->Dd:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/lp;->Dh:Lcom/google/android/gms/internal/me;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/lp;->aeA:Lcom/google/android/gms/internal/lq;

    iput-object p3, p0, Lcom/google/android/gms/internal/lp;->IM:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/me;)Lcom/google/android/gms/internal/lp;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/me",
            "<",
            "Lcom/google/android/gms/internal/lx;",
            ">;)",
            "Lcom/google/android/gms/internal/lp;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/lp;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/lp;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/me;)V

    return-object v0
.end method
