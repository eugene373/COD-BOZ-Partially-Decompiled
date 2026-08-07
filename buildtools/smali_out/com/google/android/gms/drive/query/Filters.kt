package com.google.android.gms.drive.query

// Auto-emitted from smali.
// 0 fields, 15 methods.

open class Filters {
    public constructor()

    companion object {
    public @JvmStatic fun and(filter: com.google.android.gms.drive.query.Filter, additionalFilters: Array<com.google.android.gms.drive.query.Filter>): com.google.android.gms.drive.query.Filter { return TODO("body: (Lcom/google/android/gms/drive/query/Filter;[Lcom/google/android/gms/drive/query/Filter;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/internal/Operator;->Re:Lcom/google/android/gms/drive/query/internal/Operator;
    //         invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/drive/query/internal/LogicalFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/query/Filter;[Lcom/google/android/gms/drive/query/Filter;)V
    //         return-object v0
    */

    public @JvmStatic fun and(p0: Iterable): com.google.android.gms.drive.query.Filter { return TODO("body: (Ljava/lang/Iterable;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Iterable",
    //                 "<",
    //                 "Lcom/google/android/gms/drive/query/Filter;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/drive/query/Filter;"
    //             }
    //         .end annotation
    //         .local p0, "filters":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Lcom/google/android/gms/drive/query/Filter;>;"
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/internal/Operator;->Re:Lcom/google/android/gms/drive/query/internal/Operator;
    //         invoke-direct {v0, v1, p0}, Lcom/google/android/gms/drive/query/internal/LogicalFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Ljava/lang/Iterable;)V
    //         return-object v0
    */

    public @JvmStatic fun contains(value: com.google.android.gms.drive.metadata.SearchableMetadataField, p1: String): com.google.android.gms.drive.query.Filter { return TODO("body: (Lcom/google/android/gms/drive/metadata/SearchableMetadataField;Ljava/lang/String;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         .local p0, "field":Lcom/google/android/gms/drive/metadata/SearchableMetadataField;, "Lcom/google/android/gms/drive/metadata/SearchableMetadataField<Ljava/lang/String;>;"
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/internal/Operator;->Rh:Lcom/google/android/gms/drive/query/internal/Operator;
    //         invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/SearchableMetadataField;Ljava/lang/Object;)V
    //         return-object v0
    */

    public @JvmStatic fun eq(p0: com.google.android.gms.drive.metadata.SearchableMetadataField, p1: Object): com.google.android.gms.drive.query.Filter { return TODO("body: (Lcom/google/android/gms/drive/metadata/SearchableMetadataField;Ljava/lang/Object;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/metadata/SearchableMetadataField",
    //                 "<TT;>;TT;)",
    //                 "Lcom/google/android/gms/drive/query/Filter;"
    //             }
    //         .end annotation
    //         .local p0, "field":Lcom/google/android/gms/drive/metadata/SearchableMetadataField;, "Lcom/google/android/gms/drive/metadata/SearchableMetadataField<TT;>;"
    //         .local p1, "value":Ljava/lang/Object;, "TT;"
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/internal/Operator;->QZ:Lcom/google/android/gms/drive/query/internal/Operator;
    //         invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/SearchableMetadataField;Ljava/lang/Object;)V
    //         return-object v0
    */

    public @JvmStatic fun greaterThan(p0: com.google.android.gms.drive.metadata.SearchableOrderedMetadataField, p1: Comparable): com.google.android.gms.drive.query.Filter { return TODO("body: (Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;Ljava/lang/Comparable;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Ljava/lang/Comparable",
    //                 "<TT;>;>(",
    //                 "Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField",
    //                 "<TT;>;TT;)",
    //                 "Lcom/google/android/gms/drive/query/Filter;"
    //             }
    //         .end annotation
    //         .local p0, "field":Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;, "Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField<TT;>;"
    //         .local p1, "value":Ljava/lang/Comparable;, "TT;"
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/internal/Operator;->Rc:Lcom/google/android/gms/drive/query/internal/Operator;
    //         invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/SearchableMetadataField;Ljava/lang/Object;)V
    //         return-object v0
    */

    public @JvmStatic fun greaterThanEquals(p0: com.google.android.gms.drive.metadata.SearchableOrderedMetadataField, p1: Comparable): com.google.android.gms.drive.query.Filter { return TODO("body: (Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;Ljava/lang/Comparable;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Ljava/lang/Comparable",
    //                 "<TT;>;>(",
    //                 "Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField",
    //                 "<TT;>;TT;)",
    //                 "Lcom/google/android/gms/drive/query/Filter;"
    //             }
    //         .end annotation
    //         .local p0, "field":Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;, "Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField<TT;>;"
    //         .local p1, "value":Ljava/lang/Comparable;, "TT;"
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/internal/Operator;->Rd:Lcom/google/android/gms/drive/query/internal/Operator;
    //         invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/SearchableMetadataField;Ljava/lang/Object;)V
    //         return-object v0
    */

    public @JvmStatic fun in(p0: com.google.android.gms.drive.metadata.SearchableCollectionMetadataField, p1: Object): com.google.android.gms.drive.query.Filter { return TODO("body: (Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField;Ljava/lang/Object;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField",
    //                 "<TT;>;TT;)",
    //                 "Lcom/google/android/gms/drive/query/Filter;"
    //             }
    //         .end annotation
    //         .local p0, "field":Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField;, "Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField<TT;>;"
    //         .local p1, "value":Ljava/lang/Object;, "TT;"
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/InFilter;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/drive/query/internal/InFilter;-><init>(Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField;Ljava/lang/Object;)V
    //         return-object v0
    */

    public @JvmStatic fun lessThan(p0: com.google.android.gms.drive.metadata.SearchableOrderedMetadataField, p1: Comparable): com.google.android.gms.drive.query.Filter { return TODO("body: (Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;Ljava/lang/Comparable;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Ljava/lang/Comparable",
    //                 "<TT;>;>(",
    //                 "Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField",
    //                 "<TT;>;TT;)",
    //                 "Lcom/google/android/gms/drive/query/Filter;"
    //             }
    //         .end annotation
    //         .local p0, "field":Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;, "Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField<TT;>;"
    //         .local p1, "value":Ljava/lang/Comparable;, "TT;"
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/internal/Operator;->Ra:Lcom/google/android/gms/drive/query/internal/Operator;
    //         invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/SearchableMetadataField;Ljava/lang/Object;)V
    //         return-object v0
    */

    public @JvmStatic fun lessThanEquals(p0: com.google.android.gms.drive.metadata.SearchableOrderedMetadataField, p1: Comparable): com.google.android.gms.drive.query.Filter { return TODO("body: (Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;Ljava/lang/Comparable;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T::",
    //                 "Ljava/lang/Comparable",
    //                 "<TT;>;>(",
    //                 "Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField",
    //                 "<TT;>;TT;)",
    //                 "Lcom/google/android/gms/drive/query/Filter;"
    //             }
    //         .end annotation
    //         .local p0, "field":Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;, "Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField<TT;>;"
    //         .local p1, "value":Ljava/lang/Comparable;, "TT;"
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/internal/Operator;->Rb:Lcom/google/android/gms/drive/query/internal/Operator;
    //         invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/metadata/SearchableMetadataField;Ljava/lang/Object;)V
    //         return-object v0
    */

    public @JvmStatic fun not(toNegate: com.google.android.gms.drive.query.Filter): com.google.android.gms.drive.query.Filter { return TODO("body: (Lcom/google/android/gms/drive/query/Filter;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/NotFilter;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/drive/query/internal/NotFilter;-><init>(Lcom/google/android/gms/drive/query/Filter;)V
    //         return-object v0
    */

    public @JvmStatic fun openedByMe(): com.google.android.gms.drive.query.Filter { return TODO("body: ()Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/SearchableField;->LAST_VIEWED_BY_ME:Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;-><init>(Lcom/google/android/gms/drive/metadata/SearchableMetadataField;)V
    //         return-object v0
    */

    public @JvmStatic fun or(filter: com.google.android.gms.drive.query.Filter, additionalFilters: Array<com.google.android.gms.drive.query.Filter>): com.google.android.gms.drive.query.Filter { return TODO("body: (Lcom/google/android/gms/drive/query/Filter;[Lcom/google/android/gms/drive/query/Filter;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/internal/Operator;->Rf:Lcom/google/android/gms/drive/query/internal/Operator;
    //         invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/drive/query/internal/LogicalFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Lcom/google/android/gms/drive/query/Filter;[Lcom/google/android/gms/drive/query/Filter;)V
    //         return-object v0
    */

    public @JvmStatic fun or(p0: Iterable): com.google.android.gms.drive.query.Filter { return TODO("body: (Ljava/lang/Iterable;)Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Iterable",
    //                 "<",
    //                 "Lcom/google/android/gms/drive/query/Filter;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/drive/query/Filter;"
    //             }
    //         .end annotation
    //         .local p0, "filters":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Lcom/google/android/gms/drive/query/Filter;>;"
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/internal/Operator;->Rf:Lcom/google/android/gms/drive/query/internal/Operator;
    //         invoke-direct {v0, v1, p0}, Lcom/google/android/gms/drive/query/internal/LogicalFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Ljava/lang/Iterable;)V
    //         return-object v0
    */

    public @JvmStatic fun sharedWithMe(): com.google.android.gms.drive.query.Filter { return TODO("body: ()Lcom/google/android/gms/drive/query/Filter;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;
    //         sget-object v1, Lcom/google/android/gms/drive/query/SearchableField;->QG:Lcom/google/android/gms/drive/metadata/SearchableOrderedMetadataField;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;-><init>(Lcom/google/android/gms/drive/metadata/SearchableMetadataField;)V
    //         return-object v0
    */

    }
}
