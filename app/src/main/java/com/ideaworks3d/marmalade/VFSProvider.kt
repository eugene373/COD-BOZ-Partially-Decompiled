package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 4 fields, 9 methods.

open class VFSProvider: android.content.ContentProvider() {
    public fun onCreate(): Boolean { return TODO("body: ()Z") }
    public fun openAssetFile(p0: android.net.Uri, p1: String): android.content.res.AssetFileDescriptor { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;") }
    public fun openFile(p0: android.net.Uri, p1: String): android.os.ParcelFileDescriptor { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;") }
    public fun query(p0: android.net.Uri, p1: Array<String>, p2: String, p3: Array<String>, p4: String): android.database.Cursor { return TODO("body: (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;") }
    public fun getAssetFileDescriptor(p0: String): android.content.res.AssetFileDescriptor { return TODO("body: (Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;") }
    public fun update(p0: android.net.Uri, p1: android.content.ContentValues, p2: String, p3: Array<String>): Int { return TODO("body: (Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I") }
    public fun delete(p0: android.net.Uri, p1: String, p2: Array<String>): Int { return TODO("body: (Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I") }
    public fun insert(p0: android.net.Uri, p1: android.content.ContentValues): android.net.Uri { return TODO("body: (Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;") }
    public fun getType(p0: android.net.Uri): String { return TODO("body: (Landroid/net/Uri;)Ljava/lang/String;") }

    companion object {
        private var EXP_PATH: String
        private var CONTENT_PREFIX: String
        private var AUTHORITY: String
        @JvmField public var ASSET_URI: android.net.Uri
    }
}
