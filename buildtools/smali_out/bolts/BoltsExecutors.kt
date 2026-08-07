package bolts

// Auto-emitted from smali source: BoltsExecutors.java.
// 3 fields, 5 methods.

class BoltsExecutors {
    private val background: java.util.concurrent.ExecutorService
    private val immediate: java.util.concurrent.Executor

    private constructor()

    companion object {
    private val INSTANCE: bolts.BoltsExecutors = null!!

    public @JvmStatic fun background(): java.util.concurrent.ExecutorService { return TODO("body: ()Ljava/util/concurrent/ExecutorService;") }
    /*
    //         .locals 1
    //         sget-object v0, Lbolts/BoltsExecutors;->INSTANCE:Lbolts/BoltsExecutors;
    //         iget-object v0, v0, Lbolts/BoltsExecutors;->background:Ljava/util/concurrent/ExecutorService;
    //         return-object v0
    */

    @JvmStatic fun immediate(): java.util.concurrent.Executor { return TODO("body: ()Ljava/util/concurrent/Executor;") }
    /*
    //         .locals 1
    //         sget-object v0, Lbolts/BoltsExecutors;->INSTANCE:Lbolts/BoltsExecutors;
    //         iget-object v0, v0, Lbolts/BoltsExecutors;->immediate:Ljava/util/concurrent/Executor;
    //         return-object v0
    */

    private @JvmStatic fun isAndroidRuntime(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const-string v1, "java.runtime.name"
    //         invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "javaRuntimeName":Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         const/4 v1, 0x0
    //         :goto_0
    //         return v1
    //         :cond_0
    //         sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "android"
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         goto :goto_0
    */

    }
}
