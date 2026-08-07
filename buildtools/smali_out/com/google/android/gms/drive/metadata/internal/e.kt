package com.google.android.gms.drive.metadata.internal

// Auto-emitted from smali.
// 1 fields, 4 methods.

class e {
    companion object {
    private var PK: java.util.Map

    private @JvmStatic fun b(p0: com.google.android.gms.drive.metadata.MetadataField) { /* TODO(body): (Lcom/google/android/gms/drive/metadata/MetadataField;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/drive/metadata/MetadataField",
    //                 "<*>;)V"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/google/android/gms/drive/metadata/internal/e;->PK:Ljava/util/Map;
    //         invoke-interface {p0}, Lcom/google/android/gms/drive/metadata/MetadataField;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Duplicate field name registered: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-interface {p0}, Lcom/google/android/gms/drive/metadata/MetadataField;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/drive/metadata/internal/e;->PK:Ljava/util/Map;
    //         invoke-interface {p0}, Lcom/google/android/gms/drive/metadata/MetadataField;->getName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public @JvmStatic fun bj(p0: String): com.google.android.gms.drive.metadata.MetadataField { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/drive/metadata/MetadataField;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Lcom/google/android/gms/drive/metadata/MetadataField",
    //                 "<*>;"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/google/android/gms/drive/metadata/internal/e;->PK:Ljava/util/Map;
    //         invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/metadata/MetadataField;
    //         return-object v0
    */

    public @JvmStatic fun in(): java.util.Collection { return TODO("body: ()Ljava/util/Collection;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/google/android/gms/drive/metadata/MetadataField",
    //                 "<*>;>;"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/google/android/gms/drive/metadata/internal/e;->PK:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
