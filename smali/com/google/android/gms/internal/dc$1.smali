.class Lcom/google/android/gms/internal/dc$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/dc;->execute()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic qS:Lcom/google/android/gms/internal/dc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/dc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/dc$1;->qS:Lcom/google/android/gms/internal/dc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/dc$1;->qS:Lcom/google/android/gms/internal/dc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dc;->createIntent()Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/dc$1;->qS:Lcom/google/android/gms/internal/dc;

    invoke-static {v1}, Lcom/google/android/gms/internal/dc;->a(Lcom/google/android/gms/internal/dc;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
