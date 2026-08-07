package com.ideaworks3d.marmalade;

import android.annotation.SuppressLint;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Vibrator;
import android.provider.Settings.Secure;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import org.junit.Assert;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

import javax.microedition.khronos.opengles.GL;

public class LoaderView extends SurfaceView implements Callback, OnClickListener, OnDismissListener {
      private static LoaderGL m_LoaderGL = new LoaderGL();
      private static int[] g_PixelsLast;
      public GL m_GL;
      public LoaderKeyboard m_LoaderKeyboard;
      public LoaderActivity m_LoaderActivity;
      private SurfaceHolder m_SurfaceHolder;
      private Bitmap m_FullScreenBitmap;
      private Paint m_Paint = new Paint();
      Handler m_Handler = new Handler();
      private Vibrator m_Vibrator;
      private int[] m_Pixels;
      public int m_Width;
      public int m_Height;
      public boolean m_NewlyCreated;
      private Dialog m_ErrorDialog = null;
      public boolean m_ErrorRunning = false;
      private String m_ErrorTitle;
      private String m_ErrorBody;
      private int m_ErrorType;
      private int m_ErrorRtn;
      private Dialog m_InputDialog = null;
      private static boolean g_GLActive = false;
      private String m_InputTextTitle;
      private String m_InputTextDefault;
      private int m_InputTextFlags;
      private String m_InputTextResult = null;
      public boolean m_InputTextRunning = false;
      private EditText m_EditText;
      private S3EVideoView m_VideoView = null;
      private int m_VideoState = 0;
      public boolean m_TerminateApplication = false;
      private final Runnable m_ShowError = new Runnable() {
            public void run() {
                  LoaderView.this.showErrorReal();
            }
      };
      private final Runnable m_ShowInputText = new Runnable() {
            public void run() {
                  LoaderView.this.showInputTextReal();
            }
      };
      private final Runnable m_BacklightOn = new Runnable() {
            public void run() {
                  PowerManager var1 = (PowerManager)LoaderView.this.m_LoaderActivity.getSystemService(Context.POWER_SERVICE);
                  WakeLock var2 = var1.newWakeLock(26, this.getClass().getName());
                  var2.acquire(3000L);
            }
      };
      private final Runnable m_RunOnOSThread = new Runnable() {
            public void run() {
                  synchronized(LoaderView.this.m_RunOnOSThread) {
                        LoaderView.this.runOnOSThreadNative();
                        LoaderView.this.m_RunOnOSThread.notify();
                  }
            }
      };

      private native void setPixelsNative(int var1, int var2, int[] var3, boolean var4);

      private native void runOnOSThreadNative();

      private native void setInputText(String var1);

      private native void videoStoppedNotify();

