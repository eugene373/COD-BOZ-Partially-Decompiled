package com.ideaworks3d.marmalade

import android.database.Cursor
import android.net.Uri

object CursorLoaderHelper {
    fun getCursor(
        uri: Uri,
        projection: Array<String>,
        completeCallback: LoaderActivity.CursorCompleteListener
    ): Boolean {
        try {
            val activity = LoaderAPI.getActivity()
            val loader = android.content.CursorLoader(
                activity,
                uri,
                projection,
                null,
                null,
                null
            )

            loader.registerListener(0, object : android.content.Loader.OnLoadCompleteListener<Cursor> {
                override fun onLoadComplete(loader: android.content.Loader<Cursor>, data: Cursor?) {
                    LoaderAPI.trace("CursorLoader onLoadComplete")
                    completeCallback.cursorLoadComplete(data)
                }
            })

            loader.startLoading()
        } catch (e: Exception) {
            LoaderAPI.trace("Could not create cursorLoader $e")
            LoaderAPI.trace(e.message ?: "")
        }
        return false
    }
}
