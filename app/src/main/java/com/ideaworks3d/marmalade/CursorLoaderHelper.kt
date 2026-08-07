package com.ideaworks3d.marmalade

import android.content.CursorLoader
import android.database.Cursor
import android.net.Uri

object CursorLoaderHelper {

    @JvmStatic
    fun getCursor(uri: Uri, projection: Array<String>?, complete: LoaderActivity.CursorCompleteListener): Boolean {
        return try {
            val loader = CursorLoader(
                LoaderAPI.getActivity(),
                uri,
                projection,
                null, null, null,
            )
            loader.registerListener(0) { _, data ->
                LoaderAPI.trace("CursorLoader onLoadComplete")
                complete.cursorLoadComplete(data as Cursor)
            }
            loader.startLoading()
            false
        } catch (e: Exception) {
            LoaderAPI.trace("Could not create cursorLoader $e")
            LoaderAPI.trace(e.message)
            false
        }
    }
}
