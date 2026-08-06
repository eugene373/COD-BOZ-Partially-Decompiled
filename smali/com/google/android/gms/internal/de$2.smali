.class Lcom/google/android/gms/internal/de$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/de;->execute()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ra:Lcom/google/android/gms/internal/de;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/de;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/de$2;->ra:Lcom/google/android/gms/internal/de;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/de$2;->ra:Lcom/google/android/gms/internal/de;

    invoke-static {v0}, Lcom/google/android/gms/internal/de;->b(Lcom/google/android/gms/internal/de;)Lcom/google/android/gms/internal/gv;

    move-result-object v0

    const-string v1, "onStorePictureCanceled"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gv;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
