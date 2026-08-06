.class Lcom/google/android/gms/internal/u$b;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field public final lA:Ljava/lang/String;

.field public final lB:Landroid/content/Context;

.field public final lC:Lcom/google/android/gms/internal/k;

.field public final lD:Lcom/google/android/gms/internal/gt;

.field public lE:Lcom/google/android/gms/internal/bc;

.field public lF:Lcom/google/android/gms/internal/gg;

.field public lG:Lcom/google/android/gms/internal/gg;

.field public lH:Lcom/google/android/gms/internal/ay;

.field public lI:Lcom/google/android/gms/internal/fz;

.field public lJ:Lcom/google/android/gms/internal/fz$a;

.field public lK:Lcom/google/android/gms/internal/ga;

.field public lL:Lcom/google/android/gms/internal/bf;

.field public lM:Lcom/google/android/gms/internal/el;

.field public lN:Lcom/google/android/gms/internal/eh;

.field public lO:Lcom/google/android/gms/internal/et;

.field public lP:Lcom/google/android/gms/internal/eu;

.field public lQ:Lcom/google/android/gms/internal/bt;

.field public lR:Lcom/google/android/gms/internal/bu;

.field public lS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public lT:Lcom/google/android/gms/internal/ee;

.field public lU:Lcom/google/android/gms/internal/ge;

.field public lV:Landroid/view/View;

.field public lW:I

.field public lX:Z

.field private lY:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/ga;",
            ">;"
        }
    .end annotation
.end field

.field public final lz:Lcom/google/android/gms/internal/u$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Lcom/google/android/gms/internal/gt;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/u$b;->lU:Lcom/google/android/gms/internal/ge;

    iput-object v1, p0, Lcom/google/android/gms/internal/u$b;->lV:Landroid/view/View;

    iput v0, p0, Lcom/google/android/gms/internal/u$b;->lW:I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/u$b;->lX:Z

    iput-object v1, p0, Lcom/google/android/gms/internal/u$b;->lY:Ljava/util/HashSet;

    iget-boolean v0, p2, Lcom/google/android/gms/internal/ay;->og:Z

    if-eqz v0, :cond_0

    iput-object v1, p0, Lcom/google/android/gms/internal/u$b;->lz:Lcom/google/android/gms/internal/u$a;

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/internal/u$b;->lH:Lcom/google/android/gms/internal/ay;

    iput-object p3, p0, Lcom/google/android/gms/internal/u$b;->lA:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/u$b;->lB:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/internal/u$b;->lD:Lcom/google/android/gms/internal/gt;

    new-instance v0, Lcom/google/android/gms/internal/k;

    new-instance v1, Lcom/google/android/gms/internal/w;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/w;-><init>(Lcom/google/android/gms/internal/u$b;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/k;-><init>(Lcom/google/android/gms/internal/g;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/u$b;->lC:Lcom/google/android/gms/internal/k;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/u$a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/u$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/u$b;->lz:Lcom/google/android/gms/internal/u$a;

    iget-object v0, p0, Lcom/google/android/gms/internal/u$b;->lz:Lcom/google/android/gms/internal/u$a;

    iget v1, p2, Lcom/google/android/gms/internal/ay;->widthPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u$b;->lz:Lcom/google/android/gms/internal/u$a;

    iget v1, p2, Lcom/google/android/gms/internal/ay;->heightPixels:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/u$b;->lz:Lcom/google/android/gms/internal/u$a;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/u$a;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/util/HashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/ga;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/u$b;->lY:Ljava/util/HashSet;

    return-void
.end method

.method public au()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/ga;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/u$b;->lY:Ljava/util/HashSet;

    return-object v0
.end method
