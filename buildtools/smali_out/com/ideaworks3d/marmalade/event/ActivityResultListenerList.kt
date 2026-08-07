package com.ideaworks3d.marmalade.event

// Auto-emitted from smali source: ActivityResultListenerList.java.
// 0 fields, 2 methods.

open class ActivityResultListenerList: com.ideaworks3d.marmalade.event.ListenerList() {
    public constructor()

    public fun notifyAll(p0: com.ideaworks3d.marmalade.event.ActivityResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/event/ActivityResultListenerList;->m_Listeners:Lcom/ideaworks3d/marmalade/util/WeakArrayList;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/util/WeakArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/ideaworks3d/marmalade/event/ActivityResultListener;
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0, p1}, Lcom/ideaworks3d/marmalade/event/ActivityResultListener;->onActivityResultEvent(Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

}
