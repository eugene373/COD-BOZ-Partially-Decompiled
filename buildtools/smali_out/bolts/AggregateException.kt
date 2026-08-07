package bolts

// Auto-emitted from smali source: AggregateException.java.
// 2 fields, 2 methods.

open class AggregateException: Exception() {
    private var errors: java.util.List

    public constructor(p0: java.util.List)

    public fun getErrors(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/Exception;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lbolts/AggregateException;->errors:Ljava/util/List;
    //         return-object v0
    */

    companion object {
    private val serialVersionUID: Long = 0x1L
    }
}
