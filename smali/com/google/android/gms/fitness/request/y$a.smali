.class public Lcom/google/android/gms/fitness/request/y$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private Tq:Ljava/lang/String;

.field private mName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/request/y$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/y$a;->mName:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/fitness/request/y$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/y$a;->Tq:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public bu(Ljava/lang/String;)Lcom/google/android/gms/fitness/request/y$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/y$a;->mName:Ljava/lang/String;

    return-object p0
.end method

.method public bv(Ljava/lang/String;)Lcom/google/android/gms/fitness/request/y$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/y$a;->Tq:Ljava/lang/String;

    return-object p0
.end method

.method public jB()Lcom/google/android/gms/fitness/request/y;
    .locals 2

    new-instance v0, Lcom/google/android/gms/fitness/request/y;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/y;-><init>(Lcom/google/android/gms/fitness/request/y$a;Lcom/google/android/gms/fitness/request/y$1;)V

    return-object v0
.end method
