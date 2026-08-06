.class public Lcom/google/android/gms/internal/aj;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ah;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# instance fields
.field private final md:Lcom/google/android/gms/internal/gv;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/gt;)V
    .locals 6

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ay;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ay;-><init>()V

    const/4 v4, 0x0

    move-object v0, p1

    move v3, v2

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/gv;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ay;ZZLcom/google/android/gms/internal/k;Lcom/google/android/gms/internal/gt;)Lcom/google/android/gms/internal/gv;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aj;)Lcom/google/android/gms/internal/gv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;

    return-object v0
.end method

.method private runOnUiThread(Ljava/lang/Runnable;)V
    .locals 1
    .param p1, "runnable"    # Ljava/lang/Runnable;

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/gr;->ds()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ah$a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/aj$3;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/aj$3;-><init>(Lcom/google/android/gms/internal/aj;Lcom/google/android/gms/internal/ah$a;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/gw$a;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/bw;Lcom/google/android/gms/internal/dq;ZLcom/google/android/gms/internal/bz;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;

    move-result-object v0

    new-instance v7, Lcom/google/android/gms/internal/v;

    const/4 v1, 0x0

    invoke-direct {v7, v1}, Lcom/google/android/gms/internal/v;-><init>(Z)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/gw;->a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/dn;Lcom/google/android/gms/internal/bw;Lcom/google/android/gms/internal/dq;ZLcom/google/android/gms/internal/bz;Lcom/google/android/gms/internal/v;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/aj$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/aj$1;-><init>(Lcom/google/android/gms/internal/aj;Ljava/lang/String;Lorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aj;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->destroy()V

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/aj$2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/aj$2;-><init>(Lcom/google/android/gms/internal/aj;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aj;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->du()Lcom/google/android/gms/internal/gw;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/gw;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V

    return-void
.end method

.method public pause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;

    invoke-static {v0}, Lcom/google/android/gms/internal/gj;->a(Landroid/webkit/WebView;)V

    return-void
.end method

.method public resume()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aj;->md:Lcom/google/android/gms/internal/gv;

    invoke-static {v0}, Lcom/google/android/gms/internal/gj;->b(Landroid/webkit/WebView;)V

    return-void
.end method
