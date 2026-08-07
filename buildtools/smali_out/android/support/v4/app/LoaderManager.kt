package android.support.v4.app

// Auto-emitted from smali source: LoaderManager.java.
// 0 fields, 8 methods.

open class LoaderManager {
    public constructor()

    public fun destroyLoader(p0: Int)

    public fun dump(p0: String, p1: java.io.FileDescriptor, p2: java.io.PrintWriter, p3: Array<String>)

    public fun getLoader(p0: Int): android.support.v4.content.Loader

    public fun hasRunningLoaders(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun initLoader(p0: Int, p1: android.os.Bundle, p2: android.support.v4.app.LoaderManager.LoaderCallbacks): android.support.v4.content.Loader

    public fun restartLoader(p0: Int, p1: android.os.Bundle, p2: android.support.v4.app.LoaderManager.LoaderCallbacks): android.support.v4.content.Loader

    companion object {
    public @JvmStatic fun enableDebugLogging(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         sput-boolean p0, Landroid/support/v4/app/LoaderManagerImpl;->DEBUG:Z
    //         return-void
    */

    }
}
