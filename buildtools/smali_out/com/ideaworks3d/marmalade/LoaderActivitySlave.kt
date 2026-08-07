package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderActivitySlave.java.
// 0 fields, 13 methods.

open class LoaderActivitySlave: com.ideaworks3d.marmalade.event.ActivityResultListener, com.ideaworks3d.marmalade.SuspendResumeListener, com.ideaworks3d.marmalade.event.RequestPermissionsResultListener {
    protected constructor()

    protected fun getActivity(): android.app.Activity { return TODO("body: ()Landroid/app/Activity;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         return-object v0
    */

    protected fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onActivityResultEvent(p0: com.ideaworks3d.marmalade.event.ActivityResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "LoaderActivitySlave"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onActivityResultEvent request: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p1, Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;->m_requestCode:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " result: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p1, Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;->m_resultCode:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget v0, p1, Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;->m_requestCode:I
    //         iget v1, p1, Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;->m_resultCode:I
    //         iget-object v2, p1, Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;->m_intent:Landroid/content/Intent;
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onActivityResult(IILandroid/content/Intent;)V
    //         return-void
    */

    protected fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    protected fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    protected fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    protected fun onRequestPermissionsResult(p0: Int, p1: Array<String>, p2: IntArray) { /* TODO(body): (I[Ljava/lang/String;[I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onRequestPermissionsResultEvent(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "LoaderActivitySlave"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onRequestPermissionsResult request: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p1, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;->m_requestCode:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget v0, p1, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;->m_requestCode:I
    //         iget-object v1, p1, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;->m_permissions:[Ljava/lang/String;
    //         iget-object v2, p1, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;->m_grantResults:[I
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    //         return-void
    */

    protected fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    protected fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    protected fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onSuspendResumeEvent(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->RESUME:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onResume()V
    //         :cond_0
    //         iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SUSPEND:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         if-ne v0, v1, :cond_1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onPause()V
    //         :cond_1
    //         iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SHUTDOWN:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         if-ne v0, v1, :cond_2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderActivitySlave;->onDestroy()V
    //         :cond_2
    //         return-void
    */

}
