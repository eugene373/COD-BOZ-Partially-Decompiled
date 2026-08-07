package com.facebook.model

// Auto-emitted from smali source: OpenGraphObject.java.
// 0 fields, 4 methods.

class OpenGraphObject_Factory {
    public constructor()

    companion object {
    public @JvmStatic fun createForPost(p0: Class, p1: String): com.facebook.model.OpenGraphObject { return TODO("body: (Ljava/lang/Class;Ljava/lang/String;)Lcom/facebook/model/OpenGraphObject;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/facebook/model/OpenGraphObject;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;",
    //                 "Ljava/lang/String;",
    //                 ")TT;"
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v3, v2
    //         move-object v4, v2
    //         move-object v5, v2
    //         invoke-static/range {v0 .. v5}, Lcom/facebook/model/OpenGraphObject$Factory;->createForPost(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/model/OpenGraphObject;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun createForPost(p0: Class, p1: String, p2: String, p3: String, p4: String, p5: String): com.facebook.model.OpenGraphObject { return TODO("body: (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/model/OpenGraphObject;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Lcom/facebook/model/OpenGraphObject;",
    //                 ">(",
    //                 "Ljava/lang/Class",
    //                 "<TT;>;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ")TT;"
    //             }
    //         .end annotation
    //         const/4 v3, 0x1
    //         invoke-static {p0}, Lcom/facebook/model/GraphObject$Factory;->create(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/model/OpenGraphObject;
    //         if-eqz p1, :cond_0
    //         invoke-interface {v0, p1}, Lcom/facebook/model/OpenGraphObject;->setType(Ljava/lang/String;)V
    //         :cond_0
    //         if-eqz p2, :cond_1
    //         invoke-interface {v0, p2}, Lcom/facebook/model/OpenGraphObject;->setTitle(Ljava/lang/String;)V
    //         :cond_1
    //         if-eqz p3, :cond_2
    //         new-array v1, v3, [Ljava/lang/String;
    //         const/4 v2, 0x0
    //         aput-object p3, v1, v2
    //         invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/facebook/model/OpenGraphObject;->setImageUrls(Ljava/util/List;)V
    //         :cond_2
    //         if-eqz p4, :cond_3
    //         invoke-interface {v0, p4}, Lcom/facebook/model/OpenGraphObject;->setUrl(Ljava/lang/String;)V
    //         :cond_3
    //         if-eqz p5, :cond_4
    //         invoke-interface {v0, p5}, Lcom/facebook/model/OpenGraphObject;->setDescription(Ljava/lang/String;)V
    //         :cond_4
    //         invoke-interface {v0, v3}, Lcom/facebook/model/OpenGraphObject;->setCreateObject(Z)V
    //         invoke-static {}, Lcom/facebook/model/GraphObject$Factory;->create()Lcom/facebook/model/GraphObject;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/facebook/model/OpenGraphObject;->setData(Lcom/facebook/model/GraphObject;)V
    //         return-object v0
    */

    public @JvmStatic fun createForPost(p0: String): com.facebook.model.OpenGraphObject { return TODO("body: (Ljava/lang/String;)Lcom/facebook/model/OpenGraphObject;") }
    /*
    //         .locals 1
    //         const-class v0, Lcom/facebook/model/OpenGraphObject;
    //         invoke-static {v0, p0}, Lcom/facebook/model/OpenGraphObject$Factory;->createForPost(Ljava/lang/Class;Ljava/lang/String;)Lcom/facebook/model/OpenGraphObject;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
