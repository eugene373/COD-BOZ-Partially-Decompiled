package bolts

import android.net.Uri
import java.util.Collections

class AppLink(
    private val sourceUrl: Uri?,
    targets: List<Target>?,
    private val webUrl: Uri?
) {
    private val targets: List<Target> = targets ?: Collections.emptyList()

    fun getSourceUrl(): Uri? = sourceUrl

    fun getTargets(): List<Target> = Collections.unmodifiableList(targets)

    fun getWebUrl(): Uri? = webUrl

    class Target(
        val packageName: String?,
        val className: String?,
        val url: Uri?,
        val appName: String?
    )
}
