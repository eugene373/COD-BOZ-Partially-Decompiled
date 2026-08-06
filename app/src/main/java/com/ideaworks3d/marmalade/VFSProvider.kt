package com.ideaworks3d.marmalade

import android.content.ContentProvider
import android.content.ContentValues
import android.content.Context
import android.content.pm.ProviderInfo
import android.database.Cursor
import android.net.Uri
import android.os.ParcelFileDescriptor
import java.io.File
import java.io.FileNotFoundException

class VFSProvider : ContentProvider() {

    companion object {
        const val EXP_PATH = "/Android/obb/"
        const val CONTENT_PREFIX = "content://"

        @JvmField
        var ASSET_URI: Uri = Uri.parse("content://${Resources.VFSPROVIDER_AUTHORITY}")

        @JvmField
        var AUTHORITY: String = Resources.VFSPROVIDER_AUTHORITY

        @JvmField
        var CONTENT_URI: Uri = Uri.parse("$CONTENT_PREFIX$AUTHORITY")
    }

    override fun onCreate(): Boolean {
        return true
    }

    override fun query(
        uri: Uri, projection: Array<String>?, selection: String?,
        selectionArgs: Array<String>?, sortOrder: String?
    ): Cursor? = null

    override fun getType(uri: Uri): String? = null

    override fun insert(uri: Uri, values: ContentValues?): Uri? = null

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<String>?): Int = 0

    override fun update(
        uri: Uri, values: ContentValues?, selection: String?,
        selectionArgs: Array<String>?
    ): Int = 0

    override fun openFile(uri: Uri, mode: String): ParcelFileDescriptor? {
        val path = uri.path?.substring(1) ?: return null
        val parts = path.split("/")
        if (parts.size < 2) return null

        val filePath = parts[0]
        val start = parts[1].toLong()
        val length = if (parts.size > 2) parts[2].toLong() else -1L

        val file = File(filePath)
        if (!file.exists()) throw FileNotFoundException(uri.toString())

        return if (length < 0) {
            ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY)
        } else {
            ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY)
        }
    }

    override fun attachInfo(context: Context?, info: ProviderInfo?) {
        super.attachInfo(context, info)
        val context = context ?: return
        val info = info ?: return
    }
}
