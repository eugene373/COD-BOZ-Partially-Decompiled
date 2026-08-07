package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 0 fields, 14 methods.

open class LoaderActivitySlave: com.ideaworks3d.marmalade.event.ActivityResultListener, com.ideaworks3d.marmalade.SuspendResumeListener, com.ideaworks3d.marmalade.event.RequestPermissionsResultListener, com.ideaworks3d.marmalade.NewIntentListener {
    protected fun onStart() { /* TODO(body): ()V */ }
    protected fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    protected fun onStop() { /* TODO(body): ()V */ }
    protected fun onDestroy() { /* TODO(body): ()V */ }
    protected fun onPause() { /* TODO(body): ()V */ }
    protected fun onResume() { /* TODO(body): ()V */ }
    protected fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    protected fun onRequestPermissionsResult(p0: Int, p1: Array<String>, p2: Array<Int>) { /* TODO(body): (I[Ljava/lang/String;[I)V */ }
    protected fun onNewIntent(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    protected fun getActivity(): android.app.Activity { return TODO("body: ()Landroid/app/Activity;") }
    public fun onActivityResultEvent(p0: com.ideaworks3d.marmalade.event.ActivityResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V */ }
    public fun onRequestPermissionsResultEvent(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V */ }
    public fun onSuspendResumeEvent(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    public fun onNewIntentEvent(p0: com.ideaworks3d.marmalade.NewIntentEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/NewIntentEvent;)V */ }
}
