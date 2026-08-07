package com.google.android.gms.appstate

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class AppStateManager_c_Anon1: com.google.android.gms.appstate.AppStateManager.StateListResult {
    val CW: com.google.android.gms.common.api.Status
    val Dc: com.google.android.gms.appstate.AppStateManager.c

    constructor(p0: com.google.android.gms.appstate.AppStateManager.c, p1: com.google.android.gms.common.api.Status)

    public fun getStateBuffer(): com.google.android.gms.appstate.AppStateBuffer { return TODO("body: ()Lcom/google/android/gms/appstate/AppStateBuffer;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/appstate/AppStateBuffer;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/appstate/AppStateBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/appstate/AppStateManager$c$1;->CW:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

}
