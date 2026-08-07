package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 4 methods.

class fc_a: android.os.AsyncTask() {
    private val tj: android.webkit.WebView
    private var tk: android.graphics.Bitmap
    val tl: com.google.android.gms.internal.fc

    public constructor(p0: com.google.android.gms.internal.fc, p1: android.webkit.WebView)

    protected fun a(p0: Boolean) { /* TODO(body): (Ljava/lang/Boolean;)V */ }
    /*
    //         .locals 4
    //         const-wide/16 v2, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc$a;->tl:Lcom/google/android/gms/internal/fc;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fc;->c(Lcom/google/android/gms/internal/fc;)J
    //         invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc$a;->tl:Lcom/google/android/gms/internal/fc;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/fc;->cA()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc$a;->tl:Lcom/google/android/gms/internal/fc;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fc;->d(Lcom/google/android/gms/internal/fc;)J
    //         move-result-wide v0
    //         cmp-long v0, v0, v2
    //         if-gtz v0, :cond_2
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc$a;->tl:Lcom/google/android/gms/internal/fc;
    //         invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v1
    //         iput-boolean v1, v0, Lcom/google/android/gms/internal/fc;->ti:Z
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc$a;->tl:Lcom/google/android/gms/internal/fc;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fc;->e(Lcom/google/android/gms/internal/fc;)Lcom/google/android/gms/internal/gw$a;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fc$a;->tl:Lcom/google/android/gms/internal/fc;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/fc;->md:Lcom/google/android/gms/internal/gv;
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/gw$a;->a(Lcom/google/android/gms/internal/gv;)V
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc$a;->tl:Lcom/google/android/gms/internal/fc;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fc;->d(Lcom/google/android/gms/internal/fc;)J
    //         move-result-wide v0
    //         cmp-long v0, v0, v2
    //         if-lez v0, :cond_1
    //         const/4 v0, 0x2
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->u(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         const-string v0, "Ad not detected, scheduling another run."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fc$a;->tl:Lcom/google/android/gms/internal/fc;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/fc;->g(Lcom/google/android/gms/internal/fc;)Landroid/os/Handler;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fc$a;->tl:Lcom/google/android/gms/internal/fc;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fc$a;->tl:Lcom/google/android/gms/internal/fc;
    //         invoke-static {v2}, Lcom/google/android/gms/internal/fc;->f(Lcom/google/android/gms/internal/fc;)J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         goto :goto_0
    */

    protected fun doInBackground(x0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Ljava/lang/Void;
    //         .end local p1    # "x0":[Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/fc$a;->a([Ljava/lang/Void;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun onPostExecute(x0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Ljava/lang/Boolean;
    //         .end local p1    # "x0":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/fc$a;->a(Ljava/lang/Boolean;)V
    //         return-void
    */

}
