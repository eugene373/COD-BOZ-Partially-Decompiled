.class Lcom/google/android/gms/internal/dc$2;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/dc$2;->qS:Lcom/google/android/gms/internal/dc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/dc$2;->qS:Lcom/google/android/gms/internal/dc;

    invoke-static {v0}, Lcom/google/android/gms/internal/dc;->b(Lcom/google/android/gms/internal/dc;)Lcom/google/android/gms/internal/gv;

    move-result-object v0

    const-string v1, "onCalendarEventCanceled"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gv;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
