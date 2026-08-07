package com.google.android.gms.plus.internal

// Auto-emitted from smali.
// 1 fields, 5 methods.

class g: com.google.android.gms.dynamic.g() {
    private constructor()

    protected fun bI(p0: android.os.IBinder): com.google.android.gms.plus.internal.c { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/plus/internal/c;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/plus/internal/c$a;->bF(Landroid/os/IBinder;)Lcom/google/android/gms/plus/internal/c;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun d(p0: android.os.IBinder): Object { return TODO("body: (Landroid/os/IBinder;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/internal/g;->bI(Landroid/os/IBinder;)Lcom/google/android/gms/plus/internal/c;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val alC: com.google.android.gms.plus.internal.g = null!!

    public @JvmStatic fun a(p0: android.content.Context, p1: Int, p2: Int, p3: String, p4: Int): android.view.View { return TODO("body: (Landroid/content/Context;IILjava/lang/String;I)Landroid/view/View;") }
    /*
    //         .locals 6
    //         if-nez p3, :cond_0
    //         :try_start_0
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V
    //         throw v0
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Lcom/google/android/gms/plus/PlusOneDummyView;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/plus/PlusOneDummyView;-><init>(Landroid/content/Context;I)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         :try_start_1
    //         sget-object v0, Lcom/google/android/gms/plus/internal/g;->alC:Lcom/google/android/gms/plus/internal/g;
    //         invoke-virtual {v0, p0}, Lcom/google/android/gms/plus/internal/g;->L(Landroid/content/Context;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/c;
    //         invoke-static {p0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         move v2, p1
    //         move v3, p2
    //         move-object v4, p3
    //         move v5, p4
    //         invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/plus/internal/c;->a(Lcom/google/android/gms/dynamic/d;IILjava/lang/String;I)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    */

    }
}
