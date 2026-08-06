.class public Lcom/ideaworks3d/marmalade/LoaderKeyboard;
.super Ljava/lang/Object;
.source "LoaderKeyboard.java"

# interfaces
.implements Lcom/ideaworks3d/marmalade/SuspendResumeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;
    }
.end annotation


# instance fields
.field private m_Receiver:Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;

.field private m_View:Lcom/ideaworks3d/marmalade/LoaderView;

.field private m_onScreenKeyboard:Z

.field private m_pausing:Z


# direct methods
.method public constructor <init>(Lcom/ideaworks3d/marmalade/LoaderView;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z

    .line 14
    iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_pausing:Z

    .line 57
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    .line 58
    new-instance v0, Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    iget-object v1, v1, Lcom/ideaworks3d/marmalade/LoaderView;->m_Handler:Landroid/os/Handler;

    invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;-><init>(Lcom/ideaworks3d/marmalade/LoaderKeyboard;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_Receiver:Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;

    .line 59
    invoke-static {p0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->addSuspendResumeListener(Lcom/ideaworks3d/marmalade/SuspendResumeListener;)V

    .line 60
    return-void
.end method

.method static synthetic access$000(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Z
    .locals 1

    .prologue
    .line 11
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z

    return v0
.end method

.method static synthetic access$100(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Z
    .locals 1

    .prologue
    .line 11
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_pausing:Z

    return v0
.end method

.method static synthetic access$200(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderView;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    return-object v0
.end method

.method static synthetic access$300(Lcom/ideaworks3d/marmalade/LoaderKeyboard;)Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_Receiver:Lcom/ideaworks3d/marmalade/LoaderKeyboard$SoftInputReceiver;

    return-object v0
.end method

.method private native onKeyEventNative(III)Z
.end method

.method private native setCharInputEnabledNative(Z)V
.end method


# virtual methods
.method public getKeyboardInfo()I
    .locals 5

    .prologue
    const/4 v4, 0x2

    .line 135
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    .line 136
    const/4 v0, 0x0

    .line 137
    iget v1, v2, Landroid/content/res/Configuration;->keyboard:I

    if-ne v1, v4, :cond_0

    iget v1, v2, Landroid/content/res/Configuration;->hardKeyboardHidden:I

    if-eq v1, v4, :cond_0

    .line 139
    const/4 v0, 0x1

    .line 140
    :cond_0
    iget v1, v2, Landroid/content/res/Configuration;->keyboard:I

    const/4 v3, 0x3

    if-ne v1, v3, :cond_4

    iget v1, v2, Landroid/content/res/Configuration;->hardKeyboardHidden:I

    if-eq v1, v4, :cond_4

    .line 142
    or-int/lit8 v0, v0, 0x2

    move v1, v0

    .line 143
    :goto_0
    iget v0, v2, Landroid/content/res/Configuration;->navigation:I

    if-lt v0, v4, :cond_1

    .line 147
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v3, "navigationHidden"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 148
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-ne v0, v4, :cond_2

    .line 156
    :cond_1
    :goto_1
    return v1

    .line 151
    :catch_0
    move-exception v0

    .line 152
    :cond_2
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v3, "Zeus"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, v2, Landroid/content/res/Configuration;->hardKeyboardHidden:I

    if-eq v0, v4, :cond_1

    .line 154
    :cond_3
    or-int/lit8 v1, v1, 0x4

    goto :goto_1

    :cond_4
    move v1, v0

    goto :goto_0
.end method

.method public getShowOnScreenKeyboard()Z
    .locals 1

    .prologue
    .line 131
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z

    return v0
.end method

.method public hardKeyboardConfigurationChanged(Z)V
    .locals 1

    .prologue
    .line 94
    if-nez p1, :cond_0

    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z

    if-eqz v0, :cond_0

    .line 96
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->setShowOnScreenKeyboard(Z)V

    .line 98
    :cond_0
    return-void
.end method

.method public onKeyEvent(IILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 78
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v0

    .line 79
    invoke-direct {p0, p1, v0, p2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->onKeyEventNative(III)Z

    move-result v0

    return v0
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 83
    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z

    if-eqz v1, :cond_0

    .line 86
    invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->setCharInputEnabledNative(Z)V

    .line 87
    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->setShowOnScreenKeyboard(Z)V

    .line 88
    const/4 v0, 0x1

    .line 90
    :cond_0
    return v0
.end method

.method public onSuspendResumeEvent(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 63
    iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SUSPEND:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z

    if-eqz v0, :cond_0

    .line 65
    iput-boolean v3, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_pausing:Z

    .line 66
    invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->setShowOnScreenKeyboard(Z)V

    .line 67
    iput-boolean v3, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z

    .line 69
    :cond_0
    iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->RESUME:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;

    if-ne v0, v1, :cond_1

    .line 71
    iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_pausing:Z

    .line 72
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z

    if-eqz v0, :cond_1

    .line 73
    iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z

    invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->setShowOnScreenKeyboard(Z)V

    .line 75
    :cond_1
    return-void
.end method

.method public setShowOnScreenKeyboard(Z)V
    .locals 3

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z

    .line 102
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 104
    sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;

    move-result-object v1

    new-instance v2, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;-><init>(Lcom/ideaworks3d/marmalade/LoaderKeyboard;ZLandroid/view/inputmethod/InputMethodManager;)V

    invoke-virtual {v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread;->runOnOSThread(Ljava/lang/Runnable;)V

    .line 128
    return-void
.end method
