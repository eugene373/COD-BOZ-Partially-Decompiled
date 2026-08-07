package com.google.android.gms.plus

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class PlusOneButton_DefaultOnPlusOneClickListener: android.view.View.OnClickListener, com.google.android.gms.plus.PlusOneButton.OnPlusOneClickListener {
    private val alp: com.google.android.gms.plus.PlusOneButton.OnPlusOneClickListener
    val alq: com.google.android.gms.plus.PlusOneButton

    public constructor(proxy: com.google.android.gms.plus.PlusOneButton, p1: com.google.android.gms.plus.PlusOneButton.OnPlusOneClickListener)

    public fun onClick(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;->alq:Lcom/google/android/gms/plus/PlusOneButton;
    //         invoke-static {v0}, Lcom/google/android/gms/plus/PlusOneButton;->a(Lcom/google/android/gms/plus/PlusOneButton;)Landroid/view/View;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;->alp:Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;->alp:Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;
    //         invoke-interface {v1, v0}, Lcom/google/android/gms/plus/PlusOneButton$OnPlusOneClickListener;->onPlusOneClick(Landroid/content/Intent;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;->onPlusOneClick(Landroid/content/Intent;)V
    //         goto :goto_0
    */

    public fun onPlusOneClick(intent: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;->alq:Lcom/google/android/gms/plus/PlusOneButton;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         instance-of v1, v0, Landroid/app/Activity;
    //         if-eqz v1, :cond_0
    //         if-eqz p1, :cond_0
    //         check-cast v0, Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/google/android/gms/plus/PlusOneButton$DefaultOnPlusOneClickListener;->alq:Lcom/google/android/gms/plus/PlusOneButton;
    //         invoke-static {v1}, Lcom/google/android/gms/plus/PlusOneButton;->b(Lcom/google/android/gms/plus/PlusOneButton;)I
    //         move-result v1
    //         invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         :cond_0
    //         return-void
    */

}
