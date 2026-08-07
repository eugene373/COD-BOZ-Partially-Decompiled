package com.facebook.android

// Auto-emitted from smali source: AsyncFacebookRunner.java.
// 0 fields, 5 methods.

interface AsyncFacebookRunner_RequestListener {
    public fun onComplete(p0: String, p1: Object)

    public fun onFacebookError(p0: com.facebook.android.FacebookError, p1: Object)

    public fun onFileNotFoundException(p0: java.io.FileNotFoundException, p1: Object)

    public fun onIOException(p0: java.io.IOException, p1: Object)

    public fun onMalformedURLException(p0: java.net.MalformedURLException, p1: Object)

}
