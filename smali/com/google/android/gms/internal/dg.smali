.class public Lcom/google/android/gms/internal/dg;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mG:Landroid/view/WindowManager;

.field private final md:Lcom/google/android/gms/internal/gv;

.field private final rg:Lcom/google/android/gms/internal/bl;

.field rh:Landroid/util/DisplayMetrics;

.field private ri:F

.field rj:I

.field rk:I

.field private rl:I

.field private rm:I

.field private rn:I

.field private ro:[I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gv;Landroid/content/Context;Lcom/google/android/gms/internal/bl;)V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/google/android/gms/internal/dg;->rj:I

    iput v0, p0, Lcom/google/android/gms/internal/dg;->rk:I

    iput v0, p0, Lcom/google/android/gms/internal/dg;->rm:I

    iput v0, p0, Lcom/google/android/gms/internal/dg;->rn:I

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/android/gms/internal/dg;->ro:[I

    iput-object p1, p0, Lcom/google/android/gms/internal/dg;->md:Lcom/google/android/gms/internal/gv;

    iput-object p2, p0, Lcom/google/android/gms/internal/dg;->mContext:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/dg;->rg:Lcom/google/android/gms/internal/bl;

    const-string v0, "window"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/google/android/gms/internal/dg;->mG:Landroid/view/WindowManager;

    invoke-direct {p0}, Lcom/google/android/gms/internal/dg;->bM()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/dg;->bN()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/dg;->bO()V

    return-void
.end method

.method private bM()V
    .locals 2

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/dg;->rh:Landroid/util/DisplayMetrics;

    iget-object v0, p0, Lcom/google/android/gms/internal/dg;->mG:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->rh:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->rh:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, p0, Lcom/google/android/gms/internal/dg;->ri:F

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/dg;->rl:I

    return-void
.end method

.method private bO()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/dg;->md:Lcom/google/android/gms/internal/gv;

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->ro:[I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gv;->getLocationOnScreen([I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dg;->md:Lcom/google/android/gms/internal/gv;

    invoke-virtual {v0, v2, v2}, Lcom/google/android/gms/internal/gv;->measure(II)V

    const/high16 v0, 0x43200000    # 160.0f

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->rh:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->md:Lcom/google/android/gms/internal/gv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->getMeasuredWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/dg;->rm:I

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->md:Lcom/google/android/gms/internal/gv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gv;->getMeasuredHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/dg;->rn:I

    return-void
.end method

.method private bU()Lcom/google/android/gms/internal/df;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/df$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/df$a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->rg:Lcom/google/android/gms/internal/bl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/bl;->bj()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/df$a;->j(Z)Lcom/google/android/gms/internal/df$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->rg:Lcom/google/android/gms/internal/bl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/bl;->bk()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/df$a;->i(Z)Lcom/google/android/gms/internal/df$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->rg:Lcom/google/android/gms/internal/bl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/bl;->bo()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/df$a;->k(Z)Lcom/google/android/gms/internal/df$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->rg:Lcom/google/android/gms/internal/bl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/bl;->bl()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/df$a;->l(Z)Lcom/google/android/gms/internal/df$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->rg:Lcom/google/android/gms/internal/bl;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/bl;->bm()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/df$a;->m(Z)Lcom/google/android/gms/internal/df$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/df$a;->bL()Lcom/google/android/gms/internal/df;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method bN()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/dg;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/gj;->s(Landroid/content/Context;)I

    move-result v0

    const/high16 v1, 0x43200000    # 160.0f

    iget-object v2, p0, Lcom/google/android/gms/internal/dg;->rh:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/gms/internal/dg;->rh:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v2, v2

    mul-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, p0, Lcom/google/android/gms/internal/dg;->rj:I

    iget-object v2, p0, Lcom/google/android/gms/internal/dg;->rh:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    sub-int v0, v2, v0

    int-to-float v0, v0

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/dg;->rk:I

    return-void
.end method

.method public bP()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/dg;->bS()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/dg;->bT()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/dg;->bR()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/dg;->bQ()V

    return-void
.end method

.method public bQ()V
    .locals 3

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->u(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Dispatching Ready Event."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dg;->md:Lcom/google/android/gms/internal/gv;

    const-string v1, "onReadyEventReceived"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gv;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public bR()V
    .locals 4

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "x"

    iget-object v2, p0, Lcom/google/android/gms/internal/dg;->ro:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "y"

    iget-object v2, p0, Lcom/google/android/gms/internal/dg;->ro:[I

    const/4 v3, 0x1

    aget v2, v2, v3

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "width"

    iget v2, p0, Lcom/google/android/gms/internal/dg;->rm:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "height"

    iget v2, p0, Lcom/google/android/gms/internal/dg;->rn:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->md:Lcom/google/android/gms/internal/gv;

    const-string v2, "onDefaultPositionReceived"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/gv;->b(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Error occured while dispatching default position."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public bS()V
    .locals 4

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "width"

    iget v2, p0, Lcom/google/android/gms/internal/dg;->rj:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "height"

    iget v2, p0, Lcom/google/android/gms/internal/dg;->rk:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "density"

    iget v2, p0, Lcom/google/android/gms/internal/dg;->ri:F

    float-to-double v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "rotation"

    iget v2, p0, Lcom/google/android/gms/internal/dg;->rl:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->md:Lcom/google/android/gms/internal/gv;

    const-string v2, "onScreenInfoChanged"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/gv;->b(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Error occured while obtaining screen information."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public bT()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/dg;->bU()Lcom/google/android/gms/internal/df;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/dg;->md:Lcom/google/android/gms/internal/gv;

    const-string v2, "onDeviceFeaturesReceived"

    invoke-virtual {v0}, Lcom/google/android/gms/internal/df;->bK()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/gv;->b(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
