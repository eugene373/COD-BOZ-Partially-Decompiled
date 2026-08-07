package android.support.v4.print

// Auto-emitted from smali source: PrintHelper.java.
// 0 fields, 8 methods.

interface PrintHelper_PrintHelperVersionImpl {
    public fun getColorMode(): Int

    public fun getOrientation(): Int

    public fun getScaleMode(): Int

    public fun printBitmap(p0: String, p1: android.graphics.Bitmap, p2: android.support.v4.print.PrintHelper.OnPrintFinishCallback)

    public fun printBitmap(p0: String, p1: android.net.Uri, p2: android.support.v4.print.PrintHelper.OnPrintFinishCallback)

    public fun setColorMode(p0: Int)

    public fun setOrientation(p0: Int)

    public fun setScaleMode(p0: Int)

}
