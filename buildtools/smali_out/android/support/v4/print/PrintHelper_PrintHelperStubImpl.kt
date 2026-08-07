package android.support.v4.print

// Auto-emitted from smali source: PrintHelper.java.
// 3 fields, 10 methods.

class PrintHelper_PrintHelperStubImpl: android.support.v4.print.PrintHelper.PrintHelperVersionImpl {
    var mColorMode: Int
    var mOrientation: Int
    var mScaleMode: Int

    private constructor()

    constructor(x0: android.support.v4.print.PrintHelper.1)

    public fun getColorMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mColorMode:I
    //         return v0
    */

    public fun getOrientation(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mOrientation:I
    //         return v0
    */

    public fun getScaleMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mScaleMode:I
    //         return v0
    */

    public fun printBitmap(jobName: String, bitmap: android.graphics.Bitmap, callback: android.support.v4.print.PrintHelper.OnPrintFinishCallback) { /* TODO(body): (Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun printBitmap(jobName: String, imageFile: android.net.Uri, callback: android.support.v4.print.PrintHelper.OnPrintFinishCallback) { /* TODO(body): (Ljava/lang/String;Landroid/net/Uri;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setColorMode(colorMode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mColorMode:I
    //         return-void
    */

    public fun setOrientation(orientation: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mOrientation:I
    //         return-void
    */

    public fun setScaleMode(scaleMode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/print/PrintHelper$PrintHelperStubImpl;->mScaleMode:I
    //         return-void
    */

}
