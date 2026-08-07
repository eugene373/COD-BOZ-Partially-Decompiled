package bolts

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 1 fields, 4 methods.

open class WebViewAppLinkResolver: bolts.AppLinkResolver {
        private val context: android.content.Context

    public fun getAppLinkFromUrlInBackground(p0: android.net.Uri): bolts.Task { return TODO("body: (Landroid/net/Uri;)Lbolts/Task;") }

    companion object {
        private @JvmStatic fun makeAppLinkFromAlData(p0: java.util.Map, p1: android.net.Uri): bolts.AppLink { return TODO("body: (Ljava/util/Map;Landroid/net/Uri;)Lbolts/AppLink;") }
        private @JvmStatic fun tryCreateUrl(p0: String): android.net.Uri { return TODO("body: (Ljava/lang/String;)Landroid/net/Uri;") }
        private @JvmStatic fun readFromConnection(p0: java.net.URLConnection): String { return TODO("body: (Ljava/net/URLConnection;)Ljava/lang/String;") }
    }
}
