package com.ideaworks3d.marmalade.event;

import com.ideaworks3d.marmalade.SuspendResumeEvent;
import com.ideaworks3d.marmalade.SuspendResumeListener;
import java.util.Iterator;

public class SuspendResumeListenerList extends ListenerList {
      public void notifyAll(SuspendResumeEvent var1) {
            Iterator var2 = this.m_Listeners.iterator();

            while(var2.hasNext()) {
                  SuspendResumeListener var3 = (SuspendResumeListener)var2.next();
                  if (var3 != null) {
                        var3.onSuspendResumeEvent(var1);
                  }
            }

      }
}
