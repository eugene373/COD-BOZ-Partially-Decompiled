package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 3 methods.

class gi {
    companion object {
    private val wh: java.util.concurrent.ThreadFactory = null!!
    private val wi: java.util.concurrent.ExecutorService = null!!

    public @JvmStatic fun a(p0: Runnable): java.util.concurrent.Future { return TODO("body: (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Runnable;",
    //                 ")",
    //                 "Ljava/util/concurrent/Future",
    //                 "<",
    //                 "Ljava/lang/Void;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/gi$1;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/gi$1;-><init>(Ljava/lang/Runnable;)V
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gi;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun submit(p0: java.util.concurrent.Callable): java.util.concurrent.Future { return TODO("body: (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/util/concurrent/Callable",
    //                 "<TT;>;)",
    //                 "Ljava/util/concurrent/Future",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         .local p0, "callable":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TT;>;"
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/internal/gi;->wi:Ljava/util/concurrent/ExecutorService;
    //         new-instance v1, Lcom/google/android/gms/internal/gi$2;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/gi$2;-><init>(Ljava/util/concurrent/Callable;)V
    //         invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //         :try_end_0
    //         .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Thread execution is rejected."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         new-instance v0, Lcom/google/android/gms/internal/gl;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gl;-><init>(Ljava/lang/Object;)V
    //         goto :goto_0
    */

    }
}
