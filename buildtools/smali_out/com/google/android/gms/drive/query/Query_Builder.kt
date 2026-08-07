package com.google.android.gms.drive.query

// Auto-emitted from smali.
// 4 fields, 6 methods.

open class Query_Builder {
    private var QC: String
    private var QD: com.google.android.gms.drive.query.SortOrder
    private var QE: java.util.List
    private val QF: java.util.List

    public constructor()

    public constructor(query: com.google.android.gms.drive.query.Query)

    public fun addFilter(filter: com.google.android.gms.drive.query.Filter): com.google.android.gms.drive.query.Query.Builder { return TODO("body: (Lcom/google/android/gms/drive/query/Filter;)Lcom/google/android/gms/drive/query/Query$Builder;") }
    /*
    //         .locals 1
    //         instance-of v0, p1, Lcom/google/android/gms/drive/query/internal/MatchAllFilter;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/query/Query$Builder;->QF:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         return-object p0
    */

    public fun build(): com.google.android.gms.drive.query.Query { return TODO("body: ()Lcom/google/android/gms/drive/query/Query;") }
    /*
    //         .locals 5
    //         new-instance v0, Lcom/google/android/gms/drive/query/Query;
    //         new-instance v1, Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    //         sget-object v2, Lcom/google/android/gms/drive/query/internal/Operator;->Re:Lcom/google/android/gms/drive/query/internal/Operator;
    //         iget-object v3, p0, Lcom/google/android/gms/drive/query/Query$Builder;->QF:Ljava/util/List;
    //         invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/query/internal/LogicalFilter;-><init>(Lcom/google/android/gms/drive/query/internal/Operator;Ljava/lang/Iterable;)V
    //         iget-object v2, p0, Lcom/google/android/gms/drive/query/Query$Builder;->QC:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/google/android/gms/drive/query/Query$Builder;->QD:Lcom/google/android/gms/drive/query/SortOrder;
    //         iget-object v4, p0, Lcom/google/android/gms/drive/query/Query$Builder;->QE:Ljava/util/List;
    //         invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/drive/query/Query;-><init>(Lcom/google/android/gms/drive/query/internal/LogicalFilter;Ljava/lang/String;Lcom/google/android/gms/drive/query/SortOrder;Ljava/util/List;)V
    //         return-object v0
    */

    public fun setPageToken(token: String): com.google.android.gms.drive.query.Query.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/drive/query/Query$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/drive/query/Query$Builder;->QC:Ljava/lang/String;
    //         return-object p0
    */

    public fun setSortOrder(sortOrder: com.google.android.gms.drive.query.SortOrder): com.google.android.gms.drive.query.Query.Builder { return TODO("body: (Lcom/google/android/gms/drive/query/SortOrder;)Lcom/google/android/gms/drive/query/Query$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/drive/query/Query$Builder;->QD:Lcom/google/android/gms/drive/query/SortOrder;
    //         return-object p0
    */

}
