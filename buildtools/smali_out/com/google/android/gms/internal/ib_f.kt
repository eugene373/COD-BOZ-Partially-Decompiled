package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 9 methods.

class ib_f: com.google.android.gms.common.api.a(), com.google.android.gms.appstate.AppStateManager.StateConflictResult, com.google.android.gms.appstate.AppStateManager.StateLoadedResult, com.google.android.gms.appstate.AppStateManager.StateResult {
    private val Df: Int
    private val Dg: com.google.android.gms.appstate.AppStateBuffer

    public constructor(p0: Int, p1: com.google.android.gms.common.data.DataHolder)

    private fun fs(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ib$f;->CM:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I
    //         move-result v0
    //         const/16 v1, 0x7d0
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getConflictResult(): com.google.android.gms.appstate.AppStateManager.StateConflictResult { return TODO("body: ()Lcom/google/android/gms/appstate/AppStateManager$StateConflictResult;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ib$f;->fs()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-object p0
    //         :cond_0
    //         const/4 p0, 0x0
    //         goto :goto_0
    */

    public fun getLoadedResult(): com.google.android.gms.appstate.AppStateManager.StateLoadedResult { return TODO("body: ()Lcom/google/android/gms/appstate/AppStateManager$StateLoadedResult;") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/ib$f;->fs()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 p0, 0x0
    //         :cond_0
    //         return-object p0
    */

    public fun getLocalData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ib$f;->Dg:Lcom/google/android/gms/appstate/AppStateBuffer;
    //         invoke-virtual {v0}, Lcom/google/android/gms/appstate/AppStateBuffer;->getCount()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ib$f;->Dg:Lcom/google/android/gms/appstate/AppStateBuffer;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/appstate/AppStateBuffer;->get(I)Lcom/google/android/gms/appstate/AppState;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/appstate/AppState;->getLocalData()[B
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getResolvedVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ib$f;->Dg:Lcom/google/android/gms/appstate/AppStateBuffer;
    //         invoke-virtual {v0}, Lcom/google/android/gms/appstate/AppStateBuffer;->getCount()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ib$f;->Dg:Lcom/google/android/gms/appstate/AppStateBuffer;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/appstate/AppStateBuffer;->get(I)Lcom/google/android/gms/appstate/AppState;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/appstate/AppState;->getConflictVersion()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getServerData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ib$f;->Dg:Lcom/google/android/gms/appstate/AppStateBuffer;
    //         invoke-virtual {v0}, Lcom/google/android/gms/appstate/AppStateBuffer;->getCount()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ib$f;->Dg:Lcom/google/android/gms/appstate/AppStateBuffer;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/appstate/AppStateBuffer;->get(I)Lcom/google/android/gms/appstate/AppState;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/appstate/AppState;->getConflictData()[B
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getStateKey(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/ib$f;->Df:I
    //         return v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ib$f;->Dg:Lcom/google/android/gms/appstate/AppStateBuffer;
    //         invoke-virtual {v0}, Lcom/google/android/gms/appstate/AppStateBuffer;->close()V
    //         return-void
    */

}
