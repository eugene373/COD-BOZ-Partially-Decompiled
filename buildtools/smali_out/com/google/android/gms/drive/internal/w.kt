package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 1 fields, 12 methods.

open class w: com.google.android.gms.drive.DriveResource {
    protected val MW: com.google.android.gms.drive.DriveId

    protected constructor(p0: com.google.android.gms.drive.DriveId)

    public fun addChangeListener(apiClient: com.google.android.gms.common.api.GoogleApiClient, listener: com.google.android.gms.drive.events.ChangeListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/events/ChangeListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/q;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/w;->MW:Lcom/google/android/gms/drive/DriveId;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, p1, v1, v2, p2}, Lcom/google/android/gms/drive/internal/q;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/c;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun addChangeListener(apiClient: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.events.DriveEvent.Listener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/events/DriveEvent$Listener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 3
    //         .local p2, "listener":Lcom/google/android/gms/drive/events/DriveEvent$Listener;, "Lcom/google/android/gms/drive/events/DriveEvent$Listener<Lcom/google/android/gms/drive/events/ChangeEvent;>;"
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/q;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/w;->MW:Lcom/google/android/gms/drive/DriveId;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, p1, v1, v2, p2}, Lcom/google/android/gms/drive/internal/q;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/c;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun addChangeSubscription(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/q;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/w;->MW:Lcom/google/android/gms/drive/DriveId;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/drive/internal/q;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;I)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDriveId(): com.google.android.gms.drive.DriveId { return TODO("body: ()Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/w;->MW:Lcom/google/android/gms/drive/DriveId;
    //         return-object v0
    */

    public fun getMetadata(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/w$1;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/drive/internal/w$1;-><init>(Lcom/google/android/gms/drive/internal/w;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun listParents(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/w$2;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/drive/internal/w$2;-><init>(Lcom/google/android/gms/drive/internal/w;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeChangeListener(apiClient: com.google.android.gms.common.api.GoogleApiClient, listener: com.google.android.gms.drive.events.ChangeListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/events/ChangeListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/q;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/w;->MW:Lcom/google/android/gms/drive/DriveId;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, p1, v1, v2, p2}, Lcom/google/android/gms/drive/internal/q;->b(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/c;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeChangeListener(apiClient: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.events.DriveEvent.Listener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/events/DriveEvent$Listener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 3
    //         .local p2, "listener":Lcom/google/android/gms/drive/events/DriveEvent$Listener;, "Lcom/google/android/gms/drive/events/DriveEvent$Listener<Lcom/google/android/gms/drive/events/ChangeEvent;>;"
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/q;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/w;->MW:Lcom/google/android/gms/drive/DriveId;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, p1, v1, v2, p2}, Lcom/google/android/gms/drive/internal/q;->b(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/c;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeChangeSubscription(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/q;
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/w;->MW:Lcom/google/android/gms/drive/DriveId;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/drive/internal/q;->b(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;I)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setParents(apiClient: com.google.android.gms.common.api.GoogleApiClient, p1: java.util.Set): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/util/Set;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         .local p2, "parentIds":Ljava/util/Set;, "Ljava/util/Set<Lcom/google/android/gms/drive/DriveId;>;"
    //         if-nez p2, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "ParentIds must be provided."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "ParentIds must contain at least one parent."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         new-instance v1, Lcom/google/android/gms/drive/internal/w$3;
    //         invoke-direct {v1, p0, v0}, Lcom/google/android/gms/drive/internal/w$3;-><init>(Lcom/google/android/gms/drive/internal/w;Ljava/util/List;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun updateMetadata(apiClient: com.google.android.gms.common.api.GoogleApiClient, changeSet: com.google.android.gms.drive.MetadataChangeSet): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         if-nez p2, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "ChangeSet must be provided."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/drive/internal/w$4;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/drive/internal/w$4;-><init>(Lcom/google/android/gms/drive/internal/w;Lcom/google/android/gms/drive/MetadataChangeSet;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
