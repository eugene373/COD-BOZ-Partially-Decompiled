package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderActivity.java.
// 13 fields, 37 methods.

open class LoaderActivity: android.app.Activity() {
    private var m_Data: android.content.Intent
    public var m_FrameLayout: android.widget.FrameLayout
    public var m_IgnoreFocusLoss: Boolean
    private var m_IntentBlocking: Boolean
    public var m_ListenerManager: com.ideaworks3d.marmalade.event.ListenerManager
    private var m_LoaderThread: com.ideaworks3d.marmalade.LoaderThread
    private var m_ProgressDialogHandler: android.os.Handler
    public var m_TopLevel: android.widget.RelativeLayout
    private var m_TouchpadEvent: java.lang.reflect.Method
    public var m_View: com.ideaworks3d.marmalade.LoaderView
    private var m_orientationEventListener: android.view.OrientationEventListener

    public constructor()

    private fun IsRunningART(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         const-string v0, "java.vm.version"
    //         invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         const-string v3, "1."
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         move v0, v1
    //         :goto_0
    //         if-eqz v0, :cond_0
    //         :cond_0
    //         if-nez v0, :cond_2
    //         :goto_1
    //         return v1
    //         :cond_1
    //         move v0, v2
    //         goto :goto_0
    //         :cond_2
    //         move v1, v2
    //         goto :goto_1
    */

    private fun isScreenLocked(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "keyguard"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/KeyguardManager;
    //         invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z
    //         move-result v0
    //         return v0
    */

    private fun isScreenOn(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "power"
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/os/PowerManager;
    //         invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z
    //         move-result v0
    //         return v0
    */

    private fun onKeyEvent(p0: Int, p1: Int, p2: android.view.KeyEvent): Boolean { return TODO("body: (IILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         if-eqz v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/LoaderView;->onKeyEvent(IILandroid/view/KeyEvent;)Z
    //         move-result v0
    //         :cond_0
    //         return v0
    */

    private external fun onOrientationChangedNative()

    private external fun setART(p0: Boolean)

    private fun startDelayedResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;-><init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Lcom/ideaworks3d/marmalade/LoaderActivity$1;)V
    //         const/4 v1, 0x0
    //         new-array v1, v1, [Ljava/lang/Void;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         return-void
    */

    private fun startLoader() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getAssets()Landroid/content/res/AssetManager;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getFilesDir()Ljava/io/File;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-static {p0, v0, v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread;->getInstance(Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/content/res/AssetManager;Ljava/io/File;Lcom/ideaworks3d/marmalade/LoaderView;)Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         return-void
    */

    public fun ExecuteIntent(p0: android.content.Intent): android.content.Intent { return TODO("body: (Landroid/content/Intent;)Landroid/content/Intent;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Data:Landroid/content/Intent;
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_IntentBlocking:Z
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         if-eqz v1, :cond_1
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderActivity$2;
    //         invoke-direct {v1, p0, p1}, Lcom/ideaworks3d/marmalade/LoaderActivity$2;-><init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/content/Intent;)V
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->runOnOSThread(Ljava/lang/Runnable;)V
    //         :goto_0
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_IntentBlocking:Z
    //         if-eqz v0, :cond_0
    //         const/16 v0, 0x14
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eDeviceYield(I)V
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Data:Landroid/content/Intent;
    //         :cond_1
    //         return-object v0
    */

    public fun HideProgressDialog() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ProgressDialogHandler:Landroid/os/Handler;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Landroid/os/Message;
    //         invoke-direct {v0}, Landroid/os/Message;-><init>()V
    //         const/4 v1, 0x1
    //         iput v1, v0, Landroid/os/Message;->what:I
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ProgressDialogHandler:Landroid/os/Handler;
    //         invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    //         :cond_0
    //         return-void
    */

    public fun LoaderThread(): com.ideaworks3d.marmalade.LoaderThread { return TODO("body: ()Lcom/ideaworks3d/marmalade/LoaderThread;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         return-object v0
    */

    public fun ShowProgressDialog() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ProgressDialogHandler:Landroid/os/Handler;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Landroid/os/Message;
    //         invoke-direct {v0}, Landroid/os/Message;-><init>()V
    //         const/4 v1, 0x0
    //         iput v1, v0, Landroid/os/Message;->what:I
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ProgressDialogHandler:Landroid/os/Handler;
    //         invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    //         :cond_0
    //         return-void
    */

    public fun createView(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_FrameLayout:Landroid/widget/FrameLayout;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-static {}, Ljava/lang/System;->gc()V
    //         :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-direct {v0, p0, p1}, Lcom/ideaworks3d/marmalade/LoaderView;-><init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Z)V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_FrameLayout:Landroid/widget/FrameLayout;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->setView(Lcom/ideaworks3d/marmalade/LoaderView;)V
    //         :cond_1
    //         return-void
    */

    public fun dispatchTouchEvent(p0: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 5
    //         const/4 v1, 0x1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_TouchpadEvent:Ljava/lang/reflect/Method;
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_TouchpadEvent:Ljava/lang/reflect/Method;
    //         const/4 v2, 0x0
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         aput-object p1, v3, v4
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         :cond_0
    //         invoke-super {p0, p1}, Landroid/app/Activity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun getCursor(p0: android.net.Uri, p1: Array<String>, p2: com.ideaworks3d.marmalade.LoaderActivity.CursorCompleteListener) { /* TODO(body): (Landroid/net/Uri;[Ljava/lang/String;Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v0
    //         new-instance v1, Lcom/ideaworks3d/marmalade/LoaderActivity$3;
    //         invoke-direct {v1, p0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/LoaderActivity$3;-><init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/net/Uri;[Ljava/lang/String;Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)V
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->runOnOSThread(Ljava/lang/Runnable;)V
    //         return-void
    */

    public fun getIgnoreFocusLoss(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_IgnoreFocusLoss:Z
    //         return v0
    */

    protected fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
    //         const v0, 0x1e240
    //         if-ne p1, v0, :cond_0
    //         const/4 v0, -0x1
    //         if-eq p2, v0, :cond_1
    //         const-string v0, "Intent cancelled"
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->trace(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Data:Landroid/content/Intent;
    //         :goto_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_IntentBlocking:Z
    //         :cond_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;
    //         invoke-direct {v0, p3, p1, p2}, Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;-><init>(Landroid/content/Intent;II)V
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->notifyActivityResultListeners(Lcom/ideaworks3d/marmalade/event/ActivityResultEvent;)V
    //         return-void
    //         :cond_1
    //         if-nez p3, :cond_2
    //         new-instance p3, Landroid/content/Intent;
    //         invoke-direct {p3}, Landroid/content/Intent;-><init>()V
    //         :cond_2
    //         iput-object p3, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Data:Landroid/content/Intent;
    //         goto :goto_0
    */

    public fun onConfigurationChanged(p0: android.content.res.Configuration) { /* TODO(body): (Landroid/content/res/Configuration;)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x1
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V
    //         iget v0, p1, Landroid/content/res/Configuration;->hardKeyboardHidden:I
    //         if-ne v0, v1, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderKeyboard:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->hardKeyboardConfigurationChanged(Z)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget v0, p1, Landroid/content/res/Configuration;->hardKeyboardHidden:I
    //         const/4 v1, 0x2
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         iget-object v0, v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_LoaderKeyboard:Lcom/ideaworks3d/marmalade/LoaderKeyboard;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->hardKeyboardConfigurationChanged(Z)V
    //         goto :goto_0
    */

    protected fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         if-eqz v0, :cond_0
    //         :cond_0
    //         const-string v0, "s3e_android"
    //         invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    //         sput-object p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-static {}, Lcom/ideaworks3d/marmalade/LoaderAPI;->getListenerManager()Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ListenerManager:Lcom/ideaworks3d/marmalade/event/ListenerManager;
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->IsRunningART()Z
    //         move-result v0
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->setART(Z)V
    //         sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;
    //         invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v0
    //         const/16 v1, 0x9
    //         if-lt v0, v1, :cond_1
    //         :try_start_0
    //         const-string v0, "com.ideaworks3d.marmalade.s3eTouchpad"
    //         invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v0
    //         const-string v1, "onTouchEvent"
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/Class;
    //         const/4 v3, 0x0
    //         const-class v4, Landroid/view/MotionEvent;
    //         aput-object v4, v2, v3
    //         invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_TouchpadEvent:Ljava/lang/reflect/Method;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_1
    //         :goto_0
    //         new-instance v0, Lcom/ideaworks3d/marmalade/ProgressDialogHandler;
    //         invoke-direct {v0}, Lcom/ideaworks3d/marmalade/ProgressDialogHandler;-><init>()V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_ProgressDialogHandler:Landroid/os/Handler;
    //         new-instance v0, Landroid/widget/RelativeLayout;
    //         invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_TopLevel:Landroid/widget/RelativeLayout;
    //         new-instance v0, Landroid/widget/FrameLayout;
    //         invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_FrameLayout:Landroid/widget/FrameLayout;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_TopLevel:Landroid/widget/RelativeLayout;
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_FrameLayout:Landroid/widget/FrameLayout;
    //         invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
    //         invoke-virtual {p0, v5}, Lcom/ideaworks3d/marmalade/LoaderActivity;->createView(Z)V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_TopLevel:Landroid/widget/RelativeLayout;
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->setContentView(Landroid/view/View;)V
    //         new-instance v0, Lcom/ideaworks3d/marmalade/LoaderActivity$1;
    //         const/4 v1, 0x3
    //         invoke-direct {v0, p0, p0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity$1;-><init>(Lcom/ideaworks3d/marmalade/LoaderActivity;Landroid/content/Context;I)V
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_orientationEventListener:Landroid/view/OrientationEventListener;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_orientationEventListener:Landroid/view/OrientationEventListener;
    //         invoke-virtual {v0}, Landroid/view/OrientationEventListener;->enable()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_orientationEventListener:Landroid/view/OrientationEventListener;
    //         invoke-virtual {v0}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         :cond_2
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_TouchpadEvent:Ljava/lang/reflect/Method;
    //         goto :goto_0
    */

    protected fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         if-eq v0, p0, :cond_1
    //         invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->isFinishing()Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         if-eqz v1, :cond_2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->soundStop()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->audioStopAll()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->onDestroy()V
    //         iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         sput-object v2, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         iget-boolean v0, v0, Lcom/ideaworks3d/marmalade/LoaderView;->m_TerminateApplication:Z
    //         :cond_2
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_orientationEventListener:Landroid/view/OrientationEventListener;
    //         invoke-virtual {v1}, Landroid/view/OrientationEventListener;->disable()V
    //         invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Landroid/os/Process;->myPid()I
    //         move-result v0
    //         invoke-static {v0}, Landroid/os/Process;->killProcess(I)V
    //         goto :goto_0
    */

    public fun onGenericMotionEvent(p0: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun onKeyDown(p0: Int, p1: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun onKeyUp(p0: Int, p1: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun onLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->onLowMemory()V
    //         :cond_0
    //         return-void
    */

    protected fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->onPause()V
    //         :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_orientationEventListener:Landroid/view/OrientationEventListener;
    //         invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V
    //         invoke-super {p0}, Landroid/app/Activity;->onPause()V
    //         return-void
    */

    public fun onRequestPermissionsResult(p0: Int, p1: Array<String>, p2: IntArray) { /* TODO(body): (I[Ljava/lang/String;[I)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    //         new-instance v0, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;
    //         invoke-direct {v0, p1, p2, p3}, Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;-><init>(I[Ljava/lang/String;[I)V
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->notifyRequestPermissionsResultListeners(Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V
    //         return-void
    */

    protected fun onRestart() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Landroid/app/Activity;->onRestart()V
    //         return-void
    */

    protected fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/app/Activity;->onResume()V
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->isScreenLocked()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->isScreenOn()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->startDelayedResume()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_orientationEventListener:Landroid/view/OrientationEventListener;
    //         invoke-virtual {v0}, Landroid/view/OrientationEventListener;->enable()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_LoaderThread:Lcom/ideaworks3d/marmalade/LoaderThread;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderThread;->onResume()V
    //         goto :goto_0
    */

    protected fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Landroid/app/Activity;->onStart()V
    //         invoke-direct {p0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->startLoader()V
    //         return-void
    */

    protected fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Landroid/app/Activity;->onStop()V
    //         return-void
    */

    public fun onWindowFocusChanged(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V
    //         return-void
    */

    public fun setIgnoreFocusLoss(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_IgnoreFocusLoss:Z
    //         return-void
    */

    companion object {
    private val INTENT_CODE: Int = 0x1e240
    @JvmField public var m_Activity: com.ideaworks3d.marmalade.LoaderActivity
    }
}
