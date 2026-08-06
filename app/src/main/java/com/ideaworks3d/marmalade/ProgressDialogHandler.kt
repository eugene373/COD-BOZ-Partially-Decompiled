package com.ideaworks3d.marmalade

import android.app.ProgressDialog
import android.os.Handler
import android.os.Message

open class ProgressDialogHandler : Handler() {
    companion object {
        const val PROGRESS_START = 0
        const val PROGRESS_FINISH = 1
    }

    private var progressDialog: ProgressDialog? = null

    override fun handleMessage(msg: Message) {
        when (msg.what) {
            PROGRESS_START -> {
                val activity = LoaderActivity.m_Activity
                @Suppress("DEPRECATION")
                progressDialog = activity?.let {
                    ProgressDialog.show(it, "", "", true, false)
                }
            }
            PROGRESS_FINISH -> {
                if (progressDialog?.isShowing == true) {
                    progressDialog?.dismiss()
                    progressDialog = null
                }
            }
        }
    }
}
