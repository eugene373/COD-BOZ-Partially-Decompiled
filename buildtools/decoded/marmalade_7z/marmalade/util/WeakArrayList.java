package com.ideaworks3d.marmalade.util;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeakArrayList extends AbstractList {
      private List m_list = new ArrayList();

      public void expunge() {
            Iterator var1 = this.iterator();

            while(var1.hasNext()) {
                  if (var1.next() == null) {
                        var1.remove();
                  }
            }

      }

      public boolean add(Object var1) {
            return !this.contains(var1) ? this.m_list.add(new WeakReference(var1)) : false;
      }

      public Object get(int var1) {
            WeakReference var2 = (WeakReference)this.m_list.get(var1);
            return var2 == null ? null : var2.get();
      }

      public int size() {
            return this.m_list.size();
      }

      public Iterator iterator() {
            return new Iterator() {
                  private Iterator it;

                  {
                        this.it = WeakArrayList.this.m_list.iterator();
                  }

                  public Object next() {
                        WeakReference var1 = (WeakReference)this.it.next();
                        return var1 == null ? null : var1.get();
                  }

                  public void remove() {
                        this.it.remove();
                  }

                  public boolean hasNext() {
                        return this.it.hasNext();
                  }
            };
      }
}
