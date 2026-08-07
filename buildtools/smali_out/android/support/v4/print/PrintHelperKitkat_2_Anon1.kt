package android.support.v4.print

// Auto-emitted from smali source: PrintHelperKitkat.java.
// 5 fields, 8 methods.

open class PrintHelperKitkat_2_Anon1: android.os.AsyncTask() {
    val this$1: android.support.v4.print.PrintHelperKitkat.2
    val val$cancellationSignal: android.os.CancellationSignal
    val val$layoutResultCallback: android.print.PrintDocumentAdapter.LayoutResultCallback
    val val$newPrintAttributes: android.print.PrintAttributes
    val val$oldPrintAttributes: android.print.PrintAttributes

    constructor(p0: android.support.v4.print.PrintHelperKitkat.2, p1: android.os.CancellationSignal, p2: android.print.PrintAttributes, p3: android.print.PrintAttributes, p4: android.print.PrintDocumentAdapter.LayoutResultCallback)

    protected fun doInBackground(uris: Array<android.net.Uri>): android.graphics.Bitmap { return TODO("body: ([Landroid/net/Uri;)Landroid/graphics/Bitmap;") }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->this$1:Landroid/support/v4/print/PrintHelperKitkat$2;
    //         iget-object v0, v0, Landroid/support/v4/print/PrintHelperKitkat$2;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
    //         iget-object v1, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->this$1:Landroid/support/v4/print/PrintHelperKitkat$2;
    //         iget-object v1, v1, Landroid/support/v4/print/PrintHelperKitkat$2;->val$imageFile:Landroid/net/Uri;
    //         const/16 v2, 0xdac
    //         invoke-static {v0, v1, v2}, Landroid/support/v4/print/PrintHelperKitkat;->access$200(Landroid/support/v4/print/PrintHelperKitkat;Landroid/net/Uri;I)Landroid/graphics/Bitmap;
    //         :try_end_0
    //         .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    protected fun doInBackground(x0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Landroid/net/Uri;
    //         .end local p1    # "x0":[Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/support/v4/print/PrintHelperKitkat$2$1;->doInBackground([Landroid/net/Uri;)Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun onCancelled(result: android.graphics.Bitmap) { /* TODO(body): (Landroid/graphics/Bitmap;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$layoutResultCallback:Landroid/print/PrintDocumentAdapter$LayoutResultCallback;
    //         invoke-virtual {v0}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutCancelled()V
    //         return-void
    */

    protected fun onCancelled(x0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Landroid/graphics/Bitmap;
    //         .end local p1    # "x0":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/support/v4/print/PrintHelperKitkat$2$1;->onCancelled(Landroid/graphics/Bitmap;)V
    //         return-void
    */

    protected fun onPostExecute(bitmap: android.graphics.Bitmap) { /* TODO(body): (Landroid/graphics/Bitmap;)V */ }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V
    //         iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->this$1:Landroid/support/v4/print/PrintHelperKitkat$2;
    //         iput-object p1, v2, Landroid/support/v4/print/PrintHelperKitkat$2;->mBitmap:Landroid/graphics/Bitmap;
    //         if-eqz p1, :cond_1
    //         new-instance v2, Landroid/print/PrintDocumentInfo$Builder;
    //         iget-object v3, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->this$1:Landroid/support/v4/print/PrintHelperKitkat$2;
    //         iget-object v3, v3, Landroid/support/v4/print/PrintHelperKitkat$2;->val$jobName:Ljava/lang/String;
    //         invoke-direct {v2, v3}, Landroid/print/PrintDocumentInfo$Builder;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v2, v0}, Landroid/print/PrintDocumentInfo$Builder;->setContentType(I)Landroid/print/PrintDocumentInfo$Builder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Landroid/print/PrintDocumentInfo$Builder;->setPageCount(I)Landroid/print/PrintDocumentInfo$Builder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/print/PrintDocumentInfo$Builder;->build()Landroid/print/PrintDocumentInfo;
    //         move-result-object v1
    //         .local v1, "info":Landroid/print/PrintDocumentInfo;
    //         iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$newPrintAttributes:Landroid/print/PrintAttributes;
    //         iget-object v3, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$oldPrintAttributes:Landroid/print/PrintAttributes;
    //         invoke-virtual {v2, v3}, Landroid/print/PrintAttributes;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         .local v0, "changed":Z
    //         :goto_0
    //         iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$layoutResultCallback:Landroid/print/PrintDocumentAdapter$LayoutResultCallback;
    //         invoke-virtual {v2, v1, v0}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutFinished(Landroid/print/PrintDocumentInfo;Z)V
    //         .end local v0    # "changed":Z
    //         .end local v1    # "info":Landroid/print/PrintDocumentInfo;
    //         :goto_1
    //         return-void
    //         .restart local v1    # "info":Landroid/print/PrintDocumentInfo;
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         .end local v1    # "info":Landroid/print/PrintDocumentInfo;
    //         :cond_1
    //         iget-object v2, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$layoutResultCallback:Landroid/print/PrintDocumentAdapter$LayoutResultCallback;
    //         const/4 v3, 0x0
    //         invoke-virtual {v2, v3}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutFailed(Ljava/lang/CharSequence;)V
    //         goto :goto_1
    */

    protected fun onPostExecute(x0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Landroid/graphics/Bitmap;
    //         .end local p1    # "x0":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/support/v4/print/PrintHelperKitkat$2$1;->onPostExecute(Landroid/graphics/Bitmap;)V
    //         return-void
    */

    protected fun onPreExecute() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$2$1;->val$cancellationSignal:Landroid/os/CancellationSignal;
    //         new-instance v1, Landroid/support/v4/print/PrintHelperKitkat$2$1$1;
    //         invoke-direct {v1, p0}, Landroid/support/v4/print/PrintHelperKitkat$2$1$1;-><init>(Landroid/support/v4/print/PrintHelperKitkat$2$1;)V
    //         invoke-virtual {v0, v1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V
    //         return-void
    */

}
