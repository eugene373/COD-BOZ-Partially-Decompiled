package android.support.v4.net

// Auto-emitted from smali source: TrafficStatsCompat.java.
// 0 fields, 7 methods.

interface TrafficStatsCompat_TrafficStatsCompatImpl {
    public fun clearThreadStatsTag()

    public fun getThreadStatsTag(): Int

    public fun incrementOperationCount(p0: Int)

    public fun incrementOperationCount(p0: Int, p1: Int)

    public fun setThreadStatsTag(p0: Int)

    public fun tagSocket(p0: java.net.Socket)

    public fun untagSocket(p0: java.net.Socket)

}
