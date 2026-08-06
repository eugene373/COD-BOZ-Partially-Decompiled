.class public Lcom/ideaworks3d/marmalade/LoaderThread;
.super Ljava/lang/Thread;
.source "LoaderThread.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/LoaderThread$5;,
        Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;,
        Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;,
        Lcom/ideaworks3d/marmalade/LoaderThread$AudioState;
    }
.end annotation


# static fields
.field static g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;


# instance fields
.field private m_Accelerometer:Landroid/hardware/Sensor;

.field private m_AppDoingInitTerm:I

.field private m_Assets:Landroid/content/res/AssetManager;

.field private m_BatteryLevel:I

.field private m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;

.field private m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;

.field private m_ChargerConnected:Z

.field private m_Compass:Landroid/hardware/Sensor;

.field private final m_CreateView:Ljava/lang/Runnable;

.field private m_DidSuspendForSurfaceChange:Z

.field private m_FileRoot:Ljava/io/File;

.field private m_FixScreenOrientation:I

.field private m_Handler:Landroid/os/Handler;

.field private m_IgnoreResizeWhilePaused:Z

.field private m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

.field private m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;

.field private m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

.field private m_MediaPlayerManager:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;

.field private m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;

.field private m_NetworkCheckEnabled:Z

.field private m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;

.field private m_OnTouchWait:Ljava/lang/Integer;

.field private m_Orientation:Landroid/hardware/Sensor;

.field private m_Paused:Ljava/lang/Boolean;

.field private m_ResumeInProgress:Ljava/lang/Boolean;

.field private final m_RunOnOSThread:Ljava/lang/Runnable;

.field private m_SensorManager:Landroid/hardware/SensorManager;

.field private m_SkipNextChange:Z

.field private m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;

.field private m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

.field private m_StartScreenOrientation:I

.field private m_Started:Ljava/lang/Boolean;

.field private m_TelephonyManagerExists:Z

.field private m_TelephonyManagerExistsKnown:Z

.field private m_Terminating:Ljava/lang/Boolean;

.field private m_TouchEvent:Ljava/lang/reflect/Method;

.field private m_TouchMulti:Z

.field private m_UseGL:Z

.field private m_VideoIsPaused:Ljava/lang/Boolean;

.field private m_View:Lcom/ideaworks3d/marmalade/LoaderView;

.field private m_getRotation:Ljava/lang/reflect/Method;

.field private m_splashFinished:Z


