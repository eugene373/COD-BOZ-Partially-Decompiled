package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 3 fields, 6 methods.

enum class LikeActionController_LikeDialogFeature {
    LIKE_DIALOG,
    ;
    // real Java ctor (after implicit name,ordinal): (p0: Int)
    // instance fields (declare as constructor params or properties):
    //   private var minVersion: Int

    public fun getAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.facebook.platform.action.request.LIKE_DIALOG"
    //         return-object v0
    */

    public fun getMinVersion(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/internal/LikeActionController$LikeDialogFeature;->minVersion:I
    //         return v0
    */

    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.internal.LikeActionController.LikeDialogFeature { return TODO("body: (Ljava/lang/String;)Lcom/facebook/internal/LikeActionController$LikeDialogFeature;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/internal/LikeActionController$LikeDialogFeature;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/internal/LikeActionController$LikeDialogFeature;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.internal.LikeActionController.LikeDialogFeature> { return TODO("body: ()[Lcom/facebook/internal/LikeActionController$LikeDialogFeature;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/internal/LikeActionController$LikeDialogFeature;->$VALUES:[Lcom/facebook/internal/LikeActionController$LikeDialogFeature;
    //         invoke-virtual {v0}, [Lcom/facebook/internal/LikeActionController$LikeDialogFeature;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/internal/LikeActionController$LikeDialogFeature;
    //         return-object v0
    */

    }
}
