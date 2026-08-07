package android.support.v4.net

// Auto-emitted from smali source: TrafficStatsCompat.java.
// 1 fields, 9 methods.

open class TrafficStatsCompat {
    public constructor()

    companion object {
    private val IMPL: android.support.v4.net.TrafficStatsCompat.TrafficStatsCompatImpl = null!!

    public @JvmStatic fun clearThreadStatsTag() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
    //         invoke-interface {v0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->clearThreadStatsTag()V
    //         return-void
    */

    public @JvmStatic fun getThreadStatsTag(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
    //         invoke-interface {v0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->getThreadStatsTag()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun incrementOperationCount(operationCount: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->incrementOperationCount(I)V
    //         return-void
    */

    public @JvmStatic fun incrementOperationCount(tag: Int, operationCount: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->incrementOperationCount(II)V
    //         return-void
    */

    public @JvmStatic fun setThreadStatsTag(tag: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->setThreadStatsTag(I)V
    //         return-void
    */

    public @JvmStatic fun tagSocket(socket: java.net.Socket) { /* TODO(body): (Ljava/net/Socket;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->tagSocket(Ljava/net/Socket;)V
    //         return-void
    */

    public @JvmStatic fun untagSocket(socket: java.net.Socket) { /* TODO(body): (Ljava/net/Socket;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/net/TrafficStatsCompat;->IMPL:Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/net/TrafficStatsCompat$TrafficStatsCompatImpl;->untagSocket(Ljava/net/Socket;)V
    //         return-void
    */

    }
}
