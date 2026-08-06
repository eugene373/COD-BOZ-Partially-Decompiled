.class public Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/DataDeleteRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private KS:J

.field private SB:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation
.end field

.field private Sr:J

.field private Uk:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation
.end field

.field private Ul:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Session;",
            ">;"
        }
    .end annotation
.end field

.field private Um:Z

.field private Un:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Uk:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->SB:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Ul:Ljava/util/List;

    iput-boolean v1, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Um:Z

    iput-boolean v1, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Un:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->KS:J

    return-wide v0
.end method

.method static synthetic b(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Sr:J

    return-wide v0
.end method

.method static synthetic c(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Uk:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->SB:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Ul:Ljava/util/List;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Um:Z

    return v0
.end method

.method static synthetic g(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Un:Z

    return v0
.end method

.method private ji()V
    .locals 10

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Ul:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Ul:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/Session;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/Session;->getStartTime(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v6

    iget-wide v8, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->KS:J

    cmp-long v1, v6, v8

    if-ltz v1, :cond_2

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/Session;->getEndTime(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v6

    iget-wide v8, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Sr:J

    cmp-long v1, v6, v8

    if-gtz v1, :cond_2

    move v1, v2

    :goto_1
    const-string v5, "Session %s is outside the time interval [%d, %d]"

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v0, v6, v3

    iget-wide v8, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->KS:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v6, v2

    const/4 v0, 0x2

    iget-wide v8, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Sr:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v6, v0

    invoke-static {v1, v5, v6}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    move v1, v3

    goto :goto_1
.end method


# virtual methods
.method public addDataSource(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;
    .locals 4
    .param p1, "dataSource"    # Lcom/google/android/gms/fitness/data/DataSource;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Um:Z

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "All data is already marked for deletion"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V

    if-eqz p1, :cond_2

    :goto_1
    const-string v0, "Must specify a valid data source"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Uk:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Uk:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method

.method public addDataType(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;
    .locals 4
    .param p1, "dataType"    # Lcom/google/android/gms/fitness/data/DataType;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Um:Z

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "All data is already marked for deletion"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V

    if-eqz p1, :cond_2

    :goto_1
    const-string v0, "Must specify a valid data type"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->SB:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->SB:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1
.end method

.method public addSession(Lcom/google/android/gms/fitness/data/Session;)Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;
    .locals 8
    .param p1, "session"    # Lcom/google/android/gms/fitness/data/Session;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Un:Z

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "All sessions already marked for deletion"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V

    if-eqz p1, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Must specify a valid session"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/fitness/data/Session;->getEndTime(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_2

    :goto_2
    const-string v0, "Must specify a session that has already ended"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Ul:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v1, v2

    goto :goto_2
.end method

.method public build()Lcom/google/android/gms/fitness/request/DataDeleteRequest;
    .locals 8

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->KS:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_4

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Sr:J

    iget-wide v6, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->KS:J

    cmp-long v0, v4, v6

    if-lez v0, :cond_4

    move v0, v1

    :goto_0
    const-string v3, "Must specify a valid time interval"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Um:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Uk:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->SB:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    :cond_0
    move v0, v1

    :goto_1
    iget-boolean v3, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Un:Z

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Ul:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    :cond_1
    move v3, v1

    :goto_2
    if-nez v0, :cond_2

    if-eqz v3, :cond_3

    :cond_2
    move v2, v1

    :cond_3
    const-string v0, "No data or session marked for deletion"

    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->ji()V

    new-instance v0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest;-><init>(Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;Lcom/google/android/gms/fitness/request/DataDeleteRequest$1;)V

    return-object v0

    :cond_4
    move v0, v2

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_1

    :cond_6
    move v3, v2

    goto :goto_2
.end method

.method public deleteAllData()Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;
    .locals 6

    const/4 v2, 0x0

    const/4 v1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->SB:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Uk:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Specific data source/type already specified for deletion. DataSources: %s DataTypes: %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Uk:Ljava/util/List;

    aput-object v5, v4, v2

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->SB:Ljava/util/List;

    aput-object v2, v4, v1

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v1, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Um:Z

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0
.end method

.method public deleteAllSessions()Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;
    .locals 6

    const/4 v5, 0x1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Ul:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-string v1, "Specific sessions already added for deletion: %s"

    new-array v2, v5, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Ul:Ljava/util/List;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v5, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Un:Z

    return-object p0
.end method

.method public setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;
    .locals 7
    .param p1, "startTime"    # J
    .param p3, "endTime"    # J
    .param p5, "timeUnit"    # Ljava/util/concurrent/TimeUnit;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v4, 0x0

    cmp-long v0, p1, v4

    if-lez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Invalid start time :%d"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    cmp-long v0, p3, p1

    if-lez v0, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Invalid end time :%d"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p5, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->KS:J

    invoke-virtual {p5, p3, p4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest$Builder;->Sr:J

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method
