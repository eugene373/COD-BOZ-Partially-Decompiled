.class abstract Lcom/google/android/gms/internal/ns$a;
.super Lcom/google/android/gms/plus/Plus$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ns;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/plus/Plus$a",
        "<",
        "Lcom/google/android/gms/plus/Moments$LoadMomentsResult;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/plus/Plus$a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ns$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ns$a;-><init>()V

    return-void
.end method


# virtual methods
.method public aC(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/plus/Moments$LoadMomentsResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ns$a$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ns$a$1;-><init>(Lcom/google/android/gms/internal/ns$a;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ns$a;->aC(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/plus/Moments$LoadMomentsResult;

    move-result-object v0

    return-object v0
.end method
