package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 11 methods.

open class ey: java.lang.Thread.UncaughtExceptionHandler {
    private var mContext: android.content.Context
    private var sR: java.lang.Thread.UncaughtExceptionHandler
    private var sS: java.lang.Thread.UncaughtExceptionHandler
    private var sT: com.google.android.gms.internal.gt

    public constructor(p0: android.content.Context, p1: com.google.android.gms.internal.gt, p2: java.lang.Thread.UncaughtExceptionHandler, p3: java.lang.Thread.UncaughtExceptionHandler)

    private fun cw(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;
    //         sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    private fun d(p0: Throwable): Throwable { return TODO("body: (Ljava/lang/Throwable;)Ljava/lang/Throwable;") }
    /*
    //         .locals 14
    //         const/4 v3, 0x1
    //         const/4 v5, 0x0
    //         invoke-static {}, Lcom/google/android/gms/internal/gb;->bD()Landroid/os/Bundle;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const-string v1, "gads:sdk_crash_report_full_stacktrace"
    //         invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-object p1
    //         :cond_0
    //         new-instance v6, Ljava/util/LinkedList;
    //         invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V
    //         :goto_1
    //         if-eqz p1, :cond_1
    //         invoke-virtual {v6, p1}, Ljava/util/LinkedList;->push(Ljava/lang/Object;)V
    //         invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
    //         move-result-object p1
    //         goto :goto_1
    //         :cond_1
    //         const/4 v2, 0x0
    //         :goto_2
    //         invoke-virtual {v6}, Ljava/util/LinkedList;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_6
    //         invoke-virtual {v6}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Throwable;
    //         invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
    //         move-result-object v7
    //         new-instance v8, Ljava/util/ArrayList;
    //         invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
    //         new-instance v1, Ljava/lang/StackTraceElement;
    //         invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v4
    //         const-string v9, "<filtered>"
    //         const-string v10, "<filtered>"
    //         invoke-direct {v1, v4, v9, v10, v3}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         array-length v9, v7
    //         move v4, v5
    //         move v1, v5
    //         :goto_3
    //         if-ge v4, v9, :cond_4
    //         aget-object v10, v7, v4
    //         invoke-virtual {v10}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
    //         move-result-object v11
    //         invoke-virtual {p0, v11}, Lcom/google/android/gms/internal/ey;->G(Ljava/lang/String;)Z
    //         move-result v11
    //         if-eqz v11, :cond_2
    //         invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         move v1, v3
    //         :goto_4
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_3
    //         :cond_2
    //         invoke-virtual {v10}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
    //         move-result-object v11
    //         invoke-virtual {p0, v11}, Lcom/google/android/gms/internal/ey;->H(Ljava/lang/String;)Z
    //         move-result v11
    //         if-eqz v11, :cond_3
    //         invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_4
    //         :cond_3
    //         new-instance v10, Ljava/lang/StackTraceElement;
    //         const-string v11, "<filtered>"
    //         const-string v12, "<filtered>"
    //         const-string v13, "<filtered>"
    //         invoke-direct {v10, v11, v12, v13, v3}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_4
    //         :cond_4
    //         if-eqz v1, :cond_7
    //         if-nez v2, :cond_5
    //         new-instance v1, Ljava/lang/Throwable;
    //         invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
    //         :goto_5
    //         new-array v0, v5, [Ljava/lang/StackTraceElement;
    //         invoke-virtual {v8, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Ljava/lang/StackTraceElement;
    //         invoke-virtual {v1, v0}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V
    //         :goto_6
    //         move-object v2, v1
    //         goto :goto_2
    //         :cond_5
    //         new-instance v1, Ljava/lang/Throwable;
    //         invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_5
    //         :cond_6
    //         move-object p1, v2
    //         goto/16 :goto_0
    //         :cond_7
    //         move-object v1, v2
    //         goto :goto_6
    */

    protected fun G(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v0, 0x0
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v2, "com.google.android.gms.ads"
    //         invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         move v0, v1
    //         goto :goto_0
    //         :cond_1
    //         const-string v2, "com.google.ads"
    //         invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         :try_start_0
    //         invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    //         move-result-object v1
    //         const-class v2, Lcom/google/android/gms/internal/ez;
    //         invoke-virtual {v1, v2}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Fail to check class type for class "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2, v1}, Lcom/google/android/gms/internal/gs;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    protected fun H(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const-string v1, "android."
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_2
    //         const-string v1, "java."
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         :cond_2
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    protected fun a(p0: Throwable): Boolean { return TODO("body: (Ljava/lang/Throwable;)Z") }
    /*
    //         .locals 9
    //         const/4 v1, 0x1
    //         const/4 v3, 0x0
    //         if-nez p1, :cond_0
    //         :goto_0
    //         return v3
    //         :cond_0
    //         move v2, v3
    //         move v0, v3
    //         :goto_1
    //         if-eqz p1, :cond_4
    //         invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
    //         move-result-object v5
    //         array-length v6, v5
    //         move v4, v3
    //         :goto_2
    //         if-ge v4, v6, :cond_3
    //         aget-object v7, v5, v4
    //         invoke-virtual {v7}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
    //         move-result-object v8
    //         invoke-virtual {p0, v8}, Lcom/google/android/gms/internal/ey;->G(Ljava/lang/String;)Z
    //         move-result v8
    //         if-eqz v8, :cond_1
    //         move v0, v1
    //         :cond_1
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v8
    //         invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v8
    //         invoke-virtual {v7}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
    //         move-result-object v7
    //         invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v7
    //         if-eqz v7, :cond_2
    //         move v2, v1
    //         :cond_2
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_2
    //         :cond_3
    //         invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
    //         move-result-object p1
    //         goto :goto_1
    //         :cond_4
    //         if-eqz v0, :cond_5
    //         if-nez v2, :cond_5
    //         :goto_3
    //         move v3, v1
    //         goto :goto_0
    //         :cond_5
    //         move v1, v3
    //         goto :goto_3
    */

    public fun b(p0: Throwable) { /* TODO(body): (Ljava/lang/Throwable;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ey;->mContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ey;->k(Landroid/content/Context;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ey;->d(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ey;->c(Ljava/lang/Throwable;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ey;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ey;->sT:Lcom/google/android/gms/internal/gt;
    //         iget-object v2, v2, Lcom/google/android/gms/internal/gt;->wD:Ljava/lang/String;
    //         invoke-static {}, Lcom/google/android/gms/internal/gb;->de()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v0, v2, v1, v3}, Lcom/google/android/gms/internal/gj;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    //         goto :goto_0
    */

    protected fun c(p0: Throwable): String { return TODO("body: (Ljava/lang/Throwable;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         new-instance v0, Ljava/io/StringWriter;
    //         invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V
    //         new-instance v1, Ljava/io/PrintWriter;
    //         invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V
    //         invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
    //         new-instance v1, Landroid/net/Uri$Builder;
    //         invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V
    //         const-string v2, "https"
    //         invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v1
    //         const-string v2, "//pagead2.googlesyndication.com/pagead/gen_204"
    //         invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v1
    //         const-string v2, "id"
    //         const-string v3, "gmob-apps-report-exception"
    //         invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v1
    //         const-string v2, "os"
    //         sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
    //         invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v1
    //         const-string v2, "api"
    //         sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    //         invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v1
    //         const-string v2, "device"
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ey;->cw()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v1
    //         const-string v2, "js"
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ey;->sT:Lcom/google/android/gms/internal/gt;
    //         iget-object v3, v3, Lcom/google/android/gms/internal/gt;->wD:Ljava/lang/String;
    //         invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v1
    //         const-string v2, "appid"
    //         iget-object v3, p0, Lcom/google/android/gms/internal/ey;->mContext:Landroid/content/Context;
    //         invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v3
    //         invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v1
    //         const-string v2, "stacktrace"
    //         invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v2, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/net/Uri$Builder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun uncaughtException(thread: Thread, exception: Throwable) { /* TODO(body): (Ljava/lang/Thread;Ljava/lang/Throwable;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ey;->a(Ljava/lang/Throwable;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ey;->b(Ljava/lang/Throwable;)V
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;
    //         move-result-object v0
    //         if-eq v0, p1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ey;->sR:Ljava/lang/Thread$UncaughtExceptionHandler;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ey;->sR:Ljava/lang/Thread$UncaughtExceptionHandler;
    //         invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ey;->sS:Ljava/lang/Thread$UncaughtExceptionHandler;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ey;->sS:Ljava/lang/Thread$UncaughtExceptionHandler;
    //         invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    companion object {
    public @JvmStatic fun a(p0: android.content.Context, p1: Thread, p2: com.google.android.gms.internal.gt): com.google.android.gms.internal.ey { return TODO("body: (Landroid/content/Context;Ljava/lang/Thread;Lcom/google/android/gms/internal/gt;)Lcom/google/android/gms/internal/ey;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         if-eqz p0, :cond_0
    //         if-eqz p1, :cond_0
    //         if-nez p2, :cond_1
    //         :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         invoke-static {}, Lcom/google/android/gms/internal/gb;->bD()Landroid/os/Bundle;
    //         invoke-static {p0}, Lcom/google/android/gms/internal/ey;->k(Landroid/content/Context;)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_2
    //         invoke-virtual {p1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
    //         move-result-object v0
    //         invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
    //         move-result-object v3
    //         new-instance v2, Lcom/google/android/gms/internal/ey;
    //         invoke-direct {v2, p0, p2, v0, v3}, Lcom/google/android/gms/internal/ey;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/gt;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/lang/Thread$UncaughtExceptionHandler;)V
    //         if-eqz v0, :cond_3
    //         instance-of v3, v0, Lcom/google/android/gms/internal/ey;
    //         if-nez v3, :cond_4
    //         :cond_3
    //         :try_start_0
    //         invoke-virtual {p1, v2}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    //         :try_end_0
    //         .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-object v0, v2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v2, "Fail to set UncaughtExceptionHandler."
    //         invoke-static {v2, v0}, Lcom/google/android/gms/internal/gs;->c(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_4
    //         check-cast v0, Lcom/google/android/gms/internal/ey;
    //         goto :goto_0
    */

    private @JvmStatic fun k(p0: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         invoke-static {}, Lcom/google/android/gms/internal/gb;->bD()Landroid/os/Bundle;
    //         move-result-object v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const-string v2, "gads:sdk_crash_report_enabled"
    //         invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    }
}
