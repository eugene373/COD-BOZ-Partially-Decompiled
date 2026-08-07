package com.google.android.gms.plus

// Auto-emitted from smali.
// 1 fields, 4 methods.

open class PlusOneDummyView_b: com.google.android.gms.plus.PlusOneDummyView.d {
    private var mContext: android.content.Context

    private constructor(p0: android.content.Context)

    constructor(p0: android.content.Context, p1: com.google.android.gms.plus.PlusOneDummyView.1)

    public fun getDrawable(size: Int): android.graphics.drawable.Drawable { return TODO("body: (I)Landroid/graphics/drawable/Drawable;") }
    /*
    //         .locals 4
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneDummyView$b;->mContext:Landroid/content/Context;
    //         const-string v1, "com.google.android.gms"
    //         const/4 v2, 0x4
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         const-string v2, "com.google.android.gms"
    //         packed-switch p1, :pswitch_data_0
    //         const-string v0, "ic_plusone_standard"
    //         :goto_0
    //         const-string v3, "drawable"
    //         invoke-virtual {v1, v0, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v0
    //         invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         :goto_1
    //         return-object v0
    //         :pswitch_0
    //         const-string v0, "ic_plusone_small"
    //         goto :goto_0
    //         :pswitch_1
    //         const-string v0, "ic_plusone_medium"
    //         goto :goto_0
    //         :pswitch_2
    //         const-string v0, "ic_plusone_tall"
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_1
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun isValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneDummyView$b;->mContext:Landroid/content/Context;
    //         const-string v1, "com.google.android.gms"
    //         const/4 v2, 0x4
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
