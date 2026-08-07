package com.facebook.internal

// Auto-emitted from smali source: PendingCallStore.java.
// 4 fields, 8 methods.

open class PendingCallStore {
    private var pendingCallMap: java.util.Map

    public constructor()

    private fun getSavedStateKeyForPendingCallId(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "com.facebook.internal.PendingCallStore."
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPendingCallById(p0: java.util.UUID): com.facebook.widget.FacebookDialog.PendingCall { return TODO("body: (Ljava/util/UUID;)Lcom/facebook/widget/FacebookDialog$PendingCall;") }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;
    //         invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         goto :goto_0
    */

    public fun restoreFromSavedInstanceState(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         const-string v0, "com.facebook.internal.PendingCallStore.callIdArrayKey"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-direct {p0, v0}, Lcom/facebook/internal/PendingCallStore;->getSavedStateKeyForPendingCallId(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         if-eqz v0, :cond_0
    //         iget-object v2, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;
    //         invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

    public fun saveInstanceState(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/util/ArrayList;
    //         iget-object v1, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;
    //         invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         const-string v1, "com.facebook.internal.PendingCallStore.callIdArrayKey"
    //         invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    //         iget-object v0, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/FacebookDialog$PendingCall;
    //         invoke-virtual {v0}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {p0, v2}, Lcom/facebook/internal/PendingCallStore;->getSavedStateKeyForPendingCallId(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun stopTrackingPendingCall(p0: java.util.UUID) { /* TODO(body): (Ljava/util/UUID;)V */ }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;
    //         invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         return-void
    */

    public fun trackPendingCall(p0: com.facebook.widget.FacebookDialog.PendingCall) { /* TODO(body): (Lcom/facebook/widget/FacebookDialog$PendingCall;)V */ }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/internal/PendingCallStore;->pendingCallMap:Ljava/util/Map;
    //         invoke-virtual {p1}, Lcom/facebook/widget/FacebookDialog$PendingCall;->getCallId()Ljava/util/UUID;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         return-void
    */

    companion object {
    private val CALL_ID_ARRAY_KEY: String = "com.facebook.internal.PendingCallStore.callIdArrayKey"
    private val CALL_KEY_PREFIX: String = "com.facebook.internal.PendingCallStore."
    private var mInstance: com.facebook.internal.PendingCallStore

    public @JvmStatic fun getInstance(): com.facebook.internal.PendingCallStore { return TODO("body: ()Lcom/facebook/internal/PendingCallStore;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/internal/PendingCallStore;->mInstance:Lcom/facebook/internal/PendingCallStore;
    //         if-nez v0, :cond_0
    //         invoke-static {}, Lcom/facebook/internal/PendingCallStore;->createInstance()V
    //         :cond_0
    //         sget-object v0, Lcom/facebook/internal/PendingCallStore;->mInstance:Lcom/facebook/internal/PendingCallStore;
    //         return-object v0
    */

    }
}
