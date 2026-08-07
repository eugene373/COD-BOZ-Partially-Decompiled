package bolts

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 4 fields, 18 methods.

open class AppLinkNavigation {
        private val appLink: bolts.AppLink
        private val extras: android.os.Bundle
        private val appLinkData: android.os.Bundle

    public fun getAppLink(): bolts.AppLink { return TODO("body: ()Lbolts/AppLink;") }
    public fun getAppLinkData(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    public fun getExtras(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    private fun buildAppLinkDataForNavigation(p0: android.content.Context): android.os.Bundle { return TODO("body: (Landroid/content/Context;)Landroid/os/Bundle;") }
    private fun getJSONValue(p0: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    private fun getJSONForBundle(p0: android.os.Bundle): org.json.JSONObject { return TODO("body: (Landroid/os/Bundle;)Lorg/json/JSONObject;") }
    public fun navigate(p0: android.content.Context): bolts.AppLinkNavigation$NavigationResult { return TODO("body: (Landroid/content/Context;)Lbolts/AppLinkNavigation$NavigationResult;") }
    private fun sendAppLinkNavigateEventBroadcast(p0: android.content.Context, p1: android.content.Intent, p2: bolts.AppLinkNavigation$NavigationResult, p3: org.json.JSONException) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;Lbolts/AppLinkNavigation$NavigationResult;Lorg/json/JSONException;)V */ }

    companion object {
        private var defaultResolver: bolts.AppLinkResolver

        public @JvmStatic fun setDefaultResolver(p0: bolts.AppLinkResolver) { /* TODO(body): (Lbolts/AppLinkResolver;)V */ }
        public @JvmStatic fun getDefaultResolver(): bolts.AppLinkResolver { return TODO("body: ()Lbolts/AppLinkResolver;") }
        private @JvmStatic fun getResolver(p0: android.content.Context): bolts.AppLinkResolver { return TODO("body: (Landroid/content/Context;)Lbolts/AppLinkResolver;") }
        public @JvmStatic fun navigate(p0: android.content.Context, p1: bolts.AppLink): bolts.AppLinkNavigation$NavigationResult { return TODO("body: (Landroid/content/Context;Lbolts/AppLink;)Lbolts/AppLinkNavigation$NavigationResult;") }
        public @JvmStatic fun navigateInBackground(p0: android.content.Context, p1: android.net.Uri, p2: bolts.AppLinkResolver): bolts.Task { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;Lbolts/AppLinkResolver;)Lbolts/Task;") }
        public @JvmStatic fun navigateInBackground(p0: android.content.Context, p1: java.net.URL, p2: bolts.AppLinkResolver): bolts.Task { return TODO("body: (Landroid/content/Context;Ljava/net/URL;Lbolts/AppLinkResolver;)Lbolts/Task;") }
        public @JvmStatic fun navigateInBackground(p0: android.content.Context, p1: String, p2: bolts.AppLinkResolver): bolts.Task { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Lbolts/AppLinkResolver;)Lbolts/Task;") }
        public @JvmStatic fun navigateInBackground(p0: android.content.Context, p1: android.net.Uri): bolts.Task { return TODO("body: (Landroid/content/Context;Landroid/net/Uri;)Lbolts/Task;") }
        public @JvmStatic fun navigateInBackground(p0: android.content.Context, p1: java.net.URL): bolts.Task { return TODO("body: (Landroid/content/Context;Ljava/net/URL;)Lbolts/Task;") }
        public @JvmStatic fun navigateInBackground(p0: android.content.Context, p1: String): bolts.Task { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Lbolts/Task;") }
    }
}
