package android.support.v4.print

// Auto-emitted from smali source: PrintHelperKitkat.java.
// 14 fields, 15 methods.

open class PrintHelperKitkat {
    var mColorMode: Int
    val mContext: android.content.Context
    var mDecodeOptions: android.graphics.BitmapFactory.Options
    private val mLock: Object
    var mOrientation: Int
    var mScaleMode: Int

    constructor(context: android.content.Context)

    private fun getMatrix(imageWidth: Int, imageHeight: Int, content: android.graphics.RectF, fittingMode: Int): android.graphics.Matrix { return TODO("body: (IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;") }
    /*
    //         .locals 7
    //         const/high16 v6, 0x40000000    # 2.0f
    //         new-instance v0, Landroid/graphics/Matrix;
    //         invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V
    //         .local v0, "matrix":Landroid/graphics/Matrix;
    //         invoke-virtual {p3}, Landroid/graphics/RectF;->width()F
    //         move-result v4
    //         int-to-float v5, p1
    //         div-float v1, v4, v5
    //         .local v1, "scale":F
    //         const/4 v4, 0x2
    //         if-ne p4, v4, :cond_0
    //         invoke-virtual {p3}, Landroid/graphics/RectF;->height()F
    //         move-result v4
    //         int-to-float v5, p2
    //         div-float/2addr v4, v5
    //         invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F
    //         move-result v1
    //         :goto_0
    //         invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->postScale(FF)Z
    //         invoke-virtual {p3}, Landroid/graphics/RectF;->width()F
    //         move-result v4
    //         int-to-float v5, p1
    //         mul-float/2addr v5, v1
    //         sub-float/2addr v4, v5
    //         div-float v2, v4, v6
    //         .local v2, "translateX":F
    //         invoke-virtual {p3}, Landroid/graphics/RectF;->height()F
    //         move-result v4
    //         int-to-float v5, p2
    //         mul-float/2addr v5, v1
    //         sub-float/2addr v4, v5
    //         div-float v3, v4, v6
    //         .local v3, "translateY":F
    //         invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z
    //         return-object v0
    //         .end local v2    # "translateX":F
    //         .end local v3    # "translateY":F
    //         :cond_0
    //         invoke-virtual {p3}, Landroid/graphics/RectF;->height()F
    //         move-result v4
    //         int-to-float v5, p2
    //         div-float/2addr v4, v5
    //         invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F
    //         move-result v1
    //         goto :goto_0
    */

    private fun loadBitmap(uri: android.net.Uri, o: android.graphics.BitmapFactory.Options): android.graphics.Bitmap { return TODO("body: (Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;") }
    /*
    //         .locals 5
    //         if-eqz p1, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
    //         if-nez v2, :cond_1
    //         :cond_0
    //         new-instance v2, Ljava/lang/IllegalArgumentException;
    //         const-string v3, "bad argument to loadBitmap"
    //         invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v2
    //         :cond_1
    //         const/4 v0, 0x0
    //         .local v0, "is":Ljava/io/InputStream;
    //         :try_start_0
    //         iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
    //         invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
    //         move-result-object v0
    //         const/4 v2, 0x0
    //         invoke-static {v0, v2, p2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v2
    //         if-eqz v0, :cond_2
    //         :try_start_1
    //         invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    //         :cond_2
    //         :goto_0
    //         return-object v2
    //         :catch_0
    //         move-exception v1
    //         .local v1, "t":Ljava/io/IOException;
    //         const-string v3, "PrintHelperKitkat"
    //         const-string v4, "close fail "
    //         invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         .end local v1    # "t":Ljava/io/IOException;
    //         :catchall_0
    //         move-exception v2
    //         if-eqz v0, :cond_3
    //         :try_start_2
    //         invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    //         :try_end_2
    //         .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    //         :cond_3
    //         :goto_1
    //         throw v2
    //         :catch_1
    //         move-exception v1
    //         .restart local v1    # "t":Ljava/io/IOException;
    //         const-string v3, "PrintHelperKitkat"
    //         const-string v4, "close fail "
    //         invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_1
    */

