package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class h {
    companion object {
    private val Md: android.net.Uri = null!!
    private val Me: android.net.Uri = null!!

    public @JvmStatic fun aW(p0: String): android.content.Intent { return TODO("body: (Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 3
    //         const-string v0, "package"
    //         const/4 v1, 0x0
    //         invoke-static {v0, p0, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         new-instance v1, Landroid/content/Intent;
    //         const-string v2, "android.settings.APPLICATION_DETAILS_SETTINGS"
    //         invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    //         return-object v1
    */

    private @JvmStatic fun aX(p0: String): android.net.Uri { return TODO("body: (Ljava/lang/String;)Landroid/net/Uri;") }
    /*
    //         .locals 2
    //         const-string v0, "market://details"
    //         invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;
    //         move-result-object v0
    //         const-string v1, "id"
    //         invoke-virtual {v0, v1, p0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun aY(p0: String): android.content.Intent { return TODO("body: (Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "android.intent.action.VIEW"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/h;->aX(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    //         const-string v1, "com.android.vending"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         const/high16 v1, 0x80000
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         return-object v0
    */

    public @JvmStatic fun gZ(): android.content.Intent { return TODO("body: ()Landroid/content/Intent;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v1, "com.google.android.wearable.app"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         return-object v0
    */

    }
}
