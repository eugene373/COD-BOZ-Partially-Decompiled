package com.google.android.gms.analytics

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class StandardExceptionParser: com.google.android.gms.analytics.ExceptionParser {
    private val Bl: java.util.TreeSet

    public constructor(context: android.content.Context, p1: java.util.Collection)

    protected fun getBestStackTraceElement(t: Throwable): StackTraceElement { return TODO("body: (Ljava/lang/Throwable;)Ljava/lang/StackTraceElement;") }
    /*
    //         .locals 8
    //         const/4 v3, 0x0
    //         invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
    //         move-result-object v4
    //         if-eqz v4, :cond_0
    //         array-length v0, v4
    //         if-nez v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         array-length v5, v4
    //         move v2, v3
    //         :goto_1
    //         if-ge v2, v5, :cond_4
    //         aget-object v1, v4, v2
    //         invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
    //         move-result-object v6
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/StandardExceptionParser;->Bl:Ljava/util/TreeSet;
    //         invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;
    //         move-result-object v7
    //         :cond_2
    //         invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_3
    //         add-int/lit8 v0, v2, 0x1
    //         move v2, v0
    //         goto :goto_1
    //         :cond_4
    //         aget-object v0, v4, v3
    //         goto :goto_0
    */

    protected fun getCause(p0: Throwable): Throwable { return TODO("body: (Ljava/lang/Throwable;)Ljava/lang/Throwable;") }
    /*
    //         .locals 1
    //         :goto_0
    //         invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
    //         move-result-object p1
    //         goto :goto_0
    //         :cond_0
    //         return-object p1
    */

    public fun getDescription(threadName: String, t: Throwable): String { return TODO("body: (Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/analytics/StandardExceptionParser;->getCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //         move-result-object v0
    //         invoke-virtual {p0, p2}, Lcom/google/android/gms/analytics/StandardExceptionParser;->getCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //         move-result-object v1
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/analytics/StandardExceptionParser;->getBestStackTraceElement(Ljava/lang/Throwable;)Ljava/lang/StackTraceElement;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/gms/analytics/StandardExceptionParser;->getDescription(Ljava/lang/Throwable;Ljava/lang/StackTraceElement;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun getDescription(cause: Throwable, element: StackTraceElement, threadName: String): String { return TODO("body: (Ljava/lang/Throwable;Ljava/lang/StackTraceElement;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x1
    //         const/4 v5, 0x0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         if-eqz p2, :cond_1
    //         invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v2, "\\."
    //         invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
    //         move-result-object v2
    //         const-string v0, "unknown"
    //         if-eqz v2, :cond_0
    //         array-length v3, v2
    //         if-lez v3, :cond_0
    //         array-length v0, v2
    //         add-int/lit8 v0, v0, -0x1
    //         aget-object v0, v2, v0
    //         :cond_0
    //         const-string v2, " (@%s:%s:%s)"
    //         const/4 v3, 0x3
    //         new-array v3, v3, [Ljava/lang/Object;
    //         aput-object v0, v3, v5
    //         invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;
    //         move-result-object v0
    //         aput-object v0, v3, v6
    //         const/4 v0, 0x2
    //         invoke-virtual {p2}, Ljava/lang/StackTraceElement;->getLineNumber()I
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v3, v0
    //         invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_1
    //         if-eqz p3, :cond_2
    //         const-string v0, " {%s}"
    //         new-array v2, v6, [Ljava/lang/Object;
    //         aput-object p3, v2, v5
    //         invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_2
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setIncludedPackages(context: android.content.Context, p1: java.util.Collection) { /* TODO(body): (Landroid/content/Context;Ljava/util/Collection;)V */ }
    /*
    //         .locals 7
    //         .local p2, "additionalPackages":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/StandardExceptionParser;->Bl:Ljava/util/TreeSet;
    //         invoke-virtual {v0}, Ljava/util/TreeSet;->clear()V
    //         new-instance v1, Ljava/util/HashSet;
    //         invoke-direct {v1}, Ljava/util/HashSet;-><init>()V
    //         if-eqz p2, :cond_0
    //         invoke-interface {v1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    //         :cond_0
    //         if-eqz p1, :cond_1
    //         :try_start_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/StandardExceptionParser;->Bl:Ljava/util/TreeSet;
    //         invoke-virtual {v2, v0}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v2
    //         const/16 v4, 0xf
    //         invoke-virtual {v2, v0, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v0
    //         iget-object v2, v0, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;
    //         if-eqz v2, :cond_1
    //         array-length v4, v2
    //         move v0, v3
    //         :goto_0
    //         if-ge v0, v4, :cond_1
    //         aget-object v5, v2, v0
    //         iget-object v5, v5, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
    //         invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "No package found"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->U(Ljava/lang/String;)V
    //         :cond_1
    //         invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :cond_2
    //         :goto_1
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/StandardExceptionParser;->Bl:Ljava/util/TreeSet;
    //         invoke-virtual {v2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         move v2, v1
    //         :goto_2
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v6
    //         if-nez v6, :cond_4
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v5
    //         if-eqz v5, :cond_3
    //         iget-object v5, p0, Lcom/google/android/gms/analytics/StandardExceptionParser;->Bl:Ljava/util/TreeSet;
    //         invoke-virtual {v5, v1}, Ljava/util/TreeSet;->remove(Ljava/lang/Object;)Z
    //         :cond_3
    //         if-eqz v2, :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/StandardExceptionParser;->Bl:Ljava/util/TreeSet;
    //         invoke-virtual {v1, v0}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    //         goto :goto_1
    //         :cond_4
    //         move v2, v3
    //         goto :goto_2
    //         :cond_5
    //         return-void
    */

}
