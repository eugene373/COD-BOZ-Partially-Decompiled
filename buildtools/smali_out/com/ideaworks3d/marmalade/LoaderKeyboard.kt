package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderKeyboard.java.
// 4 fields, 14 methods.

open class LoaderKeyboard: com.ideaworks3d.marmalade.SuspendResumeListener {
    private var m_Receiver: com.ideaworks3d.marmalade.LoaderKeyboard.SoftInputReceiver
    private var m_View: com.ideaworks3d.marmalade.LoaderView
    private var m_onScreenKeyboard: Boolean
    private var m_pausing: Boolean

    public constructor(p0: com.ideaworks3d.marmalade.LoaderView)

    private external fun onKeyEventNative(p0: Int, p1: Int, p2: Int): Boolean

    private external fun setCharInputEnabledNative(p0: Boolean)

    public fun getKeyboardInfo(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         const/4 v4, 0x2
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_View:Lcom/ideaworks3d/marmalade/LoaderView;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderView;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
    //         move-result-object v2
    //         const/4 v0, 0x0
    //         iget v1, v2, Landroid/content/res/Configuration;->keyboard:I
    //         if-ne v1, v4, :cond_0
    //         iget v1, v2, Landroid/content/res/Configuration;->hardKeyboardHidden:I
    //         if-eq v1, v4, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         iget v1, v2, Landroid/content/res/Configuration;->keyboard:I
    //         const/4 v3, 0x3
    //         if-ne v1, v3, :cond_4
    //         iget v1, v2, Landroid/content/res/Configuration;->hardKeyboardHidden:I
    //         if-eq v1, v4, :cond_4
    //         or-int/lit8 v0, v0, 0x2
    //         move v1, v0
    //         :goto_0
    //         iget v0, v2, Landroid/content/res/Configuration;->navigation:I
    //         if-lt v0, v4, :cond_1
    //         :try_start_0
    //         invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         const-string v3, "navigationHidden"
    //         invoke-virtual {v0, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //         move-result-object v0
    //         invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Integer;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         if-ne v0, v4, :cond_2
    //         :cond_1
    //         :goto_1
    //         return v1
    //         :catch_0
    //         move-exception v0
    //         :cond_2
    //         sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
    //         const-string v3, "Zeus"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         iget v0, v2, Landroid/content/res/Configuration;->hardKeyboardHidden:I
    //         if-eq v0, v4, :cond_1
    //         :cond_3
    //         or-int/lit8 v1, v1, 0x4
    //         goto :goto_1
    //         :cond_4
    //         move v1, v0
    //         goto :goto_0
    */

    public fun getShowOnScreenKeyboard(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z
    //         return v0
    */

    public fun hardKeyboardConfigurationChanged(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         if-nez p1, :cond_0
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->setShowOnScreenKeyboard(Z)V
    //         :cond_0
    //         return-void
    */

    public fun onKeyEvent(p0: Int, p1: Int, p2: android.view.KeyEvent): Boolean { return TODO("body: (IILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p3}, Landroid/view/KeyEvent;->getUnicodeChar()I
    //         move-result v0
    //         invoke-direct {p0, p1, v0, p2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->onKeyEventNative(III)Z
    //         move-result v0
    //         return v0
    */

    public fun onKeyPreIme(p0: Int, p1: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         const/4 v1, 0x4
    //         if-ne p1, v1, :cond_0
    //         iget-boolean v1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z
    //         if-eqz v1, :cond_0
    //         invoke-direct {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->setCharInputEnabledNative(Z)V
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->setShowOnScreenKeyboard(Z)V
    //         const/4 v0, 0x1
    //         :cond_0
    //         return v0
    */

    public fun onSuspendResumeEvent(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         const/4 v2, 0x0
    //         iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->SUSPEND:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         if-ne v0, v1, :cond_0
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z
    //         if-eqz v0, :cond_0
    //         iput-boolean v3, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_pausing:Z
    //         invoke-virtual {p0, v2}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->setShowOnScreenKeyboard(Z)V
    //         iput-boolean v3, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z
    //         :cond_0
    //         iget-object v0, p1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent;->eventType:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;->RESUME:Lcom/ideaworks3d/marmalade/SuspendResumeEvent$EventType;
    //         if-ne v0, v1, :cond_1
    //         iput-boolean v2, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_pausing:Z
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z
    //         if-eqz v0, :cond_1
    //         iget-boolean v0, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z
    //         invoke-virtual {p0, v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->setShowOnScreenKeyboard(Z)V
    //         :cond_1
    //         return-void
    */

    public fun setShowOnScreenKeyboard(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 3
    //         iput-boolean p1, p0, Lcom/ideaworks3d/marmalade/LoaderKeyboard;->m_onScreenKeyboard:Z
    //         sget-object v0, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         const-string v1, "input_method"
    //         invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/inputmethod/InputMethodManager;
    //         sget-object v1, Lcom/ideaworks3d/marmalade/LoaderActivity;->m_Activity:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;
    //         move-result-object v1
    //         new-instance v2, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;
    //         invoke-direct {v2, p0, p1, v0}, Lcom/ideaworks3d/marmalade/LoaderKeyboard$1;-><init>(Lcom/ideaworks3d/marmalade/LoaderKeyboard;ZLandroid/view/inputmethod/InputMethodManager;)V
    //         invoke-virtual {v1, v2}, Lcom/ideaworks3d/marmalade/LoaderThread;->runOnOSThread(Ljava/lang/Runnable;)V
    //         return-void
    */

}
