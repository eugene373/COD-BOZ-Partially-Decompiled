package android.support.v4.net

// Auto-emitted from smali source: TrafficStatsCompat.java.
// 1 fields, 8 methods.

open class TrafficStatsCompat_BaseTrafficStatsCompatImpl: android.support.v4.net.TrafficStatsCompat.TrafficStatsCompatImpl {
    private var mThreadSocketTags: ThreadLocal

    constructor()

    public fun clearThreadStatsTag() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl;->mThreadSocketTags:Ljava/lang/ThreadLocal;
    //         invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags;
    //         const/4 v1, -0x1
    //         iput v1, v0, Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags;->statsTag:I
    //         return-void
    */

    public fun getThreadStatsTag(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl;->mThreadSocketTags:Ljava/lang/ThreadLocal;
    //         invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags;
    //         iget v0, v0, Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags;->statsTag:I
    //         return v0
    */

    public fun incrementOperationCount(operationCount: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun incrementOperationCount(tag: Int, operationCount: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setThreadStatsTag(tag: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl;->mThreadSocketTags:Ljava/lang/ThreadLocal;
    //         invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags;
    //         iput p1, v0, Landroid/support/v4/net/TrafficStatsCompat$BaseTrafficStatsCompatImpl$SocketTags;->statsTag:I
    //         return-void
    */

    public fun tagSocket(socket: java.net.Socket) { /* TODO(body): (Ljava/net/Socket;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun untagSocket(socket: java.net.Socket) { /* TODO(body): (Ljava/net/Socket;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
