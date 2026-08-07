package com.facebook.widget

// Auto-emitted from smali source: FacebookDialog.java.
// 7 fields, 20 methods.

open class FacebookDialog_Builder {
    protected val activity: android.app.Activity
    protected val appCall: com.facebook.widget.FacebookDialog.PendingCall
    protected val applicationId: String
    protected var applicationName: String
    protected var fragment: android.support.v4.app.Fragment
    protected var imageAttachments: java.util.HashMap
    protected var mediaAttachmentFiles: java.util.HashMap

    public constructor(p0: android.app.Activity)

    protected fun addImageAttachment(p0: String, p1: android.graphics.Bitmap): com.facebook.widget.FacebookDialog.Builder { return TODO("body: (Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/facebook/widget/FacebookDialog$Builder;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Landroid/graphics/Bitmap;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder;->imageAttachments:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-object p0
    */

    protected fun addImageAttachment(p0: String, p1: java.io.File): com.facebook.widget.FacebookDialog.Builder { return TODO("body: (Ljava/lang/String;Ljava/io/File;)Lcom/facebook/widget/FacebookDialog$Builder;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/io/File;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder;->mediaAttachmentFiles:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-object p0
    */

    protected fun addImageAttachmentFiles(p0: java.util.Collection): java.util.List { return TODO("body: (Ljava/util/Collection;)Ljava/util/List;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/io/File;",
    //                 ">;)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/io/File;
    //         invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p0, v3, v0}, Lcom/facebook/widget/FacebookDialog$Builder;->addImageAttachment(Ljava/lang/String;Ljava/io/File;)Lcom/facebook/widget/FacebookDialog$Builder;
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder;->applicationId:Ljava/lang/String;
    //         iget-object v4, p0, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v4}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v4
    //         invoke-static {v0, v4, v3}, Lcom/facebook/NativeAppCallContentProvider;->getAttachmentUrl(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    protected fun addImageAttachments(p0: java.util.Collection): java.util.List { return TODO("body: (Ljava/util/Collection;)Ljava/util/List;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Landroid/graphics/Bitmap;",
    //                 ">;)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/graphics/Bitmap;
    //         invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p0, v3, v0}, Lcom/facebook/widget/FacebookDialog$Builder;->addImageAttachment(Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/facebook/widget/FacebookDialog$Builder;
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder;->applicationId:Ljava/lang/String;
    //         iget-object v4, p0, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v4}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v4
    //         invoke-static {v0, v4, v3}, Lcom/facebook/NativeAppCallContentProvider;->getAttachmentUrl(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    protected fun addVideoAttachment(p0: String, p1: java.io.File): com.facebook.widget.FacebookDialog.Builder { return TODO("body: (Ljava/lang/String;Ljava/io/File;)Lcom/facebook/widget/FacebookDialog$Builder;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Ljava/io/File;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder;->mediaAttachmentFiles:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-object p0
    */

    protected fun addVideoAttachmentFile(p0: java.io.File): String { return TODO("body: (Ljava/io/File;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0, p1}, Lcom/facebook/widget/FacebookDialog$Builder;->addVideoAttachment(Ljava/lang/String;Ljava/io/File;)Lcom/facebook/widget/FacebookDialog$Builder;
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$Builder;->applicationId:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v2}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v2
    //         invoke-static {v1, v2, v0}, Lcom/facebook/NativeAppCallContentProvider;->getAttachmentUrl(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun build(): com.facebook.widget.FacebookDialog { return TODO("body: ()Lcom/facebook/widget/FacebookDialog;") }
    /*
    //         .locals 6
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookDialog$Builder;->validate()V
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookDialog$Builder;->getDialogFeatures()Ljava/util/EnumSet;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/widget/FacebookDialog;->access$100(Ljava/lang/Iterable;)Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder;->activity:Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$Builder;->applicationId:Ljava/lang/String;
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookDialog$Builder;->getDialogFeatures()Ljava/util/EnumSet;
    //         move-result-object v3
    //         invoke-static {v1, v2, v3}, Lcom/facebook/widget/FacebookDialog;->access$200(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Iterable;)[I
    //         move-result-object v1
    //         invoke-static {v0, v2, v1}, Lcom/facebook/widget/FacebookDialog;->access$300(Landroid/content/Context;Ljava/lang/String;[I)I
    //         move-result v3
    //         invoke-static {v3}, Lcom/facebook/internal/NativeProtocol;->isVersionCompatibleWithBucketedIntent(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookDialog$Builder;->getMethodArguments()Landroid/os/Bundle;
    //         move-result-object v5
    //         :goto_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder;->activity:Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v4, p0, Lcom/facebook/widget/FacebookDialog$Builder;->applicationName:Ljava/lang/String;
    //         invoke-static/range {v0 .. v5}, Lcom/facebook/internal/NativeProtocol;->createPlatformActivityIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder;->activity:Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$Builder;->fragment:Landroid/support/v4/app/Fragment;
    //         const-string v3, "com.facebook.platform.extra.PHOTOS"
    //         invoke-virtual {v5, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v3
    //         const/4 v4, 0x0
    //         invoke-static {v2, v3, v4}, Lcom/facebook/widget/FacebookDialog;->access$400(Ljava/lang/String;ZZ)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v3, "Failed"
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/widget/FacebookDialog;->access$500(Landroid/app/Activity;Landroid/support/v4/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Unable to create Intent; this likely means the Facebook app is not installed."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/FacebookDialog$Builder;->setBundleExtras(Landroid/os/Bundle;)Landroid/os/Bundle;
    //         move-result-object v5
    //         goto :goto_0
    //         :cond_1
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-static {v1, v0}, Lcom/facebook/widget/FacebookDialog$PendingCall;->access$600(Lcom/facebook/widget/FacebookDialog$PendingCall;Landroid/content/Intent;)V
    //         new-instance v0, Lcom/facebook/widget/FacebookDialog;
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$Builder;->activity:Landroid/app/Activity;
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$Builder;->fragment:Landroid/support/v4/app/Fragment;
    //         iget-object v3, p0, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookDialog$Builder;->getOnPresentCallback()Lcom/facebook/widget/FacebookDialog$OnPresentCallback;
    //         move-result-object v4
    //         const/4 v5, 0x0
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/widget/FacebookDialog;-><init>(Landroid/app/Activity;Landroid/support/v4/app/Fragment;Lcom/facebook/widget/FacebookDialog$PendingCall;Lcom/facebook/widget/FacebookDialog$OnPresentCallback;Lcom/facebook/widget/FacebookDialog$1;)V
    //         return-object v0
    */

    public fun canPresent(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder;->activity:Landroid/app/Activity;
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookDialog$Builder;->getDialogFeatures()Ljava/util/EnumSet;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/facebook/widget/FacebookDialog;->access$800(Landroid/content/Context;Ljava/lang/Iterable;)Z
    //         move-result v0
    //         return v0
    */

    protected fun getDialogFeatures(): java.util.EnumSet

    fun getImageAttachmentNames(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/ArrayList;
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$Builder;->imageAttachments:Ljava/util/HashMap;
    //         invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         return-object v0
    */

    protected fun getMethodArguments(): android.os.Bundle

    fun getOnPresentCallback(): com.facebook.widget.FacebookDialog.OnPresentCallback { return TODO("body: ()Lcom/facebook/widget/FacebookDialog$OnPresentCallback;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/facebook/widget/FacebookDialog$Builder$1;
    //         invoke-direct {v0, p0}, Lcom/facebook/widget/FacebookDialog$Builder$1;-><init>(Lcom/facebook/widget/FacebookDialog$Builder;)V
    //         return-object v0
    */

    protected fun getWebFallbackUrlInternal(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 7
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookDialog$Builder;->getDialogFeatures()Ljava/util/EnumSet;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/FacebookDialog$DialogFeature;
    //         invoke-interface {v0}, Lcom/facebook/widget/FacebookDialog$DialogFeature;->name()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {v0}, Lcom/facebook/widget/FacebookDialog$DialogFeature;->getAction()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         iget-object v3, p0, Lcom/facebook/widget/FacebookDialog$Builder;->applicationId:Ljava/lang/String;
    //         invoke-static {v3, v0, v2}, Lcom/facebook/internal/Utility;->getDialogFeatureConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/internal/Utility$DialogFeatureConfig;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/internal/Utility$DialogFeatureConfig;->getFallbackUrl()Landroid/net/Uri;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_1
    //         return-object v1
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookDialog$Builder;->getMethodArguments()Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-static {}, Lcom/facebook/internal/NativeProtocol;->getLatestKnownVersion()I
    //         move-result v3
    //         iget-object v4, p0, Lcom/facebook/widget/FacebookDialog$Builder;->activity:Landroid/app/Activity;
    //         iget-object v5, p0, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v5}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         iget-object v6, p0, Lcom/facebook/widget/FacebookDialog$Builder;->applicationName:Ljava/lang/String;
    //         invoke-static {v4, v5, v3, v6, v2}, Lcom/facebook/internal/ServerProtocol;->getQueryParamsForPlatformActivityIntentWebFallback(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    //         move-result-object v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v0}, Landroid/net/Uri;->isRelative()Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         invoke-static {}, Lcom/facebook/internal/ServerProtocol;->getDialogAuthority()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0, v2}, Lcom/facebook/internal/Utility;->buildUri(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;
    //         move-result-object v0
    //         :cond_2
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         goto :goto_1
    //         :cond_3
    //         move-object v0, v1
    //         move-object v2, v1
    //         goto :goto_0
    */

    protected fun putExtra(p0: android.os.Bundle, p1: String, p2: String) { /* TODO(body): (Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         if-eqz p3, :cond_0
    //         invoke-virtual {p1, p2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    public fun setApplicationName(p0: String): com.facebook.widget.FacebookDialog.Builder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$Builder;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$Builder;->applicationName:Ljava/lang/String;
    //         return-object p0
    */

    protected fun setBundleExtras(p0: android.os.Bundle): android.os.Bundle { return TODO("body: (Landroid/os/Bundle;)Landroid/os/Bundle;") }
    /*
    //         .locals 0
    //         return-object p1
    */

    public fun setFragment(p0: android.support.v4.app.Fragment): com.facebook.widget.FacebookDialog.Builder { return TODO("body: (Landroid/support/v4/app/Fragment;)Lcom/facebook/widget/FacebookDialog$Builder;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/support/v4/app/Fragment;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$Builder;->fragment:Landroid/support/v4/app/Fragment;
    //         return-object p0
    */

    public fun setRequestCode(p0: Int): com.facebook.widget.FacebookDialog.Builder { return TODO("body: (I)Lcom/facebook/widget/FacebookDialog$Builder;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(I)TCONCRETE;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$Builder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-static {v0, p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->access$000(Lcom/facebook/widget/FacebookDialog$PendingCall;I)V
    //         return-object p0
    */

    fun validate() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
