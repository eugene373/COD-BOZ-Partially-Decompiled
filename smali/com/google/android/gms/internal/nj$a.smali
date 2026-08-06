.class public Lcom/google/android/gms/internal/nj$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/nj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final akM:Lcom/google/android/gms/internal/nm;

.field public final akN:Lcom/google/android/gms/internal/ni;

.field public final akO:Lcom/google/android/gms/internal/pr$c;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nm;

    iput-object v0, p0, Lcom/google/android/gms/internal/nj$a;->akM:Lcom/google/android/gms/internal/nm;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ni;

    iput-object v0, p0, Lcom/google/android/gms/internal/nj$a;->akN:Lcom/google/android/gms/internal/ni;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/nj$a;->akO:Lcom/google/android/gms/internal/pr$c;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;Lcom/google/android/gms/internal/nj$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/nj$a;-><init>(Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V

    return-void
.end method
