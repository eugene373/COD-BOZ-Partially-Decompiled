.class public Lcom/google/android/gms/fitness/request/m$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private Sp:Lcom/google/android/gms/fitness/data/DataType;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/request/m$a;)Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/m$a;->Sp:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method


# virtual methods
.method public c(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/m$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/m$a;->Sp:Lcom/google/android/gms/fitness/data/DataType;

    return-object p0
.end method

.method public jq()Lcom/google/android/gms/fitness/request/m;
    .locals 2

    new-instance v0, Lcom/google/android/gms/fitness/request/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/m;-><init>(Lcom/google/android/gms/fitness/request/m$a;Lcom/google/android/gms/fitness/request/m$1;)V

    return-object v0
.end method
