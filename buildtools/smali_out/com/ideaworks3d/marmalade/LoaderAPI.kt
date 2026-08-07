package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderAPI.java.
// 2 fields, 25 methods.

open class LoaderAPI {
    public constructor()

    companion object {
    @JvmField public val S3E_RESULT_ERROR: Int = 0x1
    @JvmField public val S3E_RESULT_SUCCESS: Int = 0

    public @JvmStatic fun addActivityResultListener(p0: com.ideaworks3d.marmalade.event.ActivityResultListener) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->addActivityResultListener(Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)V
    //         return-void
    */

    public @JvmStatic fun addRequestPermissionsResultListener(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultListener) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->addRequestPermissionsResultListener(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)V
    //         return-void
    */

    public @JvmStatic fun addSuspendResumeListener(p0: com.ideaworks3d.marmalade.SuspendResumeListener) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeListener;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->addSuspendResumeListener(Lcom/ideaworks3d/marmalade/SuspendResumeListener;)V
    //         return-void
    */

    public @JvmStatic fun getActivity(): com.ideaworks3d.marmalade.LoaderActivity { return TODO("body: ()Lcom/ideaworks3d/marmalade/LoaderActivity;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         return-object v0
    */

    public @JvmStatic fun getFrameLayout(): android.widget.FrameLayout { return TODO("body: ()Landroid/widget/FrameLayout;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_FrameLayout:Landroid/widget/FrameLayout;
    //         return-object v0
    */

    public @JvmStatic fun getListenerManager(): com.ideaworks3d.marmalade.event.ListenerManager { return TODO("body: ()Lcom/ideaworks3d/marmalade/event/ListenerManager;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ListenerManager:Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         if-nez v0, :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         new-instance v1, Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         invoke-direct {v1}, Lcom/ideaworks3d/marmalade/event/ListenerManager;-><init>()V
    //         iput-object v1, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ListenerManager:Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         :cond_0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ListenerManager:Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         return-object v0
    */

    public @JvmStatic fun getMainView(): android.view.View { return TODO("body: ()Landroid/view/View;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         return-object v0
    */

    public @JvmStatic fun getStackTrace(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         :try_start_0
    //         new-instance v0, Ljava/lang/Exception;
    //         const-string v1, "Tracer"
    //         invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/io/StringWriter;
    //         invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V
    //         new-instance v2, Ljava/io/PrintWriter;
    //         invoke-direct {v2, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
    //         invoke-virtual {v0, v2}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V
    //         invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getStackTrace(p0: Throwable): String { return TODO("body: (Ljava/lang/Throwable;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/io/StringWriter;
    //         invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V
    //         new-instance v1, Ljava/io/PrintWriter;
    //         invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
    //         invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
    //         invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun notifyActivityResultListeners(p0: com.ideaworks3d.marmalade.event.ActivityResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->notifyActivityResultListeners(Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V
    //         return-void
    */

    public @JvmStatic fun notifyRequestPermissionsResultListeners(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->notifyRequestPermissionsResultListeners(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V
    //         return-void
    */

    public @JvmStatic fun notifySuspendResumeListeners(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->notifySuspendResumeListeners(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V
    //         return-void
    */

    public @JvmStatic fun popKeyListener(): android.view.View.OnKeyListener { return TODO("body: ()Landroid/view/View$OnKeyListener;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->popKeyListener()Landroid/view/View$OnKeyListener;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun pushKeyListener(p0: android.view.View.OnKeyListener) { /* TODO(body): (Landroid/view/View$OnKeyListener;)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->pushKeyListener(Landroid/view/View$OnKeyListener;)V
    //         return-void
    */

    public @JvmStatic fun removeActivityResultListener(p0: com.ideaworks3d.marmalade.event.ActivityResultListener): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)Z") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->removeActivityResultListener(Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun removeRequestPermissionsResultListener(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultListener): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)Z") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->removeRequestPermissionsResultListener(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun removeSuspendResumeListener(p0: com.ideaworks3d.marmalade.SuspendResumeListener): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/SuspendResumeListener;)Z") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Lcom/ideaworks3d/marmalade/event/ListenerManager;->removeSuspendResumeListener(Lcom/ideaworks3d/marmalade/SuspendResumeListener;)Z
    //         move-result v0
    //         return v0
    */

    public external @JvmStatic fun s3eConfigGet(p0: String, p1: Int): Int

    public external @JvmStatic fun s3eConfigGetInt(p0: String, p1: String, p2: IntArray): Int

    public external @JvmStatic fun s3eConfigGetString(p0: String, p1: String, p2: Array<String>): Int

    public external @JvmStatic fun s3eDebugTraceLine(p0: String)

    public external @JvmStatic fun s3eDeviceYield(p0: Int)

    public @JvmStatic fun trace(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         if-eqz v0, :cond_0
    //         invoke-static {p0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eDebugTraceLine(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "MARMALADE"
    //         invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public @JvmStatic fun traceChan(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ": "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         return-void
    */

    }
}
