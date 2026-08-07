package com.facebook.widget

// Auto-emitted from smali source: FacebookDialog.java.
// 2 fields, 6 methods.

open class FacebookDialog_VideoDialogBuilderBase: com.facebook.widget.FacebookDialog.Builder() {
    private var place: String
    private var videoAttachmentUrl: String

    public constructor(p0: android.app.Activity)

    public fun addVideoFile(p0: java.io.File): com.facebook.widget.FacebookDialog.VideoDialogBuilderBase { return TODO("body: (Ljava/io/File;)Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/io/File;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->addVideoAttachmentFile(Ljava/io/File;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->videoAttachmentUrl:Ljava/lang/String;
    //         return-object p0
    */

    protected fun getMethodArguments(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "PLACE"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->place:Ljava/lang/String;
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "VIDEO"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->videoAttachmentUrl:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    public fun setPlace(p0: String): com.facebook.widget.FacebookDialog.VideoDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->place:Ljava/lang/String;
    //         return-object p0
    */

    public fun setVideoUrl(p0: String): com.facebook.widget.FacebookDialog.VideoDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->videoAttachmentUrl:Ljava/lang/String;
    //         return-object p0
    */

    fun validate() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Lcom/facebook/widget/FacebookDialog$Builder;->validate()V
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->videoAttachmentUrl:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$VideoDialogBuilderBase;->videoAttachmentUrl:Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Must specify at least one video."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         return-void
    */

}
