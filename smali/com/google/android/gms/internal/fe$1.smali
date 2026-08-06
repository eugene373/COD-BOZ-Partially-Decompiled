.class Lcom/google/android/gms/internal/fe$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/fe;->co()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic tr:Lcom/google/android/gms/internal/fe;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fe;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fe$1;->tr:Lcom/google/android/gms/internal/fe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/fe$1;->tr:Lcom/google/android/gms/internal/fe;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/fe;->onStop()V

    return-void
.end method
