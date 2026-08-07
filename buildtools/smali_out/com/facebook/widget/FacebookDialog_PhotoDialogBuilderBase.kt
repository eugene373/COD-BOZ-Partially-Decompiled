package com.facebook.widget

// Auto-emitted from smali source: FacebookDialog.java.
// 4 fields, 10 methods.

open class FacebookDialog_PhotoDialogBuilderBase: com.facebook.widget.FacebookDialog.Builder() {
    private var friends: java.util.ArrayList
    private var imageAttachmentUrls: java.util.ArrayList
    private var place: String

    public constructor(p0: android.app.Activity)

    public fun addPhotoFiles(p0: java.util.Collection): com.facebook.widget.FacebookDialog.PhotoDialogBuilderBase { return TODO("body: (Ljava/util/Collection;)Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/io/File;",
    //                 ">;)TCONCRETE;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->imageAttachmentUrls:Ljava/util/ArrayList;
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->addImageAttachmentFiles(Ljava/util/Collection;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         return-object p0
    */

    public fun addPhotos(p0: java.util.Collection): com.facebook.widget.FacebookDialog.PhotoDialogBuilderBase { return TODO("body: (Ljava/util/Collection;)Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Landroid/graphics/Bitmap;",
    //                 ">;)TCONCRETE;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->imageAttachmentUrls:Ljava/util/ArrayList;
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->addImageAttachments(Ljava/util/Collection;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         return-object p0
    */

    fun getMaximumNumberOfPhotos(): Int

    protected fun getMethodArguments(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "PLACE"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->place:Ljava/lang/String;
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "PHOTOS"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->imageAttachmentUrls:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->friends:Ljava/util/ArrayList;
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, "FRIENDS"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->friends:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         :cond_0
    //         return-object v0
    */

    protected fun setBundleExtras(p0: android.os.Bundle): android.os.Bundle { return TODO("body: (Landroid/os/Bundle;)Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         const-string v0, "com.facebook.platform.extra.APPLICATION_ID"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->applicationId:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.APPLICATION_NAME"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->applicationName:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.PLACE"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->place:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.PHOTOS"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->imageAttachmentUrls:Ljava/util/ArrayList;
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->friends:Ljava/util/ArrayList;
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "com.facebook.platform.extra.FRIENDS"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->friends:Ljava/util/ArrayList;
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         :cond_0
    //         return-object p1
    */

    public fun setFriends(p0: java.util.List): com.facebook.widget.FacebookDialog.PhotoDialogBuilderBase { return TODO("body: (Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)TCONCRETE;"
    //             }
    //         .end annotation
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         iput-object v0, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->friends:Ljava/util/ArrayList;
    //         return-object p0
    //         :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         goto :goto_0
    */

    public fun setPlace(p0: String): com.facebook.widget.FacebookDialog.PhotoDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->place:Ljava/lang/String;
    //         return-object p0
    */

    fun validate() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         invoke-super {p0}, Lcom/facebook/widget/FacebookDialog$Builder;->validate()V
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->imageAttachmentUrls:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Must specify at least one photo."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->imageAttachmentUrls:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->getMaximumNumberOfPhotos()I
    //         move-result v1
    //         if-le v0, v1, :cond_1
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Cannot add more than %d photos."
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         invoke-virtual {p0}, Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;->getMaximumNumberOfPhotos()I
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         return-void
    */

    companion object {
    var MAXIMUM_PHOTO_COUNT: Int
    }
}