    private fun loadConstrainedBitmap(uri: android.net.Uri, maxSideLength: Int): android.graphics.Bitmap { return TODO("body: (Landroid/net/Uri;I)Landroid/graphics/Bitmap;") }
    /*
    //         .locals 9
    //         const/4 v8, 0x1
    //         const/4 v6, 0x0
    //         if-lez p2, :cond_0
    //         if-eqz p1, :cond_0
    //         iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
    //         if-nez v7, :cond_1
    //         :cond_0
    //         new-instance v6, Ljava/lang/IllegalArgumentException;
    //         const-string v7, "bad argument to getScaledBitmap"
    //         invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v6
    //         :cond_1
    //         new-instance v3, Landroid/graphics/BitmapFactory$Options;
    //         invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V
    //         .local v3, "opt":Landroid/graphics/BitmapFactory$Options;
    //         iput-boolean v8, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
    //         invoke-direct {p0, p1, v3}, Landroid/support/v4/print/PrintHelperKitkat;->loadBitmap(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //         iget v5, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I
    //         .local v5, "w":I
    //         iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I
    //         .local v1, "h":I
    //         if-lez v5, :cond_2
    //         if-gtz v1, :cond_3
    //         :cond_2
    //         :goto_0
    //         return-object v6
    //         :cond_3
    //         invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I
    //         move-result v2
    //         .local v2, "imageSide":I
    //         const/4 v4, 0x1
    //         .local v4, "sampleSize":I
    //         :goto_1
    //         if-le v2, p2, :cond_4
    //         ushr-int/lit8 v2, v2, 0x1
    //         shl-int/lit8 v4, v4, 0x1
    //         goto :goto_1
    //         :cond_4
    //         if-lez v4, :cond_2
    //         invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I
    //         move-result v7
    //         div-int/2addr v7, v4
    //         if-lez v7, :cond_2
    //         const/4 v0, 0x0
    //         .local v0, "decodeOptions":Landroid/graphics/BitmapFactory$Options;
    //         iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;
    //         monitor-enter v7
    //         :try_start_0
    //         new-instance v6, Landroid/graphics/BitmapFactory$Options;
    //         invoke-direct {v6}, Landroid/graphics/BitmapFactory$Options;-><init>()V
    //         iput-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
    //         iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
    //         const/4 v8, 0x1
    //         iput-boolean v8, v6, Landroid/graphics/BitmapFactory$Options;->inMutable:Z
    //         iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
    //         iput v4, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
    //         monitor-exit v7
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_1
    //         :try_start_1
    //         invoke-direct {p0, p1, v0}, Landroid/support/v4/print/PrintHelperKitkat;->loadBitmap(Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_2
    //         move-result-object v6
    //         iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;
    //         monitor-enter v7
    //         const/4 v8, 0x0
    //         :try_start_2
    //         iput-object v8, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
    //         monitor-exit v7
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v6
    //         monitor-exit v7
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v6
    //         :catchall_1
    //         move-exception v6
    //         :try_start_3
    //         monitor-exit v7
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         throw v6
    //         :catchall_2
    //         move-exception v6
    //         iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat;->mLock:Ljava/lang/Object;
    //         monitor-enter v7
    //         const/4 v8, 0x0
    //         :try_start_4
    //         iput-object v8, p0, Landroid/support/v4/print/PrintHelperKitkat;->mDecodeOptions:Landroid/graphics/BitmapFactory$Options;
    //         monitor-exit v7
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_3
    //         throw v6
    //         :catchall_3
    //         move-exception v6
    //         :try_start_5
    //         monitor-exit v7
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_3
    //         throw v6
    */

    public fun getColorMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I
    //         return v0
    */

