package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class EventsImpl_LoadImpl_Anon1: com.google.android.gms.games.event.Events.LoadEventsResult {
    val CW: com.google.android.gms.common.api.Status
    val Ys: com.google.android.gms.games.internal.api.EventsImpl.LoadImpl

    constructor(p0: com.google.android.gms.games.internal.api.EventsImpl.LoadImpl, p1: com.google.android.gms.common.api.Status)

    public fun getEvents(): com.google.android.gms.games.event.EventBuffer { return TODO("body: ()Lcom/google/android/gms/games/event/EventBuffer;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/games/event/EventBuffer;
    //         const/16 v1, 0xe
    //         invoke-static {v1}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/games/event/EventBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/api/EventsImpl$LoadImpl$1;->CW:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
