package android.support.v4.net

// Auto-emitted from smali source: TrafficStatsCompat.java.
// 0 fields, 8 methods.

open class TrafficStatsCompat_IcsTrafficStatsCompatImpl: android.support.v4.net.TrafficStatsCompat.TrafficStatsCompatImpl {
    constructor()

    public fun clearThreadStatsTag() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-static {}, Landroid/support/v4/net/TrafficStatsCompatIcs;->clearThreadStatsTag()V
    //         return-void
    */

    public fun getThreadStatsTag(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {}, Landroid/support/v4/net/TrafficStatsCompatIcs;->getThreadStatsTag()I
    //         move-result v0
    //         return v0
    */

    public fun incrementOperationCount(operationCount: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Landroid/support/v4/net/TrafficStatsCompatIcs;->incrementOperationCount(I)V
    //         return-void
    */

    public fun incrementOperationCount(tag: Int, operationCount: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/net/TrafficStatsCompatIcs;->incrementOperationCount(II)V
    //         return-void
    */

    public fun setThreadStatsTag(tag: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Landroid/support/v4/net/TrafficStatsCompatIcs;->setThreadStatsTag(I)V
    //         return-void
    */

    public fun tagSocket(socket: java.net.Socket) { /* TODO(body): (Ljava/net/Socket;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Landroid/support/v4/net/TrafficStatsCompatIcs;->tagSocket(Ljava/net/Socket;)V
    //         return-void
    */

    public fun untagSocket(socket: java.net.Socket) { /* TODO(body): (Ljava/net/Socket;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Landroid/support/v4/net/TrafficStatsCompatIcs;->untagSocket(Ljava/net/Socket;)V
    //         return-void
    */

}
