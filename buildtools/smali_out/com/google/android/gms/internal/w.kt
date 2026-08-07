package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 9 methods.

open class w: com.google.android.gms.internal.g, Runnable {
    private var lr: com.google.android.gms.internal.u.b
    private val me: java.util.List
    private val mf: java.util.concurrent.atomic.AtomicReference
    var mg: java.util.concurrent.CountDownLatch

    public constructor(p0: com.google.android.gms.internal.u.b)

    private fun ax() { /* TODO(body): ()V */ }
    /*
    //         .locals 8
    //         const/4 v7, 0x1
    //         const/4 v6, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->me:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->me:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :cond_2
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Ljava/lang/Object;
    //         array-length v1, v0
    //         if-ne v1, v7, :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/w;->mf:Ljava/util/concurrent/atomic/AtomicReference;
    //         invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/g;
    //         aget-object v0, v0, v6
    //         check-cast v0, Landroid/view/MotionEvent;
    //         invoke-interface {v1, v0}, Lcom/google/android/gms/internal/g;->a(Landroid/view/MotionEvent;)V
    //         goto :goto_0
    //         :cond_3
    //         array-length v1, v0
    //         const/4 v2, 0x3
    //         if-ne v1, v2, :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/w;->mf:Ljava/util/concurrent/atomic/AtomicReference;
    //         invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/g;
    //         aget-object v2, v0, v6
    //         check-cast v2, Ljava/lang/Integer;
    //         invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    //         move-result v4
    //         aget-object v2, v0, v7
    //         check-cast v2, Ljava/lang/Integer;
    //         invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    //         move-result v2
    //         const/4 v5, 0x2
    //         aget-object v0, v0, v5
    //         check-cast v0, Ljava/lang/Integer;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         invoke-interface {v1, v4, v2, v0}, Lcom/google/android/gms/internal/g;->a(III)V
    //         goto :goto_0
    */

    public fun a(p0: android.content.Context): String { return TODO("body: (Landroid/content/Context;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/w;->aw()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->mf:Ljava/util/concurrent/atomic/AtomicReference;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/g;
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/w;->ax()V
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/g;->a(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, ""
    //         goto :goto_0
    */

    public fun a(p0: android.content.Context, p1: String): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/w;->aw()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->mf:Ljava/util/concurrent/atomic/AtomicReference;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/g;
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/w;->ax()V
    //         invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/g;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, ""
    //         goto :goto_0
    */

    public fun a(p0: Int, p1: Int, p2: Int) { /* TODO(body): (III)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->mf:Ljava/util/concurrent/atomic/AtomicReference;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/g;
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/w;->ax()V
    //         invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/g;->a(III)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->me:Ljava/util/List;
    //         const/4 v1, 0x3
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    */

    public fun a(p0: android.view.MotionEvent) { /* TODO(body): (Landroid/view/MotionEvent;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->mf:Ljava/util/concurrent/atomic/AtomicReference;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/g;
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/w;->ax()V
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/g;->a(Landroid/view/MotionEvent;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->me:Ljava/util/List;
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         aput-object p1, v1, v2
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    */

    protected fun a(p0: com.google.android.gms.internal.g) { /* TODO(body): (Lcom/google/android/gms/internal/g;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->mf:Ljava/util/concurrent/atomic/AtomicReference;
    //         invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    //         return-void
    */

    protected fun aw() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->mg:Ljava/util/concurrent/CountDownLatch;
    //         invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Interrupted during GADSignals creation."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->lr:Lcom/google/android/gms/internal/u$b;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/u$b;->lD:Lcom/google/android/gms/internal/gt;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/gt;->wD:Ljava/lang/String;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/w;->lr:Lcom/google/android/gms/internal/u$b;
    //         iget-object v1, v1, Lcom/google/android/gms/internal/u$b;->lB:Landroid/content/Context;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/j;->a(Ljava/lang/String;Landroid/content/Context;)Lcom/google/android/gms/internal/j;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/w;->a(Lcom/google/android/gms/internal/g;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/w;->mg:Ljava/util/concurrent/CountDownLatch;
    //         invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    //         iput-object v2, p0, Lcom/google/android/gms/internal/w;->lr:Lcom/google/android/gms/internal/u$b;
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/w;->mg:Ljava/util/concurrent/CountDownLatch;
    //         invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    //         iput-object v2, p0, Lcom/google/android/gms/internal/w;->lr:Lcom/google/android/gms/internal/u$b;
    //         throw v0
    */

}
