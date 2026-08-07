package com.google.android.gms.plus

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class PlusClient_Anon3: com.google.android.gms.common.api.BaseImplementation.b {
    val alf: com.google.android.gms.plus.PlusClient
    val alg: com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener

    constructor(p0: com.google.android.gms.plus.PlusClient, p1: com.google.android.gms.plus.PlusClient.OnPeopleLoadedListener)

    public fun a(p0: com.google.android.gms.plus.People.LoadPeopleResult) { /* TODO(body): (Lcom/google/android/gms/plus/People$LoadPeopleResult;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient$3;->alg:Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;
    //         invoke-interface {p1}, Lcom/google/android/gms/plus/People$LoadPeopleResult;->getStatus()Lcom/google/android/gms/common/api/Status;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->gt()Lcom/google/android/gms/common/ConnectionResult;
    //         move-result-object v1
    //         invoke-interface {p1}, Lcom/google/android/gms/plus/People$LoadPeopleResult;->getPersonBuffer()Lcom/google/android/gms/plus/model/people/PersonBuffer;
    //         move-result-object v2
    //         invoke-interface {p1}, Lcom/google/android/gms/plus/People$LoadPeopleResult;->getNextPageToken()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/plus/PlusClient$OnPeopleLoadedListener;->onPeopleLoaded(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/plus/model/people/PersonBuffer;Ljava/lang/String;)V
    //         return-void
    */

    public fun b(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/plus/People$LoadPeopleResult;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/PlusClient$3;->a(Lcom/google/android/gms/plus/People$LoadPeopleResult;)V
    //         return-void
    */

}
