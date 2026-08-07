package com.google.android.gms.plus

// Auto-emitted from smali.
// 1 fields, 24 methods.

open class PlusClient: com.google.android.gms.common.GooglePlayServicesClient {
    val ald: com.google.android.gms.plus.internal.e

    constructor(plusClientImpl: com.google.android.gms.plus.internal.e)

    public fun clearDefaultAccount() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->clearDefaultAccount()V
    //         return-void
    */

    public fun connect() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->connect()V
    //         return-void
    */

    public fun disconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->disconnect()V
    //         return-void
    */

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->getAccountName()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCurrentPerson(): com.google.android.gms.plus.model.people.Person { return TODO("body: ()Lcom/google/android/gms/plus/model/people/Person;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->getCurrentPerson()Lcom/google/android/gms/plus/model/people/Person;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isConnected(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->isConnected()Z
    //         move-result v0
    //         return v0
    */

    public fun isConnecting(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->isConnecting()Z
    //         move-result v0
    //         return v0
    */

    public fun isConnectionCallbacksRegistered(listener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks): Boolean { return TODO("body: (Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/plus/internal/e;->isConnectionCallbacksRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z
    //         move-result v0
    //         return v0
    */

    public fun isConnectionFailedListenerRegistered(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener): Boolean { return TODO("body: (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/plus/internal/e;->isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z
    //         move-result v0
    //         return v0
    */

    public fun loadMoments(listener: com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener) { /* TODO(body): (Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         new-instance v1, Lcom/google/android/gms/plus/PlusClient$1;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/PlusClient$1;-><init>(Lcom/google/android/gms/plus/PlusClient;Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/plus/internal/e;->k(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         return-void
    */

    public fun loadMoments(listener: com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener, maxResults: Int, pageToken: String, targetUrl: android.net.Uri, type: String, userId: String) { /* TODO(body): (Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         new-instance v1, Lcom/google/android/gms/plus/PlusClient$2;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/PlusClient$2;-><init>(Lcom/google/android/gms/plus/PlusClient;Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;)V
    //         move v2, p2
    //         move-object v3, p3
    //         move-object v4, p4
    //         move-object v5, p5
    //         move-object v6, p6
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;ILjava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun loadPeople(listener: com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener, p1: java.util.Collection) { /* TODO(body): (Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;Ljava/util/Collection;)V */ }
    /*
    //         .locals 2
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         .local p2, "personIds":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         new-instance v1, Lcom/google/android/gms/plus/PlusClient$5;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/PlusClient$5;-><init>(Lcom/google/android/gms/plus/PlusClient;Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;)V
    //         invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/util/Collection;)V
    //         return-void
    */

    public fun loadPeople(listener: com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener, personIds: Array<String>) { /* TODO(body): (Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;[Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         new-instance v1, Lcom/google/android/gms/plus/PlusClient$6;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/PlusClient$6;-><init>(Lcom/google/android/gms/plus/PlusClient;Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;)V
    //         invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/plus/internal/e;->d(Lcom/google/android/gms/common/api/BaseImplementation$b;[Ljava/lang/String;)V
    //         return-void
    */

    public fun loadVisiblePeople(listener: com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener, orderBy: Int, pageToken: String) { /* TODO(body): (Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;ILjava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         new-instance v1, Lcom/google/android/gms/plus/PlusClient$3;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/PlusClient$3;-><init>(Lcom/google/android/gms/plus/PlusClient;Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;)V
    //         invoke-virtual {v0, v1, p2, p3}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;ILjava/lang/String;)Lcom/google/android/gms/common/internal/j;
    //         return-void
    */

    public fun loadVisiblePeople(listener: com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener, pageToken: String) { /* TODO(body): (Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         new-instance v1, Lcom/google/android/gms/plus/PlusClient$4;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/PlusClient$4;-><init>(Lcom/google/android/gms/plus/PlusClient;Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;)V
    //         invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/plus/internal/e;->r(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;)Lcom/google/android/gms/common/internal/j;
    //         return-void
    */

    fun mZ(): com.google.android.gms.plus.internal.e { return TODO("body: ()Lcom/google/android/gms/plus/internal/e;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         return-object v0
    */

    public fun registerConnectionCallbacks(listener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/plus/internal/e;->registerConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    //         return-void
    */

    public fun registerConnectionFailedListener(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/plus/internal/e;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    //         return-void
    */

    public fun removeMoment(momentId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/plus/internal/e;->removeMoment(Ljava/lang/String;)V
    //         return-void
    */

    public fun revokeAccessAndDisconnect(listener: com.google.android.gms.plus.PlusClient.OnAccessRevokedListener) { /* TODO(body): (Lcom/google/android/gms/plus/PlusClient$OnAccessRevokedListener;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         new-instance v1, Lcom/google/android/gms/plus/PlusClient$7;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/plus/PlusClient$7;-><init>(Lcom/google/android/gms/plus/PlusClient;Lcom/google/android/gms/plus/PlusClient$OnAccessRevokedListener;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/plus/internal/e;->m(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         return-void
    */

    public fun unregisterConnectionCallbacks(listener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/plus/internal/e;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    //         return-void
    */

    public fun unregisterConnectionFailedListener(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/plus/internal/e;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    //         return-void
    */

    public fun writeMoment(moment: com.google.android.gms.plus.model.moments.Moment) { /* TODO(body): (Lcom/google/android/gms/plus/model/moments/Moment;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient;->ald:Lcom/google/android/gms/plus/internal/e;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/plus/model/moments/Moment;)V
    //         return-void
    */

}
