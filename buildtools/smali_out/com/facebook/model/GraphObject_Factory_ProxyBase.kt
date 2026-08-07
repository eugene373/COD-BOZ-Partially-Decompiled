package com.facebook.model

// Auto-emitted from smali source: GraphObject.java.
// 3 fields, 3 methods.

open class GraphObject_Factory_ProxyBase: java.lang.reflect.InvocationHandler {
    protected val state: Object

    protected constructor(p0: Object)

    protected fun proxyObjectMethods(p0: Object, p1: java.lang.reflect.Method, p2: Array<Object>): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/Throwable;
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "equals"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         aget-object v0, p3, v2
    //         if-nez v0, :cond_0
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {v0}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;
    //         move-result-object v0
    //         instance-of v1, v0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;
    //         if-nez v1, :cond_1
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_1
    //         check-cast v0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;
    //         iget-object v1, p0, Lcom/facebook/model/GraphObject$Factory$ProxyBase;->state:Ljava/lang/Object;
    //         iget-object v0, v0, Lcom/facebook/model/GraphObject$Factory$GraphObjectProxy;->state:Ljava/lang/Object;
    //         invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_2
    //         const-string v1, "toString"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_3
    //         iget-object v0, p0, Lcom/facebook/model/GraphObject$Factory$ProxyBase;->state:Ljava/lang/Object;
    //         invoke-virtual {p2, v0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         goto :goto_0
    */

    protected fun throwUnexpectedMethodSignature(p0: java.lang.reflect.Method): Object { return TODO("body: (Ljava/lang/reflect/Method;)Ljava/lang/Object;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/facebook/FacebookGraphObjectException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " got an unexpected method signature: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookGraphObjectException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    companion object {
    private val EQUALS_METHOD: String = "equals"
    private val TOSTRING_METHOD: String = "toString"
    }
}
