// Auto-emitted from javap text dump (s3e_debug). See HOWTO_BUILD.md.
// Default package. Inner class s3ePermissions$PendingRequest, emitted standalone.
// 5 fields, 4 methods.

open class s3ePermissions_PendingRequest(
    @Suppress("unused") private val outerThis: s3ePermissions,
    public var requestId: Int,
    private var skipGranted: Boolean,
    public var permissions: List<String> = ArrayList(),
    public var skippedPermissions: List<s3ePermissions_PermissionRequestResult> = ArrayList()
) {
    public fun updatePermission(p0: String, p1: Int) { /* TODO(body): (Ljava/lang/String;I)V */ }
    // getResPermissions: ([Ljava/lang/String;)[Ljava/lang/String;
    public fun getResPermissions(p0: Array<String>): Array<String> { return TODO("body: ([Ljava/lang/String;)[Ljava/lang/String;") }
    // getResGrantResults: ([I)[I  -> IntArray -> IntArray (primitive-array ABI)
    public fun getResGrantResults(p0: IntArray): IntArray { return TODO("body: ([I)[I") }
    public fun request(): Boolean { return TODO("body: ()Z") }
}
