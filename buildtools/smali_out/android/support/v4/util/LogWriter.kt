package android.support.v4.util

// Auto-emitted from smali source: LogWriter.java.
// 2 fields, 5 methods.

open class LogWriter: java.io.Writer() {
    private var mBuilder: StringBuilder
    private val mTag: String

    public constructor(tag: String)

    private fun flushBuilder() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/util/LogWriter;->mBuilder:Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/util/LogWriter;->mTag:Ljava/lang/String;
    //         iget-object v1, p0, Landroid/support/v4/util/LogWriter;->mBuilder:Ljava/lang/StringBuilder;
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Landroid/support/v4/util/LogWriter;->mBuilder:Ljava/lang/StringBuilder;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Landroid/support/v4/util/LogWriter;->mBuilder:Ljava/lang/StringBuilder;
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
    //         move-result v2
    //         invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
    //         :cond_0
    //         return-void
    */

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Landroid/support/v4/util/LogWriter;->flushBuilder()V
    //         return-void
    */

    public fun flush() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Landroid/support/v4/util/LogWriter;->flushBuilder()V
    //         return-void
    */

    public fun write(buf: CharArray, offset: Int, count: Int) { /* TODO(body): ([CII)V */ }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         if-ge v1, p3, :cond_1
    //         add-int v2, p2, v1
    //         aget-char v0, p1, v2
    //         .local v0, "c":C
    //         const/16 v2, 0xa
    //         if-ne v0, v2, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/util/LogWriter;->flushBuilder()V
    //         :goto_1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_0
    //         iget-object v2, p0, Landroid/support/v4/util/LogWriter;->mBuilder:Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         .end local v0    # "c":C
    //         :cond_1
    //         return-void
    */

}
