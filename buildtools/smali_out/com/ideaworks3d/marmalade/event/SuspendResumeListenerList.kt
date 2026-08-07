package com.ideaworks3d.marmalade.event

// Auto-emitted from smali source: SuspendResumeListenerList.java.
// 0 fields, 2 methods.

open class SuspendResumeListenerList: com.ideaworks3d.marmalade.event.ListenerList() {
    public constructor()

    public fun notifyAll(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/SuspendResumeListenerList;->m_Listeners:Lcom/ideaworks3d/marmalade/util/WeakArrayList;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/ideaworks3d/marmalade/SuspendResumeListener;
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p1}, Lcom/ideaworks3d/marmalade/SuspendResumeListener;->onSuspendResumeEvent(Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

}
