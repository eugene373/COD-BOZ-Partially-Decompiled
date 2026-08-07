package android.support.v4.text

// Auto-emitted from smali source: ICUCompatIcs.java.
// 3 fields, 4 methods.

open class ICUCompatIcs {
    constructor()

    companion object {
    private val TAG: String = "ICUCompatIcs"
    private var sAddLikelySubtagsMethod: java.lang.reflect.Method
    private var sGetScriptMethod: java.lang.reflect.Method

    public @JvmStatic fun addLikelySubtags(locale: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         :try_start_0
    //         sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sAddLikelySubtagsMethod:Ljava/lang/reflect/Method;
    //         if-eqz v2, :cond_0
    //         const/4 v2, 0x1
    //         new-array v0, v2, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         aput-object p0, v0, v2
    //         .local v0, "args":[Ljava/lang/Object;
    //         sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sAddLikelySubtagsMethod:Ljava/lang/reflect/Method;
    //         const/4 v3, 0x0
    //         invoke-virtual {v2, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    //         .end local v0    # "args":[Ljava/lang/Object;
    //         :goto_0
    //         return-object v2
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/IllegalAccessException;
    //         const-string v2, "ICUCompatIcs"
    //         invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
    //         .end local v1    # "e":Ljava/lang/IllegalAccessException;
    //         :cond_0
    //         :goto_1
    //         move-object v2, p0
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/reflect/InvocationTargetException;
    //         const-string v2, "ICUCompatIcs"
    //         invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_1
    */

    public @JvmStatic fun getScript(locale: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 5
    //         const/4 v3, 0x0
    //         :try_start_0
    //         sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sGetScriptMethod:Ljava/lang/reflect/Method;
    //         if-eqz v2, :cond_0
    //         const/4 v2, 0x1
    //         new-array v0, v2, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         aput-object p0, v0, v2
    //         .local v0, "args":[Ljava/lang/Object;
    //         sget-object v2, Landroid/support/v4/text/ICUCompatIcs;->sGetScriptMethod:Ljava/lang/reflect/Method;
    //         const/4 v4, 0x0
    //         invoke-virtual {v2, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    //         .end local v0    # "args":[Ljava/lang/Object;
    //         :goto_0
    //         return-object v2
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/IllegalAccessException;
    //         const-string v2, "ICUCompatIcs"
    //         invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
    //         .end local v1    # "e":Ljava/lang/IllegalAccessException;
    //         :cond_0
    //         :goto_1
    //         move-object v2, v3
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/reflect/InvocationTargetException;
    //         const-string v2, "ICUCompatIcs"
    //         invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_1
    */

    }
}
