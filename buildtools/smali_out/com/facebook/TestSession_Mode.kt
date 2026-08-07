package com.facebook

// Auto-emitted from smali source: TestSession.java.
// 3 fields, 4 methods.

enum class TestSession_Mode {
    PRIVATE,
    SHARED,
    ;
    // real Java ctor (after implicit name,ordinal): ()
    companion object {
    public @JvmStatic fun valueOf(p0: String): com.facebook.TestSession.Mode { return TODO("body: (Ljava/lang/String;)Lcom/facebook/TestSession$Mode;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/TestSession$Mode;
    //         invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/TestSession$Mode;
    //         return-object v0
    */

    public @JvmStatic fun values(): Array<com.facebook.TestSession.Mode> { return TODO("body: ()[Lcom/facebook/TestSession$Mode;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/TestSession$Mode;->$VALUES:[Lcom/facebook/TestSession$Mode;
    //         invoke-virtual {v0}, [Lcom/facebook/TestSession$Mode;->clone()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Lcom/facebook/TestSession$Mode;
    //         return-object v0
    */

    }
}
