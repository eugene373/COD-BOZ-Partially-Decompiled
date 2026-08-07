package com.ideaworks3d.marmalade.event;

import java.util.Iterator;

public class RequestPermissionsResultListenerList extends ListenerList {
      public void notifyAll(RequestPermissionsResultEvent var1) {
            Iterator var2 = this.m_Listeners.iterator();

            while(var2.hasNext()) {
                  RequestPermissionsResultListener var3 = (RequestPermissionsResultListener)var2.next();
                  if (var3 != null) {
                        var3.onRequestPermissionsResultEvent(var1);
                  }
            }

      }
}
