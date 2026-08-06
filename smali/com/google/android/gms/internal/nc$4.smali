.class final Lcom/google/android/gms/internal/nc$4;
.super Lcom/google/android/gms/internal/na$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/nc;->a(Landroid/content/Context;Lcom/google/android/gms/internal/nb;Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic akB:Lcom/google/android/gms/internal/na;

.field final synthetic aky:Landroid/net/Uri;

.field final synthetic mV:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/net/Uri;Lcom/google/android/gms/internal/na;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/nc$4;->mV:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/nc$4;->aky:Landroid/net/Uri;

    iput-object p3, p0, Lcom/google/android/gms/internal/nc$4;->akB:Lcom/google/android/gms/internal/na;

    invoke-direct {p0}, Lcom/google/android/gms/internal/na$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;ILandroid/content/Intent;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/nc$4;->mV:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/nc$4;->aky:Landroid/net/Uri;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/nc;->b(Landroid/content/Context;Landroid/net/Uri;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/nc$4;->akB:Lcom/google/android/gms/internal/na;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/na;->a(ILandroid/os/Bundle;ILandroid/content/Intent;)V

    return-void
.end method
