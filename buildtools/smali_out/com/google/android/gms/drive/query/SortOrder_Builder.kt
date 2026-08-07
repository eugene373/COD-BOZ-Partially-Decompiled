package com.google.android.gms.drive.query

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class SortOrder_Builder {
    private val QI: java.util.List
    private var QJ: Boolean

    public constructor()

    public fun addSortAscending(sortField: com.google.android.gms.drive.metadata.SortableMetadataField): com.google.android.gms.drive.query.SortOrder.Builder { return TODO("body: (Lcom/google/android/gms/drive/metadata/SortableMetadataField;)Lcom/google/android/gms/drive/query/SortOrder$Builder;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/SortOrder$Builder;->QI:Ljava/util/List;
    //         new-instance v1, Lcom/google/android/gms/drive/query/internal/FieldWithSortOrder;
    //         invoke-interface {p1}, Lcom/google/android/gms/drive/metadata/SortableMetadataField;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         const/4 v3, 0x1
    //         invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/query/internal/FieldWithSortOrder;-><init>(Ljava/lang/String;Z)V
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun addSortDescending(sortField: com.google.android.gms.drive.metadata.SortableMetadataField): com.google.android.gms.drive.query.SortOrder.Builder { return TODO("body: (Lcom/google/android/gms/drive/metadata/SortableMetadataField;)Lcom/google/android/gms/drive/query/SortOrder$Builder;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/SortOrder$Builder;->QI:Ljava/util/List;
    //         new-instance v1, Lcom/google/android/gms/drive/query/internal/FieldWithSortOrder;
    //         invoke-interface {p1}, Lcom/google/android/gms/drive/metadata/SortableMetadataField;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/query/internal/FieldWithSortOrder;-><init>(Ljava/lang/String;Z)V
    //         invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun build(): com.google.android.gms.drive.query.SortOrder { return TODO("body: ()Lcom/google/android/gms/drive/query/SortOrder;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/drive/query/SortOrder;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/query/SortOrder$Builder;->QI:Ljava/util/List;
    //         iget-boolean v2, p0, Lcom/google/android/gms/drive/query/SortOrder$Builder;->QJ:Z
    //         const/4 v3, 0x0
    //         invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/drive/query/SortOrder;-><init>(Ljava/util/List;ZLcom/google/android/gms/drive/query/SortOrder$1;)V
    //         return-object v0
    */

}
