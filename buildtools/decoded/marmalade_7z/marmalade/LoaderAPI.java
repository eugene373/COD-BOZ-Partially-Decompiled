package com.ideaworks3d.marmalade;

import android.util.Log;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.FrameLayout;
import com.ideaworks3d.marmalade.event.ActivityResultEvent;
import com.ideaworks3d.marmalade.event.ActivityResultListener;
import com.ideaworks3d.marmalade.event.ListenerManager;
import com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent;
import com.ideaworks3d.marmalade.event.RequestPermissionsResultListener;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LoaderAPI {
      public static final int S3E_RESULT_SUCCESS = 0;
      public static final int S3E_RESULT_ERROR = 1;

      public static native void s3eDebugTraceLine(String var0);

      public static native void s3eDeviceYield(int var0);

      public static native int s3eConfigGetInt(String var0, String var1, int[] var2);

      public static native int s3eConfigGetString(String var0, String var1, String[] var2);

      public static native int s3eConfigGet(String var0, int var1);

      public static void traceChan(String var0, String var1) {
            trace(var0 + ": " + var1);
      }

      public static void trace(String var0) {
            if (LoaderActivity.m_Activity != null) {
                  s3eDebugTraceLine(var0);
            } else {
                  Log.i("MARMALADE", var0);
            }

      }

      public static String getStackTrace(Throwable var0) {
            StringWriter var1 = new StringWriter();
            PrintWriter var2 = new PrintWriter(var1);
            var0.printStackTrace(var2);
            return var1.toString();
      }

      public static String getStackTrace() {
            try {
                  throw new Exception("Tracer");
            } catch (Exception var3) {
                  StringWriter var1 = new StringWriter();
                  PrintWriter var2 = new PrintWriter(var1);
                  var3.printStackTrace(var2);
                  return var1.toString();
            }
      }

      public static LoaderActivity getActivity() {
            return LoaderActivity.m_Activity;
      }

      public static View getMainView() {
            return LoaderActivity.m_Activity.m_View;
      }

      public static FrameLayout getFrameLayout() {
            return LoaderActivity.m_Activity.m_FrameLayout;
      }

      public static ListenerManager getListenerManager() {
            if (LoaderActivity.m_Activity.m_ListenerManager == null) {
                  LoaderActivity.m_Activity.m_ListenerManager = new ListenerManager();
            }

            return LoaderActivity.m_Activity.m_ListenerManager;
      }

      public static void addActivityResultListener(ActivityResultListener var0) {
            getListenerManager().addActivityResultListener(var0);
      }

      public static boolean removeActivityResultListener(ActivityResultListener var0) {
            return getListenerManager().removeActivityResultListener(var0);
      }

      public static void notifyActivityResultListeners(ActivityResultEvent var0) {
            getListenerManager().notifyActivityResultListeners(var0);
      }

      public static void addRequestPermissionsResultListener(RequestPermissionsResultListener var0) {
            getListenerManager().addRequestPermissionsResultListener(var0);
      }

      public static boolean removeRequestPermissionsResultListener(RequestPermissionsResultListener var0) {
            return getListenerManager().removeRequestPermissionsResultListener(var0);
      }

      public static void notifyRequestPermissionsResultListeners(RequestPermissionsResultEvent var0) {
            getListenerManager().notifyRequestPermissionsResultListeners(var0);
      }

      public static void addSuspendResumeListener(SuspendResumeListener var0) {
            getListenerManager().addSuspendResumeListener(var0);
      }

      public static boolean removeSuspendResumeListener(SuspendResumeListener var0) {
            return getListenerManager().removeSuspendResumeListener(var0);
      }

      public static void notifySuspendResumeListeners(SuspendResumeEvent var0) {
            getListenerManager().notifySuspendResumeListeners(var0);
      }

      public static void addNewIntentListener(NewIntentListener var0) {
            getListenerManager().addNewIntentListener(var0);
      }

      public static boolean removeNewIntentListener(NewIntentListener var0) {
            return getListenerManager().removeNewIntentListener(var0);
      }

      public static void notifyNewIntentListeners(NewIntentEvent var0) {
            getListenerManager().notifyNewIntentListeners(var0);
      }

      public static void pushKeyListener(OnKeyListener var0) {
            getListenerManager().pushKeyListener(var0);
      }

      public static OnKeyListener popKeyListener() {
            return getListenerManager().popKeyListener();
      }
}
