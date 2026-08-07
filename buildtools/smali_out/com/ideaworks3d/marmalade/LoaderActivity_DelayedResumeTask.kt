package com.ideaworks3d.marmalade

// Auto-emitted from smali source: LoaderActivity.java.
// 1 fields, 6 methods.

open class LoaderActivity_DelayedResumeTask: android.os.AsyncTask() {
    val this$0: com.ideaworks3d.marmalade.LoaderActivity

    private constructor(p0: com.ideaworks3d.marmalade.LoaderActivity)

    constructor(p0: com.ideaworks3d.marmalade.LoaderActivity, p1: com.ideaworks3d.marmalade.LoaderActivity.1)

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Ljava/lang/Void;
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun doInBackground(p0: Array<Void>): Void { return TODO("body: ([Ljava/lang/Void;)Ljava/lang/Void;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         monitor-enter p0
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         const-wide/16 v0, 0x12c
    //         :try_start_1
    //         invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
    //         monitor-exit p0
    //         :goto_0
    //         const/4 v0, 0x0
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :try_start_2
    //         throw v0
    //         :try_end_2
    //         .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Ljava/lang/Void;
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->onPostExecute(Ljava/lang/Void;)V
    //         return-void
    */

    protected fun onPostExecute(p0: Void) { /* TODO(body): (Ljava/lang/Void;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->access$000(Lcom/ideaworks3d/marmalade/LoaderActivity;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->access$100(Lcom/ideaworks3d/marmalade/LoaderActivity;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->onResume()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderActivity$DelayedResumeTask;->this$0:Lcom/ideaworks3d/marmalade/LoaderActivity;
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->access$200(Lcom/ideaworks3d/marmalade/LoaderActivity;)V
    //         goto :goto_0
    */

}
