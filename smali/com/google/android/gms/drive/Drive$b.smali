.class public Lcom/google/android/gms/drive/Drive$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Api$ApiOptions$Optional;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/Drive;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final Nh:Landroid/os/Bundle;


# direct methods
.method private constructor <init>()V
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/android/gms/drive/Drive$b;-><init>(Landroid/os/Bundle;)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/Drive$b;->Nh:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public hM()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/Drive$b;->Nh:Landroid/os/Bundle;

    return-object v0
.end method
