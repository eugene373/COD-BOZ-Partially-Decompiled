package com.ideaworks3d.marmalade;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.Process;
//import android.support.multidex.MultiDex;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.ideaworks3d.marmalade.event.ActivityResultEvent;
import com.ideaworks3d.marmalade.event.ListenerManager;
import com.ideaworks3d.marmalade.event.RequestPermissionsResultEvent;

public class LoaderActivity extends Activity {
      public static LoaderActivity m_Activity;
      public ListenerManager m_ListenerManager = null;
      private LoaderThread m_LoaderThread;
      public LoaderView m_View;
      public RelativeLayout m_TopLevel;
      public FrameLayout m_FrameLayout;
      public boolean m_IgnoreFocusLoss = false;
      private volatile boolean m_IntentBlocking;
      private boolean m_ExecuteIntentActivityNotFoundException = false;
      private static final int INTENT_CODE = 123456;
      private Intent m_Data;
      private Handler m_ProgressDialogHandler;
      private OrientationEventListener m_orientationEventListener = null;
      private boolean m_LegacySuspendMode = false;

      private native void onOrientationChangedNative();

      private native void setART(boolean var1);

      public LoaderThread LoaderThread() {
            return this.m_LoaderThread;
      }

      public LoaderActivity() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX new LoaderActivity XXX: " + this);
      }

      protected void attachBaseContext(Context var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX attachBaseContext XXX");
            super.attachBaseContext(var1);

            try {
                  Class.forName("android.support.multidex.MultiDex");
            } catch (ClassNotFoundException var3) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX Multidex support library is not detected XXX");
                  return;
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX Installing multidex XXX");
            //MultiDex.install(this);
      }

      protected void onCreate(Bundle var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onCreate XXX");
            super.onCreate(var1);
            if (m_Activity != null) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onCreate called while another activity is still active");
            }

            String var2 = "s3e_android";
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX Loading Library XXX: " + var2);
            System.loadLibrary(var2);
            m_Activity = this;
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX Loaded Library XXX: " + var2);
            this.m_ListenerManager = LoaderAPI.getListenerManager();
            this.setART(this.IsRunningART());
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onCreate: " + this.getRequestedOrientation());
            this.m_ProgressDialogHandler = new ProgressDialogHandler();
            this.m_TopLevel = new RelativeLayout(this);
            this.m_FrameLayout = new FrameLayout(this);
            this.m_TopLevel.addView(this.m_FrameLayout);
            this.createView(false);
            this.setContentView(this.m_TopLevel);
            this.m_orientationEventListener = new OrientationEventListener(this, 3) {
                  public void onOrientationChanged(int var1) {
                        LoaderActivity.this.onOrientationChangedNative();
                  }
            };
            this.m_orientationEventListener.enable();
            if (!this.m_orientationEventListener.canDetectOrientation()) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "failed to get orientation events");
            }

      }

      public void createView(boolean var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "createView: gl=" + var1);
            if (this.m_View != null) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Freeing the existing View");
                  this.m_FrameLayout.removeView(this.m_View);
                  this.m_View = null;
                  System.gc();
            }

            this.m_View = new LoaderView(this, var1);
            this.m_FrameLayout.addView(this.m_View, 0);
            if (this.m_LoaderThread != null) {
                  this.m_LoaderThread.setView(this.m_View);
            }

      }

      public void onWindowFocusChanged(boolean var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onWindowFocusChanged XXX " + var1);
            super.onWindowFocusChanged(var1);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onWindowFocusChanged done XXX");
      }

      public void onConfigurationChanged(Configuration var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onConfigurationChanged XXX");
            super.onConfigurationChanged(var1);
            if (var1.hardKeyboardHidden == 1) {
                  this.m_View.m_LoaderKeyboard.hardKeyboardConfigurationChanged(true);
            } else if (var1.hardKeyboardHidden == 2) {
                  this.m_View.m_LoaderKeyboard.hardKeyboardConfigurationChanged(false);
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onConfigurationChanged done XXX");
      }

      protected void onStart() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onStart XXX");
            super.onStart();
            this.startLoader();
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX done onStart XXX");
      }

      protected void onRestart() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onRestart XXX");
            super.onRestart();
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onRestart done XXX");
      }

      protected void onResume() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onResume XXX");
            super.onResume();
            if (this.isScreenLocked()) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onResume screen is locked, will not resume the app immediately XXX");
                  if (this.isScreenOn()) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onResume starting delayed resume XXX");
                        this.startDelayedResume();
                        return;
                  }
            } else {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onResume screen is not locked, will resume the app XXX");
                  this.m_orientationEventListener.enable();
                  if (this.m_LoaderThread != null) {
                        this.m_LoaderThread.onResume();
                  }
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onResume done XXX");
      }

      protected void onPause() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onPause XXX");
            if (this.isReadyForSuspend(true)) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onPause not multi-window XXX");
                  if (this.m_LoaderThread != null) {
                        this.m_LoaderThread.onStop();
                  }

                  this.m_orientationEventListener.disable();
            }

            super.onPause();
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onPause done XXX");
      }

      protected void onStop() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onStop XXX");
            if (this.isReadyForSuspend(false)) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onStop multi-window XXX");
                  if (this.m_LoaderThread != null) {
                        this.m_LoaderThread.onStop();
                  }

                  this.m_orientationEventListener.disable();
            }

            super.onStop();
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onStop done XXX");
      }

      protected void onDestroy() {
            if (m_Activity != this) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onDestroy XXX: skipped");
                  super.onDestroy();
            } else {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onDestroy XXX: finishing=" + this.isFinishing());
                  boolean var1 = false;
                  if (this.isFinishing() && this.m_LoaderThread != null) {
                        this.m_LoaderThread.soundStop();
                        this.m_LoaderThread.audioStopAll();
                        this.m_LoaderThread.onDestroy();
                        this.m_LoaderThread = null;
                        m_Activity = null;
                        var1 = this.m_View.m_TerminateApplication;
                  }

                  this.m_orientationEventListener.disable();
                  super.onDestroy();
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onDestroy done XXX");
                  if (var1) {
                        Process.killProcess(Process.myPid());
                  }

            }
      }

      public void onLowMemory() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX onLowMemory XXX");
            if (this.m_LoaderThread != null) {
                  this.m_LoaderThread.onLowMemory();
            }

      }

      private boolean isScreenLocked() {
            KeyguardManager var1 = (KeyguardManager)this.getSystemService(Context.KEYGUARD_SERVICE);
            boolean var2 = var1.inKeyguardRestrictedInputMode();
            return var2;
      }

      private boolean isScreenOn() {
            PowerManager var1 = (PowerManager)this.getSystemService(Context.POWER_SERVICE);
            boolean var2 = var1.isScreenOn();
            return var2;
      }

      private void startDelayedResume() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX startDelayedResume XXX");
            LoaderActivity.DelayedResumeTask var1 = new LoaderActivity.DelayedResumeTask();
            var1.execute(new Void[0]);
      }

      private void startLoader() {
            this.m_LoaderThread = LoaderThread.getInstance(this, this.getAssets(), this.getFilesDir(), this.m_View);
      }

      public boolean dispatchTouchEvent(MotionEvent var1) {
            return s3eTouchpad.onTouchEvent(var1) ? true : super.dispatchTouchEvent(var1);
      }

      private boolean onKeyEvent(int var1, int var2, KeyEvent var3) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onKeyEvent " + var1);
            boolean var4 = false;
            if (this.m_View != null) {
                  var4 = this.m_View.onKeyEvent(var1, var2, var3);
            }

            return var4;
      }

      public boolean onKeyDown(int var1, KeyEvent var2) {
            return this.onKeyEvent(var1, 1, var2) ? true : super.onKeyDown(var1, var2);
      }

      public boolean onKeyUp(int var1, KeyEvent var2) {
            return this.onKeyEvent(var1, 0, var2) ? true : super.onKeyUp(var1, var2);
      }

      public boolean dispatchKeyEvent(KeyEvent var1) {
            if (var1.getCharacters() != null && !var1.getCharacters().isEmpty() && var1.getKeyCode() == 0) {
                  switch(var1.getAction()) {
                  case 0:
                        this.onKeyEvent(0, 1, var1);
                        break;
                  case 1:
                        this.onKeyEvent(0, 0, var1);
                        break;
                  case 2:
                        this.onKeyEvent(0, 1, var1);
                  }
            }

            return super.dispatchKeyEvent(var1);
      }

      public boolean getIgnoreFocusLoss() {
            return this.m_IgnoreFocusLoss;
      }

      public void setIgnoreFocusLoss(boolean var1) {
            this.m_IgnoreFocusLoss = var1;
      }

      public Intent ExecuteIntent(final Intent var1) {
            this.m_Data = null;
            this.m_IntentBlocking = true;
            this.m_ExecuteIntentActivityNotFoundException = false;
            if (this.m_LoaderThread == null) {
                  return null;
            } else {
                  this.LoaderThread().runOnOSThread(new Runnable() {
                        public void run() {
                              try {
                                    LoaderActivity.this.startActivityForResult(var1, 123456);
                              } catch (ActivityNotFoundException var2) {
                                    LoaderActivity.this.m_ExecuteIntentActivityNotFoundException = true;
                                    LoaderAPI.trace("Could not start activity: " + var2.getMessage());
                              } catch (Exception var3) {
                                    LoaderAPI.trace("Could not start activity: " + var3.getMessage());
                              }

                        }
                  });

                  while(this.m_IntentBlocking) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "waiting for intent to finish");
                        LoaderAPI.s3eDeviceYield(20);
                  }

                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "intent done");
                  return this.m_Data;
            }
      }

      public boolean executeIntentActivityNotFoundException() {
            return this.m_ExecuteIntentActivityNotFoundException;
      }

      protected void onActivityResult(int var1, int var2, Intent var3) {
            super.onActivityResult(var1, var2, var3);
            if (var1 == 123456) {
                  if (var2 != -1) {
                        LoaderAPI.trace("Intent cancelled");
                        this.m_Data = null;
                  } else {
                        if (var3 == null) {
                              var3 = new Intent();
                        }

                        this.m_Data = var3;
                  }

                  this.m_IntentBlocking = false;
            }

            LoaderAPI.notifyActivityResultListeners(new ActivityResultEvent(var3, var1, var2));
      }

      public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
            super.onRequestPermissionsResult(var1, var2, var3);
            LoaderAPI.notifyRequestPermissionsResultListeners(new RequestPermissionsResultEvent(var1, var2, var3));
      }

      public void getCursor(final Uri var1, final String[] var2, final LoaderActivity.CursorCompleteListener var3) {
            this.LoaderThread().runOnOSThread(new Runnable() {
                  public void run() {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Creating cursor");
                        int var1x = VERSION.SDK_INT;
                        if (var1x >= 11) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Using async cursor");
                              CursorLoaderHelper.getCursor(var1, var2, var3);
                        } else {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Using legacy cursor");
                              Cursor var2x = LoaderActivity.this.managedQuery(var1, var2, (String)null, (String[])null, (String)null);
                              var3.cursorLoadComplete(var2x);
                        }

                  }
            });
      }

      public void ShowProgressDialog() {
            if (this.m_ProgressDialogHandler != null) {
                  Message var1 = new Message();
                  var1.what = 0;
                  this.m_ProgressDialogHandler.sendMessage(var1);
            }

      }

      public void HideProgressDialog() {
            if (this.m_ProgressDialogHandler != null) {
                  Message var1 = new Message();
                  var1.what = 1;
                  this.m_ProgressDialogHandler.sendMessage(var1);
            }

      }

      protected void onNewIntent(Intent var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onNewIntent");
            super.onNewIntent(var1);
            LoaderAPI.notifyNewIntentListeners(new NewIntentEvent(NewIntentEvent.EventType.NEWINTENT, var1));
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onNewIntent done");
      }

      private boolean IsRunningART() {
            String var1 = System.getProperty("java.vm.version");
            boolean var2 = var1 != null && var1.startsWith("1.");
            if (var2) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Running under Dalvik: " + var1);
            } else {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Running under ART: " + var1);
            }

            return !var2;
      }

      public boolean isReadyForSuspend(boolean var1) {
            boolean var2 = false;
            if (VERSION.SDK_INT >= 24) {
                  var2 = this.isInMultiWindowMode();
            }

            boolean var3 = false;
            if (var1) {
                  var3 = !var2;
                  this.m_LegacySuspendMode = var3;
            } else {
                  var3 = !this.m_LegacySuspendMode;
                  this.m_LegacySuspendMode = false;
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Ready for suspend (" + var1 + ", " + var2 + ") " + var3 + " " + this.m_LegacySuspendMode);
            return var3;
      }

      interface CursorCompleteListener {
            void cursorLoadComplete(Cursor var1);
      }

      private class DelayedResumeTask extends AsyncTask {
            private DelayedResumeTask() {
            }

            @Override
            protected Object doInBackground(Object[] objects) {
                  return null;
            }

            protected void onPostExecute(Void var1) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX DelayedResumeTask onPostExecute XXX");
                  if (LoaderActivity.this.isScreenOn()) {
                        if (!LoaderActivity.this.isScreenLocked()) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX Screen is on, device is unlocked, will resume the app XXX");
                              LoaderActivity.this.onResume();
                        } else {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX Screen is on, device is still locked, starting delayed resume again XXX");
                              LoaderActivity.this.startDelayedResume();
                        }
                  }

            }

            protected Void doInBackground(Void... var1) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "XXX DelayedResumeTask doInBackground XXX");

                  try {
                        synchronized(this) {
                              this.wait(300L);
                        }
                  } catch (InterruptedException var5) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "Delayed resume task was interrupted");
                  }

                  return null;
            }

            // $FF: synthetic method
            DelayedResumeTask(Object var2) {
                  this();
            }
      }
}
