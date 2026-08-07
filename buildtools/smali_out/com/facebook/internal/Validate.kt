package com.facebook.internal

// Auto-emitted from smali source: Validate.java.
// 0 fields, 8 methods.

class Validate {
    public constructor()

    companion object {
    public @JvmStatic fun containsNoNullOrEmpty(p0: java.util.Collection, p1: String) { /* TODO(body): (Ljava/util/Collection;Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/lang/String;",
    //                 ")V"
    //             }
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Container \'"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\' cannot contain null values"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Container \'"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\' cannot contain empty values"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         return-void
    */

    public @JvmStatic fun containsNoNulls(p0: java.util.Collection, p1: String) { /* TODO(body): (Ljava/util/Collection;Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/util/Collection",
    //                 "<TT;>;",
    //                 "Ljava/lang/String;",
    //                 ")V"
    //             }
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         :cond_0
    //         invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Container \'"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\' cannot contain null values"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         return-void
    */

    public @JvmStatic fun notEmpty(p0: java.util.Collection, p1: String) { /* TODO(body): (Ljava/util/Collection;Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/util/Collection",
    //                 "<TT;>;",
    //                 "Ljava/lang/String;",
    //                 ")V"
    //             }
    //         .end annotation
    //         invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Container \'"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\' cannot be empty"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun notEmptyAndContainsNoNulls(p0: java.util.Collection, p1: String) { /* TODO(body): (Ljava/util/Collection;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/util/Collection",
    //                 "<TT;>;",
    //                 "Ljava/lang/String;",
    //                 ")V"
    //             }
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/facebook/internal/Validate;->containsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V
    //         invoke-static {p0, p1}, Lcom/facebook/internal/Validate;->notEmpty(Ljava/util/Collection;Ljava/lang/String;)V
    //         return-void
    */

    public @JvmStatic fun notNull(p0: Object, p1: String) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         if-nez p0, :cond_0
    //         new-instance v0, Ljava/lang/NullPointerException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Argument \'"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\' cannot be null"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun notNullOrEmpty(p0: String, p1: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Argument \'"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\' cannot be null or empty"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun oneOf(p0: Object, p1: String, p2: Array<Object>) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V */ }
    /*
    //         .locals 3
    //         array-length v1, p2
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v1, :cond_3
    //         aget-object v2, p2, v0
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         :cond_0
    //         return-void
    //         :cond_1
    //         if-eqz p0, :cond_0
    //         :cond_2
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_3
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Argument \'"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "\' was not one of the allowed values"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    }
}
