package android.support.v4.os

// Auto-emitted from smali source: AsyncTaskCompat.java.
// 0 fields, 2 methods.

open class AsyncTaskCompat {
    public constructor()

    companion object {
    public @JvmStatic fun executeParallel(p0: android.os.AsyncTask, p1: Array<Object>): android.os.AsyncTask { return TODO("body: (Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<Params:",
    //                 "Ljava/lang/Object;",
    //                 "Progress:",
    //                 "Ljava/lang/Object;",
    //                 "Result:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Landroid/os/AsyncTask",
    //                 "<TParams;TProgress;TResult;>;[TParams;)",
    //                 "Landroid/os/AsyncTask",
    //                 "<TParams;TProgress;TResult;>;"
    //             }
    //         .end annotation
    //         .local p0, "task":Landroid/os/AsyncTask;, "Landroid/os/AsyncTask<TParams;TProgress;TResult;>;"
    //         .local p1, "params":[Ljava/lang/Object;, "[TParams;"
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "task can not be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xb
    //         if-lt v0, v1, :cond_1
    //         invoke-static {p0, p1}, Landroid/support/v4/os/AsyncTaskCompatHoneycomb;->executeParallel(Landroid/os/AsyncTask;[Ljava/lang/Object;)V
    //         :goto_0
    //         return-object p0
    //         :cond_1
    //         invoke-virtual {p0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         goto :goto_0
    */

    }
}