    public fun getOrientation(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I
    //         return v0
    */

    public fun getScaleMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I
    //         return v0
    */

    public fun printBitmap(jobName: String, bitmap: android.graphics.Bitmap, callback: android.support.v4.print.PrintHelperKitkat.OnPrintFinishCallback) { /* TODO(body): (Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;)V */ }
    /*
    //         .locals 9
    //         if-nez p2, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget v4, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I
    //         .local v4, "fittingMode":I
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
    //         const-string v1, "print"
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v8
    //         check-cast v8, Landroid/print/PrintManager;
    //         .local v8, "printManager":Landroid/print/PrintManager;
    //         sget-object v7, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_PORTRAIT:Landroid/print/PrintAttributes$MediaSize;
    //         .local v7, "mediaSize":Landroid/print/PrintAttributes$MediaSize;
    //         invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I
    //         move-result v0
    //         invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I
    //         move-result v1
    //         if-le v0, v1, :cond_1
    //         sget-object v7, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_LANDSCAPE:Landroid/print/PrintAttributes$MediaSize;
    //         :cond_1
    //         new-instance v0, Landroid/print/PrintAttributes$Builder;
    //         invoke-direct {v0}, Landroid/print/PrintAttributes$Builder;-><init>()V
    //         invoke-virtual {v0, v7}, Landroid/print/PrintAttributes$Builder;->setMediaSize(Landroid/print/PrintAttributes$MediaSize;)Landroid/print/PrintAttributes$Builder;
    //         move-result-object v0
    //         iget v1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I
    //         invoke-virtual {v0, v1}, Landroid/print/PrintAttributes$Builder;->setColorMode(I)Landroid/print/PrintAttributes$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;
    //         move-result-object v6
    //         .local v6, "attr":Landroid/print/PrintAttributes;
    //         new-instance v0, Landroid/support/v4/print/PrintHelperKitkat$1;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-object v5, p3
    //         invoke-direct/range {v0 .. v5}, Landroid/support/v4/print/PrintHelperKitkat$1;-><init>(Landroid/support/v4/print/PrintHelperKitkat;Ljava/lang/String;Landroid/graphics/Bitmap;ILandroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;)V
    //         invoke-virtual {v8, p1, v0, v6}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;
    //         goto :goto_0
    */

    public fun printBitmap(jobName: String, imageFile: android.net.Uri, callback: android.support.v4.print.PrintHelperKitkat.OnPrintFinishCallback) { /* TODO(body): (Ljava/lang/String;Landroid/net/Uri;Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;)V */ }
    /*
    //         .locals 9
    //         iget v5, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I
    //         .local v5, "fittingMode":I
    //         new-instance v0, Landroid/support/v4/print/PrintHelperKitkat$2;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-object v4, p3
    //         invoke-direct/range {v0 .. v5}, Landroid/support/v4/print/PrintHelperKitkat$2;-><init>(Landroid/support/v4/print/PrintHelperKitkat;Ljava/lang/String;Landroid/net/Uri;Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;I)V
    //         .local v0, "printDocumentAdapter":Landroid/print/PrintDocumentAdapter;
    //         iget-object v1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
    //         const-string v2, "print"
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v8
    //         check-cast v8, Landroid/print/PrintManager;
    //         .local v8, "printManager":Landroid/print/PrintManager;
    //         new-instance v7, Landroid/print/PrintAttributes$Builder;
    //         invoke-direct {v7}, Landroid/print/PrintAttributes$Builder;-><init>()V
    //         .local v7, "builder":Landroid/print/PrintAttributes$Builder;
    //         iget v1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I
    //         invoke-virtual {v7, v1}, Landroid/print/PrintAttributes$Builder;->setColorMode(I)Landroid/print/PrintAttributes$Builder;
    //         iget v1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I
    //         const/4 v2, 0x1
    //         if-ne v1, v2, :cond_1
    //         sget-object v1, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_LANDSCAPE:Landroid/print/PrintAttributes$MediaSize;
    //         invoke-virtual {v7, v1}, Landroid/print/PrintAttributes$Builder;->setMediaSize(Landroid/print/PrintAttributes$MediaSize;)Landroid/print/PrintAttributes$Builder;
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {v7}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;
    //         move-result-object v6
    //         .local v6, "attr":Landroid/print/PrintAttributes;
    //         invoke-virtual {v8, p1, v0, v6}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;
    //         return-void
    //         .end local v6    # "attr":Landroid/print/PrintAttributes;
    //         :cond_1
    //         iget v1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I
    //         const/4 v2, 0x2
    //         if-ne v1, v2, :cond_0
    //         sget-object v1, Landroid/print/PrintAttributes$MediaSize;->UNKNOWN_PORTRAIT:Landroid/print/PrintAttributes$MediaSize;
    //         invoke-virtual {v7, v1}, Landroid/print/PrintAttributes$Builder;->setMediaSize(Landroid/print/PrintAttributes$MediaSize;)Landroid/print/PrintAttributes$Builder;
    //         goto :goto_0
    */

    public fun setColorMode(colorMode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mColorMode:I
    //         return-void
    */

    public fun setOrientation(orientation: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mOrientation:I
    //         return-void
    */

    public fun setScaleMode(scaleMode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/print/PrintHelperKitkat;->mScaleMode:I
    //         return-void
    */

    companion object {
    @JvmField public val COLOR_MODE_COLOR: Int = 0x2
    @JvmField public val COLOR_MODE_MONOCHROME: Int = 0x1
    private val LOG_TAG: String = "PrintHelperKitkat"
    private val MAX_PRINT_SIZE: Int = 0xdac
    @JvmField public val ORIENTATION_LANDSCAPE: Int = 0x1
    @JvmField public val ORIENTATION_PORTRAIT: Int = 0x2
    @JvmField public val SCALE_MODE_FILL: Int = 0x2
    @JvmField public val SCALE_MODE_FIT: Int = 0x1
    }
}
