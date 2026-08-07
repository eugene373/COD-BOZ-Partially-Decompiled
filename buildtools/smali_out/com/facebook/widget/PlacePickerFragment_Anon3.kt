package com.facebook.widget

// Auto-emitted from smali source: PlacePickerFragment.java.
// 1 fields, 2 methods.

open class PlacePickerFragment_Anon3: Runnable {
    val this$0: com.facebook.widget.PlacePickerFragment

    constructor(p0: com.facebook.widget.PlacePickerFragment)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         const/4 v6, 0x0
    //         const/4 v5, 0x1
    //         const/4 v1, 0x0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v2}, Lcom/facebook/widget/PlacePickerFragment;->loadData(Z)V
    //         :try_end_0
    //         .catch Lcom/facebook/FacebookException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         invoke-virtual {v0}, Lcom/facebook/widget/PlacePickerFragment;->getOnErrorListener()Lcom/facebook/widget/PickerFragment$OnErrorListener;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v2, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         invoke-interface {v0, v2, v1}, Lcom/facebook/widget/PickerFragment$OnErrorListener;->onError(Lcom/facebook/widget/PickerFragment;Lcom/facebook/FacebookException;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const-string v2, "PlacePickerFragment"
    //         const-string v3, "Error loading data : %s"
    //         new-array v4, v5, [Ljava/lang/Object;
    //         aput-object v1, v4, v6
    //         invoke-static {v0, v2, v3, v4}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         invoke-virtual {v1}, Lcom/facebook/widget/PlacePickerFragment;->getOnErrorListener()Lcom/facebook/widget/PickerFragment$OnErrorListener;
    //         move-result-object v1
    //         if-eqz v1, :cond_2
    //         iget-object v2, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         invoke-interface {v1, v2, v0}, Lcom/facebook/widget/PickerFragment$OnErrorListener;->onError(Lcom/facebook/widget/PickerFragment;Lcom/facebook/FacebookException;)V
    //         goto :goto_0
    //         :cond_2
    //         sget-object v1, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const-string v2, "PlacePickerFragment"
    //         const-string v3, "Error loading data : %s"
    //         new-array v4, v5, [Ljava/lang/Object;
    //         aput-object v0, v4, v6
    //         invoke-static {v1, v2, v3, v4}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         :try_start_1
    //         new-instance v2, Lcom/facebook/FacebookException;
    //         invoke-direct {v2, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         if-eqz v2, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         invoke-virtual {v0}, Lcom/facebook/widget/PlacePickerFragment;->getOnErrorListener()Lcom/facebook/widget/PickerFragment$OnErrorListener;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         iget-object v1, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         invoke-interface {v0, v1, v2}, Lcom/facebook/widget/PickerFragment$OnErrorListener;->onError(Lcom/facebook/widget/PickerFragment;Lcom/facebook/FacebookException;)V
    //         goto :goto_0
    //         :cond_3
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const-string v1, "PlacePickerFragment"
    //         const-string v3, "Error loading data : %s"
    //         new-array v4, v5, [Ljava/lang/Object;
    //         aput-object v2, v4, v6
    //         invoke-static {v0, v1, v3, v4}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         if-eqz v1, :cond_4
    //         iget-object v2, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         invoke-virtual {v2}, Lcom/facebook/widget/PlacePickerFragment;->getOnErrorListener()Lcom/facebook/widget/PickerFragment$OnErrorListener;
    //         move-result-object v2
    //         if-eqz v2, :cond_5
    //         iget-object v3, p0, Lcom/facebook/widget/PlacePickerFragment$3;->this$0:Lcom/facebook/widget/PlacePickerFragment;
    //         invoke-interface {v2, v3, v1}, Lcom/facebook/widget/PickerFragment$OnErrorListener;->onError(Lcom/facebook/widget/PickerFragment;Lcom/facebook/FacebookException;)V
    //         :cond_4
    //         :goto_1
    //         throw v0
    //         :cond_5
    //         sget-object v2, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;
    //         const-string v3, "PlacePickerFragment"
    //         const-string v4, "Error loading data : %s"
    //         new-array v5, v5, [Ljava/lang/Object;
    //         aput-object v1, v5, v6
    //         invoke-static {v2, v3, v4, v5}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         goto :goto_1
    */

}
