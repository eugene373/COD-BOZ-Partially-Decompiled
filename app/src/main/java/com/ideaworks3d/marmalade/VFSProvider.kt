package com.ideaworks3d.marmalade

import android.content.ContentProvider
import android.content.ContentValues
import android.content.res.AssetFileDescriptor
import android.database.Cursor
import android.net.Uri
import android.os.ParcelFileDescriptor
import java.io.File
import java.io.FileNotFoundException

class VFSProvider : ContentProvider() {

    override fun onCreate(): Boolean {
        LoaderAPI.traceChan(
            className() + "-" + Thread.currentThread().name,
            "Creating VFSProvider",
        )
        return true
    }

    @Throws(FileNotFoundException::class)
    override fun openAssetFile(uri: Uri, mode: String): AssetFileDescriptor? {
        var path = uri.encodedPath ?: return null
        if (path.startsWith("/")) {
            path = path.substring(1)
        }
        return getAssetFileDescriptor(path)
    }

    @Throws(FileNotFoundException::class)
    override fun openFile(uri: Uri, mode: String): ParcelFileDescriptor? {
        val afd = openAssetFile(uri, mode)
        return afd?.parcelFileDescriptor
    }

    override fun query(
        uri: Uri,
        projection: Array<String>?,
        selection: String?,
        selectionArgs: Array<String>?,
        sortOrder: String?,
    ): Cursor? = null

    fun getAssetFileDescriptor(path: String): AssetFileDescriptor? {
        val parts = path.split("/")
        if (parts.size < 3) {
            LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, "Invalid URi")
            return null
        }
        return try {
            val offset = parts[parts.size - 2].toLong()
            val length = parts[parts.size - 1].toLong()
            var root = parts[0]
            for (i in 1 until parts.size - 2) {
                root = "$root/${parts[i]}"
            }
            val file = File(root)
            val pfd = ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY)
            AssetFileDescriptor(pfd, offset, length)
        } catch (_: NumberFormatException) {
            LoaderAPI.traceChan(
                className() + "-" + Thread.currentThread().name,
                "Failed to parse file offset / length from URI",
            )
            null
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
            null
        }
    }

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<String>?,
    ): Int = 0

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int = 0

    override fun insert(uri: Uri, values: ContentValues?): Uri? = null

    override fun getType(uri: Uri): String = "vnd.android.cursor.item/asset"

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    companion object {
        private const val EXP_PATH = "/Android/obb/"
        private const val CONTENT_PREFIX = "content://"
        // From AndroidManifest.xml android:authorities
        private const val AUTHORITY = "zzzz3cbc70bb20f852f289fb0ebc606135c5.VFSProvider"

        @JvmField
        var ASSET_URI: Uri = Uri.parse(CONTENT_PREFIX + AUTHORITY)
    }
}
