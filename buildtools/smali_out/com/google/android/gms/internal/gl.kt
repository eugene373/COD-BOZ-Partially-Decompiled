package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class gl: java.util.concurrent.Future {
    private val wq: Object

    public constructor(p0: Object)

    public fun cancel(mayInterruptIfRunning: Boolean): Boolean { return TODO("body: (Z)Z") }
    /*
    //         .locals 1
    //         .local p0, "this":Lcom/google/android/gms/internal/gl;, "Lcom/google/android/gms/internal/gl<TT;>;"
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun get(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TT;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gl;->wq:Ljava/lang/Object;
    //         return-object v0
    */

    public fun get(timeout: Long, unit: java.util.concurrent.TimeUnit): Object { return TODO("body: (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Lcom/google/android/gms/internal/gl;, "Lcom/google/android/gms/internal/gl<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gl;->wq:Ljava/lang/Object;
    //         return-object v0
    */

    public fun isCancelled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isDone(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

}
