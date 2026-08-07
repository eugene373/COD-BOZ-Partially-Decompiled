package android.support.v4.net

// Auto-emitted from smali source: TrafficStatsCompatIcs.java.
// 0 fields, 8 methods.

open class TrafficStatsCompatIcs {
    constructor()

    companion object {
    public @JvmStatic fun clearThreadStatsTag() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V
    //         return-void
    */

    public @JvmStatic fun getThreadStatsTag(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {}, Landroid/net/TrafficStats;->getThreadStatsTag()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun incrementOperationCount(operationCount: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0}, Landroid/net/TrafficStats;->incrementOperationCount(I)V
    //         return-void
    */

    public @JvmStatic fun incrementOperationCount(tag: Int, operationCount: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1}, Landroid/net/TrafficStats;->incrementOperationCount(II)V
    //         return-void
    */

    public @JvmStatic fun setThreadStatsTag(tag: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V
    //         return-void
    */

    public @JvmStatic fun tagSocket(socket: java.net.Socket) { /* TODO(body): (Ljava/net/Socket;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0}, Landroid/net/TrafficStats;->tagSocket(Ljava/net/Socket;)V
    //         return-void
    */

    public @JvmStatic fun untagSocket(socket: java.net.Socket) { /* TODO(body): (Ljava/net/Socket;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0}, Landroid/net/TrafficStats;->untagSocket(Ljava/net/Socket;)V
    //         return-void
    */

    }
}
