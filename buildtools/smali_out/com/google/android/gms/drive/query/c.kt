package com.google.android.gms.drive.query

// Auto-emitted from smali.
// 0 fields, 15 methods.

open class c: com.google.android.gms.drive.query.internal.f {
    public constructor()

    public fun a(p0: com.google.android.gms.drive.metadata.b, p1: Object): String { return TODO("body: (Lcom/google/android/gms/drive/metadata/b;Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/metadata/b",
    //                 "<TT;>;TT;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         const-string v0, "contains(%s,%s)"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/metadata/b;->getName()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         aput-object p2, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun a(p0: com.google.android.gms.drive.query.internal.Operator, p1: com.google.android.gms.drive.metadata.MetadataField, p2: Object): String { return TODO("body: (Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/query/internal/Operator;",
    //                 "Lcom/google/android/gms/drive/metadata/MetadataField",
    //                 "<TT;>;TT;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         const-string v0, "cmp(%s,%s,%s)"
    //         const/4 v1, 0x3
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/query/internal/Operator;->getTag()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         invoke-interface {p2}, Lcom/google/android/gms/drive/metadata/MetadataField;->getName()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         aput-object p3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun a(p0: com.google.android.gms.drive.query.internal.Operator, p1: java.util.List): String { return TODO("body: (Lcom/google/android/gms/drive/query/internal/Operator;Ljava/util/List;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/drive/query/internal/Operator;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {p1}, Lcom/google/android/gms/drive/query/internal/Operator;->getTag()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         const-string v0, ""
    //         invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         move-object v1, v0
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         const-string v0, ","
    //         move-object v1, v0
    //         goto :goto_0
    //         :cond_0
    //         const-string v0, ")"
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun b(p0: com.google.android.gms.drive.metadata.b, p1: Object): Object { return TODO("body: (Lcom/google/android/gms/drive/metadata/b;Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/drive/query/c;->a(Lcom/google/android/gms/drive/metadata/b;Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun b(p0: com.google.android.gms.drive.query.internal.Operator, p1: com.google.android.gms.drive.metadata.MetadataField, p2: Object): Object { return TODO("body: (Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/drive/query/c;->a(Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun b(p0: com.google.android.gms.drive.query.internal.Operator, p1: java.util.List): Object { return TODO("body: (Lcom/google/android/gms/drive/query/internal/Operator;Ljava/util/List;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/drive/query/c;->a(Lcom/google/android/gms/drive/query/internal/Operator;Ljava/util/List;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun bn(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const-string v0, "not(%s)"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         aput-object p1, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun c(p0: com.google.android.gms.drive.metadata.MetadataField): String { return TODO("body: (Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/drive/metadata/MetadataField",
    //                 "<*>;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         const-string v0, "fieldOnly(%s)"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-interface {p1}, Lcom/google/android/gms/drive/metadata/MetadataField;->getName()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun c(p0: com.google.android.gms.drive.metadata.MetadataField, p1: Object): String { return TODO("body: (Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/metadata/MetadataField",
    //                 "<TT;>;TT;)",
    //                 "Ljava/lang/String;"
    //             }
    //         .end annotation
    //         const-string v0, "has(%s,%s)"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-interface {p1}, Lcom/google/android/gms/drive/metadata/MetadataField;->getName()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         aput-object p2, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun d(p0: com.google.android.gms.drive.metadata.MetadataField): Object { return TODO("body: (Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/query/c;->c(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun d(p0: com.google.android.gms.drive.metadata.MetadataField, p1: Object): Object { return TODO("body: (Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/drive/query/c;->c(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun ir(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "all()"
    //         return-object v0
    */

    public fun is(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/query/c;->ir()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun j(p0: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, Ljava/lang/String;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/query/c;->bn(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
