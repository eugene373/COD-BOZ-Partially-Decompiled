package com.google.android.gms.common

// Auto-emitted from smali.
// 1 fields, 2 methods.

open class UserRecoverableException: Exception() {
    private val mIntent: android.content.Intent

    public constructor(msg: String, intent: android.content.Intent)

    public fun getIntent(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/google/android/gms/common/UserRecoverableException;->mIntent:Landroid/content/Intent;
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    //         return-object v0
    */

}
