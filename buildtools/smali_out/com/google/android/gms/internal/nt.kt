package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 7 methods.

class nt: com.google.android.gms.plus.People {
    public constructor()

    public fun getCurrentPerson(googleApiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.plus.model.people.Person { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/plus/model/people/Person;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/plus/Plus;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-static {p1, v0}, Lcom/google/android/gms/plus/Plus;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/plus/internal/e;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->getCurrentPerson()Lcom/google/android/gms/plus/model/people/Person;
    //         move-result-object v0
    //         return-object v0
    */

    public fun load(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, p1: java.util.Collection): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/util/Collection;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         .local p2, "personIds":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    //         new-instance v0, Lcom/google/android/gms/internal/nt$4;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/nt$4;-><init>(Lcom/google/android/gms/internal/nt;Ljava/util/Collection;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun load(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, personIds: Array<String>): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;[Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/nt$5;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/nt$5;-><init>(Lcom/google/android/gms/internal/nt;[Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadConnected(googleApiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/nt$3;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/nt$3;-><init>(Lcom/google/android/gms/internal/nt;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadVisible(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, orderBy: Int, pageToken: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;ILjava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/nt$1;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/internal/nt$1;-><init>(Lcom/google/android/gms/internal/nt;ILjava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadVisible(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, pageToken: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/nt$2;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/nt$2;-><init>(Lcom/google/android/gms/internal/nt;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
