.class public Lcom/google/android/gms/internal/an;
.super Ljava/lang/Thread;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/an$a;
    }
.end annotation


# instance fields
.field private mStarted:Z

.field private final mw:Ljava/lang/Object;

.field private final nf:I

.field private final nh:I

.field private ns:Z

.field private nt:Z

.field private final nu:Lcom/google/android/gms/internal/am;

.field private final nv:Lcom/google/android/gms/internal/al;

.field private final nw:Lcom/google/android/gms/internal/ey;

.field private final nx:I

.field private final ny:I

.field private final nz:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/am;Lcom/google/android/gms/internal/al;Landroid/os/Bundle;Lcom/google/android/gms/internal/ey;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/an;->mStarted:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/an;->ns:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/an;->nt:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/an;->nu:Lcom/google/android/gms/internal/am;

    iput-object p2, p0, Lcom/google/android/gms/internal/an;->nv:Lcom/google/android/gms/internal/al;

    iput-object p4, p0, Lcom/google/android/gms/internal/an;->nw:Lcom/google/android/gms/internal/ey;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/an;->mw:Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/bn;->pe:Lcom/google/android/gms/internal/iv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iv;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/an;->nf:I

    sget-object v0, Lcom/google/android/gms/internal/bn;->pf:Lcom/google/android/gms/internal/iv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iv;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/an;->ny:I

    sget-object v0, Lcom/google/android/gms/internal/bn;->pg:Lcom/google/android/gms/internal/iv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iv;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/an;->nh:I

    sget-object v0, Lcom/google/android/gms/internal/bn;->ph:Lcom/google/android/gms/internal/iv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iv;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/an;->nz:I

    sget-object v0, Lcom/google/android/gms/internal/bn;->pi:Lcom/google/android/gms/internal/iv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/iv;->getKey()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/an;->nx:I

    const-string v0, "ContentFetchTask"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/an;->setName(Ljava/lang/String;)V

    return-void
.end method

.method private a(Landroid/app/Activity;)V
    .locals 2

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    :cond_2
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/an;->g(Landroid/view/View;)Z

    goto :goto_0
.end method

.method private a(Landroid/webkit/WebView;Lcom/google/android/gms/internal/ak;)Z
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/kc;->hI()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ak;->aR()V

    new-instance v0, Lcom/google/android/gms/internal/an$2;

    invoke-direct {v0, p0, p2, p1}, Lcom/google/android/gms/internal/an$2;-><init>(Lcom/google/android/gms/internal/an;Lcom/google/android/gms/internal/ak;Landroid/webkit/WebView;)V

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private aW()Z
    .locals 7

    const/4 v3, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/an;->nu:Lcom/google/android/gms/internal/am;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/am;->getContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_0

    move v0, v3

    :goto_0
    return v0

    :cond_0
    const-string v0, "activity"

    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const-string v1, "keyguard"

    invoke-virtual {v2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/KeyguardManager;

    const-string v4, "power"

    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/PowerManager;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-nez v2, :cond_2

    :cond_1
    move v0, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v5

    iget v6, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v5, v6, :cond_4

    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v4, 0x64

    if-ne v0, v4, :cond_5

    invoke-virtual {v1}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v2}, Landroid/os/PowerManager;->isScreenOn()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    move v0, v3

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v3

    goto :goto_0
.end method


