package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class gv_a: android.content.MutableContextWrapper() {
    private var mD: android.content.Context
    private var wO: android.app.Activity

    public constructor(p0: android.content.Context)

    public fun dz(): android.content.Context { return TODO("body: ()Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gv$a;->wO:Landroid/app/Activity;
    //         return-object v0
    */

    public fun setBaseContext(base: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/gv$a;->mD:Landroid/content/Context;
    //         instance-of v0, p1, Landroid/app/Activity;
    //         if-eqz v0, :cond_0
    //         check-cast p1, Landroid/app/Activity;
    //         .end local p1    # "base":Landroid/content/Context;
    //         :goto_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/gv$a;->wO:Landroid/app/Activity;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gv$a;->mD:Landroid/content/Context;
    //         invoke-super {p0, v0}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V
    //         return-void
    //         .restart local p1    # "base":Landroid/content/Context;
    //         :cond_0
    //         const/4 p1, 0x0
    //         goto :goto_0
    */

    public fun startActivity(intent: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gv$a;->wO:Landroid/app/Activity;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gv$a;->wO:Landroid/app/Activity;
    //         invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const/high16 v0, 0x10000000
    //         invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gv$a;->mD:Landroid/content/Context;
    //         invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    //         goto :goto_0
    */

}
