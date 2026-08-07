package com.facebook.widget

// Auto-emitted from smali source: FacebookDialog.java.
// 9 fields, 12 methods.

open class FacebookDialog_ShareDialogBuilderBase: com.facebook.widget.FacebookDialog.Builder() {
    private var caption: String
    private var dataErrorsFatal: Boolean
    private var description: String
    private var friends: java.util.ArrayList
    protected var link: String
    private var name: String
    private var picture: String
    private var place: String
    private var ref: String

    public constructor(p0: android.app.Activity)

    protected fun getMethodArguments(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "TITLE"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->name:Ljava/lang/String;
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "SUBTITLE"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->caption:Ljava/lang/String;
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "DESCRIPTION"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->description:Ljava/lang/String;
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "LINK"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->link:Ljava/lang/String;
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "IMAGE"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->picture:Ljava/lang/String;
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "PLACE"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->place:Ljava/lang/String;
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "REF"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->ref:Ljava/lang/String;
    //         invoke-virtual {p0, v0, v1, v2}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "DATA_FAILURES_FATAL"
    //         iget-boolean v2, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->dataErrorsFatal:Z
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->friends:Ljava/util/ArrayList;
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, "FRIENDS"
    //         iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->friends:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         :cond_0
    //         return-object v0
    */

    protected fun setBundleExtras(p0: android.os.Bundle): android.os.Bundle { return TODO("body: (Landroid/os/Bundle;)Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         const-string v0, "com.facebook.platform.extra.APPLICATION_ID"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->applicationId:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.APPLICATION_NAME"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->applicationName:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.TITLE"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->name:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.SUBTITLE"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->caption:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.DESCRIPTION"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->description:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.LINK"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->link:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.IMAGE"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->picture:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.PLACE"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->place:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.REF"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->ref:Ljava/lang/String;
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "com.facebook.platform.extra.DATA_FAILURES_FATAL"
    //         iget-boolean v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->dataErrorsFatal:Z
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    //         iget-object v0, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->friends:Ljava/util/ArrayList;
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "com.facebook.platform.extra.FRIENDS"
    //         iget-object v1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->friends:Ljava/util/ArrayList;
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         :cond_0
    //         return-object p1
    */

    public fun setCaption(p0: String): com.facebook.widget.FacebookDialog.ShareDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->caption:Ljava/lang/String;
    //         return-object p0
    */

    public fun setDataErrorsFatal(p0: Boolean): com.facebook.widget.FacebookDialog.ShareDialogBuilderBase { return TODO("body: (Z)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(Z)TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-boolean p1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->dataErrorsFatal:Z
    //         return-object p0
    */

    public fun setDescription(p0: String): com.facebook.widget.FacebookDialog.ShareDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->description:Ljava/lang/String;
    //         return-object p0
    */

    public fun setFriends(p0: java.util.List): com.facebook.widget.FacebookDialog.ShareDialogBuilderBase { return TODO("body: (Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;") }
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
    //         iput-object v0, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->friends:Ljava/util/ArrayList;
    //         return-object p0
    //         :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         goto :goto_0
    */

    public fun setLink(p0: String): com.facebook.widget.FacebookDialog.ShareDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->link:Ljava/lang/String;
    //         return-object p0
    */

    public fun setName(p0: String): com.facebook.widget.FacebookDialog.ShareDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->name:Ljava/lang/String;
    //         return-object p0
    */

    public fun setPicture(p0: String): com.facebook.widget.FacebookDialog.ShareDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->picture:Ljava/lang/String;
    //         return-object p0
    */

    public fun setPlace(p0: String): com.facebook.widget.FacebookDialog.ShareDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->place:Ljava/lang/String;
    //         return-object p0
    */

    public fun setRef(p0: String): com.facebook.widget.FacebookDialog.ShareDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")TCONCRETE;"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;->ref:Ljava/lang/String;
    //         return-object p0
    */

}
