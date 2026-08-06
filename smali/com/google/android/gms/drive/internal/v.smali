.class public final Lcom/google/android/gms/drive/internal/v;
.super Ljava/lang/Object;


# static fields
.field private static final Pa:Lcom/google/android/gms/common/internal/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/internal/i;

    const-string v1, "GmsDrive"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/i;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/internal/v;->Pa:Lcom/google/android/gms/common/internal/i;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/v;->Pa:Lcom/google/android/gms/common/internal/i;

    invoke-virtual {v0, p0, p2, p1}, Lcom/google/android/gms/common/internal/i;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/drive/internal/v;->Pa:Lcom/google/android/gms/common/internal/i;

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0, p0, p1, p2, v1}, Lcom/google/android/gms/common/internal/i;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/v;->Pa:Lcom/google/android/gms/common/internal/i;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/i;->n(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/v;->Pa:Lcom/google/android/gms/common/internal/i;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/i;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/v;->Pa:Lcom/google/android/gms/common/internal/i;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/common/internal/i;->q(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
