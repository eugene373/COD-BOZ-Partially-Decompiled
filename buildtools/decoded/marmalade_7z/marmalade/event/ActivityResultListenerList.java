package com.ideaworks3d.marmalade.event;

import java.util.Iterator;

public class ActivityResultListenerList extends ListenerList {
      public void notifyAll(ActivityResultEvent var1) {
            Iterator var2 = this.m_Listeners.iterator();

            while(var2.hasNext()) {
                  ActivityResultListener var3 = (ActivityResultListener)var2.next();
                  if (var3 != null) {
                        var3.onActivityResultEvent(var1);
                  }
            }

      }
}
