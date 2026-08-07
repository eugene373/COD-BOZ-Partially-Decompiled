package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderView.java.
// 18 fields, 5 methods.

open class LoaderView_VideoRunner: Runnable {
    private var m_Action: Int
    private var m_File: String
    private var m_Fullscreen: Boolean
    private var m_Height: Int
    private var m_Offset: Long
    private var m_Repeats: Int
    private var m_Return: Int
    private var m_Size: Long
    private var m_Volume: Int
    private var m_Width: Int
    private var m_X: Int
    private var m_Y: Int
    val this$0: com.ideaworks3d.marmalade.LoaderView

    private constructor(p0: com.ideaworks3d.marmalade.LoaderView)

    constructor(p0: com.ideaworks3d.marmalade.LoaderView, p1: com.ideaworks3d.marmalade.LoaderView.1)

    fun play(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Boolean, p8: Long, p9: Long) { /* TODO(body): (Ljava/lang/String;IIIIIIZJJ)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I
    //         iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_File:Ljava/lang/String;
    //         iput p2, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Volume:I
    //         iput p3, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Repeats:I
    //         iput p4, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_X:I
    //         iput p5, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Y:I
    //         iput p6, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Width:I
    //         iput p7, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Height:I
    //         iput-boolean p8, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Fullscreen:Z
    //         iput-wide p9, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Offset:J
    //         iput-wide p11, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Size:J
    //         return-void
    */

    fun setState(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         packed-switch p1, :pswitch_data_0
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         const/4 v0, 0x2
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I
    //         goto :goto_0
    //         :pswitch_1
    //         const/4 v0, 0x3
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I
    //         goto :goto_0
    //         :pswitch_2
    //         const/4 v0, 0x4
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_0
    //         .end packed-switch
    */

    fun setVolume(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x5
    //         iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Action:I
    //         iput p1, p0, Lcom/ideaworks3d/marmalade/LoaderView$VideoRunner;->m_Volume:I
    //         return-void
    */

    companion object {
    @JvmField public val PAUSE: Int = 0x2
    @JvmField public val PLAY: Int = 0x1
    @JvmField public val RESUME: Int = 0x3
    @JvmField public val STOP: Int = 0x4
    @JvmField public val VOLUME: Int = 0x5
    }
}
