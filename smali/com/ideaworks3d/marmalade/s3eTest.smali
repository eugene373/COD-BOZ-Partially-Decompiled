.class public Lcom/ideaworks3d/marmalade/s3eTest;
.super Ljava/lang/Object;
.source "s3eTest.java"


# instance fields
.field private m_Handler:Landroid/os/Handler;

.field private suspendResumeCompletionFlag:Z

.field private final suspendResumeLock:Ljava/lang/Object;

.field thread:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->suspendResumeCompletionFlag:Z

    .line 64
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->suspendResumeLock:Ljava/lang/Object;

    .line 16
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eTest$1;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eTest$1;-><init>(Lcom/ideaworks3d/marmalade/s3eTest;)V

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->runOnOSThread(Ljava/lang/Runnable;)V

    .line 24
    return-void
.end method

.method static synthetic access$002(Lcom/ideaworks3d/marmalade/s3eTest;Landroid/os/Handler;)Landroid/os/Handler;
    .locals 0

    .prologue
    .line 11
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/s3eTest;->m_Handler:Landroid/os/Handler;

    return-object p1
.end method

.method static synthetic access$100(Lcom/ideaworks3d/marmalade/s3eTest;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->suspendResumeLock:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$200(Lcom/ideaworks3d/marmalade/s3eTest;)Z
    .locals 1

    .prologue
    .line 11
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->suspendResumeCompletionFlag:Z

    return v0
.end method

.method static synthetic access$202(Lcom/ideaworks3d/marmalade/s3eTest;Z)Z
    .locals 0

    .prologue
    .line 11
    iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/s3eTest;->suspendResumeCompletionFlag:Z

    return p1
.end method


# virtual methods
.method public GetAndroidTargetAPILevel()I
    .locals 2

    .prologue
    .line 135
    const/4 v0, 0x0

    .line 138
    :try_start_0
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 139
    if-eqz v1, :cond_0

    .line 141
    iget v0, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    :cond_0
    :goto_0
    return v0

    .line 144
    :catch_0
    move-exception v1

    .line 146
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public PostResume()V
    .locals 2

    .prologue
    .line 38
    const-string v0, "PostResume"

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->m_Handler:Landroid/os/Handler;

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eTest$3;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eTest$3;-><init>(Lcom/ideaworks3d/marmalade/s3eTest;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 50
    return-void
.end method

.method public PostRotate(II)V
    .locals 2

    .prologue
    .line 108
    const-string v0, "PostRotate"

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->m_Handler:Landroid/os/Handler;

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eTest$6;

    invoke-direct {v1, p0, p1, p2}, Lcom/ideaworks3d/marmalade/s3eTest$6;-><init>(Lcom/ideaworks3d/marmalade/s3eTest;II)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 116
    return-void
.end method

.method public PostSetFocus(Z)V
    .locals 2

    .prologue
    .line 53
    const-string v0, "PostSetFocus"

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->m_Handler:Landroid/os/Handler;

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eTest$4;

    invoke-direct {v1, p0, p1}, Lcom/ideaworks3d/marmalade/s3eTest$4;-><init>(Lcom/ideaworks3d/marmalade/s3eTest;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 61
    return-void
.end method

.method public PostSuspend()V
    .locals 2

    .prologue
    .line 27
    const-string v0, "PostSuspend"

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 28
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->m_Handler:Landroid/os/Handler;

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eTest$2;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/s3eTest$2;-><init>(Lcom/ideaworks3d/marmalade/s3eTest;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    return-void
.end method

.method public PostSuspendResume(II)V
    .locals 2

    .prologue
    .line 67
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/ideaworks3d/marmalade/s3eTest$5;

    invoke-direct {v1, p0, p2, p1}, Lcom/ideaworks3d/marmalade/s3eTest$5;-><init>(Lcom/ideaworks3d/marmalade/s3eTest;II)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;

    .line 98
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 99
    return-void
.end method

.method public QueryThreadFinished()Z
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;

    if-nez v0, :cond_0

    .line 103
    const/4 v0, 0x1

    .line 104
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public TakeScreenShot([I)[I
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v2, 0x0

    .line 119
    const-string v0, "TakeScreenShot"

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 120
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    .line 121
    invoke-virtual {v8, v9}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 122
    invoke-virtual {v8}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 123
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    .line 124
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    .line 125
    mul-int v1, v3, v7

    .line 126
    new-array v1, v1, [I

    move v4, v2

    move v5, v2

    move v6, v3

    .line 127
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 128
    aput v3, p1, v2

    .line 129
    aput v7, p1, v9

    .line 130
    invoke-virtual {v8, v2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 131
    return-object v1
.end method
