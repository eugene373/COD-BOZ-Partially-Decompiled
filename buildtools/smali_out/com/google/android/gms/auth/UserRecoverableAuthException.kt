package com.google.android.gms.auth

// Auto-emitted from smali.
// 1 fields, 2 methods.

open class UserRecoverableAuthException: com.google.android.gms.auth.GoogleAuthException() {
    private val mIntent: android.content.Intent

    public constructor(msg: String, intent: android.content.Intent)

    public fun getIntent(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/auth/UserRecoverableAuthException;->mIntent:Landroid/content/Intent;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/google/android/gms/auth/UserRecoverableAuthException;->mIntent:Landroid/content/Intent;
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
    //         goto :goto_0
    */

}
