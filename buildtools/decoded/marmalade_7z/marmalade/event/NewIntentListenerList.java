package com.ideaworks3d.marmalade.event;

import com.ideaworks3d.marmalade.NewIntentEvent;
import com.ideaworks3d.marmalade.NewIntentListener;
import java.util.Iterator;

public class NewIntentListenerList extends ListenerList {
      public void notifyAll(NewIntentEvent var1) {
            Iterator var2 = this.m_Listeners.iterator();

            while(var2.hasNext()) {
                  NewIntentListener var3 = (NewIntentListener)var2.next();
                  if (var3 != null) {
                        var3.onNewIntentEvent(var1);
                  }
            }

      }
}
