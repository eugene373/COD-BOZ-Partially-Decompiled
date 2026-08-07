package com.amazon.device.iap.internal

// Auto-emitted from smali source: ImplementationFactory.java.
// 6 fields, 7 methods.

class e {
    public constructor()

    companion object {
    private val a: String = null!!
    private var b: Boolean
    private var c: Boolean
    private var d: com.amazon.device.iap.internal.c
    private var e: com.amazon.device.iap.internal.a
    private var f: com.amazon.device.iap.internal.b

    private @JvmStatic fun a(p0: Class): Object { return TODO("body: (Ljava/lang/Class;)Ljava/lang/Object;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;)TT;"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/e;->d()Lcom/amazon/device/iap/internal/b;
    //         move-result-object v1
    //         invoke-interface {v1, p0}, Lcom/amazon/device/iap/internal/b;->a(Ljava/lang/Class;)Ljava/lang/Class;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         sget-object v2, Lcom/amazon/device/iap/internal/e;->a:Ljava/lang/String;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "error getting instance for "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    */

    public @JvmStatic fun a(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         sget-boolean v0, Lcom/amazon/device/iap/internal/e;->c:Z
    //         if-eqz v0, :cond_0
    //         sget-boolean v0, Lcom/amazon/device/iap/internal/e;->b:Z
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-class v1, Lcom/amazon/device/iap/internal/e;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-boolean v0, Lcom/amazon/device/iap/internal/e;->c:Z
    //         if-eqz v0, :cond_1
    //         sget-boolean v0, Lcom/amazon/device/iap/internal/e;->b:Z
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_1
    //         const-class v0, Lcom/amazon/device/iap/internal/e;
    //         invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v0
    //         const-string v2, "com.amazon.android.Kiwi"
    //         invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    //         const/4 v0, 0x0
    //         sput-boolean v0, Lcom/amazon/device/iap/internal/e;->b:Z
    //         :try_end_1
    //         .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :goto_1
    //         const/4 v0, 0x1
    //         :try_start_2
    //         sput-boolean v0, Lcom/amazon/device/iap/internal/e;->c:Z
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         sget-boolean v0, Lcom/amazon/device/iap/internal/e;->b:Z
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x1
    //         :try_start_3
    //         sput-boolean v0, Lcom/amazon/device/iap/internal/e;->b:Z
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         goto :goto_1
    */

    public @JvmStatic fun b(): com.amazon.device.iap.internal.c { return TODO("body: ()Lcom/amazon/device/iap/internal/c;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/amazon/device/iap/internal/e;->d:Lcom/amazon/device/iap/internal/c;
    //         if-nez v0, :cond_1
    //         const-class v1, Lcom/amazon/device/iap/internal/e;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/amazon/device/iap/internal/e;->d:Lcom/amazon/device/iap/internal/c;
    //         if-nez v0, :cond_0
    //         const-class v0, Lcom/amazon/device/iap/internal/c;
    //         invoke-static {v0}, Lcom/amazon/device/iap/internal/e;->a(Ljava/lang/Class;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/internal/c;
    //         sput-object v0, Lcom/amazon/device/iap/internal/e;->d:Lcom/amazon/device/iap/internal/c;
    //         :cond_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_1
    //         sget-object v0, Lcom/amazon/device/iap/internal/e;->d:Lcom/amazon/device/iap/internal/c;
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun c(): com.amazon.device.iap.internal.a { return TODO("body: ()Lcom/amazon/device/iap/internal/a;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/amazon/device/iap/internal/e;->e:Lcom/amazon/device/iap/internal/a;
    //         if-nez v0, :cond_1
    //         const-class v1, Lcom/amazon/device/iap/internal/e;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/amazon/device/iap/internal/e;->e:Lcom/amazon/device/iap/internal/a;
    //         if-nez v0, :cond_0
    //         const-class v0, Lcom/amazon/device/iap/internal/a;
    //         invoke-static {v0}, Lcom/amazon/device/iap/internal/e;->a(Ljava/lang/Class;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/amazon/device/iap/internal/a;
    //         sput-object v0, Lcom/amazon/device/iap/internal/e;->e:Lcom/amazon/device/iap/internal/a;
    //         :cond_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_1
    //         sget-object v0, Lcom/amazon/device/iap/internal/e;->e:Lcom/amazon/device/iap/internal/a;
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    private @JvmStatic fun d(): com.amazon.device.iap.internal.b { return TODO("body: ()Lcom/amazon/device/iap/internal/b;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/amazon/device/iap/internal/e;->f:Lcom/amazon/device/iap/internal/b;
    //         if-nez v0, :cond_1
    //         const-class v1, Lcom/amazon/device/iap/internal/e;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/amazon/device/iap/internal/e;->f:Lcom/amazon/device/iap/internal/b;
    //         if-nez v0, :cond_0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/e;->a()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         new-instance v0, Lcom/amazon/device/iap/internal/a/d;
    //         invoke-direct {v0}, Lcom/amazon/device/iap/internal/a/d;-><init>()V
    //         sput-object v0, Lcom/amazon/device/iap/internal/e;->f:Lcom/amazon/device/iap/internal/b;
    //         :cond_0
    //         :goto_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_1
    //         sget-object v0, Lcom/amazon/device/iap/internal/e;->f:Lcom/amazon/device/iap/internal/b;
    //         return-object v0
    //         :cond_2
    //         :try_start_1
    //         new-instance v0, Lcom/amazon/device/iap/internal/b/g;
    //         invoke-direct {v0}, Lcom/amazon/device/iap/internal/b/g;-><init>()V
    //         sput-object v0, Lcom/amazon/device/iap/internal/e;->f:Lcom/amazon/device/iap/internal/b;
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    }
}
