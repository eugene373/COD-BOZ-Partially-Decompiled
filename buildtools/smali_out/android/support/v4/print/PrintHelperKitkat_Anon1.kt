package android.support.v4.print

// Auto-emitted from smali source: PrintHelperKitkat.java.
// 6 fields, 4 methods.

open class PrintHelperKitkat_Anon1: android.print.PrintDocumentAdapter() {
    private var mAttributes: android.print.PrintAttributes
    val this$0: android.support.v4.print.PrintHelperKitkat
    val val$bitmap: android.graphics.Bitmap
    val val$callback: android.support.v4.print.PrintHelperKitkat.OnPrintFinishCallback
    val val$fittingMode: Int
    val val$jobName: String

    constructor(p0: android.support.v4.print.PrintHelperKitkat, p1: String, p2: android.graphics.Bitmap, p3: Int, p4: android.support.v4.print.PrintHelperKitkat.OnPrintFinishCallback)

    public fun onFinish() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$callback:Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$callback:Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;
    //         invoke-interface {v0}, Landroid/support/v4/print/PrintHelperKitkat$OnPrintFinishCallback;->onFinish()V
    //         :cond_0
    //         return-void
    */

    public fun onLayout(oldPrintAttributes: android.print.PrintAttributes, newPrintAttributes: android.print.PrintAttributes, cancellationSignal: android.os.CancellationSignal, layoutResultCallback: android.print.PrintDocumentAdapter.LayoutResultCallback, bundle: android.os.Bundle) { /* TODO(body): (Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         iput-object p2, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->mAttributes:Landroid/print/PrintAttributes;
    //         new-instance v2, Landroid/print/PrintDocumentInfo$Builder;
    //         iget-object v3, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$jobName:Ljava/lang/String;
    //         invoke-direct {v2, v3}, Landroid/print/PrintDocumentInfo$Builder;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v2, v0}, Landroid/print/PrintDocumentInfo$Builder;->setContentType(I)Landroid/print/PrintDocumentInfo$Builder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Landroid/print/PrintDocumentInfo$Builder;->setPageCount(I)Landroid/print/PrintDocumentInfo$Builder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/print/PrintDocumentInfo$Builder;->build()Landroid/print/PrintDocumentInfo;
    //         move-result-object v1
    //         .local v1, "info":Landroid/print/PrintDocumentInfo;
    //         invoke-virtual {p2, p1}, Landroid/print/PrintAttributes;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         .local v0, "changed":Z
    //         :goto_0
    //         invoke-virtual {p4, v1, v0}, Landroid/print/PrintDocumentAdapter$LayoutResultCallback;->onLayoutFinished(Landroid/print/PrintDocumentInfo;Z)V
    //         return-void
    //         .end local v0    # "changed":Z
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onWrite(pageRanges: Array<android.print.PageRange>, fileDescriptor: android.os.ParcelFileDescriptor, cancellationSignal: android.os.CancellationSignal, writeResultCallback: android.print.PrintDocumentAdapter.WriteResultCallback) { /* TODO(body): ([Landroid/print/PageRange;Landroid/os/ParcelFileDescriptor;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$WriteResultCallback;)V */ }
    /*
    //         .locals 9
    //         new-instance v4, Landroid/print/pdf/PrintedPdfDocument;
    //         iget-object v5, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
    //         iget-object v5, v5, Landroid/support/v4/print/PrintHelperKitkat;->mContext:Landroid/content/Context;
    //         iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->mAttributes:Landroid/print/PrintAttributes;
    //         invoke-direct {v4, v5, v6}, Landroid/print/pdf/PrintedPdfDocument;-><init>(Landroid/content/Context;Landroid/print/PrintAttributes;)V
    //         .local v4, "pdfDocument":Landroid/print/pdf/PrintedPdfDocument;
    //         const/4 v5, 0x1
    //         :try_start_0
    //         invoke-virtual {v4, v5}, Landroid/print/pdf/PrintedPdfDocument;->startPage(I)Landroid/graphics/pdf/PdfDocument$Page;
    //         move-result-object v3
    //         .local v3, "page":Landroid/graphics/pdf/PdfDocument$Page;
    //         new-instance v0, Landroid/graphics/RectF;
    //         invoke-virtual {v3}, Landroid/graphics/pdf/PdfDocument$Page;->getInfo()Landroid/graphics/pdf/PdfDocument$PageInfo;
    //         move-result-object v5
    //         invoke-virtual {v5}, Landroid/graphics/pdf/PdfDocument$PageInfo;->getContentRect()Landroid/graphics/Rect;
    //         move-result-object v5
    //         invoke-direct {v0, v5}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V
    //         .local v0, "content":Landroid/graphics/RectF;
    //         iget-object v5, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->this$0:Landroid/support/v4/print/PrintHelperKitkat;
    //         iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$bitmap:Landroid/graphics/Bitmap;
    //         invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I
    //         move-result v6
    //         iget-object v7, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$bitmap:Landroid/graphics/Bitmap;
    //         invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I
    //         move-result v7
    //         iget v8, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$fittingMode:I
    //         invoke-static {v5, v6, v7, v0, v8}, Landroid/support/v4/print/PrintHelperKitkat;->access$000(Landroid/support/v4/print/PrintHelperKitkat;IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
    //         move-result-object v2
    //         .local v2, "matrix":Landroid/graphics/Matrix;
    //         invoke-virtual {v3}, Landroid/graphics/pdf/PdfDocument$Page;->getCanvas()Landroid/graphics/Canvas;
    //         move-result-object v5
    //         iget-object v6, p0, Landroid/support/v4/print/PrintHelperKitkat$1;->val$bitmap:Landroid/graphics/Bitmap;
    //         const/4 v7, 0x0
    //         invoke-virtual {v5, v6, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
    //         invoke-virtual {v4, v3}, Landroid/print/pdf/PrintedPdfDocument;->finishPage(Landroid/graphics/pdf/PdfDocument$Page;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :try_start_1
    //         new-instance v5, Ljava/io/FileOutputStream;
    //         invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
    //         move-result-object v6
    //         invoke-direct {v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V
    //         invoke-virtual {v4, v5}, Landroid/print/pdf/PrintedPdfDocument;->writeTo(Ljava/io/OutputStream;)V
    //         const/4 v5, 0x1
    //         new-array v5, v5, [Landroid/print/PageRange;
    //         const/4 v6, 0x0
    //         sget-object v7, Landroid/print/PageRange;->ALL_PAGES:Landroid/print/PageRange;
    //         aput-object v7, v5, v6
    //         invoke-virtual {p4, v5}, Landroid/print/PrintDocumentAdapter$WriteResultCallback;->onWriteFinished([Landroid/print/PageRange;)V
    //         :try_end_1
    //         .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :goto_0
    //         if-eqz v4, :cond_0
    //         invoke-virtual {v4}, Landroid/print/pdf/PrintedPdfDocument;->close()V
    //         :cond_0
    //         if-eqz p2, :cond_1
    //         :try_start_2
    //         invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    //         :try_end_2
    //         .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    //         :cond_1
    //         :goto_1
    //         return-void
    //         :catch_0
    //         move-exception v1
    //         .local v1, "ioe":Ljava/io/IOException;
    //         :try_start_3
    //         const-string v5, "PrintHelperKitkat"
    //         const-string v6, "Error writing printed content"
    //         invoke-static {v5, v6, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         const/4 v5, 0x0
    //         invoke-virtual {p4, v5}, Landroid/print/PrintDocumentAdapter$WriteResultCallback;->onWriteFailed(Ljava/lang/CharSequence;)V
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         goto :goto_0
    //         .end local v0    # "content":Landroid/graphics/RectF;
    //         .end local v1    # "ioe":Ljava/io/IOException;
    //         .end local v2    # "matrix":Landroid/graphics/Matrix;
    //         .end local v3    # "page":Landroid/graphics/pdf/PdfDocument$Page;
    //         :catchall_0
    //         move-exception v5
    //         if-eqz v4, :cond_2
    //         invoke-virtual {v4}, Landroid/print/pdf/PrintedPdfDocument;->close()V
    //         :cond_2
    //         if-eqz p2, :cond_3
    //         :try_start_4
    //         invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    //         :try_end_4
    //         .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    //         :cond_3
    //         :goto_2
    //         throw v5
    //         .restart local v0    # "content":Landroid/graphics/RectF;
    //         .restart local v2    # "matrix":Landroid/graphics/Matrix;
    //         .restart local v3    # "page":Landroid/graphics/pdf/PdfDocument$Page;
    //         :catch_1
    //         move-exception v5
    //         goto :goto_1
    //         .end local v0    # "content":Landroid/graphics/RectF;
    //         .end local v2    # "matrix":Landroid/graphics/Matrix;
    //         .end local v3    # "page":Landroid/graphics/pdf/PdfDocument$Page;
    //         :catch_2
    //         move-exception v6
    //         goto :goto_2
    */

}
