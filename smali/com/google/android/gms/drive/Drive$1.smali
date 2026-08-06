.class final Lcom/google/android/gms/drive/Drive$1;
.super Lcom/google/android/gms/drive/Drive$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/Drive;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/drive/Drive$a",
        "<",
        "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/drive/Drive$a;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;)Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$ApiOptions;)Landroid/os/Bundle;
    .locals 1

    check-cast p1, Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/Drive$1;->a(Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
