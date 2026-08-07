package bolts

import android.net.Uri

interface AppLinkResolver {
    fun getAppLinkFromUrlInBackground(url: Uri): Task<AppLink>
}
