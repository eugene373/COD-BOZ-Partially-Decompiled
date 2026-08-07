package com.savegame

import android.app.Activity
import android.content.Context
import android.content.res.AssetManager
import android.os.Environment
import android.util.Log
import android.widget.Toast
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream

object SavesRestoring {

    private const val PREFS_NAME = "savegame"

    fun doSmth(context: Context) {
        try {
            smartDataRestoreForYou(context, context.assets, context.packageName)
        } catch (e: Exception) {
            val tag = context.packageName + ":savemessages"
            Log.e(tag, "Message: " + e.message, e)
        }
    }

    private fun existsInArray(array: Array<String>, target: String): Boolean {
        for (item in array) {
            if (item.contains(target)) {
                return true
            }
        }
        return false
    }

    private fun smartDataRestoreForYou(context: Context, assets: AssetManager, packageName: String) {
        val logTag = "$packageName:savemessages"

        if (!context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .getBoolean("notfirst", false)) {
            Log.i(logTag, "SmDR: Starting...")
            context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
                .edit()
                .putBoolean("notfirst", true)
                .apply()

            val assetFiles = assets.list("") ?: emptyArray()

            for ((i, name) in assetFiles.withIndex()) {
                Log.i(logTag, "ListFiles[$i] = $name")
            }

            // Restore internal save data
            if (existsInArray(assetFiles, "data.save")) {
                Toast.makeText(context, "Restoring save...", Toast.LENGTH_SHORT).show()
                try {
                    assets.open("data.save").use { inputStream ->
                        val targetPath = context.filesDir.path
                        Log.i(logTag, "data.save: Restoring to $targetPath")
                        unZipIt(inputStream, targetPath)
                        Log.i(logTag, "data.save: Successfully restored")
                    }
                } catch (e: Exception) {
                    Log.e(logTag, "data.save: Message: " + e.message, e)
                    Toast.makeText(context, "Can't restore save", Toast.LENGTH_LONG).show()
                }
            }

            // Restore OBB cache
            if (existsInArray(assetFiles, "extobb.save")) {
                Toast.makeText(context, "Restoring cache...", Toast.LENGTH_SHORT).show()
                try {
                    assets.open("extobb.save").use { inputStream ->
                        val targetPath = context.obbDir.absolutePath + "/"
                        Log.i(logTag, "extobb.save: Restoring...")
                        unZipIt(inputStream, targetPath)
                        Log.i(logTag, "extobb.save: Successfully restored")
                    }
                } catch (e: Exception) {
                    Log.e(logTag, "extobb.save: Message: " + e.message, e)
                    Toast.makeText(context, "Can't restore external cache", Toast.LENGTH_LONG).show()
                }
            }

            // Restore external data
            if (existsInArray(assetFiles, "extdata.save")) {
                Toast.makeText(context, "Restoring external data...", Toast.LENGTH_SHORT).show()
                try {
                    assets.open("extdata.save").use { inputStream ->
                        val targetPath = Environment.getExternalStorageDirectory().toString() +
                                "/Android/data/$packageName/"
                        File(targetPath).mkdirs()
                        Log.i(logTag, "extdata.save: Restoring...")
                        unZipIt(inputStream, targetPath)
                        Log.i(logTag, "extdata.save: Successfully restored")
                    }
                } catch (e: Exception) {
                    Log.e(logTag, "extdata.save: Message: " + e.message, e)
                    Toast.makeText(context, "Can't restore external data", Toast.LENGTH_LONG).show()
                }
            }

            Log.i(logTag, "Restoring completed")
            Toast.makeText(context, "Restoring completed", Toast.LENGTH_LONG).show()
        }
    }

    @Throws(Exception::class)
    private fun unZipIt(inputStream: InputStream, targetDirectory: String) {
        ZipInputStream(inputStream).use { zipInputStream ->
            val buffer = ByteArray(1024)
            File(targetDirectory).mkdirs()

            var entry: ZipEntry? = zipInputStream.nextEntry
            while (entry != null) {
                if (!entry.isDirectory) {
                    val outFile = File(targetDirectory, entry.name)
                    val parentDir = outFile.parentFile
                    if (parentDir != null && !parentDir.exists()) {
                        parentDir.mkdirs()
                    }
                    FileOutputStream(outFile).use { fileOut ->
                        var length: Int = zipInputStream.read(buffer)
                        while (length > 0) {
                            fileOut.write(buffer, 0, length)
                            length = zipInputStream.read(buffer)
                        }
                    }
                }
                entry = zipInputStream.nextEntry
            }
        }
    }
}

// Original Java declared SavesRestoring as `extends Activity`. The class only
// contains static methods, so it doesn't need to be an Activity subclass —
// declared as a Kotlin `object` here. If any JNI lookup resolves by the
// Activity superclass (`com.savegame.SavesRestoring`), add
// `@Suppress("LeakingThis") class SavesRestoring : Activity()` and demote
// these to companion-object methods.
