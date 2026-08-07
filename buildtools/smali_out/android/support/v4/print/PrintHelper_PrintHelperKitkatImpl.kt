package android.support.v4.print

// Auto-emitted from smali source: PrintHelper.java.
// 1 fields, 9 methods.

class PrintHelper_PrintHelperKitkatImpl: android.support.v4.print.PrintHelper.PrintHelperVersionImpl {
    private val mPrintHelper: android.support.v4.print.PrintHelperKitkat

    constructor(context: android.content.Context)

    public fun getColorMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
    //         invoke-virtual {v0}, Landroid/support/v4/print/PrintHelperKitkat;->getColorMode()I
    //         move-result v0
    //         return v0
    */

    public fun getOrientation(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
    //         invoke-virtual {v0}, Landroid/support/v4/print/PrintHelperKitkat;->getOrientation()I
    //         move-result v0
    //         return v0
    */

    public fun getScaleMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
    //         invoke-virtual {v0}, Landroid/support/v4/print/PrintHelperKitkat;->getScaleMode()I
    //         move-result v0
    //         return v0
    */

    public fun printBitmap(jobName: String, bitmap: android.graphics.Bitmap, callback: android.support.v4.print.PrintHelper.OnPrintFinishCallback) { /* TODO(body): (Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         .local v0, "delegateCallback":Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;
    //         if-eqz p3, :cond_0
    //         new-instance v0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl$1;
    //         .end local v0    # "delegateCallback":Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;
    //         invoke-direct {v0, p0, p3}, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl$1;-><init>(Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V
    //         .restart local v0    # "delegateCallback":Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
    //         invoke-virtual {v1, p1, p2, v0}, Landroid/support/v4/print/PrintHelperKitkat;->printBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;)V
    //         return-void
    */

    public fun printBitmap(jobName: String, imageFile: android.net.Uri, callback: android.support.v4.print.PrintHelper.OnPrintFinishCallback) { /* TODO(body): (Ljava/lang/String;Landroid/net/Uri;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         .local v0, "delegateCallback":Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;
    //         if-eqz p3, :cond_0
    //         new-instance v0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl$2;
    //         .end local v0    # "delegateCallback":Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;
    //         invoke-direct {v0, p0, p3}, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl$2;-><init>(Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;Landroid/support/v4/print/PrintHelper$OnPrintFinishCallback;)V
    //         .restart local v0    # "delegateCallback":Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
    //         invoke-virtual {v1, p1, p2, v0}, Landroid/support/v4/print/PrintHelperKitkat;->printBitmap(Ljava/lang/String;Landroid/net/Uri;Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;)V
    //         return-void
    */

    public fun setColorMode(colorMode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/print/PrintHelperKitkat;->setColorMode(I)V
    //         return-void
    */

    public fun setOrientation(orientation: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/print/PrintHelperKitkat;->setOrientation(I)V
    //         return-void
    */

    public fun setScaleMode(scaleMode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelper$PrintHelperKitkatImpl;->mPrintHelper:Landroid/support/v4/print/PrintHelperKitkat;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/print/PrintHelperKitkat;->setScaleMode(I)V
    //         return-void
    */

}