# direct methods
.method private constructor <init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/content/res/AssetManager;Ljava/io/File;)V
    .locals 6

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    .line 548
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 462
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$1;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/LoaderThread$1;-><init>(Lcom/ideaworks3d/marmalade/LoaderThread;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;

    .line 477
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$2;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/LoaderThread$2;-><init>(Lcom/ideaworks3d/marmalade/LoaderThread;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;

    .line 496
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z

    .line 497
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Handler:Landroid/os/Handler;

    .line 504
    iput-object v5, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

    .line 505
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z

    .line 512
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;

    .line 513
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ResumeInProgress:Ljava/lang/Boolean;

    .line 514
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_VideoIsPaused:Ljava/lang/Boolean;

    .line 515
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Started:Ljava/lang/Boolean;

    .line 516
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;

    .line 518
    iput-object v5, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TouchEvent:Ljava/lang/reflect/Method;

    .line 519
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_OnTouchWait:Ljava/lang/Integer;

    .line 520
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TouchMulti:Z

    .line 523
    iput-object v5, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;

    .line 524
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$3;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/LoaderThread$3;-><init>(Lcom/ideaworks3d/marmalade/LoaderThread;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_RunOnOSThread:Ljava/lang/Runnable;

    .line 531
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$4;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/LoaderThread$4;-><init>(Lcom/ideaworks3d/marmalade/LoaderThread;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;

    .line 546
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;

    .line 693
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_splashFinished:Z

    .line 549
    iput-object p2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Assets:Landroid/content/res/AssetManager;

    .line 552
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    .line 553
    iput v4, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_StartScreenOrientation:I

    .line 554
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getRequestedOrientation()I

    move-result v0

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FixScreenOrientation:I

    .line 556
    iput-object p3, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FileRoot:Ljava/io/File;

    .line 557
    new-instance v0, Lcom/ideaworks3d/marmalade/SoundPlayer;

    invoke-direct {v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;

    .line 558
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;

    invoke-direct {v0, p0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;-><init>(Lcom/ideaworks3d/marmalade/LoaderThread;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MediaPlayerManager:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;

    .line 560
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 562
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;

    .line 563
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    .line 566
    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FileRoot:Ljava/io/File;

    const-string v2, "makeramdirectory.txt"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 567
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 569
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 575
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 577
    const/4 v1, 0x5

    if-lt v0, v1, :cond_1

    .line 581
    :try_start_1
    const-string v0, "com.ideaworks3d.marmalade.MultiTouch"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 582
    const-string v1, "onTouchEvent"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Lcom/ideaworks3d/marmalade/LoaderThread;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Landroid/view/MotionEvent;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TouchEvent:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 590
    :cond_1
    :goto_1
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->initNative()V

    .line 591
    return-void

    .line 584
    :catch_0
    move-exception v0

    .line 586
    iput-object v5, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TouchEvent:Ljava/lang/reflect/Method;

    goto :goto_1

    .line 571
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method static synthetic access$1000(Lcom/ideaworks3d/marmalade/LoaderThread;)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->runOnOSTickNative()V

    return-void
.end method

.method static synthetic access$1100(Lcom/ideaworks3d/marmalade/LoaderThread;)Z
    .locals 1

    .prologue
    .line 50
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z

    return v0
.end method

.method static synthetic access$1200(Lcom/ideaworks3d/marmalade/LoaderThread;)Lcom/ideaworks3d/marmalade/LoaderActivity;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    return-object v0
.end method

.method static synthetic access$1300(Lcom/ideaworks3d/marmalade/LoaderThread;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic access$400(Lcom/ideaworks3d/marmalade/LoaderThread;I)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->audioStoppedNotify(I)V

    return-void
.end method

.method static synthetic access$500(Lcom/ideaworks3d/marmalade/LoaderThread;)Landroid/content/res/AssetManager;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Assets:Landroid/content/res/AssetManager;

    return-object v0
.end method

.method static synthetic access$602(Lcom/ideaworks3d/marmalade/LoaderThread;I)I
    .locals 0

    .prologue
    .line 50
    iput p1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevel:I

    return p1
.end method

.method static synthetic access$700(Lcom/ideaworks3d/marmalade/LoaderThread;)Z
    .locals 1

    .prologue
    .line 50
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ChargerConnected:Z

    return v0
.end method

.method static synthetic access$702(Lcom/ideaworks3d/marmalade/LoaderThread;Z)Z
    .locals 0

    .prologue
    .line 50
    iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ChargerConnected:Z

    return p1
.end method

.method static synthetic access$800(Lcom/ideaworks3d/marmalade/LoaderThread;Z)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->chargerStateChanged(Z)V

    return-void
.end method

.method static synthetic access$900(Lcom/ideaworks3d/marmalade/LoaderThread;Z)V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->networkCheckChanged(Z)V

    return-void
.end method

.method private native audioStoppedNotify(I)V
.end method

.method private native chargerStateChanged(Z)V
.end method

.method private doResume()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 995
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    .line 996
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->waitForView()V

    .line 997
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->glResume()V

    .line 998
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    .line 999
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;

    if-eqz v0, :cond_0

    .line 1000
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 1001
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;

    if-eqz v0, :cond_1

    .line 1003
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Orientation:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 1004
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1, v4}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 1006
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    if-eqz v0, :cond_2

    .line 1007
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationStart(Lcom/ideaworks3d/marmalade/LoaderActivity;)Z

    .line 1008
    :cond_2
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1011
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1013
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;

    .line 1015
    :cond_3
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z

    if-eqz v0, :cond_4

    .line 1017
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1020
    :cond_4
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->resume()V

    .line 1021
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MediaPlayerManager:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->doResume()V

    .line 1022
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_VideoIsPaused:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1023
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoResume()I

    .line 1024
    :cond_5
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

    if-eqz v0, :cond_6

    .line 1025
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/SoundRecord;->start(I)I

    .line 1026
    :cond_6
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ResumeInProgress:Ljava/lang/Boolean;

    .line 1027
    new-instance v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;

    sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->RESUME:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;-><init>(Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;)V

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->notifySuspendResumeListeners(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V

    .line 1029
    return-void
.end method

.method private doSuspend()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 954
    new-instance v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;

    sget-object v2, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SUSPEND:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    invoke-direct {v0, v2}, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;-><init>(Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;)V

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->notifySuspendResumeListeners(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V

    .line 955
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MediaPlayerManager:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->doPause()V

    .line 956
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoGetStatus()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_8

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_VideoIsPaused:Ljava/lang/Boolean;

    .line 957
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_VideoIsPaused:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 958
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->videoPause()I

    .line 959
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->pause()V

    .line 960
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

    if-eqz v0, :cond_1

    .line 961
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundRecord;->stop()I

    .line 962
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 965
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_2

    .line 967
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 969
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;

    .line 971
    :cond_3
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z

    if-eqz v0, :cond_4

    .line 974
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_4

    .line 976
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 979
    :cond_4
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    if-eqz v0, :cond_5

    .line 980
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationStop()Z

    .line 981
    :cond_5
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;

    if-eqz v0, :cond_6

    .line 982
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 983
    :cond_6
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;

    if-eqz v0, :cond_7

    .line 985
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 986
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Orientation:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 988
    :cond_7
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    .line 989
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->glPause()V

    .line 990
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    .line 991
    return-void

    :cond_8
    move v0, v1

    .line 956
    goto/16 :goto_0
.end method

.method private extendSplashOrientation(I)I
    .locals 2

    .prologue
    .line 701
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    .line 712
    :goto_0
    return p1

    .line 703
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 707
    :sswitch_0
    const/4 p1, 0x6

    goto :goto_0

    .line 710
    :sswitch_1
    const/4 p1, 0x7

    goto :goto_0

    .line 703
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x8 -> :sswitch_0
        0x9 -> :sswitch_1
    .end sparse-switch
.end method

.method private fixOrientation(I)V
    .locals 2

    .prologue
    .line 654
    invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->translateS3eOrientation(I)I

    move-result v0

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FixScreenOrientation:I

    .line 656
    const-string v0, "AndroidIgnoreResizeWhilePaused"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGet(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 658
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_IgnoreResizeWhilePaused:Z

    .line 660
    :cond_0
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->doFixOrientation()V

    .line 661
    return-void
.end method

.method private getCacheDir()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1169
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getCacheDir()Ljava/io/File;

    move-result-object v0

    .line 1170
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getInstance(Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/content/res/AssetManager;Ljava/io/File;Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/LoaderThread;
    .locals 2

    .prologue
    .line 611
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;

    if-nez v0, :cond_0

    .line 614
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-direct {v0, p0, p1, p2}, Lcom/ideaworks3d/marmalade/LoaderThread;-><init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/content/res/AssetManager;Ljava/io/File;)V

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;

    .line 615
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-virtual {v0, p3}, Lcom/ideaworks3d/marmalade/LoaderThread;->setView(Lcom/ideaworks3d/marmalade/LoaderView;)V

    .line 616
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->start()V

    .line 628
    :goto_0
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;

    return-object v0

    .line 621
    :cond_0
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;

    iget-object v1, v0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    monitor-enter v1

    .line 624
    :try_start_0
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;

    iput-object p0, v0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    .line 625
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;

    invoke-virtual {v0, p3}, Lcom/ideaworks3d/marmalade/LoaderThread;->setView(Lcom/ideaworks3d/marmalade/LoaderView;)V

    .line 626
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private getPrivateExternalDir()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 1143
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v2, "mounted"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1158
    :goto_0
    return-object v1

    .line 1146
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x8

    if-lt v0, v2, :cond_2

    .line 1150
    :try_start_0
    const-class v0, Landroid/content/Context;

    const-string v2, "getExternalFilesDir"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 1151
    iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/Object;

    const/4 v5, 0x0

    const/4 v0, 0x0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1158
    :goto_1
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v1, v0

    goto :goto_0

    .line 1153
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 1158
    goto :goto_2

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method private getRstDir()Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1162
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mounted"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1165
    :cond_0
    :goto_0
    return-object v0

    .line 1164
    :cond_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    .line 1165
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private getTelephonyId()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1299
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->telephonyManagerExists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1317
    :cond_0
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 1307
    :cond_1
    :try_start_0
    new-instance v0, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;-><init>(Landroid/app/Activity;)V

    .line 1308
    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    .line 1309
    if-eqz v0, :cond_0

    const-string v1, ""
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 1312
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private getTmpDir()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 1174
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x8

    if-lt v0, v2, :cond_1

    .line 1178
    :try_start_0
    const-class v0, Landroid/content/Context;

    const-string v2, "getExternalCacheDir"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 1179
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 1180
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1187
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    .line 1180
    goto :goto_0

    .line 1182
    :catch_0
    move-exception v0

    :cond_1
    move-object v0, v1

    .line 1187
    goto :goto_0
.end method

.method private glInit(I)V
    .locals 3

    .prologue
    .line 1052
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z

    if-eqz v0, :cond_0

    .line 1077
    :goto_0
    return-void

    .line 1057
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z

    .line 1058
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    .line 1059
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1061
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;

    monitor-enter v1

    .line 1063
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Handler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1066
    :try_start_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1071
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1072
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->waitForView()V

    .line 1074
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/LoaderView;->glInit(I)Z

    .line 1075
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    goto :goto_0

    .line 1071
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 1068
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private glReInit()V
    .locals 1

    .prologue
    .line 1117
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z

    if-nez v0, :cond_0

    .line 1126
    :goto_0
    return-void

    .line 1122
    :cond_0
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    .line 1123
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->glReInit()V

    .line 1124
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    goto :goto_0
.end method

.method private glTerm()V
    .locals 3

    .prologue
    .line 1081
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z

    if-nez v0, :cond_0

    .line 1113
    :goto_0
    return-void

    .line 1086
    :cond_0
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    .line 1087
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->glTerm()V

    .line 1088
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_UseGL:Z

    .line 1090
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1092
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;

    monitor-enter v1

    .line 1094
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Handler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1097
    :try_start_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_CreateView:Ljava/lang/Runnable;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1102
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1105
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1107
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->waitForView()V

    .line 1111
    :cond_2
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    goto :goto_0

    .line 1102
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 1099
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private native initNative()V
.end method

.method private native lowMemoryWarning()V
.end method

.method private native networkCheckChanged(Z)V
.end method

.method private native onAccelNative(FFF)V
.end method

.method private native onCompassNative(IFFF)V
.end method

.method private native resumeAppThreads()V
.end method

.method private native runNative(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method private native runOnOSThreadNative(Ljava/lang/Runnable;)V
.end method

.method private native runOnOSTickNative()V
.end method

.method private native setViewNative(Lcom/ideaworks3d/marmalade/LoaderView;)V
.end method

.method private native shutdownNative()V
.end method

.method private shuttingDown(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1207
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1236
    :cond_0
    :goto_0
    return-void

    .line 1212
    :cond_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Started:Ljava/lang/Boolean;

    .line 1213
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;

    .line 1214
    const/4 v0, 0x0

    sput-object v0, Lcom/ideaworks3d/marmalade/LoaderThread;->g_Singleton:Lcom/ideaworks3d/marmalade/LoaderThread;

    .line 1216
    if-eqz p1, :cond_2

    .line 1217
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->shutdownNative()V

    .line 1218
    :cond_2
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->smsStop()V

    .line 1219
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->accelStop()V

    .line 1220
    new-instance v0, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;

    sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SHUTDOWN:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;-><init>(Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;)V

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->notifySuspendResumeListeners(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V

    .line 1221
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1223
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1226
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_3

    .line 1228
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1230
    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevelReceiverRegistered:Ljava/lang/Boolean;

    .line 1232
    :cond_4
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->networkCheckStop()Z

    .line 1234
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->finish()V

    goto :goto_0
.end method

.method private native signalResume(Z)Z
.end method

.method private native signalSuspend(Z)Z
.end method

.method private native suspendAppThreads()V
.end method

.method private touchSetWait(I)V
    .locals 1

    .prologue
    .line 733
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_OnTouchWait:Ljava/lang/Integer;

    .line 734
    return-void
.end method

.method private translateS3eOrientation(I)I
    .locals 5

    .prologue
    const/4 v2, -0x1

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 632
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x9

    if-ge v3, v4, :cond_1

    move v3, v0

    .line 633
    :goto_0
    packed-switch p1, :pswitch_data_0

    move v0, v2

    .line 649
    :cond_0
    :goto_1
    :pswitch_0
    return v0

    :cond_1
    move v3, v1

    .line 632
    goto :goto_0

    :pswitch_1
    move v0, v2

    .line 636
    goto :goto_1

    .line 638
    :pswitch_2
    if-nez v3, :cond_0

    const/4 v0, 0x7

    goto :goto_1

    .line 641
    :pswitch_3
    if-eqz v3, :cond_2

    move v0, v1

    goto :goto_1

    :cond_2
    const/4 v0, 0x6

    goto :goto_1

    :pswitch_4
    move v0, v1

    .line 646
    goto :goto_1

    .line 633
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method private translateSplashOrientation(I)I
    .locals 1

    .prologue
    .line 716
    sparse-switch p1, :sswitch_data_0

    .line 722
    :cond_0
    :goto_0
    return p1

    .line 720
    :sswitch_0
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_splashFinished:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_StartScreenOrientation:I

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->extendSplashOrientation(I)I

    move-result p1

    goto :goto_0

    .line 716
    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0xa -> :sswitch_0
    .end sparse-switch
.end method

.method private waitForView()V
    .locals 2

    .prologue
    .line 1034
    :goto_0
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    monitor-enter v1

    .line 1036
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1038
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->waitForSurface()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1041
    monitor-exit v1

    goto :goto_0

    .line 1046
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1044
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->setViewNative(Lcom/ideaworks3d/marmalade/LoaderView;)V

    .line 1045
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1048
    return-void
.end method


# virtual methods
.method public accelStart()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 799
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;

    if-nez v0, :cond_0

    .line 801
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    invoke-virtual {v0, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;

    .line 802
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 804
    :cond_0
    return-void
.end method

.method public accelStop()V
    .locals 2

    .prologue
    .line 807
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;

    if-eqz v0, :cond_0

    .line 809
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 810
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Accelerometer:Landroid/hardware/Sensor;

    .line 812
    :cond_0
    return-void
.end method

.method public acquireMulticastLock()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 1508
    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 1509
    const/4 v2, 0x3

    if-gt v0, v2, :cond_0

    move v0, v1

    .line 1531
    :goto_0
    return v0

    .line 1511
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;

    if-nez v0, :cond_1

    .line 1513
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v2, "wifi"

    invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 1518
    :try_start_0
    new-instance v2, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;

    invoke-direct {v2, p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;-><init>(Lcom/ideaworks3d/marmalade/LoaderThread;Landroid/net/wifi/WifiManager;)V

    iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1526
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;

    if-eqz v0, :cond_2

    .line 1528
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->acquire()V

    .line 1529
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->isHeld()Z

    move-result v0

    goto :goto_0

    .line 1520
    :catch_0
    move-exception v0

    move v0, v1

    .line 1523
    goto :goto_0

    :cond_2
    move v0, v1

    .line 1531
    goto :goto_0
.end method

.method public audioStopAll()V
    .locals 1

    .prologue
    .line 453
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MediaPlayerManager:Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MediaPlayerManager;->audioStopAll()V

    .line 454
    return-void
.end method

.method public chargerIsConnected()Z
    .locals 1

    .prologue
    .line 949
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ChargerConnected:Z

    return v0
.end method

.method public clipboardGet()Ljava/lang/String;
    .locals 2

    .prologue
    .line 896
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/ClipboardManager;

    .line 897
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/text/ClipboardManager;->hasText()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 899
    invoke-virtual {v0}, Landroid/text/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 902
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public clipboardSet(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 906
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/ClipboardManager;

    .line 907
    if-eqz v0, :cond_0

    .line 908
    invoke-virtual {v0, p1}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 909
    :cond_0
    return-void
.end method

.method public compassStart()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 835
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;

    if-nez v0, :cond_0

    .line 837
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;

    .line 838
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Orientation:Landroid/hardware/Sensor;

    .line 839
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Orientation:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 840
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 842
    :cond_0
    return-void
.end method

.method public compassStop()V
    .locals 2

    .prologue
    .line 845
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;

    if-eqz v0, :cond_0

    .line 847
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 848
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Orientation:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 849
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Compass:Landroid/hardware/Sensor;

    .line 851
    :cond_0
    return-void
.end method

.method public doFixOrientation()V
    .locals 2

    .prologue
    .line 726
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FixScreenOrientation:I

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->translateSplashOrientation(I)I

    move-result v0

    .line 728
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v1, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->setRequestedOrientation(I)V

    .line 729
    return-void
.end method

.method public getBatteryLevel()I
    .locals 1

    .prologue
    .line 934
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_BatteryLevel:I

    return v0
.end method

.method public getDeviceDpi(Z)I
    .locals 4

    .prologue
    .line 938
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 939
    if-eqz p1, :cond_0

    .line 940
    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 945
    :goto_0
    return v0

    .line 941
    :cond_0
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    iget v2, v0, Landroid/util/DisplayMetrics;->xdpi:F

    div-float/2addr v1, v2

    .line 942
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v2, v2

    iget v3, v0, Landroid/util/DisplayMetrics;->ydpi:F

    div-float/2addr v2, v3

    .line 943
    mul-float/2addr v1, v1

    mul-float/2addr v2, v2

    add-float/2addr v1, v2

    float-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v1, v2

    .line 944
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    mul-int/2addr v2, v3

    iget v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int/2addr v0, v3

    add-int/2addr v0, v2

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v0, v2

    .line 945
    div-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0
.end method

.method public getDeviceIMSI()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1357
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->telephonyManagerExists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1373
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 1365
    :cond_0
    :try_start_0
    new-instance v0, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;-><init>(Landroid/app/Activity;)V

    .line 1366
    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;->getSubscriberId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    .line 1368
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 1321
    const-string v2, "AndroidTryAndroidIdFirst"

    invoke-static {v2, v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGet(Ljava/lang/String;I)I

    move-result v2

    if-eqz v2, :cond_1

    move v2, v0

    .line 1323
    :goto_0
    if-nez v2, :cond_2

    .line 1325
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->getTelephonyId()Ljava/lang/String;

    move-result-object v0

    .line 1326
    if-eqz v0, :cond_2

    const-string v3, ""

    if-eq v0, v3, :cond_2

    .line 1353
    :cond_0
    :goto_1
    return-object v0

    .line 1321
    :cond_1
    const/4 v0, 0x0

    move v2, v0

    goto :goto_0

    .line 1329
    :cond_2
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v3, "android_id"

    invoke-static {v0, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1330
    if-eqz v0, :cond_3

    const-string v3, "9774d56d682e549c"

    if-ne v0, v3, :cond_0

    .line 1334
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v0, v3, :cond_4

    .line 1338
    :try_start_0
    const-class v0, Landroid/os/Build;

    const-string v3, "SERIAL"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1339
    if-nez v0, :cond_0

    .line 1347
    :cond_4
    :goto_2
    if-eqz v2, :cond_5

    .line 1349
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->getTelephonyId()Ljava/lang/String;

    move-result-object v0

    .line 1350
    if-eqz v0, :cond_5

    const-string v2, ""

    if-ne v0, v2, :cond_0

    :cond_5
    move-object v0, v1

    .line 1353
    goto :goto_1

    .line 1342
    :catch_0
    move-exception v0

    goto :goto_2
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1278
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceNumber()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1377
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->telephonyManagerExists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1393
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 1385
    :cond_0
    :try_start_0
    new-instance v0, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-direct {v0, v1}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;-><init>(Landroid/app/Activity;)V

    .line 1386
    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/TelephonyManagerProxy;->getLine1Number()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    .line 1388
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public getNetworkSubType()I
    .locals 2

    .prologue
    .line 1499
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 1500
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 1501
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1502
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    .line 1504
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public getNetworkType()I
    .locals 2

    .prologue
    .line 1490
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 1491
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 1492
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1493
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    .line 1495
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public getOrientation()I
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 664
    .line 665
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v2, "window"

    invoke-virtual {v0, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 666
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 667
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_getRotation:Ljava/lang/reflect/Method;

    if-nez v2, :cond_0

    .line 669
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 672
    :try_start_0
    const-string v3, "getRotation"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    iput-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_getRotation:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 685
    :cond_0
    :goto_0
    :try_start_1
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_getRotation:Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result v0

    .line 691
    :goto_1
    return v0

    .line 674
    :catch_0
    move-exception v3

    .line 678
    :try_start_2
    const-string v3, "getOrientation"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_getRotation:Ljava/lang/reflect/Method;
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 680
    :catch_1
    move-exception v2

    goto :goto_0

    .line 687
    :catch_2
    move-exception v0

    move v0, v1

    goto :goto_1
.end method

.method public getSilentMode()Z
    .locals 2

    .prologue
    .line 1397
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    .line 1398
    invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1399
    const/4 v0, 0x0

    .line 1400
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getStarted()Z
    .locals 1

    .prologue
    .line 544
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Started:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public hasMultitouch()Z
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 1191
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 1194
    :try_start_0
    const-class v2, Landroid/content/pm/PackageManager;

    const-string v3, "hasSystemFeature"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 1195
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "android.hardware.touchscreen.multitouch"

    aput-object v5, v3, v4

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 1202
    :goto_0
    return v0

    .line 1199
    :catch_0
    move-exception v0

    move v0, v1

    .line 1202
    goto :goto_0
.end method

.method public launchBrowser(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 1406
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 1407
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1408
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1409
    const-string v0, "vfstore"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1411
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1413
    :cond_0
    const/high16 v0, 0x14200000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1414
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1415
    const/4 v0, 0x1

    .line 1418
    :goto_0
    return v0

    .line 1416
    :catch_0
    move-exception v0

    .line 1418
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public locationGpsData()Z
    .locals 1

    .prologue
    .line 1271
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    if-eqz v0, :cond_0

    .line 1272
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationGpsData()Z

    move-result v0

    .line 1274
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public locationStart()Z
    .locals 2

    .prologue
    .line 1256
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    if-eqz v0, :cond_0

    .line 1257
    const/4 v0, 0x0

    .line 1259
    :goto_0
    return v0

    .line 1258
    :cond_0
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-direct {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    .line 1259
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationStart(Lcom/ideaworks3d/marmalade/LoaderActivity;)Z

    move-result v0

    goto :goto_0
.end method

.method public locationStop()Z
    .locals 2

    .prologue
    .line 1263
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    if-nez v0, :cond_0

    .line 1264
    const/4 v0, 0x0

    .line 1267
    :goto_0
    return v0

    .line 1265
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationStop()Z

    move-result v0

    .line 1266
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Location:Lcom/ideaworks3d/marmalade/LoaderLocation;

    goto :goto_0
.end method

.method public networkCheckStart()Z
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 912
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z

    if-eqz v0, :cond_0

    .line 918
    :goto_0
    return v4

    .line 914
    :cond_0
    iput-boolean v4, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z

    .line 916
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto :goto_0
.end method

.method public networkCheckStop()Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 922
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z

    if-nez v0, :cond_1

    .line 930
    :cond_0
    :goto_0
    return v2

    .line 924
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckEnabled:Z

    .line 926
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 928
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_NetworkCheckReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    goto :goto_0
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .prologue
    .line 784
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 1239
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->shuttingDown(Z)V

    .line 1240
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->interrupt()V

    .line 1243
    :try_start_0
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1249
    :goto_0
    return-void

    .line 1245
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onLowMemory()V
    .locals 0

    .prologue
    .line 1252
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->lowMemoryWarning()V

    .line 1253
    return-void
.end method

.method public native onMotionEvent(IIII)V
.end method

.method public onPause()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 763
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Terminating:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 781
    :cond_0
    :goto_0
    return-void

    .line 768
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Started:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 773
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 778
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;

    .line 779
    invoke-direct {p0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->signalSuspend(Z)Z

    goto :goto_0
.end method

.method public onResume()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 738
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;

    .line 739
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ResumeInProgress:Ljava/lang/Boolean;

    .line 740
    invoke-direct {p0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->signalResume(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 742
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ResumeInProgress:Ljava/lang/Boolean;

    .line 745
    :cond_0
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 787
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    .line 788
    if-ne v0, v3, :cond_1

    .line 789
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v0, v0, v4

    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v1, v1, v3

    iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v2, v2, v5

    invoke-direct {p0, v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread;->onAccelNative(FFF)V

    .line 796
    :cond_0
    :goto_0
    return-void

    .line 790
    :cond_1
    if-ne v0, v5, :cond_2

    .line 791
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v0, v0, v4

    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v1, v1, v3

    iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v2, v2, v5

    invoke-direct {p0, v4, v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread;->onCompassNative(IFFF)V

    goto :goto_0

    .line 792
    :cond_2
    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 793
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v0, v0, v4

    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v1, v1, v3

    iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v2, v2, v5

    invoke-direct {p0, v3, v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread;->onCompassNative(IFFF)V

    goto :goto_0
.end method

.method public onSplashFinished()V
    .locals 1

    .prologue
    .line 696
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_splashFinished:Z

    .line 697
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->doFixOrientation()V

    .line 698
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1443
    iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TouchEvent:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_1

    .line 1446
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TouchEvent:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    const/4 v4, 0x1

    aput-object p1, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 1475
    :goto_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_OnTouchWait:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    .line 1477
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_OnTouchWait:Ljava/lang/Integer;

    monitor-enter v2

    .line 1480
    :try_start_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_OnTouchWait:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_OnTouchWait:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {v0, v4, v5}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1484
    :goto_1
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1486
    :cond_0
    return v1

    .line 1454
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    .line 1455
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    .line 1456
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    and-int/lit16 v5, v5, 0xff

    .line 1457
    packed-switch v5, :pswitch_data_0

    move v0, v2

    .line 1472
    :goto_2
    :pswitch_0
    add-int/lit8 v0, v0, 0x3

    .line 1473
    invoke-virtual {p0, v2, v0, v3, v4}, Lcom/ideaworks3d/marmalade/LoaderThread;->onMotionEvent(IIII)V

    goto :goto_0

    :pswitch_1
    move v0, v1

    .line 1461
    goto :goto_2

    .line 1466
    :pswitch_2
    const/4 v0, 0x3

    .line 1467
    goto :goto_2

    .line 1484
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 1481
    :catch_0
    move-exception v0

    goto :goto_1

    .line 1447
    :catch_1
    move-exception v0

    goto :goto_0

    .line 1457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public recordAvailable()I
    .locals 1

    .prologue
    .line 871
    invoke-static {}, Lcom/ideaworks3d/marmalade/SoundRecord;->available()I

    move-result v0

    return v0
.end method

.method public recordStart(I)I
    .locals 1

    .prologue
    .line 876
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

    if-nez v0, :cond_0

    .line 878
    new-instance v0, Lcom/ideaworks3d/marmalade/SoundRecord;

    invoke-direct {v0}, Lcom/ideaworks3d/marmalade/SoundRecord;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

    .line 879
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

    invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/SoundRecord;->start(I)I

    move-result v0

    .line 881
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public recordStop()I
    .locals 2

    .prologue
    .line 886
    const/4 v0, 0x1

    .line 887
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

    if-eqz v1, :cond_0

    .line 889
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundRecord;->stop()I

    move-result v0

    .line 890
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundRecord:Lcom/ideaworks3d/marmalade/SoundRecord;

    .line 892
    :cond_0
    return v0
.end method

.method public releaseMulticastLock()Z
    .locals 1

    .prologue
    .line 1535
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;

    if-eqz v0, :cond_0

    .line 1537
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;->release()V

    .line 1538
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_MulticastLock:Lcom/ideaworks3d/marmalade/LoaderThread$MulticastLockFacade;

    .line 1539
    const/4 v0, 0x1

    .line 1541
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public resumeAfterSurfaceChange()V
    .locals 1

    .prologue
    .line 89
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_DidSuspendForSurfaceChange:Z

    if-eqz v0, :cond_0

    .line 92
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_DidSuspendForSurfaceChange:Z

    .line 93
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->resumeAppThreads()V

    .line 99
    :cond_0
    return-void
.end method

.method public run()V
    .locals 3

    .prologue
    .line 1129
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->waitForView()V

    .line 1130
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Started:Ljava/lang/Boolean;

    .line 1131
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FileRoot:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/lib"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1132
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x9

    if-lt v1, v2, :cond_0

    .line 1134
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 1135
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 1137
    :cond_0
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FileRoot:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getPackageResourcePath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->runNative(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1139
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->shuttingDown(Z)V

    .line 1140
    return-void
.end method

.method public runOnOSSignal()V
    .locals 2

    .prologue
    .line 758
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_RunOnOSThread:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 759
    return-void
.end method

.method public runOnOSThread(Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 754
    invoke-direct {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderThread;->runOnOSThreadNative(Ljava/lang/Runnable;)V

    .line 755
    return-void
.end method

.method public runRunnable(Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 749
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 751
    return-void
.end method

.method public sendEmail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 1426
    :try_start_0
    const-string v0, ",\\s*?"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 1427
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1428
    const-string v2, "android.intent.action.SEND"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1429
    const-string v2, "text/xml"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1430
    const-string v2, "android.intent.extra.EMAIL"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 1431
    const-string v0, "android.intent.extra.SUBJECT"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1432
    const-string v0, "android.intent.extra.TEXT"

    invoke-virtual {v1, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1433
    const/high16 v0, 0x14200000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1434
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1435
    const/4 v0, 0x1

    .line 1438
    :goto_0
    return v0

    .line 1436
    :catch_0
    move-exception v0

    .line 1438
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setView(Lcom/ideaworks3d/marmalade/LoaderView;)V
    .locals 2

    .prologue
    .line 594
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    if-eqz v0, :cond_1

    .line 596
    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    monitor-enter v1

    .line 598
    :try_start_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    if-eqz v0, :cond_0

    .line 600
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 602
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 604
    :cond_1
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    .line 605
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->getCurrentOrientation()I

    move-result v0

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_StartScreenOrientation:I

    .line 606
    invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->doFixOrientation()V

    .line 607
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->setViewNative(Lcom/ideaworks3d/marmalade/LoaderView;)V

    .line 608
    return-void

    .line 602
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public skipSurfaceChange()Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 104
    iget-boolean v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_IgnoreResizeWhilePaused:Z

    if-eqz v2, :cond_1

    .line 106
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_FixScreenOrientation:I

    const/4 v3, 0x4

    if-eq v2, v3, :cond_0

    .line 108
    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SkipNextChange:Z

    .line 117
    :goto_0
    return v0

    .line 111
    :cond_0
    iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Paused:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    iget-boolean v2, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SkipNextChange:Z

    if-eqz v2, :cond_1

    .line 113
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SkipNextChange:Z

    goto :goto_0

    :cond_1
    move v0, v1

    .line 117
    goto :goto_0
.end method

.method public smsStart()Z
    .locals 4

    .prologue
    .line 815
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;

    if-nez v0, :cond_0

    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    .line 818
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;

    invoke-direct {v0}, Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;-><init>()V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;

    .line 819
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.provider.Telephony.SMS_RECEIVED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 821
    const/4 v0, 0x1

    .line 823
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public smsStop()V
    .locals 2

    .prologue
    .line 827
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;

    if-eqz v0, :cond_0

    .line 829
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_Loader:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 830
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_LoaderSMSReceiver:Lcom/ideaworks3d/marmalade/LoaderSMSReceiver;

    .line 832
    :cond_0
    return-void
.end method

.method public soundInit(IZI)I
    .locals 1

    .prologue
    .line 855
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;

    invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/SoundPlayer;->init(IZI)I

    move-result v0

    return v0
.end method

.method public soundSetVolume(I)V
    .locals 1

    .prologue
    .line 458
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;

    invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/SoundPlayer;->setVolume(I)V

    .line 459
    return-void
.end method

.method public soundStart()V
    .locals 1

    .prologue
    .line 860
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->start()V

    .line 862
    return-void
.end method

.method public soundStop()V
    .locals 1

    .prologue
    .line 866
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_SoundPlayer:Lcom/ideaworks3d/marmalade/SoundPlayer;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/SoundPlayer;->stop()V

    .line 868
    return-void
.end method

.method public suspendForSurfaceChange()V
    .locals 1

    .prologue
    .line 76
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_AppDoingInitTerm:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_ResumeInProgress:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderThread;->suspendAppThreads()V

    .line 80
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_DidSuspendForSurfaceChange:Z

    .line 86
    :cond_0
    return-void
.end method

.method public telephonyManagerExists()Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 1282
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TelephonyManagerExistsKnown:Z

    if-eqz v0, :cond_0

    .line 1283
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TelephonyManagerExists:Z

    .line 1295
    :goto_0
    return v0

    .line 1287
    :cond_0
    :try_start_0
    const-string v0, "com.ideaworks3d.marmalade.TelephonyManagerProxy"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    .line 1293
    :goto_1
    iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TelephonyManagerExistsKnown:Z

    .line 1294
    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderThread;->m_TelephonyManagerExists:Z

    goto :goto_0

    .line 1289
    :catch_0
    move-exception v0

    .line 1291
    const/4 v0, 0x0

    goto :goto_1
.end method
