package com.ideaworks3d.marmalade;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;

class ProgressDialogHandler extends Handler {
      public static final int PROGRESS_START = 0;
      public static final int PROGRESS_FINISH = 1;
      private ProgressDialog progressDialog;

      public void handleMessage(Message var1) {
            switch(var1.what) {
            case 0:
                  this.progressDialog = ProgressDialog.show(LoaderActivity.m_Activity, "", "", true, false);
                  break;
            case 1:
                  if (this.progressDialog != null && this.progressDialog.isShowing()) {
                        this.progressDialog.dismiss();
                        this.progressDialog = null;
                  }
            }

      }
}
