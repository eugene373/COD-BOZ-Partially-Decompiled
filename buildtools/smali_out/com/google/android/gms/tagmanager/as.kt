package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 6 fields, 10 methods.

open class as: Thread(), com.google.android.gms.tagmanager.ar {
    private val apo: java.util.concurrent.LinkedBlockingQueue
    private var apq: com.google.android.gms.tagmanager.at
    private var mClosed: Boolean
    private val mContext: android.content.Context
    private var yU: Boolean

    private constructor(p0: android.content.Context)

    private fun g(p0: Throwable): String { return TODO("body: (Ljava/lang/Throwable;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/io/ByteArrayOutputStream;
    //         invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    //         new-instance v1, Ljava/io/PrintStream;
    //         invoke-direct {v1, v0}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V
    //         invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V
    //         invoke-virtual {v1}, Ljava/io/PrintStream;->flush()V
    //         new-instance v1, Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V
    //         return-object v1
    */

    public fun b(p0: Runnable) { /* TODO(body): (Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/as;->apo:Ljava/util/concurrent/LinkedBlockingQueue;
    //         invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    fun b(p0: String, p1: Long) { /* TODO(body): (Ljava/lang/String;J)V */ }
    /*
    //         .locals 8
    //         new-instance v1, Lcom/google/android/gms/tagmanager/as$1;
    //         move-object v2, p0
    //         move-object v3, p0
    //         move-wide v4, p2
    //         move-object v6, p1
    //         invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/tagmanager/as$1;-><init>(Lcom/google/android/gms/tagmanager/as;Lcom/google/android/gms/tagmanager/ar;JLjava/lang/String;)V
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/tagmanager/as;->b(Ljava/lang/Runnable;)V
    //         return-void
    */

    public fun cC(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v0
    //         invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/tagmanager/as;->b(Ljava/lang/String;J)V
    //         return-void
    */

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         :cond_0
    //         :goto_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/as;->mClosed:Z
    //         if-nez v0, :cond_1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/as;->apo:Ljava/util/concurrent/LinkedBlockingQueue;
    //         invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Runnable;
    //         iget-boolean v1, p0, Lcom/google/android/gms/tagmanager/as;->yU:Z
    //         if-nez v1, :cond_0
    //         invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         :try_start_1
    //         invoke-virtual {v0}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->U(Ljava/lang/String;)V
    //         :try_end_1
    //         .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Error on Google TagManager Thread: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/tagmanager/as;->g(Ljava/lang/Throwable;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         const-string v0, "Google TagManager is shutting down."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->T(Ljava/lang/String;)V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/as;->yU:Z
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    companion object {
    private var app: com.google.android.gms.tagmanager.as

    @JvmStatic fun Z(p0: android.content.Context): com.google.android.gms.tagmanager.as { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/tagmanager/as;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/tagmanager/as;->app:Lcom/google/android/gms/tagmanager/as;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/tagmanager/as;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/as;-><init>(Landroid/content/Context;)V
    //         sput-object v0, Lcom/google/android/gms/tagmanager/as;->app:Lcom/google/android/gms/tagmanager/as;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/tagmanager/as;->app:Lcom/google/android/gms/tagmanager/as;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.tagmanager.as): com.google.android.gms.tagmanager.at { return TODO("body: (Lcom/google/android/gms/tagmanager/as;)Lcom/google/android/gms/tagmanager/at;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/as;->apq:Lcom/google/android/gms/tagmanager/at;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.tagmanager.as, p1: com.google.android.gms.tagmanager.at): com.google.android.gms.tagmanager.at { return TODO("body: (Lcom/google/android/gms/tagmanager/as;Lcom/google/android/gms/tagmanager/at;)Lcom/google/android/gms/tagmanager/at;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/tagmanager/as;->apq:Lcom/google/android/gms/tagmanager/at;
    //         return-object p1
    */

    @JvmStatic fun b(p0: com.google.android.gms.tagmanager.as): android.content.Context { return TODO("body: (Lcom/google/android/gms/tagmanager/as;)Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/as;->mContext:Landroid/content/Context;
    //         return-object v0
    */

    }
}
