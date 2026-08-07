package com.amazon.device.iap.internal.b

// Auto-emitted from smali source: KiwiRequestContext.java.
// 2 fields, 7 methods.

open class h {
    public val a: java.util.Map

    public constructor()

    public fun a(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/h;->a:Ljava/util/Map;
    //         const-string v1, "RESPONSE"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun a(p0: String): Object { return TODO("body: (Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/h;->a:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun a(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         sget-boolean v0, Lcom/amazon/device/iap/internal/b/h;->b:Z
    //         if-nez v0, :cond_0
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/AssertionError;
    //         invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/h;->a:Ljava/util/Map;
    //         const-string v1, "RESPONSE"
    //         invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun a(p0: String, p1: Object) { /* TODO(body): (Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/h;->a:Ljava/util/Map;
    //         invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun b() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/h;->a:Ljava/util/Map;
    //         const-string v1, "RESPONSE"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    companion object {
    val b: Boolean = false
    }
}
