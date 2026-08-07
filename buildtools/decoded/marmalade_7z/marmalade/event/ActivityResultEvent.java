package com.ideaworks3d.marmalade.event;

import android.content.Intent;

public class ActivityResultEvent {
      public Intent m_intent;
      public int m_requestCode;
      public int m_resultCode;

      public ActivityResultEvent(Intent var1, int var2, int var3) {
            this.m_intent = var1;
            this.m_requestCode = var2;
            this.m_resultCode = var3;
      }
}
