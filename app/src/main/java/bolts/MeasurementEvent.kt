package bolts

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 3 fields, 4 methods.

open class MeasurementEvent {
        private var appContext: android.content.Context
        private var name: String
        private var args: android.os.Bundle

    private fun sendBroadcast() { /* TODO(body): ()V */ }

    companion object {
        @JvmStatic fun sendBroadcastEvent(p0: android.content.Context, p1: String, p2: android.content.Intent, p3: java.util.Map) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Ljava/util/Map;)V */ }
        private @JvmStatic fun getApplinkLogData(p0: android.content.Context, p1: String, p2: android.os.Bundle, p3: android.content.Intent): android.os.Bundle { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Intent;)Landroid/os/Bundle;") }
        private @JvmStatic fun objectToJSONString(p0: Object): String { return TODO("body: (Ljava/lang/Object;)Ljava/lang/String;") }
    }
}
