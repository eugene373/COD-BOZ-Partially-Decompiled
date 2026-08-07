package com.ideaworks3d.marmalade.event;

import com.ideaworks3d.marmalade.util.WeakArrayList;

public class ListenerList {
      protected WeakArrayList m_Listeners = new WeakArrayList();

      public boolean add(Object var1) {
            this.m_Listeners.expunge();
            return var1 != null ? this.m_Listeners.add(var1) : false;
      }

      public boolean remove(Object var1) {
            this.m_Listeners.expunge();
            return var1 != null ? this.m_Listeners.remove(var1) : false;
      }
}
