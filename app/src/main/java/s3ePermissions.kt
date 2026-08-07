// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 1 fields, 12 methods.

open class s3ePermissions: com.ideaworks3d.marmalade.event.RequestPermissionsResultListener {
        private var pendingRequests: s3ePermissions$PendingRequestsQueue

    public fun s3ePermissionsInit() { /* TODO(body): ()V */ }
    public fun s3ePermissionsTerminate() { /* TODO(body): ()V */ }
    public fun s3ePermissionsIsGranted(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    public fun s3ePermissionsRequest(p0: Array<String>, p1: Int, p2: Boolean): Int { return TODO("body: ([Ljava/lang/String;IZ)I") }
    private fun removePendingRequestWithId(p0: Int): s3ePermissions$PendingRequest { return TODO("body: (I)Ls3ePermissions$PendingRequest;") }
    private fun updatePendingRequests(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V */ }
    public fun onRequestPermissionsResultEvent(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V */ }
    public fun s3ePermissionsShouldShowRequestPermissionRationale(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    public fun s3ePermissionsNotifyPermissionsResultCleanup() { /* TODO(body): ()V */ }

    companion object {
        private external @JvmStatic fun native_RequestPermissionsResultCallback(p0: Int, p1: Array<String>, p2: Array<Int>)
        private @JvmStatic fun notifyRequestPermissionsResult(p0: Int, p1: Array<String>, p2: Array<Int>) { /* TODO(body): (I[Ljava/lang/String;[I)V */ }
        private @JvmStatic fun getPermissionGrantedValue(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    }
}
