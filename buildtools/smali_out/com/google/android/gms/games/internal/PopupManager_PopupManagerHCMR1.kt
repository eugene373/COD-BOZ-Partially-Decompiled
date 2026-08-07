package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 2 fields, 8 methods.

class PopupManager_PopupManagerHCMR1: com.google.android.gms.games.internal.PopupManager(), android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private var Wy: Boolean
    private var Yd: java.lang.ref.WeakReference

    protected constructor(gamesClientImpl: com.google.android.gms.games.internal.GamesClientImpl, gravity: Int)

    private fun m(p0: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 8
    //         const/4 v7, 0x1
    //         const/4 v0, -0x1
    //         const/4 v6, 0x0
    //         invoke-static {}, Lcom/google/android/gms/internal/kc;->hG()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p1}, Landroid/view/View;->getDisplay()Landroid/view/Display;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v1}, Landroid/view/Display;->getDisplayId()I
    //         move-result v0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
    //         move-result-object v1
    //         const/4 v2, 0x2
    //         new-array v2, v2, [I
    //         invoke-virtual {p1, v2}, Landroid/view/View;->getLocationInWindow([I)V
    //         invoke-virtual {p1}, Landroid/view/View;->getWidth()I
    //         move-result v3
    //         invoke-virtual {p1}, Landroid/view/View;->getHeight()I
    //         move-result v4
    //         iget-object v5, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         iput v0, v5, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->Yc:I
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         iput-object v1, v0, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->Yb:Landroid/os/IBinder;
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         aget v1, v2, v6
    //         iput v1, v0, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->left:I
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         aget v1, v2, v7
    //         iput v1, v0, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->top:I
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         aget v1, v2, v6
    //         add-int/2addr v1, v3
    //         iput v1, v0, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->right:I
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         aget v1, v2, v7
    //         add-int/2addr v1, v4
    //         iput v1, v0, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->bottom:I
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Wy:Z
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->kM()V
    //         iput-boolean v6, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Wy:Z
    //         :cond_1
    //         return-void
    */

    protected fun dG(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         new-instance v0, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         invoke-direct {v0, p1, v1, v1}, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;-><init>(ILandroid/os/IBinder;Lcom/google/android/gms/games/internal/PopupManager$1;)V
    //         iput-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         return-void
    */

    public fun kM() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->Yb:Landroid/os/IBinder;
    //         if-eqz v0, :cond_0
    //         invoke-super {p0}, Lcom/google/android/gms/games/internal/PopupManager;->kM()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Yd:Ljava/lang/ref/WeakReference;
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_1
    //         iput-boolean v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Wy:Z
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public fun l(p0: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->XZ:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kx()V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Yd:Ljava/lang/ref/WeakReference;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Yd:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->XZ:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/internal/GamesClientImpl;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         if-nez v0, :cond_0
    //         instance-of v2, v1, Landroid/app/Activity;
    //         if-eqz v2, :cond_0
    //         move-object v0, v1
    //         check-cast v0, Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
    //         move-result-object v0
    //         :cond_0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
    //         invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v0
    //         invoke-static {}, Lcom/google/android/gms/internal/kc;->hF()Z
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //         :cond_1
    //         :goto_0
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Yd:Ljava/lang/ref/WeakReference;
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->XZ:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         if-nez p1, :cond_3
    //         instance-of v0, v1, Landroid/app/Activity;
    //         if-eqz v0, :cond_3
    //         move-object v0, v1
    //         check-cast v0, Landroid/app/Activity;
    //         const v2, 0x1020002
    //         invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         if-nez v0, :cond_2
    //         check-cast v1, Landroid/app/Activity;
    //         invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
    //         move-result-object v0
    //         :cond_2
    //         const-string v1, "PopupManager"
    //         const-string v2, "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view."
    //         invoke-static {v1, v2}, Lcom/google/android/gms/games/internal/GamesLog;->p(Ljava/lang/String;Ljava/lang/String;)V
    //         move-object p1, v0
    //         :cond_3
    //         if-eqz p1, :cond_5
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->m(Landroid/view/View;)V
    //         new-instance v0, Ljava/lang/ref/WeakReference;
    //         invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
    //         iput-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Yd:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
    //         invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //         :goto_1
    //         return-void
    //         :cond_4
    //         invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //         goto :goto_0
    //         :cond_5
    //         const-string v0, "PopupManager"
    //         const-string v1, "No content view usable to display popups. Popups will not be displayed in response to this client\'s calls. Use setViewForPopups() to set your content view."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/GamesLog;->q(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    */

    public fun onGlobalLayout() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Yd:Ljava/lang/ref/WeakReference;
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->Yd:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->m(Landroid/view/View;)V
    //         goto :goto_0
    */

    public fun onViewAttachedToWindow(v: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->m(Landroid/view/View;)V
    //         return-void
    */

    public fun onViewDetachedFromWindow(v: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;->XZ:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kx()V
    //         invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
    //         return-void
    */

}
