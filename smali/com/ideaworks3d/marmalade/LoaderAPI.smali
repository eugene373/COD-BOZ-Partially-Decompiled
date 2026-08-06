.class public Lcom/ideaworks3d/marmalade/LoaderAPI;
.super Ljava/lang/Object;
.source "LoaderAPI.java"


# static fields
.field public static final S3E_RESULT_ERROR:I = 0x1

.field public static final S3E_RESULT_SUCCESS:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addActivityResultListener(Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)V
    .locals 1

    .prologue
    .line 81
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->addActivityResultListener(Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)V

    .line 82
    return-void
.end method

.method public static addRequestPermissionsResultListener(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)V
    .locals 1

    .prologue
    .line 93
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->addRequestPermissionsResultListener(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)V

    .line 94
    return-void
.end method

.method public static addSuspendResumeListener(Lcom/ideaworks3d/marmalade/SuspendResumeListener;)V
    .locals 1

    .prologue
    .line 105
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->addSuspendResumeListener(Lcom/ideaworks3d/marmalade/SuspendResumeListener;)V

    .line 106
    return-void
.end method

.method public static getActivity()Lcom/ideaworks3d/marmalade/LoaderActivity;
    .locals 1

    .prologue
    .line 61
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    return-object v0
.end method

.method public static getFrameLayout()Landroid/widget/FrameLayout;
    .locals 1

    .prologue
    .line 69
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_FrameLayout:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public static getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    .locals 2

    .prologue
    .line 73
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ListenerManager:Lcom/ideaworks3d/marmalade/event/ListenerManager;

    if-nez v0, :cond_0

    .line 75
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    new-instance v1, Lcom/ideaworks3d/marmalade/event/ListenerManager;

    invoke-direct {v1}, Lcom/ideaworks3d/marmalade/event/ListenerManager;-><init>()V

    iput-object v1, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ListenerManager:Lcom/ideaworks3d/marmalade/event/ListenerManager;

    .line 77
    :cond_0
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ListenerManager:Lcom/ideaworks3d/marmalade/event/ListenerManager;

    return-object v0
.end method

.method public static getMainView()Landroid/view/View;
    .locals 1

    .prologue
    .line 65
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;

    return-object v0
.end method

.method public static getStackTrace()Ljava/lang/String;
    .locals 3

    .prologue
    .line 49
    :try_start_0
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Tracer"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :catch_0
    move-exception v0

    .line 53
    new-instance v1, Ljava/io/StringWriter;

    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    .line 54
    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 40
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 41
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 42
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static notifyActivityResultListeners(Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V
    .locals 1

    .prologue
    .line 89
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->notifyActivityResultListeners(Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V

    .line 90
    return-void
.end method

.method public static notifyRequestPermissionsResultListeners(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V
    .locals 1

    .prologue
    .line 101
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->notifyRequestPermissionsResultListeners(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V

    .line 102
    return-void
.end method

.method public static notifySuspendResumeListeners(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V
    .locals 1

    .prologue
    .line 113
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->notifySuspendResumeListeners(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V

    .line 114
    return-void
.end method

.method public static popKeyListener()Landroid/view/View$OnKeyListener;
    .locals 1

    .prologue
    .line 121
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->popKeyListener()Landroid/view/View$OnKeyListener;

    move-result-object v0

    return-object v0
.end method

.method public static pushKeyListener(Landroid/view/View$OnKeyListener;)V
    .locals 1

    .prologue
    .line 117
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->pushKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 118
    return-void
.end method

.method public static removeActivityResultListener(Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)Z
    .locals 1

    .prologue
    .line 85
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->removeActivityResultListener(Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)Z

    move-result v0

    return v0
.end method

.method public static removeRequestPermissionsResultListener(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)Z
    .locals 1

    .prologue
    .line 97
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->removeRequestPermissionsResultListener(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)Z

    move-result v0

    return v0
.end method

.method public static removeSuspendResumeListener(Lcom/ideaworks3d/marmalade/SuspendResumeListener;)Z
    .locals 1

    .prologue
    .line 109
    invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->removeSuspendResumeListener(Lcom/ideaworks3d/marmalade/SuspendResumeListener;)Z

    move-result v0

    return v0
.end method

.method public static native s3eConfigGet(Ljava/lang/String;I)I
.end method

.method public static native s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I
.end method

.method public static native s3eConfigGetString(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
.end method

.method public static native s3eDebugTraceLine(Ljava/lang/String;)V
.end method

.method public static native s3eDeviceYield(I)V
.end method

.method public static trace(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;

    if-eqz v0, :cond_0

    .line 31
    invoke-static {p0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eDebugTraceLine(Ljava/lang/String;)V

    .line 37
    :goto_0
    return-void

    .line 35
    :cond_0
    const-string v0, "MARMALADE"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static traceChan(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V

    .line 26
    return-void
.end method
