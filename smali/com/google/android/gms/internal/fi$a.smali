.class public final Lcom/google/android/gms/internal/fi$a;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final applicationInfo:Landroid/content/pm/ApplicationInfo;

.field public final lA:Ljava/lang/String;

.field public final lD:Lcom/google/android/gms/internal/gt;

.field public final lH:Lcom/google/android/gms/internal/ay;

.field public final lS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final tA:Ljava/lang/String;

.field public final tB:Ljava/lang/String;

.field public final tC:Landroid/os/Bundle;

.field public final tD:I

.field public final tE:Landroid/os/Bundle;

.field public final tF:Z

.field public final tw:Landroid/os/Bundle;

.field public final tx:Lcom/google/android/gms/internal/av;

.field public final ty:Landroid/content/pm/PackageInfo;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gt;Landroid/os/Bundle;Ljava/util/List;Landroid/os/Bundle;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Lcom/google/android/gms/internal/av;",
            "Lcom/google/android/gms/internal/ay;",
            "Ljava/lang/String;",
            "Landroid/content/pm/ApplicationInfo;",
            "Landroid/content/pm/PackageInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gt;",
            "Landroid/os/Bundle;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/os/Bundle;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/fi$a;->tw:Landroid/os/Bundle;

    iput-object p2, p0, Lcom/google/android/gms/internal/fi$a;->tx:Lcom/google/android/gms/internal/av;

    iput-object p3, p0, Lcom/google/android/gms/internal/fi$a;->lH:Lcom/google/android/gms/internal/ay;

    iput-object p4, p0, Lcom/google/android/gms/internal/fi$a;->lA:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/fi$a;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iput-object p6, p0, Lcom/google/android/gms/internal/fi$a;->ty:Landroid/content/pm/PackageInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/fi$a;->tA:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/fi$a;->tB:Ljava/lang/String;

    iput-object p9, p0, Lcom/google/android/gms/internal/fi$a;->lD:Lcom/google/android/gms/internal/gt;

    iput-object p10, p0, Lcom/google/android/gms/internal/fi$a;->tC:Landroid/os/Bundle;

    iput-boolean p13, p0, Lcom/google/android/gms/internal/fi$a;->tF:Z

    if-eqz p11, :cond_0

    invoke-interface {p11}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/fi$a;->tD:I

    iput-object p11, p0, Lcom/google/android/gms/internal/fi$a;->lS:Ljava/util/List;

    :goto_0
    iput-object p12, p0, Lcom/google/android/gms/internal/fi$a;->tE:Landroid/os/Bundle;

    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/fi$a;->tD:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/fi$a;->lS:Ljava/util/List;

    goto :goto_0
.end method
