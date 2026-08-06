.class final Lbolts/AndroidExecutors;
.super Ljava/lang/Object;
.source "AndroidExecutors.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbolts/AndroidExecutors$1;,
        Lbolts/AndroidExecutors$UIThreadExecutor;
    }
.end annotation


# static fields
.field static final CORE_POOL_SIZE:I

.field private static final CPU_COUNT:I

.field private static final INSTANCE:Lbolts/AndroidExecutors;

.field static final KEEP_ALIVE_TIME:J = 0x1L

.field static final MAX_POOL_SIZE:I

.field static final MAX_QUEUE_SIZE:I = 0x80


# instance fields
.field private final uiThread:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 40
    new-instance v0, Lbolts/AndroidExecutors;

    invoke-direct {v0}, Lbolts/AndroidExecutors;-><init>()V

    sput-object v0, Lbolts/AndroidExecutors;->INSTANCE:Lbolts/AndroidExecutors;

    .line 58
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lbolts/AndroidExecutors;->CPU_COUNT:I

    .line 59
    sget v0, Lbolts/AndroidExecutors;->CPU_COUNT:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lbolts/AndroidExecutors;->CORE_POOL_SIZE:I

    .line 60
    sget v0, Lbolts/AndroidExecutors;->CPU_COUNT:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sput v0, Lbolts/AndroidExecutors;->MAX_POOL_SIZE:I

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Lbolts/AndroidExecutors$UIThreadExecutor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbolts/AndroidExecutors$UIThreadExecutor;-><init>(Lbolts/AndroidExecutors$1;)V

    iput-object v0, p0, Lbolts/AndroidExecutors;->uiThread:Ljava/util/concurrent/Executor;

    .line 46
    return-void
.end method

.method public static allowCoreThreadTimeout(Ljava/util/concurrent/ThreadPoolExecutor;Z)V
    .locals 2
    .param p0, "executor"    # Ljava/util/concurrent/ThreadPoolExecutor;
    .param p1, "value"    # Z
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 121
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 122
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 124
    :cond_0
    return-void
.end method

.method public static newCachedThreadPool()Ljava/util/concurrent/ExecutorService;
    .locals 8

    .prologue
    .line 75
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v2, Lbolts/AndroidExecutors;->CORE_POOL_SIZE:I

    sget v3, Lbolts/AndroidExecutors;->MAX_POOL_SIZE:I

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v0, 0x80

    invoke-direct {v7, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 81
    .local v1, "executor":Ljava/util/concurrent/ThreadPoolExecutor;
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lbolts/AndroidExecutors;->allowCoreThreadTimeout(Ljava/util/concurrent/ThreadPoolExecutor;Z)V

    .line 83
    return-object v1
.end method

.method public static newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;
    .locals 9
    .param p0, "threadFactory"    # Ljava/util/concurrent/ThreadFactory;

    .prologue
    .line 98
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v2, Lbolts/AndroidExecutors;->CORE_POOL_SIZE:I

    sget v3, Lbolts/AndroidExecutors;->MAX_POOL_SIZE:I

    const-wide/16 v4, 0x1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v0, 0x80

    invoke-direct {v7, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    move-object v8, p0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 105
    .local v1, "executor":Ljava/util/concurrent/ThreadPoolExecutor;
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lbolts/AndroidExecutors;->allowCoreThreadTimeout(Ljava/util/concurrent/ThreadPoolExecutor;Z)V

    .line 107
    return-object v1
.end method

.method public static uiThread()Ljava/util/concurrent/Executor;
    .locals 1

    .prologue
    .line 130
    sget-object v0, Lbolts/AndroidExecutors;->INSTANCE:Lbolts/AndroidExecutors;

    iget-object v0, v0, Lbolts/AndroidExecutors;->uiThread:Ljava/util/concurrent/Executor;

    return-object v0
.end method
