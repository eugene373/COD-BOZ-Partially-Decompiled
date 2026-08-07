package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 1 fields, 6 methods.

open class LikeActionController_LikeDialogBuilder: com.facebook.widget.FacebookDialog.Builder() {
    private var objectId: String

    public constructor(p0: android.app.Activity, p1: String)

    public fun getAppCall(): com.facebook.widget.FacebookDialog.PendingCall { return TODO("body: ()Lcom/facebook/widget/FacebookDialog$PendingCall;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->appCall:Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         return-object v0
    */

    public fun getApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->applicationId:Ljava/lang/String;
    //         return-object v0
    */

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
    //         sget-object v0, Lcom/facebook/internal/LikeActionController$LikeDialogFeature;->LIKE_DIALOG:Lcom/facebook/internal/LikeActionController$LikeDialogFeature;
    //         invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun getMethodArguments(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "object_id"
    //         iget-object v2, p0, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->objectId:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    public fun getWebFallbackUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/facebook/internal/LikeActionController$LikeDialogBuilder;->getWebFallbackUrlInternal()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
