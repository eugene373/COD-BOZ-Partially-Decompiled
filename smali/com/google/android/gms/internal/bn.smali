.class public final Lcom/google/android/gms/internal/bn;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# static fields
.field public static oX:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static oY:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static oZ:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static pa:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static pb:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static pc:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static pd:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static pe:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static pf:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static pg:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static ph:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static pi:Lcom/google/android/gms/internal/iv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final pj:Landroid/os/Bundle;

.field private static pk:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v1, 0x0

    const/16 v5, 0xa

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/bn;->pj:Landroid/os/Bundle;

    sput-boolean v3, Lcom/google/android/gms/internal/bn;->pk:Z

    const-string v0, "gads:sdk_core_location"

    const-string v2, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html"

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->oX:Lcom/google/android/gms/internal/iv;

    const-string v2, "gads:sdk_core_experiment_id"

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->oY:Lcom/google/android/gms/internal/iv;

    const-string v0, "gads:sdk_crash_report_enabled"

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/bn;->c(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->oZ:Lcom/google/android/gms/internal/iv;

    const-string v0, "gads:sdk_crash_report_full_stacktrace"

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/bn;->c(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pa:Lcom/google/android/gms/internal/iv;

    const-string v0, "gads:block_autoclicks"

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/bn;->c(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pb:Lcom/google/android/gms/internal/iv;

    const-string v0, "gads:block_autoclicks_experiment_id"

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pc:Lcom/google/android/gms/internal/iv;

    sput-boolean v4, Lcom/google/android/gms/internal/bn;->pk:Z

    const-string v0, "gads:enable_content_fetching"

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/bn;->c(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pd:Lcom/google/android/gms/internal/iv;

    const-string v0, "gads:content_length_weight"

    invoke-static {v0, v4}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pe:Lcom/google/android/gms/internal/iv;

    const-string v0, "gads:content_age_weight"

    invoke-static {v0, v4}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pf:Lcom/google/android/gms/internal/iv;

    const-string v0, "gads:min_content_len"

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pg:Lcom/google/android/gms/internal/iv;

    const-string v0, "gads:fingerprint_number"

    invoke-static {v0, v5}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->ph:Lcom/google/android/gms/internal/iv;

    const-string v0, "gads:sleep_sec"

    invoke-static {v0, v5}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pi:Lcom/google/android/gms/internal/iv;

    return-void
.end method

.method private static a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/bn;->pj:Landroid/os/Bundle;

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/iv;->a(Ljava/lang/String;Ljava/lang/Integer;)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/bn;->pj:Landroid/os/Bundle;

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/iv;->m(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    return-object v0
.end method

.method public static bs()Landroid/os/Bundle;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/bn;->pj:Landroid/os/Bundle;

    return-object v0
.end method

.method private static c(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iv;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/google/android/gms/internal/iv",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/bn;->pj:Landroid/os/Bundle;

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/iv;->g(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iv;

    move-result-object v0

    return-object v0
.end method
