package com.ideaworks3d.marmalade.event

// Auto-emitted from smali source: ListenerManager.java.
// 4 fields, 12 methods.

open class ListenerManager {
    private var m_ActivityResultListeners: com.ideaworks3d.marmalade.event.ActivityResultListenerList
    private var m_KeyListeners: java.util.Stack
    private var m_RequestPermissionsResultListeners: com.ideaworks3d.marmalade.event.RequestPermissionsResultListenerList
    private var m_SuspendResumeListeners: com.ideaworks3d.marmalade.event.SuspendResumeListenerList

    public constructor()

    public fun addActivityResultListener(p0: com.ideaworks3d.marmalade.event.ActivityResultListener) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerManager;->m_ActivityResultListeners:Lcom/ideaworks3d/marmalade/event/ActivityResultListenerList;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/event/ActivityResultListenerList;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun addRequestPermissionsResultListener(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultListener) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerManager;->m_RequestPermissionsResultListeners:Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListenerList;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListenerList;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun addSuspendResumeListener(p0: com.ideaworks3d.marmalade.SuspendResumeListener) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerManager;->m_SuspendResumeListeners:Lcom/ideaworks3d/marmalade/event/SuspendResumeListenerList;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/event/SuspendResumeListenerList;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun notifyActivityResultListeners(p0: com.ideaworks3d.marmalade.event.ActivityResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerManager;->m_ActivityResultListeners:Lcom/ideaworks3d/marmalade/event/ActivityResultListenerList;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/event/ActivityResultListenerList;->notifyAll(Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V
    //         return-void
    */

    public fun notifyRequestPermissionsResultListeners(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerManager;->m_RequestPermissionsResultListeners:Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListenerList;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListenerList;->notifyAll(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V
    //         return-void
    */

    public fun notifySuspendResumeListeners(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerManager;->m_SuspendResumeListeners:Lcom/ideaworks3d/marmalade/event/SuspendResumeListenerList;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/event/SuspendResumeListenerList;->notifyAll(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V
    //         return-void
    */

    public fun popKeyListener(): android.view.View.OnKeyListener { return TODO("body: ()Landroid/view/View$OnKeyListener;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerManager;->m_KeyListeners:Ljava/util/Stack;
    //         invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View$OnKeyListener;
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getMainView()Landroid/view/View;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V
    //         return-object v0
    */

    public fun pushKeyListener(p0: android.view.View.OnKeyListener) { /* TODO(body): (Landroid/view/View$OnKeyListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerManager;->m_KeyListeners:Ljava/util/Stack;
    //         invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getMainView()Landroid/view/View;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V
    //         return-void
    */

    public fun removeActivityResultListener(p0: com.ideaworks3d.marmalade.event.ActivityResultListener): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerManager;->m_ActivityResultListeners:Lcom/ideaworks3d/marmalade/event/ActivityResultListenerList;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/event/ActivityResultListenerList;->remove(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun removeRequestPermissionsResultListener(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultListener): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerManager;->m_RequestPermissionsResultListeners:Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListenerList;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListenerList;->remove(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun removeSuspendResumeListener(p0: com.ideaworks3d.marmalade.SuspendResumeListener): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/SuspendResumeListener;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ListenerManager;->m_SuspendResumeListeners:Lcom/ideaworks3d/marmalade/event/SuspendResumeListenerList;
    //         invoke-virtual {v0, p1}, Lcom/ideaworks3d/marmalade/event/SuspendResumeListenerList;->remove(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

}
