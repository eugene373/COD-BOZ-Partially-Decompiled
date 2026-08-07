package com.google.android.gms.plus

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class PlusClient_Anon2: com.google.android.gms.common.api.BaseImplementation.b {
    val ale: com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener
    val alf: com.google.android.gms.plus.PlusClient

    constructor(p0: com.google.android.gms.plus.PlusClient, p1: com.google.android.gms.plus.PlusClient.OnMomentsLoadedListener)

    public fun a(p0: com.google.android.gms.plus.Moments.LoadMomentsResult) { /* TODO(body): (Lcom/google/android/gms/plus/Moments$LoadMomentsResult;)V */ }
    /*
    //         .locals 5
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient$2;->ale:Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;
    //         invoke-interface {p1}, Lcom/google/android/gms/plus/Moments$LoadMomentsResult;->getStatus()Lcom/google/android/gms/common/api/Status;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->gt()Lcom/google/android/gms/common/ConnectionResult;
    //         move-result-object v1
    //         invoke-interface {p1}, Lcom/google/android/gms/plus/Moments$LoadMomentsResult;->getMomentBuffer()Lcom/google/android/gms/plus/model/moments/MomentBuffer;
    //         move-result-object v2
    //         invoke-interface {p1}, Lcom/google/android/gms/plus/Moments$LoadMomentsResult;->getNextPageToken()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {p1}, Lcom/google/android/gms/plus/Moments$LoadMomentsResult;->getUpdated()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-interface {v0, v1, v2, v3, v4}, Lcom/google/android/gms/plus/PlusClient$OnMomentsLoadedListener;->onMomentsLoaded(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/plus/model/moments/MomentBuffer;Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun b(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/plus/Moments$LoadMomentsResult;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/PlusClient$2;->a(Lcom/google/android/gms/plus/Moments$LoadMomentsResult;)V
    //         return-void
    */

}
