package com.ideaworks3d.marmalade.event;

public class RequestPermissionsResultEvent {
      public int m_requestCode;
      public String[] m_permissions;
      public int[] m_grantResults;

      public RequestPermissionsResultEvent(int var1, String[] var2, int[] var3) {
            this.m_requestCode = var1;
            this.m_permissions = var2;
            this.m_grantResults = var3;
      }
}
