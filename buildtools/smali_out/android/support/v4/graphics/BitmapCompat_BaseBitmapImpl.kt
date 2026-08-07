package android.support.v4.graphics

// Auto-emitted from smali source: BitmapCompat.java.
// 0 fields, 4 methods.

open class BitmapCompat_BaseBitmapImpl: android.support.v4.graphics.BitmapCompat.BitmapImpl {
    constructor()

    public fun getAllocationByteCount(bitmap: android.graphics.Bitmap): Int { return TODO("body: (Landroid/graphics/Bitmap;)I") }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Landroid/graphics/Bitmap;->getRowBytes()I
    //         move-result v0
    //         invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
    //         move-result v1
    //         mul-int/2addr v0, v1
    //         return v0
    */

    public fun hasMipMap(bitmap: android.graphics.Bitmap): Boolean { return TODO("body: (Landroid/graphics/Bitmap;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun setHasMipMap(bitmap: android.graphics.Bitmap, hasMipMap: Boolean) { /* TODO(body): (Landroid/graphics/Bitmap;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
