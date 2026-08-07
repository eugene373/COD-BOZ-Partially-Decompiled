package com.facebook.internal

// Auto-emitted from smali source: Logger.java.
// 6 fields, 15 methods.

open class Logger {
    private val behavior: com.facebook.LoggingBehavior
    private var contents: StringBuilder
    private var priority: Int
    private val tag: String

    public constructor(p0: com.facebook.LoggingBehavior, p1: String)

    private fun shouldLog(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/Logger;->behavior:Lcom/facebook/LoggingBehavior;
    //         invoke-static {v0}, Lcom/facebook/Settings;->isLoggingBehaviorEnabled(Lcom/facebook/LoggingBehavior;)Z
    //         move-result v0
    //         return v0
    */

    public fun append(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/facebook/internal/Logger;->shouldLog()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/Logger;->contents:Ljava/lang/StringBuilder;
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_0
    //         return-void
    */

    public fun append(p0: String, p1: Array<Object>) { /* TODO(body): (Ljava/lang/String;[Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/facebook/internal/Logger;->shouldLog()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/Logger;->contents:Ljava/lang/StringBuilder;
    //         invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_0
    //         return-void
    */

    public fun append(p0: StringBuilder) { /* TODO(body): (Ljava/lang/StringBuilder;)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/facebook/internal/Logger;->shouldLog()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/Logger;->contents:Ljava/lang/StringBuilder;
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    //         :cond_0
    //         return-void
    */

    public fun appendKeyValue(p0: String, p1: Object) { /* TODO(body): (Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "  %s:\t%s\n"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         aput-object p1, v1, v2
    //         const/4 v2, 0x1
    //         aput-object p2, v1, v2
    //         invoke-virtual {p0, v0, v1}, Lcom/facebook/internal/Logger;->append(Ljava/lang/String;[Ljava/lang/Object;)V
    //         return-void
    */

    public fun getContents(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/Logger;->contents:Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Logger;->replaceStrings(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPriority(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/internal/Logger;->priority:I
    //         return v0
    */

    public fun log() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/Logger;->contents:Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/internal/Logger;->logString(Ljava/lang/String;)V
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         iput-object v0, p0, Lcom/facebook/internal/Logger;->contents:Ljava/lang/StringBuilder;
    //         return-void
    */

    public fun logString(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/internal/Logger;->behavior:Lcom/facebook/LoggingBehavior;
    //         iget v1, p0, Lcom/facebook/internal/Logger;->priority:I
    //         iget-object v2, p0, Lcom/facebook/internal/Logger;->tag:Ljava/lang/String;
    //         invoke-static {v0, v1, v2, p1}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setPriority(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 10
    //         const/4 v9, 0x6
    //         const/4 v8, 0x5
    //         const/4 v7, 0x4
    //         const/4 v6, 0x3
    //         const/4 v5, 0x2
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         const-string v1, "value"
    //         new-array v2, v9, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         const/4 v4, 0x7
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x1
    //         invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v2, v5
    //         invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v2, v6
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v2, v7
    //         invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v2, v8
    //         invoke-static {v0, v1, v2}, Lcom/facebook/internal/Validate;->oneOf(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    //         iput p1, p0, Lcom/facebook/internal/Logger;->priority:I
    //         return-void
    */

    companion object {
    @JvmField public val LOG_TAG_BASE: String = "FacebookSDK."
    private val stringsToReplace: java.util.HashMap = null!!

    public @JvmStatic fun log(p0: com.facebook.LoggingBehavior, p1: Int, p2: String, p3: String) { /* TODO(body): (Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/facebook/Settings;->isLoggingBehaviorEnabled(Lcom/facebook/LoggingBehavior;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-static {p3}, Lcom/facebook/internal/Logger;->replaceStrings(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "FacebookSDK."
    //         invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "FacebookSDK."
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object p2
    //         :cond_0
    //         invoke-static {p1, p2, v0}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->DEVELOPER_ERRORS:Lcom/facebook/LoggingBehavior;
    //         if-ne p0, v0, :cond_1
    //         new-instance v0, Ljava/lang/Exception;
    //         invoke-direct {v0}, Ljava/lang/Exception;-><init>()V
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         :cond_1
    //         return-void
    */

    public @JvmStatic fun log(p0: com.facebook.LoggingBehavior, p1: String, p2: String) { /* TODO(body): (Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x3
    //         invoke-static {p0, v0, p1, p2}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public @JvmStatic fun log(p0: com.facebook.LoggingBehavior, p1: String, p2: String, p3: Array<Object>) { /* TODO(body): (Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/facebook/Settings;->isLoggingBehaviorEnabled(Lcom/facebook/LoggingBehavior;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x3
    //         invoke-static {p0, v1, p1, v0}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         return-void
    */

    }
}