# virtual methods
.method a(Landroid/view/View;Lcom/google/android/gms/internal/ak;)Lcom/google/android/gms/internal/an$a;
    .locals 5

    const/4 v2, 0x1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/an$a;

    invoke-direct {v1, p0, v0, v0}, Lcom/google/android/gms/internal/an$a;-><init>(Lcom/google/android/gms/internal/an;II)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    instance-of v1, p1, Landroid/widget/TextView;

    if-eqz v1, :cond_1

    instance-of v1, p1, Landroid/widget/EditText;

    if-nez v1, :cond_1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ak;->i(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/an$a;

    invoke-direct {v1, p0, v2, v0}, Lcom/google/android/gms/internal/an$a;-><init>(Lcom/google/android/gms/internal/an;II)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    instance-of v1, p1, Landroid/webkit/WebView;

    if-eqz v1, :cond_3

    instance-of v1, p1, Lcom/google/android/gms/internal/gv;

    if-nez v1, :cond_3

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ak;->aR()V

    check-cast p1, Landroid/webkit/WebView;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/an;->a(Landroid/webkit/WebView;Lcom/google/android/gms/internal/ak;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/an$a;

    invoke-direct {v1, p0, v0, v2}, Lcom/google/android/gms/internal/an$a;-><init>(Lcom/google/android/gms/internal/an;II)V

    move-object v0, v1

    goto :goto_0

    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/an$a;

    invoke-direct {v1, p0, v0, v0}, Lcom/google/android/gms/internal/an$a;-><init>(Lcom/google/android/gms/internal/an;II)V

    move-object v0, v1

    goto :goto_0

    :cond_3
    instance-of v1, p1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_5

    check-cast p1, Landroid/view/ViewGroup;

    move v1, v0

    move v2, v0

    :goto_1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v0, v3, :cond_4

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3, p2}, Lcom/google/android/gms/internal/an;->a(Landroid/view/View;Lcom/google/android/gms/internal/ak;)Lcom/google/android/gms/internal/an$a;

    move-result-object v3

    iget v4, v3, Lcom/google/android/gms/internal/an$a;->nG:I

    add-int/2addr v2, v4

    iget v3, v3, Lcom/google/android/gms/internal/an$a;->nH:I

    add-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    new-instance v0, Lcom/google/android/gms/internal/an$a;

    invoke-direct {v0, p0, v2, v1}, Lcom/google/android/gms/internal/an$a;-><init>(Lcom/google/android/gms/internal/an;II)V

    goto :goto_0

    :cond_5
    new-instance v1, Lcom/google/android/gms/internal/an$a;

    invoke-direct {v1, p0, v0, v0}, Lcom/google/android/gms/internal/an$a;-><init>(Lcom/google/android/gms/internal/an;II)V

    move-object v0, v1

    goto :goto_0
.end method

.method a(Lcom/google/android/gms/internal/ak;Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ak;->aQ()V

    :try_start_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "text"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ak;->h(Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ak;->aN()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/an;->nv:Lcom/google/android/gms/internal/al;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/al;->b(Lcom/google/android/gms/internal/ak;)Z

    :cond_1
    :goto_1
    return-void

    :cond_2
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ak;->h(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, "Json string may be malformed."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v1, "Failed to get webview content."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/an;->nw:Lcom/google/android/gms/internal/ey;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ey;->b(Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public aV()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/an;->mw:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/an;->mStarted:Z

    if-eqz v0, :cond_0

    const-string v0, "Content hash thread already started, quiting..."

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/an;->mStarted:Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/an;->start()V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public aX()Lcom/google/android/gms/internal/ak;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/an;->nv:Lcom/google/android/gms/internal/al;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/al;->aU()Lcom/google/android/gms/internal/ak;

    move-result-object v0

    return-object v0
.end method

.method public aY()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/an;->mw:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/an;->ns:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ContentFetchThread: paused, mPause = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v2, p0, Lcom/google/android/gms/internal/an;->ns:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public aZ()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/an;->ns:Z

    return v0
.end method

.method g(Landroid/view/View;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/an$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/an$1;-><init>(Lcom/google/android/gms/internal/an;Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x1

    goto :goto_0
.end method

.method h(Landroid/view/View;)V
    .locals 5

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ak;

    iget v1, p0, Lcom/google/android/gms/internal/an;->nf:I

    iget v2, p0, Lcom/google/android/gms/internal/an;->ny:I

    iget v3, p0, Lcom/google/android/gms/internal/an;->nh:I

    iget v4, p0, Lcom/google/android/gms/internal/an;->nz:I

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ak;-><init>(IIII)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/an;->a(Landroid/view/View;Lcom/google/android/gms/internal/ak;)Lcom/google/android/gms/internal/an$a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ak;->aS()V

    iget v2, v1, Lcom/google/android/gms/internal/an$a;->nG:I

    if-nez v2, :cond_1

    iget v2, v1, Lcom/google/android/gms/internal/an$a;->nH:I

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v2, v1, Lcom/google/android/gms/internal/an$a;->nH:I

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ak;->aT()I

    move-result v2

    if-eqz v2, :cond_0

    :cond_2
    iget v1, v1, Lcom/google/android/gms/internal/an$a;->nH:I

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/an;->nv:Lcom/google/android/gms/internal/al;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/al;->a(Lcom/google/android/gms/internal/ak;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/an;->nv:Lcom/google/android/gms/internal/al;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/al;->c(Lcom/google/android/gms/internal/ak;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Exception in fetchContentOnUIThread"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/an;->nw:Lcom/google/android/gms/internal/ey;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ey;->b(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public run()V
    .locals 2

    :goto_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/an;->nt:Z

    if-nez v0, :cond_3

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/an;->aW()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/an;->nu:Lcom/google/android/gms/internal/am;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/am;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "ContentFetchThread: no activity"

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Error in ContentFetchTask"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/an;->nw:Lcom/google/android/gms/internal/ey;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ey;->b(Ljava/lang/Throwable;)V

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/an;->mw:Ljava/lang/Object;

    monitor-enter v1

    :goto_2
    :try_start_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/an;->ns:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    :try_start_2
    const-string v0, "ContentFetchTask: waiting"

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/an;->mw:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_0
    :try_start_3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/an;->a(Landroid/app/Activity;)V

    :goto_3
    iget v0, p0, Lcom/google/android/gms/internal/an;->nx:I

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_1

    :cond_1
    const-string v0, "ContentFetchTask: sleeping"

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/an;->aY()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :cond_2
    :try_start_4
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :cond_3
    return-void
.end method

.method public wakeup()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/an;->mw:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/an;->ns:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/an;->mw:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    const-string v0, "ContentFetchThread: wakeup"

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
