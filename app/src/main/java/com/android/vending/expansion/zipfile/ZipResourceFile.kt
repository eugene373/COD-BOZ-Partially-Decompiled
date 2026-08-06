package com.android.vending.expansion.zipfile

import android.content.Context
import android.content.res.AssetFileDescriptor
import android.os.ParcelFileDescriptor
import java.io.InputStream

class ZipResourceFile(
    context: Context? = null,
    apkExpansionFile: String? = null,
    datafile: String? = null
) {

    constructor(datafile: String) : this(null, null, datafile)

    fun getAssetFileDescriptor(filename: String): AssetFileDescriptor? = null
    fun getFileDescriptor(filename: String): ParcelFileDescriptor? = null
    fun getInputStream(filename: String): InputStream? = null
    fun getAllEntryNames(): Array<String> = emptyArray()
}