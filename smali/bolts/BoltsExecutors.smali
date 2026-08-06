.class final Lbolts/BoltsExecutors;
.super Ljava/lang/Object;
.source "BoltsExecutors.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbolts/BoltsExecutors$1;,
        Lbolts/BoltsExecutors$ImmediateExecutor;
    }
.end annotation


# static fields
.field private static final INSTANCE:Lbolts/BoltsExecutors;


# instance fields
.field private final background:Ljava/util/concurrent/ExecutorService;

.field private final immediate:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    new-instance v0, Lbolts/BoltsExecutors;

    invoke-direct {v0}, Lbolts/BoltsExecutors;-><init>()V

    sput-object v0, Lbolts/BoltsExecutors;->INSTANCE:Lbolts/BoltsExecutors;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-static {}, Lbolts/BoltsExecutors;->isAndroidRuntime()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lbolts/BoltsExecutors;->background:Ljava/util/concurrent/ExecutorService;

    .line 29
    new-instance v0, Lbolts/BoltsExecutors$ImmediateExecutor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbolts/BoltsExecutors$ImmediateExecutor;-><init>(Lbolts/BoltsExecutors$1;)V

    iput-object v0, p0, Lbolts/BoltsExecutors;->immediate:Ljava/util/concurrent/Executor;

    .line 30
    return-void

    .line 26
    :cond_0
    invoke-static {}, Lbolts/AndroidExecutors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    goto :goto_0
.end method

.method public static background()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lbolts/BoltsExecutors;->INSTANCE:Lbolts/BoltsExecutors;

    iget-object v0, v0, Lbolts/BoltsExecutors;->background:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static immediate()Ljava/util/concurrent/Executor;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lbolts/BoltsExecutors;->INSTANCE:Lbolts/BoltsExecutors;

    iget-object v0, v0, Lbolts/BoltsExecutors;->immediate:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method private static isAndroidRuntime()Z
    .locals 3

    .prologue
    .line 15
    const-string v1, "java.runtime.name"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 16
    .local v0, "javaRuntimeName":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 17
    const/4 v1, 0x0

    .line 19
    :goto_0
    return v1

    :cond_0
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "android"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    goto :goto_0
.end method