      @SuppressLint("ResourceType")
      public LoaderView(LoaderActivity var1, boolean var2) {
            super(var1);
            g_GLActive = g_GLActive || var2;
            this.m_LoaderActivity = var1;
            this.m_Vibrator = (Vibrator)this.m_LoaderActivity.getSystemService(Context.VIBRATOR_SERVICE);
            this.m_SurfaceHolder = this.getHolder();
            this.m_SurfaceHolder.addCallback(this);
            this.m_LoaderKeyboard = new LoaderKeyboard(this);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "new View " + this + " gl=" + g_GLActive + "(" + var2 + ") holder=" + this.m_SurfaceHolder);
            if (g_GLActive) {
                  int[] var3 = new int[1];
                  if (LoaderAPI.s3eConfigGetInt("GL", "AndroidSurfaceHolder", var3) == 0) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "SurfaceHolder.setFormat: " + var3[0]);
                        this.m_SurfaceHolder.setFormat(var3[0]);
                  }
            }

            this.setFocusable(true);
            this.setFocusableInTouchMode(true);
            this.requestFocus();
            this.setId(1983274);
      }

      public int getCurrentOrientation() {
            Display var1 = ((WindowManager)this.m_LoaderActivity.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
            boolean var2 = var1.getWidth() >= var1.getHeight();
            switch(var1.getRotation()) {
            case 0:
                  return var2 ? 0 : 1;
            case 1:
                  return var2 ? 0 : 9;
            case 2:
                  return var2 ? 8 : 9;
            case 3:
                  return var2 ? 8 : 1;
            default:
                  return -1;
            }
      }

      private String getCurrentKeyboardId() {
            InputMethodManager var1 = (InputMethodManager)this.m_LoaderActivity.getSystemService(Context.INPUT_METHOD_SERVICE);
            List var2 = var1.getEnabledInputMethodList();
            int var3 = var2.size();
            String var4 = "";

            for(int var5 = 0; var5 < var3; ++var5) {
                  InputMethodInfo var6 = (InputMethodInfo)var2.get(var5);
                  if (var6.getId().equals(Secure.getString(this.m_LoaderActivity.getContentResolver(), "default_input_method"))) {
                        var4 = var6.getId();
                  }
            }

            return var4;
      }

      public InputConnection onCreateInputConnection(EditorInfo var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onCreateInputConnection");
            if (var1 != null) {
                  if (this.getCurrentKeyboardId().contains("SamsungKeypad")) {
                        var1.inputType = 0;
                  } else {
                        var1.imeOptions |= 268435456;
                        var1.inputType = this.m_LoaderKeyboard.getKeyboardInputType();
                  }
            }

            return new BaseInputConnection(this, false);
      }

      private void backlightOn() {
            this.m_Handler.post(this.m_BacklightOn);
      }

      private void terminateApplication() {
            this.m_TerminateApplication = true;
      }

      public boolean onKeyPreIme(int var1, KeyEvent var2) {
            return this.m_LoaderKeyboard.onKeyPreIme(var1, var2);
      }

      protected void onDetachedFromWindow() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onDetachedFromWindow");
            super.onDetachedFromWindow();
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onDetachedFromWindow done");
      }

      public void onDismiss(DialogInterface var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onDismiss intput=" + this.m_InputTextRunning + " error=" + this.m_ErrorRunning);
            if (var1 == this.m_InputDialog) {
                  this.setInputText(this.m_InputTextResult);
                  this.m_InputTextRunning = false;
                  this.m_InputDialog = null;
            } else if (var1 == this.m_ErrorDialog) {
                  this.m_ErrorDialog = null;
                  this.m_ErrorRunning = false;
            } else {
                  Assert.assertTrue("onDismiss called with unknown dialog: " + var1, false);
            }

      }

      public void onClick(DialogInterface var1, int var2) {
            if (var1 == this.m_InputDialog) {
                  if (var2 == -1) {
                        this.m_InputTextResult = this.m_EditText.getText().toString();
                  }

                  var1.dismiss();
            } else if (var1 == this.m_ErrorDialog) {
                  switch(var2) {
                  case -3:
                        this.m_ErrorRtn = 2;
                        break;
                  case -2:
                        this.m_ErrorRtn = 1;
                        break;
                  case -1:
                        this.m_ErrorRtn = 0;
                  }

                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "onClick: " + var2 + "->" + this.m_ErrorRtn);
                  var1.dismiss();
            } else {
                  Assert.assertTrue("onClick called with unknown dialog: " + var1, false);
            }

      }

      public boolean onKeyEvent(int var1, int var2, KeyEvent var3) {
            if (this.m_InputTextRunning && var1 == 4) {
                  this.m_InputTextRunning = false;
                  return true;
            } else {
                  return this.dispatchKeyEvent(var3) ? true : this.m_LoaderKeyboard.onKeyEvent(var1, var2, var3);
            }
      }

      public void runOnOSThread() {
            synchronized(this.m_RunOnOSThread) {
                  this.m_Handler.post(this.m_RunOnOSThread);

                  try {
                        this.m_RunOnOSThread.wait();
                  } catch (InterruptedException var4) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "got InterruptedException during runOnOSThread");
                  }

            }
      }

      public void enableRespondingToRotation() {
            this.m_LoaderActivity.LoaderThread().onSplashFinished();
      }

      public int videoPlay(String var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, long var9, long var11) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "videoPlay");
            this.m_VideoState = 1;
            LoaderView.VideoRunner var13 = new LoaderView.VideoRunner();
            var13.play(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11);
            return var13.runOnUiThread(true);
      }

      public int videoPause() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "videoPause");
            if (this.m_VideoState == 1) {
                  this.m_VideoState = 2;
                  LoaderView.VideoRunner var1 = new LoaderView.VideoRunner();
                  var1.setState(2);
                  return var1.runOnUiThread(false);
            } else {
                  return -1;
            }
      }

      public int videoResume() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "videoResume");
            if (this.m_VideoState == 2) {
                  this.m_VideoState = 1;
                  LoaderView.VideoRunner var1 = new LoaderView.VideoRunner();
                  var1.setState(1);
                  return var1.runOnUiThread(false);
            } else {
                  return -1;
            }
      }

      private boolean videoIsPlaying() {
            return this.videoGetStatus() == 1;
      }

      public void videoStop() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "videoStop");
            boolean var1 = false;
            if (this.m_VideoState != 0) {
                  LoaderView.VideoRunner var2 = new LoaderView.VideoRunner();
                  var2.setState(0);
                  var2.runOnUiThread(true);
                  var1 = this.videoIsPlaying();
                  this.m_VideoState = 0;
            }

            if (var1 && !this.videoIsPlaying()) {
                  this.videoStopped();
            }

      }

      public void videoSetVolume(int var1) {
            LoaderView.VideoRunner var2 = new LoaderView.VideoRunner();
            var2.setVolume(var1);
            var2.runOnUiThread(false);
      }

      public int videoGetStatus() {
            return this.m_VideoState;
      }

      public int videoGetPosition() {
            return this.m_VideoView != null ? this.m_VideoView.videoGetPosition() : 0;
      }

      public void videoStopped() {
            if (this.m_VideoView != null) {
                  this.m_VideoView.videoRemoveView();
                  this.m_VideoView = null;
            }

            this.m_VideoState = 0;
            this.videoStoppedNotify();
      }

      private void showErrorReal() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "showErrorReal");
            Builder var1 = new Builder(this.m_LoaderActivity);
            this.m_ErrorRtn = 0;
            var1.setTitle(this.m_ErrorTitle);
            var1.setMessage(this.m_ErrorBody);
            var1.setPositiveButton("Continue", this);
            if (this.m_ErrorType > 0) {
                  var1.setNegativeButton("Stop", this);
            }

            if (this.m_ErrorType > 1) {
                  var1.setNeutralButton("Ignore", this);
            }

            this.m_ErrorDialog = var1.create();
            this.m_ErrorDialog.setOnDismissListener(this);
            this.m_ErrorDialog.show();
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "showErrorReal done");
      }

      public int showError(String var1, String var2, int var3) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "showError: " + var1);
            if (this.m_LoaderActivity.isFinishing()) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "showError: " + var2);
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "activity is finishing... skipping showError");
                  return 0;
            } else {
                  synchronized(this.m_ShowError) {
                        this.m_ErrorTitle = var1;
                        this.m_ErrorBody = var2;
                        this.m_ErrorType = var3;
                        this.m_ErrorRtn = 0;
                        this.m_ErrorRunning = true;
                        this.m_Handler.post(this.m_ShowError);
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "showError: waiting");

                        while(this.m_ErrorRunning) {
                              LoaderAPI.s3eDeviceYield(20);
                        }

                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "showError: done");
                        return this.m_ErrorRtn;
                  }
            }
      }

      public void doneInputText(DialogInterface var1, int var2) {
      }

      public void showInputTextReal() {
            this.m_EditText = new EditText(this.m_LoaderActivity);
            this.m_EditText.setText(this.m_InputTextDefault);
            if ((this.m_InputTextFlags & 1) != 0) {
                  this.m_EditText.setInputType(128);
                  this.m_EditText.setTransformationMethod(new PasswordTransformationMethod());
            } else if ((this.m_InputTextFlags & 2) != 0) {
                  this.m_EditText.setInputType(33);
            } else if ((this.m_InputTextFlags & 4) != 0) {
                  this.m_EditText.setInputType(17);
            } else if ((this.m_InputTextFlags & 8) != 0) {
                  this.m_EditText.setInputType(8194);
            }

            Builder var1 = new Builder(this.m_LoaderActivity);
            var1.setTitle(this.m_InputTextTitle);
            var1.setView(this.m_EditText);
            var1.setPositiveButton("OK", this);
            var1.setNegativeButton("Cancel", this);
            this.m_InputDialog = var1.create();
            this.m_InputTextRunning = true;
            this.m_InputTextResult = null;
            this.m_InputDialog.setOnDismissListener(this);
            this.m_InputDialog.show();
      }

      public void getInputString(String var1, String var2, int var3) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "showing m_ShowInputText dialog: " + var3);
            this.m_InputTextTitle = var1;
            this.m_InputTextDefault = var2;
            this.m_InputTextFlags = var3;
            this.m_Handler.post(this.m_ShowInputText);
      }

      public void vibrateStart(long var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "vibrateStart " + var1);
            this.m_Vibrator.vibrate(var1);
      }

      public void vibrateStop() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "vibrateStop");
            this.m_Vibrator.cancel();
      }

      public boolean vibrateAvailable() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "vibrateAvailable");

            try {
                  Class var1 = this.m_Vibrator.getClass();
                  Method var2 = var1.getMethod("hasVibrator");
                  return (Boolean)var2.invoke(this.m_Vibrator);
            } catch (Exception var3) {
                  return true;
            }
      }

      public String getLocale() {
            return Locale.getDefault().toString();
      }

      public boolean glInit(int var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glInit");
            if (g_GLActive && !m_LoaderGL.started()) {
                  this.m_GL = m_LoaderGL.startGL(this.m_SurfaceHolder, var1);
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glInit Done");
            return g_GLActive;
      }

      public void glReInit() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glReInit");
            if (g_GLActive && m_LoaderGL.started()) {
                  this.m_GL = m_LoaderGL.restartGL(this.m_SurfaceHolder);
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glReInit Done");
      }

      public void glPause() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glPause");
            if (g_GLActive && m_LoaderGL.started()) {
                  int[] var1 = new int[1];
                  if (LoaderAPI.s3eConfigGetInt("GL", "AndroidTerminateGLOnPause", var1) == 0 && var1[0] != 0) {
                        m_LoaderGL.stopGL();
                  } else {
                        m_LoaderGL.pauseGL();
                  }

                  this.m_GL = null;
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glPause Done");
      }

      public void glResume() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glResume");
            if (g_GLActive && !m_LoaderGL.started()) {
                  int[] var1 = new int[1];
                  if (LoaderAPI.s3eConfigGetInt("GL", "AndroidTerminateGLOnPause", var1) == 0 && var1[0] != 0) {
                        this.m_GL = m_LoaderGL.restartGL(this.m_SurfaceHolder);
                  } else {
                        this.m_GL = m_LoaderGL.resumeGL(this.m_SurfaceHolder);
                  }
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glResume Done");
      }

      public void glTerm() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glTerm");
            if (g_GLActive) {
                  if (m_LoaderGL.started()) {
                        m_LoaderGL.stopGL();
                        this.m_GL = null;
                  }

                  g_GLActive = false;
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glTerm done");
      }

      public void glSwapBuffers() {
            if (!m_LoaderGL.started()) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "glSwapBuffers called before glInit");
            } else {
                  m_LoaderGL.swap();
            }
      }

      public boolean onTouchEvent(MotionEvent var1) {
            return this.m_LoaderActivity.LoaderThread() != null ? this.m_LoaderActivity.LoaderThread().onTouchEvent(var1) : false;
      }

      public boolean dispatchKeyEvent(KeyEvent var1) {
            if (LoaderAPI.s3eConfigGet("AndroidIgnoreBackKeyFromPointerDevice", 0) != 0 && var1.getKeyCode() == 4) {
                  int var2 = var1.getDevice().getId() & 255;
                  if ((var2 & 2) == 2) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "ignored KEYCODE_BACK from pointer device/mouse");
                        return true;
                  } else {
                        return super.dispatchKeyEvent(var1);
                  }
            } else {
                  return super.dispatchKeyEvent(var1);
            }
      }

      protected void onDraw(Canvas var1) {
            super.onDraw(var1);
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "draw");
      }

      public void surfaceCreated(SurfaceHolder var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "surfaceCreated: " + this);
            this.m_NewlyCreated = true;
      }

      public synchronized void surfaceDestroyed(SurfaceHolder var1) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "surfaceDestroyed: " + this.m_Pixels);
            LoaderThread var2 = this.m_LoaderActivity.LoaderThread();
            if (var2 != null) {
                  var2.suspendForSurfaceChange();
                  this.m_Width = 0;
                  this.m_Height = 0;
                  if (VERSION.SDK_INT >= 24) {
                        this.glPause();
                  } else if (m_LoaderGL.started()) {
                        m_LoaderGL.stopGL();
                        this.m_GL = null;
                  }

                  this.m_FullScreenBitmap = null;
                  this.setPixelsNative(0, 0, (int[])null, false);
                  this.m_Pixels = null;
                  var2.resumeAfterSurfaceChange();
                  this.notify();
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "done surfaceDestroyed");
            }
      }

      public synchronized void surfaceChanged(SurfaceHolder var1, int var2, int var3, int var4) {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "surfaceChanged: " + var3 + "x" + var4);
            LoaderThread var5 = this.m_LoaderActivity.LoaderThread();
            if (this.m_Pixels != null && var5.skipSurfaceChange()) {
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "surfaceChanged skipped");
                  this.notify();
            } else {
                  var5.suspendForSurfaceChange();
                  this.m_Width = var3;
                  this.m_Height = var4;
                  if (this.m_FullScreenBitmap != null) {
                        this.m_FullScreenBitmap.recycle();
                        this.m_FullScreenBitmap = null;
                  }

                  this.m_FullScreenBitmap = Bitmap.createBitmap(this.m_Width, this.m_Height, Config.RGB_565);
                  if (this.m_Pixels == null || this.m_Pixels.length != this.m_Width * this.m_Height) {
                        if (g_PixelsLast != null && g_PixelsLast.length >= this.m_Width * this.m_Height) {
                              this.m_Pixels = g_PixelsLast;
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "using cached pixel buffer: " + this.m_Pixels);
                        } else {
                              this.m_Pixels = new int[this.m_Width * this.m_Height];
                              g_PixelsLast = this.m_Pixels;
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "created new pixel buffer: " + this.m_Pixels);
                        }
                  }

                  this.setPixelsNative(this.m_Width, this.m_Height, this.m_Pixels, this.m_NewlyCreated);
                  this.m_NewlyCreated = false;
                  var5.resumeAfterSurfaceChange();
                  this.notify();
                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "surfaceChanged done: " + this.m_Width + "x" + this.m_Height);
            }
      }

      public boolean waitForSurface() {
            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "waitForSurface: " + this);
            synchronized(this) {
                  if (this.m_Pixels == null) {
                        try {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "waitForSurface: waiting ...");
                              this.wait();
                        } catch (InterruptedException var4) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "waitForSurface: InterruptedException");
                              return false;
                        }
                  }

                  if (this.m_Pixels == null) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "waitForSurface: signalled early");
                        return false;
                  }
            }

            LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "waitForSurface: done");
            return true;
      }

      public void doDraw() {
            Canvas var1 = null;

            try {
                  if (this.m_FullScreenBitmap != null) {
                        if (g_GLActive) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "doDraw: ignoring due to GL mode");
                              return;
                        }

                        this.m_FullScreenBitmap.setPixels(this.m_Pixels, 0, this.m_Width, 0, 0, this.m_Width, this.m_Height);
                        var1 = this.m_SurfaceHolder.lockCanvas();
                        if (var1 == null) {
                              LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "doDraw: fail to lock canvas");
                              return;
                        }

                        var1.drawBitmap(this.m_FullScreenBitmap, 0.0F, 0.0F, this.m_Paint);
                        return;
                  }

                  LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "doDraw: no m_FullScreenBitmap");
            } finally {
                  if (var1 != null) {
                        this.m_SurfaceHolder.unlockCanvasAndPost(var1);
                  }

            }

      }

      private class VideoRunner implements Runnable {
            public static final int PLAY = 1;
            public static final int PAUSE = 2;
            public static final int RESUME = 3;
            public static final int STOP = 4;
            public static final int VOLUME = 5;
            private int m_Action;
            private String m_File;
            private int m_Volume;
            private int m_Repeats;
            private int m_X;
            private int m_Y;
            private int m_Width;
            private int m_Height;
            private boolean m_Fullscreen;
            private long m_Offset;
            private long m_Size;
            private int m_Return;

            private VideoRunner() {
            }

            void play(String var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, long var9, long var11) {
                  this.m_Action = 1;
                  this.m_File = var1;
                  this.m_Volume = var2;
                  this.m_Repeats = var3;
                  this.m_X = var4;
                  this.m_Y = var5;
                  this.m_Width = var6;
                  this.m_Height = var7;
                  this.m_Fullscreen = var8;
                  this.m_Offset = var9;
                  this.m_Size = var11;
            }

            void setState(int var1) {
                  switch(var1) {
                  case 0:
                        this.m_Action = 4;
                        break;
                  case 1:
                        this.m_Action = 3;
                        break;
                  case 2:
                        this.m_Action = 2;
                  }

            }

            void setVolume(int var1) {
                  this.m_Action = 5;
                  this.m_Volume = var1;
            }

            public synchronized int runOnUiThread(boolean var1) {
                  try {
                        if (Thread.currentThread() == LoaderView.this.m_LoaderActivity.getMainLooper().getThread()) {
                              this.run();
                        } else {
                              LoaderView.this.m_Handler.post(this);
                              if (var1) {
                                    this.wait();
                              }
                        }
                  } catch (InterruptedException var3) {
                        LoaderAPI.traceChan(this.getClass().getName().substring(this.getClass().getName().lastIndexOf(46) + 1) + "-" + Thread.currentThread().getName(), "got InterruptedException during showVideo");
                        return -1;
                  }

                  return var1 ? this.m_Return : 0;
            }

            public synchronized void run() {
                  if (this.m_Action == 1) {
                        if (LoaderView.this.m_VideoView != null) {
                              LoaderView.this.m_VideoView.videoStop();
                              LoaderView.this.m_VideoView.videoRemoveView();
                              LoaderView.this.m_VideoView = null;
                        }

                        LoaderView.this.m_VideoView = new S3EVideoView(LoaderView.this.m_LoaderActivity);
                        LoaderView.this.m_VideoView.videoAddView(this.m_Fullscreen, this.m_X, this.m_Y, this.m_Width, this.m_Height);
                        LoaderView.this.m_VideoView.videoSetVolume(this.m_Volume);
                        this.m_Return = LoaderView.this.m_VideoView.videoPlay(this.m_File, this.m_Repeats, this.m_Offset, this.m_Size);
                  } else if (LoaderView.this.m_VideoView != null) {
                        switch(this.m_Action) {
                        case 2:
                              LoaderView.this.m_VideoView.videoPause();
                              break;
                        case 3:
                              LoaderView.this.m_VideoView.videoResume();
                              break;
                        case 4:
                              LoaderView.this.m_VideoView.videoStop();
                              LoaderView.this.m_VideoView.videoRemoveView();
                              LoaderView.this.m_VideoView = null;
                              break;
                        case 5:
                              LoaderView.this.m_VideoView.videoSetVolume(this.m_Volume);
                        }

                        this.m_Return = 0;
                  }

                  this.notify();
            }

            // $FF: synthetic method
            VideoRunner(Object var2) {
                  this();
            }
      }
}
