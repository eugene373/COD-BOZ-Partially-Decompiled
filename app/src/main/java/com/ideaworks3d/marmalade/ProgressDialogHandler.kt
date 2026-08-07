package com.ideaworks3d.marmalade

import android.app.ProgressDialog
import android.os.Handler
import android.os.Message

internal class ProgressDialogHandler : Handler() {

    private var progressDialog: ProgressDialog? = null

    override fun handleMessage(msg: Message) {
        when (msg.what) {
            PROGRESS_START -> {
                progressDialog = ProgressDialog.show(LoaderActivity.m_Activity, "", "", true, false)
            }
            PROGRESS_FINISH -> {
                if (progressDialog != null && progressDialog!!.isShowing) {
                    progressDialog!!.dismiss()
                    progressDialog = null
                }
            }
        }
    }

    companion object {
        const val PROGRESS_START = 0
        const val PROGRESS_FINISH = 1
    }
}
