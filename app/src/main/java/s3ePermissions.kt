// Auto-emitted from javap text dump (s3e_debug). See HOWTO_BUILD.md.
// Default package. 1 static field + 1 instance field, 12 methods.
//
// ABI note: the native callback and notifyResult methods take int[]
// (descriptor [I) for grantResults — Kotlin IntArray, NOT Array<Int>.
// Verified against Master smali LoaderActivity.onRequestPermissionsResult
// (I[Ljava/lang/String;[I)V and RequestPermissionsResultEvent.m_grantResults:IntArray.

@Suppress("ObjectLiteralToLambda", "unused")
open class s3ePermissions : com.ideaworks3d.marmalade.event.RequestPermissionsResultListener {
    private var pendingRequests: s3ePermissions_PendingRequestsQueue = s3ePermissions_PendingRequestsQueue(this)

    public fun s3ePermissionsInit() { /* TODO(body): ()V */ }
    public fun s3ePermissionsTerminate() { /* TODO(body): ()V */ }
    public fun s3ePermissionsIsGranted(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    public fun s3ePermissionsRequest(p0: Array<String>, p1: Int, p2: Boolean): Int { return TODO("body: ([Ljava/lang/String;IZ)I") }
    private fun removePendingRequestWithId(p0: Int): s3ePermissions_PendingRequest { return TODO("body: (I)Ls3ePermissions\$PendingRequest;") }
    private fun updatePendingRequests(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V */ }
    override public fun onRequestPermissionsResultEvent(p0: com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/event/RequestPermissionsResultEvent;)V */ }
    public fun s3ePermissionsShouldShowRequestPermissionRationale(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    public fun s3ePermissionsNotifyPermissionsResultCleanup() { /* TODO(body): ()V */ }

    companion object {
        private const val TAG: String = "s3ePermissions"
        private const val S3E_PERMISSION_GRANTED: Int = 0
        private const val S3E_PERMISSION_DENIED: Int = 1
        private const val S3E_PERMISSIONS_ERR_NO_PERMISSIONS_TO_REQUEST: Int = 1

        // JNI native callback invoked by native code: ((I[Ljava/lang/String;[I)V).
        // grantResults MUST be IntArray to match the C side's int*.
        private external @JvmStatic fun native_RequestPermissionsResultCallback(p0: Int, p1: Array<String>, p2: IntArray)

        private @JvmStatic fun notifyRequestPermissionsResult(p0: Int, p1: Array<String>, p2: IntArray) { /* TODO(body): (I[Ljava/lang/String;[I)V */ }
        private @JvmStatic fun getPermissionGrantedValue(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    }
}
