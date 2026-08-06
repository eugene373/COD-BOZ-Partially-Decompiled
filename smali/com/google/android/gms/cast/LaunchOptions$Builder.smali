.class public final Lcom/google/android/gms/cast/LaunchOptions$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/LaunchOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private Fd:Lcom/google/android/gms/cast/LaunchOptions;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/cast/LaunchOptions;

    invoke-direct {v0}, Lcom/google/android/gms/cast/LaunchOptions;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/LaunchOptions$Builder;->Fd:Lcom/google/android/gms/cast/LaunchOptions;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/cast/LaunchOptions;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/LaunchOptions$Builder;->Fd:Lcom/google/android/gms/cast/LaunchOptions;

    return-object v0
.end method

.method public setLocale(Ljava/util/Locale;)Lcom/google/android/gms/cast/LaunchOptions$Builder;
    .locals 2
    .param p1, "locale"    # Ljava/util/Locale;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/cast/LaunchOptions$Builder;->Fd:Lcom/google/android/gms/cast/LaunchOptions;

    invoke-static {p1}, Lcom/google/android/gms/internal/ik;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/LaunchOptions;->setLanguage(Ljava/lang/String;)V

    return-object p0
.end method

.method public setRelaunchIfRunning(Z)Lcom/google/android/gms/cast/LaunchOptions$Builder;
    .locals 1
    .param p1, "relaunchIfRunning"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/cast/LaunchOptions$Builder;->Fd:Lcom/google/android/gms/cast/LaunchOptions;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/LaunchOptions;->setRelaunchIfRunning(Z)V

    return-object p0
.end method
