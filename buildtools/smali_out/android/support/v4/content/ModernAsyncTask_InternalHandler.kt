package android.support.v4.content

// Auto-emitted from smali source: ModernAsyncTask.java.
// 0 fields, 3 methods.

open class ModernAsyncTask_InternalHandler: android.os.Handler() {
    private constructor()

    constructor(x0: android.support.v4.content.ModernAsyncTask.1)

    public fun handleMessage(msg: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
    //         check-cast v0, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;
    //         .local v0, "result":Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;
    //         iget v1, p1, Landroid/os/Message;->what:I
    //         packed-switch v1, :pswitch_data_0
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         iget-object v1, v0, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;->mTask:Landroid/support/v4/content/ModernAsyncTask;
    //         iget-object v2, v0, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;->mData:[Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         aget-object v2, v2, v3
    //         invoke-static {v1, v2}, Landroid/support/v4/content/ModernAsyncTask;->access$500(Landroid/support/v4/content/ModernAsyncTask;Ljava/lang/Object;)V
    //         goto :goto_0
    //         :pswitch_1
    //         iget-object v1, v0, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;->mTask:Landroid/support/v4/content/ModernAsyncTask;
    //         iget-object v2, v0, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;->mData:[Ljava/lang/Object;
    //         invoke-virtual {v1, v2}, Landroid/support/v4/content/ModernAsyncTask;->onProgressUpdate([Ljava/lang/Object;)V
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

}
