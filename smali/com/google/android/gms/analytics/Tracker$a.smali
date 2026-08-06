.class Lcom/google/android/gms/analytics/Tracker$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/analytics/GoogleAnalytics$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/analytics/Tracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic BA:Lcom/google/android/gms/analytics/Tracker;

.field private Bv:Z

.field private Bw:I

.field private Bx:J

.field private By:Z

.field private Bz:J

.field private yD:Lcom/google/android/gms/internal/ju;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/analytics/Tracker;)V
    .locals 3

    const/4 v2, 0x0

    iput-object p1, p0, Lcom/google/android/gms/analytics/Tracker$a;->BA:Lcom/google/android/gms/analytics/Tracker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bv:Z

    iput v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bw:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bx:J

    iput-boolean v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->By:Z

    invoke-static {}, Lcom/google/android/gms/internal/jw;->hA()Lcom/google/android/gms/internal/ju;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->yD:Lcom/google/android/gms/internal/ju;

    return-void
.end method

.method private eW()V
    .locals 6

    invoke-static {}, Lcom/google/android/gms/analytics/GoogleAnalytics;->eD()Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "GoogleAnalytics isn\'t initialized for the Tracker!"

    invoke-static {v0}, Lcom/google/android/gms/analytics/z;->T(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bx:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gez v1, :cond_1

    iget-boolean v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bv:Z

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->BA:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v1}, Lcom/google/android/gms/analytics/Tracker;->b(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->a(Lcom/google/android/gms/analytics/GoogleAnalytics$a;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->BA:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v1}, Lcom/google/android/gms/analytics/Tracker;->b(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->b(Lcom/google/android/gms/analytics/GoogleAnalytics$a;)V

    goto :goto_0
.end method


# virtual methods
.method public eT()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bx:J

    return-wide v0
.end method

.method public eU()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bv:Z

    return v0
.end method

.method public eV()Z
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->By:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->By:Z

    return v0
.end method

.method eX()Z
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->yD:Lcom/google/android/gms/internal/ju;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ju;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bz:J

    const-wide/16 v4, 0x3e8

    iget-wide v6, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bx:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public enableAutoActivityTracking(Z)V
    .locals 0
    .param p1, "enabled"    # Z

    .prologue
    iput-boolean p1, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bv:Z

    invoke-direct {p0}, Lcom/google/android/gms/analytics/Tracker$a;->eW()V

    return-void
.end method

.method public i(Landroid/app/Activity;)V
    .locals 4

    const/4 v3, 0x1

    invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/t$a;->An:Lcom/google/android/gms/analytics/t$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V

    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bw:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/Tracker$a;->eX()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v3, p0, Lcom/google/android/gms/analytics/Tracker$a;->By:Z

    :cond_0
    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bw:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bw:I

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bv:Z

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "&t"

    const-string v2, "screenview"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/analytics/t;->B(Z)V

    iget-object v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->BA:Lcom/google/android/gms/analytics/Tracker;

    const-string v3, "&cd"

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->BA:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v0}, Lcom/google/android/gms/analytics/Tracker;->c(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/ai;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->BA:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v0}, Lcom/google/android/gms/analytics/Tracker;->c(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/ai;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/ai;->k(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->BA:Lcom/google/android/gms/analytics/Tracker;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->B(Z)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public j(Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/t$a;->Ao:Lcom/google/android/gms/analytics/t$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V

    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bw:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bw:I

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bw:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bw:I

    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bw:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->yD:Lcom/google/android/gms/internal/ju;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ju;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bz:J

    :cond_0
    return-void
.end method

.method public setSessionTimeout(J)V
    .locals 1
    .param p1, "sessionTimeout"    # J

    .prologue
    iput-wide p1, p0, Lcom/google/android/gms/analytics/Tracker$a;->Bx:J

    invoke-direct {p0}, Lcom/google/android/gms/analytics/Tracker$a;->eW()V

    return-void
.end method
