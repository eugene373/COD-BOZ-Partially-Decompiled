.class public Lcom/google/android/gms/internal/he$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/he;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private BV:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/hi;",
            ">;"
        }
    .end annotation
.end field

.field private BW:Ljava/lang/String;

.field private BX:Z

.field private BY:Landroid/accounts/Account;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public D(Z)Lcom/google/android/gms/internal/he$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/he$a;->BX:Z

    return-object p0
.end method

.method public a(Lcom/google/android/gms/internal/hi;)Lcom/google/android/gms/internal/he$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public ar(Ljava/lang/String;)Lcom/google/android/gms/internal/he$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/he$a;->BW:Ljava/lang/String;

    return-object p0
.end method

.method public fj()Lcom/google/android/gms/internal/he;
    .locals 6

    new-instance v1, Lcom/google/android/gms/internal/he;

    iget-object v2, p0, Lcom/google/android/gms/internal/he$a;->BW:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/google/android/gms/internal/he$a;->BX:Z

    iget-object v4, p0, Lcom/google/android/gms/internal/he$a;->BY:Landroid/accounts/Account;

    iget-object v0, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;

    iget-object v5, p0, Lcom/google/android/gms/internal/he$a;->BV:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [Lcom/google/android/gms/internal/hi;

    invoke-interface {v0, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/hi;

    :goto_0
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/he;-><init>(Ljava/lang/String;ZLandroid/accounts/Account;[Lcom/google/android/gms/internal/hi;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
