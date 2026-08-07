package com.ideaworks3d.marmalade.event;

import android.view.View.OnKeyListener;
import com.ideaworks3d.marmalade.LoaderAPI;
import com.ideaworks3d.marmalade.NewIntentEvent;
import com.ideaworks3d.marmalade.NewIntentListener;
import com.ideaworks3d.marmalade.SuspendResumeEvent;
import com.ideaworks3d.marmalade.SuspendResumeListener;
import java.util.Stack;

public class ListenerManager {
      private SuspendResumeListenerList m_SuspendResumeListeners = null;
      private ActivityResultListenerList m_ActivityResultListeners = null;
      private RequestPermissionsResultListenerList m_RequestPermissionsResultListeners = null;
      private NewIntentListenerList m_NewIntentListeners = null;
      private Stack m_KeyListeners = null;

      public ListenerManager() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "ListenerManager create lists");
            this.m_SuspendResumeListeners = new SuspendResumeListenerList();
            this.m_ActivityResultListeners = new ActivityResultListenerList();
            this.m_RequestPermissionsResultListeners = new RequestPermissionsResultListenerList();
            this.m_NewIntentListeners = new NewIntentListenerList();
            this.m_KeyListeners = new Stack();
      }

      public void addActivityResultListener(ActivityResultListener var1) {
            this.m_ActivityResultListeners.add(var1);
      }

      public boolean removeActivityResultListener(ActivityResultListener var1) {
            return this.m_ActivityResultListeners.remove(var1);
      }

      public void notifyActivityResultListeners(ActivityResultEvent var1) {
            this.m_ActivityResultListeners.notifyAll(var1);
      }

      public void addRequestPermissionsResultListener(RequestPermissionsResultListener var1) {
            this.m_RequestPermissionsResultListeners.add(var1);
      }

      public boolean removeRequestPermissionsResultListener(RequestPermissionsResultListener var1) {
            return this.m_RequestPermissionsResultListeners.remove(var1);
      }

      public void notifyRequestPermissionsResultListeners(RequestPermissionsResultEvent var1) {
            this.m_RequestPermissionsResultListeners.notifyAll(var1);
      }

      public void addSuspendResumeListener(SuspendResumeListener var1) {
            this.m_SuspendResumeListeners.add(var1);
      }

      public boolean removeSuspendResumeListener(SuspendResumeListener var1) {
            return this.m_SuspendResumeListeners.remove(var1);
      }

      public void notifySuspendResumeListeners(SuspendResumeEvent var1) {
            this.m_SuspendResumeListeners.notifyAll(var1);
      }

      public void addNewIntentListener(NewIntentListener var1) {
            this.m_NewIntentListeners.add(var1);
      }

      public boolean removeNewIntentListener(NewIntentListener var1) {
            return this.m_NewIntentListeners.remove(var1);
      }

      public void notifyNewIntentListeners(NewIntentEvent var1) {
            this.m_NewIntentListeners.notifyAll(var1);
      }

      public void pushKeyListener(OnKeyListener var1) {
            this.m_KeyListeners.push(var1);
            LoaderAPI.getMainView().setOnKeyListener(var1);
      }

      public OnKeyListener popKeyListener() {
            OnKeyListener var1 = (OnKeyListener)this.m_KeyListeners.pop();
            LoaderAPI.getMainView().setOnKeyListener(var1);
            return var1;
      }
}
