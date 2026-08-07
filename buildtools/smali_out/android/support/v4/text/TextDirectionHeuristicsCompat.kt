package android.support.v4.text

// Auto-emitted from smali source: TextDirectionHeuristicsCompat.java.
// 9 fields, 6 methods.

open class TextDirectionHeuristicsCompat {
    public constructor()

    companion object {
    @JvmField public val ANYRTL_LTR: android.support.v4.text.TextDirectionHeuristicCompat = null!!
    @JvmField public val FIRSTSTRONG_LTR: android.support.v4.text.TextDirectionHeuristicCompat = null!!
    @JvmField public val FIRSTSTRONG_RTL: android.support.v4.text.TextDirectionHeuristicCompat = null!!
    @JvmField public val LOCALE: android.support.v4.text.TextDirectionHeuristicCompat = null!!
    @JvmField public val LTR: android.support.v4.text.TextDirectionHeuristicCompat = null!!
    @JvmField public val RTL: android.support.v4.text.TextDirectionHeuristicCompat = null!!
    private val STATE_FALSE: Int = 0x1
    private val STATE_TRUE: Int = 0x0
    private val STATE_UNKNOWN: Int = 0x2

    private @JvmStatic fun isRtlText(directionality: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         packed-switch p0, :pswitch_data_0
    //         const/4 v0, 0x2
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :pswitch_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_1
    //         .end packed-switch
    */

    private @JvmStatic fun isRtlTextOrFormat(directionality: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         sparse-switch p0, :sswitch_data_0
    //         const/4 v0, 0x2
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :sswitch_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_1
    //             0xe -> :sswitch_0
    //             0xf -> :sswitch_0
    //             0x10 -> :sswitch_1
    //             0x11 -> :sswitch_1
    //         .end sparse-switch
    */

    }
}
