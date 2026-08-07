package com.facebook

// Auto-emitted from smali source: TestSession.java.
// 1 fields, 5 methods.

class TestSession_TestTokenCachingStrategy: com.facebook.TokenCachingStrategy() {
    private var bundle: android.os.Bundle

    private constructor()

    constructor(p0: com.facebook.TestSession.1)

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/TestSession$TestTokenCachingStrategy;->bundle:Landroid/os/Bundle;
    //         return-void
    */

    public fun load(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/TestSession$TestTokenCachingStrategy;->bundle:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun save(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/TestSession$TestTokenCachingStrategy;->bundle:Landroid/os/Bundle;
    //         return-void
    */

}
