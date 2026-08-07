package com.facebook.widget

// Auto-emitted from smali source: WebDialog.java.
// 9 fields, 13 methods.

open class WebDialog_FeedDialogBuilder: com.facebook.widget.WebDialog.BuilderBase() {
    public constructor(p0: android.content.Context)

    public constructor(p0: android.content.Context, p1: com.facebook.Session)

    public constructor(p0: android.content.Context, p1: com.facebook.Session, p2: android.os.Bundle)

    public constructor(p0: android.content.Context, p1: String, p2: android.os.Bundle)

    public fun build(): com.facebook.widget.WebDialog { return TODO("body: ()Lcom/facebook/widget/WebDialog;") }
    /*
    //         .locals 1
    //         invoke-super {p0}, Lcom/facebook/widget/WebDialog$BuilderBase;->build()Lcom/facebook/widget/WebDialog;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setCaption(p0: String): com.facebook.widget.WebDialog.FeedDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$FeedDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "caption"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setDescription(p0: String): com.facebook.widget.WebDialog.FeedDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$FeedDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "description"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setFrom(p0: String): com.facebook.widget.WebDialog.FeedDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$FeedDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "from"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setLink(p0: String): com.facebook.widget.WebDialog.FeedDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$FeedDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "link"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setName(p0: String): com.facebook.widget.WebDialog.FeedDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$FeedDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "name"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setPicture(p0: String): com.facebook.widget.WebDialog.FeedDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$FeedDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "picture"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setSource(p0: String): com.facebook.widget.WebDialog.FeedDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$FeedDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "source"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setTo(p0: String): com.facebook.widget.WebDialog.FeedDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/WebDialog$FeedDialogBuilder;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/WebDialog$FeedDialogBuilder;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         const-string v1, "to"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object p0
    */

    companion object {
    private val CAPTION_PARAM: String = "caption"
    private val DESCRIPTION_PARAM: String = "description"
    private val FEED_DIALOG: String = "feed"
    private val FROM_PARAM: String = "from"
    private val LINK_PARAM: String = "link"
    private val NAME_PARAM: String = "name"
    private val PICTURE_PARAM: String = "picture"
    private val SOURCE_PARAM: String = "source"
    private val TO_PARAM: String = "to"
    }
}
