// Auto-emitted from javap text dump (s3e_debug). See HOWTO_BUILD.md.
// Default package. Inner class s3ePermissions$PendingRequestsQueue, emitted standalone.
// implements java.lang.Iterable<s3ePermissions$PendingRequest>. 2 fields, 8 methods.

open class s3ePermissions_PendingRequestsQueue(
    @Suppress("unused") private val outerThis: s3ePermissions
) : Iterable<s3ePermissions_PendingRequest> {
    private var pendingRequests: List<s3ePermissions_PendingRequest> = ArrayList()
    private var sessionRequestResults: List<s3ePermissions_PermissionRequestResult> = ArrayList()

    override public fun iterator(): Iterator<s3ePermissions_PendingRequest> = pendingRequests.iterator()
    fun add(p0: s3ePermissions_PendingRequest): Boolean { return TODO("body: (Ls3ePermissions\$PendingRequest;)Z") }
    fun get(p0: Int): s3ePermissions_PendingRequest { return TODO("body: (I)Ls3ePermissions\$PendingRequest;") }
    fun size(): Int { return TODO("body: ()I") }
    fun remove(p0: Int): s3ePermissions_PendingRequest { return TODO("body: (I)Ls3ePermissions\$PendingRequest;") }
    fun remove(p0: Any): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    fun updatePermission(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    public fun cleanup() { /* TODO(body): ()V */ }
}
