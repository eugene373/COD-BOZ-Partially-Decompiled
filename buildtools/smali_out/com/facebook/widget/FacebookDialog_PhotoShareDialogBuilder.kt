package com.facebook.widget

// Auto-emitted from smali source: FacebookDialog.java.
// 0 fields, 3 methods.

open class FacebookDialog_PhotoShareDialogBuilder: com.facebook.widget.FacebookDialog.PhotoDialogBuilderBase() {
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
    //         sget-object v0, Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;->SHARE_DIALOG:Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;
    //         sget-object v1, Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;->PHOTOS:Lcom/facebook/widget/FacebookDialog$ShareDialogFeature;
    //         invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;
    //         move-result-object v0
    //         return-object v0
    */

    fun getMaximumNumberOfPhotos(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget v0, Lcom/facebook/widget/FacebookDialog$PhotoShareDialogBuilder;->MAXIMUM_PHOTO_COUNT:I
    //         return v0
    */

}
