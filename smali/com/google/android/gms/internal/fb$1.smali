.class Lcom/google/android/gms/internal/fb$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/fb;->co()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ta:Lcom/google/android/gms/internal/fb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fb;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fb$1;->ta:Lcom/google/android/gms/internal/fb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fb$1;->ta:Lcom/google/android/gms/internal/fb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fb;->onStop()V

    return-void
.end method
