package com.facebook.widget

// Auto-emitted from smali source: LikeView.java.
// 7 fields, 8 methods.

enum class LikeView_HorizontalAlignment {
    CENTER,
    LEFT,
    RIGHT,
    ;
    // real Java ctor (after implicit name,ordinal): (p0: String, p1: Int)
    // instance fields (declare as constructor params or properties):
    //   private var intValue: Int
    //   private var stringValue: String

    private fun getValue(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/LikeView$HorizontalAlignment;->intValue:I
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView$HorizontalAlignment;->stringValue:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    @JvmStatic fun fromInt(p0: Int): com.facebook.widget.LikeView.HorizontalAlignment { return TODO("body: (I)Lcom/facebook/widget/LikeView$HorizontalAlignment;") }
    /*
    //         .locals 5
    //         invoke-static {}, Lcom/facebook/widget/LikeView$HorizontalAlignment;->values()[Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         move-result-object v2
    //         array-length v3, v2
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_1
    //         aget-object v0, v2, v1
    //         invoke-direct {v0}, Lcom/facebook/widget/LikeView$HorizontalAlignment;->getValue()I
    //         move-result v4
    //         if-ne v4, p0, :cond_0
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    public @JvmStatic fun valueOf(p0: String): com.facebook.widget.LikeView.HorizontalAlignment { return TODO("body: (Ljava/lang/String;)Lcom/facebook/widget/LikeView$HorizontalAlignment;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.widget.LikeView.HorizontalAlignment> { return TODO("body: ()[Lcom/facebook/widget/LikeView$HorizontalAlignment;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/widget/LikeView$HorizontalAlignment;->$VALUES:[Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         invoke-virtual {v0}, [Lcom/facebook/widget/LikeView$HorizontalAlignment;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         return-object v0
    */

    }
}
