package android.support.v4.content

// Auto-emitted from smali source: LocalBroadcastManager.java.
// 3 fields, 2 methods.

open class LocalBroadcastManager_ReceiverRecord {
    var broadcasting: Boolean
    val filter: android.content.IntentFilter
    val receiver: android.content.BroadcastReceiver

    constructor(_filter: android.content.IntentFilter, _receiver: android.content.BroadcastReceiver)

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         const/16 v1, 0x80
    //         invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V
    //         .local v0, "builder":Ljava/lang/StringBuilder;
    //         const-string v1, "Receiver{"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->receiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         const-string v1, " filter="
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->filter:Landroid/content/IntentFilter;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         return-object v1
    */

}
