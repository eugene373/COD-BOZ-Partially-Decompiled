.class public final Lcom/amazon/device/iap/internal/e;
.super Ljava/lang/Object;
.source "ImplementationFactory.java"


# static fields
.field private static final a:Ljava/lang/String;

.field private static volatile b:Z

.field private static volatile c:Z

.field private static volatile d:Lcom/amazon/device/iap/internal/c;

.field private static volatile e:Lcom/amazon/device/iap/internal/a;

.field private static volatile f:Lcom/amazon/device/iap/internal/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-class v0, Lcom/amazon/device/iap/internal/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/amazon/device/iap/internal/e;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 122
    const/4 v0, 0x0

    .line 124
    :try_start_0
    invoke-static {}, Lcom/amazon/device/iap/internal/e;->d()Lcom/amazon/device/iap/internal/b;

    move-result-object v1

    .line 125
    invoke-interface {v1, p0}, Lcom/amazon/device/iap/internal/b;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 126
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 130
    :goto_0
    return-object v0

    .line 127
    :catch_0
    move-exception v1

    .line 128
    sget-object v2, Lcom/amazon/device/iap/internal/e;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "error getting instance for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static a()Z
    .locals 3

    .prologue
    .line 54
    sget-boolean v0, Lcom/amazon/device/iap/internal/e;->c:Z

    if-eqz v0, :cond_0

    .line 55
    sget-boolean v0, Lcom/amazon/device/iap/internal/e;->b:Z

    .line 74
    :goto_0
    return v0

    .line 57
    :cond_0
    const-class v1, Lcom/amazon/device/iap/internal/e;

    monitor-enter v1

    .line 58
    :try_start_0
    sget-boolean v0, Lcom/amazon/device/iap/internal/e;->c:Z

    if-eqz v0, :cond_1

    .line 59
    sget-boolean v0, Lcom/amazon/device/iap/internal/e;->b:Z

    monitor-exit v1

    goto :goto_0

    .line 71
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 62
    :cond_1
    :try_start_1
    const-class v0, Lcom/amazon/device/iap/internal/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 63
    const-string v2, "com.amazon.android.Kiwi"

    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 64
    const/4 v0, 0x0

    sput-boolean v0, Lcom/amazon/device/iap/internal/e;->b:Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    :goto_1
    const/4 v0, 0x1

    :try_start_2
    sput-boolean v0, Lcom/amazon/device/iap/internal/e;->c:Z

    .line 71
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    sget-boolean v0, Lcom/amazon/device/iap/internal/e;->b:Z

    goto :goto_0

    .line 65
    :catch_0
    move-exception v0

    .line 66
    const/4 v0, 0x1

    :try_start_3
    sput-boolean v0, Lcom/amazon/device/iap/internal/e;->b:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method public static b()Lcom/amazon/device/iap/internal/c;
    .locals 2

    .prologue
    .line 81
    sget-object v0, Lcom/amazon/device/iap/internal/e;->d:Lcom/amazon/device/iap/internal/c;

    if-nez v0, :cond_1

    .line 82
    const-class v1, Lcom/amazon/device/iap/internal/e;

    monitor-enter v1

    .line 83
    :try_start_0
    sget-object v0, Lcom/amazon/device/iap/internal/e;->d:Lcom/amazon/device/iap/internal/c;

    if-nez v0, :cond_0

    .line 84
    const-class v0, Lcom/amazon/device/iap/internal/c;

    invoke-static {v0}, Lcom/amazon/device/iap/internal/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/internal/c;

    sput-object v0, Lcom/amazon/device/iap/internal/e;->d:Lcom/amazon/device/iap/internal/c;

    .line 86
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :cond_1
    sget-object v0, Lcom/amazon/device/iap/internal/e;->d:Lcom/amazon/device/iap/internal/c;

    return-object v0

    .line 86
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static c()Lcom/amazon/device/iap/internal/a;
    .locals 2

    .prologue
    .line 95
    sget-object v0, Lcom/amazon/device/iap/internal/e;->e:Lcom/amazon/device/iap/internal/a;

    if-nez v0, :cond_1

    .line 96
    const-class v1, Lcom/amazon/device/iap/internal/e;

    monitor-enter v1

    .line 97
    :try_start_0
    sget-object v0, Lcom/amazon/device/iap/internal/e;->e:Lcom/amazon/device/iap/internal/a;

    if-nez v0, :cond_0

    .line 98
    const-class v0, Lcom/amazon/device/iap/internal/a;

    invoke-static {v0}, Lcom/amazon/device/iap/internal/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazon/device/iap/internal/a;

    sput-object v0, Lcom/amazon/device/iap/internal/e;->e:Lcom/amazon/device/iap/internal/a;

    .line 100
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    :cond_1
    sget-object v0, Lcom/amazon/device/iap/internal/e;->e:Lcom/amazon/device/iap/internal/a;

    return-object v0

    .line 100
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private static d()Lcom/amazon/device/iap/internal/b;
    .locals 2

    .prologue
    .line 31
    sget-object v0, Lcom/amazon/device/iap/internal/e;->f:Lcom/amazon/device/iap/internal/b;

    if-nez v0, :cond_1

    .line 32
    const-class v1, Lcom/amazon/device/iap/internal/e;

    monitor-enter v1

    .line 33
    :try_start_0
    sget-object v0, Lcom/amazon/device/iap/internal/e;->f:Lcom/amazon/device/iap/internal/b;

    if-nez v0, :cond_0

    .line 34
    invoke-static {}, Lcom/amazon/device/iap/internal/e;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 35
    new-instance v0, Lcom/amazon/device/iap/internal/a/d;

    invoke-direct {v0}, Lcom/amazon/device/iap/internal/a/d;-><init>()V

    sput-object v0, Lcom/amazon/device/iap/internal/e;->f:Lcom/amazon/device/iap/internal/b;

    .line 40
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    :cond_1
    sget-object v0, Lcom/amazon/device/iap/internal/e;->f:Lcom/amazon/device/iap/internal/b;

    return-object v0

    .line 37
    :cond_2
    :try_start_1
    new-instance v0, Lcom/amazon/device/iap/internal/b/g;

    invoke-direct {v0}, Lcom/amazon/device/iap/internal/b/g;-><init>()V

    sput-object v0, Lcom/amazon/device/iap/internal/e;->f:Lcom/amazon/device/iap/internal/b;

    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
