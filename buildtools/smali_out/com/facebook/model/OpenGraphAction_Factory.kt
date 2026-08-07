package com.facebook.model

// Auto-emitted from smali source: OpenGraphAction.java.
// 0 fields, 4 methods.

class OpenGraphAction_Factory {
    public constructor()

    companion object {
    public @JvmStatic fun createForPost(): com.facebook.model.OpenGraphAction { return TODO("body: ()Lcom/facebook/model/OpenGraphAction;") }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         const-class v0, Lcom/facebook/model/OpenGraphAction;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/facebook/model/OpenGraphAction$Factory;->createForPost(Ljava/lang/Class;Ljava/lang/String;)Lcom/facebook/model/OpenGraphAction;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun createForPost(p0: Class, p1: String): com.facebook.model.OpenGraphAction { return TODO("body: (Ljava/lang/Class;Ljava/lang/String;)Lcom/facebook/model/OpenGraphAction;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/facebook/model/OpenGraphAction;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;",
    //                 "Ljava/lang/String;",
    //                 ")TT;"
    //             }
    //         .end annotation
    //         invoke-static {p0}, Lcom/facebook/model/GraphObject$Factory;->create(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/OpenGraphAction;
    //         if-eqz p1, :cond_0
    //         invoke-interface {v0, p1}, Lcom/facebook/model/OpenGraphAction;->setType(Ljava/lang/String;)V
    //         :cond_0
    //         return-object v0
    */

    public @JvmStatic fun createForPost(p0: String): com.facebook.model.OpenGraphAction { return TODO("body: (Ljava/lang/String;)Lcom/facebook/model/OpenGraphAction;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/model/OpenGraphAction;
    //         invoke-static {v0, p0}, Lcom/facebook/model/OpenGraphAction$Factory;->createForPost(Ljava/lang/Class;Ljava/lang/String;)Lcom/facebook/model/OpenGraphAction;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
