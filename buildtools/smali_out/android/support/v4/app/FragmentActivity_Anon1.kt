package android.support.v4.app

// Auto-emitted from smali source: FragmentActivity.java.
// 1 fields, 2 methods.

open class FragmentActivity_Anon1: android.os.Handler() {
    val this$0: android.support.v4.app.FragmentActivity

    constructor(p0: android.support.v4.app.FragmentActivity)

    public fun handleMessage(msg: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 2
    //         iget v0, p1, Landroid/os/Message;->what:I
    //         packed-switch v0, :pswitch_data_0
    //         invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;
    //         iget-boolean v0, v0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->doReallyStop(Z)V
    //         goto :goto_0
    //         :pswitch_1
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->onResumeFragments()V
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;
    //         iget-object v0, v0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
    //         invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

}
