package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 2 fields, 9 methods.

open class PopupManager {
    protected var XZ: com.google.android.gms.games.internal.GamesClientImpl
    protected var Ya: com.google.android.gms.games.internal.PopupManager.PopupLocationInfo

    private constructor(gamesClientImpl: com.google.android.gms.games.internal.GamesClientImpl, gravity: Int)

    constructor(x0: com.google.android.gms.games.internal.GamesClientImpl, x1: Int, x2: com.google.android.gms.games.internal.PopupManager.1)

    protected fun dG(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         new-instance v1, Landroid/os/Binder;
    //         invoke-direct {v1}, Landroid/os/Binder;-><init>()V
    //         const/4 v2, 0x0
    //         invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;-><init>(ILandroid/os/IBinder;Lcom/google/android/gms/games/internal/PopupManager$1;)V
    //         iput-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         return-void
    */

    public fun kM() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager;->XZ:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/PopupManager;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         iget-object v1, v1, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->Yb:Landroid/os/IBinder;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/PopupManager;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         invoke-virtual {v2}, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->kP()Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Landroid/os/IBinder;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun kN(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->kP()Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun kO(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         iget-object v0, v0, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->Yb:Landroid/os/IBinder;
    //         return-object v0
    */

    public fun l(p0: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setGravity(gravity: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/PopupManager;->Ya:Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    //         iput p1, v0, Lcom/google/android/gms/games/internal/PopupManager$PopupLocationInfo;->gravity:I
    //         return-void
    */

    companion object {
    public @JvmStatic fun a(p0: com.google.android.gms.games.internal.GamesClientImpl, p1: Int): com.google.android.gms.games.internal.PopupManager { return TODO("body: (Lcom/google/android/gms/games/internal/GamesClientImpl;I)Lcom/google/android/gms/games/internal/PopupManager;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/internal/kc;->hC()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/PopupManager$PopupManagerHCMR1;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;I)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/games/internal/PopupManager;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/PopupManager;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;I)V
    //         goto :goto_0
    */

    }
}
