package com.google.android.gms.plus

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class PlusOneDummyView: android.widget.FrameLayout() {
    public constructor(context: android.content.Context, size: Int)

    private fun eQ(p0: Int): android.graphics.Point { return TODO("body: (I)Landroid/graphics/Point;") }
    /*
    //         .locals 9
    //         const/16 v1, 0x18
    //         const/16 v0, 0x14
    //         const/4 v4, 0x1
    //         const-wide/high16 v6, 0x3fe0000000000000L    # 0.5
    //         new-instance v2, Landroid/graphics/Point;
    //         invoke-direct {v2}, Landroid/graphics/Point;-><init>()V
    //         packed-switch p1, :pswitch_data_0
    //         const/16 v0, 0x26
    //         move v8, v1
    //         move v1, v0
    //         move v0, v8
    //         :goto_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneDummyView;->getResources()Landroid/content/res/Resources;
    //         move-result-object v3
    //         invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
    //         move-result-object v3
    //         int-to-float v1, v1
    //         invoke-static {v4, v1, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F
    //         move-result v1
    //         int-to-float v0, v0
    //         invoke-static {v4, v0, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F
    //         move-result v0
    //         float-to-double v4, v1
    //         add-double/2addr v4, v6
    //         double-to-int v1, v4
    //         iput v1, v2, Landroid/graphics/Point;->x:I
    //         float-to-double v0, v0
    //         add-double/2addr v0, v6
    //         double-to-int v0, v0
    //         iput v0, v2, Landroid/graphics/Point;->y:I
    //         return-object v2
    //         :pswitch_0
    //         const/16 v1, 0x20
    //         goto :goto_0
    //         :pswitch_1
    //         const/16 v0, 0xe
    //         goto :goto_0
    //         :pswitch_2
    //         const/16 v1, 0x32
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_2
    //         .end packed-switch
    */

    private fun na(): com.google.android.gms.plus.PlusOneDummyView.d { return TODO("body: ()Lcom/google/android/gms/plus/PlusOneDummyView$d;") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         new-instance v0, Lcom/google/android/gms/plus/PlusOneDummyView$b;
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneDummyView;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/plus/PlusOneDummyView$b;-><init>(Landroid/content/Context;Lcom/google/android/gms/plus/PlusOneDummyView$1;)V
    //         invoke-interface {v0}, Lcom/google/android/gms/plus/PlusOneDummyView$d;->isValid()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         new-instance v0, Lcom/google/android/gms/plus/PlusOneDummyView$c;
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneDummyView;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/plus/PlusOneDummyView$c;-><init>(Landroid/content/Context;Lcom/google/android/gms/plus/PlusOneDummyView$1;)V
    //         :cond_0
    //         invoke-interface {v0}, Lcom/google/android/gms/plus/PlusOneDummyView$d;->isValid()Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         new-instance v0, Lcom/google/android/gms/plus/PlusOneDummyView$a;
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneDummyView;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/plus/PlusOneDummyView$a;-><init>(Landroid/content/Context;Lcom/google/android/gms/plus/PlusOneDummyView$1;)V
    //         :cond_1
    //         return-object v0
    */

    companion object {
    @JvmField public val TAG: String = "PlusOneDummyView"
    }
}
