package com.facebook.widget

// Auto-emitted from smali source: FacebookDialog.java.
// 0 fields, 6 methods.

open class FacebookDialog_MessageDialogBuilder: com.facebook.widget.FacebookDialog.ShareDialogBuilderBase() {
    public constructor(p0: android.app.Activity)

    protected fun getDialogFeatures(): java.util.EnumSet { return TODO("body: ()Ljava/util/EnumSet;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/EnumSet",
    //                 "<+",
    //                 "Lcom/facebook/widget/FacebookDialog$DialogFeature;",
    //                 ">;"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;->MESSAGE_DIALOG:Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;
    //         invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setFriends(p0: java.util.List): com.facebook.widget.FacebookDialog.MessageDialogBuilder { return TODO("body: (Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;"
    //             }
    //         .end annotation
    //         return-object p0
    */

    public fun setFriends(p0: java.util.List): com.facebook.widget.FacebookDialog.ShareDialogBuilderBase { return TODO("body: (Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;->setFriends(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setPlace(p0: String): com.facebook.widget.FacebookDialog.MessageDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun setPlace(p0: String): com.facebook.widget.FacebookDialog.ShareDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$ShareDialogBuilderBase;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;->setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$MessageDialogBuilder;
    //         move-result-object v0
    //         return-object v0
    */

}
