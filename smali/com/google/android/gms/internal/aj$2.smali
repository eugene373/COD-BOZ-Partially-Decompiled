.class Lcom/google/android/gms/internal/aj$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aj;->f(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic mY:Ljava/lang/String;

.field final synthetic nd:Lcom/google/android/gms/internal/aj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aj;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aj$2;->nd:Lcom/google/android/gms/internal/aj;

    iput-object p2, p0, Lcom/google/android/gms/internal/aj$2;->mY:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aj$2;->nd:Lcom/google/android/gms/internal/aj;

    invoke-static {v0}, Lcom/google/android/gms/internal/aj;->a(Lcom/google/android/gms/internal/aj;)Lcom/google/android/gms/internal/gv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aj$2;->mY:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gv;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
