package com.ideaworks3d.marmalade

// Auto-emitted from smali source: s3eTest.java.
// 3 fields, 2 methods.

open class s3eTest_Anon5: Runnable {
    val this$0: com.ideaworks3d.marmalade.s3eTest
    val val$iterations: Int
    val val$sleepTimeMS: Int

    constructor(p0: com.ideaworks3d.marmalade.s3eTest, p1: Int, p2: Int)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         const/4 v0, 0x0
    //         :goto_0
    //         :try_start_0
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->val$iterations:I
    //         if-ge v0, v1, :cond_1
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         const/4 v2, 0x0
    //         invoke-static {v1, v2}, Lcom/ideaworks3d/marmalade/s3eTest;->access$202(Lcom/ideaworks3d/marmalade/s3eTest;Z)Z
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eTest;->PostSuspend()V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v2}, Lcom/ideaworks3d/marmalade/s3eTest;->PostSetFocus(Z)V
    //         iget v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->val$sleepTimeMS:I
    //         int-to-long v2, v1
    //         invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eTest;->PostResume()V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Lcom/ideaworks3d/marmalade/s3eTest;->PostSetFocus(Z)V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         invoke-static {v1}, Lcom/ideaworks3d/marmalade/s3eTest;->access$100(Lcom/ideaworks3d/marmalade/s3eTest;)Ljava/lang/Object;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_1
    //         :goto_1
    //         :try_start_1
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/s3eTest;->access$200(Lcom/ideaworks3d/marmalade/s3eTest;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         iget-object v2, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         invoke-static {v2}, Lcom/ideaworks3d/marmalade/s3eTest;->access$100(Lcom/ideaworks3d/marmalade/s3eTest;)Ljava/lang/Object;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :try_start_2
    //         throw v0
    //         :try_end_2
    //         .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         :catch_0
    //         move-exception v0
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eTest;->PostResume()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         iput-object v4, v0, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;
    //         :goto_2
    //         return-void
    //         :cond_0
    //         :try_start_3
    //         monitor-exit v1
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         invoke-virtual {v0}, Lcom/ideaworks3d/marmalade/s3eTest;->PostResume()V
    //         iget-object v0, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         iput-object v4, v0, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;
    //         goto :goto_2
    //         :catchall_1
    //         move-exception v0
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         invoke-virtual {v1}, Lcom/ideaworks3d/marmalade/s3eTest;->PostResume()V
    //         iget-object v1, p0, Lcom/ideaworks3d/marmalade/s3eTest$5;->this$0:Lcom/ideaworks3d/marmalade/s3eTest;
    //         iput-object v4, v1, Lcom/ideaworks3d/marmalade/s3eTest;->thread:Ljava/lang/Thread;
    //         throw v0
    */

}
