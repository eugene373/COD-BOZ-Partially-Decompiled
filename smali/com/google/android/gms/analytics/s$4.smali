.class Lcom/google/android/gms/analytics/s$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/analytics/s;->dN()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic za:Lcom/google/android/gms/analytics/s;


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/s;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/s$4;->za:Lcom/google/android/gms/analytics/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/s$4;->za:Lcom/google/android/gms/analytics/s;

    invoke-static {v0}, Lcom/google/android/gms/analytics/s;->d(Lcom/google/android/gms/analytics/s;)Lcom/google/android/gms/analytics/af;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/analytics/af;->dN()V

    return-void
.end method
