package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 0 fields, 27 methods.

open class LoaderAPI {

    companion object {
        public external @JvmStatic fun s3eDebugTraceLine(p0: String)
        public external @JvmStatic fun s3eDeviceYield(p0: Int)
        public external @JvmStatic fun s3eConfigGetInt(p0: String, p1: String, p2: Array<Int>): Int
        public external @JvmStatic fun s3eConfigGetString(p0: String, p1: String, p2: Array<String>): Int
        public external @JvmStatic fun s3eConfigGet(p0: String, p1: Int): Int
        public @JvmStatic fun traceChan(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
        public @JvmStatic fun trace(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
        public @JvmStatic fun getStackTrace(p0: Throwable): String { return TODO("body: (Ljava/lang/Throwable;)Ljava/lang/String;") }
        public @JvmStatic fun getStackTrace(): String { return TODO("body: ()Ljava/lang/String;") }
        public @JvmStatic fun getActivity(): com.ideaworks3d.marmalade.LoaderActivity { return TODO("body: ()Lcom/ideaworks3d/marmalade/LoaderActivity;") }
        public @JvmStatic fun getMainView(): android.view.View { return TODO("body: ()Landroid/view/View;") }
        public @JvmStatic fun getFrameLayout(): android.widget.FrameLayout { return TODO("body: ()Landroid/widget/FrameLayout;") }
        public @JvmStatic fun getListenerManager(): com.ideaworks3d.marmalade.event.ListenerManager { return TODO("body: ()Lcom/ideaworks3d/marmalade/event/ListenerManager;") }
        public @JvmStatic fun addActivityResultListener(p0: com.ideaworks3d.marmalade.event.ActivityResultListener) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)V */ }
        public @JvmStatic fun removeActivityResultListener(p0: com.ideaworks3d.marmalade.event.ActivityResultListener): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/event/ActivityResultListener;)Z") }
        public @JvmStatic fun notifyActivityResultListeners(p0: com.ideaworks3d.marmalade.event.ActivityResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V */ }
        public @JvmStatic fun addRequestPermissionsResultListener(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultListener) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)V */ }
        public @JvmStatic fun removeRequestPermissionsResultListener(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultListener): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultListener;)Z") }
        public @JvmStatic fun notifyRequestPermissionsResultListeners(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V */ }
        public @JvmStatic fun addSuspendResumeListener(p0: com.ideaworks3d.marmalade.SuspendResumeListener) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeListener;)V */ }
        public @JvmStatic fun removeSuspendResumeListener(p0: com.ideaworks3d.marmalade.SuspendResumeListener): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/SuspendResumeListener;)Z") }
        public @JvmStatic fun notifySuspendResumeListeners(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
        public @JvmStatic fun addNewIntentListener(p0: com.ideaworks3d.marmalade.NewIntentListener) { /* TODO(body): (Lcom/ideaworks3d/marmalade/NewIntentListener;)V */ }
        public @JvmStatic fun removeNewIntentListener(p0: com.ideaworks3d.marmalade.NewIntentListener): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/NewIntentListener;)Z") }
        public @JvmStatic fun notifyNewIntentListeners(p0: com.ideaworks3d.marmalade.NewIntentEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/NewIntentEvent;)V */ }
        public @JvmStatic fun pushKeyListener(p0: android.view.View$OnKeyListener) { /* TODO(body): (Landroid/view/View$OnKeyListener;)V */ }
        public @JvmStatic fun popKeyListener(): android.view.View$OnKeyListener { return TODO("body: ()Landroid/view/View$OnKeyListener;") }
    }
}
