package com.savegame

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

    fun DoSmth(context: Context) {
        try {
            SmartDataRestoreForYou(context, context.assets, context.packageName)
        } catch (e: Exception) {
            val tag = "${context.packageName}:savemessages"
            Log.e(tag, "Message: ${e.message}", e)
        }
    }

    private fun ExistsInArray(array: Array<String>, target: String): Boolean {
        for (item in array) {
            if (item.contains(target)) {
                return true
            }
        }
        return false
    }

    private fun SmartDataRestoreForYou(context: Context, assets: AssetManager, packageName: String): Unit {
        val prefsName = "savegame"
        val logTag = "$packageName:savemessages"

        if (!context.getSharedPreferences(prefsName, Context.MODE_PRIVATE).getBoolean("notfirst", false)) {
            Log.i(logTag, "SmDR: Starting...")
            context.getSharedPreferences(prefsName, Context.MODE_PRIVATE)
                    .edit()
                    .putBoolean("notfirst", true)
                    .apply()

            val assetFiles = assets.list("") ?: return

            for ((i, assetFile) in assetFiles.withIndex()) {
                Log.i(logTag, "ListFiles[$i] = $assetFile")
            }

            // Restore internal save data
            if (ExistsInArray(assetFiles, "data.save")) {
                Toast.makeText(context, "Restoring save...", Toast.LENGTH_SHORT).show()
                try {
                    assets.open("data.save").use { inputStream ->
                        val targetPath = context.filesDir.path // Safer internal path
                        Log.i(logTag, "data.save: Restoring to $targetPath")
                        unZipIt(inputStream, targetPath)
                        Log.i(logTag, "data.save: Successfully restored")
                    }
                } catch (e: Exception) {
                    Log.e(logTag, "data.save: Message: ${e.message}", e)
                    Toast.makeText(context, "Can't restore save", Toast.LENGTH_LONG).show()
                }
            }

            // Restore OBB cache
            if (ExistsInArray(assetFiles, "extobb.save")) {
                Toast.makeText(context, "Restoring cache...", Toast.LENGTH_SHORT).show()
                val targetPath = context.obbDir?.absolutePath?.let { "$it/" } ?: return
                try {
                    assets.open("extobb.save").use { inputStream ->
                        Log.i(logTag, "extobb.save: Restoring...")
                        unZipIt(inputStream, targetPath)
                        Log.i(logTag, "extobb.save: Successfully restored")
                    }
                } catch (e: Exception) {
                    Log.e(logTag, "extobb.save: Message: ${e.message}", e)
                    Toast.makeText(context, "Can't restore external cache", Toast.LENGTH_LONG).show()
                }
            }

            // Restore external data
            if (ExistsInArray(assetFiles, "extdata.save")) {
                Toast.makeText(context, "Restoring external data...", Toast.LENGTH_SHORT).show()
                try {
                    assets.open("extdata.save").use { inputStream ->
                        val targetPath = "${Environment.getExternalStorageDirectory()}/Android/data/$packageName/"
                        File(targetPath).mkdirs()
                        Log.i(logTag, "extdata.save: Restoring...")
                        unZipIt(inputStream, targetPath)
                        Log.i(logTag, "extdata.save: Successfully restored")
                    }
                } catch (e: Exception) {
                    Log.e(logTag, "extdata.save: Message: ${e.message}", e)
                    Toast.makeText(context, "Can't restore external data", Toast.LENGTH_LONG).show()
                }
            }

            Log.i(logTag, "Restoring completed")
            Toast.makeText(context, "Restoring completed", Toast.LENGTH_LONG).show()
        }
    }

    private fun unZipIt(inputStream: InputStream, targetDirectory: String) {
        ZipInputStream(inputStream).use { zipInputStream ->
            val buffer = ByteArray(1024)
            File(targetDirectory).mkdirs()

            var entry: ZipEntry?
            while (true) {
                entry = zipInputStream.nextEntry
                if (entry == null) break
                if (entry.isDirectory) continue

                val outFile = File(targetDirectory, entry.name)
                val parentDir = outFile.parentFile
                if (parentDir != null && !parentDir.exists()) {
                    parentDir.mkdirs()
                }

                FileOutputStream(outFile).use { fileOut ->
                    var length: Int
                    while (zipInputStream.read(buffer).also { length = it } > 0) {
                        fileOut.write(buffer, 0, length)
                    }
                }
            }
        }
    }
}