.class Lcom/google/android/gms/internal/af$4;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/af;->aD()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic mT:Lcom/google/android/gms/internal/af;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/af;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/af$4;->mT:Lcom/google/android/gms/internal/af;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/af$4;->mT:Lcom/google/android/gms/internal/af;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/af;->e(Z)V

    return-void
.end method
