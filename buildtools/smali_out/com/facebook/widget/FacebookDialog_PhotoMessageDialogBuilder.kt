package com.facebook.widget

// Auto-emitted from smali source: FacebookDialog.java.
// 0 fields, 7 methods.

open class FacebookDialog_PhotoMessageDialogBuilder: com.facebook.widget.FacebookDialog.PhotoDialogBuilderBase() {
    public constructor(p0: android.app.Activity)

    protected fun getDialogFeatures(): java.util.EnumSet { return TODO("body: ()Ljava/util/EnumSet;") }
    /*
    //         .locals 2
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
    //         sget-object v1, Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;->PHOTOS:Lcom/facebook/widget/FacebookDialog$MessageDialogFeature;
    //         invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
    //         move-result-object v0
    //         return-object v0
    */

    fun getMaximumNumberOfPhotos(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget v0, Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;->MAXIMUM_PHOTO_COUNT:I
    //         return v0
    */

    public fun setFriends(p0: java.util.List): com.facebook.widget.FacebookDialog.PhotoDialogBuilderBase { return TODO("body: (Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;->setFriends(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setFriends(p0: java.util.List): com.facebook.widget.FacebookDialog.PhotoMessageDialogBuilder { return TODO("body: (Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;") }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;"
    //             }
    //         .end annotation
    //         return-object p0
    */

    public fun setPlace(p0: String): com.facebook.widget.FacebookDialog.PhotoDialogBuilderBase { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$PhotoDialogBuilderBase;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;->setPlace(Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setPlace(p0: String): com.facebook.widget.FacebookDialog.PhotoMessageDialogBuilder { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$PhotoMessageDialogBuilder;") }
    /*
    //         .locals 0
    //         return-object p0
    */

}
