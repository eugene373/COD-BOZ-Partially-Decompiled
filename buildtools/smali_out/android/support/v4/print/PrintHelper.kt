package android.support.v4.print

// Auto-emitted from smali source: PrintHelper.java.
// 7 fields, 12 methods.

class PrintHelper {
    var mImpl: android.support.v4.print.PrintHelper.PrintHelperVersionImpl

    public constructor(context: android.content.Context)

    public fun getColorMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
    //         invoke-interface {v0}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->getColorMode()I
    //         move-result v0
    //         return v0
    */

    public fun getOrientation(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
    //         invoke-interface {v0}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->getOrientation()I
    //         move-result v0
    //         return v0
    */

    public fun getScaleMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
    //         invoke-interface {v0}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->getScaleMode()I
    //         move-result v0
    //         return v0
    */

    public fun printBitmap(jobName: String, bitmap: android.graphics.Bitmap) { /* TODO(body): (Ljava/lang/String;Landroid/graphics/Bitmap;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, p1, p2, v1}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V
    //         return-void
    */

    public fun printBitmap(jobName: String, bitmap: android.graphics.Bitmap, callback: android.support.v4.print.PrintHelper.OnPrintFinishCallback) { /* TODO(body): (Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
    //         invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V
    //         return-void
    */

    public fun printBitmap(jobName: String, imageFile: android.net.Uri) { /* TODO(body): (Ljava/lang/String;Landroid/net/Uri;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, p1, p2, v1}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->printBitmap(Ljava/lang/String;Landroid/net/Uri;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V
    //         return-void
    */

    public fun printBitmap(jobName: String, imageFile: android.net.Uri, callback: android.support.v4.print.PrintHelper.OnPrintFinishCallback) { /* TODO(body): (Ljava/lang/String;Landroid/net/Uri;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
    //         invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->printBitmap(Ljava/lang/String;Landroid/net/Uri;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V
    //         return-void
    */

    public fun setColorMode(colorMode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->setColorMode(I)V
    //         return-void
    */

    public fun setOrientation(orientation: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->setOrientation(I)V
    //         return-void
    */

    public fun setScaleMode(scaleMode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper;->mImpl:Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/print/PrintHelper$PrintHelperVersionImpl;->setScaleMode(I)V
    //         return-void
    */

    companion object {
    @JvmField public val COLOR_MODE_COLOR: Int = 0x2
    @JvmField public val COLOR_MODE_MONOCHROME: Int = 0x1
    @JvmField public val ORIENTATION_LANDSCAPE: Int = 0x1
    @JvmField public val ORIENTATION_PORTRAIT: Int = 0x2
    @JvmField public val SCALE_MODE_FILL: Int = 0x2
    @JvmField public val SCALE_MODE_FIT: Int = 0x1

    public @JvmStatic fun systemSupportsPrint(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x13
    //         if-lt v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
