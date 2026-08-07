package com.facebook.widget

// Auto-emitted from smali source: FacebookDialog.java.
// 3 fields, 6 methods.

enum class FacebookDialog_OpenGraphMessageDialogFeature {
    OG_MESSAGE_DIALOG,
    ;
    // real Java ctor (after implicit name,ordinal): (p0: Int)
    // instance fields (declare as constructor params or properties):
    //   private var minVersion: Int

    public fun getAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"
    //         return-object v0
    */

    public fun getMinVersion(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->minVersion:I
    //         return v0
    */

    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.widget.FacebookDialog.OpenGraphMessageDialogFeature { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.widget.FacebookDialog.OpenGraphMessageDialogFeature> { return TODO("body: ()[Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->$VALUES:[Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;
    //         invoke-virtual {v0}, [Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature;
    //         return-object v0
    */

    }
}
